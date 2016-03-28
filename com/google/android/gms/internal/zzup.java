package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import java.util.concurrent.Executors;

public final class zzup {
    public static final Api<zzus> API;
    public static final zzc<zzvc> zzGR;
    public static final zzb<zzvc, zzus> zzGS;
    public static final zzuq zzawO;

    /* renamed from: com.google.android.gms.internal.zzup.1 */
    static class C04321 implements zzb<zzvc, zzus> {
        C04321() {
        }

        public int getPriority() {
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }

        public zzvc zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, zzus com_google_android_gms_internal_zzus, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzvc(context, looper, com_google_android_gms_common_internal_zzf, com_google_android_gms_internal_zzus == null ? zzus.zzawP : com_google_android_gms_internal_zzus, connectionCallbacks, onConnectionFailedListener, Executors.newSingleThreadExecutor());
        }
    }

    static {
        zzGR = new zzc();
        zzGS = new C04321();
        API = new Api(zzGS, zzGR, new Scope[0]);
        zzawO = new zzvb();
    }
}
