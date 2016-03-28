package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zze;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;
import com.google.android.gms.nearby.connection.Connections.MessageListener;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;
import java.util.List;

public final class zzrl implements Connections {
    public static final com.google.android.gms.common.api.Api.zzc<zzrk> zzGR;
    public static final com.google.android.gms.common.api.Api.zzb<zzrk, NoOptions> zzGS;

    /* renamed from: com.google.android.gms.internal.zzrl.1 */
    static class C04281 implements com.google.android.gms.common.api.Api.zzb<zzrk, NoOptions> {
        C04281() {
        }

        public int getPriority() {
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }

        public /* synthetic */ com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzl(context, looper, com_google_android_gms_common_internal_zzf, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzrk zzl(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzrk(context, looper, connectionCallbacks, onConnectionFailedListener);
        }
    }

    private static abstract class zza<R extends Result> extends com.google.android.gms.common.api.zza.zza<R, zzrk> {
        public zza(GoogleApiClient googleApiClient) {
            super(zzrl.zzGR, googleApiClient);
        }
    }

    private static abstract class zzb extends zza<StartAdvertisingResult> {

        /* renamed from: com.google.android.gms.internal.zzrl.zzb.1 */
        class C06221 implements StartAdvertisingResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ zzb zzate;

            C06221(zzb com_google_android_gms_internal_zzrl_zzb, Status status) {
                this.zzate = com_google_android_gms_internal_zzrl_zzb;
                this.zzGT = status;
            }

            public String getLocalEndpointName() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzaF(x0);
        }

        public StartAdvertisingResult zzaF(Status status) {
            return new C06221(this, status);
        }
    }

