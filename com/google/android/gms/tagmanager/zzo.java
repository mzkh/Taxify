package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractPendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzc.zzj;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzlx;
import com.google.android.gms.internal.zzvg;
import com.google.android.gms.internal.zzvk;

public class zzo extends AbstractPendingResult<ContainerHolder> {
    private final Context mContext;
    private final Looper zzMc;
    private long zzaxB;
    private final TagManager zzaxI;
    private final zzd zzaxL;
    private final zzcc zzaxM;
    private final int zzaxN;
    private zzf zzaxO;
    private zzvg zzaxP;
    private volatile zzn zzaxQ;
    private volatile boolean zzaxR;
    private zzj zzaxS;
    private String zzaxT;
    private zze zzaxU;
    private zza zzaxV;
    private final String zzaxw;
    private final zzlv zzmW;

    interface zza {
        boolean zzb(Container container);
    }

    /* renamed from: com.google.android.gms.tagmanager.zzo.1 */
    class C04571 implements com.google.android.gms.internal.zzvg.zza {
        final /* synthetic */ String zzaxW;
        final /* synthetic */ zzo zzaxX;

        /* renamed from: com.google.android.gms.tagmanager.zzo.1.1 */
        class C04561 implements com.google.android.gms.tagmanager.zzn.zza {
            final /* synthetic */ C04571 zzaxY;

            C04561(C04571 c04571) {
                this.zzaxY = c04571;
            }

            public void zzcQ(String str) {
                this.zzaxY.zzaxX.zzcQ(str);
            }

            public String zzsK() {
                return this.zzaxY.zzaxX.zzsK();
            }

            public void zzsM() {
                if (this.zzaxY.zzaxX.zzaxM.zzgv()) {
                    this.zzaxY.zzaxX.load(this.zzaxY.zzaxW);
                }
            }
        }

        C04571(zzo com_google_android_gms_tagmanager_zzo, String str) {
            this.zzaxX = com_google_android_gms_tagmanager_zzo;
            this.zzaxW = str;
        }

