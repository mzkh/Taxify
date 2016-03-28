package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.drive.internal.zzp;
import com.google.android.gms.drive.internal.zzr;
import com.google.android.gms.drive.internal.zzu;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.drive.internal.zzz;

public final class Drive {
    public static final Api<NoOptions> API;
    public static final DriveApi DriveApi;
    public static final DrivePreferencesApi DrivePreferencesApi;
    public static final Scope SCOPE_APPFOLDER;
    public static final Scope SCOPE_FILE;
    public static final zzc<zzr> zzGR;
    public static final Scope zzSc;
    public static final Scope zzSd;
    public static final Api<zzb> zzSe;
    public static final zzc zzSf;
    public static final zzf zzSg;

    public static abstract class zza<O extends ApiOptions> implements com.google.android.gms.common.api.Api.zzb<zzr, O> {
        public int getPriority() {
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }

        protected abstract Bundle zza(O o);

        public zzr zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, O o, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzr(context, looper, com_google_android_gms_common_internal_zzf, connectionCallbacks, onConnectionFailedListener, zza(o));
        }
    }

    /* renamed from: com.google.android.gms.drive.Drive.1 */
    static class C05751 extends zza<NoOptions> {
        C05751() {
        }

        protected Bundle zza(NoOptions noOptions) {
            return new Bundle();
        }
    }

    /* renamed from: com.google.android.gms.drive.Drive.2 */
    static class C05762 extends zza<zzb> {
        C05762() {
        }

        protected Bundle zza(zzb com_google_android_gms_drive_Drive_zzb) {
            return com_google_android_gms_drive_Drive_zzb == null ? new Bundle() : com_google_android_gms_drive_Drive_zzb.zzkp();
        }
    }

    public static class zzb implements Optional {
        private final Bundle zzGK;

        private zzb() {
            this(new Bundle());
        }

        private zzb(Bundle bundle) {
            this.zzGK = bundle;
        }

        public Bundle zzkp() {
            return this.zzGK;
        }
    }

    static {
        zzGR = new zzc();
        SCOPE_FILE = new Scope(Scopes.DRIVE_FILE);
        SCOPE_APPFOLDER = new Scope(Scopes.DRIVE_APPFOLDER);
        zzSc = new Scope("https://www.googleapis.com/auth/drive");
        zzSd = new Scope("https://www.googleapis.com/auth/drive.apps");
        API = new Api(new C05751(), zzGR, new Scope[0]);
        zzSe = new Api(new C05762(), zzGR, new Scope[0]);
        DriveApi = new zzp();
        zzSf = new zzu();
        zzSg = new zzz();
        DrivePreferencesApi = new zzx();
    }

    private Drive() {
    }
}
