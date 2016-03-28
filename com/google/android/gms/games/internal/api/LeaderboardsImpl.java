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
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

public final class LeaderboardsImpl implements Leaderboards {

    private static abstract class LoadMetadataImpl extends BaseGamesApiMethodImpl<LeaderboardMetadataResult> {

        /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.LoadMetadataImpl.1 */
        class C05871 implements LeaderboardMetadataResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadMetadataImpl zzagp;

            C05871(LoadMetadataImpl loadMetadataImpl, Status status) {
                this.zzagp = loadMetadataImpl;
                this.zzGT = status;
            }

            public LeaderboardBuffer getLeaderboards() {
                return new LeaderboardBuffer(DataHolder.zzay(14));
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private LoadMetadataImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzT(x0);
        }

        public LeaderboardMetadataResult zzT(Status status) {
            return new C05871(this, status);
        }
    }

    private static abstract class LoadPlayerScoreImpl extends BaseGamesApiMethodImpl<LoadPlayerScoreResult> {

        /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.LoadPlayerScoreImpl.1 */
        class C05881 implements LoadPlayerScoreResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadPlayerScoreImpl zzagq;

            C05881(LoadPlayerScoreImpl loadPlayerScoreImpl, Status status) {
                this.zzagq = loadPlayerScoreImpl;
                this.zzGT = status;
            }

            public LeaderboardScore getScore() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private LoadPlayerScoreImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzU(x0);
        }

