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
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

public final class InvitationsImpl implements Invitations {

    private static abstract class LoadInvitationsImpl extends BaseGamesApiMethodImpl<LoadInvitationsResult> {

        /* renamed from: com.google.android.gms.games.internal.api.InvitationsImpl.LoadInvitationsImpl.1 */
        class C05861 implements LoadInvitationsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadInvitationsImpl zzagf;

            C05861(LoadInvitationsImpl loadInvitationsImpl, Status status) {
                this.zzagf = loadInvitationsImpl;
                this.zzGT = status;
            }

            public InvitationBuffer getInvitations() {
                return new InvitationBuffer(DataHolder.zzay(14));
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        private LoadInvitationsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzS(x0);
        }

        public LoadInvitationsResult zzS(Status status) {
            return new C05861(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.InvitationsImpl.1 */
    class C07491 extends LoadInvitationsImpl {
        final /* synthetic */ int zzagc;
        final /* synthetic */ InvitationsImpl zzagd;

        C07491(InvitationsImpl invitationsImpl, GoogleApiClient x0, int i) {
            this.zzagd = invitationsImpl;
            this.zzagc = i;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzagc);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.InvitationsImpl.2 */
    class C07502 extends LoadInvitationsImpl {
        final /* synthetic */ String zzafB;
        final /* synthetic */ int zzagc;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zze(this, this.zzafB, this.zzagc);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.InvitationsImpl.3 */
    class C07513 extends LoadInvitationsImpl {
        final /* synthetic */ String zzage;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzn(this, this.zzage);
        }
    }

    public Intent getInvitationInboxIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznw();
    }

    public PendingResult<LoadInvitationsResult> loadInvitations(GoogleApiClient apiClient) {
        return loadInvitations(apiClient, 0);
    }

    public PendingResult<LoadInvitationsResult> loadInvitations(GoogleApiClient apiClient, int sortOrder) {
        return apiClient.zza(new C07491(this, apiClient, sortOrder));
    }

    public void registerInvitationListener(GoogleApiClient apiClient, OnInvitationReceivedListener listener) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zza(apiClient.zzf(listener));
        }
    }

    public void unregisterInvitationListener(GoogleApiClient apiClient) {
        GamesClientImpl zzb = Games.zzb(apiClient, false);
        if (zzb != null) {
            zzb.zznx();
        }
    }
}
