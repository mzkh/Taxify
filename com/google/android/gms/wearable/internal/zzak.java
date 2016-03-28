package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;

public final class zzak implements MessageApi {

    public static class zzb implements SendMessageResult {
        private final Status zzHb;
        private final int zzRV;

        public zzb(Status status, int i) {
            this.zzHb = status;
            this.zzRV = i;
        }

        public int getRequestId() {
            return this.zzRV;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzak.1 */
    class C06641 extends zzg<SendMessageResult> {
        final /* synthetic */ byte[] zzGV;
        final /* synthetic */ String zzaGr;
        final /* synthetic */ String zzaGs;
        final /* synthetic */ zzak zzaGt;

        C06641(zzak com_google_android_gms_wearable_internal_zzak, GoogleApiClient googleApiClient, String str, String str2, byte[] bArr) {
            this.zzaGt = com_google_android_gms_wearable_internal_zzak;
            this.zzaGr = str;
            this.zzaGs = str2;
            this.zzGV = bArr;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzaT(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza(this, this.zzaGr, this.zzaGs, this.zzGV);
        }

        protected SendMessageResult zzaT(Status status) {
            return new zzb(status, -1);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.zzak.2 */
    class C06652 extends zzg<Status> {
        final /* synthetic */ zzak zzaGt;
        final /* synthetic */ MessageListener zzaGu;

        C06652(zzak com_google_android_gms_wearable_internal_zzak, GoogleApiClient googleApiClient, MessageListener messageListener) {
            this.zzaGt = com_google_android_gms_wearable_internal_zzak;
            this.zzaGu = messageListener;
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzaGu);
        }

        public Status zzb(Status status) {
            return status;
        }
    }

    private static final class zza extends zzg<Status> {
        private IntentFilter[] zzaGb;
        private MessageListener zzaGv;

        private zza(GoogleApiClient googleApiClient, MessageListener messageListener, IntentFilter[] intentFilterArr) {
            super(googleApiClient);
            this.zzaGv = messageListener;
            this.zzaGb = intentFilterArr;
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzb(x0);
        }

        protected void zza(zzbd com_google_android_gms_wearable_internal_zzbd) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbd.zza((com.google.android.gms.common.api.zza.zzb) this, this.zzaGv, this.zzaGb);
            this.zzaGv = null;
            this.zzaGb = null;
        }

        public Status zzb(Status status) {
            this.zzaGv = null;
            this.zzaGb = null;
            return status;
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, MessageListener messageListener, IntentFilter[] intentFilterArr) {
        return googleApiClient.zza(new zza(messageListener, intentFilterArr, null));
    }

    public PendingResult<Status> addListener(GoogleApiClient client, MessageListener listener) {
        return zza(client, listener, null);
    }

    public PendingResult<Status> removeListener(GoogleApiClient client, MessageListener listener) {
        return client.zza(new C06652(this, client, listener));
    }

    public PendingResult<SendMessageResult> sendMessage(GoogleApiClient client, String nodeId, String action, byte[] data) {
        return client.zza(new C06641(this, client, nodeId, action, data));
    }
}
