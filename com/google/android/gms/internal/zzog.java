package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.zzai;
import com.google.android.gms.fitness.request.zzak;
import com.google.android.gms.fitness.request.zzam;
import com.google.android.gms.fitness.request.zzao;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import java.util.concurrent.TimeUnit;

public class zzog implements SessionsApi {

    private static class zza extends com.google.android.gms.internal.zznt.zza {
        private final com.google.android.gms.common.api.zza.zzb<SessionReadResult> zzHa;

        private zza(com.google.android.gms.common.api.zza.zzb<SessionReadResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_SessionReadResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_SessionReadResult;
        }

        public void zza(SessionReadResult sessionReadResult) throws RemoteException {
            this.zzHa.zzd(sessionReadResult);
        }
    }

    private static class zzb extends com.google.android.gms.internal.zznu.zza {
        private final com.google.android.gms.common.api.zza.zzb<SessionStopResult> zzHa;

        private zzb(com.google.android.gms.common.api.zza.zzb<SessionStopResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_SessionStopResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_SessionStopResult;
        }

        public void zza(SessionStopResult sessionStopResult) {
            this.zzHa.zzd(sessionStopResult);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzog.2 */
    class C06612 extends zza<SessionStopResult> {
        final /* synthetic */ String val$name;
        final /* synthetic */ zzog zzaaD;
        final /* synthetic */ String zzaaE;

        C06612(zzog com_google_android_gms_internal_zzog, GoogleApiClient googleApiClient, String str, String str2) {
            this.zzaaD = com_google_android_gms_internal_zzog;
            this.val$name = str;
            this.zzaaE = str2;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzz(x0);
        }

        protected void zza(zznf com_google_android_gms_internal_zznf) throws RemoteException {
            ((zznp) com_google_android_gms_internal_zznf.zzjb()).zza(new zzam(this.val$name, this.zzaaE, new zzb(null), com_google_android_gms_internal_zznf.getContext().getPackageName()));
        }

        protected SessionStopResult zzz(Status status) {
            return SessionStopResult.zzG(status);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzog.4 */
    class C06624 extends zza<SessionReadResult> {
        final /* synthetic */ zzog zzaaD;
        final /* synthetic */ SessionReadRequest zzaaG;

        C06624(zzog com_google_android_gms_internal_zzog, GoogleApiClient googleApiClient, SessionReadRequest sessionReadRequest) {
            this.zzaaD = com_google_android_gms_internal_zzog;
            this.zzaaG = sessionReadRequest;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzA(x0);
        }

        protected SessionReadResult zzA(Status status) {
            return SessionReadResult.zzF(status);
        }

        protected void zza(zznf com_google_android_gms_internal_zznf) throws RemoteException {
            ((zznp) com_google_android_gms_internal_zznf.zzjb()).zza(new SessionReadRequest(this.zzaaG, new zza(null), com_google_android_gms_internal_zznf.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzog.1 */
    class C08171 extends zzc {
        final /* synthetic */ Session zzaaC;
        final /* synthetic */ zzog zzaaD;

        C08171(zzog com_google_android_gms_internal_zzog, GoogleApiClient googleApiClient, Session session) {
            this.zzaaD = com_google_android_gms_internal_zzog;
            this.zzaaC = session;
            super(googleApiClient);
        }

        protected void zza(zznf com_google_android_gms_internal_zznf) throws RemoteException {
            ((zznp) com_google_android_gms_internal_zznf.zzjb()).zza(new zzak(this.zzaaC, new zzoh(this), com_google_android_gms_internal_zznf.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzog.3 */
    class C08183 extends zzc {
        final /* synthetic */ zzog zzaaD;
        final /* synthetic */ SessionInsertRequest zzaaF;

        C08183(zzog com_google_android_gms_internal_zzog, GoogleApiClient googleApiClient, SessionInsertRequest sessionInsertRequest) {
            this.zzaaD = com_google_android_gms_internal_zzog;
            this.zzaaF = sessionInsertRequest;
            super(googleApiClient);
        }

        protected void zza(zznf com_google_android_gms_internal_zznf) throws RemoteException {
            ((zznp) com_google_android_gms_internal_zznf.zzjb()).zza(new SessionInsertRequest(this.zzaaF, new zzoh(this), com_google_android_gms_internal_zznf.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzog.5 */
    class C08195 extends zzc {
        final /* synthetic */ zzog zzaaD;
        final /* synthetic */ PendingIntent zzaaw;

        C08195(zzog com_google_android_gms_internal_zzog, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
            this.zzaaD = com_google_android_gms_internal_zzog;
            this.zzaaw = pendingIntent;
            super(googleApiClient);
        }

        protected void zza(zznf com_google_android_gms_internal_zznf) throws RemoteException {
            ((zznp) com_google_android_gms_internal_zznf.zzjb()).zza(new zzai(this.zzaaw, new zzoh(this), com_google_android_gms_internal_zznf.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzog.6 */
    class C08206 extends zzc {
        final /* synthetic */ zzog zzaaD;
        final /* synthetic */ PendingIntent zzaaw;

        C08206(zzog com_google_android_gms_internal_zzog, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
            this.zzaaD = com_google_android_gms_internal_zzog;
            this.zzaaw = pendingIntent;
            super(googleApiClient);
        }

        protected void zza(zznf com_google_android_gms_internal_zznf) throws RemoteException {
            ((zznp) com_google_android_gms_internal_zznf.zzjb()).zza(new zzao(this.zzaaw, new zzoh(this), com_google_android_gms_internal_zznf.getContext().getPackageName()));
        }
    }

    private PendingResult<SessionStopResult> zza(GoogleApiClient googleApiClient, String str, String str2) {
        return googleApiClient.zzb(new C06612(this, googleApiClient, str, str2));
    }

    public PendingResult<Status> insertSession(GoogleApiClient client, SessionInsertRequest request) {
        return client.zza(new C08183(this, client, request));
    }

    public PendingResult<SessionReadResult> readSession(GoogleApiClient client, SessionReadRequest request) {
        return client.zza(new C06624(this, client, request));
    }

    public PendingResult<Status> registerForSessions(GoogleApiClient client, PendingIntent intent) {
        return client.zzb(new C08195(this, client, intent));
    }

    public PendingResult<Status> startSession(GoogleApiClient client, Session session) {
        zzx.zzb((Object) session, (Object) "Session cannot be null");
        zzx.zzb(session.getEndTime(TimeUnit.MILLISECONDS) == 0, (Object) "Cannot start a session which has already ended");
        return client.zzb(new C08171(this, client, session));
    }

    public PendingResult<SessionStopResult> stopSession(GoogleApiClient client, String identifier) {
        return zza(client, null, identifier);
    }

    public PendingResult<Status> unregisterForSessions(GoogleApiClient client, PendingIntent intent) {
        return client.zzb(new C08206(this, client, intent));
    }
}
