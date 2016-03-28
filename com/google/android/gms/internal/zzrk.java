package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;
import com.google.android.gms.nearby.connection.Connections.MessageListener;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;

public final class zzrk extends zzk<zzrn> {
    private final long zzadW;

    private static final class zze implements StartAdvertisingResult {
        private final Status zzHb;
        private final String zzasS;

        zze(Status status, String str) {
            this.zzHb = status;
            this.zzasS = str;
        }

        public String getLocalEndpointName() {
            return this.zzasS;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzrk.1 */
    class C06481 extends zzrj {
        final /* synthetic */ com.google.android.gms.common.api.zza.zzb zzasG;
        final /* synthetic */ zzrk zzasH;

        C06481(zzrk com_google_android_gms_internal_zzrk, com.google.android.gms.common.api.zza.zzb com_google_android_gms_common_api_zza_zzb) {
            this.zzasH = com_google_android_gms_internal_zzrk;
            this.zzasG = com_google_android_gms_common_api_zza_zzb;
        }

        public void zzgw(int i) throws RemoteException {
            this.zzasG.zzd(new Status(i));
        }
    }

    private static class zzb extends zzrj {
        private final com.google.android.gms.common.api.zze<MessageListener> zzasI;

        /* renamed from: com.google.android.gms.internal.zzrk.zzb.1 */
        class C04221 implements com.google.android.gms.common.api.zze.zzb<MessageListener> {
            final /* synthetic */ byte[] zzahb;
            final /* synthetic */ String zzasJ;
            final /* synthetic */ boolean zzasK;
            final /* synthetic */ zzb zzasL;

            C04221(zzb com_google_android_gms_internal_zzrk_zzb, String str, byte[] bArr, boolean z) {
                this.zzasL = com_google_android_gms_internal_zzrk_zzb;
                this.zzasJ = str;
                this.zzahb = bArr;
                this.zzasK = z;
            }

            public void zza(MessageListener messageListener) {
                messageListener.onMessageReceived(this.zzasJ, this.zzahb, this.zzasK);
            }

            public /* synthetic */ void zze(Object obj) {
                zza((MessageListener) obj);
            }

            public void zzhX() {
            }
        }

        /* renamed from: com.google.android.gms.internal.zzrk.zzb.2 */
        class C04232 implements com.google.android.gms.common.api.zze.zzb<MessageListener> {
            final /* synthetic */ String zzasJ;
            final /* synthetic */ zzb zzasL;

            C04232(zzb com_google_android_gms_internal_zzrk_zzb, String str) {
                this.zzasL = com_google_android_gms_internal_zzrk_zzb;
                this.zzasJ = str;
            }

            public void zza(MessageListener messageListener) {
                messageListener.onDisconnected(this.zzasJ);
            }

            public /* synthetic */ void zze(Object obj) {
                zza((MessageListener) obj);
            }

            public void zzhX() {
            }
        }

        zzb(com.google.android.gms.common.api.zze<MessageListener> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener) {
            this.zzasI = com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener;
        }

        public void onDisconnected(String remoteEndpointId) throws RemoteException {
            this.zzasI.zza(new C04232(this, remoteEndpointId));
        }

        public void onMessageReceived(String remoteEndpointId, byte[] payload, boolean isReliable) throws RemoteException {
            this.zzasI.zza(new C04221(this, remoteEndpointId, payload, isReliable));
        }
    }

    private static final class zzd extends zzrj {
        private final com.google.android.gms.common.api.zza.zzb<StartAdvertisingResult> zzHa;
        private final com.google.android.gms.common.api.zze<ConnectionRequestListener> zzasO;

        /* renamed from: com.google.android.gms.internal.zzrk.zzd.1 */
        class C04251 implements com.google.android.gms.common.api.zze.zzb<ConnectionRequestListener> {
            final /* synthetic */ byte[] zzahb;
            final /* synthetic */ String zzasJ;
            final /* synthetic */ String zzasP;
            final /* synthetic */ String zzasQ;
            final /* synthetic */ zzd zzasR;

            C04251(zzd com_google_android_gms_internal_zzrk_zzd, String str, String str2, String str3, byte[] bArr) {
                this.zzasR = com_google_android_gms_internal_zzrk_zzd;
                this.zzasJ = str;
                this.zzasP = str2;
                this.zzasQ = str3;
                this.zzahb = bArr;
            }

            public void zza(ConnectionRequestListener connectionRequestListener) {
                connectionRequestListener.onConnectionRequest(this.zzasJ, this.zzasP, this.zzasQ, this.zzahb);
            }

            public /* synthetic */ void zze(Object obj) {
                zza((ConnectionRequestListener) obj);
            }

            public void zzhX() {
            }
        }

        zzd(com.google.android.gms.common.api.zza.zzb<StartAdvertisingResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_nearby_connection_Connections_StartAdvertisingResult, com.google.android.gms.common.api.zze<ConnectionRequestListener> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_ConnectionRequestListener) {
            this.zzHa = (com.google.android.gms.common.api.zza.zzb) zzx.zzl(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_nearby_connection_Connections_StartAdvertisingResult);
            this.zzasO = (com.google.android.gms.common.api.zze) zzx.zzl(com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_ConnectionRequestListener);
        }

        public void onConnectionRequest(String remoteEndpointId, String remoteDeviceId, String remoteEndpointName, byte[] payload) throws RemoteException {
            this.zzasO.zza(new C04251(this, remoteEndpointId, remoteDeviceId, remoteEndpointName, payload));
        }

        public void zzi(int i, String str) throws RemoteException {
            this.zzHa.zzd(new zze(new Status(i), str));
        }
    }

    private static final class zzf extends zzrj {
        private final com.google.android.gms.common.api.zza.zzb<Status> zzHa;
        private final com.google.android.gms.common.api.zze<EndpointDiscoveryListener> zzasO;

        /* renamed from: com.google.android.gms.internal.zzrk.zzf.1 */
        class C04261 implements com.google.android.gms.common.api.zze.zzb<EndpointDiscoveryListener> {
            final /* synthetic */ String val$name;
            final /* synthetic */ String zzasT;
            final /* synthetic */ String zzasU;
            final /* synthetic */ String zzasV;
            final /* synthetic */ zzf zzasW;

            C04261(zzf com_google_android_gms_internal_zzrk_zzf, String str, String str2, String str3, String str4) {
                this.zzasW = com_google_android_gms_internal_zzrk_zzf;
                this.zzasT = str;
                this.zzasU = str2;
                this.zzasV = str3;
                this.val$name = str4;
            }

            public void zza(EndpointDiscoveryListener endpointDiscoveryListener) {
                endpointDiscoveryListener.onEndpointFound(this.zzasT, this.zzasU, this.zzasV, this.val$name);
            }

            public /* synthetic */ void zze(Object obj) {
                zza((EndpointDiscoveryListener) obj);
            }

            public void zzhX() {
            }
        }

        /* renamed from: com.google.android.gms.internal.zzrk.zzf.2 */
        class C04272 implements com.google.android.gms.common.api.zze.zzb<EndpointDiscoveryListener> {
            final /* synthetic */ String zzasT;
            final /* synthetic */ zzf zzasW;

            C04272(zzf com_google_android_gms_internal_zzrk_zzf, String str) {
                this.zzasW = com_google_android_gms_internal_zzrk_zzf;
                this.zzasT = str;
            }

            public void zza(EndpointDiscoveryListener endpointDiscoveryListener) {
                endpointDiscoveryListener.onEndpointLost(this.zzasT);
            }

            public /* synthetic */ void zze(Object obj) {
                zza((EndpointDiscoveryListener) obj);
            }

            public void zzhX() {
            }
        }

        zzf(com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, com.google.android.gms.common.api.zze<EndpointDiscoveryListener> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_EndpointDiscoveryListener) {
            this.zzHa = (com.google.android.gms.common.api.zza.zzb) zzx.zzl(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status);
            this.zzasO = (com.google.android.gms.common.api.zze) zzx.zzl(com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_EndpointDiscoveryListener);
        }

        public void onEndpointFound(String endpointId, String deviceId, String serviceId, String name) throws RemoteException {
            this.zzasO.zza(new C04261(this, endpointId, deviceId, serviceId, name));
        }

        public void onEndpointLost(String endpointId) throws RemoteException {
            this.zzasO.zza(new C04272(this, endpointId));
        }

        public void zzgs(int i) throws RemoteException {
            this.zzHa.zzd(new Status(i));
        }
    }

    private static final class zza extends zzb {
        private final com.google.android.gms.common.api.zza.zzb<Status> zzHa;

        public zza(com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, com.google.android.gms.common.api.zze<MessageListener> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener) {
            super(com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener);
            this.zzHa = (com.google.android.gms.common.api.zza.zzb) zzx.zzl(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status);
        }

        public void zzgv(int i) throws RemoteException {
            this.zzHa.zzd(new Status(i));
        }
    }

    private static final class zzc extends zzb {
        private final com.google.android.gms.common.api.zza.zzb<Status> zzHa;
        private final com.google.android.gms.common.api.zze<ConnectionResponseCallback> zzasM;

        /* renamed from: com.google.android.gms.internal.zzrk.zzc.1 */
        class C04241 implements com.google.android.gms.common.api.zze.zzb<ConnectionResponseCallback> {
            final /* synthetic */ int zzKJ;
            final /* synthetic */ byte[] zzahb;
            final /* synthetic */ String zzasJ;
            final /* synthetic */ zzc zzasN;

            C04241(zzc com_google_android_gms_internal_zzrk_zzc, String str, int i, byte[] bArr) {
                this.zzasN = com_google_android_gms_internal_zzrk_zzc;
                this.zzasJ = str;
                this.zzKJ = i;
                this.zzahb = bArr;
            }

            public void zza(ConnectionResponseCallback connectionResponseCallback) {
                connectionResponseCallback.onConnectionResponse(this.zzasJ, new Status(this.zzKJ), this.zzahb);
            }

            public /* synthetic */ void zze(Object obj) {
                zza((ConnectionResponseCallback) obj);
            }

            public void zzhX() {
            }
        }

        public zzc(com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, com.google.android.gms.common.api.zze<ConnectionResponseCallback> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_ConnectionResponseCallback, com.google.android.gms.common.api.zze<MessageListener> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener) {
            super(com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener);
            this.zzHa = (com.google.android.gms.common.api.zza.zzb) zzx.zzl(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status);
            this.zzasM = (com.google.android.gms.common.api.zze) zzx.zzl(com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_ConnectionResponseCallback);
        }

        public void zza(String str, int i, byte[] bArr) throws RemoteException {
            this.zzasM.zza(new C04241(this, str, i, bArr));
        }

        public void zzgu(int i) throws RemoteException {
            this.zzHa.zzd(new Status(i));
        }
    }

    public zzrk(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, connectionCallbacks, onConnectionFailedListener);
        this.zzadW = (long) hashCode();
    }

