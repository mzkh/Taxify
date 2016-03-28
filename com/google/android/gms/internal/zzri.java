package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;

public final class zzri implements ActivityLifecycleCallbacks {
    private final zzre zzasy;
    private final Map<Activity, zzrh> zzasz;

    public zzri(zzre com_google_android_gms_internal_zzre) {
        zzx.zzl(com_google_android_gms_internal_zzre);
        this.zzasy = com_google_android_gms_internal_zzre;
        this.zzasz = new ArrayMap();
    }

    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            Bundle bundle = savedInstanceState.getBundle("com.google.android.gms.measurement.screen_view");
            if (bundle != null) {
                int i = bundle.getInt("id");
                if (i <= 0) {
                    Log.w("com.google.android.gms.measurement.internal.ActivityLifecycleTracker", "Invalid screenId in saved activity state");
                    return;
                }
                zzrh zza = zza(activity, i);
                zza.setScreenName(bundle.getString("name"));
                zza.zzgr(bundle.getInt("referrer_id"));
                zza.zzcv(bundle.getString("referrer_name"));
                zza.zzaa(bundle.getBoolean("interstitial"));
                zza.zzrh();
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        this.zzasz.remove(activity);
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        if (outState != null) {
            zzrh com_google_android_gms_internal_zzrh = (zzrh) this.zzasz.get(activity);
            if (com_google_android_gms_internal_zzrh != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("id", com_google_android_gms_internal_zzrh.zzaF());
                bundle.putString("name", com_google_android_gms_internal_zzrh.zzre());
                bundle.putInt("referrer_id", com_google_android_gms_internal_zzrh.zzrf());
                bundle.putString("referrer_name", com_google_android_gms_internal_zzrh.zzrg());
                bundle.putBoolean("interstitial", com_google_android_gms_internal_zzrh.zzri());
                outState.putBundle("com.google.android.gms.measurement.screen_view", bundle);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        this.zzasy.zzb(zza(activity, 0), activity);
    }

    public void onActivityStopped(Activity activity) {
    }

    zzrh zza(Activity activity, int i) {
        zzx.zzl(activity);
        zzrh com_google_android_gms_internal_zzrh = (zzrh) this.zzasz.get(activity);
        if (com_google_android_gms_internal_zzrh == null) {
            com_google_android_gms_internal_zzrh = i == 0 ? new zzrh(true) : new zzrh(true, i);
            com_google_android_gms_internal_zzrh.setScreenName(activity.getClass().getCanonicalName());
            this.zzasz.put(activity, com_google_android_gms_internal_zzrh);
        }
        return com_google_android_gms_internal_zzrh;
    }
}
