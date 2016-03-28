package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.zze;
import com.google.android.gms.fitness.result.DataReadResult;

public class zzoc implements HistoryApi {

    private static class zza extends com.google.android.gms.internal.zzng.zza {
        private final zzb<DataReadResult> zzHa;
        private int zzaam;
        private DataReadResult zzaan;

        private zza(zzb<DataReadResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_DataReadResult) {
            this.zzaam = 0;
            this.zzaan = null;
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_DataReadResult;
        }

        public void zza(DataReadResult dataReadResult) {
            synchronized (this) {
                Log.v("Fitness", "Received batch result");
                if (this.zzaan == null) {
                    this.zzaan = dataReadResult;
                } else {
                    this.zzaan.zzb(dataReadResult);
                }
                this.zzaam++;
                if (this.zzaam == this.zzaan.zzmn()) {
                    this.zzHa.zzd(this.zzaan);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoc.3 */
    class C06573 extends zza<DataReadResult> {
        final /* synthetic */ zzoc zzaaj;
        final /* synthetic */ DataReadRequest zzaal;

        C06573(zzoc com_google_android_gms_internal_zzoc, GoogleApiClient googleApiClient, DataReadRequest dataReadRequest) {
            this.zzaaj = com_google_android_gms_internal_zzoc;
            this.zzaal = dataReadRequest;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzw(x0);
        }

        protected void zza(zznb com_google_android_gms_internal_zznb) throws RemoteException {
            ((zznl) com_google_android_gms_internal_zznb.zzjb()).zza(new DataReadRequest(this.zzaal, new zza(null), com_google_android_gms_internal_zznb.getContext().getPackageName()));
        }

        protected DataReadResult zzw(Status status) {
            return DataReadResult.zza(status, this.zzaal);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoc.1 */
    class C08101 extends zzc {
        final /* synthetic */ DataSet zzaah;
        final /* synthetic */ boolean zzaai;
        final /* synthetic */ zzoc zzaaj;

        C08101(zzoc com_google_android_gms_internal_zzoc, GoogleApiClient googleApiClient, DataSet dataSet, boolean z) {
            this.zzaaj = com_google_android_gms_internal_zzoc;
            this.zzaah = dataSet;
            this.zzaai = z;
            super(googleApiClient);
        }

        protected void zza(zznb com_google_android_gms_internal_zznb) throws RemoteException {
            ((zznl) com_google_android_gms_internal_zznb.zzjb()).zza(new zze(this.zzaah, new zzoh(this), com_google_android_gms_internal_zznb.getContext().getPackageName(), this.zzaai));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoc.2 */
    class C08112 extends zzc {
        final /* synthetic */ zzoc zzaaj;
        final /* synthetic */ DataDeleteRequest zzaak;

        C08112(zzoc com_google_android_gms_internal_zzoc, GoogleApiClient googleApiClient, DataDeleteRequest dataDeleteRequest) {
            this.zzaaj = com_google_android_gms_internal_zzoc;
            this.zzaak = dataDeleteRequest;
            super(googleApiClient);
        }

        protected void zza(zznb com_google_android_gms_internal_zznb) throws RemoteException {
            ((zznl) com_google_android_gms_internal_zznb.zzjb()).zza(new DataDeleteRequest(this.zzaak, new zzoh(this), com_google_android_gms_internal_zznb.getContext().getPackageName()));
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, DataSet dataSet, boolean z) {
        zzx.zzb((Object) dataSet, (Object) "Must set the data set");
        zzx.zza(!dataSet.getDataPoints().isEmpty(), (Object) "Cannot use an empty data set");
        zzx.zzb(dataSet.getDataSource().zzlz(), (Object) "Must set the app package name for the data source");
        return googleApiClient.zza(new C08101(this, googleApiClient, dataSet, z));
    }

    public PendingResult<Status> deleteData(GoogleApiClient client, DataDeleteRequest request) {
        return client.zza(new C08112(this, client, request));
    }

    public PendingResult<Status> insertData(GoogleApiClient client, DataSet dataSet) {
        return zza(client, dataSet, false);
    }

    public PendingResult<DataReadResult> readData(GoogleApiClient client, DataReadRequest request) {
        return client.zza(new C06573(this, client, request));
    }
}
