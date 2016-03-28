package com.example.test;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.internal.view.SupportMenu;
import android.util.Log;
import com.example.test.AsyncRequest.OnAsyncRequestComplete;
import com.example.test.GetAddress.OnAsyncRequestComplete1;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.plus.PlusShare;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class OnMap extends FragmentActivity implements OnAsyncRequestComplete, OnAsyncRequestComplete1 {
    LatLng l1;
    LatLng l2;
    GoogleMap map;

    private class DownloadTask extends AsyncTask<String, Void, String> {
        private DownloadTask() {
        }

        protected String doInBackground(String... url) {
            String data = "";
            try {
                data = OnMap.this.downloadUrl(url[0]);
            } catch (Exception e) {
                Log.d("Background Task", e.toString());
            }
            return data;
        }

        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            new ParserTask(null).execute(new String[]{result});
        }
    }

    private class ParserTask extends AsyncTask<String, Integer, List<List<HashMap<String, String>>>> {
        private ParserTask() {
        }

        protected List<List<HashMap<String, String>>> doInBackground(String... jsonData) {
            List<List<HashMap<String, String>>> routes = null;
            try {
                routes = new DirectionJsonParser().parse(new JSONObject(jsonData[0]));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return routes;
        }

        protected void onPostExecute(List<List<HashMap<String, String>>> result) {
            PolylineOptions lineOptions = null;
            MarkerOptions markerOptions = new MarkerOptions();
            for (int i = 0; i < result.size(); i++) {
                ArrayList<LatLng> points = new ArrayList();
                lineOptions = new PolylineOptions();
                List<HashMap<String, String>> path = (List) result.get(i);
                for (int j = 0; j < path.size(); j++) {
                    HashMap<String, String> point = (HashMap) path.get(j);
                    points.add(new LatLng(Double.parseDouble((String) point.get("lat")), Double.parseDouble((String) point.get("lng"))));
                }
                lineOptions.addAll(points);
                lineOptions.width(2.0f);
                lineOptions.color(SupportMenu.CATEGORY_MASK);
            }
            OnMap.this.map.addPolyline(lineOptions);
        }
    }

    public OnMap() {
        this.l1 = null;
        this.l2 = null;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0132R.layout.onmap);
        this.map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(C0132R.id.map)).getMap();
        if (this.map != null) {
            this.map.setMyLocationEnabled(true);
            int id_journey = getSharedPreferences("MyPreferencesFileName", 0).getInt("id_journey", 3);
            new AsyncRequest(this, PlusShare.KEY_CALL_TO_ACTION_LABEL).execute(new String[]{"Onmap.php?id=" + id_journey});
        }
    }

    private String getDirectionsUrl(LatLng origin, LatLng dest) {
        String str_origin = "origin=" + origin.latitude + "," + origin.longitude;
        return "https://maps.googleapis.com/maps/api/directions/" + "json" + "?" + new StringBuilder(String.valueOf(str_origin)).append("&").append("destination=" + dest.latitude + "," + dest.longitude).append("&").append("sensor=false").toString();
    }

    private String downloadUrl(String strUrl) throws IOException {
        String data = "";
        InputStream iStream = null;
        HttpURLConnection urlConnection = null;
        try {
            urlConnection = (HttpURLConnection) new URL(strUrl).openConnection();
            urlConnection.connect();
            iStream = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));
            StringBuffer sb = new StringBuffer();
            String str = "";
            while (true) {
                str = br.readLine();
                if (str == null) {
                    break;
                }
                sb.append(str);
            }
            data = sb.toString();
            br.close();
        } catch (Exception e) {
            Log.d("Exception while downloading url", e.toString());
        } finally {
            iStream.close();
            urlConnection.disconnect();
        }
        return data;
    }

    public void asyncResponse1(String response, String label) {
        if (label.equals("src")) {
            MarkerOptions options = new MarkerOptions();
            options.position(this.l1);
            options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
            options.title("src=" + response);
            this.map.addMarker(options);
            this.map.moveCamera(CameraUpdateFactory.newLatLng(this.l1));
            this.map.animateCamera(CameraUpdateFactory.zoomTo(13.0f));
        } else if (label.equals("dest")) {
            MarkerOptions options1 = new MarkerOptions();
            options1.position(this.l2);
            options1.icon(BitmapDescriptorFactory.defaultMarker(0.0f));
            options1.title("dest=" + response);
            this.map.addMarker(options1);
        }
    }

    public void asyncResponse(String response, String label) {
        if (label.equals(PlusShare.KEY_CALL_TO_ACTION_LABEL)) {
            double d = 0.0d;
            double d2 = 0.0d;
            double d3 = 0.0d;
            double d4 = 0.0d;
            try {
                JSONObject j = new JSONObject(response);
                d = Double.parseDouble(j.getString("slat"));
                d2 = Double.parseDouble(j.getString("slng"));
                d3 = Double.parseDouble(j.getString("dlat"));
                d4 = Double.parseDouble(j.getString("dlng"));
                this.l1 = new LatLng(d, d2);
                this.l2 = new LatLng(d3, d4);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            GetAddress getAddress = new GetAddress(this, "src");
            String[] strArr = new String[1];
            strArr[0] = new StringBuilder(String.valueOf(d)).append(",").append(d2).toString();
            getAddress.execute(strArr);
            getAddress = new GetAddress(this, "dest");
            strArr = new String[1];
            strArr[0] = new StringBuilder(String.valueOf(d3)).append(",").append(d4).toString();
            getAddress.execute(strArr);
            String url = getDirectionsUrl(this.l1, this.l2);
            OnMap onMap = this;
            new DownloadTask().execute(new String[]{url});
        }
    }
}
