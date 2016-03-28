package com.google.android.gms.panorama;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.internal.zzsw;
import com.google.android.gms.internal.zzsx;

public final class Panorama {
    public static final Api<NoOptions> API;
    public static final PanoramaApi PanoramaApi;
    public static final zzc<zzsx> zzGR;
    static final zzb<zzsx, NoOptions> zzGS;

    /* renamed from: com.google.android.gms.panorama.Panorama.1 */
    static class C04391 implements zzb<zzsx, NoOptions> {
        C04391() {
        }

        public int getPriority() {
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }

        public /* synthetic */ zza zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzo(context, looper, com_google_android_gms_common_internal_zzf, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzsx zzo(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzsx(context, looper, connectionCallbacks, onConnectionFailedListener);
        }
    }

    static {
        zzGR = new zzc();
        zzGS = new C04391();
        API = new Api(zzGS, zzGR, new Scope[0]);
        PanoramaApi = new zzsw();
    }

    private Panorama() {
    }
}
