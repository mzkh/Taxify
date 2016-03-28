package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult;
import java.util.List;

public final class TurnBasedMultiplayerImpl implements TurnBasedMultiplayer {

    private static abstract class CancelMatchImpl extends BaseGamesApiMethodImpl<CancelMatchResult> {
        private final String zzFA;

        /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.CancelMatchImpl.1 */
        class C06121 implements CancelMatchResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ CancelMatchImpl zzahD;

            C06121(CancelMatchImpl cancelMatchImpl, Status status) {
                this.zzahD = cancelMatchImpl;
                this.zzGT = status;
            }

            public String getMatchId() {
                return this.zzahD.zzFA;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public CancelMatchImpl(String id, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.zzFA = id;
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzar(x0);
        }

        public CancelMatchResult zzar(Status status) {
            return new C06121(this, status);
        }
    }

    private static abstract class InitiateMatchImpl extends BaseGamesApiMethodImpl<InitiateMatchResult> {

        /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.InitiateMatchImpl.1 */
        class C06131 implements InitiateMatchResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ InitiateMatchImpl zzahE;

            C06131(InitiateMatchImpl initiateMatchImpl, Status status) {
                this.zzahE = initiateMatchImpl;
                this.zzGT = status;
            }

            public TurnBasedMatch getMatch() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private InitiateMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzas(x0);
        }

        public InitiateMatchResult zzas(Status status) {
            return new C06131(this, status);
        }
    }

    private static abstract class LeaveMatchImpl extends BaseGamesApiMethodImpl<LeaveMatchResult> {

        /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.LeaveMatchImpl.1 */
        class C06141 implements LeaveMatchResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LeaveMatchImpl zzahF;

            C06141(LeaveMatchImpl leaveMatchImpl, Status status) {
                this.zzahF = leaveMatchImpl;
                this.zzGT = status;
            }

            public TurnBasedMatch getMatch() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private LeaveMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzat(x0);
        }

