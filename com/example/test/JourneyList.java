package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.example.test.AsyncRequest.OnAsyncRequestComplete;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class JourneyList extends Activity implements OnClickListener, OnAsyncRequestComplete, LocationListener {
    List<HashMap<String, String>> aList;
    Button f12b;
    int f13i;
    int id;

    /* renamed from: com.example.test.JourneyList.1 */
    class C01311 implements OnItemClickListener {
        C01311() {
        }

        public void onItemClick(AdapterView<?> adapterView, View container, int position, long id) {
            TextView tvCountry = (TextView) ((RelativeLayout) container).getChildAt(0);
            Editor p = JourneyList.this.getSharedPreferences("MyPreferencesFileName", 0).edit();
            p.putInt("id_journey", Integer.parseInt(tvCountry.getText().toString()));
            p.commit();
            JourneyList.this.startActivity(new Intent("com.example.test.BOOKJOURNEY"));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0132R.layout.listview_layout);
        this.f12b = (Button) findViewById(C0132R.id.bAskJourney);
        this.f12b.setOnClickListener(this);
        this.f13i = 1;
        abc("contract");
        this.f12b.setEnabled(false);
    }

    public void abc(String value) {
        double a;
        double b;
        this.aList = new ArrayList();
        this.id = getSharedPreferences("MyPreferencesFileName", 0).getInt("id", 1);
        LocationManager locationManager = (LocationManager) getSystemService("location");
        Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(new Criteria(), true));
        if (location == null) {
            a = 22.12873071419643d;
            b = 82.1291796863079d;
        } else {
            a = location.getLatitude();
            b = location.getLongitude();
        }
        new AsyncRequest(this, PlusShare.KEY_CALL_TO_ACTION_LABEL).execute(new String[]{"AskJourney.php?lat=" + a + "&lng=" + b + "&value=" + value});
    }

    public void onClick(View v) {
        if (this.f13i % 2 == 1) {
            abc("contract");
            this.f13i++;
            this.f12b.setText("expand");
            return;
        }
        this.f12b.setText("contract");
        abc("expand");
        this.f13i++;
    }

    public void asyncResponse(String response, String label) {
        if (label.equals(PlusShare.KEY_CALL_TO_ACTION_LABEL)) {
            try {
                JSONArray j = new JSONArray(response);
                for (int i = 0; i < j.length(); i++) {
                    HashMap<String, String> hm = new HashMap();
                    JSONObject j1 = j.getJSONObject(i);
                    hm.put("src", "src Connection problem");
                    hm.put("dest", "dest Connection problem");
                    hm.put("time", j1.getString("time"));
                    hm.put("date", j1.getString("date"));
                    hm.put("id", j1.getString("id"));
                    this.aList.add(hm);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ListView listView = (ListView) findViewById(C0132R.id.listview);
            listView.setAdapter(new SimpleAdapter(getBaseContext(), this.aList, C0132R.layout.listformat, new String[]{"src", "dest", "time", "date", "id"}, new int[]{C0132R.id.textView2, C0132R.id.textView3, C0132R.id.textView4, C0132R.id.textView5, C0132R.id.textView1}));
            listView.setOnItemClickListener(new C01311());
            this.f12b.setEnabled(true);
        }
    }

    public void onLocationChanged(Location location) {
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    public void onProviderEnabled(String provider) {
    }

    public void onProviderDisabled(String provider) {
    }
}
