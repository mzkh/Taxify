package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.Panorama;
import com.google.android.gms.panorama.PanoramaApi;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

public class zzsw implements PanoramaApi {

    /* renamed from: com.google.android.gms.internal.zzsw.3 */
    static class C06233 extends com.google.android.gms.internal.zzsu.zza {
        final /* synthetic */ Uri zzatx;
        final /* synthetic */ zzsu zzatz;
        final /* synthetic */ Context zznK;

        C06233(Context context, Uri uri, zzsu com_google_android_gms_internal_zzsu) {
            this.zznK = context;
            this.zzatx = uri;
            this.zzatz = com_google_android_gms_internal_zzsu;
        }

        public void zza(int i, Bundle bundle, int i2, Intent intent) throws RemoteException {
            zzsw.zza(this.zznK, this.zzatx);
            this.zzatz.zza(i, bundle, i2, intent);
        }
    }

    private static final class zzb extends com.google.android.gms.internal.zzsu.zza {
        private final com.google.android.gms.common.api.zza.zzb<PanoramaResult> zzHa;

        public zzb(com.google.android.gms.common.api.zza.zzb<PanoramaResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_panorama_PanoramaApi_PanoramaResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_panorama_PanoramaApi_PanoramaResult;
        }

        public void zza(int i, Bundle bundle, int i2, Intent intent) {
            this.zzHa.zzd(new zzsy(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null), intent));
        }
    }

    private static abstract class zzc<R extends Result> extends com.google.android.gms.common.api.zza.zza<R, zzsx> {
        protected zzc(GoogleApiClient googleApiClient) {
            super(Panorama.zzGR, googleApiClient);
        }

        protected abstract void zza(Context context, zzsv com_google_android_gms_internal_zzsv) throws RemoteException;

        protected final void zza(zzsx com_google_android_gms_internal_zzsx) throws RemoteException {
            zza(com_google_android_gms_internal_zzsx.getContext(), (zzsv) com_google_android_gms_internal_zzsx.zzjb());
        }
    }

    private static abstract class zza extends zzc<PanoramaResult> {
        public zza(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaH(x0);
        }

        protected PanoramaResult zzaH(Status status) {
            return new zzsy(status, null);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzsw.1 */
    class C08431 extends zza {
        final /* synthetic */ Uri zzatx;
        final /* synthetic */ zzsw zzaty;

        C08431(zzsw com_google_android_gms_internal_zzsw, GoogleApiClient googleApiClient, Uri uri) {
            this.zzaty = com_google_android_gms_internal_zzsw;
            this.zzatx = uri;
            super(googleApiClient);
        }

        protected void zza(Context context, zzsv com_google_android_gms_internal_zzsv) throws RemoteException {
            com_google_android_gms_internal_zzsv.zza(new zzb(this), this.zzatx, null, false);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzsw.2 */
    class C08442 extends zza {
        final /* synthetic */ Uri zzatx;
        final /* synthetic */ zzsw zzaty;

        C08442(zzsw com_google_android_gms_internal_zzsw, GoogleApiClient googleApiClient, Uri uri) {
            this.zzaty = com_google_android_gms_internal_zzsw;
            this.zzatx = uri;
            super(googleApiClient);
        }

        protected void zza(Context context, zzsv com_google_android_gms_internal_zzsv) throws RemoteException {
            zzsw.zza(context, com_google_android_gms_internal_zzsv, new zzb(this), this.zzatx, null);
        }
    }

    private static void zza(Context context, Uri uri) {
        context.revokeUriPermission(uri, 1);
    }

    private static void zza(Context context, zzsv com_google_android_gms_internal_zzsv, zzsu com_google_android_gms_internal_zzsu, Uri uri, Bundle bundle) throws RemoteException {
        context.grantUriPermission(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, uri, 1);
        try {
            com_google_android_gms_internal_zzsv.zza(new C06233(context, uri, com_google_android_gms_internal_zzsu), uri, bundle, true);
        } catch (RemoteException e) {
            zza(context, uri);
            throw e;
        } catch (RuntimeException e2) {
            zza(context, uri);
            throw e2;
        }
    }

    public PendingResult<PanoramaResult> loadPanoramaInfo(GoogleApiClient client, Uri uri) {
        return client.zza(new C08431(this, client, uri));
    }

    public PendingResult<PanoramaResult> loadPanoramaInfoAndGrantAccess(GoogleApiClient client, Uri uri) {
        return client.zza(new C08442(this, client, uri));
    }
}
