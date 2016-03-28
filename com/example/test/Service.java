package com.example.test;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

public class Service {
    public String get(String url) {
        String result = "";
        StrictMode.setThreadPolicy(new Builder().permitAll().build());
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new DefaultHttpClient().execute(new HttpPost("http://192.168.43.176/TaxiCalling1/" + url)).getEntity().getContent(), "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(new StringBuilder(String.valueOf(line)).append("\n").toString());
            }
        } catch (Exception e) {
            return result;
        }
    }

    public String getAddress(String str) {
        InputStream inputStream;
        Exception e;
        String s;
        String line = "";
        String result = "";
        StrictMode.setThreadPolicy(new Builder().permitAll().build());
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) new URL("https://maps.googleapis.com/maps/api/geocode/json?latlng=" + str + "&sensor=true").openConnection();
            urlConnection.setRequestMethod("GET");
            InputStream inputStream2 = new BufferedInputStream(urlConnection.getInputStream());
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2));
                while (true) {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    result = new StringBuilder(String.valueOf(result)).append(line).toString();
                }
                inputStream = inputStream2;
            } catch (Exception e2) {
                e = e2;
                inputStream = inputStream2;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            s = null;
            s = new JSONObject(result).getJSONArray("results").getJSONObject(0).getString("formatted_address");
            return s;
        }
        s = null;
        try {
            s = new JSONObject(result).getJSONArray("results").getJSONObject(0).getString("formatted_address");
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return s;
    }

    public Double getDistance(Double latitude1, Double longitude1, Double latitude2, Double longitude2) {
        double dLat = getRad(Double.valueOf(latitude2.doubleValue() - latitude1.doubleValue())).doubleValue();
        double dLong = getRad(Double.valueOf(longitude2.doubleValue() - longitude1.doubleValue())).doubleValue();
        double a = (Math.sin(dLat / 2.0d) * Math.sin(dLat / 2.0d)) + (((Math.cos(getRad(latitude1).doubleValue()) * Math.cos(getRad(latitude2).doubleValue())) * Math.sin(dLong / 2.0d)) * Math.sin(dLong / 2.0d));
        return Double.valueOf((6371.0d * (2.0d * Math.atan2(Math.sqrt(a), Math.sqrt(1.0d - a)))) * 1000.0d);
    }

    private Double getRad(Double x) {
        return Double.valueOf((x.doubleValue() * 3.141592653589793d) / 180.0d);
    }
}
