package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzid.zza;
import org.json.JSONObject;

@zzgi
public class zzaj implements zzah {
    private final zzic zzmu;

    /* renamed from: com.google.android.gms.internal.zzaj.1 */
    class C01831 implements Runnable {
        final /* synthetic */ String zznQ;
        final /* synthetic */ JSONObject zznR;
        final /* synthetic */ zzaj zznS;

        C01831(zzaj com_google_android_gms_internal_zzaj, String str, JSONObject jSONObject) {
            this.zznS = com_google_android_gms_internal_zzaj;
            this.zznQ = str;
            this.zznR = jSONObject;
        }

        public void run() {
            this.zznS.zzmu.zza(this.zznQ, this.zznR);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaj.2 */
    class C01842 implements Runnable {
        final /* synthetic */ String zznQ;
        final /* synthetic */ zzaj zznS;
        final /* synthetic */ String zznT;

        C01842(zzaj com_google_android_gms_internal_zzaj, String str, String str2) {
            this.zznS = com_google_android_gms_internal_zzaj;
            this.zznQ = str;
            this.zznT = str2;
        }

        public void run() {
            this.zznS.zzmu.zzb(this.zznQ, this.zznT);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaj.3 */
    class C01853 implements Runnable {
        final /* synthetic */ zzaj zznS;
        final /* synthetic */ String zznU;

        C01853(zzaj com_google_android_gms_internal_zzaj, String str) {
            this.zznS = com_google_android_gms_internal_zzaj;
            this.zznU = str;
        }

        public void run() {
            this.zznS.zzmu.loadData(this.zznU, "text/html", "UTF-8");
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaj.4 */
    class C01864 implements Runnable {
        final /* synthetic */ String zznN;
        final /* synthetic */ zzaj zznS;

        C01864(zzaj com_google_android_gms_internal_zzaj, String str) {
            this.zznS = com_google_android_gms_internal_zzaj;
            this.zznN = str;
        }

        public void run() {
            this.zznS.zzmu.loadUrl(this.zznN);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaj.5 */
    class C03855 implements zza {
        final /* synthetic */ zzaj zznS;
        final /* synthetic */ zzah.zza zznV;

        C03855(zzaj com_google_android_gms_internal_zzaj, zzah.zza com_google_android_gms_internal_zzah_zza) {
            this.zznS = com_google_android_gms_internal_zzaj;
            this.zznV = com_google_android_gms_internal_zzah_zza;
        }

        public void zza(zzic com_google_android_gms_internal_zzic, boolean z) {
            this.zznV.zzbk();
        }
    }

    public zzaj(Context context, zzhy com_google_android_gms_internal_zzhy) {
        this.zzmu = zzab.zzaN().zza(context, new zzba(), false, false, null, com_google_android_gms_internal_zzhy);
    }

    private void runOnUiThread(Runnable runnable) {
        if (zzbe.zzbD().zzeC()) {
            runnable.run();
        } else {
            zzhw.zzzG.post(runnable);
        }
    }

    public void destroy() {
        this.zzmu.destroy();
    }

    public void zza(zzah.zza com_google_android_gms_internal_zzah_zza) {
        this.zzmu.zzeG().zza(new C03855(this, com_google_android_gms_internal_zzah_zza));
    }

    public void zza(zzat com_google_android_gms_internal_zzat, zzep com_google_android_gms_internal_zzep, zzct com_google_android_gms_internal_zzct, zzes com_google_android_gms_internal_zzes, boolean z, zzcw com_google_android_gms_internal_zzcw, zzcy com_google_android_gms_internal_zzcy, zzu com_google_android_gms_internal_zzu, zzeh com_google_android_gms_internal_zzeh) {
        this.zzmu.zzeG().zzb(com_google_android_gms_internal_zzat, com_google_android_gms_internal_zzep, com_google_android_gms_internal_zzct, com_google_android_gms_internal_zzes, z, com_google_android_gms_internal_zzcw, com_google_android_gms_internal_zzcy, new zzu(false), com_google_android_gms_internal_zzeh);
    }

    public void zza(String str, zzcv com_google_android_gms_internal_zzcv) {
        this.zzmu.zzeG().zza(str, com_google_android_gms_internal_zzcv);
    }

    public void zza(String str, JSONObject jSONObject) {
        runOnUiThread(new C01831(this, str, jSONObject));
    }

    public void zzb(String str, zzcv com_google_android_gms_internal_zzcv) {
        this.zzmu.zzeG().zzb(str, com_google_android_gms_internal_zzcv);
    }

    public void zzb(String str, String str2) {
        runOnUiThread(new C01842(this, str, str2));
    }

    public void zzf(String str) {
        runOnUiThread(new C01853(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public void zzg(String str) {
        runOnUiThread(new C01864(this, str));
    }
}
