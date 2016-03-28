package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceLikelihoodBuffer;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzi;
import com.google.android.gms.location.places.zzi.zzd;
import com.google.android.gms.location.places.zzi.zzg;

public class zzpw implements PlaceDetectionApi {

    /* renamed from: com.google.android.gms.internal.zzpw.1 */
    class C08361 extends zzd<zzpx> {
        final /* synthetic */ PlaceFilter zzaot;
        final /* synthetic */ zzpw zzaou;

        C08361(zzpw com_google_android_gms_internal_zzpw, zzc com_google_android_gms_common_api_Api_zzc, GoogleApiClient googleApiClient, PlaceFilter placeFilter) {
            this.zzaou = com_google_android_gms_internal_zzpw;
            this.zzaot = placeFilter;
            super(com_google_android_gms_common_api_Api_zzc, googleApiClient);
        }

        protected void zza(zzpx com_google_android_gms_internal_zzpx) throws RemoteException {
            com_google_android_gms_internal_zzpx.zza(new zzi((zzd) this, com_google_android_gms_internal_zzpx.getContext()), this.zzaot);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzpw.2 */
    class C08372 extends zzg<zzpx> {
        final /* synthetic */ zzpw zzaou;
        final /* synthetic */ PlaceReport zzaov;

        C08372(zzpw com_google_android_gms_internal_zzpw, zzc com_google_android_gms_common_api_Api_zzc, GoogleApiClient googleApiClient, PlaceReport placeReport) {
            this.zzaou = com_google_android_gms_internal_zzpw;
            this.zzaov = placeReport;
            super(com_google_android_gms_common_api_Api_zzc, googleApiClient);
        }

        protected void zza(zzpx com_google_android_gms_internal_zzpx) throws RemoteException {
            com_google_android_gms_internal_zzpx.zza(new zzi((zzg) this), this.zzaov);
        }
    }

    public PendingResult<PlaceLikelihoodBuffer> getCurrentPlace(GoogleApiClient client, PlaceFilter filter) {
        return client.zza(new C08361(this, Places.zzanU, client, filter));
    }

    public PendingResult<Status> reportDeviceAtPlace(GoogleApiClient client, PlaceReport report) {
        return client.zzb(new C08372(this, Places.zzanU, client, report));
    }
}
