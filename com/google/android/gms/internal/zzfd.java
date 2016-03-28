package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

@zzgi
public class zzfd extends zzhl implements ServiceConnection {
    private Context mContext;
    private final Object zznh;
    private boolean zzuW;
    private zzfs zzuX;
    private zzfc zzuY;
    private zzfi zzuZ;
    private List<zzfg> zzva;
    private zzfl zzvb;

    /* renamed from: com.google.android.gms.internal.zzfd.1 */
    class C02181 implements Runnable {
        final /* synthetic */ zzfg zzvc;
        final /* synthetic */ Intent zzvd;
        final /* synthetic */ zzfd zzve;

        C02181(zzfd com_google_android_gms_internal_zzfd, zzfg com_google_android_gms_internal_zzfg, Intent intent) {
            this.zzve = com_google_android_gms_internal_zzfd;
            this.zzvc = com_google_android_gms_internal_zzfg;
            this.zzvd = intent;
        }

        public void run() {
            try {
                if (this.zzve.zzvb.zza(this.zzvc.zzvn, -1, this.zzvd)) {
                    this.zzve.zzuX.zza(new zzfh(this.zzve.mContext, this.zzvc.zzvo, true, -1, this.zzvd, this.zzvc));
                } else {
                    this.zzve.zzuX.zza(new zzfh(this.zzve.mContext, this.zzvc.zzvo, false, -1, this.zzvd, this.zzvc));
                }
            } catch (RemoteException e) {
                zzhx.zzac("Fail to verify and dispatch pending transaction");
            }
        }
    }

    public zzfd(Context context, zzfs com_google_android_gms_internal_zzfs, zzfl com_google_android_gms_internal_zzfl) {
        this(context, com_google_android_gms_internal_zzfs, com_google_android_gms_internal_zzfl, new zzfc(context), zzfi.zzm(context.getApplicationContext()));
    }

    zzfd(Context context, zzfs com_google_android_gms_internal_zzfs, zzfl com_google_android_gms_internal_zzfl, zzfc com_google_android_gms_internal_zzfc, zzfi com_google_android_gms_internal_zzfi) {
        this.zznh = new Object();
        this.zzuW = false;
        this.zzva = null;
        this.mContext = context;
        this.zzuX = com_google_android_gms_internal_zzfs;
        this.zzvb = com_google_android_gms_internal_zzfl;
        this.zzuY = com_google_android_gms_internal_zzfc;
        this.zzuZ = com_google_android_gms_internal_zzfi;
        this.zzva = this.zzuZ.zze(10);
    }

    private void zzc(long j) {
        do {
            if (!zzd(j)) {
                zzhx.zzab("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.zzuW);
    }

    private boolean zzd(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.zznh.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            zzhx.zzac("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void onServiceConnected(ComponentName name, IBinder service) {
        synchronized (this.zznh) {
            this.zzuY.zzx(service);
            zzdx();
            this.zzuW = true;
            this.zznh.notify();
        }
    }

    public void onServiceDisconnected(ComponentName name) {
        zzhx.zzaa("In-app billing service disconnected.");
        this.zzuY.destroy();
    }

    public void onStop() {
        synchronized (this.zznh) {
            zzlo.zzka().zza(this.mContext, this);
            this.zzuY.destroy();
        }
    }

    protected void zza(zzfg com_google_android_gms_internal_zzfg, String str, String str2) {
        Intent intent = new Intent();
        zzab.zzaU();
        intent.putExtra("RESPONSE_CODE", 0);
        zzab.zzaU();
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        zzab.zzaU();
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        zzhw.zzzG.post(new C02181(this, com_google_android_gms_internal_zzfg, intent));
    }

    public void zzdw() {
        synchronized (this.zznh) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE);
            zzlo.zzka().zza(this.mContext, intent, (ServiceConnection) this, 1);
            zzc(SystemClock.elapsedRealtime());
            zzlo.zzka().zza(this.mContext, this);
            this.zzuY.destroy();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void zzdx() {
        /*
        r12 = this;
        r0 = r12.zzva;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r6 = new java.util.HashMap;
        r6.<init>();
        r0 = r12.zzva;
        r1 = r0.iterator();
    L_0x0014:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0026;
    L_0x001a:
        r0 = r1.next();
        r0 = (com.google.android.gms.internal.zzfg) r0;
        r2 = r0.zzvo;
        r6.put(r2, r0);
        goto L_0x0014;
    L_0x0026:
        r0 = 0;
    L_0x0027:
        r1 = r12.zzuY;
        r2 = r12.mContext;
        r2 = r2.getPackageName();
        r0 = r1.zzh(r2, r0);
        if (r0 != 0) goto L_0x0055;
    L_0x0035:
        r0 = r6.keySet();
        r1 = r0.iterator();
    L_0x003d:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0008;
    L_0x0043:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r2 = r12.zzuZ;
        r0 = r6.get(r0);
        r0 = (com.google.android.gms.internal.zzfg) r0;
        r2.zza(r0);
        goto L_0x003d;
    L_0x0055:
        r1 = com.google.android.gms.internal.zzab.zzaU();
        r1 = r1.zzf(r0);
        if (r1 != 0) goto L_0x0035;
    L_0x005f:
        r1 = "INAPP_PURCHASE_ITEM_LIST";
        r7 = r0.getStringArrayList(r1);
        r1 = "INAPP_PURCHASE_DATA_LIST";
        r8 = r0.getStringArrayList(r1);
        r1 = "INAPP_DATA_SIGNATURE_LIST";
        r9 = r0.getStringArrayList(r1);
        r1 = "INAPP_CONTINUATION_TOKEN";
        r5 = r0.getString(r1);
        r0 = 0;
        r4 = r0;
    L_0x0079:
        r0 = r7.size();
        if (r4 >= r0) goto L_0x00bb;
    L_0x007f:
        r0 = r7.get(r4);
        r0 = r6.containsKey(r0);
        if (r0 == 0) goto L_0x00b7;
    L_0x0089:
        r0 = r7.get(r4);
        r0 = (java.lang.String) r0;
        r1 = r8.get(r4);
        r1 = (java.lang.String) r1;
        r2 = r9.get(r4);
        r2 = (java.lang.String) r2;
        r3 = r6.get(r0);
        r3 = (com.google.android.gms.internal.zzfg) r3;
        r10 = com.google.android.gms.internal.zzab.zzaU();
        r10 = r10.zzL(r1);
        r11 = r3.zzvn;
        r10 = r11.equals(r10);
        if (r10 == 0) goto L_0x00b7;
    L_0x00b1:
        r12.zza(r3, r1, r2);
        r6.remove(r0);
    L_0x00b7:
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x0079;
    L_0x00bb:
        if (r5 == 0) goto L_0x0035;
    L_0x00bd:
        r0 = r6.isEmpty();
        if (r0 != 0) goto L_0x0035;
    L_0x00c3:
        r0 = r5;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfd.zzdx():void");
    }
}
