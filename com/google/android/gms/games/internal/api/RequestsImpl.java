package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.request.Requests.LoadRequestSummariesResult;
import com.google.android.gms.games.request.Requests.LoadRequestsResult;
import com.google.android.gms.games.request.Requests.SendRequestResult;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class RequestsImpl implements Requests {

    private static abstract class LoadRequestSummariesImpl extends BaseGamesApiMethodImpl<LoadRequestSummariesResult> {

        /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.LoadRequestSummariesImpl.1 */
        class C06041 implements LoadRequestSummariesResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadRequestSummariesImpl zzahd;

            C06041(LoadRequestSummariesImpl loadRequestSummariesImpl, Status status) {
                this.zzahd = loadRequestSummariesImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzaj(x0);
        }

        public LoadRequestSummariesResult zzaj(Status status) {
            return new C06041(this, status);
        }
    }

    private static abstract class LoadRequestsImpl extends BaseGamesApiMethodImpl<LoadRequestsResult> {

        /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.LoadRequestsImpl.1 */
        class C06051 implements LoadRequestsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadRequestsImpl zzahe;

            C06051(LoadRequestsImpl loadRequestsImpl, Status status) {
                this.zzahe = loadRequestsImpl;
                this.zzGT = status;
            }

            public GameRequestBuffer getRequests(int type) {
                return new GameRequestBuffer(DataHolder.zzay(this.zzGT.getStatusCode()));
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private LoadRequestsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzak(x0);
        }

        public LoadRequestsResult zzak(Status status) {
            return new C06051(this, status);
        }
    }

    private static abstract class SendRequestImpl extends BaseGamesApiMethodImpl<SendRequestResult> {

        /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.SendRequestImpl.1 */
        class C06061 implements SendRequestResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ SendRequestImpl zzahf;

            C06061(SendRequestImpl sendRequestImpl, Status status) {
                this.zzahf = sendRequestImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzal(x0);
        }

        public SendRequestResult zzal(Status status) {
            return new C06061(this, status);
        }
    }

    private static abstract class UpdateRequestsImpl extends BaseGamesApiMethodImpl<UpdateRequestsResult> {

        /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.UpdateRequestsImpl.1 */
        class C06071 implements UpdateRequestsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ UpdateRequestsImpl zzahg;

            C06071(UpdateRequestsImpl updateRequestsImpl, Status status) {
                this.zzahg = updateRequestsImpl;
                this.zzGT = status;
            }

            public Set<String> getRequestIds() {
                return null;
            }

            public int getRequestOutcome(String requestId) {
                throw new IllegalArgumentException("Unknown request ID " + requestId);
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private UpdateRequestsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzam(x0);
        }

        public UpdateRequestsResult zzam(Status status) {
            return new C06071(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.1 */
    class C07791 extends UpdateRequestsImpl {
        final /* synthetic */ String[] zzagV;
        final /* synthetic */ RequestsImpl zzagW;

        C07791(RequestsImpl requestsImpl, GoogleApiClient x0, String[] strArr) {
            this.zzagW = requestsImpl;
            this.zzagV = strArr;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzagV);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.2 */
    class C07802 extends UpdateRequestsImpl {
        final /* synthetic */ String[] zzagV;
        final /* synthetic */ RequestsImpl zzagW;

        C07802(RequestsImpl requestsImpl, GoogleApiClient x0, String[] strArr) {
            this.zzagW = requestsImpl;
            this.zzagV = strArr;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzagV);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.3 */
    class C07813 extends LoadRequestsImpl {
        final /* synthetic */ RequestsImpl zzagW;
        final /* synthetic */ int zzagX;
        final /* synthetic */ int zzagY;
        final /* synthetic */ int zzagc;

        C07813(RequestsImpl requestsImpl, GoogleApiClient x0, int i, int i2, int i3) {
            this.zzagW = requestsImpl;
            this.zzagX = i;
            this.zzagY = i2;
            this.zzagc = i3;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzagX, this.zzagY, this.zzagc);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.4 */
    class C07824 extends SendRequestImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ String[] zzagZ;
        final /* synthetic */ int zzaha;
        final /* synthetic */ byte[] zzahb;
        final /* synthetic */ int zzahc;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafB, this.zzagZ, this.zzaha, this.zzahb, this.zzahc);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.5 */
    class C07835 extends SendRequestImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ String[] zzagZ;
        final /* synthetic */ int zzaha;
        final /* synthetic */ byte[] zzahb;
        final /* synthetic */ int zzahc;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafB, this.zzagZ, this.zzaha, this.zzahb, this.zzahc);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.6 */
    class C07846 extends UpdateRequestsImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ String zzagR;
        final /* synthetic */ String[] zzagV;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafB, this.zzagR, this.zzagV);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.7 */
    class C07857 extends LoadRequestsImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ String zzagR;
        final /* synthetic */ int zzagX;
        final /* synthetic */ int zzagY;
        final /* synthetic */ int zzagc;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafB, this.zzagR, this.zzagX, this.zzagY, this.zzagc);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl.8 */
    class C07868 extends LoadRequestSummariesImpl {
        final /* synthetic */ String zzagR;
        final /* synthetic */ int zzagY;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzf(this, this.zzagR, this.zzagY);
        }
    }

    public PendingResult<UpdateRequestsResult> acceptRequest(GoogleApiClient apiClient, String requestId) {
        List arrayList = new ArrayList();
        arrayList.add(requestId);
        return acceptRequests(apiClient, arrayList);
    }

    public PendingResult<UpdateRequestsResult> acceptRequests(GoogleApiClient apiClient, List<String> requestIds) {
        return apiClient.zzb(new C07791(this, apiClient, requestIds == null ? null : (String[]) requestIds.toArray(new String[requestIds.size()])));
    }

    public PendingResult<UpdateRequestsResult> dismissRequest(GoogleApiClient apiClient, String requestId) {
        List arrayList = new ArrayList();
        arrayList.add(requestId);
        return dismissRequests(apiClient, arrayList);
    }

    public PendingResult<UpdateRequestsResult> dismissRequests(GoogleApiClient apiClient, List<String> requestIds) {
        return apiClient.zzb(new C07802(this, apiClient, requestIds == null ? null : (String[]) requestIds.toArray(new String[requestIds.size()])));
    }

    public ArrayList<GameRequest> getGameRequestsFromBundle(Bundle extras) {
        if (extras == null || !extras.containsKey(Requests.EXTRA_REQUESTS)) {
            return new ArrayList();
        }
        ArrayList arrayList = (ArrayList) extras.get(Requests.EXTRA_REQUESTS);
        ArrayList<GameRequest> arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add((GameRequest) arrayList.get(i));
        }
        return arrayList2;
    }

    public ArrayList<GameRequest> getGameRequestsFromInboxResponse(Intent response) {
        return response == null ? new ArrayList() : getGameRequestsFromBundle(response.getExtras());
    }

    public Intent getInboxIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznG();
    }

    public int getMaxLifetimeDays(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznI();
    }

    public int getMaxPayloadSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznH();
    }

    public Intent getSendIntent(GoogleApiClient apiClient, int type, byte[] payload, int requestLifetimeDays, Bitmap icon, String description) {
        return Games.zzd(apiClient).zza(type, payload, requestLifetimeDays, icon, description);
    }

    public PendingResult<LoadRequestsResult> loadRequests(GoogleApiClient apiClient, int requestDirection, int types, int sortOrder) {
        return apiClient.zza(new C07813(this, apiClient, requestDirection, types, sortOrder));
    }

    public void registerRequestListener(GoogleApiClient apiClient, OnRequestReceivedListener listener) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzd(apiClient.zzf(listener));
        }
    }

    public void unregisterRequestListener(GoogleApiClient apiClient) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zznA();
        }
    }
}
