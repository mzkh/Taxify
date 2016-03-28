package com.example.test;

import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.test.AsyncRequest.OnAsyncRequestComplete;
import com.example.test.GetAddress.OnAsyncRequestComplete1;
import org.json.JSONObject;

public class MyJourneyDriver extends ActionBarActivity implements OnAsyncRequestComplete, OnClickListener, OnAsyncRequestComplete1 {
    int f17b;
    Button b1;
    Button b2;
    int id;
    int id_journey;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0132R.layout.myjourney);
        this.tv1 = (TextView) findViewById(C0132R.id.tv1);
        this.tv2 = (TextView) findViewById(C0132R.id.tv2);
        this.tv3 = (TextView) findViewById(C0132R.id.tv3);
        this.tv4 = (TextView) findViewById(C0132R.id.tv4);
        this.tv5 = (TextView) findViewById(C0132R.id.tv5);
        this.b1 = (Button) findViewById(C0132R.id.b1);
        this.b2 = (Button) findViewById(C0132R.id.b2);
        this.b1.setOnClickListener(this);
        this.b2.setOnClickListener(this);
        this.id = getSharedPreferences("MyPreferencesFileName", 0).getInt("id", 1);
        abc();
    }

    public void abc() {
        this.tv1.setText("");
        this.tv2.setText("");
        this.tv3.setText("");
        this.tv4.setText("");
        this.tv5.setText("");
        new AsyncRequest(this, "journey").execute(new String[]{"myJourneyDriver.php?id=" + this.id});
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case C0132R.id.b1:
                new AsyncRequest(this, "okay").execute(new String[]{"driverOkay.php?id=" + this.id});
            case C0132R.id.b2:
                if (this.f17b != 1) {
                    Toast.makeText(getApplicationContext(), "Journey Not Complete", 1).show();
                    return;
                }
                new AsyncRequest(this, "block").execute(new String[]{"driverBlock.php?id=" + this.id});
            default:
        }
    }

    public void asyncResponse1(String response, String label) {
        switch (label.hashCode()) {
            case 114148:
                if (label.equals("src")) {
                    this.tv1.setText("src-" + response);
                }
            case 3079842:
                if (label.equals("dest")) {
                    this.tv2.setText("dest-" + response);
                }
            default:
        }
    }

    public void asyncResponse(String result, String label) {
        if (label.equals("journey")) {
            if (result.contains("failure")) {
                Toast.makeText(getApplicationContext(), "NO Journey Registered", 1).show();
                startActivity(new Intent(this, JourneyList.class));
                return;
            }
            try {
                JSONObject j1 = new JSONObject(result);
                this.id_journey = Integer.parseInt(j1.getString("id"));
                Editor p = getSharedPreferences("MyPreferencesFileName", 0).edit();
                p.putInt("id_journey", this.id_journey);
                p.commit();
                this.tv3.append("\nDate-" + j1.getString("date"));
                this.tv3.append("\ntime-" + j1.getString("time"));
                this.tv3.append("\nDistance-" + (new Service().getDistance(Double.valueOf(Double.parseDouble(j1.getString("slat"))), Double.valueOf(Double.parseDouble(j1.getString("slng"))), Double.valueOf(Double.parseDouble(j1.getString("dlat"))), Double.valueOf(Double.parseDouble(j1.getString("dlng")))).doubleValue() / 1000.0d) + "Km");
                new GetAddress(this, "src").execute(new String[]{j1.getString("slat") + "," + j1.getString("slng")});
                new GetAddress(this, "dest").execute(new String[]{j1.getString("dlat") + "," + j1.getString("dlng")});
                new AsyncRequest(this, "customerinfo").execute(new String[]{"customerInfo.php?id=" + j1.getString("id_customer")});
                this.f17b = 0;
                if (j1.getString("complete_customer").contains("1")) {
                    this.f17b = 1;
                    this.tv5.setText("\nCustomer Says Journey is Over Accept/Block");
                    return;
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (label.equals("customerinfo")) {
            try {
                JSONObject j2 = new JSONObject(result);
                this.tv4.append("\nCustomer phone-" + j2.getString("phone"));
                this.tv4.append("\nCustomer name-" + j2.getString("name"));
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (label.equals("decline")) {
            if (result.contains("success")) {
                Toast.makeText(getApplicationContext(), "Journey Declined", 1).show();
                startActivity(new Intent(this, JourneyList.class));
                return;
            }
            if (result.contains("failure")) {
                Toast.makeText(getApplicationContext(), "some error occured", 1).show();
                return;
            }
            return;
        }
        if (label.equals("okay")) {
            if (result.contains("success")) {
                Toast.makeText(getApplicationContext(), "Journey Over", 1).show();
                startActivity(new Intent(this, JourneyList.class));
                return;
            }
            if (result.contains("failure")) {
                Toast.makeText(getApplicationContext(), "some error occured", 1).show();
                return;
            }
            return;
        }
        if (label.equals("block")) {
            if (result.contains("success")) {
                Toast.makeText(getApplicationContext(), "Journey Blocked", 1).show();
                startActivity(new Intent(this, JourneyList.class));
                return;
            }
            if (result.contains("failure")) {
                Toast.makeText(getApplicationContext(), "some error occured", 1).show();
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0132R.menu.myjourneydriver, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case C0132R.id.i1:
                startActivity(new Intent(this, OnMap.class));
                break;
            case C0132R.id.i2:
                abc();
                break;
            case C0132R.id.i3:
                new AsyncRequest(this, "decline").execute(new String[]{"declineJourney.php?id=" + this.id});
                break;
            case C0132R.id.i4:
                startActivity(new Intent(this, Login.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
