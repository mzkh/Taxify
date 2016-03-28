package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.zzl;
import com.google.android.gms.fitness.request.zzp;
import com.google.android.gms.fitness.result.DataTypeResult;

public class zzob implements ConfigApi {

    private static class zza extends com.google.android.gms.internal.zzni.zza {
        private final zzb<DataTypeResult> zzHa;

        private zza(zzb<DataTypeResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_DataTypeResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_DataTypeResult;
        }

        public void zza(DataTypeResult dataTypeResult) {
            this.zzHa.zzd(dataTypeResult);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzob.1 */
    class C06551 extends zza<DataTypeResult> {
        final /* synthetic */ DataTypeCreateRequest zzaae;
        final /* synthetic */ zzob zzaaf;

        C06551(zzob com_google_android_gms_internal_zzob, GoogleApiClient googleApiClient, DataTypeCreateRequest dataTypeCreateRequest) {
            this.zzaaf = com_google_android_gms_internal_zzob;
            this.zzaae = dataTypeCreateRequest;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzv(x0);
        }

        protected void zza(zzna com_google_android_gms_internal_zzna) throws RemoteException {
            ((zznk) com_google_android_gms_internal_zzna.zzjb()).zza(new DataTypeCreateRequest(this.zzaae, new zza(null), com_google_android_gms_internal_zzna.getContext().getPackageName()));
        }

        protected DataTypeResult zzv(Status status) {
            return DataTypeResult.zzD(status);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzob.2 */
    class C06562 extends zza<DataTypeResult> {
        final /* synthetic */ zzob zzaaf;
        final /* synthetic */ String zzaag;

        C06562(zzob com_google_android_gms_internal_zzob, GoogleApiClient googleApiClient, String str) {
            this.zzaaf = com_google_android_gms_internal_zzob;
            this.zzaag = str;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzv(x0);
        }

        protected void zza(zzna com_google_android_gms_internal_zzna) throws RemoteException {
            ((zznk) com_google_android_gms_internal_zzna.zzjb()).zza(new zzl(this.zzaag, new zza(null), com_google_android_gms_internal_zzna.getContext().getPackageName()));
        }

        protected DataTypeResult zzv(Status status) {
            return DataTypeResult.zzD(status);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzob.3 */
    class C08093 extends zzc {
        final /* synthetic */ zzob zzaaf;

        C08093(zzob com_google_android_gms_internal_zzob, GoogleApiClient googleApiClient) {
            this.zzaaf = com_google_android_gms_internal_zzob;
            super(googleApiClient);
        }

        protected void zza(zzna com_google_android_gms_internal_zzna) throws RemoteException {
            ((zznk) com_google_android_gms_internal_zzna.zzjb()).zza(new zzp(new zzoh(this), com_google_android_gms_internal_zzna.getContext().getPackageName()));
        }
    }

    public PendingResult<DataTypeResult> createCustomDataType(GoogleApiClient client, DataTypeCreateRequest request) {
        return client.zzb(new C06551(this, client, request));
    }

    public PendingResult<Status> disableFit(GoogleApiClient client) {
        return client.zzb(new C08093(this, client));
    }

    public PendingResult<DataTypeResult> readDataType(GoogleApiClient client, String dataTypeName) {
        return client.zza(new C06562(this, client, dataTypeName));
    }
}
