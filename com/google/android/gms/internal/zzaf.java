package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.internal.zzia.zza;
import com.google.android.gms.internal.zzia.zzd;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgi
public class zzaf implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean zzmJ;
    private boolean zznA;
    private boolean zznB;
    private BroadcastReceiver zznC;
    private final HashSet<zzac> zznD;
    private final zzcv zznE;
    private final zzcv zznF;
    private final zzcv zznG;
    private final Object zznh;
    private final Context zznk;
    private final WeakReference<zzhe> zznn;
    private WeakReference<ViewTreeObserver> zzno;
    private final WeakReference<View> zznp;
    private final zzad zznq;
    private final zzdf zznr;
    private final zzia<zzah> zzns;
    private boolean zznt;
    private final WindowManager zznu;
    private final PowerManager zznv;
    private final KeyguardManager zznw;
    private zzag zznx;
    private boolean zzny;
    private long zznz;

    /* renamed from: com.google.android.gms.internal.zzaf.6 */
    class C01816 extends BroadcastReceiver {
        final /* synthetic */ zzaf zznI;

        C01816(zzaf com_google_android_gms_internal_zzaf) {
            this.zznI = com_google_android_gms_internal_zzaf;
        }

        public void onReceive(Context context, Intent intent) {
            this.zznI.zzh(false);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaf.10 */
    class AnonymousClass10 implements zzd<zzah> {
        final /* synthetic */ zzaf zznI;
        final /* synthetic */ JSONObject zznJ;

        AnonymousClass10(zzaf com_google_android_gms_internal_zzaf, JSONObject jSONObject) {
            this.zznI = com_google_android_gms_internal_zzaf;
            this.zznJ = jSONObject;
        }

        public /* synthetic */ void zza(Object obj) {
            zzb((zzah) obj);
        }

        public void zzb(zzah com_google_android_gms_internal_zzah) {
            com_google_android_gms_internal_zzah.zza("AFMA_updateActiveView", this.zznJ);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaf.1 */
    class C03761 implements zzd<zzah> {
        final /* synthetic */ JSONObject zznH;
        final /* synthetic */ zzaf zznI;

        C03761(zzaf com_google_android_gms_internal_zzaf, JSONObject jSONObject) {
            this.zznI = com_google_android_gms_internal_zzaf;
            this.zznH = jSONObject;
        }

        public /* synthetic */ void zza(Object obj) {
            zzb((zzah) obj);
        }

        public void zzb(zzah com_google_android_gms_internal_zzah) {
            this.zznI.zza(this.zznH);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaf.2 */
    class C03772 implements zza {
        final /* synthetic */ zzaf zznI;

        C03772(zzaf com_google_android_gms_internal_zzaf) {
            this.zznI = com_google_android_gms_internal_zzaf;
        }

        public void run() {
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaf.3 */
    class C03783 implements zza {
        final /* synthetic */ zzaf zznI;

        C03783(zzaf com_google_android_gms_internal_zzaf) {
            this.zznI = com_google_android_gms_internal_zzaf;
        }

        public void run() {
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaf.4 */
    class C03794 implements zzd<zzah> {
        final /* synthetic */ zzaf zznI;

        C03794(zzaf com_google_android_gms_internal_zzaf) {
            this.zznI = com_google_android_gms_internal_zzaf;
        }

        public /* synthetic */ void zza(Object obj) {
            zzb((zzah) obj);
        }

        public void zzb(zzah com_google_android_gms_internal_zzah) {
            this.zznI.zznt = true;
            this.zznI.zza(com_google_android_gms_internal_zzah);
            this.zznI.zzbb();
            this.zznI.zzh(false);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaf.5 */
    class C03805 implements zza {
        final /* synthetic */ zzaf zznI;

        C03805(zzaf com_google_android_gms_internal_zzaf) {
            this.zznI = com_google_android_gms_internal_zzaf;
        }

        public void run() {
            this.zznI.destroy();
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaf.7 */
    class C03817 implements zzcv {
        final /* synthetic */ zzaf zznI;

        C03817(zzaf com_google_android_gms_internal_zzaf) {
            this.zznI = com_google_android_gms_internal_zzaf;
        }

        public void zza(zzic com_google_android_gms_internal_zzic, Map<String, String> map) {
            if (this.zznI.zza((Map) map)) {
                this.zznI.zza(com_google_android_gms_internal_zzic.getWebView(), (Map) map);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaf.8 */
    class C03828 implements zzcv {
        final /* synthetic */ zzaf zznI;

        C03828(zzaf com_google_android_gms_internal_zzaf) {
            this.zznI = com_google_android_gms_internal_zzaf;
        }

        public void zza(zzic com_google_android_gms_internal_zzic, Map<String, String> map) {
            if (this.zznI.zza((Map) map)) {
                zzhx.zzY("Received request to untrack: " + this.zznI.zznq.zzaZ());
                this.zznI.destroy();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaf.9 */
    class C03839 implements zzcv {
        final /* synthetic */ zzaf zznI;

        C03839(zzaf com_google_android_gms_internal_zzaf) {
            this.zznI = com_google_android_gms_internal_zzaf;
        }

        public void zza(zzic com_google_android_gms_internal_zzic, Map<String, String> map) {
            if (this.zznI.zza((Map) map) && map.containsKey("isVisible")) {
                boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
                this.zznI.zzg(Boolean.valueOf(z).booleanValue());
            }
        }
    }

    public zzaf(zzba com_google_android_gms_internal_zzba, zzhe com_google_android_gms_internal_zzhe, zzhy com_google_android_gms_internal_zzhy, View view, zzdf com_google_android_gms_internal_zzdf) {
        this.zznh = new Object();
        this.zzmJ = false;
        this.zzny = false;
        this.zznz = Long.MIN_VALUE;
        this.zznD = new HashSet();
        this.zznE = new C03817(this);
        this.zznF = new C03828(this);
        this.zznG = new C03839(this);
        this.zznr = com_google_android_gms_internal_zzdf;
        this.zznn = new WeakReference(com_google_android_gms_internal_zzhe);
        this.zznp = new WeakReference(view);
        this.zzno = new WeakReference(null);
        this.zznA = true;
        this.zznq = new zzad(UUID.randomUUID().toString(), com_google_android_gms_internal_zzhy, com_google_android_gms_internal_zzba.zzpa, com_google_android_gms_internal_zzhe.zzys, com_google_android_gms_internal_zzhe.zzba());
        this.zzns = this.zznr.zzcJ();
        this.zznu = (WindowManager) view.getContext().getSystemService("window");
        this.zznv = (PowerManager) view.getContext().getApplicationContext().getSystemService("power");
        this.zznw = (KeyguardManager) view.getContext().getSystemService("keyguard");
        this.zznk = view.getContext().getApplicationContext();
        try {
            this.zzns.zza(new C03761(this, zzd(view)), new C03783(this));
        } catch (JSONException e) {
        } catch (Throwable e2) {
            zzhx.zzb("Failure while processing active view data.", e2);
        }
        this.zzns.zza(new C03794(this), new C03805(this));
        zzhx.zzY("Tracking ad unit: " + this.zznq.zzaZ());
    }

    protected void destroy() {
        synchronized (this.zznh) {
            zzbh();
            zzbc();
            this.zznA = false;
            zzbe();
            this.zznr.zzb(this.zzns);
        }
    }

    public void onGlobalLayout() {
        zzh(false);
    }

    public void onScrollChanged() {
        zzh(true);
    }

    public void pause() {
        synchronized (this.zznh) {
            this.zzmJ = true;
            zzh(false);
        }
    }

    public void resume() {
        synchronized (this.zznh) {
            this.zzmJ = false;
            zzh(false);
        }
    }

    public void stop() {
        synchronized (this.zznh) {
            this.zzny = true;
            zzh(false);
        }
    }

    protected int zza(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    protected void zza(View view, Map<String, String> map) {
        zzh(false);
    }

    public void zza(zzac com_google_android_gms_internal_zzac) {
        this.zznD.add(com_google_android_gms_internal_zzac);
    }

    public void zza(zzag com_google_android_gms_internal_zzag) {
        synchronized (this.zznh) {
            this.zznx = com_google_android_gms_internal_zzag;
        }
    }

    protected void zza(zzah com_google_android_gms_internal_zzah) {
        com_google_android_gms_internal_zzah.zza("/updateActiveView", this.zznE);
        com_google_android_gms_internal_zzah.zza("/untrackActiveViewUnit", this.zznF);
        com_google_android_gms_internal_zzah.zza("/visibilityChanged", this.zznG);
    }

    protected void zza(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONArray.put(jSONObject);
            jSONObject2.put("units", jSONArray);
            this.zzns.zza(new AnonymousClass10(this, jSONObject2), new C03772(this));
        } catch (Throwable th) {
            zzhx.zzb("Skipping active view message.", th);
        }
    }

    protected boolean zza(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        boolean z = !TextUtils.isEmpty(str) && str.equals(this.zznq.zzaZ());
        return z;
    }

    protected void zzbb() {
        synchronized (this.zznh) {
            if (this.zznC != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.zznC = new C01816(this);
            this.zznk.registerReceiver(this.zznC, intentFilter);
        }
    }

    protected void zzbc() {
        synchronized (this.zznh) {
            if (this.zznC != null) {
                this.zznk.unregisterReceiver(this.zznC);
                this.zznC = null;
            }
        }
    }

    public void zzbd() {
        synchronized (this.zznh) {
            if (this.zznA) {
                this.zznB = true;
                try {
                    zza(zzbj());
                } catch (Throwable e) {
                    zzhx.zzb("JSON failure while processing active view data.", e);
                } catch (Throwable e2) {
                    zzhx.zzb("Failure while processing active view data.", e2);
                }
                zzhx.zzY("Untracking ad unit: " + this.zznq.zzaZ());
            }
        }
    }

    protected void zzbe() {
        if (this.zznx != null) {
            this.zznx.zza(this);
        }
    }

    public boolean zzbf() {
        boolean z;
        synchronized (this.zznh) {
            z = this.zznA;
        }
        return z;
    }

    protected void zzbg() {
        View view = (View) this.zznp.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzno.get();
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2 != viewTreeObserver) {
                this.zzno = new WeakReference(viewTreeObserver2);
                viewTreeObserver2.addOnScrollChangedListener(this);
                viewTreeObserver2.addOnGlobalLayoutListener(this);
            }
        }
    }

    protected void zzbh() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzno.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    protected JSONObject zzbi() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.zznq.zzaX()).put("activeViewJSON", this.zznq.zzaY()).put("timestamp", zzab.zzaQ().elapsedRealtime()).put("adFormat", this.zznq.zzaW()).put("hashCode", this.zznq.zzaZ()).put("isMraid", this.zznq.zzba());
        return jSONObject;
    }

    protected JSONObject zzbj() throws JSONException {
        JSONObject zzbi = zzbi();
        zzbi.put("doneReasonCode", "u");
        return zzbi;
    }

    protected JSONObject zzd(View view) throws JSONException {
        boolean zzi = zzab.zzaO().zzi(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Throwable e) {
            zzhx.zzb("Failure getting view location.", e);
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.zznu.getDefaultDisplay().getWidth();
        rect2.bottom = this.zznu.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, null);
        Rect rect4 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect4);
        Rect rect5 = new Rect();
        view.getHitRect(rect5);
        JSONObject zzbi = zzbi();
        zzbi.put("windowVisibility", view.getWindowVisibility()).put("isStopped", this.zzny).put("isPaused", this.zzmJ).put("isAttachedToWindow", zzi).put("viewBox", new JSONObject().put("top", zza(rect2.top, displayMetrics)).put("bottom", zza(rect2.bottom, displayMetrics)).put("left", zza(rect2.left, displayMetrics)).put("right", zza(rect2.right, displayMetrics))).put("adBox", new JSONObject().put("top", zza(rect.top, displayMetrics)).put("bottom", zza(rect.bottom, displayMetrics)).put("left", zza(rect.left, displayMetrics)).put("right", zza(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put("top", zza(rect3.top, displayMetrics)).put("bottom", zza(rect3.bottom, displayMetrics)).put("left", zza(rect3.left, displayMetrics)).put("right", zza(rect3.right, displayMetrics))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", zza(rect4.top, displayMetrics)).put("bottom", zza(rect4.bottom, displayMetrics)).put("left", zza(rect4.left, displayMetrics)).put("right", zza(rect4.right, displayMetrics))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", zza(rect5.top, displayMetrics)).put("bottom", zza(rect5.bottom, displayMetrics)).put("left", zza(rect5.left, displayMetrics)).put("right", zza(rect5.right, displayMetrics))).put("screenDensity", (double) displayMetrics.density).put("isVisible", zze(view));
        return zzbi;
    }

    protected boolean zze(View view) {
        return view.getVisibility() == 0 && view.isShown() && this.zznv.isScreenOn() && (!this.zznw.inKeyguardRestrictedInputMode() || zzab.zzaM().zzes());
    }

    protected void zzg(boolean z) {
        Iterator it = this.zznD.iterator();
        while (it.hasNext()) {
            ((zzac) it.next()).zza(this, z);
        }
    }

    protected void zzh(boolean z) {
        synchronized (this.zznh) {
            if (this.zznt && this.zznA) {
                long elapsedRealtime = zzab.zzaQ().elapsedRealtime();
                if (!z || this.zznz + 200 <= elapsedRealtime) {
                    this.zznz = elapsedRealtime;
                    View view = (View) this.zznp.get();
                    Object obj = (view == null || ((zzhe) this.zznn.get()) == null) ? 1 : null;
                    if (obj != null) {
                        zzbd();
                        return;
                    }
                    try {
                        zza(zzd(view));
                    } catch (Throwable e) {
                        zzhx.zza("Active view update failed.", e);
                    } catch (Throwable e2) {
                        zzhx.zza("Active view update failed.", e2);
                    }
                    zzbg();
                    zzbe();
                    return;
                }
                return;
            }
        }
    }
}
