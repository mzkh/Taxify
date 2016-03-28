package com.google.android.gms.appstate;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzjl;

@Deprecated
public final class AppStateManager {
    public static final Api<NoOptions> API;
    public static final Scope SCOPE_APP_STATE;
    static final com.google.android.gms.common.api.Api.zzc<zzjl> zzGR;
    private static final com.google.android.gms.common.api.Api.zzb<zzjl, NoOptions> zzGS;

    /* renamed from: com.google.android.gms.appstate.AppStateManager.1 */
    static class C03481 implements com.google.android.gms.common.api.Api.zzb<zzjl, NoOptions> {
        C03481() {
        }

        public int getPriority() {
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }

        public /* synthetic */ com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzb(context, looper, com_google_android_gms_common_internal_zzf, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzjl zzb(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzjl(context, looper, com_google_android_gms_common_internal_zzf, connectionCallbacks, onConnectionFailedListener);
        }
    }

    public interface StateConflictResult extends Releasable, Result {
        byte[] getLocalData();

        String getResolvedVersion();

        byte[] getServerData();

        int getStateKey();
    }

    public interface StateDeletedResult extends Result {
        int getStateKey();
    }

    public interface StateListResult extends Result {
        AppStateBuffer getStateBuffer();
    }

    public interface StateLoadedResult extends Releasable, Result {
        byte[] getLocalData();

        int getStateKey();
    }

    public interface StateResult extends Releasable, Result {
        StateConflictResult getConflictResult();

        StateLoadedResult getLoadedResult();
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager.2 */
    static class C04692 implements StateResult {
        final /* synthetic */ Status zzGT;

        C04692(Status status) {
            this.zzGT = status;
        }

        public StateConflictResult getConflictResult() {
            return null;
        }

        public StateLoadedResult getLoadedResult() {
            return null;
        }

        public Status getStatus() {
            return this.zzGT;
        }

        public void release() {
        }
    }

    public static abstract class zza<R extends Result> extends com.google.android.gms.common.api.zza.zza<R, zzjl> {
        public zza(GoogleApiClient googleApiClient) {
            super(AppStateManager.zzGR, googleApiClient);
        }
    }

    private static abstract class zzb extends zza<StateDeletedResult> {
        zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }
    }

    private static abstract class zzc extends zza<StateListResult> {

        /* renamed from: com.google.android.gms.appstate.AppStateManager.zzc.1 */
        class C04711 implements StateListResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ zzc zzGZ;

            C04711(zzc com_google_android_gms_appstate_AppStateManager_zzc, Status status) {
                this.zzGZ = com_google_android_gms_appstate_AppStateManager_zzc;
                this.zzGT = status;
            }

            public AppStateBuffer getStateBuffer() {
                return new AppStateBuffer(null);
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public zzc(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzf(x0);
        }

        public StateListResult zzf(Status status) {
            return new C04711(this, status);
        }
    }

