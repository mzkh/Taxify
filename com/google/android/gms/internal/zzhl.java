package com.google.android.gms.internal;

@zzgi
public abstract class zzhl {
    private final Runnable zzmG;
    private volatile Thread zzzi;

    /* renamed from: com.google.android.gms.internal.zzhl.1 */
    class C02311 implements Runnable {
        final /* synthetic */ zzhl zzzj;

        C02311(zzhl com_google_android_gms_internal_zzhl) {
            this.zzzj = com_google_android_gms_internal_zzhl;
        }

        public final void run() {
            this.zzzj.zzzi = Thread.currentThread();
            this.zzzj.zzdw();
        }
    }

    public zzhl() {
        this.zzmG = new C02311(this);
    }

    public final void cancel() {
        onStop();
        if (this.zzzi != null) {
            this.zzzi.interrupt();
        }
    }

    public abstract void onStop();

    public final void start() {
        zzhn.zzb(this.zzmG);
    }

    public abstract void zzdw();

    public final void zzeq() {
        zzhn.zza(1, this.zzmG);
    }
}
