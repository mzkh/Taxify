package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import org.json.JSONObject;

@zzgi
public abstract class zzgb extends zzhl {
    protected final Context mContext;
    protected final zzic zzmu;
    protected final Object zznh;
    protected final com.google.android.gms.internal.zzgc.zza zzvL;
    protected final Object zzvM;
    protected final com.google.android.gms.internal.zzhe.zza zzvN;
    protected zzgq zzvO;

    /* renamed from: com.google.android.gms.internal.zzgb.1 */
    class C02201 implements Runnable {
        final /* synthetic */ zzgb zzvP;

        C02201(zzgb com_google_android_gms_internal_zzgb) {
            this.zzvP = com_google_android_gms_internal_zzgb;
        }

        public void run() {
            this.zzvP.onStop();
        }
    }

    /* renamed from: com.google.android.gms.internal.zzgb.2 */
    class C02212 implements Runnable {
        final /* synthetic */ zzgb zzvP;
        final /* synthetic */ zzhe zzvQ;

        C02212(zzgb com_google_android_gms_internal_zzgb, zzhe com_google_android_gms_internal_zzhe) {
            this.zzvP = com_google_android_gms_internal_zzgb;
            this.zzvQ = com_google_android_gms_internal_zzhe;
        }

        public void run() {
            synchronized (this.zzvP.zznh) {
                this.zzvP.zzh(this.zzvQ);
            }
        }
    }

    protected static final class zza extends Exception {
        private final int zzvR;

        public zza(String str, int i) {
            super(str);
            this.zzvR = i;
        }

        public int getErrorCode() {
            return this.zzvR;
        }
    }

    protected zzgb(Context context, com.google.android.gms.internal.zzhe.zza com_google_android_gms_internal_zzhe_zza, zzic com_google_android_gms_internal_zzic, com.google.android.gms.internal.zzgc.zza com_google_android_gms_internal_zzgc_zza) {
        this.zznh = new Object();
        this.zzvM = new Object();
        this.mContext = context;
        this.zzvN = com_google_android_gms_internal_zzhe_zza;
        this.zzvO = com_google_android_gms_internal_zzhe_zza.zzyz;
        this.zzmu = com_google_android_gms_internal_zzic;
        this.zzvL = com_google_android_gms_internal_zzgc_zza;
    }

    public void onStop() {
    }

    public void zzdw() {
        int errorCode;
        synchronized (this.zznh) {
            zzhx.zzY("AdRendererBackgroundTask started.");
            int i = this.zzvN.errorCode;
            try {
                zzg(SystemClock.elapsedRealtime());
            } catch (zza e) {
                errorCode = e.getErrorCode();
                if (errorCode == 3 || errorCode == -1) {
                    zzhx.zzaa(e.getMessage());
                } else {
                    zzhx.zzac(e.getMessage());
                }
                if (this.zzvO == null) {
                    this.zzvO = new zzgq(errorCode);
                } else {
                    this.zzvO = new zzgq(errorCode, this.zzvO.zzsx);
                }
                zzhw.zzzG.post(new C02201(this));
                i = errorCode;
            }
            zzhw.zzzG.post(new C02212(this, zzt(i)));
        }
    }

    protected abstract void zzg(long j) throws zza;

    protected void zzh(zzhe com_google_android_gms_internal_zzhe) {
        this.zzvL.zza(com_google_android_gms_internal_zzhe);
    }

    protected zzhe zzt(int i) {
        zzgo com_google_android_gms_internal_zzgo = this.zzvN.zzyy;
        long j = this.zzvO.zzwJ;
        zzba com_google_android_gms_internal_zzba = this.zzvN.zzlV;
        long j2 = this.zzvO.zzwH;
        long j3 = this.zzvN.zzyv;
        long j4 = this.zzvO.zzwM;
        String str = this.zzvO.zzwN;
        JSONObject jSONObject = this.zzvN.zzys;
        String str2 = com_google_android_gms_internal_zzgo.zzwD;
        return new zzhe(com_google_android_gms_internal_zzgo.zzwn, this.zzmu, this.zzvO.zzst, i, this.zzvO.zzsu, this.zzvO.zzwK, this.zzvO.orientation, this.zzvO.zzsx, com_google_android_gms_internal_zzgo.zzwq, this.zzvO.zzwI, null, null, null, null, null, r0, r0, r0, r0, r0, r0, r0, null, r0);
    }
}
