package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.Players.LoadOwnerCoverPhotoUrisResult;
import com.google.android.gms.games.Players.LoadPlayersResult;
import com.google.android.gms.games.Players.LoadProfileSettingsResult;
import com.google.android.gms.games.Players.LoadXpForGameCategoriesResult;
import com.google.android.gms.games.Players.LoadXpStreamResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl implements Players {

    private static abstract class LoadOwnerCoverPhotoUrisImpl extends BaseGamesApiMethodImpl<LoadOwnerCoverPhotoUrisResult> {

        /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.LoadOwnerCoverPhotoUrisImpl.1 */
        class C05961 implements LoadOwnerCoverPhotoUrisResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadOwnerCoverPhotoUrisImpl zzagH;

            C05961(LoadOwnerCoverPhotoUrisImpl loadOwnerCoverPhotoUrisImpl, Status status) {
                this.zzagH = loadOwnerCoverPhotoUrisImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzab(x0);
        }

        public LoadOwnerCoverPhotoUrisResult zzab(Status status) {
            return new C05961(this, status);
        }
    }

    private static abstract class LoadPlayersImpl extends BaseGamesApiMethodImpl<LoadPlayersResult> {

        /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.LoadPlayersImpl.1 */
        class C05971 implements LoadPlayersResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadPlayersImpl zzagI;

            C05971(LoadPlayersImpl loadPlayersImpl, Status status) {
                this.zzagI = loadPlayersImpl;
                this.zzGT = status;
            }

            public PlayerBuffer getPlayers() {
                return new PlayerBuffer(DataHolder.zzay(14));
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private LoadPlayersImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzac(x0);
        }

        public LoadPlayersResult zzac(Status status) {
            return new C05971(this, status);
        }
    }

    private static abstract class LoadProfileSettingsResultImpl extends BaseGamesApiMethodImpl<LoadProfileSettingsResult> {

        /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.LoadProfileSettingsResultImpl.1 */
        class C05981 implements LoadProfileSettingsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadProfileSettingsResultImpl zzagJ;

            C05981(LoadProfileSettingsResultImpl loadProfileSettingsResultImpl, Status status) {
                this.zzagJ = loadProfileSettingsResultImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public boolean isProfileVisible() {
                return true;
            }

            public boolean isVisibilityExplicitlySet() {
                return false;
            }
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzad(x0);
        }

        protected LoadProfileSettingsResult zzad(Status status) {
            return new C05981(this, status);
        }
    }

    private static abstract class LoadXpForGameCategoriesResultImpl extends BaseGamesApiMethodImpl<LoadXpForGameCategoriesResult> {

        /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.LoadXpForGameCategoriesResultImpl.1 */
        class C05991 implements LoadXpForGameCategoriesResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadXpForGameCategoriesResultImpl zzagK;

            C05991(LoadXpForGameCategoriesResultImpl loadXpForGameCategoriesResultImpl, Status status) {
                this.zzagK = loadXpForGameCategoriesResultImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzae(x0);
        }

        public LoadXpForGameCategoriesResult zzae(Status status) {
            return new C05991(this, status);
        }
    }

    private static abstract class LoadXpStreamResultImpl extends BaseGamesApiMethodImpl<LoadXpStreamResult> {

        /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.LoadXpStreamResultImpl.1 */
        class C06001 implements LoadXpStreamResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadXpStreamResultImpl zzagL;

            C06001(LoadXpStreamResultImpl loadXpStreamResultImpl, Status status) {
                this.zzagL = loadXpStreamResultImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzaf(x0);
        }

        public LoadXpStreamResult zzaf(Status status) {
            return new C06001(this, status);
        }
    }

    private static abstract class UpdateProfileSettingsResultImpl extends BaseGamesApiMethodImpl<Status> {
        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        protected Status zzb(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.10 */
    class AnonymousClass10 extends LoadPlayersImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, "nearby", this.zzafB, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.11 */
    class AnonymousClass11 extends LoadPlayersImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, "played_with", this.zzafB, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.12 */
    class AnonymousClass12 extends LoadPlayersImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, "played_with", this.zzafB, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.13 */
    class AnonymousClass13 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.14 */
    class AnonymousClass14 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.15 */
    class AnonymousClass15 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.16 */
    class AnonymousClass16 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.17 */
    class AnonymousClass17 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd(this, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.18 */
    class AnonymousClass18 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd(this, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.19 */
    class AnonymousClass19 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ String zzafV;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzf(this, this.zzafV, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.1 */
    class C07641 extends LoadPlayersImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ PlayersImpl zzagB;

        C07641(PlayersImpl playersImpl, GoogleApiClient x0, String str) {
            this.zzagB = playersImpl;
            this.zzafA = str;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafA, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.20 */
    class AnonymousClass20 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ String zzafV;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzf(this, this.zzafV, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.21 */
    class AnonymousClass21 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ String zzagC;
        final /* synthetic */ String zzagt;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzagC, this.zzagt, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.22 */
    class AnonymousClass22 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ String zzagC;
        final /* synthetic */ String zzagt;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzagC, this.zzagt, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.23 */
    class AnonymousClass23 extends LoadOwnerCoverPhotoUrisImpl {
        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzg(this);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.24 */
    class AnonymousClass24 extends LoadXpForGameCategoriesResultImpl {
        final /* synthetic */ String zzagD;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzm(this, this.zzagD);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.25 */
    class AnonymousClass25 extends LoadXpStreamResultImpl {
        final /* synthetic */ String zzagD;
        final /* synthetic */ int zzagE;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzagD, this.zzagE);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.26 */
    class AnonymousClass26 extends LoadXpStreamResultImpl {
        final /* synthetic */ String zzagD;
        final /* synthetic */ int zzagE;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd((zzb) this, this.zzagD, this.zzagE);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.27 */
    class AnonymousClass27 extends LoadProfileSettingsResultImpl {
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzf((zzb) this, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.28 */
    class AnonymousClass28 extends UpdateProfileSettingsResultImpl {
        final /* synthetic */ boolean zzagF;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzg((zzb) this, this.zzagF);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.2 */
    class C07652 extends LoadPlayersImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ PlayersImpl zzagB;

        C07652(PlayersImpl playersImpl, GoogleApiClient x0, String str, boolean z) {
            this.zzagB = playersImpl;
            this.zzafA = str;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafA, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.3 */
    class C07663 extends LoadPlayersImpl {
        final /* synthetic */ String[] zzagG;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzagG);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.4 */
    class C07674 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ PlayersImpl zzagB;

        C07674(PlayersImpl playersImpl, GoogleApiClient x0, int i, boolean z) {
            this.zzagB = playersImpl;
            this.zzafT = i;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.5 */
    class C07685 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ PlayersImpl zzagB;

        C07685(PlayersImpl playersImpl, GoogleApiClient x0, int i) {
            this.zzagB = playersImpl;
            this.zzafT = i;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.6 */
    class C07696 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ PlayersImpl zzagB;

        C07696(PlayersImpl playersImpl, GoogleApiClient x0, int i, boolean z) {
            this.zzagB = playersImpl;
            this.zzafT = i;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, "played_with", this.zzafT, false, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.7 */
    class C07707 extends LoadPlayersImpl {
        final /* synthetic */ int zzafT;
        final /* synthetic */ PlayersImpl zzagB;

        C07707(PlayersImpl playersImpl, GoogleApiClient x0, int i) {
            this.zzagB = playersImpl;
            this.zzafT = i;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, "played_with", this.zzafT, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.8 */
    class C07718 extends LoadPlayersImpl {
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ PlayersImpl zzagB;

        C07718(PlayersImpl playersImpl, GoogleApiClient x0, boolean z) {
            this.zzagB = playersImpl;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl.9 */
    class C07729 extends LoadPlayersImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ int zzafT;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, "nearby", this.zzafB, this.zzafT, false, false);
        }
    }

    public Intent getCompareProfileIntent(GoogleApiClient apiClient, Player player) {
        return Games.zzd(apiClient).zza(new PlayerEntity(player));
    }

    public Player getCurrentPlayer(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznr();
    }

    public String getCurrentPlayerId(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznq();
    }

    public Intent getPlayerSearchIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznB();
    }

    public PendingResult<LoadPlayersResult> loadConnectedPlayers(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new C07718(this, apiClient, forceReload));
    }

    public PendingResult<LoadPlayersResult> loadInvitablePlayers(GoogleApiClient apiClient, int pageSize, boolean forceReload) {
        return apiClient.zza(new C07674(this, apiClient, pageSize, forceReload));
    }

    public PendingResult<LoadPlayersResult> loadMoreInvitablePlayers(GoogleApiClient apiClient, int pageSize) {
        return apiClient.zza(new C07685(this, apiClient, pageSize));
    }

    public PendingResult<LoadPlayersResult> loadMoreRecentlyPlayedWithPlayers(GoogleApiClient apiClient, int pageSize) {
        return apiClient.zza(new C07707(this, apiClient, pageSize));
    }

    public PendingResult<LoadPlayersResult> loadPlayer(GoogleApiClient apiClient, String playerId) {
        return apiClient.zza(new C07641(this, apiClient, playerId));
    }

    public PendingResult<LoadPlayersResult> loadPlayer(GoogleApiClient apiClient, String playerId, boolean forceReload) {
        return apiClient.zza(new C07652(this, apiClient, playerId, forceReload));
    }

    public PendingResult<LoadPlayersResult> loadRecentlyPlayedWithPlayers(GoogleApiClient apiClient, int pageSize, boolean forceReload) {
        return apiClient.zza(new C07696(this, apiClient, pageSize, forceReload));
    }
}
