package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
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
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;

public final class SnapshotsImpl implements Snapshots {

    private static abstract class CommitImpl extends BaseGamesApiMethodImpl<CommitSnapshotResult> {

        /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.CommitImpl.1 */
        class C06081 implements CommitSnapshotResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ CommitImpl zzahr;

            C06081(CommitImpl commitImpl, Status status) {
                this.zzahr = commitImpl;
                this.zzGT = status;
            }

            public SnapshotMetadata getSnapshotMetadata() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private CommitImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzan(x0);
        }

        public CommitSnapshotResult zzan(Status status) {
            return new C06081(this, status);
        }
    }

    private static abstract class DeleteImpl extends BaseGamesApiMethodImpl<DeleteSnapshotResult> {

        /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.DeleteImpl.1 */
        class C06091 implements DeleteSnapshotResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ DeleteImpl zzahs;

            C06091(DeleteImpl deleteImpl, Status status) {
                this.zzahs = deleteImpl;
                this.zzGT = status;
            }

            public String getSnapshotId() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private DeleteImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzao(x0);
        }

        public DeleteSnapshotResult zzao(Status status) {
            return new C06091(this, status);
        }
    }

    private static abstract class LoadImpl extends BaseGamesApiMethodImpl<LoadSnapshotsResult> {

        /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.LoadImpl.1 */
        class C06101 implements LoadSnapshotsResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ LoadImpl zzaht;

            C06101(LoadImpl loadImpl, Status status) {
                this.zzaht = loadImpl;
                this.zzGT = status;
            }

            public SnapshotMetadataBuffer getSnapshots() {
                return new SnapshotMetadataBuffer(DataHolder.zzay(14));
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
            return zzap(x0);
        }

        public LoadSnapshotsResult zzap(Status status) {
            return new C06101(this, status);
        }
    }

    private static abstract class OpenImpl extends BaseGamesApiMethodImpl<OpenSnapshotResult> {

        /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.OpenImpl.1 */
        class C06111 implements OpenSnapshotResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ OpenImpl zzahu;

            C06111(OpenImpl openImpl, Status status) {
                this.zzahu = openImpl;
                this.zzGT = status;
            }

            public String getConflictId() {
                return null;
            }

            public Snapshot getConflictingSnapshot() {
                return null;
            }

            public SnapshotContents getResolutionSnapshotContents() {
                return null;
            }

            public Snapshot getSnapshot() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        private OpenImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzaq(x0);
        }

        public OpenSnapshotResult zzaq(Status status) {
            return new C06111(this, status);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.1 */
    class C07871 extends LoadImpl {
        final /* synthetic */ boolean zzafy;
        final /* synthetic */ SnapshotsImpl zzahh;

        C07871(SnapshotsImpl snapshotsImpl, GoogleApiClient x0, boolean z) {
            this.zzahh = snapshotsImpl;
            this.zzafy = z;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zze((zzb) this, this.zzafy);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.2 */
    class C07882 extends OpenImpl {
        final /* synthetic */ SnapshotsImpl zzahh;
        final /* synthetic */ String zzahi;
        final /* synthetic */ boolean zzahj;
        final /* synthetic */ int zzahk;

        C07882(SnapshotsImpl snapshotsImpl, GoogleApiClient x0, String str, boolean z, int i) {
            this.zzahh = snapshotsImpl;
            this.zzahi = str;
            this.zzahj = z;
            this.zzahk = i;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzahi, this.zzahj, this.zzahk);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.3 */
    class C07893 extends CommitImpl {
        final /* synthetic */ SnapshotsImpl zzahh;
        final /* synthetic */ Snapshot zzahl;
        final /* synthetic */ SnapshotMetadataChange zzahm;

        C07893(SnapshotsImpl snapshotsImpl, GoogleApiClient x0, Snapshot snapshot, SnapshotMetadataChange snapshotMetadataChange) {
            this.zzahh = snapshotsImpl;
            this.zzahl = snapshot;
            this.zzahm = snapshotMetadataChange;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzahl, this.zzahm);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.4 */
    class C07904 extends DeleteImpl {
        final /* synthetic */ SnapshotsImpl zzahh;
        final /* synthetic */ SnapshotMetadata zzahn;

        C07904(SnapshotsImpl snapshotsImpl, GoogleApiClient x0, SnapshotMetadata snapshotMetadata) {
            this.zzahh = snapshotsImpl;
            this.zzahn = snapshotMetadata;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzi(this, this.zzahn.getSnapshotId());
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.5 */
    class C07915 extends OpenImpl {
        final /* synthetic */ SnapshotsImpl zzahh;
        final /* synthetic */ SnapshotMetadataChange zzahm;
        final /* synthetic */ String zzaho;
        final /* synthetic */ String zzahp;
        final /* synthetic */ SnapshotContents zzahq;

        C07915(SnapshotsImpl snapshotsImpl, GoogleApiClient x0, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) {
            this.zzahh = snapshotsImpl;
            this.zzaho = str;
            this.zzahp = str2;
            this.zzahm = snapshotMetadataChange;
            this.zzahq = snapshotContents;
            super(null);
        }

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zza((zzb) this, this.zzaho, this.zzahp, this.zzahm, this.zzahq);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl.6 */
    class C07926 extends LoadImpl {
        final /* synthetic */ String zzafA;
        final /* synthetic */ String zzafB;
        final /* synthetic */ boolean zzafy;

        protected void zza(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzc((zzb) this, this.zzafA, this.zzafB, this.zzafy);
        }
    }

    public PendingResult<CommitSnapshotResult> commitAndClose(GoogleApiClient apiClient, Snapshot snapshot, SnapshotMetadataChange metadataChange) {
        return apiClient.zzb(new C07893(this, apiClient, snapshot, metadataChange));
    }

    public PendingResult<DeleteSnapshotResult> delete(GoogleApiClient apiClient, SnapshotMetadata metadata) {
        return apiClient.zzb(new C07904(this, apiClient, metadata));
    }

    public void discardAndClose(GoogleApiClient apiClient, Snapshot snapshot) {
        Games.zzd(apiClient).zza(snapshot);
    }

    public int getMaxCoverImageSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznK();
    }

    public int getMaxDataSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zznJ();
    }

    public Intent getSelectSnapshotIntent(GoogleApiClient apiClient, String title, boolean allowAddButton, boolean allowDelete, int maxSnapshots) {
        return Games.zzd(apiClient).zza(title, allowAddButton, allowDelete, maxSnapshots);
    }

    public SnapshotMetadata getSnapshotFromBundle(Bundle extras) {
        return (extras == null || !extras.containsKey(Snapshots.EXTRA_SNAPSHOT_METADATA)) ? null : (SnapshotMetadata) extras.getParcelable(Snapshots.EXTRA_SNAPSHOT_METADATA);
    }

    public PendingResult<LoadSnapshotsResult> load(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new C07871(this, apiClient, forceReload));
    }

    public PendingResult<OpenSnapshotResult> open(GoogleApiClient apiClient, SnapshotMetadata metadata) {
        return open(apiClient, metadata.getUniqueName(), false);
    }

    public PendingResult<OpenSnapshotResult> open(GoogleApiClient apiClient, SnapshotMetadata metadata, int conflictPolicy) {
        return open(apiClient, metadata.getUniqueName(), false, conflictPolicy);
    }

    public PendingResult<OpenSnapshotResult> open(GoogleApiClient apiClient, String fileName, boolean createIfNotFound) {
        return open(apiClient, fileName, createIfNotFound, -1);
    }

    public PendingResult<OpenSnapshotResult> open(GoogleApiClient apiClient, String fileName, boolean createIfNotFound, int conflictPolicy) {
        return apiClient.zzb(new C07882(this, apiClient, fileName, createIfNotFound, conflictPolicy));
    }

    public PendingResult<OpenSnapshotResult> resolveConflict(GoogleApiClient apiClient, String conflictId, Snapshot snapshot) {
        SnapshotMetadata metadata = snapshot.getMetadata();
        SnapshotMetadataChange build = new Builder().fromMetadata(metadata).build();
        return resolveConflict(apiClient, conflictId, metadata.getSnapshotId(), build, snapshot.getSnapshotContents());
    }

    public PendingResult<OpenSnapshotResult> resolveConflict(GoogleApiClient apiClient, String conflictId, String snapshotId, SnapshotMetadataChange metadataChange, SnapshotContents snapshotContents) {
        return apiClient.zzb(new C07915(this, apiClient, conflictId, snapshotId, metadataChange, snapshotContents));
    }
}
