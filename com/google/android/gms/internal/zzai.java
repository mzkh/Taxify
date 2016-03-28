package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzah.zza;
import java.util.concurrent.Future;

@zzgi
public class zzai {

    /* renamed from: com.google.android.gms.internal.zzai.1 */
    class C01821 implements Runnable {
        final /* synthetic */ Context zznK;
        final /* synthetic */ zzhy zznL;
        final /* synthetic */ zzhq zznM;
        final /* synthetic */ String zznN;
        final /* synthetic */ zzai zznO;

        C01821(zzai com_google_android_gms_internal_zzai, Context context, zzhy com_google_android_gms_internal_zzhy, zzhq com_google_android_gms_internal_zzhq, String str) {
            this.zznO = com_google_android_gms_internal_zzai;
            this.zznK = context;
            this.zznL = com_google_android_gms_internal_zzhy;
            this.zznM = com_google_android_gms_internal_zzhq;
            this.zznN = str;
        }

        public void run() {
            this.zznO.zza(this.zznK, this.zznL, this.zznM).zzg(this.zznN);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzai.2 */
    class C03842 implements zza {
        final /* synthetic */ zzhq zznM;
        final /* synthetic */ zzai zznO;
        final /* synthetic */ zzah zznP;

        C03842(zzai com_google_android_gms_internal_zzai, zzhq com_google_android_gms_internal_zzhq, zzah com_google_android_gms_internal_zzah) {
            this.zznO = com_google_android_gms_internal_zzai;
            this.zznM = com_google_android_gms_internal_zzhq;
            this.zznP = com_google_android_gms_internal_zzah;
        }

        public void zzbk() {
            this.zznM.zzb(this.zznP);
        }
    }

    protected zzah zza(Context context, zzhy com_google_android_gms_internal_zzhy, zzhq<zzah> com_google_android_gms_internal_zzhq_com_google_android_gms_internal_zzah) {
        zzah com_google_android_gms_internal_zzaj = new zzaj(context, com_google_android_gms_internal_zzhy);
        com_google_android_gms_internal_zzaj.zza(new C03842(this, com_google_android_gms_internal_zzhq_com_google_android_gms_internal_zzah, com_google_android_gms_internal_zzaj));
        return com_google_android_gms_internal_zzaj;
    }

    public Future<zzah> zza(Context context, zzhy com_google_android_gms_internal_zzhy, String str) {
        Future com_google_android_gms_internal_zzhq = new zzhq();
        zzhw.zzzG.post(new C01821(this, context, com_google_android_gms_internal_zzhy, com_google_android_gms_internal_zzhq, str));
        return com_google_android_gms_internal_zzhq;
    }
}
