package com.example.test;

import android.content.Intent;
import android.content.SharedPreferences;
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

public class BookJourney extends ActionBarActivity implements OnClickListener, OnAsyncRequestComplete, OnAsyncRequestComplete1 {
    Button b1;
    int id;
    int id_journey;
    TextView tv1;
    TextView tv2;
    TextView tv3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0132R.layout.bookjourney);
        this.b1 = (Button) findViewById(C0132R.id.b1);
        this.b1.setOnClickListener(this);
        this.tv1 = (TextView) findViewById(C0132R.id.tv1);
        this.tv2 = (TextView) findViewById(C0132R.id.tv2);
        this.tv3 = (TextView) findViewById(C0132R.id.tv3);
        SharedPreferences settings = getSharedPreferences("MyPreferencesFileName", 0);
        this.id_journey = settings.getInt("id_journey", 3);
        this.id = settings.getInt("id", 1);
        new AsyncRequest(this, "journey").execute(new String[]{"journeyOnId.php?id=" + this.id_journey});
    }

    public void asyncResponse1(String response, String label) {
        if (label.equals("src")) {
            this.tv1.append(response);
        } else if (label.equals("dest")) {
            this.tv2.append(response);
        }
    }

    public void asyncResponse(String response, String label) {
        if (label.equals("journey")) {
            if (response.contains("failure")) {
                startActivity(new Intent(this, JourneyList.class));
                Toast.makeText(getApplicationContext(), "Some Problem Occured", 1).show();
                return;
            }
            try {
                JSONObject j = new JSONObject(response);
                new GetAddress(this, "src").execute(new String[]{j.getString("slat") + "," + j.getString("slng")});
                new GetAddress(this, "dest").execute(new String[]{j.getString("dlat") + "," + j.getString("dlng")});
                this.tv3.append("\nDate-" + j.getString("date"));
                this.tv3.append("\ntime-" + j.getString("time"));
                this.tv3.append("\nDistance-" + (new Service().getDistance(Double.valueOf(Double.parseDouble(j.getString("slat"))), Double.valueOf(Double.parseDouble(j.getString("slng"))), Double.valueOf(Double.parseDouble(j.getString("dlat"))), Double.valueOf(Double.parseDouble(j.getString("dlng")))).doubleValue() / 1000.0d) + "Km");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (!label.equals("book")) {
        } else {
            if (response.contains("success")) {
                Toast.makeText(getApplicationContext(), "Journey Booked", 1).show();
                startActivity(new Intent(this, MyJourneyDriver.class));
            } else if (response.contains("failure")) {
                Toast.makeText(getApplicationContext(), "Some Error Occured", 1).show();
                startActivity(new Intent(this, JourneyList.class));
            }
        }
    }

    public void onClick(View v) {
        if (v.getId() == C0132R.id.b1) {
            new AsyncRequest(this, "book").execute(new String[]{"bookJourney.php?id=" + this.id + "&id_journey=" + this.id_journey});
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0132R.menu.bookjourney, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == C0132R.id.i1) {
            startActivity(new Intent(this, OnMap.class));
        } else if (id == C0132R.id.i2) {
            startActivity(new Intent(this, Login.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
