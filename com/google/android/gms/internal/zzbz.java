package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.zzdc.zzb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@zzgi
public class zzbz implements zzb {
    private boolean zzmE;
    private final Object zznh;
    private final zzhq<Bundle> zzqh;
    private final List<Runnable> zzqi;
    private boolean zzqj;

    public zzbz() {
        this.zzqh = new zzhq();
        this.zzqi = new ArrayList();
        this.zznh = new Object();
        this.zzqj = false;
        this.zzmE = false;
    }

    public void zza(Runnable runnable) {
        synchronized (this.zznh) {
            if (this.zzqj) {
                runnable.run();
                return;
            }
            this.zzqi.add(runnable);
        }
    }

    public Future<Bundle> zzcc() {
        return this.zzqh;
    }

    public void zze(Bundle bundle) {
        synchronized (this.zznh) {
            if (this.zzqj) {
                return;
            }
            this.zzqj = true;
            this.zzqh.zzb(bundle);
            for (Runnable run : this.zzqi) {
                run.run();
            }
            this.zzqi.clear();
        }
    }

    public void zzl(Context context) {
        synchronized (this.zznh) {
            if (this.zzmE) {
                return;
            }
            zzdc.zza(context, this);
            this.zzmE = true;
        }
    }
}
