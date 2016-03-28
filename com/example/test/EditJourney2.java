package com.example.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.example.test.GetAddress.OnAsyncRequestComplete1;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.plus.PlusShare;

public class EditJourney2 extends FragmentActivity implements OnAsyncRequestComplete1, OnClickListener, OnMapClickListener, OnMapReadyCallback, LocationListener {
    Button f9b;
    String dlat;
    String dlng;
    GoogleMap googleMap;
    int id;
    LatLng latLng;
    MarkerOptions markerOptions;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0132R.layout.insertjourney);
        this.f9b = (Button) findViewById(C0132R.id.bgetloc);
        this.f9b.setOnClickListener(this);
        SharedPreferences settings = getSharedPreferences("MyPreferencesFileName", 0);
        this.id = settings.getInt("id", 1);
        this.dlat = settings.getString("dlat", "82.00000");
        this.dlng = settings.getString("dlng", "22.00000");
        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(C0132R.id.map);
        supportMapFragment.getMapAsync(this);
        this.googleMap = supportMapFragment.getMap();
        this.googleMap.setMyLocationEnabled(true);
        LocationManager locationManager = (LocationManager) getSystemService("location");
        String bestProvider = locationManager.getBestProvider(new Criteria(), true);
        Location location = locationManager.getLastKnownLocation(bestProvider);
        this.latLng = new LatLng(Double.parseDouble(this.dlat), Double.parseDouble(this.dlng));
        this.markerOptions = new MarkerOptions();
        this.markerOptions.position(this.latLng);
        this.googleMap.addMarker(this.markerOptions);
        new GetAddress(this, PlusShare.KEY_CALL_TO_ACTION_LABEL).execute(new String[]{new StringBuilder(String.valueOf(this.latLng.latitude)).append(",").append(this.latLng.longitude).toString()});
        this.googleMap.moveCamera(CameraUpdateFactory.newLatLng(this.latLng));
        this.googleMap.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
        locationManager.requestLocationUpdates(bestProvider, 20000, 0.0f, this);
    }

    public void asyncResponse1(String response, String label) {
        this.googleMap.clear();
        this.markerOptions.title(response);
        this.googleMap.addMarker(this.markerOptions);
    }

    public void onClick(View v) {
        Editor preferencesEditor = getSharedPreferences("MyPreferencesFileName", 0).edit();
        preferencesEditor.putString("dlat", Double.toString(this.latLng.latitude));
        preferencesEditor.putString("dlng", Double.toString(this.latLng.longitude));
        preferencesEditor.commit();
        startActivity(new Intent(this, EditJourney3.class));
    }

    public void onMapClick(LatLng loc) {
        this.latLng = loc;
        this.googleMap.clear();
        this.markerOptions.position(loc);
        this.googleMap.addMarker(this.markerOptions);
        new GetAddress(this, PlusShare.KEY_CALL_TO_ACTION_LABEL).execute(new String[]{new StringBuilder(String.valueOf(this.latLng.latitude)).append(",").append(this.latLng.longitude).toString()});
        this.googleMap.moveCamera(CameraUpdateFactory.newLatLng(loc));
        this.googleMap.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
    }

    public void onMapReady(GoogleMap arg0) {
        this.googleMap.setOnMapClickListener(this);
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