        public void zza(zzvk com_google_android_gms_internal_zzvk) {
            if (com_google_android_gms_internal_zzvk.getStatus() != Status.zzNo) {
                zzbf.zzZ("Load request failed for the container " + this.zzaxX.zzaxw);
                this.zzaxX.setResult(this.zzaxX.zzaN(Status.zzNq));
                return;
            }
            com.google.android.gms.internal.zzvl.zzc zzus = com_google_android_gms_internal_zzvk.zzuo().zzus();
            if (zzus == null) {
                String str = "Response doesn't have the requested container";
                zzbf.zzZ(str);
                this.zzaxX.setResult(this.zzaxX.zzaN(new Status(8, str, null)));
                return;
            }
            this.zzaxX.zzaxQ = new zzn(this.zzaxX.zzaxI, this.zzaxX.zzMc, new Container(this.zzaxX.mContext, this.zzaxX.zzaxI.getDataLayer(), this.zzaxX.zzaxw, com_google_android_gms_internal_zzvk.zzuo().zzut(), zzus), new C04561(this));
            this.zzaxX.setResult(this.zzaxX.zzaxQ);
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.zzo.2 */
    class C04582 implements com.google.android.gms.tagmanager.zzn.zza {
        final /* synthetic */ zzo zzaxX;

        C04582(zzo com_google_android_gms_tagmanager_zzo) {
            this.zzaxX = com_google_android_gms_tagmanager_zzo;
        }

        public void zzcQ(String str) {
            this.zzaxX.zzcQ(str);
        }

        public String zzsK() {
            return this.zzaxX.zzsK();
        }

        public void zzsM() {
            zzbf.zzac("Refresh ignored: container loaded as default only.");
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.zzo.3 */
    class C04593 implements zza {
        final /* synthetic */ zzo zzaxX;
        final /* synthetic */ boolean zzaxZ;

        C04593(zzo com_google_android_gms_tagmanager_zzo, boolean z) {
            this.zzaxX = com_google_android_gms_tagmanager_zzo;
            this.zzaxZ = z;
        }

        public boolean zzb(Container container) {
            return this.zzaxZ ? container.getLastRefreshTime() + 43200000 >= this.zzaxX.zzmW.currentTimeMillis() : !container.isDefault();
        }
    }

    private class zzb implements zzbe<com.google.android.gms.internal.zzvd.zza> {
        final /* synthetic */ zzo zzaxX;

        private zzb(zzo com_google_android_gms_tagmanager_zzo) {
            this.zzaxX = com_google_android_gms_tagmanager_zzo;
        }

        public void zza(com.google.android.gms.internal.zzvd.zza com_google_android_gms_internal_zzvd_zza) {
            zzj com_google_android_gms_internal_zzc_zzj;
            if (com_google_android_gms_internal_zzvd_zza.zzaBL != null) {
                com_google_android_gms_internal_zzc_zzj = com_google_android_gms_internal_zzvd_zza.zzaBL;
            } else {
                com.google.android.gms.internal.zzc.zzf com_google_android_gms_internal_zzc_zzf = com_google_android_gms_internal_zzvd_zza.zzgs;
                com_google_android_gms_internal_zzc_zzj = new zzj();
                com_google_android_gms_internal_zzc_zzj.zzgs = com_google_android_gms_internal_zzc_zzf;
                com_google_android_gms_internal_zzc_zzj.zzgr = null;
                com_google_android_gms_internal_zzc_zzj.zzgt = com_google_android_gms_internal_zzc_zzf.version;
            }
            this.zzaxX.zza(com_google_android_gms_internal_zzc_zzj, com_google_android_gms_internal_zzvd_zza.zzaBK, true);
        }

        public void zza(com.google.android.gms.tagmanager.zzbe.zza com_google_android_gms_tagmanager_zzbe_zza) {
            if (!this.zzaxX.zzaxR) {
                this.zzaxX.zzF(0);
            }
        }

        public /* synthetic */ void zzo(Object obj) {
            zza((com.google.android.gms.internal.zzvd.zza) obj);
        }

        public void zzsR() {
        }
    }

    private class zzc implements zzbe<zzj> {
        final /* synthetic */ zzo zzaxX;

        private zzc(zzo com_google_android_gms_tagmanager_zzo) {
            this.zzaxX = com_google_android_gms_tagmanager_zzo;
        }

        public void zza(com.google.android.gms.tagmanager.zzbe.zza com_google_android_gms_tagmanager_zzbe_zza) {
            synchronized (this.zzaxX) {
                if (!this.zzaxX.isReady()) {
                    if (this.zzaxX.zzaxQ != null) {
                        this.zzaxX.setResult(this.zzaxX.zzaxQ);
                    } else {
                        this.zzaxX.setResult(this.zzaxX.zzaN(Status.zzNr));
                    }
                }
            }
            this.zzaxX.zzF(3600000);
        }

        public void zzb(zzj com_google_android_gms_internal_zzc_zzj) {
            synchronized (this.zzaxX) {
                if (com_google_android_gms_internal_zzc_zzj.zzgs == null) {
                    if (this.zzaxX.zzaxS.zzgs == null) {
                        zzbf.zzZ("Current resource is null; network resource is also null");
                        this.zzaxX.zzF(3600000);
                        return;
                    }
                    com_google_android_gms_internal_zzc_zzj.zzgs = this.zzaxX.zzaxS.zzgs;
                }
                this.zzaxX.zza(com_google_android_gms_internal_zzc_zzj, this.zzaxX.zzmW.currentTimeMillis(), false);
                zzbf.zzab("setting refresh time to current time: " + this.zzaxX.zzaxB);
                if (!this.zzaxX.zzsQ()) {
                    this.zzaxX.zza(com_google_android_gms_internal_zzc_zzj);
                }
            }
        }

        public /* synthetic */ void zzo(Object obj) {
            zzb((zzj) obj);
        }

        public void zzsR() {
        }
    }

    private class zzd implements com.google.android.gms.tagmanager.zzn.zza {
        final /* synthetic */ zzo zzaxX;

        private zzd(zzo com_google_android_gms_tagmanager_zzo) {
            this.zzaxX = com_google_android_gms_tagmanager_zzo;
        }

        public void zzcQ(String str) {
            this.zzaxX.zzcQ(str);
        }

        public String zzsK() {
            return this.zzaxX.zzsK();
        }

        public void zzsM() {
            if (this.zzaxX.zzaxM.zzgv()) {
                this.zzaxX.zzF(0);
            }
        }
    }

    interface zze extends Releasable {
        void zza(zzbe<zzj> com_google_android_gms_tagmanager_zzbe_com_google_android_gms_internal_zzc_zzj);

        void zzcT(String str);

        void zze(long j, String str);
    }

    interface zzf extends Releasable {
        void zza(zzbe<com.google.android.gms.internal.zzvd.zza> com_google_android_gms_tagmanager_zzbe_com_google_android_gms_internal_zzvd_zza);

        void zzb(com.google.android.gms.internal.zzvd.zza com_google_android_gms_internal_zzvd_zza);

        com.google.android.gms.internal.zzvl.zzc zzhc(int i);

        void zzsS();
    }

    zzo(Context context, TagManager tagManager, Looper looper, String str, int i, zzf com_google_android_gms_tagmanager_zzo_zzf, zze com_google_android_gms_tagmanager_zzo_zze, zzvg com_google_android_gms_internal_zzvg, zzlv com_google_android_gms_internal_zzlv, zzcc com_google_android_gms_tagmanager_zzcc) {
        super(looper == null ? Looper.getMainLooper() : looper);
        this.mContext = context;
        this.zzaxI = tagManager;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.zzMc = looper;
        this.zzaxw = str;
        this.zzaxN = i;
        this.zzaxO = com_google_android_gms_tagmanager_zzo_zzf;
        this.zzaxU = com_google_android_gms_tagmanager_zzo_zze;
        this.zzaxP = com_google_android_gms_internal_zzvg;
        this.zzaxL = new zzd();
        this.zzaxS = new zzj();
        this.zzmW = com_google_android_gms_internal_zzlv;
        this.zzaxM = com_google_android_gms_tagmanager_zzcc;
        if (zzsQ()) {
            zzcQ(zzca.zztx().zztz());
        }
    }

    public zzo(Context context, TagManager tagManager, Looper looper, String str, int i, zzr com_google_android_gms_tagmanager_zzr) {
        this(context, tagManager, looper, str, i, new zzcm(context, str), new zzcl(context, str, com_google_android_gms_tagmanager_zzr), new zzvg(context), zzlx.zzkc(), new zzbd(30, 900000, 5000, "refreshing", zzlx.zzkc()));
        this.zzaxP.zzdx(com_google_android_gms_tagmanager_zzr.zzsT());
    }

    private synchronized void zzF(long j) {
        if (this.zzaxU == null) {
            zzbf.zzac("Refresh requested, but no network load scheduler.");
        } else {
            this.zzaxU.zze(j, this.zzaxS.zzgt);
        }
    }

    private synchronized void zza(zzj com_google_android_gms_internal_zzc_zzj) {
        if (this.zzaxO != null) {
            com.google.android.gms.internal.zzvd.zza com_google_android_gms_internal_zzvd_zza = new com.google.android.gms.internal.zzvd.zza();
            com_google_android_gms_internal_zzvd_zza.zzaBK = this.zzaxB;
            com_google_android_gms_internal_zzvd_zza.zzgs = new com.google.android.gms.internal.zzc.zzf();
            com_google_android_gms_internal_zzvd_zza.zzaBL = com_google_android_gms_internal_zzc_zzj;
            this.zzaxO.zzb(com_google_android_gms_internal_zzvd_zza);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void zza(com.google.android.gms.internal.zzc.zzj r9, long r10, boolean r12) {
        /*
        r8 = this;
        r6 = 43200000; // 0x2932e00 float:2.1626111E-37 double:2.1343636E-316;
        monitor-enter(r8);
        if (r12 == 0) goto L_0x000c;
    L_0x0006:
        r0 = r8.zzaxR;	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r8);
        return;
    L_0x000c:
        r0 = r8.isReady();	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x0016;
    L_0x0012:
        r0 = r8.zzaxQ;	 Catch:{ all -> 0x006a }
        if (r0 != 0) goto L_0x0016;
    L_0x0016:
        r8.zzaxS = r9;	 Catch:{ all -> 0x006a }
        r8.zzaxB = r10;	 Catch:{ all -> 0x006a }
        r0 = 0;
        r2 = 43200000; // 0x2932e00 float:2.1626111E-37 double:2.1343636E-316;
        r4 = r8.zzaxB;	 Catch:{ all -> 0x006a }
        r4 = r4 + r6;
        r6 = r8.zzmW;	 Catch:{ all -> 0x006a }
        r6 = r6.currentTimeMillis();	 Catch:{ all -> 0x006a }
        r4 = r4 - r6;
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ all -> 0x006a }
        r0 = java.lang.Math.max(r0, r2);	 Catch:{ all -> 0x006a }
        r8.zzF(r0);	 Catch:{ all -> 0x006a }
        r0 = new com.google.android.gms.tagmanager.Container;	 Catch:{ all -> 0x006a }
        r1 = r8.mContext;	 Catch:{ all -> 0x006a }
        r2 = r8.zzaxI;	 Catch:{ all -> 0x006a }
        r2 = r2.getDataLayer();	 Catch:{ all -> 0x006a }
        r3 = r8.zzaxw;	 Catch:{ all -> 0x006a }
        r4 = r10;
        r6 = r9;
        r0.<init>(r1, r2, r3, r4, r6);	 Catch:{ all -> 0x006a }
        r1 = r8.zzaxQ;	 Catch:{ all -> 0x006a }
        if (r1 != 0) goto L_0x006d;
    L_0x0049:
        r1 = new com.google.android.gms.tagmanager.zzn;	 Catch:{ all -> 0x006a }
        r2 = r8.zzaxI;	 Catch:{ all -> 0x006a }
        r3 = r8.zzMc;	 Catch:{ all -> 0x006a }
        r4 = r8.zzaxL;	 Catch:{ all -> 0x006a }
        r1.<init>(r2, r3, r0, r4);	 Catch:{ all -> 0x006a }
        r8.zzaxQ = r1;	 Catch:{ all -> 0x006a }
    L_0x0056:
        r1 = r8.isReady();	 Catch:{ all -> 0x006a }
        if (r1 != 0) goto L_0x000a;
    L_0x005c:
        r1 = r8.zzaxV;	 Catch:{ all -> 0x006a }
        r0 = r1.zzb(r0);	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x000a;
    L_0x0064:
        r0 = r8.zzaxQ;	 Catch:{ all -> 0x006a }
        r8.setResult(r0);	 Catch:{ all -> 0x006a }
        goto L_0x000a;
    L_0x006a:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x006d:
        r1 = r8.zzaxQ;	 Catch:{ all -> 0x006a }
        r1.zza(r0);	 Catch:{ all -> 0x006a }
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzo.zza(com.google.android.gms.internal.zzc$zzj, long, boolean):void");
    }

    private void zzag(boolean z) {
        this.zzaxO.zza(new zzb());
        this.zzaxU.zza(new zzc());
        com.google.android.gms.internal.zzvl.zzc zzhc = this.zzaxO.zzhc(this.zzaxN);
        if (zzhc != null) {
            this.zzaxQ = new zzn(this.zzaxI, this.zzMc, new Container(this.mContext, this.zzaxI.getDataLayer(), this.zzaxw, 0, zzhc), this.zzaxL);
        }
        this.zzaxV = new C04593(this, z);
        if (zzsQ()) {
            this.zzaxU.zze(0, "");
        } else {
            this.zzaxO.zzsS();
        }
    }

    private boolean zzsQ() {
        zzca zztx = zzca.zztx();
        return (zztx.zzty() == zza.CONTAINER || zztx.zzty() == zza.CONTAINER_DEBUG) && this.zzaxw.equals(zztx.getContainerId());
    }

    protected /* synthetic */ Result createFailedResult(Status x0) {
        return zzaN(x0);
    }

    public void load(String resourceIdParameterName) {
        this.zzaxP.zza(this.zzaxw, this.zzaxN != -1 ? Integer.valueOf(this.zzaxN) : null, resourceIdParameterName, new C04571(this, resourceIdParameterName));
    }

    protected ContainerHolder zzaN(Status status) {
        if (this.zzaxQ != null) {
            return this.zzaxQ;
        }
        if (status == Status.zzNr) {
            zzbf.zzZ("timer expired: setting result to failure");
        }
        return new zzn(status);
    }

    synchronized void zzcQ(String str) {
        this.zzaxT = str;
        if (this.zzaxU != null) {
            this.zzaxU.zzcT(str);
        }
    }

    synchronized String zzsK() {
        return this.zzaxT;
    }

    public void zzsN() {
        com.google.android.gms.internal.zzvl.zzc zzhc = this.zzaxO.zzhc(this.zzaxN);
        if (zzhc != null) {
            setResult(new zzn(this.zzaxI, this.zzMc, new Container(this.mContext, this.zzaxI.getDataLayer(), this.zzaxw, 0, zzhc), new C04582(this)));
        } else {
            String str = "Default was requested, but no default container was found";
            zzbf.zzZ(str);
            setResult(zzaN(new Status(10, str, null)));
        }
        this.zzaxU = null;
        this.zzaxO = null;
    }

    public void zzsO() {
        zzag(false);
    }

    public void zzsP() {
        zzag(true);
    }
}
