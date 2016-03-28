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

public class AsyncRequest extends AsyncTask<String, Integer, String> {
    OnAsyncRequestComplete caller;
    Context context;
    String label;

    public interface OnAsyncRequestComplete {
        void asyncResponse(String str, String str2);
    }

    public AsyncRequest(Activity a, String l) {
        this.caller = (OnAsyncRequestComplete) a;
        this.context = a;
        this.label = l;
    }

    protected String doInBackground(String... params) {
        Exception e;
        String line = "";
        String result = "";
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) new URL("http://192.168.43.176/TaxiCalling3/" + params[0].toString()).openConnection();
            urlConnection.setRequestMethod("GET");
            InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    result = new StringBuilder(String.valueOf(result)).append(line).toString();
                }
                InputStream inputStream2 = inputStream;
            } catch (Exception e2) {
                e = e2;
                inputStream2 = inputStream;
                e.printStackTrace();
                return result;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return result;
        }
        return result;
    }

    public void onPostExecute(String response) {
        this.caller.asyncResponse(response, this.label);
    }
}
