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
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.quest.Quests.AcceptQuestResult;
import com.google.android.gms.games.quest.Quests.ClaimMilestoneResult;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;

public final class QuestsImpl implements Quests {

    private static abstract class AcceptImpl extends BaseGamesApiMethodImpl<AcceptQuestResult> {

        /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl.AcceptImpl.1 */
        class C06011 implements AcceptQuestResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ AcceptImpl zzagS;

            C06011(AcceptImpl acceptImpl, Status status) {
                this.zzagS = acceptImpl;
                this.zzGT = status;
            }

            public Quest getQuest() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private AcceptImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzag(x0);
        }

        public AcceptQuestResult zzag(Status status) {
            return new C06011(this, status);
        }
    }

    private static abstract class ClaimImpl extends BaseGamesApiMethodImpl<ClaimMilestoneResult> {

        /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl.ClaimImpl.1 */
        class C06021 implements ClaimMilestoneResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ ClaimImpl zzagT;

            C06021(ClaimImpl claimImpl, Status status) {
                this.zzagT = claimImpl;
                this.zzGT = status;
            }

            public Milestone getMilestone() {
                return null;
            }

            public Quest getQuest() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private ClaimImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzah(x0);
        }

        public ClaimMilestoneResult zzah(Status status) {
            return new C06021(this, status);
        }
    }

    private static abstract class LoadsImpl extends BaseGamesApiMethodImpl<LoadQuestsResult> {

        /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl.LoadsImpl.1 */
        class C06031 implements LoadQuestsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadsImpl zzagU;

            C06031(LoadsImpl loadsImpl, Status status) {
                this.zzagU = loadsImpl;
                this.zzGT = status;
            }

            public QuestBuffer getQuests() {
                return new QuestBuffer(DataHolder.zzay(this.zzGT.getStatusCode()));
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private LoadsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzai(x0);
        }

        public LoadQuestsResult zzai(Status status) {
            return new C06031(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl.1 */
    class C07731 extends AcceptImpl {
        final /* synthetic */ String zzagM;
        final /* synthetic */ QuestsImpl zzagN;

        C07731(QuestsImpl questsImpl, GoogleApiClient x0, String str) {
            this.zzagN = questsImpl;
            this.zzagM = str;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzh((zzb) this, this.zzagM);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl.2 */
    class C07742 extends ClaimImpl {
        final /* synthetic */ String zzagM;
        final /* synthetic */ QuestsImpl zzagN;
        final /* synthetic */ String zzagO;

        C07742(QuestsImpl questsImpl, GoogleApiClient x0, String str, String str2) {
            this.zzagN = questsImpl;
            this.zzagM = str;
            this.zzagO = str2;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzagM, this.zzagO);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl.3 */
    class C07753 extends LoadsImpl {
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ QuestsImpl zzagN;
        final /* synthetic */ int[] zzagP;
        final /* synthetic */ int zzagc;

        C07753(QuestsImpl questsImpl, GoogleApiClient x0, int[] iArr, int i, boolean z) {
            this.zzagN = questsImpl;
            this.zzagP = iArr;
            this.zzagc = i;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzagP, this.zzagc, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl.4 */
    class C07764 extends LoadsImpl {
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ QuestsImpl zzagN;
        final /* synthetic */ String[] zzagQ;

        C07764(QuestsImpl questsImpl, GoogleApiClient x0, boolean z, String[] strArr) {
            this.zzagN = questsImpl;
            this.zzafy = z;
            this.zzagQ = strArr;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzafy, this.zzagQ);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl.5 */
    class C07775 extends LoadsImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ int[] zzagP;
        final /* synthetic */ String zzagR;
        final /* synthetic */ int zzagc;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafB, this.zzagR, this.zzagP, this.zzagc, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl.6 */
    class C07786 extends LoadsImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ String[] zzagQ;
        final /* synthetic */ String zzagR;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafB, this.zzagR, this.zzafy, this.zzagQ);
        }
    }

    public PendingResult<AcceptQuestResult> accept(GoogleApiClient apiClient, String questId) {
        return apiClient.zzb(new C07731(this, apiClient, questId));
    }

    public PendingResult<ClaimMilestoneResult> claim(GoogleApiClient apiClient, String questId, String milestoneId) {
        return apiClient.zzb(new C07742(this, apiClient, questId, milestoneId));
    }

    public Intent getQuestIntent(GoogleApiClient apiClient, String questId) {
        return Games.zzd(apiClient).zzbP(questId);
    }

    public Intent getQuestsIntent(GoogleApiClient apiClient, int[] questSelectors) {
        return Games.zzd(apiClient).zzb(questSelectors);
    }

    public PendingResult<LoadQuestsResult> load(GoogleApiClient apiClient, int[] questSelectors, int sortOrder, boolean forceReload) {
        return apiClient.zza(new C07753(this, apiClient, questSelectors, sortOrder, forceReload));
    }

    public PendingResult<LoadQuestsResult> loadByIds(GoogleApiClient apiClient, boolean forceReload, String... questIds) {
        return apiClient.zza(new C07764(this, apiClient, forceReload, questIds));
    }

    public void registerQuestUpdateListener(GoogleApiClient apiClient, QuestUpdateListener listener) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzc(apiClient.zzf(listener));
        }
    }

    public void showStateChangedPopup(GoogleApiClient apiClient, String questId) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzbQ(questId);
        }
    }

    public void unregisterQuestUpdateListener(GoogleApiClient apiClient) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zznz();
        }
    }
}
