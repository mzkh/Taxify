package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.AbstractPendingResult.CallbackHandler;
import com.google.android.gms.common.api.PendingResult.BatchCallback;
import java.util.ArrayList;
import java.util.List;

public final class Batch extends AbstractPendingResult<BatchResult> {
    private int zzLW;
    private boolean zzLX;
    private boolean zzLY;
    private final PendingResult<?>[] zzLZ;
    private final Object zznh;

    public static final class Builder {
        private List<PendingResult<?>> zzMb;
        private Looper zzMc;

        public Builder(GoogleApiClient googleApiClient) {
            this.zzMb = new ArrayList();
            this.zzMc = googleApiClient.getLooper();
        }

        public <R extends Result> BatchResultToken<R> add(PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken(this.zzMb.size());
            this.zzMb.add(pendingResult);
            return batchResultToken;
        }

        public Batch build() {
            return new Batch(this.zzMc, null);
        }
    }

    /* renamed from: com.google.android.gms.common.api.Batch.1 */
    class C03511 implements BatchCallback {
        final /* synthetic */ Batch zzMa;

        C03511(Batch batch) {
            this.zzMa = batch;
        }

        public void zzl(Status status) {
            synchronized (this.zzMa.zznh) {
                if (this.zzMa.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.zzMa.zzLY = true;
                } else if (!status.isSuccess()) {
                    this.zzMa.zzLX = true;
                }
                this.zzMa.zzLW = this.zzMa.zzLW - 1;
                if (this.zzMa.zzLW == 0) {
                    if (this.zzMa.zzLY) {
                        super.cancel();
                    } else {
                        this.zzMa.setResult(new BatchResult(this.zzMa.zzLX ? new Status(13) : Status.zzNo, this.zzMa.zzLZ));
                    }
                }
            }
        }
    }

    private Batch(List<PendingResult<?>> pendingResultList, Looper looper) {
        super(new CallbackHandler(looper));
        this.zznh = new Object();
        this.zzLW = pendingResultList.size();
        this.zzLZ = new PendingResult[this.zzLW];
        for (int i = 0; i < pendingResultList.size(); i++) {
            PendingResult pendingResult = (PendingResult) pendingResultList.get(i);
            this.zzLZ[i] = pendingResult;
            pendingResult.addBatchCallback(new C03511(this));
        }
    }

    public void cancel() {
        super.cancel();
        for (PendingResult cancel : this.zzLZ) {
            cancel.cancel();
        }
    }

    public BatchResult createFailedResult(Status status) {
        return new BatchResult(status, this.zzLZ);
    }
}
