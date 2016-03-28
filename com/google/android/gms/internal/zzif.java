package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.drive.DriveFile;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzgi
public class zzif extends WebView implements OnGlobalLayoutListener, DownloadListener, zzic {
    private final zza zzAa;
    private zzel zzAb;
    private boolean zzAc;
    private boolean zzAd;
    private boolean zzAe;
    private boolean zzAf;
    private boolean zzAg;
    private int zzAh;
    boolean zzAi;
    private final Object zznh;
    private final zzhy zznl;
    private final WindowManager zznu;
    private zzba zzsF;
    private int zztI;
    private int zztJ;
    private int zztL;
    private int zztM;
    private final zzid zzvy;
    private final zzk zzwg;
    private Boolean zzyV;

    @zzgi
    public static class zza extends MutableContextWrapper {
        private Activity zzAj;
        private Context zzAk;
        private Context zznk;

        public zza(Context context) {
            super(context);
            setBaseContext(context);
        }

        public Object getSystemService(String service) {
            return this.zzAk.getSystemService(service);
        }

        public void setBaseContext(Context base) {
            this.zznk = base.getApplicationContext();
            this.zzAj = base instanceof Activity ? (Activity) base : null;
            this.zzAk = base;
            super.setBaseContext(this.zznk);
        }

        public void startActivity(Intent intent) {
            if (this.zzAj == null || zzme.zzkk()) {
                intent.setFlags(DriveFile.MODE_READ_ONLY);
                this.zznk.startActivity(intent);
                return;
            }
            this.zzAj.startActivity(intent);
        }

        public Activity zzeD() {
            return this.zzAj;
        }

        public Context zzeE() {
            return this.zzAk;
        }
    }

    protected zzif(zza com_google_android_gms_internal_zzif_zza, zzba com_google_android_gms_internal_zzba, boolean z, boolean z2, zzk com_google_android_gms_internal_zzk, zzhy com_google_android_gms_internal_zzhy) {
        super(com_google_android_gms_internal_zzif_zza);
        this.zznh = new Object();
        this.zztJ = -1;
        this.zztI = -1;
        this.zztL = -1;
        this.zztM = -1;
        this.zzAa = com_google_android_gms_internal_zzif_zza;
        this.zzsF = com_google_android_gms_internal_zzba;
        this.zzAe = z;
        this.zzAg = false;
        this.zzAh = -1;
        this.zzwg = com_google_android_gms_internal_zzk;
        this.zznl = com_google_android_gms_internal_zzhy;
        this.zznu = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        zzab.zzaM().zza((Context) com_google_android_gms_internal_zzif_zza, com_google_android_gms_internal_zzhy.zzzH, settings);
        zzab.zzaO().zza(getContext(), settings);
        setDownloadListener(this);
        this.zzvy = zzab.zzaO().zzb((zzic) this, z2);
        setWebViewClient(this.zzvy);
        setWebChromeClient(zzab.zzaO().zzb((zzic) this));
        zzeW();
    }

    static zzif zzb(Context context, zzba com_google_android_gms_internal_zzba, boolean z, boolean z2, zzk com_google_android_gms_internal_zzk, zzhy com_google_android_gms_internal_zzhy) {
        return new zzif(new zza(context), com_google_android_gms_internal_zzba, z, z2, com_google_android_gms_internal_zzk, com_google_android_gms_internal_zzhy);
    }

    private void zzeT() {
        synchronized (this.zznh) {
            this.zzyV = zzab.zzaP().zzek();
            if (this.zzyV == null) {
                try {
                    evaluateJavascript("(function(){})()", null);
                    zzb(Boolean.valueOf(true));
                } catch (IllegalStateException e) {
                    zzb(Boolean.valueOf(false));
                }
            }
        }
    }

    private void zzeU() {
        Activity zzeD = zzeD();
        if (this.zzAg && zzeD != null) {
            zzab.zzaO().zzb(zzeD, (OnGlobalLayoutListener) this);
            this.zzAg = false;
        }
    }

    private void zzeW() {
        synchronized (this.zznh) {
            if (this.zzAe || this.zzsF.zzpb) {
                if (VERSION.SDK_INT < 14) {
                    zzhx.zzY("Disabling hardware acceleration on an overlay.");
                    zzeX();
                } else {
                    zzhx.zzY("Enabling hardware acceleration on an overlay.");
                    zzeY();
                }
            } else if (VERSION.SDK_INT < 18) {
                zzhx.zzY("Disabling hardware acceleration on an AdView.");
                zzeX();
            } else {
                zzhx.zzY("Enabling hardware acceleration on an AdView.");
                zzeY();
            }
        }
    }

    private void zzeX() {
        synchronized (this.zznh) {
            if (!this.zzAf) {
                zzab.zzaO().zzk(this);
            }
            this.zzAf = true;
        }
    }

    private void zzeY() {
        synchronized (this.zznh) {
            if (this.zzAf) {
                zzab.zzaO().zzj(this);
            }
            this.zzAf = false;
        }
    }

