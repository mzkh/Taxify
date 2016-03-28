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
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AchievementsImpl implements Achievements {

    private static abstract class LoadImpl extends BaseGamesApiMethodImpl<LoadAchievementsResult> {

        /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.LoadImpl.1 */
        class C05771 implements LoadAchievementsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadImpl zzafE;

            C05771(LoadImpl loadImpl, Status status) {
                this.zzafE = loadImpl;
                this.zzGT = status;
            }

            public AchievementBuffer getAchievements() {
                return new AchievementBuffer(DataHolder.zzay(14));
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
            return zzH(x0);
        }

        public LoadAchievementsResult zzH(Status status) {
            return new C05771(this, status);
        }
    }

    private static abstract class UpdateImpl extends BaseGamesApiMethodImpl<UpdateAchievementResult> {
        private final String zzFA;

        /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.UpdateImpl.1 */
        class C05781 implements UpdateAchievementResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ UpdateImpl zzafF;

            C05781(UpdateImpl updateImpl, Status status) {
                this.zzafF = updateImpl;
                this.zzGT = status;
            }

            public String getAchievementId() {
                return this.zzafF.zzFA;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public UpdateImpl(String id, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.zzFA = id;
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzI(x0);
        }

        public UpdateAchievementResult zzI(Status status) {
            return new C05781(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.10 */
    class AnonymousClass10 extends LoadImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ String zzafB;
        final /* synthetic */ boolean zzafy;

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzafA, this.zzafB, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.1 */
    class C07251 extends LoadImpl {
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ AchievementsImpl zzafz;

        C07251(AchievementsImpl achievementsImpl, GoogleApiClient x0, boolean z) {
            this.zzafz = achievementsImpl;
            this.zzafy = z;
            super(null);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.2 */
    class C07262 extends UpdateImpl {
        final /* synthetic */ String zzafC;
        final /* synthetic */ AchievementsImpl zzafz;

        C07262(AchievementsImpl achievementsImpl, String x0, GoogleApiClient x1, String str) {
            this.zzafz = achievementsImpl;
            this.zzafC = str;
            super(x0, x1);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza(null, this.zzafC);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.3 */
    class C07273 extends UpdateImpl {
        final /* synthetic */ String zzafC;
        final /* synthetic */ AchievementsImpl zzafz;

        C07273(AchievementsImpl achievementsImpl, String x0, GoogleApiClient x1, String str) {
            this.zzafz = achievementsImpl;
            this.zzafC = str;
            super(x0, x1);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafC);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.4 */
    class C07284 extends UpdateImpl {
        final /* synthetic */ String zzafC;
        final /* synthetic */ AchievementsImpl zzafz;

        C07284(AchievementsImpl achievementsImpl, String x0, GoogleApiClient x1, String str) {
            this.zzafz = achievementsImpl;
            this.zzafC = str;
            super(x0, x1);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(null, this.zzafC);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.5 */
    class C07295 extends UpdateImpl {
        final /* synthetic */ String zzafC;
        final /* synthetic */ AchievementsImpl zzafz;

        C07295(AchievementsImpl achievementsImpl, String x0, GoogleApiClient x1, String str) {
            this.zzafz = achievementsImpl;
            this.zzafC = str;
            super(x0, x1);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzafC);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.6 */
    class C07306 extends UpdateImpl {
        final /* synthetic */ String zzafC;
        final /* synthetic */ int zzafD;
        final /* synthetic */ AchievementsImpl zzafz;

        C07306(AchievementsImpl achievementsImpl, String x0, GoogleApiClient x1, String str, int i) {
            this.zzafz = achievementsImpl;
            this.zzafC = str;
            this.zzafD = i;
            super(x0, x1);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza(null, this.zzafC, this.zzafD);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.7 */
    class C07317 extends UpdateImpl {
        final /* synthetic */ String zzafC;
        final /* synthetic */ int zzafD;
        final /* synthetic */ AchievementsImpl zzafz;

        C07317(AchievementsImpl achievementsImpl, String x0, GoogleApiClient x1, String str, int i) {
            this.zzafz = achievementsImpl;
            this.zzafC = str;
            this.zzafD = i;
            super(x0, x1);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafC, this.zzafD);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.8 */
    class C07328 extends UpdateImpl {
        final /* synthetic */ String zzafC;
        final /* synthetic */ int zzafD;
        final /* synthetic */ AchievementsImpl zzafz;

        C07328(AchievementsImpl achievementsImpl, String x0, GoogleApiClient x1, String str, int i) {
            this.zzafz = achievementsImpl;
            this.zzafC = str;
            this.zzafD = i;
            super(x0, x1);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(null, this.zzafC, this.zzafD);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl.9 */
    class C07339 extends UpdateImpl {
        final /* synthetic */ String zzafC;
        final /* synthetic */ int zzafD;
        final /* synthetic */ AchievementsImpl zzafz;

        C07339(AchievementsImpl achievementsImpl, String x0, GoogleApiClient x1, String str, int i) {
            this.zzafz = achievementsImpl;
            this.zzafC = str;
            this.zzafD = i;
            super(x0, x1);
        }

        public void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb((zzb) this, this.zzafC, this.zzafD);
        }
    }

    public Intent getAchievementsIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznu();
    }

    public void increment(GoogleApiClient apiClient, String id, int numSteps) {
        apiClient.zzb(new C07306(this, id, apiClient, id, numSteps));
    }

    public PendingResult<UpdateAchievementResult> incrementImmediate(GoogleApiClient apiClient, String id, int numSteps) {
        return apiClient.zzb(new C07317(this, id, apiClient, id, numSteps));
    }

    public PendingResult<LoadAchievementsResult> load(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new C07251(this, apiClient, forceReload));
    }

    public void reveal(GoogleApiClient apiClient, String id) {
        apiClient.zzb(new C07262(this, id, apiClient, id));
    }

    public PendingResult<UpdateAchievementResult> revealImmediate(GoogleApiClient apiClient, String id) {
        return apiClient.zzb(new C07273(this, id, apiClient, id));
    }

    public void setSteps(GoogleApiClient apiClient, String id, int numSteps) {
        apiClient.zzb(new C07328(this, id, apiClient, id, numSteps));
    }

    public PendingResult<UpdateAchievementResult> setStepsImmediate(GoogleApiClient apiClient, String id, int numSteps) {
        return apiClient.zzb(new C07339(this, id, apiClient, id, numSteps));
    }

    public void unlock(GoogleApiClient apiClient, String id) {
        apiClient.zzb(new C07284(this, id, apiClient, id));
    }

    public PendingResult<UpdateAchievementResult> unlockImmediate(GoogleApiClient apiClient, String id) {
        return apiClient.zzb(new C07295(this, id, apiClient, id));
    }
}
