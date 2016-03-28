package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveApi.DriveIdResult;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.query.Query;
import java.util.List;

public class zzp implements DriveApi {

    static class zza implements DriveContentsResult {
        private final Status zzHb;
        private final DriveContents zzSa;

        public zza(Status status, DriveContents driveContents) {
            this.zzHb = status;
            this.zzSa = driveContents;
        }

        public DriveContents getDriveContents() {
            return this.zzSa;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    private static class zzd implements DriveIdResult {
        private final Status zzHb;
        private final DriveId zzRX;

        public zzd(Status status, DriveId driveId) {
            this.zzHb = status;
            this.zzRX = driveId;
        }

        public DriveId getDriveId() {
            return this.zzRX;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    static class zzf implements MetadataBufferResult {
        private final Status zzHb;
        private final MetadataBuffer zzTA;
        private final boolean zzTB;

        public zzf(Status status, MetadataBuffer metadataBuffer, boolean z) {
            this.zzHb = status;
            this.zzTA = metadataBuffer;
            this.zzTB = z;
        }

        public MetadataBuffer getMetadataBuffer() {
            return this.zzTA;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    static class zzc extends zzc {
        private final com.google.android.gms.common.api.zza.zzb<DriveIdResult> zzHa;

        public zzc(com.google.android.gms.common.api.zza.zzb<DriveIdResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveApi_DriveIdResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveApi_DriveIdResult;
        }

        public void zza(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
            this.zzHa.zzd(new zzd(Status.zzNo, onDriveIdResponse.getDriveId()));
        }

        public void zza(OnMetadataResponse onMetadataResponse) throws RemoteException {
            this.zzHa.zzd(new zzd(Status.zzNo, new zzm(onMetadataResponse.zzkU()).getDriveId()));
        }

        public void zzm(Status status) throws RemoteException {
            this.zzHa.zzd(new zzd(status, null));
        }
    }

    private static class zzh extends zzc {
        private final com.google.android.gms.common.api.zza.zzb<DriveContentsResult> zzHa;

        public zzh(com.google.android.gms.common.api.zza.zzb<DriveContentsResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveApi_DriveContentsResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveApi_DriveContentsResult;
        }

        public void zza(OnContentsResponse onContentsResponse) throws RemoteException {
            this.zzHa.zzd(new zza(Status.zzNo, new zzs(onContentsResponse.zzkL())));
        }

        public void zzm(Status status) throws RemoteException {
            this.zzHa.zzd(new zza(status, null));
        }
    }

    private static class zzi extends zzc {
        private final com.google.android.gms.common.api.zza.zzb<MetadataBufferResult> zzHa;

        public zzi(com.google.android.gms.common.api.zza.zzb<MetadataBufferResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveApi_MetadataBufferResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DriveApi_MetadataBufferResult;
        }

        public void zza(OnListEntriesResponse onListEntriesResponse) throws RemoteException {
            this.zzHa.zzd(new zzf(Status.zzNo, new MetadataBuffer(onListEntriesResponse.zzkR()), onListEntriesResponse.zzkS()));
        }

        public void zzm(Status status) throws RemoteException {
            this.zzHa.zzd(new zzf(status, null, false));
        }
    }

    static abstract class zzb extends zzq<DriveContentsResult> {
        zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzn(x0);
        }

        public DriveContentsResult zzn(Status status) {
            return new zza(status, null);
        }
    }

    static abstract class zze extends zzq<DriveIdResult> {
        zze(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzo(x0);
        }

        public DriveIdResult zzo(Status status) {
            return new zzd(status, null);
        }
    }

    static abstract class zzg extends zzq<MetadataBufferResult> {
        zzg(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzp(x0);
        }

        public MetadataBufferResult zzp(Status status) {
            return new zzf(status, null, false);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzp.1 */
    class C07011 extends zzg {
        final /* synthetic */ Query zzTw;
        final /* synthetic */ zzp zzTx;

        C07011(zzp com_google_android_gms_drive_internal_zzp, GoogleApiClient googleApiClient, Query query) {
            this.zzTx = com_google_android_gms_drive_internal_zzp;
            this.zzTw = query;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new QueryRequest(this.zzTw), new zzi(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzp.2 */
    class C07022 extends zzb {
        final /* synthetic */ zzp zzTx;
        final /* synthetic */ int zzTy;

        C07022(zzp com_google_android_gms_drive_internal_zzp, GoogleApiClient googleApiClient, int i) {
            this.zzTx = com_google_android_gms_drive_internal_zzp;
            this.zzTy = i;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new CreateContentsRequest(this.zzTy), new zzh(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzp.3 */
    class C07033 extends zze {
        final /* synthetic */ zzp zzTx;
        final /* synthetic */ String zzTz;

        C07033(zzp com_google_android_gms_drive_internal_zzp, GoogleApiClient googleApiClient, String str) {
            this.zzTx = com_google_android_gms_drive_internal_zzp;
            this.zzTz = str;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new GetMetadataRequest(DriveId.zzbu(this.zzTz), false), new zzc(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzp.4 */
    class C07044 extends com.google.android.gms.drive.internal.zzq.zza {
        final /* synthetic */ zzp zzTx;

        C07044(zzp com_google_android_gms_drive_internal_zzp, GoogleApiClient googleApiClient) {
            this.zzTx = com_google_android_gms_drive_internal_zzp;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new zzbl(this));
        }
    }

    static class zzj extends com.google.android.gms.drive.internal.zzq.zza {
        zzj(GoogleApiClient googleApiClient, Status status) {
            super(googleApiClient);
            setResult(status);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) {
        }
    }

    public PendingResult<Status> cancelPendingActions(GoogleApiClient apiClient, List<String> trackingTags) {
        return ((zzr) apiClient.zza(Drive.zzGR)).cancelPendingActions(apiClient, trackingTags);
    }

    public PendingResult<DriveIdResult> fetchDriveId(GoogleApiClient apiClient, String resourceId) {
        return apiClient.zza(new C07033(this, apiClient, resourceId));
    }

    public DriveFolder getAppFolder(GoogleApiClient apiClient) {
        if (apiClient.isConnected()) {
            DriveId zzkH = ((zzr) apiClient.zza(Drive.zzGR)).zzkH();
            return zzkH != null ? new zzv(zzkH) : null;
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public DriveFile getFile(GoogleApiClient apiClient, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (apiClient.isConnected()) {
            return new zzt(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public DriveFolder getFolder(GoogleApiClient apiClient, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (apiClient.isConnected()) {
            return new zzv(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public DriveFolder getRootFolder(GoogleApiClient apiClient) {
        if (apiClient.isConnected()) {
            return new zzv(((zzr) apiClient.zza(Drive.zzGR)).zzkG());
        }
        throw new IllegalStateException("Client must be connected");
    }

    public CreateFileActivityBuilder newCreateFileActivityBuilder() {
        return new CreateFileActivityBuilder();
    }

    public PendingResult<DriveContentsResult> newDriveContents(GoogleApiClient apiClient) {
        return zza(apiClient, DriveFile.MODE_WRITE_ONLY);
    }

    public OpenFileActivityBuilder newOpenFileActivityBuilder() {
        return new OpenFileActivityBuilder();
    }

    public PendingResult<MetadataBufferResult> query(GoogleApiClient apiClient, Query query) {
        if (query != null) {
            return apiClient.zza(new C07011(this, apiClient, query));
        }
        throw new IllegalArgumentException("Query must be provided.");
    }

    public PendingResult<Status> requestSync(GoogleApiClient apiClient) {
        return apiClient.zzb(new C07044(this, apiClient));
    }

    public PendingResult<DriveContentsResult> zza(GoogleApiClient googleApiClient, int i) {
        return googleApiClient.zza(new C07022(this, googleApiClient, i));
    }
}
