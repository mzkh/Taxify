package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionApi;

public class zzov implements ActivityRecognitionApi {

    private static abstract class zza extends com.google.android.gms.location.ActivityRecognition.zza<Status> {
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

    /* renamed from: com.google.android.gms.internal.zzov.1 */
    class C08211 extends zza {
        final /* synthetic */ long zzamB;
        final /* synthetic */ PendingIntent zzamC;
        final /* synthetic */ zzov zzamD;

        C08211(zzov com_google_android_gms_internal_zzov, GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
            this.zzamD = com_google_android_gms_internal_zzov;
            this.zzamB = j;
            this.zzamC = pendingIntent;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zza(this.zzamB, this.zzamC);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzov.2 */
    class C08222 extends zza {
        final /* synthetic */ PendingIntent zzamC;
        final /* synthetic */ zzov zzamD;

        C08222(zzov com_google_android_gms_internal_zzov, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
            this.zzamD = com_google_android_gms_internal_zzov;
            this.zzamC = pendingIntent;
            super(googleApiClient);
        }

        protected void zza(zzpf com_google_android_gms_internal_zzpf) throws RemoteException {
            com_google_android_gms_internal_zzpf.zza(this.zzamC);
            setResult(Status.zzNo);
        }
    }

    public PendingResult<Status> removeActivityUpdates(GoogleApiClient client, PendingIntent callbackIntent) {
        return client.zzb(new C08222(this, client, callbackIntent));
    }

    public PendingResult<Status> requestActivityUpdates(GoogleApiClient client, long detectionIntervalMillis, PendingIntent callbackIntent) {
        return client.zzb(new C08211(this, client, detectionIntervalMillis, callbackIntent));
    }
}
