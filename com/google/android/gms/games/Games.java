package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zza;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import java.util.ArrayList;

public final class Games {
    public static final Api<GamesOptions> API;
    public static final Achievements Achievements;
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final String EXTRA_STATUS = "status";
    public static final Events Events;
    public static final GamesMetadata GamesMetadata;
    public static final Invitations Invitations;
    public static final Leaderboards Leaderboards;
    public static final Notifications Notifications;
    public static final Players Players;
    public static final Quests Quests;
    public static final RealTimeMultiplayer RealTimeMultiplayer;
    public static final Requests Requests;
    public static final Scope SCOPE_GAMES;
    public static final Snapshots Snapshots;
    public static final TurnBasedMultiplayer TurnBasedMultiplayer;
    static final zzc<GamesClientImpl> zzGR;
    private static final zzb<GamesClientImpl, GamesOptions> zzGS;
    public static final Scope zzacv;
    public static final Api<GamesOptions> zzacw;
    public static final AppContents zzacx;
    public static final Multiplayer zzacy;
    public static final Acls zzacz;

    /* renamed from: com.google.android.gms.games.Games.1 */
    static class C03681 implements zzb<GamesClientImpl, GamesOptions> {
        C03681() {
        }

        public int getPriority() {
            return 1;
        }

        public GamesClientImpl zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, GamesOptions gamesOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new GamesClientImpl(context, looper, com_google_android_gms_common_internal_zzf, gamesOptions == null ? new GamesOptions() : gamesOptions, connectionCallbacks, onConnectionFailedListener);
        }
    }

    public static abstract class BaseGamesApiMethodImpl<R extends Result> extends zza<R, GamesClientImpl> {
        public BaseGamesApiMethodImpl(GoogleApiClient googleApiClient) {
            super(Games.zzGR, googleApiClient);
        }
    }

    public static final class GamesOptions implements Optional {
        public final boolean zzacA;
        public final boolean zzacB;
        public final int zzacC;
        public final boolean zzacD;
        public final int zzacE;
        public final String zzacF;
        public final ArrayList<String> zzacG;

        public static final class Builder {
            boolean zzacA;
            boolean zzacB;
            int zzacC;
            boolean zzacD;
            int zzacE;
            String zzacF;
            ArrayList<String> zzacG;

            private Builder() {
                this.zzacA = false;
                this.zzacB = true;
                this.zzacC = 17;
                this.zzacD = false;
                this.zzacE = 4368;
                this.zzacF = null;
                this.zzacG = new ArrayList();
            }

            public GamesOptions build() {
                return new GamesOptions();
            }

            public Builder setSdkVariant(int variant) {
                this.zzacE = variant;
                return this;
            }

            public Builder setShowConnectingPopup(boolean showConnectingPopup) {
                this.zzacB = showConnectingPopup;
                this.zzacC = 17;
                return this;
            }

            public Builder setShowConnectingPopup(boolean showConnectingPopup, int gravity) {
                this.zzacB = showConnectingPopup;
                this.zzacC = gravity;
                return this;
            }
        }

        private GamesOptions() {
            this.zzacA = false;
            this.zzacB = true;
            this.zzacC = 17;
            this.zzacD = false;
            this.zzacE = 4368;
            this.zzacF = null;
            this.zzacG = new ArrayList();
        }

        private GamesOptions(Builder builder) {
            this.zzacA = builder.zzacA;
            this.zzacB = builder.zzacB;
            this.zzacC = builder.zzacC;
            this.zzacD = builder.zzacD;
            this.zzacE = builder.zzacE;
            this.zzacF = builder.zzacF;
            this.zzacG = builder.zzacG;
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    private static abstract class SignOutImpl extends BaseGamesApiMethodImpl<Status> {
        private SignOutImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.games.Games.2 */
    static class C07242 extends SignOutImpl {
        C07242(GoogleApiClient x0) {
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((com.google.android.gms.common.api.zza.zzb) this);
        }
    }

    static {
        zzGR = new zzc();
        zzGS = new C03681();
        SCOPE_GAMES = new Scope(Scopes.GAMES);
        API = new Api(zzGS, zzGR, SCOPE_GAMES);
        zzacv = new Scope("https://www.googleapis.com/auth/games.firstparty");
        zzacw = new Api(zzGS, zzGR, zzacv);
        GamesMetadata = new GamesMetadataImpl();
        Achievements = new AchievementsImpl();
        zzacx = new AppContentsImpl();
        Events = new EventsImpl();
        Leaderboards = new LeaderboardsImpl();
        Invitations = new InvitationsImpl();
        TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
        RealTimeMultiplayer = new RealTimeMultiplayerImpl();
        zzacy = new MultiplayerImpl();
        Players = new PlayersImpl();
        Notifications = new NotificationsImpl();
        Quests = new QuestsImpl();
        Requests = new RequestsImpl();
        Snapshots = new SnapshotsImpl();
        zzacz = new AclsImpl();
    }

    private Games() {
    }

    public static String getAppId(GoogleApiClient apiClient) {
        return zzd(apiClient).zznE();
    }

    public static String getCurrentAccountName(GoogleApiClient apiClient) {
        return zzd(apiClient).zznp();
    }

    public static int getSdkVariant(GoogleApiClient apiClient) {
        return zzd(apiClient).zznD();
    }

    public static Intent getSettingsIntent(GoogleApiClient apiClient) {
        return zzd(apiClient).zznC();
    }

    public static void setGravityForPopups(GoogleApiClient apiClient, int gravity) {
        GamesClientImpl zzb = zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzeB(gravity);
        }
    }

    public static void setViewForPopups(GoogleApiClient apiClient, View gamesContentView) {
        zzx.zzl(gamesContentView);
        GamesClientImpl zzb = zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzl(gamesContentView);
        }
    }

    public static PendingResult<Status> signOut(GoogleApiClient apiClient) {
        return apiClient.zzb(new C07242(apiClient));
    }

    public static GamesClientImpl zzb(GoogleApiClient googleApiClient, boolean z) {
        zzx.zzb(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        zzx.zza(googleApiClient.isConnected(), (Object) "GoogleApiClient must be connected.");
        return zzc(googleApiClient, z);
    }

    public static GamesClientImpl zzc(GoogleApiClient googleApiClient, boolean z) {
        zzx.zza(googleApiClient.zza(API), (Object) "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean zzb = googleApiClient.zzb(API);
        if (!z || zzb) {
            return zzb ? (GamesClientImpl) googleApiClient.zza(zzGR) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
    }

    public static GamesClientImpl zzd(GoogleApiClient googleApiClient) {
        return zzb(googleApiClient, true);
    }
}
