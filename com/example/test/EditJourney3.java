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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.test.AsyncRequest.OnAsyncRequestComplete;
import com.example.test.GetAddress.OnAsyncRequestComplete1;

public class EditJourney3 extends ActionBarActivity implements OnClickListener, OnAsyncRequestComplete1, OnAsyncRequestComplete {
    Button b1;
    String dlat;
    String dlng;
    EditText et1;
    EditText et2;
    int id;
    String slat;
    String slng;
    TextView tv1;
    TextView tv2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0132R.layout.insertjourney3);
        SharedPreferences settings = getSharedPreferences("MyPreferencesFileName", 0);
        this.id = settings.getInt("id", 1);
        this.slat = settings.getString("slat", "82.00000");
        this.slng = settings.getString("slng", "22.00000");
        this.dlat = settings.getString("dlat", "82.00000");
        this.dlng = settings.getString("dlng", "22.00000");
        this.tv1 = (TextView) findViewById(C0132R.id.tv1);
        this.tv2 = (TextView) findViewById(C0132R.id.tv2);
        this.et1 = (EditText) findViewById(C0132R.id.et1);
        this.et2 = (EditText) findViewById(C0132R.id.et2);
        this.b1 = (Button) findViewById(C0132R.id.b1);
        new GetAddress(this, "src").execute(new String[]{this.slat + "," + this.slng});
        new GetAddress(this, "dest").execute(new String[]{this.dlat + "," + this.dlng});
        this.b1.setOnClickListener(this);
    }

    public void asyncResponse(String response, String label) {
        switch (label.hashCode()) {
            case -1183792455:
                if (!label.equals("insert")) {
                    return;
                }
                if (response.contains("failure")) {
                    Toast.makeText(getApplicationContext(), "Some Error Occured", 1).show();
                    startActivity(new Intent(this, MyJourneyCustomer.class));
                    return;
                }
                Toast.makeText(getApplicationContext(), "Successfully Done", 1).show();
                startActivity(new Intent(this, MyJourneyCustomer.class));
            default:
        }
    }

    public void asyncResponse1(String response, String label) {
        switch (label.hashCode()) {
            case 114148:
                if (label.equals("src")) {
                    this.tv1.append(response);
                }
            case 3079842:
                if (label.equals("dest")) {
                    this.tv2.append(response);
                }
            default:
        }
    }

    public void onClick(View v) {
        if (v.getId() != C0132R.id.b1) {
            return;
        }
        if (this.et1.getText().toString().equals("") || this.et2.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "All fields Required", 0).show();
            return;
        }
        new AsyncRequest(this, "insert").execute(new String[]{"editjourney.php?slat=" + this.slat + "&dlat=" + this.dlat + "&slng=" + this.slng + "&dlng=" + this.dlng + "&time=" + this.et1.getText().toString() + "&date=" + this.et2.getText().toString() + "&id_customer=" + this.id});
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0132R.menu.insertjourney3, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case C0132R.id.i1:
                startActivity(new Intent(this, Login.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
