package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.zze;
import com.google.android.gms.common.api.zze.zzb;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;
import com.google.android.gms.drive.DriveId;

public class zzt extends zzy implements DriveFile {

    private static class zza implements DownloadProgressListener {
        private final zze<DownloadProgressListener> zzTW;

        /* renamed from: com.google.android.gms.drive.internal.zzt.zza.1 */
        class C03611 implements zzb<DownloadProgressListener> {
            final /* synthetic */ long zzTX;
            final /* synthetic */ long zzTY;
            final /* synthetic */ zza zzTZ;

            C03611(zza com_google_android_gms_drive_internal_zzt_zza, long j, long j2) {
                this.zzTZ = com_google_android_gms_drive_internal_zzt_zza;
                this.zzTX = j;
                this.zzTY = j2;
            }

            public void zza(DownloadProgressListener downloadProgressListener) {
                downloadProgressListener.onProgress(this.zzTX, this.zzTY);
            }

            public /* synthetic */ void zze(Object obj) {
                zza((DownloadProgressListener) obj);
            }

            public void zzhX() {
            }
        }

        public zza(zze<DownloadProgressListener> com_google_android_gms_common_api_zze_com_google_android_gms_drive_DriveFile_DownloadProgressListener) {
            this.zzTW = com_google_android_gms_common_api_zze_com_google_android_gms_drive_DriveFile_DownloadProgressListener;
        }

        public void onProgress(long bytesDownloaded, long bytesExpected) {
            this.zzTW.zza(new C03611(this, bytesDownloaded, bytesExpected));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzt.1 */
    class C07131 extends zzb {
        final /* synthetic */ DownloadProgressListener zzTU;
        final /* synthetic */ zzt zzTV;
        final /* synthetic */ int zzTy;

        C07131(zzt com_google_android_gms_drive_internal_zzt, GoogleApiClient googleApiClient, int i, DownloadProgressListener downloadProgressListener) {
            this.zzTV = com_google_android_gms_drive_internal_zzt;
            this.zzTy = i;
            this.zzTU = downloadProgressListener;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new OpenContentsRequest(this.zzTV.getDriveId(), this.zzTy, 0), new zzbe(this, this.zzTU));
        }
    }

    public zzt(DriveId driveId) {
        super(driveId);
    }

    private static DownloadProgressListener zza(GoogleApiClient googleApiClient, DownloadProgressListener downloadProgressListener) {
        return downloadProgressListener == null ? null : new zza(googleApiClient.zzf(downloadProgressListener));
    }

    public PendingResult<DriveContentsResult> open(GoogleApiClient apiClient, int mode, DownloadProgressListener listener) {
        if (mode == DriveFile.MODE_READ_ONLY || mode == DriveFile.MODE_WRITE_ONLY || mode == DriveFile.MODE_READ_WRITE) {
            return apiClient.zza(new C07131(this, apiClient, mode, zza(apiClient, listener)));
        }
        throw new IllegalArgumentException("Invalid mode provided.");
    }
}
