package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.zzat;
import com.google.android.gms.fitness.request.zzax;
import com.google.android.gms.fitness.request.zzw;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

public class zzoe implements RecordingApi {

    private static class zza extends com.google.android.gms.internal.zznq.zza {
        private final zzb<ListSubscriptionsResult> zzHa;

        private zza(zzb<ListSubscriptionsResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_ListSubscriptionsResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_ListSubscriptionsResult;
        }

        public void zza(ListSubscriptionsResult listSubscriptionsResult) {
            this.zzHa.zzd(listSubscriptionsResult);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoe.1 */
    class C06581 extends zza<ListSubscriptionsResult> {
        final /* synthetic */ zzoe zzaao;

        C06581(zzoe com_google_android_gms_internal_zzoe, GoogleApiClient googleApiClient) {
            this.zzaao = com_google_android_gms_internal_zzoe;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzx(x0);
        }

        protected void zza(zznd com_google_android_gms_internal_zznd) throws RemoteException {
            ((zznn) com_google_android_gms_internal_zznd.zzjb()).zza(new zzw(null, new zza(null), com_google_android_gms_internal_zznd.getContext().getPackageName()));
        }

        protected ListSubscriptionsResult zzx(Status status) {
            return ListSubscriptionsResult.zzE(status);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoe.2 */
    class C06592 extends zza<ListSubscriptionsResult> {
        final /* synthetic */ zzoe zzaao;
        final /* synthetic */ DataType zzaap;

        C06592(zzoe com_google_android_gms_internal_zzoe, GoogleApiClient googleApiClient, DataType dataType) {
            this.zzaao = com_google_android_gms_internal_zzoe;
            this.zzaap = dataType;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzx(x0);
        }

        protected void zza(zznd com_google_android_gms_internal_zznd) throws RemoteException {
            ((zznn) com_google_android_gms_internal_zznd.zzjb()).zza(new zzw(this.zzaap, new zza(null), com_google_android_gms_internal_zznd.getContext().getPackageName()));
        }

        protected ListSubscriptionsResult zzx(Status status) {
            return ListSubscriptionsResult.zzE(status);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoe.3 */
    class C08123 extends zzc {
        final /* synthetic */ zzoe zzaao;
        final /* synthetic */ Subscription zzaaq;

        C08123(zzoe com_google_android_gms_internal_zzoe, GoogleApiClient googleApiClient, Subscription subscription) {
            this.zzaao = com_google_android_gms_internal_zzoe;
            this.zzaaq = subscription;
            super(googleApiClient);
        }

        protected void zza(zznd com_google_android_gms_internal_zznd) throws RemoteException {
            ((zznn) com_google_android_gms_internal_zznd.zzjb()).zza(new zzat(this.zzaaq, false, new zzoh(this), com_google_android_gms_internal_zznd.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoe.4 */
    class C08134 extends zzc {
        final /* synthetic */ zzoe zzaao;
        final /* synthetic */ DataType zzaap;

        C08134(zzoe com_google_android_gms_internal_zzoe, GoogleApiClient googleApiClient, DataType dataType) {
            this.zzaao = com_google_android_gms_internal_zzoe;
            this.zzaap = dataType;
            super(googleApiClient);
        }

        protected void zza(zznd com_google_android_gms_internal_zznd) throws RemoteException {
            ((zznn) com_google_android_gms_internal_zznd.zzjb()).zza(new zzax(this.zzaap, null, new zzoh(this), com_google_android_gms_internal_zznd.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoe.5 */
    class C08145 extends zzc {
        final /* synthetic */ zzoe zzaao;
        final /* synthetic */ DataSource zzaar;

        C08145(zzoe com_google_android_gms_internal_zzoe, GoogleApiClient googleApiClient, DataSource dataSource) {
            this.zzaao = com_google_android_gms_internal_zzoe;
            this.zzaar = dataSource;
            super(googleApiClient);
        }

        protected void zza(zznd com_google_android_gms_internal_zznd) throws RemoteException {
            ((zznn) com_google_android_gms_internal_zznd.zzjb()).zza(new zzax(null, this.zzaar, new zzoh(this), com_google_android_gms_internal_zznd.getContext().getPackageName()));
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, Subscription subscription) {
        return googleApiClient.zza(new C08123(this, googleApiClient, subscription));
    }

    public PendingResult<ListSubscriptionsResult> listSubscriptions(GoogleApiClient client) {
        return client.zza(new C06581(this, client));
    }

    public PendingResult<ListSubscriptionsResult> listSubscriptions(GoogleApiClient client, DataType dataType) {
        return client.zza(new C06592(this, client, dataType));
    }

    public PendingResult<Status> subscribe(GoogleApiClient client, DataSource dataSource) {
        return zza(client, new com.google.android.gms.fitness.data.Subscription.zza().zzb(dataSource).zzlK());
    }

    public PendingResult<Status> subscribe(GoogleApiClient client, DataType dataType) {
        return zza(client, new com.google.android.gms.fitness.data.Subscription.zza().zzb(dataType).zzlK());
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient client, DataSource dataSource) {
        return client.zzb(new C08145(this, client, dataSource));
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient client, DataType dataType) {
        return client.zzb(new C08134(this, client, dataType));
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient client, Subscription subscription) {
        return subscription.getDataType() == null ? unsubscribe(client, subscription.getDataSource()) : unsubscribe(client, subscription.getDataType());
    }
}
