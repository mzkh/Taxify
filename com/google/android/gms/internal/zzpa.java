package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest.Builder;
import com.google.android.gms.location.LocationStatusCodes;
import com.google.android.gms.location.zzf.zzb;
import java.util.List;

public class zzpa implements GeofencingApi {

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

    /* renamed from: com.google.android.gms.internal.zzpa.1 */
    class C08301 extends zza {
        final /* synthetic */ PendingIntent zzaaA;
        final /* synthetic */ GeofencingRequest zzamM;
        final /* synthetic */ zzpa zzamN;

        /* renamed from: com.google.android.gms.internal.zzpa.1.1 */
        class C04191 implements com.google.android.gms.location.zzf.zza {
            final /* synthetic */ C08301 zzamO;

            C04191(C08301 c08301) {
                this.zzamO = c08301;
            }

            public void zza(int i, String[] strArr) {
                this.zzamO.setResult(LocationStatusCodes.zzfr(i));
            }
        }

        C08301(zzpa com_google_android_gms_internal_zzpa, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
            this.zzamN = com_google_android_gms_internal_zzpa;
            this.zzamM = geofencingRequest;
            this.zzaaA = pendingIntent;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zza(this.zzamM, this.zzaaA, new C04191(this));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzpa.2 */
    class C08312 extends zza {
        final /* synthetic */ PendingIntent zzaaA;
        final /* synthetic */ zzpa zzamN;

        /* renamed from: com.google.android.gms.internal.zzpa.2.1 */
        class C04201 implements zzb {
            final /* synthetic */ C08312 zzamP;

            C04201(C08312 c08312) {
                this.zzamP = c08312;
            }

            public void zzb(int i, PendingIntent pendingIntent) {
                this.zzamP.setResult(LocationStatusCodes.zzfr(i));
            }

            public void zzb(int i, String[] strArr) {
                Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
            }
        }

        C08312(zzpa com_google_android_gms_internal_zzpa, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
            this.zzamN = com_google_android_gms_internal_zzpa;
            this.zzaaA = pendingIntent;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zza(this.zzaaA, new C04201(this));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzpa.3 */
    class C08323 extends zza {
        final /* synthetic */ zzpa zzamN;
        final /* synthetic */ List zzamQ;

        /* renamed from: com.google.android.gms.internal.zzpa.3.1 */
        class C04211 implements zzb {
            final /* synthetic */ C08323 zzamR;

            C04211(C08323 c08323) {
                this.zzamR = c08323;
            }

            public void zzb(int i, PendingIntent pendingIntent) {
                Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
            }

            public void zzb(int i, String[] strArr) {
                this.zzamR.setResult(LocationStatusCodes.zzfr(i));
            }
        }

        C08323(zzpa com_google_android_gms_internal_zzpa, GoogleApiClient googleApiClient, List list) {
            this.zzamN = com_google_android_gms_internal_zzpa;
            this.zzamQ = list;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zza(this.zzamQ, new C04211(this));
        }
    }

    public PendingResult<Status> addGeofences(GoogleApiClient client, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return client.zzb(new C08301(this, client, geofencingRequest, pendingIntent));
    }

    @Deprecated
    public PendingResult<Status> addGeofences(GoogleApiClient client, List<Geofence> geofences, PendingIntent pendingIntent) {
        Builder builder = new Builder();
        builder.addGeofences(geofences);
        builder.setInitialTrigger(5);
        return addGeofences(client, builder.build(), pendingIntent);
    }

    public PendingResult<Status> removeGeofences(GoogleApiClient client, PendingIntent pendingIntent) {
        return client.zzb(new C08312(this, client, pendingIntent));
    }

    public PendingResult<Status> removeGeofences(GoogleApiClient client, List<String> geofenceRequestIds) {
        return client.zzb(new C08323(this, client, geofenceRequestIds));
    }
}
