package com.google.android.gms.tagmanager;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.zzb;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class zzda extends zzaj {
    private static final String ID;
    private static final String NAME;
    private static final String zzaAV;
    private static final String zzaAW;
    private static final String zzaAX;
    private final Context mContext;
    private Handler mHandler;
    private boolean zzaAY;
    private boolean zzaAZ;
    private final HandlerThread zzaBa;
    private final Set<String> zzaBb;
    private DataLayer zzaxx;

    private final class zza implements Runnable {
        private final String zzaBc;
        private final String zzaBd;
        private final long zzaBe;
        private final long zzaBf;
        private long zzaBg;
        final /* synthetic */ zzda zzaBh;
        private final long zzamf;

        zza(zzda com_google_android_gms_tagmanager_zzda, String str, String str2, long j, long j2) {
            this.zzaBh = com_google_android_gms_tagmanager_zzda;
            this.zzaBc = str;
            this.zzaBd = str2;
            this.zzamf = j;
            this.zzaBe = j2;
            this.zzaBf = System.currentTimeMillis();
        }

        public void run() {
            if (this.zzaBe <= 0 || this.zzaBg < this.zzaBe) {
                this.zzaBg++;
                if (zzbu()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.zzaBh.zzaxx.push(DataLayer.mapOf(DataLayer.EVENT_KEY, this.zzaBc, "gtm.timerInterval", String.valueOf(this.zzamf), "gtm.timerLimit", String.valueOf(this.zzaBe), "gtm.timerStartTime", String.valueOf(this.zzaBf), "gtm.timerCurrentTime", String.valueOf(currentTimeMillis), "gtm.timerElapsedTime", String.valueOf(currentTimeMillis - this.zzaBf), "gtm.timerEventNumber", String.valueOf(this.zzaBg), "gtm.triggers", this.zzaBd));
                }
                this.zzaBh.mHandler.postDelayed(this, this.zzamf);
            } else if (!"0".equals(this.zzaBd)) {
                this.zzaBh.zzaBb.remove(this.zzaBd);
            }
        }

        protected boolean zzbu() {
            if (this.zzaBh.zzaAZ) {
                return this.zzaBh.zzaAY;
            }
            KeyguardManager keyguardManager = (KeyguardManager) this.zzaBh.mContext.getSystemService("keyguard");
            PowerManager powerManager = (PowerManager) this.zzaBh.mContext.getSystemService("power");
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.zzaBh.mContext.getSystemService("activity")).getRunningAppProcesses()) {
                if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn()) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        ID = com.google.android.gms.internal.zza.TIMER_LISTENER.toString();
        NAME = zzb.NAME.toString();
        zzaAV = zzb.INTERVAL.toString();
        zzaAW = zzb.LIMIT.toString();
        zzaAX = zzb.UNIQUE_TRIGGER_ID.toString();
    }

    public zzda(Context context, DataLayer dataLayer) {
        super(ID, zzaAV, NAME);
        this.zzaBb = new HashSet();
        this.mContext = context;
        this.zzaxx = dataLayer;
        this.zzaBa = new HandlerThread("Google GTM SDK Timer", 10);
        this.zzaBa.start();
        this.mHandler = new Handler(this.zzaBa.getLooper());
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map<String, com.google.android.gms.internal.zzd.zza> map) {
        long parseLong;
        long parseLong2;
        Object zzg = zzde.zzg((com.google.android.gms.internal.zzd.zza) map.get(NAME));
        String zzg2 = zzde.zzg((com.google.android.gms.internal.zzd.zza) map.get(zzaAX));
        String zzg3 = zzde.zzg((com.google.android.gms.internal.zzd.zza) map.get(zzaAV));
        String zzg4 = zzde.zzg((com.google.android.gms.internal.zzd.zza) map.get(zzaAW));
        try {
            parseLong = Long.parseLong(zzg3);
        } catch (NumberFormatException e) {
            parseLong = 0;
        }
        try {
            parseLong2 = Long.parseLong(zzg4);
        } catch (NumberFormatException e2) {
            parseLong2 = 0;
        }
        if (parseLong > 0 && !TextUtils.isEmpty(zzg)) {
            if (zzg2 == null || zzg2.isEmpty()) {
                zzg2 = "0";
            }
            if (!this.zzaBb.contains(zzg2)) {
                if (!"0".equals(zzg2)) {
                    this.zzaBb.add(zzg2);
                }
                this.mHandler.postDelayed(new zza(this, zzg, zzg2, parseLong, parseLong2), parseLong);
            }
        }
        return zzde.zzuf();
    }

    public boolean zzsD() {
        return false;
    }
}
