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
import com.google.android.gms.analytics.ecommerce.ProductAction;
import org.json.JSONException;
import org.json.JSONObject;

public class MyJourneyCustomer extends ActionBarActivity implements OnAsyncRequestComplete, OnClickListener, OnAsyncRequestComplete1 {
    int f16b;
    Button b1;
    Button b2;
    int id;
    int id_journey;
    JSONObject j1;
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
        new AsyncRequest(this, "journey").execute(new String[]{"myJourneyCustomer.php?id=" + this.id});
    }

    public void asyncResponse(String result, String label) {
        if (label.equals("journey")) {
            if (result.contains("failure")) {
                Toast.makeText(getApplicationContext(), "NO Journey Registered", 1).show();
                startActivity(new Intent(this, InsertJourney1.class));
                return;
            }
            try {
                this.j1 = new JSONObject(result);
                this.id_journey = Integer.parseInt(this.j1.getString("id"));
                Editor p = getSharedPreferences("MyPreferencesFileName", 0).edit();
                p.putInt("id_journey", this.id_journey);
                p.commit();
                this.tv3.setText("\nDate-" + this.j1.getString("date"));
                this.tv3.append("\ntime-" + this.j1.getString("time"));
                this.tv3.append("\nDistance-" + (new Service().getDistance(Double.valueOf(Double.parseDouble(this.j1.getString("slat"))), Double.valueOf(Double.parseDouble(this.j1.getString("slng"))), Double.valueOf(Double.parseDouble(this.j1.getString("dlat"))), Double.valueOf(Double.parseDouble(this.j1.getString("dlng")))).doubleValue() / 1000.0d) + "Km");
                new GetAddress(this, "src").execute(new String[]{new StringBuilder(String.valueOf(this.j1.getString("slat"))).append(",").append(this.j1.getString("slng")).toString()});
                new GetAddress(this, "dest").execute(new String[]{new StringBuilder(String.valueOf(this.j1.getString("dlat"))).append(",").append(this.j1.getString("dlng")).toString()});
                if (this.j1.getString("id_driver").contains("null")) {
                    this.tv5.setText("\n NO DRIVER ALLOTED");
                    this.f16b = 0;
                    return;
                }
                this.f16b = 1;
                new AsyncRequest(this, "driverinfo").execute(new String[]{"driverInfo.php?id=" + this.j1.getString("id_driver")});
                if (this.j1.getString("complete_driver").contains("1")) {
                    this.tv5.setText("\nDriver Says Journey is Over Accept/Block");
                    return;
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (label.equals("driverinfo")) {
            try {
                JSONObject j2 = new JSONObject(result);
                this.tv4.setText("");
                this.tv4.append("\nDriver phone-" + j2.getString("phone"));
                this.tv4.append("\nDriver name-" + j2.getString("name"));
                this.tv4.append("\nDriver taxi no-" + j2.getString("taxino"));
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (label.equals(ProductAction.ACTION_REMOVE)) {
            if (result.contains("failure")) {
                Toast.makeText(getApplicationContext(), "some error occured", 1).show();
                return;
            }
            if (result.contains("success")) {
                Toast.makeText(getApplicationContext(), "succesfully removed", 1).show();
                startActivity(new Intent(this, InsertJourney1.class));
                return;
            }
            return;
        }
        if (label.equals("over")) {
            if (result.contains("success")) {
                Toast.makeText(getApplicationContext(), "Journey Over ", 1).show();
                startActivity(new Intent(this, InsertJourney1.class));
                return;
            }
            Toast.makeText(getApplicationContext(), "some error occured", 1).show();
            return;
        }
        if (label.equals("block")) {
            if (result.contains("success")) {
                Toast.makeText(getApplicationContext(), "Successfully Blocked ", 1).show();
                abc();
                return;
            }
            if (result.contains("failure")) {
                Toast.makeText(getApplicationContext(), "some error occured", 1).show();
            }
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case C0132R.id.b1:
                new AsyncRequest(this, "over").execute(new String[]{"customerJourneyOkay.php?id=" + this.id});
                startActivity(new Intent(this, InsertJourney1.class));
            case C0132R.id.b2:
                if (this.f16b != 1) {
                    Toast.makeText(getApplicationContext(), "No Driver Alloted", 1).show();
                    return;
                }
                new AsyncRequest(this, "block").execute(new String[]{"customerBlock.php?id=" + this.id});
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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0132R.menu.myjourneycustomer, menu);
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
                Editor p = getSharedPreferences("MyPreferencesFileName", 0).edit();
                try {
                    p.putString("slat", this.j1.getString("slat"));
                    p.putString("slng", this.j1.getString("slng"));
                    p.putString("dlat", this.j1.getString("dlat"));
                    p.putString("dlng", this.j1.getString("dlng"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                p.commit();
                startActivity(new Intent(this, EditJourney1.class));
                break;
            case C0132R.id.i4:
                new AsyncRequest(this, ProductAction.ACTION_REMOVE).execute(new String[]{"removejourney.php?id=" + this.id});
                break;
            case C0132R.id.i5:
                startActivity(new Intent(this, Login.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
