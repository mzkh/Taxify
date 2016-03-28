package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.request.zzac;
import com.google.android.gms.fitness.request.zzae;
import com.google.android.gms.fitness.result.DataSourcesResult;

public class zzof implements SensorsApi {

    private interface zza {
        void zzlN();
    }

    /* renamed from: com.google.android.gms.internal.zzof.3 */
    class C04173 implements zza {
        final /* synthetic */ zzof zzaat;
        final /* synthetic */ OnDataPointListener zzaax;

        C04173(zzof com_google_android_gms_internal_zzof, OnDataPointListener onDataPointListener) {
            this.zzaat = com_google_android_gms_internal_zzof;
            this.zzaax = onDataPointListener;
        }

        public void zzlN() {
            com.google.android.gms.fitness.data.zzl.zza.zzlG().zzc(this.zzaax);
        }
    }

    private static class zzb extends com.google.android.gms.internal.zznh.zza {
        private final com.google.android.gms.common.api.zza.zzb<DataSourcesResult> zzHa;

        private zzb(com.google.android.gms.common.api.zza.zzb<DataSourcesResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_DataSourcesResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_DataSourcesResult;
        }

        public void zza(DataSourcesResult dataSourcesResult) {
            this.zzHa.zzd(dataSourcesResult);
        }
    }

    private static class zzc extends com.google.android.gms.internal.zznv.zza {
        private final com.google.android.gms.common.api.zza.zzb<Status> zzHa;
        private final zza zzaaB;

        private zzc(com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, zza com_google_android_gms_internal_zzof_zza) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status;
            this.zzaaB = com_google_android_gms_internal_zzof_zza;
        }

        public void zzi(Status status) {
            if (this.zzaaB != null && status.isSuccess()) {
                this.zzaaB.zzlN();
            }
            this.zzHa.zzd(status);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzof.1 */
    class C06601 extends zza<DataSourcesResult> {
        final /* synthetic */ DataSourcesRequest zzaas;
        final /* synthetic */ zzof zzaat;

        C06601(zzof com_google_android_gms_internal_zzof, GoogleApiClient googleApiClient, DataSourcesRequest dataSourcesRequest) {
            this.zzaat = com_google_android_gms_internal_zzof;
            this.zzaas = dataSourcesRequest;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzy(x0);
        }

        protected void zza(zzne com_google_android_gms_internal_zzne) throws RemoteException {
            ((zzno) com_google_android_gms_internal_zzne.zzjb()).zza(new DataSourcesRequest(this.zzaas, new zzb(null), com_google_android_gms_internal_zzne.getContext().getPackageName()));
        }

        protected DataSourcesResult zzy(Status status) {
            return DataSourcesResult.zzC(status);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzof.2 */
    class C08152 extends zzc {
        final /* synthetic */ zzof zzaat;
        final /* synthetic */ SensorRequest zzaau;
        final /* synthetic */ zzk zzaav;
        final /* synthetic */ PendingIntent zzaaw;

        C08152(zzof com_google_android_gms_internal_zzof, GoogleApiClient googleApiClient, SensorRequest sensorRequest, zzk com_google_android_gms_fitness_data_zzk, PendingIntent pendingIntent) {
            this.zzaat = com_google_android_gms_internal_zzof;
            this.zzaau = sensorRequest;
            this.zzaav = com_google_android_gms_fitness_data_zzk;
            this.zzaaw = pendingIntent;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        protected void zza(zzne com_google_android_gms_internal_zzne) throws RemoteException {
            zznv com_google_android_gms_internal_zzoh = new zzoh(this);
            String packageName = com_google_android_gms_internal_zzne.getContext().getPackageName();
            ((zzno) com_google_android_gms_internal_zzne.zzjb()).zza(new zzac(this.zzaau, this.zzaav, this.zzaaw, com_google_android_gms_internal_zzoh, packageName));
        }

        protected Status zzb(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzof.4 */
    class C08164 extends zzc {
        final /* synthetic */ PendingIntent zzaaA;
        final /* synthetic */ zzof zzaat;
        final /* synthetic */ zza zzaay;
        final /* synthetic */ zzk zzaaz;

        C08164(zzof com_google_android_gms_internal_zzof, GoogleApiClient googleApiClient, zza com_google_android_gms_internal_zzof_zza, zzk com_google_android_gms_fitness_data_zzk, PendingIntent pendingIntent) {
            this.zzaat = com_google_android_gms_internal_zzof;
            this.zzaay = com_google_android_gms_internal_zzof_zza;
            this.zzaaz = com_google_android_gms_fitness_data_zzk;
            this.zzaaA = pendingIntent;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        protected void zza(zzne com_google_android_gms_internal_zzne) throws RemoteException {
            ((zzno) com_google_android_gms_internal_zzne.zzjb()).zza(new zzae(this.zzaaz, this.zzaaA, new zzc(this.zzaay, null), com_google_android_gms_internal_zzne.getContext().getPackageName()));
        }

        protected Status zzb(Status status) {
            return status;
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, zzk com_google_android_gms_fitness_data_zzk, PendingIntent pendingIntent, zza com_google_android_gms_internal_zzof_zza) {
        return googleApiClient.zzb(new C08164(this, googleApiClient, com_google_android_gms_internal_zzof_zza, com_google_android_gms_fitness_data_zzk, pendingIntent));
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, SensorRequest sensorRequest, zzk com_google_android_gms_fitness_data_zzk, PendingIntent pendingIntent) {
        return googleApiClient.zza(new C08152(this, googleApiClient, sensorRequest, com_google_android_gms_fitness_data_zzk, pendingIntent));
    }

    public PendingResult<Status> add(GoogleApiClient client, SensorRequest request, PendingIntent intent) {
        return zza(client, request, null, intent);
    }

    public PendingResult<Status> add(GoogleApiClient client, SensorRequest request, OnDataPointListener listener) {
        return zza(client, request, com.google.android.gms.fitness.data.zzl.zza.zzlG().zza(listener), null);
    }

    public PendingResult<DataSourcesResult> findDataSources(GoogleApiClient client, DataSourcesRequest request) {
        return client.zza(new C06601(this, client, request));
    }

    public PendingResult<Status> remove(GoogleApiClient client, PendingIntent pendingIntent) {
        return zza(client, null, pendingIntent, null);
    }

    public PendingResult<Status> remove(GoogleApiClient client, OnDataPointListener listener) {
        zzk zzb = com.google.android.gms.fitness.data.zzl.zza.zzlG().zzb(listener);
        return zzb == null ? new zznx(Status.zzNo) : zza(client, zzb, null, new C04173(this, listener));
    }
}
