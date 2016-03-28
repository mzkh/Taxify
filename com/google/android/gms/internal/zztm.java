package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;

public final class zztm implements Account {

    private static abstract class zza extends com.google.android.gms.plus.Plus.zza<Status> {
        private zza(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.internal.zztm.1 */
    class C08451 extends zza {
        final /* synthetic */ zztm zzauI;

        C08451(zztm com_google_android_gms_internal_zztm, GoogleApiClient googleApiClient) {
            this.zzauI = com_google_android_gms_internal_zztm;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            com_google_android_gms_plus_internal_zze.zzl(this);
        }
    }

    public void clearDefaultAccount(GoogleApiClient googleApiClient) {
        zze zzf = Plus.zzf(googleApiClient, false);
        if (zzf != null) {
            zzf.zzrK();
        }
    }

    public String getAccountName(GoogleApiClient googleApiClient) {
        return Plus.zzf(googleApiClient, true).getAccountName();
    }

    public PendingResult<Status> revokeAccessAndDisconnect(GoogleApiClient googleApiClient) {
        return googleApiClient.zzb(new C08451(this, googleApiClient));
    }
}