    private static abstract class zzc extends zza<Status> {
        private zzc(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzrl.2 */
    class C08382 extends zzb {
        final /* synthetic */ String val$name;
        final /* synthetic */ AppMetadata zzasX;
        final /* synthetic */ long zzasY;
        final /* synthetic */ zze zzasZ;
        final /* synthetic */ zzrl zzata;

        C08382(zzrl com_google_android_gms_internal_zzrl, GoogleApiClient googleApiClient, String str, AppMetadata appMetadata, long j, zze com_google_android_gms_common_api_zze) {
            this.zzata = com_google_android_gms_internal_zzrl;
            this.val$name = str;
            this.zzasX = appMetadata;
            this.zzasY = j;
            this.zzasZ = com_google_android_gms_common_api_zze;
            super(null);
        }

        protected void zza(zzrk com_google_android_gms_internal_zzrk) throws RemoteException {
            com_google_android_gms_internal_zzrk.zza(this, this.val$name, this.zzasX, this.zzasY, this.zzasZ);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzrl.3 */
    class C08393 extends zzc {
        final /* synthetic */ String zzasV;
        final /* synthetic */ long zzasY;
        final /* synthetic */ zzrl zzata;
        final /* synthetic */ zze zzatb;

        C08393(zzrl com_google_android_gms_internal_zzrl, GoogleApiClient googleApiClient, String str, long j, zze com_google_android_gms_common_api_zze) {
            this.zzata = com_google_android_gms_internal_zzrl;
            this.zzasV = str;
            this.zzasY = j;
            this.zzatb = com_google_android_gms_common_api_zze;
            super(null);
        }

        protected void zza(zzrk com_google_android_gms_internal_zzrk) throws RemoteException {
            com_google_android_gms_internal_zzrk.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzasV, this.zzasY, this.zzatb);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzrl.4 */
    class C08404 extends zzc {
        final /* synthetic */ String val$name;
        final /* synthetic */ byte[] zzahb;
        final /* synthetic */ String zzasJ;
        final /* synthetic */ zzrl zzata;
        final /* synthetic */ zze zzatc;
        final /* synthetic */ zze zzatd;

        C08404(zzrl com_google_android_gms_internal_zzrl, GoogleApiClient googleApiClient, String str, String str2, byte[] bArr, zze com_google_android_gms_common_api_zze, zze com_google_android_gms_common_api_zze2) {
            this.zzata = com_google_android_gms_internal_zzrl;
            this.val$name = str;
            this.zzasJ = str2;
            this.zzahb = bArr;
            this.zzatc = com_google_android_gms_common_api_zze;
            this.zzatd = com_google_android_gms_common_api_zze2;
            super(null);
        }

        protected void zza(zzrk com_google_android_gms_internal_zzrk) throws RemoteException {
            com_google_android_gms_internal_zzrk.zza(this, this.val$name, this.zzasJ, this.zzahb, this.zzatc, this.zzatd);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzrl.5 */
    class C08415 extends zzc {
        final /* synthetic */ byte[] zzahb;
        final /* synthetic */ String zzasJ;
        final /* synthetic */ zzrl zzata;
        final /* synthetic */ zze zzatd;

        C08415(zzrl com_google_android_gms_internal_zzrl, GoogleApiClient googleApiClient, String str, byte[] bArr, zze com_google_android_gms_common_api_zze) {
            this.zzata = com_google_android_gms_internal_zzrl;
            this.zzasJ = str;
            this.zzahb = bArr;
            this.zzatd = com_google_android_gms_common_api_zze;
            super(null);
        }

        protected void zza(zzrk com_google_android_gms_internal_zzrk) throws RemoteException {
            com_google_android_gms_internal_zzrk.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzasJ, this.zzahb, this.zzatd);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzrl.6 */
    class C08426 extends zzc {
        final /* synthetic */ String zzasJ;
        final /* synthetic */ zzrl zzata;

        C08426(zzrl com_google_android_gms_internal_zzrl, GoogleApiClient googleApiClient, String str) {
            this.zzata = com_google_android_gms_internal_zzrl;
            this.zzasJ = str;
            super(null);
        }

        protected void zza(zzrk com_google_android_gms_internal_zzrk) throws RemoteException {
            com_google_android_gms_internal_zzrk.zzq(this, this.zzasJ);
        }
    }

    static {
        zzGR = new com.google.android.gms.common.api.Api.zzc();
        zzGS = new C04281();
    }

    public static zzrk zzd(GoogleApiClient googleApiClient, boolean z) {
        zzx.zzb(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        zzx.zza(googleApiClient.isConnected(), (Object) "GoogleApiClient must be connected.");
        return zze(googleApiClient, z);
    }

    public static zzrk zze(GoogleApiClient googleApiClient, boolean z) {
        zzx.zza(googleApiClient.zza(Nearby.CONNECTIONS_API), (Object) "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean zzb = googleApiClient.zzb(Nearby.CONNECTIONS_API);
        if (!z || zzb) {
            return zzb ? (zzrk) googleApiClient.zza(zzGR) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call.");
        }
    }

    public PendingResult<Status> acceptConnectionRequest(GoogleApiClient apiClient, String remoteEndpointId, byte[] payload, MessageListener messageListener) {
        return apiClient.zzb(new C08415(this, apiClient, remoteEndpointId, payload, apiClient.zzf(messageListener)));
    }

    public void disconnectFromEndpoint(GoogleApiClient apiClient, String remoteEndpointId) {
        zzd(apiClient, false).zzcy(remoteEndpointId);
    }

    public String getLocalDeviceId(GoogleApiClient apiClient) {
        return zzd(apiClient, true).zzrl();
    }

    public String getLocalEndpointId(GoogleApiClient apiClient) {
        return zzd(apiClient, true).zzrk();
    }

    public PendingResult<Status> rejectConnectionRequest(GoogleApiClient apiClient, String remoteEndpointId) {
        return apiClient.zzb(new C08426(this, apiClient, remoteEndpointId));
    }

    public PendingResult<Status> sendConnectionRequest(GoogleApiClient apiClient, String name, String remoteEndpointId, byte[] payload, ConnectionResponseCallback connectionResponseCallback, MessageListener messageListener) {
        return apiClient.zzb(new C08404(this, apiClient, name, remoteEndpointId, payload, apiClient.zzf(connectionResponseCallback), apiClient.zzf(messageListener)));
    }

    public void sendReliableMessage(GoogleApiClient apiClient, String remoteEndpointId, byte[] payload) {
        zzd(apiClient, false).zza(new String[]{remoteEndpointId}, payload);
    }

    public void sendReliableMessage(GoogleApiClient apiClient, List<String> remoteEndpointIds, byte[] payload) {
        zzd(apiClient, false).zza((String[]) remoteEndpointIds.toArray(new String[remoteEndpointIds.size()]), payload);
    }

    public void sendUnreliableMessage(GoogleApiClient apiClient, String remoteEndpointId, byte[] payload) {
        zzd(apiClient, false).zzb(new String[]{remoteEndpointId}, payload);
    }

    public void sendUnreliableMessage(GoogleApiClient apiClient, List<String> remoteEndpointIds, byte[] payload) {
        zzd(apiClient, false).zzb((String[]) remoteEndpointIds.toArray(new String[remoteEndpointIds.size()]), payload);
    }

    public PendingResult<StartAdvertisingResult> startAdvertising(GoogleApiClient apiClient, String name, AppMetadata appMetadata, long durationMillis, ConnectionRequestListener connectionRequestListener) {
        return apiClient.zzb(new C08382(this, apiClient, name, appMetadata, durationMillis, apiClient.zzf(connectionRequestListener)));
    }

    public PendingResult<Status> startDiscovery(GoogleApiClient apiClient, String serviceId, long durationMillis, EndpointDiscoveryListener listener) {
        return apiClient.zzb(new C08393(this, apiClient, serviceId, durationMillis, apiClient.zzf(listener)));
    }

    public void stopAdvertising(GoogleApiClient apiClient) {
        zzd(apiClient, false).zzrm();
    }

    public void stopAllEndpoints(GoogleApiClient apiClient) {
        zzd(apiClient, false).zzrn();
    }

    public void stopDiscovery(GoogleApiClient apiClient, String serviceId) {
        zzd(apiClient, false).zzcx(serviceId);
    }
}
