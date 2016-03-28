package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public final class zztq implements People {

    private static abstract class zza extends com.google.android.gms.plus.Plus.zza<LoadPeopleResult> {

        /* renamed from: com.google.android.gms.internal.zztq.zza.1 */
        class C06251 implements LoadPeopleResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ zza zzauV;

            C06251(zza com_google_android_gms_internal_zztq_zza, Status status) {
                this.zzauV = com_google_android_gms_internal_zztq_zza;
                this.zzGT = status;
            }

            public String getNextPageToken() {
                return null;
            }

            public PersonBuffer getPersonBuffer() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private zza(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzaK(x0);
        }

        public LoadPeopleResult zzaK(Status status) {
            return new C06251(this, status);
        }
    }

    /* renamed from: com.google.android.gms.internal.zztq.1 */
    class C08501 extends zza {
        final /* synthetic */ String zzauK;
        final /* synthetic */ int zzauR;
        final /* synthetic */ zztq zzauS;

        C08501(zztq com_google_android_gms_internal_zztq, GoogleApiClient googleApiClient, int i, String str) {
            this.zzauS = com_google_android_gms_internal_zztq;
            this.zzauR = i;
            this.zzauK = str;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            setCancelToken(com_google_android_gms_plus_internal_zze.zza((zzb) this, this.zzauR, this.zzauK));
        }
    }

    /* renamed from: com.google.android.gms.internal.zztq.2 */
    class C08512 extends zza {
        final /* synthetic */ String zzauK;
        final /* synthetic */ zztq zzauS;

        C08512(zztq com_google_android_gms_internal_zztq, GoogleApiClient googleApiClient, String str) {
            this.zzauS = com_google_android_gms_internal_zztq;
            this.zzauK = str;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            setCancelToken(com_google_android_gms_plus_internal_zze.zzr(this, this.zzauK));
        }
    }

    /* renamed from: com.google.android.gms.internal.zztq.3 */
    class C08523 extends zza {
        final /* synthetic */ zztq zzauS;

        C08523(zztq com_google_android_gms_internal_zztq, GoogleApiClient googleApiClient) {
            this.zzauS = com_google_android_gms_internal_zztq;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            com_google_android_gms_plus_internal_zze.zzk(this);
        }
    }

    /* renamed from: com.google.android.gms.internal.zztq.4 */
    class C08534 extends zza {
        final /* synthetic */ zztq zzauS;
        final /* synthetic */ Collection zzauT;

        C08534(zztq com_google_android_gms_internal_zztq, GoogleApiClient googleApiClient, Collection collection) {
            this.zzauS = com_google_android_gms_internal_zztq;
            this.zzauT = collection;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            com_google_android_gms_plus_internal_zze.zza((zzb) this, this.zzauT);
        }
    }

    /* renamed from: com.google.android.gms.internal.zztq.5 */
    class C08545 extends zza {
        final /* synthetic */ zztq zzauS;
        final /* synthetic */ String[] zzauU;

        C08545(zztq com_google_android_gms_internal_zztq, GoogleApiClient googleApiClient, String[] strArr) {
            this.zzauS = com_google_android_gms_internal_zztq;
            this.zzauU = strArr;
            super(null);
        }

        protected void zza(zze com_google_android_gms_plus_internal_zze) {
            com_google_android_gms_plus_internal_zze.zzd(this, this.zzauU);
        }
    }

    public Person getCurrentPerson(GoogleApiClient googleApiClient) {
        return Plus.zzf(googleApiClient, true).zzrO();
    }

    public PendingResult<LoadPeopleResult> load(GoogleApiClient googleApiClient, Collection<String> personIds) {
        return googleApiClient.zza(new C08534(this, googleApiClient, personIds));
    }

    public PendingResult<LoadPeopleResult> load(GoogleApiClient googleApiClient, String... personIds) {
        return googleApiClient.zza(new C08545(this, googleApiClient, personIds));
    }

    public PendingResult<LoadPeopleResult> loadConnected(GoogleApiClient googleApiClient) {
        return googleApiClient.zza(new C08523(this, googleApiClient));
    }

    public PendingResult<LoadPeopleResult> loadVisible(GoogleApiClient googleApiClient, int orderBy, String pageToken) {
        return googleApiClient.zza(new C08501(this, googleApiClient, orderBy, pageToken));
    }

    public PendingResult<LoadPeopleResult> loadVisible(GoogleApiClient googleApiClient, String pageToken) {
        return googleApiClient.zza(new C08512(this, googleApiClient, pageToken));
    }
}
