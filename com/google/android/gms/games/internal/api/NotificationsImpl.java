package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.Notifications.ContactSettingLoadResult;
import com.google.android.gms.games.Notifications.GameMuteStatusChangeResult;
import com.google.android.gms.games.Notifications.GameMuteStatusLoadResult;
import com.google.android.gms.games.Notifications.InboxCountResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class NotificationsImpl implements Notifications {

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.1 */
    class C06501 extends BaseGamesApiMethodImpl<GameMuteStatusChangeResult> {
        final /* synthetic */ String zzagt;

        /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.1.1 */
        class C05911 implements GameMuteStatusChangeResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ C06501 zzagu;

            C05911(C06501 c06501, Status status) {
                this.zzagu = c06501;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzX(x0);
        }

        public GameMuteStatusChangeResult zzX(Status status) {
            return new C05911(this, status);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd((zzb) this, this.zzagt, true);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.2 */
    class C06512 extends BaseGamesApiMethodImpl<GameMuteStatusChangeResult> {
        final /* synthetic */ String zzagt;

        /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.2.1 */
        class C05921 implements GameMuteStatusChangeResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ C06512 zzagv;

            C05921(C06512 c06512, Status status) {
                this.zzagv = c06512;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzX(x0);
        }

        public GameMuteStatusChangeResult zzX(Status status) {
            return new C05921(this, status);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzd((zzb) this, this.zzagt, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.3 */
    class C06523 extends BaseGamesApiMethodImpl<GameMuteStatusLoadResult> {
        final /* synthetic */ String zzagt;

        /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.3.1 */
        class C05931 implements GameMuteStatusLoadResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ C06523 zzagw;

            C05931(C06523 c06523, Status status) {
                this.zzagw = c06523;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzY(x0);
        }

        public GameMuteStatusLoadResult zzY(Status status) {
            return new C05931(this, status);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzp((zzb) this, this.zzagt);
        }
    }

    private static abstract class ContactSettingLoadImpl extends BaseGamesApiMethodImpl<ContactSettingLoadResult> {

        /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.ContactSettingLoadImpl.1 */
        class C05941 implements ContactSettingLoadResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ ContactSettingLoadImpl zzagz;

            C05941(ContactSettingLoadImpl contactSettingLoadImpl, Status status) {
                this.zzagz = contactSettingLoadImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzZ(x0);
        }

        public ContactSettingLoadResult zzZ(Status status) {
            return new C05941(this, status);
        }
    }

    private static abstract class ContactSettingUpdateImpl extends BaseGamesApiMethodImpl<Status> {
        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    private static abstract class InboxCountImpl extends BaseGamesApiMethodImpl<InboxCountResult> {

        /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.InboxCountImpl.1 */
        class C05951 implements InboxCountResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ InboxCountImpl zzagA;

            C05951(InboxCountImpl inboxCountImpl, Status status) {
                this.zzagA = inboxCountImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzaa(x0);
        }

        public InboxCountResult zzaa(Status status) {
            return new C05951(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.4 */
    class C07614 extends ContactSettingLoadImpl {
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzh((zzb) this, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.5 */
    class C07625 extends ContactSettingUpdateImpl {
        final /* synthetic */ boolean zzagx;
        final /* synthetic */ Bundle zzagy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzagx, this.zzagy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl.6 */
    class C07636 extends InboxCountImpl {
        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzi(this);
        }
    }

    public void clear(GoogleApiClient apiClient, int notificationTypes) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zzeC(notificationTypes);
        }
    }

    public void clearAll(GoogleApiClient apiClient) {
        clear(apiClient, 31);
    }
}
