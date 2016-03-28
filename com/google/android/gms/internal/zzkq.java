package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;

public final class zzkq implements zzkp {

    private static class zza extends zzkn {
        private final zzb<Status> zzHa;

        public zza(zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status;
        }

        public void zzaQ(int i) throws RemoteException {
            this.zzHa.zzd(new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkq.1 */
    class C08031 extends zza {
        final /* synthetic */ zzkq zzQz;

        C08031(zzkq com_google_android_gms_internal_zzkq, GoogleApiClient googleApiClient) {
            this.zzQz = com_google_android_gms_internal_zzkq;
            super(googleApiClient);
        }

        protected void zza(zzks com_google_android_gms_internal_zzks) throws RemoteException {
            ((zzku) com_google_android_gms_internal_zzks.zzjb()).zza(new zza(this));
        }
    }

    public PendingResult<Status> zzc(GoogleApiClient googleApiClient) {
        return googleApiClient.zzb(new C08031(this, googleApiClient));
    }
}
