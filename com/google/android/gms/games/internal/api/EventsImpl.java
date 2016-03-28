package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.event.Events.LoadEventsResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class EventsImpl implements Events {

    private static abstract class LoadImpl extends BaseGamesApiMethodImpl<LoadEventsResult> {

        /* renamed from: com.google.android.gms.games.internal.api.EventsImpl.LoadImpl.1 */
        class C05811 implements LoadEventsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadImpl zzafP;

            C05811(LoadImpl loadImpl, Status status) {
                this.zzafP = loadImpl;
                this.zzGT = status;
            }

            public EventBuffer getEvents() {
                return new EventBuffer(DataHolder.zzay(14));
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private LoadImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzN(x0);
        }

        public LoadEventsResult zzN(Status status) {
            return new C05811(this, status);
        }
    }

    private static abstract class UpdateImpl extends BaseGamesApiMethodImpl<Result> {

        /* renamed from: com.google.android.gms.games.internal.api.EventsImpl.UpdateImpl.1 */
        class C03741 implements Result {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ UpdateImpl zzafQ;

            C03741(UpdateImpl updateImpl, Status status) {
                this.zzafQ = updateImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private UpdateImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public Result createFailedResult(Status status) {
            return new C03741(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.EventsImpl.1 */
    class C07371 extends LoadImpl {
        final /* synthetic */ String[] zzafL;
        final /* synthetic */ EventsImpl zzafM;
        final /* synthetic */ boolean zzafy;

        C07371(EventsImpl eventsImpl, GoogleApiClient x0, boolean z, String[] strArr) {
            this.zzafM = eventsImpl;
            this.zzafy = z;
            this.zzafL = strArr;
            super(null);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafy, this.zzafL);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.EventsImpl.2 */
    class C07382 extends LoadImpl {
        final /* synthetic */ EventsImpl zzafM;
        final /* synthetic */ boolean zzafy;

        C07382(EventsImpl eventsImpl, GoogleApiClient x0, boolean z) {
            this.zzafM = eventsImpl;
            this.zzafy = z;
            super(null);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd((zzb) this, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.EventsImpl.3 */
    class C07393 extends UpdateImpl {
        final /* synthetic */ EventsImpl zzafM;
        final /* synthetic */ String zzafN;
        final /* synthetic */ int zzafO;

        C07393(EventsImpl eventsImpl, GoogleApiClient x0, String str, int i) {
            this.zzafM = eventsImpl;
            this.zzafN = str;
            this.zzafO = i;
            super(null);
        }

        public void zza(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.zzp(this.zzafN, this.zzafO);
        }
    }

    public void increment(GoogleApiClient apiClient, String eventId, int incrementAmount) {
        GamesClientImpl zzc = Games.zzc(apiClient, false);
        if (zzc != null) {
            if (zzc.isConnected()) {
                zzc.zzp(eventId, incrementAmount);
            } else {
                apiClient.zzb(new C07393(this, apiClient, eventId, incrementAmount));
            }
        }
    }

    public PendingResult<LoadEventsResult> load(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new C07382(this, apiClient, forceReload));
    }

    public PendingResult<LoadEventsResult> loadByIds(GoogleApiClient apiClient, boolean forceReload, String... eventIds) {
        return apiClient.zza(new C07371(this, apiClient, forceReload, eventIds));
    }
}
