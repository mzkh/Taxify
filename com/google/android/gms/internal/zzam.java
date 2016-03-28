package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;

@zzgi
public class zzam implements ActivityLifecycleCallbacks {
    private Context mContext;
    private final Object zznh;
    private Activity zzoi;

    public zzam(Application application, Activity activity) {
        this.zznh = new Object();
        application.registerActivityLifecycleCallbacks(this);
        setActivity(activity);
        this.mContext = application.getApplicationContext();
    }

    private void setActivity(Activity activity) {
        synchronized (this.zznh) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.zzoi = activity;
            }
        }
    }

    public Activity getActivity() {
        return this.zzoi;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    }

    public void onActivityDestroyed(Activity activity) {
        synchronized (this.zznh) {
            if (this.zzoi == null) {
                return;
            }
            if (this.zzoi.equals(activity)) {
                this.zzoi = null;
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        setActivity(activity);
    }

    public void onActivityResumed(Activity activity) {
        setActivity(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle savedInstanceState) {
    }

    public void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    public void onActivityStopped(Activity activity) {
    }
}
