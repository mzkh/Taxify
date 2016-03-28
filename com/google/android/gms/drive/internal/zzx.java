package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;
import com.google.android.gms.drive.FileUploadPreferences;

public class zzx implements DrivePreferencesApi {

    private class zzb implements FileUploadPreferencesResult {
        private final Status zzHb;
        final /* synthetic */ zzx zzUi;
        private final FileUploadPreferences zzUk;

        private zzb(zzx com_google_android_gms_drive_internal_zzx, Status status, FileUploadPreferences fileUploadPreferences) {
            this.zzUi = com_google_android_gms_drive_internal_zzx;
            this.zzHb = status;
            this.zzUk = fileUploadPreferences;
        }

        public FileUploadPreferences getFileUploadPreferences() {
            return this.zzUk;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    private class zza extends zzc {
        private final com.google.android.gms.common.api.zza.zzb<FileUploadPreferencesResult> zzHa;
        final /* synthetic */ zzx zzUi;

        private zza(zzx com_google_android_gms_drive_internal_zzx, com.google.android.gms.common.api.zza.zzb<FileUploadPreferencesResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DrivePreferencesApi_FileUploadPreferencesResult) {
            this.zzUi = com_google_android_gms_drive_internal_zzx;
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_drive_DrivePreferencesApi_FileUploadPreferencesResult;
        }

        public void zza(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) throws RemoteException {
            this.zzHa.zzd(new zzb(Status.zzNo, onDeviceUsagePreferenceResponse.zzkN(), null));
        }

        public void zzm(Status status) throws RemoteException {
            this.zzHa.zzd(new zzb(status, null, null));
        }
    }

    private abstract class zzc extends zzq<FileUploadPreferencesResult> {
        final /* synthetic */ zzx zzUi;

        public zzc(zzx com_google_android_gms_drive_internal_zzx, GoogleApiClient googleApiClient) {
            this.zzUi = com_google_android_gms_drive_internal_zzx;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzs(x0);
        }

        protected FileUploadPreferencesResult zzs(Status status) {
            return new zzb(status, null, null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzx.1 */
    class C07161 extends zzc {
        final /* synthetic */ zzx zzUi;

        C07161(zzx com_google_android_gms_drive_internal_zzx, GoogleApiClient googleApiClient) {
            this.zzUi = com_google_android_gms_drive_internal_zzx;
            super(com_google_android_gms_drive_internal_zzx, googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zzh(new zza(this, null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzx.2 */
    class C07172 extends com.google.android.gms.drive.internal.zzq.zza {
        final /* synthetic */ zzx zzUi;
        final /* synthetic */ FileUploadPreferencesImpl zzUj;

        C07172(zzx com_google_android_gms_drive_internal_zzx, GoogleApiClient googleApiClient, FileUploadPreferencesImpl fileUploadPreferencesImpl) {
            this.zzUi = com_google_android_gms_drive_internal_zzx;
            this.zzUj = fileUploadPreferencesImpl;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new SetFileUploadPreferencesRequest(this.zzUj), new zzbl(this));
        }
    }

    public PendingResult<FileUploadPreferencesResult> getFileUploadPreferences(GoogleApiClient apiClient) {
        return apiClient.zza(new C07161(this, apiClient));
    }

    public PendingResult<Status> setFileUploadPreferences(GoogleApiClient apiClient, FileUploadPreferences fileUploadPreferences) {
        if (fileUploadPreferences instanceof FileUploadPreferencesImpl) {
            return apiClient.zzb(new C07172(this, apiClient, (FileUploadPreferencesImpl) fileUploadPreferences));
        }
        throw new IllegalArgumentException("Invalid preference value");
    }
}
