package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.io.InputStream;

public final class zzi implements DataApi {

    public static class zzb implements DataItemResult {
        private final Status zzHb;
        private final DataItem zzaGc;

        public zzb(Status status, DataItem dataItem) {
            this.zzHb = status;
            this.zzaGc = dataItem;
        }

        public DataItem getDataItem() {
            return this.zzaGc;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    public static class zzc implements DeleteDataItemsResult {
        private final Status zzHb;
        private final int zzaGd;

        public zzc(Status status, int i) {
            this.zzHb = status;
            this.zzaGd = i;
        }

        public int getNumDeleted() {
            return this.zzaGd;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    public static class zzd implements GetFdForAssetResult {
        private volatile boolean mClosed;
        private final Status zzHb;
        private volatile ParcelFileDescriptor zzaGe;
        private volatile InputStream zzaGf;

        public zzd(Status status, ParcelFileDescriptor parcelFileDescriptor) {
            this.mClosed = false;
            this.zzHb = status;
            this.zzaGe = parcelFileDescriptor;
        }

        public ParcelFileDescriptor getFd() {
            if (!this.mClosed) {
                return this.zzaGe;
            }
            throw new IllegalStateException("Cannot access the file descriptor after release().");
        }

        public InputStream getInputStream() {
            if (this.mClosed) {
                throw new IllegalStateException("Cannot access the input stream after release().");
            } else if (this.zzaGe == null) {
                return null;
            } else {
                if (this.zzaGf == null) {
                    this.zzaGf = new AutoCloseInputStream(this.zzaGe);
                }
                return this.zzaGf;
            }
        }

        public Status getStatus() {
            return this.zzHb;
        }

        public void release() {
            if (this.zzaGe != null) {
                if (this.mClosed) {
                    throw new IllegalStateException("releasing an already released result.");
                }
                try {
                    if (this.zzaGf != null) {
                        this.zzaGf.close();
                    } else {
                        this.zzaGe.close();
                    }
                    this.mClosed = true;
                    this.zzaGe = null;
                    this.zzaGf = null;
                } catch (IOException e) {
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzi.1 */
    class C06691 extends zzg<DataItemResult> {
        final /* synthetic */ PutDataRequest zzaFV;
        final /* synthetic */ zzi zzaFW;

        C06691(zzi com_google_android_gms_wearable_internal_zzi, GoogleApiClient googleApiClient, PutDataRequest putDataRequest) {
            this.zzaFW = com_google_android_gms_wearable_internal_zzi;
            this.zzaFV = putDataRequest;
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzaP(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzaFV);
        }

        public DataItemResult zzaP(Status status) {
            return new zzb(status, null);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzi.2 */
    class C06702 extends zzg<DataItemResult> {
        final /* synthetic */ zzi zzaFW;
        final /* synthetic */ Uri zzatx;

        C06702(zzi com_google_android_gms_wearable_internal_zzi, GoogleApiClient googleApiClient, Uri uri) {
            this.zzaFW = com_google_android_gms_wearable_internal_zzi;
            this.zzatx = uri;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaP(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzatx);
        }

        protected DataItemResult zzaP(Status status) {
            return new zzb(status, null);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzi.3 */
    class C06713 extends zzg<DataItemBuffer> {
        final /* synthetic */ zzi zzaFW;

        C06713(zzi com_google_android_gms_wearable_internal_zzi, GoogleApiClient googleApiClient) {
            this.zzaFW = com_google_android_gms_wearable_internal_zzi;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaQ(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zzm(this);
        }

        protected DataItemBuffer zzaQ(Status status) {
            return new DataItemBuffer(DataHolder.zzay(status.getStatusCode()));
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzi.4 */
    class C06724 extends zzg<DataItemBuffer> {
        final /* synthetic */ zzi zzaFW;
        final /* synthetic */ Uri zzatx;

        C06724(zzi com_google_android_gms_wearable_internal_zzi, GoogleApiClient googleApiClient, Uri uri) {
            this.zzaFW = com_google_android_gms_wearable_internal_zzi;
            this.zzatx = uri;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaQ(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zzb((com.google.android.gms.common.api.zza.zzb) this, this.zzatx);
        }

        protected DataItemBuffer zzaQ(Status status) {
            return new DataItemBuffer(DataHolder.zzay(status.getStatusCode()));
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzi.5 */
    class C06735 extends zzg<DeleteDataItemsResult> {
        final /* synthetic */ zzi zzaFW;
        final /* synthetic */ Uri zzatx;

        C06735(zzi com_google_android_gms_wearable_internal_zzi, GoogleApiClient googleApiClient, Uri uri) {
            this.zzaFW = com_google_android_gms_wearable_internal_zzi;
            this.zzatx = uri;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaR(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zzc(this, this.zzatx);
        }

        protected DeleteDataItemsResult zzaR(Status status) {
            return new zzc(status, 0);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzi.6 */
    class C06746 extends zzg<GetFdForAssetResult> {
        final /* synthetic */ zzi zzaFW;
        final /* synthetic */ Asset zzaFX;

        C06746(zzi com_google_android_gms_wearable_internal_zzi, GoogleApiClient googleApiClient, Asset asset) {
            this.zzaFW = com_google_android_gms_wearable_internal_zzi;
            this.zzaFX = asset;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaS(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzaFX);
        }

        protected GetFdForAssetResult zzaS(Status status) {
            return new zzd(status, null);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzi.7 */
    class C06757 extends zzg<GetFdForAssetResult> {
        final /* synthetic */ zzi zzaFW;
        final /* synthetic */ DataItemAsset zzaFY;

        C06757(zzi com_google_android_gms_wearable_internal_zzi, GoogleApiClient googleApiClient, DataItemAsset dataItemAsset) {
            this.zzaFW = com_google_android_gms_wearable_internal_zzi;
            this.zzaFY = dataItemAsset;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaS(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzaFY);
        }

        protected GetFdForAssetResult zzaS(Status status) {
            return new zzd(status, null);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzi.8 */
    class C06768 extends zzg<Status> {
        final /* synthetic */ zzi zzaFW;
        final /* synthetic */ DataListener zzaFZ;

        C06768(zzi com_google_android_gms_wearable_internal_zzi, GoogleApiClient googleApiClient, DataListener dataListener) {
            this.zzaFW = com_google_android_gms_wearable_internal_zzi;
            this.zzaFZ = dataListener;
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzaFZ);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    private static final class zza extends zzg<Status> {
        private DataListener zzaGa;
        private IntentFilter[] zzaGb;

        private zza(GoogleApiClient googleApiClient, DataListener dataListener, IntentFilter[] intentFilterArr) {
            super(googleApiClient);
            this.zzaGa = dataListener;
            this.zzaGb = intentFilterArr;
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzaGa, this.zzaGb);
            this.zzaGa = null;
            this.zzaGb = null;
        }

        public Status zzb(Status status) {
            this.zzaGa = null;
            this.zzaGb = null;
            return status;
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, DataListener dataListener, IntentFilter[] intentFilterArr) {
        return googleApiClient.zza(new zza(dataListener, intentFilterArr, null));
    }

    private void zza(Asset asset) {
        if (asset == null) {
            throw new IllegalArgumentException("asset is null");
        } else if (asset.getDigest() == null) {
            throw new IllegalArgumentException("invalid asset");
        } else if (asset.getData() != null) {
            throw new IllegalArgumentException("invalid asset");
        }
    }

    public PendingResult<Status> addListener(GoogleApiClient client, DataListener listener) {
        return zza(client, listener, null);
    }

    public PendingResult<DeleteDataItemsResult> deleteDataItems(GoogleApiClient client, Uri uri) {
        return client.zza(new C06735(this, client, uri));
    }

    public PendingResult<DataItemResult> getDataItem(GoogleApiClient client, Uri uri) {
        return client.zza(new C06702(this, client, uri));
    }

    public PendingResult<DataItemBuffer> getDataItems(GoogleApiClient client) {
        return client.zza(new C06713(this, client));
    }

    public PendingResult<DataItemBuffer> getDataItems(GoogleApiClient client, Uri uri) {
        return client.zza(new C06724(this, client, uri));
    }

    public PendingResult<GetFdForAssetResult> getFdForAsset(GoogleApiClient client, Asset asset) {
        zza(asset);
        return client.zza(new C06746(this, client, asset));
    }

    public PendingResult<GetFdForAssetResult> getFdForAsset(GoogleApiClient client, DataItemAsset asset) {
        return client.zza(new C06757(this, client, asset));
    }

    public PendingResult<DataItemResult> putDataItem(GoogleApiClient client, PutDataRequest request) {
        return client.zza(new C06691(this, client, request));
    }

    public PendingResult<Status> removeListener(GoogleApiClient client, DataListener listener) {
        return client.zza(new C06768(this, client, listener));
    }
}
