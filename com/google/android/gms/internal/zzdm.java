package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdt.zza;

@zzgi
public final class zzdm extends zza {
    private final Object zznh;
    private zzdo.zza zzsA;
    private zzdl zzsB;

    public zzdm() {
        this.zznh = new Object();
    }

    public void onAdClicked() {
        synchronized (this.zznh) {
            if (this.zzsB != null) {
                this.zzsB.zzah();
            }
        }
    }

    public void onAdClosed() {
        synchronized (this.zznh) {
            if (this.zzsB != null) {
                this.zzsB.zzai();
            }
        }
    }

    public void onAdFailedToLoad(int error) {
        synchronized (this.zznh) {
            if (this.zzsA != null) {
                this.zzsA.zzm(error == 3 ? 1 : 2);
                this.zzsA = null;
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.zznh) {
            if (this.zzsB != null) {
                this.zzsB.zzaj();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.zznh) {
            if (this.zzsA != null) {
                this.zzsA.zzm(0);
                this.zzsA = null;
                return;
            }
            if (this.zzsB != null) {
                this.zzsB.zzal();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.zznh) {
            if (this.zzsB != null) {
                this.zzsB.zzak();
            }
        }
    }

    public void zza(zzdl com_google_android_gms_internal_zzdl) {
        synchronized (this.zznh) {
            this.zzsB = com_google_android_gms_internal_zzdl;
        }
    }

    public void zza(zzdo.zza com_google_android_gms_internal_zzdo_zza) {
        synchronized (this.zznh) {
            this.zzsA = com_google_android_gms_internal_zzdo_zza;
        }
    }
}
