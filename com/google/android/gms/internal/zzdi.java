package com.google.android.gms.internal;

import android.content.Context;

@zzgi
public final class zzdi {
    private final Context mContext;
    private final zzdr zzlD;
    private final Object zznh;
    private final zzgo zzse;
    private final zzdk zzsf;
    private boolean zzsg;
    private zzdn zzsh;

    /* renamed from: com.google.android.gms.internal.zzdi.1 */
    class C01961 implements Runnable {
        final /* synthetic */ zzdo zzsi;
        final /* synthetic */ zzdi zzsj;

        C01961(zzdi com_google_android_gms_internal_zzdi, zzdo com_google_android_gms_internal_zzdo) {
            this.zzsj = com_google_android_gms_internal_zzdi;
            this.zzsi = com_google_android_gms_internal_zzdo;
        }

        public void run() {
            try {
                this.zzsi.zzsM.destroy();
            } catch (Throwable e) {
                zzhx.zzd("Could not destroy mediation adapter.", e);
            }
        }
    }

    public zzdi(Context context, zzgo com_google_android_gms_internal_zzgo, zzdr com_google_android_gms_internal_zzdr, zzdk com_google_android_gms_internal_zzdk) {
        this.zznh = new Object();
        this.zzsg = false;
        this.mContext = context;
        this.zzse = com_google_android_gms_internal_zzgo;
        this.zzlD = com_google_android_gms_internal_zzdr;
        this.zzsf = com_google_android_gms_internal_zzdk;
    }

    public void cancel() {
        synchronized (this.zznh) {
            this.zzsg = true;
            if (this.zzsh != null) {
                this.zzsh.cancel();
            }
        }
    }

    public zzdo zza(long j, long j2) {
        zzhx.zzY("Starting mediation.");
        for (zzdj com_google_android_gms_internal_zzdj : this.zzsf.zzsr) {
            zzhx.zzaa("Trying mediation network: " + com_google_android_gms_internal_zzdj.zzsl);
            for (String str : com_google_android_gms_internal_zzdj.zzsm) {
                synchronized (this.zznh) {
                    if (this.zzsg) {
                        zzdo com_google_android_gms_internal_zzdo = new zzdo(-1);
                        return com_google_android_gms_internal_zzdo;
                    }
                    this.zzsh = new zzdn(this.mContext, str, this.zzlD, this.zzsf, com_google_android_gms_internal_zzdj, this.zzse.zzwn, this.zzse.zzlV, this.zzse.zzlP);
                    com_google_android_gms_internal_zzdo = this.zzsh.zzb(j, j2);
                    if (com_google_android_gms_internal_zzdo.zzsK == 0) {
                        zzhx.zzY("Adapter succeeded.");
                        return com_google_android_gms_internal_zzdo;
                    } else if (com_google_android_gms_internal_zzdo.zzsM != null) {
                        zzhw.zzzG.post(new C01961(this, com_google_android_gms_internal_zzdo));
                    }
                }
            }
        }
        return new zzdo(1);
    }
}