    private static abstract class zzd extends zza<Status> {
        public zzd(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    private static abstract class zze extends zza<StateResult> {
        public zze(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzg(x0);
        }

        public StateResult zzg(Status status) {
            return AppStateManager.zzc(status);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager.3 */
    static class C06773 extends zze {
        final /* synthetic */ int zzGU;
        final /* synthetic */ byte[] zzGV;

        C06773(GoogleApiClient googleApiClient, int i, byte[] bArr) {
            this.zzGU = i;
            this.zzGV = bArr;
            super(googleApiClient);
        }

        protected void zza(zzjl com_google_android_gms_internal_zzjl) throws RemoteException {
            com_google_android_gms_internal_zzjl.zza(null, this.zzGU, this.zzGV);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager.4 */
    static class C06784 extends zze {
        final /* synthetic */ int zzGU;
        final /* synthetic */ byte[] zzGV;

        C06784(GoogleApiClient googleApiClient, int i, byte[] bArr) {
            this.zzGU = i;
            this.zzGV = bArr;
            super(googleApiClient);
        }

        protected void zza(zzjl com_google_android_gms_internal_zzjl) throws RemoteException {
            com_google_android_gms_internal_zzjl.zza(this, this.zzGU, this.zzGV);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager.5 */
    static class C06795 extends zzb {
        final /* synthetic */ int zzGU;

        /* renamed from: com.google.android.gms.appstate.AppStateManager.5.1 */
        class C04701 implements StateDeletedResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ C06795 zzGW;

            C04701(C06795 c06795, Status status) {
                this.zzGW = c06795;
                this.zzGT = status;
            }

            public int getStateKey() {
                return this.zzGW.zzGU;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        C06795(GoogleApiClient googleApiClient, int i) {
            this.zzGU = i;
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zze(x0);
        }

        protected void zza(zzjl com_google_android_gms_internal_zzjl) throws RemoteException {
            com_google_android_gms_internal_zzjl.zza(this, this.zzGU);
        }

        public StateDeletedResult zze(Status status) {
            return new C04701(this, status);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager.6 */
    static class C06806 extends zze {
        final /* synthetic */ int zzGU;

        C06806(GoogleApiClient googleApiClient, int i) {
            this.zzGU = i;
            super(googleApiClient);
        }

        protected void zza(zzjl com_google_android_gms_internal_zzjl) throws RemoteException {
            com_google_android_gms_internal_zzjl.zzb(this, this.zzGU);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager.7 */
    static class C06817 extends zzc {
        C06817(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected void zza(zzjl com_google_android_gms_internal_zzjl) throws RemoteException {
            com_google_android_gms_internal_zzjl.zza(this);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager.8 */
    static class C06828 extends zze {
        final /* synthetic */ int zzGU;
        final /* synthetic */ String zzGX;
        final /* synthetic */ byte[] zzGY;

        C06828(GoogleApiClient googleApiClient, int i, String str, byte[] bArr) {
            this.zzGU = i;
            this.zzGX = str;
            this.zzGY = bArr;
            super(googleApiClient);
        }

        protected void zza(zzjl com_google_android_gms_internal_zzjl) throws RemoteException {
            com_google_android_gms_internal_zzjl.zza(this, this.zzGU, this.zzGX, this.zzGY);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager.9 */
    static class C06839 extends zzd {
        C06839(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected void zza(zzjl com_google_android_gms_internal_zzjl) throws RemoteException {
            com_google_android_gms_internal_zzjl.zzb(this);
        }
    }

    static {
        zzGR = new com.google.android.gms.common.api.Api.zzc();
        zzGS = new C03481();
        SCOPE_APP_STATE = new Scope(Scopes.APP_STATE);
        API = new Api(zzGS, zzGR, SCOPE_APP_STATE);
    }

    private AppStateManager() {
    }

    public static PendingResult<StateDeletedResult> delete(GoogleApiClient googleApiClient, int stateKey) {
        return googleApiClient.zzb(new C06795(googleApiClient, stateKey));
    }

    public static int getMaxNumKeys(GoogleApiClient googleApiClient) {
        return zza(googleApiClient).zzhe();
    }

    public static int getMaxStateSize(GoogleApiClient googleApiClient) {
        return zza(googleApiClient).zzhd();
    }

    public static PendingResult<StateListResult> list(GoogleApiClient googleApiClient) {
        return googleApiClient.zza(new C06817(googleApiClient));
    }

    public static PendingResult<StateResult> load(GoogleApiClient googleApiClient, int stateKey) {
        return googleApiClient.zza(new C06806(googleApiClient, stateKey));
    }

    public static PendingResult<StateResult> resolve(GoogleApiClient googleApiClient, int stateKey, String resolvedVersion, byte[] resolvedData) {
        return googleApiClient.zzb(new C06828(googleApiClient, stateKey, resolvedVersion, resolvedData));
    }

    public static PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return googleApiClient.zzb(new C06839(googleApiClient));
    }

    public static void update(GoogleApiClient googleApiClient, int stateKey, byte[] data) {
        googleApiClient.zzb(new C06773(googleApiClient, stateKey, data));
    }

    public static PendingResult<StateResult> updateImmediate(GoogleApiClient googleApiClient, int stateKey, byte[] data) {
        return googleApiClient.zzb(new C06784(googleApiClient, stateKey, data));
    }

    public static zzjl zza(GoogleApiClient googleApiClient) {
        zzx.zzb(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        zzx.zza(googleApiClient.isConnected(), (Object) "GoogleApiClient must be connected.");
        zzx.zza(googleApiClient.zza(API), (Object) "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return (zzjl) googleApiClient.zza(zzGR);
    }

    private static StateResult zzc(Status status) {
        return new C04692(status);
    }
}
