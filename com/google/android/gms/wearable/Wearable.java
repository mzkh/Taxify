package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.wearable.internal.zzak;
import com.google.android.gms.wearable.internal.zzan;
import com.google.android.gms.wearable.internal.zzbb;
import com.google.android.gms.wearable.internal.zzbd;
import com.google.android.gms.wearable.internal.zzd;
import com.google.android.gms.wearable.internal.zzh;
import com.google.android.gms.wearable.internal.zzi;

public class Wearable {
    public static final Api<WearableOptions> API;
    public static final DataApi DataApi;
    public static final MessageApi MessageApi;
    public static final NodeApi NodeApi;
    public static final zzc<zzbd> zzGR;
    private static final zzb<zzbd, WearableOptions> zzGS;
    public static final zza zzaFC;
    public static final zzd zzaFD;
    public static final zzh zzaFE;

    /* renamed from: com.google.android.gms.wearable.Wearable.1 */
    static class C04611 implements zzb<zzbd, WearableOptions> {
        C04611() {
        }

        public int getPriority() {
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }

        public zzbd zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, WearableOptions wearableOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            if (wearableOptions == null) {
                WearableOptions wearableOptions2 = new WearableOptions(null);
            }
            return new zzbd(context, looper, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzf);
        }
    }

    public static final class WearableOptions implements Optional {

        public static class Builder {
            public WearableOptions build() {
                return new WearableOptions();
            }
        }

        private WearableOptions(Builder builder) {
        }
    }

    static {
        DataApi = new zzi();
        MessageApi = new zzak();
        NodeApi = new zzan();
        zzaFC = new zzd();
        zzaFD = new zzh();
        zzaFE = new zzbb();
        zzGR = new zzc();
        zzGS = new C04611();
        API = new Api(zzGS, zzGR, new Scope[0]);
    }

    private Wearable() {
    }
}
