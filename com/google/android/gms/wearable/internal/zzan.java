package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import java.util.ArrayList;
import java.util.List;

public final class zzan implements NodeApi {

    public static class zzb implements GetConnectedNodesResult {
        private final Status zzHb;
        private final List<Node> zzaGA;

        public zzb(Status status, List<Node> list) {
            this.zzHb = status;
            this.zzaGA = list;
        }

        public List<Node> getNodes() {
            return this.zzaGA;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    public static class zzc implements GetLocalNodeResult {
        private final Status zzHb;
        private final Node zzaGB;

        public zzc(Status status, Node node) {
            this.zzHb = status;
            this.zzaGB = node;
        }

        public Node getNode() {
            return this.zzaGB;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzan.1 */
    class C06661 extends zzg<GetLocalNodeResult> {
        final /* synthetic */ zzan zzaGx;

        C06661(zzan com_google_android_gms_wearable_internal_zzan, GoogleApiClient googleApiClient) {
            this.zzaGx = com_google_android_gms_wearable_internal_zzan;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaU(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zzn(this);
        }

        protected GetLocalNodeResult zzaU(Status status) {
            return new zzc(status, null);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzan.2 */
    class C06672 extends zzg<GetConnectedNodesResult> {
        final /* synthetic */ zzan zzaGx;

        C06672(zzan com_google_android_gms_wearable_internal_zzan, GoogleApiClient googleApiClient) {
            this.zzaGx = com_google_android_gms_wearable_internal_zzan;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaV(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zzo(this);
        }

        protected GetConnectedNodesResult zzaV(Status status) {
            return new zzb(status, new ArrayList());
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzan.3 */
    class C06683 extends zzg<Status> {
        final /* synthetic */ zzan zzaGx;
        final /* synthetic */ NodeListener zzaGy;

        C06683(zzan com_google_android_gms_wearable_internal_zzan, GoogleApiClient googleApiClient, NodeListener nodeListener) {
            this.zzaGx = com_google_android_gms_wearable_internal_zzan;
            this.zzaGy = nodeListener;
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zzb((com.google.android.gms.common.api.zza.zzb) this, this.zzaGy);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    private static final class zza extends zzg<Status> {
        private NodeListener zzaGz;

        private zza(GoogleApiClient googleApiClient, NodeListener nodeListener) {
            super(googleApiClient);
            this.zzaGz = nodeListener;
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzaGz);
            this.zzaGz = null;
        }

        public Status zzb(Status status) {
            this.zzaGz = null;
            return status;
        }
    }

    public PendingResult<Status> addListener(GoogleApiClient client, NodeListener listener) {
        return client.zza(new zza(listener, null));
    }

    public PendingResult<GetConnectedNodesResult> getConnectedNodes(GoogleApiClient client) {
        return client.zza(new C06672(this, client));
    }

    public PendingResult<GetLocalNodeResult> getLocalNode(GoogleApiClient client) {
        return client.zza(new C06661(this, client));
    }

    public PendingResult<Status> removeListener(GoogleApiClient client, NodeListener listener) {
        return client.zza(new C06683(this, client, listener));
    }
}
