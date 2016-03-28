package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class zzas extends Thread implements zzar {
    private static zzas zzayL;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean zzCK;
    private final LinkedBlockingQueue<Runnable> zzayK;
    private volatile zzat zzayM;

    /* renamed from: com.google.android.gms.tagmanager.zzas.1 */
    class C02841 implements Runnable {
        final /* synthetic */ zzar zzayN;
        final /* synthetic */ long zzayO;
        final /* synthetic */ zzas zzayP;
        final /* synthetic */ String zzzC;

        C02841(zzas com_google_android_gms_tagmanager_zzas, zzar com_google_android_gms_tagmanager_zzar, long j, String str) {
            this.zzayP = com_google_android_gms_tagmanager_zzas;
            this.zzayN = com_google_android_gms_tagmanager_zzar;
            this.zzayO = j;
            this.zzzC = str;
        }

        public void run() {
            if (this.zzayP.zzayM == null) {
                zzct zztR = zzct.zztR();
                zztR.zza(this.zzayP.mContext, this.zzayN);
                this.zzayP.zzayM = zztR.zztS();
            }
            this.zzayP.zzayM.zzf(this.zzayO, this.zzzC);
        }
    }

    private zzas(Context context) {
        super("GAThread");
        this.zzayK = new LinkedBlockingQueue();
        this.zzCK = false;
        this.mClosed = false;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        } else {
            this.mContext = context;
        }
        start();
    }

    static zzas zzam(Context context) {
        if (zzayL == null) {
            zzayL = new zzas(context);
        }
        return zzayL;
    }

    private String zzf(Throwable th) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    public void run() {
        while (!this.mClosed) {
            try {
                Runnable runnable = (Runnable) this.zzayK.take();
                if (!this.zzCK) {
                    runnable.run();
                }
            } catch (InterruptedException e) {
                zzbf.zzaa(e.toString());
            } catch (Throwable th) {
                zzbf.zzZ("Error on Google TagManager Thread: " + zzf(th));
                zzbf.zzZ("Google TagManager is shutting down.");
                this.zzCK = true;
            }
        }
    }

    public void zzc(Runnable runnable) {
        this.zzayK.add(runnable);
    }

    void zzd(String str, long j) {
        zzc(new C02841(this, this, j, str));
    }

    public void zzdb(String str) {
        zzd(str, System.currentTimeMillis());
    }
}
