package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class zzoz implements FusedLocationProviderApi {

    private static abstract class zza extends com.google.android.gms.location.LocationServices.zza<Status> {
        public zza(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoz.1 */
    class C08231 extends zza {
        final /* synthetic */ LocationRequest zzamG;
        final /* synthetic */ LocationListener zzamH;
        final /* synthetic */ zzoz zzamI;

        C08231(zzoz com_google_android_gms_internal_zzoz, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            this.zzamI = com_google_android_gms_internal_zzoz;
            this.zzamG = locationRequest;
            this.zzamH = locationListener;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zza(this.zzamG, this.zzamH, null);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoz.2 */
    class C08242 extends zza {
        final /* synthetic */ zzoz zzamI;
        final /* synthetic */ boolean zzamJ;

        C08242(zzoz com_google_android_gms_internal_zzoz, GoogleApiClient googleApiClient, boolean z) {
            this.zzamI = com_google_android_gms_internal_zzoz;
            this.zzamJ = z;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zzW(this.zzamJ);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoz.3 */
    class C08253 extends zza {
        final /* synthetic */ zzoz zzamI;
        final /* synthetic */ Location zzamK;

        C08253(zzoz com_google_android_gms_internal_zzoz, GoogleApiClient googleApiClient, Location location) {
            this.zzamI = com_google_android_gms_internal_zzoz;
            this.zzamK = location;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zzb(this.zzamK);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoz.4 */
    class C08264 extends zza {
        final /* synthetic */ LocationRequest zzamG;
        final /* synthetic */ LocationListener zzamH;
        final /* synthetic */ zzoz zzamI;
        final /* synthetic */ Looper zzamL;

        C08264(zzoz com_google_android_gms_internal_zzoz, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
            this.zzamI = com_google_android_gms_internal_zzoz;
            this.zzamG = locationRequest;
            this.zzamH = locationListener;
            this.zzamL = looper;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zza(this.zzamG, this.zzamH, this.zzamL);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoz.5 */
    class C08275 extends zza {
        final /* synthetic */ PendingIntent zzamC;
        final /* synthetic */ LocationRequest zzamG;
        final /* synthetic */ zzoz zzamI;

        C08275(zzoz com_google_android_gms_internal_zzoz, GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
            this.zzamI = com_google_android_gms_internal_zzoz;
            this.zzamG = locationRequest;
            this.zzamC = pendingIntent;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zzb(this.zzamG, this.zzamC);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoz.6 */
    class C08286 extends zza {
        final /* synthetic */ LocationListener zzamH;
        final /* synthetic */ zzoz zzamI;

        C08286(zzoz com_google_android_gms_internal_zzoz, GoogleApiClient googleApiClient, LocationListener locationListener) {
            this.zzamI = com_google_android_gms_internal_zzoz;
            this.zzamH = locationListener;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zza(this.zzamH);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoz.7 */
    class C08297 extends zza {
        final /* synthetic */ PendingIntent zzamC;
        final /* synthetic */ zzoz zzamI;

        C08297(zzoz com_google_android_gms_internal_zzoz, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
            this.zzamI = com_google_android_gms_internal_zzoz;
            this.zzamC = pendingIntent;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zzd(this.zzamC);
            setResult(Status.zzNo);
        }
    }

    public Location getLastLocation(GoogleApiClient client) {
        try {
            return LocationServices.zze(client).zzpx();
        } catch (Exception e) {
            return null;
        }
    }

    public PendingResult<Status> removeLocationUpdates(GoogleApiClient client, PendingIntent callbackIntent) {
        return client.zzb(new C08297(this, client, callbackIntent));
    }

    public PendingResult<Status> removeLocationUpdates(GoogleApiClient client, LocationListener listener) {
        return client.zzb(new C08286(this, client, listener));
    }

    public PendingResult<Status> requestLocationUpdates(GoogleApiClient client, LocationRequest request, PendingIntent callbackIntent) {
        return client.zzb(new C08275(this, client, request, callbackIntent));
    }

    public PendingResult<Status> requestLocationUpdates(GoogleApiClient client, LocationRequest request, LocationListener listener) {
        return client.zzb(new C08231(this, client, request, listener));
    }

    public PendingResult<Status> requestLocationUpdates(GoogleApiClient client, LocationRequest request, LocationListener listener, Looper looper) {
        return client.zzb(new C08264(this, client, request, listener, looper));
    }

    public PendingResult<Status> setMockLocation(GoogleApiClient client, Location mockLocation) {
        return client.zzb(new C08253(this, client, mockLocation));
    }

    public PendingResult<Status> setMockMode(GoogleApiClient client, boolean isMockMode) {
        return client.zzb(new C08242(this, client, isMockMode));
    }
}