    public void disconnect() {
        if (isConnected()) {
            try {
                ((zzrn) zzjb()).zzu(this.zzadW);
            } catch (Throwable e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        super.disconnect();
    }

    public void zza(com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, String str, long j, com.google.android.gms.common.api.zze<EndpointDiscoveryListener> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_EndpointDiscoveryListener) throws RemoteException {
        ((zzrn) zzjb()).zza(new zzf(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_EndpointDiscoveryListener), str, j, this.zzadW);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb<StartAdvertisingResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_nearby_connection_Connections_StartAdvertisingResult, String str, AppMetadata appMetadata, long j, com.google.android.gms.common.api.zze<ConnectionRequestListener> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_ConnectionRequestListener) throws RemoteException {
        ((zzrn) zzjb()).zza(new zzd(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_nearby_connection_Connections_StartAdvertisingResult, com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_ConnectionRequestListener), str, appMetadata, j, this.zzadW);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, String str, String str2, byte[] bArr, com.google.android.gms.common.api.zze<ConnectionResponseCallback> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_ConnectionResponseCallback, com.google.android.gms.common.api.zze<MessageListener> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener) throws RemoteException {
        ((zzrn) zzjb()).zza(new zzc(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_ConnectionResponseCallback, com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener), str, str2, bArr, this.zzadW);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, String str, byte[] bArr, com.google.android.gms.common.api.zze<MessageListener> com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener) throws RemoteException {
        ((zzrn) zzjb()).zza(new zza(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, com_google_android_gms_common_api_zze_com_google_android_gms_nearby_connection_Connections_MessageListener), str, bArr, this.zzadW);
    }

    public void zza(String[] strArr, byte[] bArr) {
        try {
            ((zzrn) zzjb()).zza(strArr, bArr, this.zzadW);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't send reliable message", e);
        }
    }

    public void zzb(String[] strArr, byte[] bArr) {
        try {
            ((zzrn) zzjb()).zzb(strArr, bArr, this.zzadW);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't send unreliable message", e);
        }
    }

    protected String zzcF() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    protected String zzcG() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    protected zzrn zzcg(IBinder iBinder) {
        return com.google.android.gms.internal.zzrn.zza.zzci(iBinder);
    }

    public void zzcx(String str) {
        try {
            ((zzrn) zzjb()).zzb(str, this.zzadW);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop discovery", e);
        }
    }

    public void zzcy(String str) {
        try {
            ((zzrn) zzjb()).zzc(str, this.zzadW);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't disconnect from endpoint", e);
        }
    }

    protected /* synthetic */ IInterface zzp(IBinder iBinder) {
        return zzcg(iBinder);
    }

    public void zzq(com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, String str) throws RemoteException {
        ((zzrn) zzjb()).zza(new C06481(this, com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status), str, this.zzadW);
    }

    public String zzrk() {
        try {
            return ((zzrn) zzjb()).zzE(this.zzadW);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public String zzrl() {
        try {
            return ((zzrn) zzjb()).zzrl();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zzrm() {
        try {
            ((zzrn) zzjb()).zzB(this.zzadW);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop advertising", e);
        }
    }

    public void zzrn() {
        try {
            ((zzrn) zzjb()).zzD(this.zzadW);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop all endpoints", e);
        }
    }
}