    public void destroy() {
        synchronized (this.zznh) {
            zzeU();
            if (this.zzAb != null) {
                this.zzAb.close();
                this.zzAb.onDestroy();
                this.zzAb = null;
            }
            this.zzvy.reset();
            if (this.zzAd) {
                return;
            }
            this.zzAd = true;
            super.destroy();
        }
    }

    public void evaluateJavascript(String script, ValueCallback<String> resultCallback) {
        synchronized (this.zznh) {
            if (isDestroyed()) {
                zzhx.zzac("The webview is destroyed. Ignoring action.");
                if (resultCallback != null) {
                    resultCallback.onReceiveValue(null);
                }
                return;
            }
            super.evaluateJavascript(script, resultCallback);
        }
    }

    public int getRequestedOrientation() {
        int i;
        synchronized (this.zznh) {
            i = this.zzAh;
        }
        return i;
    }

    public WebView getWebView() {
        return this;
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.zznh) {
            z = this.zzAd;
        }
        return z;
    }

    public void loadData(String data, String mimeType, String encoding) {
        synchronized (this.zznh) {
            if (isDestroyed()) {
                zzhx.zzac("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(data, mimeType, encoding);
            }
        }
    }

    public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        synchronized (this.zznh) {
            if (isDestroyed()) {
                zzhx.zzac("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
            }
        }
    }

    protected void onAttachedToWindow() {
        synchronized (this.zznh) {
            super.onAttachedToWindow();
            this.zzAi = true;
            if (this.zzvy.zzba()) {
                zzeV();
            }
        }
    }

    protected void onDetachedFromWindow() {
        synchronized (this.zznh) {
            zzeU();
            this.zzAi = false;
            super.onDetachedFromWindow();
        }
    }

    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimeType, long size) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(url), mimeType);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            zzhx.zzY("Couldn't find an Activity to view url/mimetype: " + url + " / " + mimeType);
        }
    }

    protected void onDraw(Canvas canvas) {
        if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
        }
    }

    public void onGlobalLayout() {
        boolean zzeS = zzeS();
        zzel zzeF = zzeF();
        if (zzeF != null && zzeS) {
            zzeF.zzdg();
        }
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        synchronized (this.zznh) {
            if (isInEditMode() || this.zzAe) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            } else if (this.zzsF.zzpb) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.zznu.getDefaultDisplay().getMetrics(displayMetrics);
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                int mode = MeasureSpec.getMode(widthMeasureSpec);
                int size = MeasureSpec.getSize(widthMeasureSpec);
                int mode2 = MeasureSpec.getMode(heightMeasureSpec);
                int size2 = MeasureSpec.getSize(heightMeasureSpec);
                mode = (mode == ExploreByTouchHelper.INVALID_ID || mode == 1073741824) ? size : Integer.MAX_VALUE;
                if (mode2 == ExploreByTouchHelper.INVALID_ID || mode2 == 1073741824) {
                    i = size2;
                }
                if (this.zzsF.widthPixels > mode || this.zzsF.heightPixels > r0) {
                    float f = this.zzAa.getResources().getDisplayMetrics().density;
                    zzhx.zzac("Not enough space to show ad. Needs " + ((int) (((float) this.zzsF.widthPixels) / f)) + "x" + ((int) (((float) this.zzsF.heightPixels) / f)) + " dp, but only has " + ((int) (((float) size) / f)) + "x" + ((int) (((float) size2) / f)) + " dp.");
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                } else {
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    setMeasuredDimension(this.zzsF.widthPixels, this.zzsF.heightPixels);
                }
            }
        }
    }

    public void onPause() {
        if (!isDestroyed()) {
            try {
                super.onPause();
            } catch (Throwable e) {
                zzhx.zzb("Could not pause webview.", e);
            }
        }
    }

    public void onResume() {
        if (!isDestroyed()) {
            try {
                super.onResume();
            } catch (Throwable e) {
                zzhx.zzb("Could not resume webview.", e);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (this.zzwg != null) {
            this.zzwg.zza(event);
        }
        return super.onTouchEvent(event);
    }

    public void setContext(Context context) {
        this.zzAa.setBaseContext(context);
    }

    public void setRequestedOrientation(int requestedOrientation) {
        synchronized (this.zznh) {
            this.zzAh = requestedOrientation;
            if (this.zzAb != null) {
                this.zzAb.setRequestedOrientation(this.zzAh);
            }
        }
    }

    public void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Throwable e) {
                zzhx.zzb("Could not stop loading webview.", e);
            }
        }
    }

    public void zzA(boolean z) {
        synchronized (this.zznh) {
            this.zzAe = z;
            zzeW();
        }
    }

    public void zzB(boolean z) {
        synchronized (this.zznh) {
            if (this.zzAb != null) {
                this.zzAb.zza(this.zzvy.zzba(), z);
            } else {
                this.zzAc = z;
            }
        }
    }

    public void zza(Context context, zzba com_google_android_gms_internal_zzba) {
        synchronized (this.zznh) {
            zzeU();
            setContext(context);
            this.zzAb = null;
            this.zzsF = com_google_android_gms_internal_zzba;
            this.zzAe = false;
            this.zzAc = false;
            this.zzAh = -1;
            zzab.zzaO().zzb((WebView) this);
            loadUrl("about:blank");
            this.zzvy.reset();
            setOnTouchListener(null);
            setOnClickListener(null);
        }
    }

    public void zza(zzba com_google_android_gms_internal_zzba) {
        synchronized (this.zznh) {
            this.zzsF = com_google_android_gms_internal_zzba;
            requestLayout();
        }
    }

    public void zza(zzel com_google_android_gms_internal_zzel) {
        synchronized (this.zznh) {
            this.zzAb = com_google_android_gms_internal_zzel;
        }
    }

    protected void zza(String str, ValueCallback<String> valueCallback) {
        synchronized (this.zznh) {
            if (isDestroyed()) {
                zzhx.zzac("The webview is destroyed. Ignoring action.");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                evaluateJavascript(str, valueCallback);
            }
        }
    }

    public void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzb(str, jSONObject.toString());
    }

    public zzba zzad() {
        zzba com_google_android_gms_internal_zzba;
        synchronized (this.zznh) {
            com_google_android_gms_internal_zzba = this.zzsF;
        }
        return com_google_android_gms_internal_zzba;
    }

    protected void zzad(String str) {
        synchronized (this.zznh) {
            if (isDestroyed()) {
                zzhx.zzac("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    protected void zzae(String str) {
        if (zzme.zzkj()) {
            if (zzek() == null) {
                zzeT();
            }
            if (zzek().booleanValue()) {
                zza(str, null);
                return;
            } else {
                zzad("javascript:" + str);
                return;
            }
        }
        zzad("javascript:" + str);
    }

    void zzb(Boolean bool) {
        this.zzyV = bool;
        zzab.zzaP().zzb(bool);
    }

    public void zzb(String str, String str2) {
        zzae(str + "(" + str2 + ");");
    }

    public void zzb(String str, Map<String, ?> map) {
        try {
            zzb(str, zzab.zzaM().zzw((Map) map));
        } catch (JSONException e) {
            zzhx.zzac("Could not convert parameters to JSON.");
        }
    }

    public void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AFMA_ReceiveMessage('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        zzhx.zzab("Dispatching AFMA event: " + stringBuilder.toString());
        zzae(stringBuilder.toString());
    }

    public void zzdh() {
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.zznl.zzzH);
        zzb("onshow", hashMap);
    }

    public Activity zzeD() {
        return this.zzAa.zzeD();
    }

    public Context zzeE() {
        return this.zzAa.zzeE();
    }

    public zzel zzeF() {
        zzel com_google_android_gms_internal_zzel;
        synchronized (this.zznh) {
            com_google_android_gms_internal_zzel = this.zzAb;
        }
        return com_google_android_gms_internal_zzel;
    }

    public zzid zzeG() {
        return this.zzvy;
    }

    public boolean zzeH() {
        return this.zzAc;
    }

    public zzk zzeI() {
        return this.zzwg;
    }

    public zzhy zzeJ() {
        return this.zznl;
    }

    public boolean zzeK() {
        boolean z;
        synchronized (this.zznh) {
            z = this.zzAe;
        }
        return z;
    }

    public void zzeL() {
        synchronized (this.zznh) {
            zzeV();
        }
    }

    public boolean zzeS() {
        if (!zzeG().zzba()) {
            return false;
        }
        int i;
        int i2;
        DisplayMetrics zza = zzab.zzaM().zza(this.zznu);
        int zzb = zzbe.zzbD().zzb(zza, zza.widthPixels);
        int zzb2 = zzbe.zzbD().zzb(zza, zza.heightPixels);
        Activity zzeD = zzeD();
        if (zzeD == null || zzeD.getWindow() == null) {
            i = zzb2;
            i2 = zzb;
        } else {
            int[] zzg = zzab.zzaM().zzg(zzeD);
            i2 = zzbe.zzbD().zzb(zza, zzg[0]);
            i = zzbe.zzbD().zzb(zza, zzg[1]);
        }
        if (this.zztI == zzb && this.zztJ == zzb2 && this.zztL == i2 && this.zztM == i) {
            return false;
        }
        boolean z = (this.zztI == zzb && this.zztJ == zzb2) ? false : true;
        this.zztI = zzb;
        this.zztJ = zzb2;
        this.zztL = i2;
        this.zztM = i;
        new zzeg(this).zza(zzb, zzb2, i2, i, zza.density, this.zznu.getDefaultDisplay().getRotation());
        return z;
    }

    void zzeV() {
        Activity zzeD = zzeD();
        if (!this.zzAg && zzeD != null && this.zzAi) {
            zzab.zzaM().zza(zzeD, (OnGlobalLayoutListener) this);
            this.zzAg = true;
        }
    }

    Boolean zzek() {
        Boolean bool;
        synchronized (this.zznh) {
            bool = this.zzyV;
        }
        return bool;
    }

    public void zzp(int i) {
        Map hashMap = new HashMap(1);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zznl.zzzH);
        zzb("onhide", hashMap);
    }
}
