package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.safetynet.SafetyNetApi.AttestationResult;

public class zzum implements SafetyNetApi {

    static class zza implements AttestationResult {
        private final Status zzHb;
        private final com.google.android.gms.safetynet.zza zzawJ;

        public zza(Status status, com.google.android.gms.safetynet.zza com_google_android_gms_safetynet_zza) {
            this.zzHb = status;
            this.zzawJ = com_google_android_gms_safetynet_zza;
        }

        public String getJwsResult() {
            return this.zzawJ == null ? null : this.zzawJ.getJwsResult();
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    static abstract class zzb extends zzuj<AttestationResult> {
        protected zzuk zzawK;

        /* renamed from: com.google.android.gms.internal.zzum.zzb.1 */
        class C06491 extends zzui {
            final /* synthetic */ zzb zzawL;

            C06491(zzb com_google_android_gms_internal_zzum_zzb) {
                this.zzawL = com_google_android_gms_internal_zzum_zzb;
            }

            public void zza(Status status, com.google.android.gms.safetynet.zza com_google_android_gms_safetynet_zza) {
                this.zzawL.setResult(new zza(status, com_google_android_gms_safetynet_zza));
            }
        }

        public zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.zzawK = new C06491(this);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaL(x0);
        }

        protected AttestationResult zzaL(Status status) {
            return new zza(status, null);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzum.1 */
    class C08551 extends zzb {
        final /* synthetic */ byte[] zzawH;
        final /* synthetic */ zzum zzawI;

        C08551(zzum com_google_android_gms_internal_zzum, GoogleApiClient googleApiClient, byte[] bArr) {
            this.zzawI = com_google_android_gms_internal_zzum;
            this.zzawH = bArr;
            super(googleApiClient);
        }

        protected void zza(zzun com_google_android_gms_internal_zzun) throws RemoteException {
            com_google_android_gms_internal_zzun.zza(this.zzawK, this.zzawH);
        }
    }

    public PendingResult<AttestationResult> attest(GoogleApiClient googleApiClient, byte[] nonce) {
        return googleApiClient.zza(new C08551(this, googleApiClient, nonce));
    }
}
