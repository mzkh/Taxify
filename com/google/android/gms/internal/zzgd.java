package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzhe.zza;

@zzgi
public class zzgd extends zzfy {

    /* renamed from: com.google.android.gms.internal.zzgd.1 */
    class C02221 implements Runnable {
        final /* synthetic */ zzgd zzvS;

        C02221(zzgd com_google_android_gms_internal_zzgd) {
            this.zzvS = com_google_android_gms_internal_zzgd;
        }

        public void run() {
            synchronized (this.zzvS.zznh) {
                if (this.zzvS.zzvO.errorCode != -2) {
                    return;
                }
                this.zzvS.zzmu.zzeG().zza(this.zzvS);
                this.zzvS.zzdG();
                zzhx.zzab("Loading HTML in WebView.");
                this.zzvS.zzmu.loadDataWithBaseURL(zzab.zzaM().zzS(this.zzvS.zzvO.zzus), this.zzvS.zzvO.zzwG, "text/html", "UTF-8", null);
            }
        }
    }

    zzgd(Context context, zza com_google_android_gms_internal_zzhe_zza, zzic com_google_android_gms_internal_zzic, zzgc.zza com_google_android_gms_internal_zzgc_zza) {
        super(context, com_google_android_gms_internal_zzhe_zza, com_google_android_gms_internal_zzic, com_google_android_gms_internal_zzgc_zza);
    }

    protected void zzdG() {
    }

    protected void zzg(long j) throws zza {
        zzhw.zzzG.post(new C02221(this));
        zzf(j);
    }
}
