package com.google.android.gms.internal;

import android.os.Bundle;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@zzgi
public abstract class zzbx<T> implements zzbw {
    private final String zzqd;
    private final T zzqe;

    /* renamed from: com.google.android.gms.internal.zzbx.1 */
    static class C06181 extends zzbx<Boolean> {
        C06181(String str, Boolean bool) {
            super(bool, null);
        }

        public /* synthetic */ Object zza(Bundle bundle) {
            return zzb(bundle);
        }

        public Boolean zzb(Bundle bundle) {
            return Boolean.valueOf(bundle.getBoolean(getKey(), ((Boolean) zzbY()).booleanValue()));
        }

        public zzki<Boolean> zzbZ() {
            return zzki.zzg(getKey(), ((Boolean) zzbY()).booleanValue());
        }
    }

    /* renamed from: com.google.android.gms.internal.zzbx.2 */
    static class C06192 extends zzbx<Integer> {
        C06192(String str, Integer num) {
            super(num, null);
        }

        public /* synthetic */ Object zza(Bundle bundle) {
            return zzc(bundle);
        }

        public zzki<Integer> zzbZ() {
            return zzki.zza(getKey(), (Integer) zzbY());
        }

        public Integer zzc(Bundle bundle) {
            return Integer.valueOf(bundle.getInt(getKey(), ((Integer) zzbY()).intValue()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzbx.3 */
    static class C06203 extends zzbx<String> {
        C06203(String str, String str2) {
            super(str2, null);
        }

        public /* synthetic */ Object zza(Bundle bundle) {
            return zzd(bundle);
        }

        public zzki<String> zzbZ() {
            return zzki.zzp(getKey(), (String) zzbY());
        }

        public String zzd(Bundle bundle) {
            return zzbx.zza(bundle, getKey(), (String) zzbY());
        }
    }

    /* renamed from: com.google.android.gms.internal.zzbx.4 */
    static class C06214 extends zzbx<String> {
        C06214(String str, String str2) {
            super(str2, null);
        }

        public /* synthetic */ Object zza(Bundle bundle) {
            return zzd(bundle);
        }

        public zzki<String> zzbZ() {
            return zzki.zzp(getKey(), (String) zzbY());
        }

        public String zzd(Bundle bundle) {
            return zzbx.zza(bundle, getKey(), (String) zzbY());
        }
    }

    private zzbx(String str, T t) {
        this.zzqd = str;
        this.zzqe = t;
        zzab.zzaS().zza((zzbw) this);
    }

    public static zzbx<String> zzA(String str) {
        zzbx c06214 = new C06214(str, null);
        zzab.zzaS().zza(c06214);
        return c06214;
    }

    public static zzbx<Integer> zza(String str, int i) {
        return new C06192(str, Integer.valueOf(i));
    }

    public static zzbx<Boolean> zza(String str, Boolean bool) {
        return new C06181(str, bool);
    }

    private static String zza(Bundle bundle, String str, String str2) {
        String string = bundle.getString(str);
        return string == null ? str2 : string;
    }

    public static zzbx<String> zzd(String str, String str2) {
        return new C06203(str, str2);
    }

    public T get() {
        Future zzcc = zzab.zzaT().zzcc();
        if (!zzcc.isDone()) {
            return this.zzqe;
        }
        try {
            return zza((Bundle) zzcc.get());
        } catch (CancellationException e) {
            return this.zzqe;
        } catch (ExecutionException e2) {
            return this.zzqe;
        } catch (InterruptedException e3) {
            return this.zzqe;
        }
    }

    public String getKey() {
        return this.zzqd;
    }

    protected abstract T zza(Bundle bundle);

    public T zzbY() {
        return this.zzqe;
    }

    public abstract zzki<T> zzbZ();
}
