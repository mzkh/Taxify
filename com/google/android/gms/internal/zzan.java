package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@zzgi
public class zzan extends Thread {
    private boolean mStarted;
    private final int zznW;
    private final int zznY;
    private final Object zznh;
    private boolean zzoj;
    private boolean zzok;
    private final zzam zzol;
    private final zzal zzom;
    private final zzgh zzon;
    private final int zzoo;
    private final int zzop;
    private final int zzoq;

    /* renamed from: com.google.android.gms.internal.zzan.1 */
    class C01871 implements Runnable {
        final /* synthetic */ View zzor;
        final /* synthetic */ zzan zzos;

        C01871(zzan com_google_android_gms_internal_zzan, View view) {
            this.zzos = com_google_android_gms_internal_zzan;
            this.zzor = view;
        }

        public void run() {
            this.zzos.zzg(this.zzor);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzan.2 */
    class C01892 implements Runnable {
        final /* synthetic */ zzan zzos;
        ValueCallback<String> zzot;
        final /* synthetic */ zzak zzou;
        final /* synthetic */ WebView zzov;

        /* renamed from: com.google.android.gms.internal.zzan.2.1 */
        class C01881 implements ValueCallback<String> {
            final /* synthetic */ C01892 zzow;

            C01881(C01892 c01892) {
                this.zzow = c01892;
            }

            public /* synthetic */ void onReceiveValue(Object x0) {
                zzk((String) x0);
            }

            public void zzk(String str) {
                this.zzow.zzos.zza(this.zzow.zzou, this.zzow.zzov, str);
            }
        }

        C01892(zzan com_google_android_gms_internal_zzan, zzak com_google_android_gms_internal_zzak, WebView webView) {
            this.zzos = com_google_android_gms_internal_zzan;
            this.zzou = com_google_android_gms_internal_zzak;
            this.zzov = webView;
            this.zzot = new C01881(this);
        }

        public void run() {
            if (this.zzov.getSettings().getJavaScriptEnabled()) {
                try {
                    this.zzov.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzot);
                } catch (Throwable th) {
                    this.zzot.onReceiveValue("");
                }
            }
        }
    }

    @zzgi
    class zza {
        final /* synthetic */ zzan zzos;
        final int zzox;
        final int zzoy;

        zza(zzan com_google_android_gms_internal_zzan, int i, int i2) {
            this.zzos = com_google_android_gms_internal_zzan;
            this.zzox = i;
            this.zzoy = i2;
        }
    }

    public zzan(zzam com_google_android_gms_internal_zzam, zzal com_google_android_gms_internal_zzal, zzgh com_google_android_gms_internal_zzgh) {
        this.mStarted = false;
        this.zzoj = false;
        this.zzok = false;
        this.zzol = com_google_android_gms_internal_zzam;
        this.zzom = com_google_android_gms_internal_zzal;
        this.zzon = com_google_android_gms_internal_zzgh;
        this.zznh = new Object();
        this.zznW = ((Integer) zzca.zzqC.get()).intValue();
        this.zzop = ((Integer) zzca.zzqD.get()).intValue();
        this.zznY = ((Integer) zzca.zzqE.get()).intValue();
        this.zzoq = ((Integer) zzca.zzqF.get()).intValue();
        this.zzoo = ((Integer) zzca.zzqG.get()).intValue();
        setName("ContentFetchTask");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r2 = this;
    L_0x0000:
        r0 = r2.zzok;
        if (r0 != 0) goto L_0x0051;
    L_0x0004:
        r0 = r2.zzbu();	 Catch:{ Throwable -> 0x0018 }
        if (r0 == 0) goto L_0x0043;
    L_0x000a:
        r0 = r2.zzol;	 Catch:{ Throwable -> 0x0018 }
        r0 = r0.getActivity();	 Catch:{ Throwable -> 0x0018 }
        if (r0 != 0) goto L_0x0037;
    L_0x0012:
        r0 = "ContentFetchThread: no activity";
        com.google.android.gms.internal.zzhx.zzY(r0);	 Catch:{ Throwable -> 0x0018 }
        goto L_0x0000;
    L_0x0018:
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.zzhx.zzb(r1, r0);
        r1 = r2.zzon;
        r1.zzb(r0);
    L_0x0023:
        r1 = r2.zznh;
        monitor-enter(r1);
    L_0x0026:
        r0 = r2.zzoj;	 Catch:{ all -> 0x004e }
        if (r0 == 0) goto L_0x004c;
    L_0x002a:
        r0 = "ContentFetchTask: waiting";
        com.google.android.gms.internal.zzhx.zzY(r0);	 Catch:{ InterruptedException -> 0x0035 }
        r0 = r2.zznh;	 Catch:{ InterruptedException -> 0x0035 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0035 }
        goto L_0x0026;
    L_0x0035:
        r0 = move-exception;
        goto L_0x0026;
    L_0x0037:
        r2.zza(r0);	 Catch:{ Throwable -> 0x0018 }
    L_0x003a:
        r0 = r2.zzoo;	 Catch:{ Throwable -> 0x0018 }
        r0 = r0 * 1000;
        r0 = (long) r0;	 Catch:{ Throwable -> 0x0018 }
        java.lang.Thread.sleep(r0);	 Catch:{ Throwable -> 0x0018 }
        goto L_0x0023;
    L_0x0043:
        r0 = "ContentFetchTask: sleeping";
        com.google.android.gms.internal.zzhx.zzY(r0);	 Catch:{ Throwable -> 0x0018 }
        r2.zzbw();	 Catch:{ Throwable -> 0x0018 }
        goto L_0x003a;
    L_0x004c:
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        goto L_0x0000;
    L_0x004e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        throw r0;
    L_0x0051:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzan.run():void");
    }

