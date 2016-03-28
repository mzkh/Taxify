package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.DriveResource.MetadataResult;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class zzy implements DriveResource {
    protected final DriveId zzRX;

    private static class zzc implements MetadataResult {
        private final Status zzHb;
        private final Metadata zzUo;

        public zzc(Status status, Metadata metadata) {
            this.zzHb = status;
            this.zzUo = metadata;
        }

        public Metadata getMetadata() {
            return this.zzUo;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    private static class zza extends zzc {
        private final com.google.android.gms.common.api.zza.zzb<MetadataBufferResult> zzHa;

        public zza(com.google.android.gms.common.api.zza.zzb<MetadataBufferResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveApi_MetadataBufferResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveApi_MetadataBufferResult;
        }

        public void zza(OnListParentsResponse onListParentsResponse) throws RemoteException {
            this.zzHa.zzd(new zzf(Status.zzNo, new MetadataBuffer(onListParentsResponse.zzkT()), false));
        }

        public void zzm(Status status) throws RemoteException {
            this.zzHa.zzd(new zzf(status, null, false));
        }
    }

    private static class zzb extends zzc {
        private final com.google.android.gms.common.api.zza.zzb<MetadataResult> zzHa;

        public zzb(com.google.android.gms.common.api.zza.zzb<MetadataResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveResource_MetadataResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveResource_MetadataResult;
        }

        public void zza(OnMetadataResponse onMetadataResponse) throws RemoteException {
            this.zzHa.zzd(new zzc(Status.zzNo, new zzm(onMetadataResponse.zzkU())));
        }

        public void zzm(Status status) throws RemoteException {
            this.zzHa.zzd(new zzc(status, null));
        }
    }

    private abstract class zzd extends zzq<MetadataResult> {
        final /* synthetic */ zzy zzUm;

        private zzd(zzy com_google_android_gms_drive_internal_zzy, GoogleApiClient googleApiClient) {
            this.zzUm = com_google_android_gms_drive_internal_zzy;
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzt(x0);
        }

        public MetadataResult zzt(Status status) {
            return new zzc(status, null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzy.1 */
    class C07181 extends zzd {
        final /* synthetic */ boolean zzUl;
        final /* synthetic */ zzy zzUm;

        C07181(zzy com_google_android_gms_drive_internal_zzy, GoogleApiClient googleApiClient, boolean z) {
            this.zzUm = com_google_android_gms_drive_internal_zzy;
            this.zzUl = z;
            super(googleApiClient, null);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new GetMetadataRequest(this.zzUm.zzRX, this.zzUl), new zzb(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzy.2 */
    class C07192 extends zzg {
        final /* synthetic */ zzy zzUm;

        C07192(zzy com_google_android_gms_drive_internal_zzy, GoogleApiClient googleApiClient) {
            this.zzUm = com_google_android_gms_drive_internal_zzy;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new ListParentsRequest(this.zzUm.zzRX), new zza(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzy.3 */
    class C07203 extends com.google.android.gms.drive.internal.zzq.zza {
        final /* synthetic */ zzy zzUm;
        final /* synthetic */ List zzUn;

        C07203(zzy com_google_android_gms_drive_internal_zzy, GoogleApiClient googleApiClient, List list) {
            this.zzUm = com_google_android_gms_drive_internal_zzy;
            this.zzUn = list;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new SetResourceParentsRequest(this.zzUm.zzRX, this.zzUn), new zzbl(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzy.4 */
    class C07214 extends zzd {
        final /* synthetic */ MetadataChangeSet zzUa;
        final /* synthetic */ zzy zzUm;

        C07214(zzy com_google_android_gms_drive_internal_zzy, GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet) {
            this.zzUm = com_google_android_gms_drive_internal_zzy;
            this.zzUa = metadataChangeSet;
            super(googleApiClient, null);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            this.zzUa.zzkx().setContext(com_google_android_gms_drive_internal_zzr.getContext());
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new UpdateMetadataRequest(this.zzUm.zzRX, this.zzUa.zzkx()), new zzb(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzy.5 */
    class C07225 extends com.google.android.gms.drive.internal.zzq.zza {
        final /* synthetic */ zzy zzUm;

        C07225(zzy com_google_android_gms_drive_internal_zzy, GoogleApiClient googleApiClient) {
            this.zzUm = com_google_android_gms_drive_internal_zzy;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new TrashResourceRequest(this.zzUm.zzRX), new zzbl(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzy.6 */
    class C07236 extends com.google.android.gms.drive.internal.zzq.zza {
        final /* synthetic */ zzy zzUm;

        C07236(zzy com_google_android_gms_drive_internal_zzy, GoogleApiClient googleApiClient) {
            this.zzUm = com_google_android_gms_drive_internal_zzy;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new UntrashResourceRequest(this.zzUm.zzRX), new zzbl(this));
        }
    }

    protected zzy(DriveId driveId) {
        this.zzRX = driveId;
    }

    private PendingResult<MetadataResult> zza(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.zza(new C07181(this, googleApiClient, z));
    }

    public PendingResult<Status> addChangeListener(GoogleApiClient apiClient, ChangeListener listener) {
        return ((zzr) apiClient.zza(Drive.zzGR)).zza(apiClient, this.zzRX, 1, listener);
    }

    public PendingResult<Status> addChangeSubscription(GoogleApiClient apiClient) {
        return ((zzr) apiClient.zza(Drive.zzGR)).zza(apiClient, this.zzRX, 1);
    }

    public DriveId getDriveId() {
        return this.zzRX;
    }

    public PendingResult<MetadataResult> getMetadata(GoogleApiClient apiClient) {
        return zza(apiClient, false);
    }

    public PendingResult<MetadataBufferResult> listParents(GoogleApiClient apiClient) {
        return apiClient.zza(new C07192(this, apiClient));
    }

    public PendingResult<Status> removeChangeListener(GoogleApiClient apiClient, ChangeListener listener) {
        return ((zzr) apiClient.zza(Drive.zzGR)).zzb(apiClient, this.zzRX, 1, listener);
    }

    public PendingResult<Status> removeChangeSubscription(GoogleApiClient apiClient) {
        return ((zzr) apiClient.zza(Drive.zzGR)).zzb(apiClient, this.zzRX, 1);
    }

    public PendingResult<Status> setParents(GoogleApiClient apiClient, Set<DriveId> parentIds) {
        if (parentIds == null) {
            throw new IllegalArgumentException("ParentIds must be provided.");
        } else if (!parentIds.isEmpty()) {
            return apiClient.zzb(new C07203(this, apiClient, new ArrayList(parentIds)));
        } else {
            throw new IllegalArgumentException("ParentIds must contain at least one parent.");
        }
    }

    public PendingResult<Status> trash(GoogleApiClient apiClient) {
        return apiClient.zzb(new C07225(this, apiClient));
    }

    public PendingResult<Status> untrash(GoogleApiClient apiClient) {
        return apiClient.zzb(new C07236(this, apiClient));
    }

    public PendingResult<MetadataResult> updateMetadata(GoogleApiClient apiClient, MetadataChangeSet changeSet) {
        if (changeSet != null) {
            return apiClient.zzb(new C07214(this, apiClient, changeSet));
        }
        throw new IllegalArgumentException("ChangeSet must be provided.");
    }
}
