package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.internal.game.Acls.LoadAclResult;

public final class AclsImpl implements Acls {

    /* renamed from: com.google.android.gms.games.internal.api.AclsImpl.1 */
    static class C05791 implements LoadAclResult {
        final /* synthetic */ Status zzGT;

        C05791(Status status) {
            this.zzGT = status;
        }

        public Status getStatus() {
            return this.zzGT;
        }

        public void release() {
        }
    }

    private static abstract class LoadNotifyAclImpl extends BaseGamesApiMethodImpl<LoadAclResult> {
        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzL(x0);
        }

        public LoadAclResult zzL(Status status) {
            return AclsImpl.zzJ(status);
        }
    }

    private static abstract class UpdateNotifyAclImpl extends BaseGamesApiMethodImpl<Status> {
        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AclsImpl.2 */
    class C07342 extends LoadNotifyAclImpl {
        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzh(this);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AclsImpl.3 */
    class C07353 extends UpdateNotifyAclImpl {
        final /* synthetic */ String zzafG;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzo((zzb) this, this.zzafG);
        }
    }

    private static LoadAclResult zzJ(Status status) {
        return new C05791(status);
    }
}
