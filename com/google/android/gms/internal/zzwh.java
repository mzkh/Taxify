package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet.zzb;

public class zzwh implements Payments {

    /* renamed from: com.google.android.gms.internal.zzwh.1 */
    class C08561 extends zzb {
        final /* synthetic */ zzwh zzaET;
        final /* synthetic */ int zzalq;

        C08561(zzwh com_google_android_gms_internal_zzwh, GoogleApiClient googleApiClient, int i) {
            this.zzaET = com_google_android_gms_internal_zzwh;
            this.zzalq = i;
            super(googleApiClient);
        }

        protected void zza(zzwi com_google_android_gms_internal_zzwi) {
            com_google_android_gms_internal_zzwi.zzhG(this.zzalq);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzwh.2 */
    class C08572 extends zzb {
        final /* synthetic */ zzwh zzaET;
        final /* synthetic */ MaskedWalletRequest zzaEU;
        final /* synthetic */ int zzalq;

        C08572(zzwh com_google_android_gms_internal_zzwh, GoogleApiClient googleApiClient, MaskedWalletRequest maskedWalletRequest, int i) {
            this.zzaET = com_google_android_gms_internal_zzwh;
            this.zzaEU = maskedWalletRequest;
            this.zzalq = i;
            super(googleApiClient);
        }

        protected void zza(zzwi com_google_android_gms_internal_zzwi) {
            com_google_android_gms_internal_zzwi.zza(this.zzaEU, this.zzalq);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzwh.3 */
    class C08583 extends zzb {
        final /* synthetic */ zzwh zzaET;
        final /* synthetic */ FullWalletRequest zzaEV;
        final /* synthetic */ int zzalq;

        C08583(zzwh com_google_android_gms_internal_zzwh, GoogleApiClient googleApiClient, FullWalletRequest fullWalletRequest, int i) {
            this.zzaET = com_google_android_gms_internal_zzwh;
            this.zzaEV = fullWalletRequest;
            this.zzalq = i;
            super(googleApiClient);
        }

        protected void zza(zzwi com_google_android_gms_internal_zzwi) {
            com_google_android_gms_internal_zzwi.zza(this.zzaEV, this.zzalq);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzwh.4 */
    class C08594 extends zzb {
        final /* synthetic */ zzwh zzaET;
        final /* synthetic */ String zzaEW;
        final /* synthetic */ String zzaEX;
        final /* synthetic */ int zzalq;

        C08594(zzwh com_google_android_gms_internal_zzwh, GoogleApiClient googleApiClient, String str, String str2, int i) {
            this.zzaET = com_google_android_gms_internal_zzwh;
            this.zzaEW = str;
            this.zzaEX = str2;
            this.zzalq = i;
            super(googleApiClient);
        }

        protected void zza(zzwi com_google_android_gms_internal_zzwi) {
            com_google_android_gms_internal_zzwi.zze(this.zzaEW, this.zzaEX, this.zzalq);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzwh.5 */
    class C08605 extends zzb {
        final /* synthetic */ zzwh zzaET;
        final /* synthetic */ NotifyTransactionStatusRequest zzaEY;

        C08605(zzwh com_google_android_gms_internal_zzwh, GoogleApiClient googleApiClient, NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
            this.zzaET = com_google_android_gms_internal_zzwh;
            this.zzaEY = notifyTransactionStatusRequest;
            super(googleApiClient);
        }

        protected void zza(zzwi com_google_android_gms_internal_zzwi) {
            com_google_android_gms_internal_zzwi.zza(this.zzaEY);
            setResult(Status.zzNo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzwh.6 */
    class C08616 extends zzb {
        final /* synthetic */ zzwh zzaET;
        final /* synthetic */ int zzalq;

        C08616(zzwh com_google_android_gms_internal_zzwh, GoogleApiClient googleApiClient, int i) {
            this.zzaET = com_google_android_gms_internal_zzwh;
            this.zzalq = i;
            super(googleApiClient);
        }

        protected void zza(zzwi com_google_android_gms_internal_zzwi) {
            com_google_android_gms_internal_zzwi.zzhH(this.zzalq);
            setResult(Status.zzNo);
        }
    }

    public void changeMaskedWallet(GoogleApiClient googleApiClient, String googleTransactionId, String merchantTransactionId, int requestCode) {
        googleApiClient.zza(new C08594(this, googleApiClient, googleTransactionId, merchantTransactionId, requestCode));
    }

    public void checkForPreAuthorization(GoogleApiClient googleApiClient, int requestCode) {
        googleApiClient.zza(new C08561(this, googleApiClient, requestCode));
    }

    public void isNewUser(GoogleApiClient googleApiClient, int requestCode) {
        googleApiClient.zza(new C08616(this, googleApiClient, requestCode));
    }

    public void loadFullWallet(GoogleApiClient googleApiClient, FullWalletRequest request, int requestCode) {
        googleApiClient.zza(new C08583(this, googleApiClient, request, requestCode));
    }

    public void loadMaskedWallet(GoogleApiClient googleApiClient, MaskedWalletRequest request, int requestCode) {
        googleApiClient.zza(new C08572(this, googleApiClient, request, requestCode));
    }

    public void notifyTransactionStatus(GoogleApiClient googleApiClient, NotifyTransactionStatusRequest request) {
        googleApiClient.zza(new C08605(this, googleApiClient, request));
    }
}
