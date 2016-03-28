package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult;
import com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult;
import com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class GamesMetadataImpl implements GamesMetadata {

    private static abstract class LoadExtendedGamesImpl extends BaseGamesApiMethodImpl<LoadExtendedGamesResult> {

        /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.LoadExtendedGamesImpl.1 */
        class C05821 implements LoadExtendedGamesResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadExtendedGamesImpl zzafY;

            C05821(LoadExtendedGamesImpl loadExtendedGamesImpl, Status status) {
                this.zzafY = loadExtendedGamesImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzO(x0);
        }

        public LoadExtendedGamesResult zzO(Status status) {
            return new C05821(this, status);
        }
    }

    private static abstract class LoadGameInstancesImpl extends BaseGamesApiMethodImpl<LoadGameInstancesResult> {

        /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.LoadGameInstancesImpl.1 */
        class C05831 implements LoadGameInstancesResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadGameInstancesImpl zzafZ;

            C05831(LoadGameInstancesImpl loadGameInstancesImpl, Status status) {
                this.zzafZ = loadGameInstancesImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzP(x0);
        }

        public LoadGameInstancesResult zzP(Status status) {
            return new C05831(this, status);
        }
    }

    private static abstract class LoadGameSearchSuggestionsImpl extends BaseGamesApiMethodImpl<LoadGameSearchSuggestionsResult> {

        /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.LoadGameSearchSuggestionsImpl.1 */
        class C05841 implements LoadGameSearchSuggestionsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadGameSearchSuggestionsImpl zzaga;

            C05841(LoadGameSearchSuggestionsImpl loadGameSearchSuggestionsImpl, Status status) {
                this.zzaga = loadGameSearchSuggestionsImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzQ(x0);
        }

        public LoadGameSearchSuggestionsResult zzQ(Status status) {
            return new C05841(this, status);
        }
    }

    private static abstract class LoadGamesImpl extends BaseGamesApiMethodImpl<LoadGamesResult> {

        /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.LoadGamesImpl.1 */
        class C05851 implements LoadGamesResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadGamesImpl zzagb;

            C05851(LoadGamesImpl loadGamesImpl, Status status) {
                this.zzagb = loadGamesImpl;
                this.zzGT = status;
            }

            public GameBuffer getGames() {
                return new GameBuffer(DataHolder.zzay(14));
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private LoadGamesImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzR(x0);
        }

        public LoadGamesResult zzR(Status status) {
            return new C05851(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.10 */
    class AnonymousClass10 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafS;
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafU;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafS, this.zzafT, false, true, false, this.zzafU);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.11 */
    class AnonymousClass11 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc(this, this.zzafA, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.12 */
    class AnonymousClass12 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc(this, this.zzafA, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.13 */
    class AnonymousClass13 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd(this, this.zzafA, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.14 */
    class AnonymousClass14 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd(this, this.zzafA, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.15 */
    class AnonymousClass15 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafS;
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafU;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafS, this.zzafT, true, false, this.zzafy, this.zzafU);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.16 */
    class AnonymousClass16 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafS;
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafU;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafS, this.zzafT, true, true, false, this.zzafU);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.17 */
    class AnonymousClass17 extends LoadExtendedGamesImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ String zzafV;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zze(this, this.zzafV, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.18 */
    class AnonymousClass18 extends LoadExtendedGamesImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ String zzafV;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zze(this, this.zzafV, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.19 */
    class AnonymousClass19 extends LoadGameSearchSuggestionsImpl {
        final /* synthetic */ String zzafV;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzl(this, this.zzafV);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.1 */
    class C07401 extends LoadGamesImpl {
        final /* synthetic */ GamesMetadataImpl zzafR;

        C07401(GamesMetadataImpl gamesMetadataImpl, GoogleApiClient x0) {
            this.zzafR = gamesMetadataImpl;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzf((zzb) this);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.2 */
    class C07412 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafB;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzj(this, this.zzafB);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.3 */
    class C07423 extends LoadGameInstancesImpl {
        final /* synthetic */ String zzafB;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzk(this, this.zzafB);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.4 */
    class C07434 extends LoadExtendedGamesImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(this, null, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.5 */
    class C07445 extends LoadExtendedGamesImpl {
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(this, null, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.6 */
    class C07456 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(this, this.zzafA, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.7 */
    class C07467 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(this, this.zzafA, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.8 */
    class C07478 extends LoadExtendedGamesImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ int zzafW;
        final /* synthetic */ boolean zzafX;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafT, this.zzafW, this.zzafX, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl.9 */
    class C07489 extends LoadExtendedGamesImpl {
        final /* synthetic */ String zzafS;
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafU;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafS, this.zzafT, false, false, this.zzafy, this.zzafU);
        }
    }

    public Game getCurrentGame(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzns();
    }

    public PendingResult<LoadGamesResult> loadGame(GoogleApiClient apiClient) {
        return apiClient.zza(new C07401(this, apiClient));
    }
}
