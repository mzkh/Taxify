package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class GetAddress extends AsyncTask<String, Integer, String> {
    OnAsyncRequestComplete1 caller;
    Context context;
    String label;

    public interface OnAsyncRequestComplete1 {
        void asyncResponse1(String str, String str2);
    }

    public GetAddress(Activity a, String l) {
        this.caller = (OnAsyncRequestComplete1) a;
        this.context = a;
        this.label = l;
    }

    protected String doInBackground(String... params) {
        Exception e;
        String s;
        String line = "";
        String result = "";
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) new URL("https://maps.googleapis.com/maps/api/geocode/json?latlng=" + params[0] + "&sensor=true").openConnection();
            urlConnection.setRequestMethod("GET");
            InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
            InputStream inputStream2;
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    result = new StringBuilder(String.valueOf(result)).append(line).toString();
                }
                inputStream2 = inputStream;
            } catch (Exception e2) {
                e = e2;
                inputStream2 = inputStream;
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

    public void onPostExecute(String response) {
        this.caller.asyncResponse1(response, this.label);
    }
}
