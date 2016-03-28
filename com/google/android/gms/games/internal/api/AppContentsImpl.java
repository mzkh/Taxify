package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AppContentsImpl implements AppContents {

    private static abstract class LoadsImpl extends BaseGamesApiMethodImpl<LoadAppContentResult> {

        /* renamed from: com.google.android.gms.games.internal.api.AppContentsImpl.LoadsImpl.1 */
        class C05801 implements LoadAppContentResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadsImpl zzafK;

            C05801(LoadsImpl loadsImpl, Status status) {
                this.zzafK = loadsImpl;
                this.zzGT = status;
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public void release() {
            }
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzM(x0);
        }

        public LoadAppContentResult zzM(Status status) {
            return new C05801(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AppContentsImpl.1 */
    class C07361 extends LoadsImpl {
        final /* synthetic */ int zzafH;
        final /* synthetic */ String zzafI;
        final /* synthetic */ String[] zzafJ;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzafH, this.zzafI, this.zzafJ, this.zzafy);
        }
    }
}