        public LeaveMatchResult zzat(Status status) {
            return new C06141(this, status);
        }
    }

    private static abstract class LoadMatchImpl extends BaseGamesApiMethodImpl<LoadMatchResult> {

        /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.LoadMatchImpl.1 */
        class C06151 implements LoadMatchResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadMatchImpl zzahG;

            C06151(LoadMatchImpl loadMatchImpl, Status status) {
                this.zzahG = loadMatchImpl;
                this.zzGT = status;
            }

            public TurnBasedMatch getMatch() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private LoadMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzau(x0);
        }

        public LoadMatchResult zzau(Status status) {
            return new C06151(this, status);
        }
    }

    private static abstract class LoadMatchesImpl extends BaseGamesApiMethodImpl<LoadMatchesResult> {

        /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.LoadMatchesImpl.1 */
        class C06161 implements LoadMatchesResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadMatchesImpl zzahH;

            C06161(LoadMatchesImpl loadMatchesImpl, Status status) {
                this.zzahH = loadMatchesImpl;
                this.zzGT = status;
            }

            public LoadMatchesResponse getMatches() {
                return new LoadMatchesResponse(new Bundle());
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private LoadMatchesImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzav(x0);
        }

        public LoadMatchesResult zzav(Status status) {
            return new C06161(this, status);
        }
    }

    private static abstract class UpdateMatchImpl extends BaseGamesApiMethodImpl<UpdateMatchResult> {

        /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.UpdateMatchImpl.1 */
        class C06171 implements UpdateMatchResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ UpdateMatchImpl zzahI;

            C06171(UpdateMatchImpl updateMatchImpl, Status status) {
                this.zzahI = updateMatchImpl;
                this.zzGT = status;
            }

            public TurnBasedMatch getMatch() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private UpdateMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzaw(x0);
        }

        public UpdateMatchResult zzaw(Status status) {
            return new C06171(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.10 */
    class AnonymousClass10 extends LoadMatchImpl {
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;
        final /* synthetic */ String zzahx;

        AnonymousClass10(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, GoogleApiClient x0, String str) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzahx = str;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzg((zzb) this, this.zzahx);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.11 */
    class AnonymousClass11 extends InitiateMatchImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ String zzahx;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzafB, this.zzahx);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.12 */
    class AnonymousClass12 extends InitiateMatchImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ String zzahx;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd((zzb) this, this.zzafB, this.zzahx);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.13 */
    class AnonymousClass13 extends LoadMatchesImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ int zzahy;
        final /* synthetic */ int[] zzahz;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafB, this.zzahy, this.zzahz);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.1 */
    class C07931 extends InitiateMatchImpl {
        final /* synthetic */ TurnBasedMatchConfig zzahv;
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;

        C07931(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, GoogleApiClient x0, TurnBasedMatchConfig turnBasedMatchConfig) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzahv = turnBasedMatchConfig;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzahv);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.2 */
    class C07942 extends InitiateMatchImpl {
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;
        final /* synthetic */ String zzahx;

        C07942(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, GoogleApiClient x0, String str) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzahx = str;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzahx);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.3 */
    class C07953 extends InitiateMatchImpl {
        final /* synthetic */ String zzage;
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;

        C07953(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, GoogleApiClient x0, String str) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzage = str;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd((zzb) this, this.zzage);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.4 */
    class C07964 extends UpdateMatchImpl {
        final /* synthetic */ byte[] zzahA;
        final /* synthetic */ String zzahB;
        final /* synthetic */ ParticipantResult[] zzahC;
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;
        final /* synthetic */ String zzahx;

        C07964(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, GoogleApiClient x0, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzahx = str;
            this.zzahA = bArr;
            this.zzahB = str2;
            this.zzahC = participantResultArr;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzahx, this.zzahA, this.zzahB, this.zzahC);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.5 */
    class C07975 extends UpdateMatchImpl {
        final /* synthetic */ byte[] zzahA;
        final /* synthetic */ ParticipantResult[] zzahC;
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;
        final /* synthetic */ String zzahx;

        C07975(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, GoogleApiClient x0, String str, byte[] bArr, ParticipantResult[] participantResultArr) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzahx = str;
            this.zzahA = bArr;
            this.zzahC = participantResultArr;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzahx, this.zzahA, this.zzahC);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.6 */
    class C07986 extends LeaveMatchImpl {
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;
        final /* synthetic */ String zzahx;

        C07986(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, GoogleApiClient x0, String str) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzahx = str;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zze((zzb) this, this.zzahx);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.7 */
    class C07997 extends LeaveMatchImpl {
        final /* synthetic */ String zzahB;
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;
        final /* synthetic */ String zzahx;

        C07997(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, GoogleApiClient x0, String str, String str2) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzahx = str;
            this.zzahB = str2;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzahx, this.zzahB);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.8 */
    class C08008 extends CancelMatchImpl {
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;
        final /* synthetic */ String zzahx;

        C08008(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, String x0, GoogleApiClient x1, String str) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzahx = str;
            super(x0, x1);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzf((zzb) this, this.zzahx);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.9 */
    class C08019 extends LoadMatchesImpl {
        final /* synthetic */ TurnBasedMultiplayerImpl zzahw;
        final /* synthetic */ int zzahy;
        final /* synthetic */ int[] zzahz;

        C08019(TurnBasedMultiplayerImpl turnBasedMultiplayerImpl, GoogleApiClient x0, int i, int[] iArr) {
            this.zzahw = turnBasedMultiplayerImpl;
            this.zzahy = i;
            this.zzahz = iArr;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzahy, this.zzahz);
        }
    }

    public PendingResult<InitiateMatchResult> acceptInvitation(GoogleApiClient apiClient, String invitationId) {
        return apiClient.zzb(new C07953(this, apiClient, invitationId));
    }

    public PendingResult<CancelMatchResult> cancelMatch(GoogleApiClient apiClient, String matchId) {
        return apiClient.zzb(new C08008(this, matchId, apiClient, matchId));
    }

    public PendingResult<InitiateMatchResult> createMatch(GoogleApiClient apiClient, TurnBasedMatchConfig config) {
        return apiClient.zzb(new C07931(this, apiClient, config));
    }

    public void declineInvitation(GoogleApiClient apiClient, String invitationId) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzr(invitationId, 1);
        }
    }

    public void dismissInvitation(GoogleApiClient apiClient, String invitationId) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzq(invitationId, 1);
        }
    }

    public void dismissMatch(GoogleApiClient apiClient, String matchId) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzbO(matchId);
        }
    }

    public PendingResult<UpdateMatchResult> finishMatch(GoogleApiClient apiClient, String matchId) {
        return finishMatch(apiClient, matchId, null, (ParticipantResult[]) null);
    }

    public PendingResult<UpdateMatchResult> finishMatch(GoogleApiClient apiClient, String matchId, byte[] matchData, List<ParticipantResult> results) {
        return finishMatch(apiClient, matchId, matchData, results == null ? null : (ParticipantResult[]) results.toArray(new ParticipantResult[results.size()]));
    }

    public PendingResult<UpdateMatchResult> finishMatch(GoogleApiClient apiClient, String matchId, byte[] matchData, ParticipantResult... results) {
        return apiClient.zzb(new C07975(this, apiClient, matchId, matchData, results));
    }

    public Intent getInboxIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznv();
    }

    public int getMaxMatchDataSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznF();
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient apiClient, int minPlayers, int maxPlayers) {
        return Games.zzd(apiClient).zza(minPlayers, maxPlayers, true);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient apiClient, int minPlayers, int maxPlayers, boolean allowAutomatch) {
        return Games.zzd(apiClient).zza(minPlayers, maxPlayers, allowAutomatch);
    }

    public PendingResult<LeaveMatchResult> leaveMatch(GoogleApiClient apiClient, String matchId) {
        return apiClient.zzb(new C07986(this, apiClient, matchId));
    }

    public PendingResult<LeaveMatchResult> leaveMatchDuringTurn(GoogleApiClient apiClient, String matchId, String pendingParticipantId) {
        return apiClient.zzb(new C07997(this, apiClient, matchId, pendingParticipantId));
    }

    public PendingResult<LoadMatchResult> loadMatch(GoogleApiClient apiClient, String matchId) {
        return apiClient.zza(new AnonymousClass10(this, apiClient, matchId));
    }

    public PendingResult<LoadMatchesResult> loadMatchesByStatus(GoogleApiClient apiClient, int invitationSortOrder, int[] matchTurnStatuses) {
        return apiClient.zza(new C08019(this, apiClient, invitationSortOrder, matchTurnStatuses));
    }

    public PendingResult<LoadMatchesResult> loadMatchesByStatus(GoogleApiClient apiClient, int[] matchTurnStatuses) {
        return loadMatchesByStatus(apiClient, 0, matchTurnStatuses);
    }

    public void registerMatchUpdateListener(GoogleApiClient apiClient, OnTurnBasedMatchUpdateReceivedListener listener) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzb(apiClient.zzf(listener));
        }
    }

    public PendingResult<InitiateMatchResult> rematch(GoogleApiClient apiClient, String matchId) {
        return apiClient.zzb(new C07942(this, apiClient, matchId));
    }

    public PendingResult<UpdateMatchResult> takeTurn(GoogleApiClient apiClient, String matchId, byte[] matchData, String pendingParticipantId) {
        return takeTurn(apiClient, matchId, matchData, pendingParticipantId, (ParticipantResult[]) null);
    }

    public PendingResult<UpdateMatchResult> takeTurn(GoogleApiClient apiClient, String matchId, byte[] matchData, String pendingParticipantId, List<ParticipantResult> results) {
        return takeTurn(apiClient, matchId, matchData, pendingParticipantId, results == null ? null : (ParticipantResult[]) results.toArray(new ParticipantResult[results.size()]));
    }

    public PendingResult<UpdateMatchResult> takeTurn(GoogleApiClient apiClient, String matchId, byte[] matchData, String pendingParticipantId, ParticipantResult... results) {
        return apiClient.zzb(new C07964(this, apiClient, matchId, matchData, pendingParticipantId, results));
    }

    public void unregisterMatchUpdateListener(GoogleApiClient apiClient) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzny();
        }
    }
}