        public LoadPlayerScoreResult zzU(Status status) {
            return new C05881(this, status);
        }
    }

    private static abstract class LoadScoresImpl extends BaseGamesApiMethodImpl<LoadScoresResult> {

        /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.LoadScoresImpl.1 */
        class C05891 implements LoadScoresResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadScoresImpl zzagr;

            C05891(LoadScoresImpl loadScoresImpl, Status status) {
                this.zzagr = loadScoresImpl;
                this.zzGT = status;
            }

            public Leaderboard getLeaderboard() {
                return null;
            }

            public LeaderboardScoreBuffer getScores() {
                return new LeaderboardScoreBuffer(DataHolder.zzay(14));
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private LoadScoresImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzV(x0);
        }

        public LoadScoresResult zzV(Status status) {
            return new C05891(this, status);
        }
    }

    protected static abstract class SubmitScoreImpl extends BaseGamesApiMethodImpl<SubmitScoreResult> {

        /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.SubmitScoreImpl.1 */
        class C05901 implements SubmitScoreResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ SubmitScoreImpl zzags;

            C05901(SubmitScoreImpl submitScoreImpl, Status status) {
                this.zzags = submitScoreImpl;
                this.zzGT = status;
            }

            public ScoreSubmissionData getScoreData() {
                return new ScoreSubmissionData(DataHolder.zzay(14));
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        protected SubmitScoreImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzW(x0);
        }

        public SubmitScoreResult zzW(Status status) {
            return new C05901(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.10 */
    class AnonymousClass10 extends LoadScoresImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ String zzagh;
        final /* synthetic */ int zzagi;
        final /* synthetic */ int zzagj;
        final /* synthetic */ int zzagk;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafB, this.zzagh, this.zzagi, this.zzagj, this.zzagk, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.11 */
    class AnonymousClass11 extends LoadScoresImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ String zzagh;
        final /* synthetic */ int zzagi;
        final /* synthetic */ int zzagj;
        final /* synthetic */ int zzagk;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(this, this.zzafB, this.zzagh, this.zzagi, this.zzagj, this.zzagk, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.1 */
    class C07521 extends LoadMetadataImpl {
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ LeaderboardsImpl zzagg;

        C07521(LeaderboardsImpl leaderboardsImpl, GoogleApiClient x0, boolean z) {
            this.zzagg = leaderboardsImpl;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.2 */
    class C07532 extends LoadMetadataImpl {
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ LeaderboardsImpl zzagg;
        final /* synthetic */ String zzagh;

        C07532(LeaderboardsImpl leaderboardsImpl, GoogleApiClient x0, String str, boolean z) {
            this.zzagg = leaderboardsImpl;
            this.zzagh = str;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzagh, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.3 */
    class C07543 extends LoadPlayerScoreImpl {
        final /* synthetic */ LeaderboardsImpl zzagg;
        final /* synthetic */ String zzagh;
        final /* synthetic */ int zzagi;
        final /* synthetic */ int zzagj;

        C07543(LeaderboardsImpl leaderboardsImpl, GoogleApiClient x0, String str, int i, int i2) {
            this.zzagg = leaderboardsImpl;
            this.zzagh = str;
            this.zzagi = i;
            this.zzagj = i2;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, null, this.zzagh, this.zzagi, this.zzagj);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.4 */
    class C07554 extends LoadScoresImpl {
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ LeaderboardsImpl zzagg;
        final /* synthetic */ String zzagh;
        final /* synthetic */ int zzagi;
        final /* synthetic */ int zzagj;
        final /* synthetic */ int zzagk;

        C07554(LeaderboardsImpl leaderboardsImpl, GoogleApiClient x0, String str, int i, int i2, int i3, boolean z) {
            this.zzagg = leaderboardsImpl;
            this.zzagh = str;
            this.zzagi = i;
            this.zzagj = i2;
            this.zzagk = i3;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzagh, this.zzagi, this.zzagj, this.zzagk, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.5 */
    class C07565 extends LoadScoresImpl {
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ LeaderboardsImpl zzagg;
        final /* synthetic */ String zzagh;
        final /* synthetic */ int zzagi;
        final /* synthetic */ int zzagj;
        final /* synthetic */ int zzagk;

        C07565(LeaderboardsImpl leaderboardsImpl, GoogleApiClient x0, String str, int i, int i2, int i3, boolean z) {
            this.zzagg = leaderboardsImpl;
            this.zzagh = str;
            this.zzagi = i;
            this.zzagj = i2;
            this.zzagk = i3;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzagh, this.zzagi, this.zzagj, this.zzagk, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.6 */
    class C07576 extends LoadScoresImpl {
        final /* synthetic */ LeaderboardsImpl zzagg;
        final /* synthetic */ int zzagk;
        final /* synthetic */ LeaderboardScoreBuffer zzagl;
        final /* synthetic */ int zzagm;

        C07576(LeaderboardsImpl leaderboardsImpl, GoogleApiClient x0, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
            this.zzagg = leaderboardsImpl;
            this.zzagl = leaderboardScoreBuffer;
            this.zzagk = i;
            this.zzagm = i2;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzagl, this.zzagk, this.zzagm);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.7 */
    class C07587 extends SubmitScoreImpl {
        final /* synthetic */ LeaderboardsImpl zzagg;
        final /* synthetic */ String zzagh;
        final /* synthetic */ long zzagn;
        final /* synthetic */ String zzago;

        C07587(LeaderboardsImpl leaderboardsImpl, GoogleApiClient x0, String str, long j, String str2) {
            this.zzagg = leaderboardsImpl;
            this.zzagh = str;
            this.zzagn = j;
            this.zzago = str2;
            super(x0);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzagh, this.zzagn, this.zzago);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.8 */
    class C07598 extends LoadMetadataImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzafB, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl.9 */
    class C07609 extends LoadMetadataImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ String zzagh;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafB, this.zzagh, this.zzafy);
        }
    }

    public Intent getAllLeaderboardsIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznt();
    }

    public Intent getLeaderboardIntent(GoogleApiClient apiClient, String leaderboardId) {
        return getLeaderboardIntent(apiClient, leaderboardId, -1);
    }

    public Intent getLeaderboardIntent(GoogleApiClient apiClient, String leaderboardId, int timeSpan) {
        return Games.zzd(apiClient).zzo(leaderboardId, timeSpan);
    }

    public PendingResult<LoadPlayerScoreResult> loadCurrentPlayerLeaderboardScore(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection) {
        return apiClient.zza(new C07543(this, apiClient, leaderboardId, span, leaderboardCollection));
    }

    public PendingResult<LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient apiClient, String leaderboardId, boolean forceReload) {
        return apiClient.zza(new C07532(this, apiClient, leaderboardId, forceReload));
    }

    public PendingResult<LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new C07521(this, apiClient, forceReload));
    }

    public PendingResult<LoadScoresResult> loadMoreScores(GoogleApiClient apiClient, LeaderboardScoreBuffer buffer, int maxResults, int pageDirection) {
        return apiClient.zza(new C07576(this, apiClient, buffer, maxResults, pageDirection));
    }

    public PendingResult<LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults) {
        return loadPlayerCenteredScores(apiClient, leaderboardId, span, leaderboardCollection, maxResults, false);
    }

    public PendingResult<LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults, boolean forceReload) {
        return apiClient.zza(new C07565(this, apiClient, leaderboardId, span, leaderboardCollection, maxResults, forceReload));
    }

    public PendingResult<LoadScoresResult> loadTopScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults) {
        return loadTopScores(apiClient, leaderboardId, span, leaderboardCollection, maxResults, false);
    }

    public PendingResult<LoadScoresResult> loadTopScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults, boolean forceReload) {
        return apiClient.zza(new C07554(this, apiClient, leaderboardId, span, leaderboardCollection, maxResults, forceReload));
    }

    public void submitScore(GoogleApiClient apiClient, String leaderboardId, long score) {
        submitScore(apiClient, leaderboardId, score, null);
    }

    public void submitScore(GoogleApiClient apiClient, String leaderboardId, long score, String scoreTag) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            try {
                zzb.zza(null, leaderboardId, score, scoreTag);
            } catch (RemoteException e) {
                GamesLog.zzr("LeaderboardsImpl", "service died");
            }
        }
    }

    public PendingResult<SubmitScoreResult> submitScoreImmediate(GoogleApiClient apiClient, String leaderboardId, long score) {
        return submitScoreImmediate(apiClient, leaderboardId, score, null);
    }

    public PendingResult<SubmitScoreResult> submitScoreImmediate(GoogleApiClient apiClient, String leaderboardId, long score, String scoreTag) {
        return apiClient.zzb(new C07587(this, apiClient, leaderboardId, score, scoreTag));
    }
}