    public void wakeup() {
        synchronized (this.zznh) {
            this.zzoj = false;
            this.zznh.notifyAll();
            zzhx.zzY("ContentFetchThread: wakeup");
        }
    }

    zza zza(View view, zzak com_google_android_gms_internal_zzak) {
        int i = 0;
        if (view == null) {
            return new zza(this, 0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zza(this, 0, 0);
            }
            com_google_android_gms_internal_zzak.zzi(text.toString());
            return new zza(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzic)) {
            com_google_android_gms_internal_zzak.zzbp();
            return zza((WebView) view, com_google_android_gms_internal_zzak) ? new zza(this, 0, 1) : new zza(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new zza(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            while (i < viewGroup.getChildCount()) {
                zza zza = zza(viewGroup.getChildAt(i), com_google_android_gms_internal_zzak);
                i3 += zza.zzox;
                i2 += zza.zzoy;
                i++;
            }
            return new zza(this, i3, i2);
        }
    }

    void zza(Activity activity) {
        if (activity != null) {
            View view = null;
            if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                view = activity.getWindow().getDecorView().findViewById(16908290);
            }
            if (view != null) {
                zzf(view);
            }
        }
    }

    void zza(zzak com_google_android_gms_internal_zzak, WebView webView, String str) {
        com_google_android_gms_internal_zzak.zzbo();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (TextUtils.isEmpty(webView.getTitle())) {
                    com_google_android_gms_internal_zzak.zzh(optString);
                } else {
                    com_google_android_gms_internal_zzak.zzh(webView.getTitle() + "\n" + optString);
                }
            }
            if (com_google_android_gms_internal_zzak.zzbl()) {
                this.zzom.zzb(com_google_android_gms_internal_zzak);
            }
        } catch (JSONException e) {
            zzhx.zzY("Json string may be malformed.");
        } catch (Throwable th) {
            zzhx.zza("Failed to get webview content.", th);
            this.zzon.zzb(th);
        }
    }

    boolean zza(WebView webView, zzak com_google_android_gms_internal_zzak) {
        if (!zzme.zzkj()) {
            return false;
        }
        com_google_android_gms_internal_zzak.zzbp();
        webView.post(new C01892(this, com_google_android_gms_internal_zzak, webView));
        return true;
    }

    public void zzbt() {
        synchronized (this.zznh) {
            if (this.mStarted) {
                zzhx.zzY("Content hash thread already started, quiting...");
                return;
            }
            this.mStarted = true;
            start();
        }
    }

    boolean zzbu() {
        try {
            Context context = this.zzol.getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && zzk(context)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public zzak zzbv() {
        return this.zzom.zzbs();
    }

    public void zzbw() {
        synchronized (this.zznh) {
            this.zzoj = true;
            zzhx.zzY("ContentFetchThread: paused, mPause = " + this.zzoj);
        }
    }

    public boolean zzbx() {
        return this.zzoj;
    }

    boolean zzf(View view) {
        if (view == null) {
            return false;
        }
        view.post(new C01871(this, view));
        return true;
    }

    void zzg(View view) {
        try {
            zzak com_google_android_gms_internal_zzak = new zzak(this.zznW, this.zzop, this.zznY, this.zzoq);
            zza zza = zza(view, com_google_android_gms_internal_zzak);
            com_google_android_gms_internal_zzak.zzbq();
            if (zza.zzox != 0 || zza.zzoy != 0) {
                if (zza.zzoy != 0 || com_google_android_gms_internal_zzak.zzbr() != 0) {
                    if (zza.zzoy != 0 || !this.zzom.zza(com_google_android_gms_internal_zzak)) {
                        this.zzom.zzc(com_google_android_gms_internal_zzak);
                    }
                }
            }
        } catch (Throwable e) {
            zzhx.zzb("Exception in fetchContentOnUIThread", e);
            this.zzon.zzb(e);
        }
    }

    boolean zzk(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null ? false : powerManager.isScreenOn();
    }
}
