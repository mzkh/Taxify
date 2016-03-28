package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@zzgi
public final class zzhn {
    private static final ThreadFactory zzzk;
    private static final ExecutorService zzzl;
    private static final ExecutorService zzzm;

    /* renamed from: com.google.android.gms.internal.zzhn.1 */
    static class C02321 implements Callable<Void> {
        final /* synthetic */ Runnable zzzn;

        C02321(Runnable runnable) {
            this.zzzn = runnable;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzer();
        }

        public Void zzer() {
            this.zzzn.run();
            return null;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzhn.2 */
    static class C02332 implements Callable<Void> {
        final /* synthetic */ Runnable zzzn;

        C02332(Runnable runnable) {
            this.zzzn = runnable;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzer();
        }

        public Void zzer() {
            this.zzzn.run();
            return null;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzhn.3 */
    static class C02343 implements Callable<T> {
        final /* synthetic */ Callable zzzo;

        C02343(Callable callable) {
            this.zzzo = callable;
        }

        public T call() throws Exception {
            try {
                Process.setThreadPriority(10);
                return this.zzzo.call();
            } catch (Throwable e) {
                zzab.zzaP().zze(e);
                throw e;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzhn.4 */
    static class C02354 implements ThreadFactory {
        private final AtomicInteger zzzp;

        C02354() {
            this.zzzp = new AtomicInteger(1);
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AdWorker #" + this.zzzp.getAndIncrement());
        }
    }

    static {
        zzzk = new C02354();
        zzzl = Executors.newFixedThreadPool(10, zzzk);
        zzzm = Executors.newFixedThreadPool(5, zzzk);
    }

    public static <T> Future<T> submit(Callable<T> callable) {
        return zza(zzzl, (Callable) callable);
    }

    public static Future<Void> zza(int i, Runnable runnable) {
        return i == 1 ? zza(zzzm, new C02321(runnable)) : zza(zzzl, new C02332(runnable));
    }

    public static <T> Future<T> zza(ExecutorService executorService, Callable<T> callable) {
        try {
            return executorService.submit(new C02343(callable));
        } catch (Throwable e) {
            zzhx.zzd("Thread execution is rejected.", e);
            return new zzhr(null);
        }
    }

    public static Future<Void> zzb(Runnable runnable) {
        return zza(0, runnable);
    }
}
