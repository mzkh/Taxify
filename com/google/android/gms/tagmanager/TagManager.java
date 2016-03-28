package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager {
    private static TagManager zzaAS;
    private final Context mContext;
    private final zza zzaAP;
    private final zzcs zzaAQ;
    private final ConcurrentMap<zzn, Boolean> zzaAR;
    private final DataLayer zzaxx;
    private final zzr zzazO;

    /* renamed from: com.google.android.gms.tagmanager.TagManager.3 */
    class C02813 implements ComponentCallbacks2 {
        final /* synthetic */ TagManager zzaAT;

        C02813(TagManager tagManager) {
            this.zzaAT = tagManager;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i == 20) {
                this.zzaAT.dispatch();
            }
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.TagManager.4 */
    static /* synthetic */ class C02824 {
        static final /* synthetic */ int[] zzaAU;

        static {
            zzaAU = new int[zza.values().length];
            try {
                zzaAU[zza.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                zzaAU[zza.CONTAINER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                zzaAU[zza.CONTAINER_DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public interface zza {
        zzo zza(Context context, TagManager tagManager, Looper looper, String str, int i, zzr com_google_android_gms_tagmanager_zzr);
    }

    /* renamed from: com.google.android.gms.tagmanager.TagManager.1 */
    class C04441 implements zzb {
        final /* synthetic */ TagManager zzaAT;

        C04441(TagManager tagManager) {
            this.zzaAT = tagManager;
        }

        public void zzI(Map<String, Object> map) {
            Object obj = map.get(DataLayer.EVENT_KEY);
            if (obj != null) {
                this.zzaAT.zzdk(obj.toString());
            }
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.TagManager.2 */
    static class C04452 implements zza {
        C04452() {
        }

        public zzo zza(Context context, TagManager tagManager, Looper looper, String str, int i, zzr com_google_android_gms_tagmanager_zzr) {
            return new zzo(context, tagManager, looper, str, i, com_google_android_gms_tagmanager_zzr);
        }
    }

    TagManager(Context context, zza containerHolderLoaderProvider, DataLayer dataLayer, zzcs serviceManager) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.mContext = context.getApplicationContext();
        this.zzaAQ = serviceManager;
        this.zzaAP = containerHolderLoaderProvider;
        this.zzaAR = new ConcurrentHashMap();
        this.zzaxx = dataLayer;
        this.zzaxx.zza(new C04441(this));
        this.zzaxx.zza(new zzd(this.mContext));
        this.zzazO = new zzr();
        zztT();
    }

    public static TagManager getInstance(Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            if (zzaAS == null) {
                if (context == null) {
                    zzbf.zzZ("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                zzaAS = new TagManager(context, new C04452(), new DataLayer(new zzv(context)), zzct.zztR());
            }
            tagManager = zzaAS;
        }
        return tagManager;
    }

    private void zzdk(String str) {
        for (zzn zzcO : this.zzaAR.keySet()) {
            zzcO.zzcO(str);
        }
    }

    private void zztT() {
        if (VERSION.SDK_INT >= 14) {
            this.mContext.registerComponentCallbacks(new C02813(this));
        }
    }

    public void dispatch() {
        this.zzaAQ.dispatch();
    }

    public DataLayer getDataLayer() {
        return this.zzaxx;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String containerId, int defaultContainerResourceId) {
        PendingResult zza = this.zzaAP.zza(this.mContext, this, null, containerId, defaultContainerResourceId, this.zzazO);
        zza.zzsN();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String containerId, int defaultContainerResourceId, Handler handler) {
        PendingResult zza = this.zzaAP.zza(this.mContext, this, handler.getLooper(), containerId, defaultContainerResourceId, this.zzazO);
        zza.zzsN();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String containerId, int defaultContainerResourceId) {
        PendingResult zza = this.zzaAP.zza(this.mContext, this, null, containerId, defaultContainerResourceId, this.zzazO);
        zza.zzsP();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String containerId, int defaultContainerResourceId, Handler handler) {
        PendingResult zza = this.zzaAP.zza(this.mContext, this, handler.getLooper(), containerId, defaultContainerResourceId, this.zzazO);
        zza.zzsP();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String containerId, int defaultContainerResourceId) {
        PendingResult zza = this.zzaAP.zza(this.mContext, this, null, containerId, defaultContainerResourceId, this.zzazO);
        zza.zzsO();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String containerId, int defaultContainerResourceId, Handler handler) {
        PendingResult zza = this.zzaAP.zza(this.mContext, this, handler.getLooper(), containerId, defaultContainerResourceId, this.zzazO);
        zza.zzsO();
        return zza;
    }

    public void setVerboseLoggingEnabled(boolean enableVerboseLogging) {
        zzbf.setLogLevel(enableVerboseLogging ? 2 : 5);
    }

    void zza(zzn com_google_android_gms_tagmanager_zzn) {
        this.zzaAR.put(com_google_android_gms_tagmanager_zzn, Boolean.valueOf(true));
    }

    boolean zzb(zzn com_google_android_gms_tagmanager_zzn) {
        return this.zzaAR.remove(com_google_android_gms_tagmanager_zzn) != null;
    }

    public PendingResult<ContainerHolder> zzc(String str, int i, String str2) {
        PendingResult zza = this.zzaAP.zza(this.mContext, this, null, str, i, this.zzazO);
        zza.load(str2);
        return zza;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    synchronized boolean zzl(android.net.Uri r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r1 = com.google.android.gms.tagmanager.zzca.zztx();	 Catch:{ all -> 0x0049 }
        r0 = r1.zzl(r6);	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x0085;
    L_0x000b:
        r2 = r1.getContainerId();	 Catch:{ all -> 0x0049 }
        r0 = com.google.android.gms.tagmanager.TagManager.C02824.zzaAU;	 Catch:{ all -> 0x0049 }
        r3 = r1.zzty();	 Catch:{ all -> 0x0049 }
        r3 = r3.ordinal();	 Catch:{ all -> 0x0049 }
        r0 = r0[r3];	 Catch:{ all -> 0x0049 }
        switch(r0) {
            case 1: goto L_0x0021;
            case 2: goto L_0x004c;
            case 3: goto L_0x004c;
            default: goto L_0x001e;
        };
    L_0x001e:
        r0 = 1;
    L_0x001f:
        monitor-exit(r5);
        return r0;
    L_0x0021:
        r0 = r5.zzaAR;	 Catch:{ all -> 0x0049 }
        r0 = r0.keySet();	 Catch:{ all -> 0x0049 }
        r1 = r0.iterator();	 Catch:{ all -> 0x0049 }
    L_0x002b:
        r0 = r1.hasNext();	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x001e;
    L_0x0031:
        r0 = r1.next();	 Catch:{ all -> 0x0049 }
        r0 = (com.google.android.gms.tagmanager.zzn) r0;	 Catch:{ all -> 0x0049 }
        r3 = r0.getContainerId();	 Catch:{ all -> 0x0049 }
        r3 = r3.equals(r2);	 Catch:{ all -> 0x0049 }
        if (r3 == 0) goto L_0x002b;
    L_0x0041:
        r3 = 0;
        r0.zzcQ(r3);	 Catch:{ all -> 0x0049 }
        r0.refresh();	 Catch:{ all -> 0x0049 }
        goto L_0x002b;
    L_0x0049:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x004c:
        r0 = r5.zzaAR;	 Catch:{ all -> 0x0049 }
        r0 = r0.keySet();	 Catch:{ all -> 0x0049 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0049 }
    L_0x0056:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x001e;
    L_0x005c:
        r0 = r3.next();	 Catch:{ all -> 0x0049 }
        r0 = (com.google.android.gms.tagmanager.zzn) r0;	 Catch:{ all -> 0x0049 }
        r4 = r0.getContainerId();	 Catch:{ all -> 0x0049 }
        r4 = r4.equals(r2);	 Catch:{ all -> 0x0049 }
        if (r4 == 0) goto L_0x0077;
    L_0x006c:
        r4 = r1.zztz();	 Catch:{ all -> 0x0049 }
        r0.zzcQ(r4);	 Catch:{ all -> 0x0049 }
        r0.refresh();	 Catch:{ all -> 0x0049 }
        goto L_0x0056;
    L_0x0077:
        r4 = r0.zzsK();	 Catch:{ all -> 0x0049 }
        if (r4 == 0) goto L_0x0056;
    L_0x007d:
        r4 = 0;
        r0.zzcQ(r4);	 Catch:{ all -> 0x0049 }
        r0.refresh();	 Catch:{ all -> 0x0049 }
        goto L_0x0056;
    L_0x0085:
        r0 = 0;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.TagManager.zzl(android.net.Uri):boolean");
    }
}
