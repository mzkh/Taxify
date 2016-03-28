package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

public final class zztp implements Moments {

    private static abstract class zza extends com.google.android.gms.plus.Plus.zza<LoadMomentsResult> {

        /* renamed from: com.google.android.gms.internal.zztp.zza.1 */
        class C06241 implements LoadMomentsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ zza zzauQ;

            C06241(zza com_google_android_gms_internal_zztp_zza, Status status) {
                this.zzauQ = com_google_android_gms_internal_zztp_zza;
                this.zzGT = status;
            }

            public MomentBuffer getMomentBuffer() {
                return null;
            }

            public String getNextPageToken() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public String getUpdated() {
                return null;
            }

            public void release() {
            }
        }

        private zza(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzaJ(x0);
        }

        public LoadMomentsResult zzaJ(Status status) {
            return new C06241(this, status);
        }
    }

    private static abstract class zzb extends com.google.android.gms.plus.Plus.zza<Status> {
        private zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    private static abstract class zzc extends com.google.android.gms.plus.Plus.zza<Status> {
        private zzc(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.internal.zztp.1 */
    class C08461 extends zza {
        final /* synthetic */ zztp zzauJ;

        C08461(zztp com_google_android_gms_internal_zztp, GoogleApiClient googleApiClient) {
            this.zzauJ = com_google_android_gms_internal_zztp;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            com_google_android_gms_plus_internal_zze.zzj(this);
        }
    }

    /* renamed from: com.google.android.gms.internal.zztp.2 */
    class C08472 extends zza {
        final /* synthetic */ int zzagk;
        final /* synthetic */ zztp zzauJ;
        final /* synthetic */ String zzauK;
        final /* synthetic */ Uri zzauL;
        final /* synthetic */ String zzauM;
        final /* synthetic */ String zzauN;

        C08472(zztp com_google_android_gms_internal_zztp, GoogleApiClient googleApiClient, int i, String str, Uri uri, String str2, String str3) {
            this.zzauJ = com_google_android_gms_internal_zztp;
            this.zzagk = i;
            this.zzauK = str;
            this.zzauL = uri;
            this.zzauM = str2;
            this.zzauN = str3;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            com_google_android_gms_plus_internal_zze.zza(this, this.zzagk, this.zzauK, this.zzauL, this.zzauM, this.zzauN);
        }
    }

    /* renamed from: com.google.android.gms.internal.zztp.3 */
    class C08483 extends zzc {
        final /* synthetic */ zztp zzauJ;
        final /* synthetic */ Moment zzauO;

        C08483(zztp com_google_android_gms_internal_zztp, GoogleApiClient googleApiClient, Moment moment) {
            this.zzauJ = com_google_android_gms_internal_zztp;
            this.zzauO = moment;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            com_google_android_gms_plus_internal_zze.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzauO);
        }
    }

    /* renamed from: com.google.android.gms.internal.zztp.4 */
    class C08494 extends zzb {
        final /* synthetic */ zztp zzauJ;
        final /* synthetic */ String zzauP;

        C08494(zztp com_google_android_gms_internal_zztp, GoogleApiClient googleApiClient, String str) {
            this.zzauJ = com_google_android_gms_internal_zztp;
            this.zzauP = str;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            com_google_android_gms_plus_internal_zze.zzcE(this.zzauP);
            setResult(Status.zzNo);
        }
    }

    public PendingResult<LoadMomentsResult> load(GoogleApiClient googleApiClient) {
        return googleApiClient.zza(new C08461(this, googleApiClient));
    }

    public PendingResult<LoadMomentsResult> load(GoogleApiClient googleApiClient, int maxResults, String pageToken, Uri targetUrl, String type, String userId) {
        return googleApiClient.zza(new C08472(this, googleApiClient, maxResults, pageToken, targetUrl, type, userId));
    }

    public PendingResult<Status> remove(GoogleApiClient googleApiClient, String momentId) {
        return googleApiClient.zzb(new C08494(this, googleApiClient, momentId));
    }

    public PendingResult<Status> write(GoogleApiClient googleApiClient, Moment moment) {
        return googleApiClient.zzb(new C08483(this, googleApiClient, moment));
    }
}
