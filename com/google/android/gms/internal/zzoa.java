package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.zzar;
import com.google.android.gms.fitness.request.zzav;
import com.google.android.gms.fitness.request.zzu;
import com.google.android.gms.fitness.result.BleDevicesResult;

public class zzoa implements BleApi {

    private static class zza extends com.google.android.gms.internal.zzoj.zza {
        private final zzb<BleDevicesResult> zzHa;

        private zza(zzb<BleDevicesResult> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_BleDevicesResult) {
            this.zzHa = com_google_android_gms_common_api_zza_zzb_com_google_android_gms_fitness_result_BleDevicesResult;
        }

        public void zza(BleDevicesResult bleDevicesResult) {
            this.zzHa.zzd(bleDevicesResult);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoa.6 */
    class C06546 extends zza<BleDevicesResult> {
        final /* synthetic */ zzoa zzaaa;

        C06546(zzoa com_google_android_gms_internal_zzoa, GoogleApiClient googleApiClient) {
            this.zzaaa = com_google_android_gms_internal_zzoa;
            super(googleApiClient);
        }

        protected /* synthetic */ Result createFailedResult(Status x0) {
            return zzu(x0);
        }

        protected void zza(zzmz com_google_android_gms_internal_zzmz) throws RemoteException {
            ((zznj) com_google_android_gms_internal_zzmz.zzjb()).zza(new zzu(new zza(null), com_google_android_gms_internal_zzmz.getContext().getPackageName()));
        }

        protected BleDevicesResult zzu(Status status) {
            return BleDevicesResult.zzB(status);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoa.1 */
    class C08041 extends zzc {
        final /* synthetic */ StartBleScanRequest zzZZ;
        final /* synthetic */ zzoa zzaaa;

        C08041(zzoa com_google_android_gms_internal_zzoa, GoogleApiClient googleApiClient, StartBleScanRequest startBleScanRequest) {
            this.zzaaa = com_google_android_gms_internal_zzoa;
            this.zzZZ = startBleScanRequest;
            super(googleApiClient);
        }

        protected void zza(zzmz com_google_android_gms_internal_zzmz) throws RemoteException {
            ((zznj) com_google_android_gms_internal_zzmz.zzjb()).zza(new StartBleScanRequest(this.zzZZ, new zzoh(this), com_google_android_gms_internal_zzmz.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoa.2 */
    class C08052 extends zzc {
        final /* synthetic */ zzoa zzaaa;
        final /* synthetic */ BleScanCallback zzaab;

        C08052(zzoa com_google_android_gms_internal_zzoa, GoogleApiClient googleApiClient, BleScanCallback bleScanCallback) {
            this.zzaaa = com_google_android_gms_internal_zzoa;
            this.zzaab = bleScanCallback;
            super(googleApiClient);
        }

        protected void zza(zzmz com_google_android_gms_internal_zzmz) throws RemoteException {
            ((zznj) com_google_android_gms_internal_zzmz.zzjb()).zza(new zzar(this.zzaab, new zzoh(this), com_google_android_gms_internal_zzmz.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoa.3 */
    class C08063 extends zzc {
        final /* synthetic */ zzoa zzaaa;
        final /* synthetic */ String zzaac;

        C08063(zzoa com_google_android_gms_internal_zzoa, GoogleApiClient googleApiClient, String str) {
            this.zzaaa = com_google_android_gms_internal_zzoa;
            this.zzaac = str;
            super(googleApiClient);
        }

        protected void zza(zzmz com_google_android_gms_internal_zzmz) throws RemoteException {
            ((zznj) com_google_android_gms_internal_zzmz.zzjb()).zza(new com.google.android.gms.fitness.request.zzb(this.zzaac, null, new zzoh(this), com_google_android_gms_internal_zzmz.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoa.4 */
    class C08074 extends zzc {
        final /* synthetic */ zzoa zzaaa;
        final /* synthetic */ BleDevice zzaad;

        C08074(zzoa com_google_android_gms_internal_zzoa, GoogleApiClient googleApiClient, BleDevice bleDevice) {
            this.zzaaa = com_google_android_gms_internal_zzoa;
            this.zzaad = bleDevice;
            super(googleApiClient);
        }

        protected void zza(zzmz com_google_android_gms_internal_zzmz) throws RemoteException {
            ((zznj) com_google_android_gms_internal_zzmz.zzjb()).zza(new com.google.android.gms.fitness.request.zzb(this.zzaad.getAddress(), this.zzaad, new zzoh(this), com_google_android_gms_internal_zzmz.getContext().getPackageName()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzoa.5 */
    class C08085 extends zzc {
        final /* synthetic */ zzoa zzaaa;
        final /* synthetic */ String zzaac;

        C08085(zzoa com_google_android_gms_internal_zzoa, GoogleApiClient googleApiClient, String str) {
            this.zzaaa = com_google_android_gms_internal_zzoa;
            this.zzaac = str;
            super(googleApiClient);
        }

        protected void zza(zzmz com_google_android_gms_internal_zzmz) throws RemoteException {
            ((zznj) com_google_android_gms_internal_zzmz.zzjb()).zza(new zzav(this.zzaac, new zzoh(this), com_google_android_gms_internal_zzmz.getContext().getPackageName()));
        }
    }

    public PendingResult<Status> claimBleDevice(GoogleApiClient client, BleDevice bleDevice) {
        return client.zzb(new C08074(this, client, bleDevice));
    }

    public PendingResult<Status> claimBleDevice(GoogleApiClient client, String deviceAddress) {
        return client.zzb(new C08063(this, client, deviceAddress));
    }

    public PendingResult<BleDevicesResult> listClaimedBleDevices(GoogleApiClient client) {
        return client.zza(new C06546(this, client));
    }

    public PendingResult<Status> startBleScan(GoogleApiClient client, StartBleScanRequest request) {
        return client.zza(new C08041(this, client, request));
    }

    public PendingResult<Status> stopBleScan(GoogleApiClient client, BleScanCallback requestCallback) {
        return client.zza(new C08052(this, client, requestCallback));
    }

    public PendingResult<Status> unclaimBleDevice(GoogleApiClient client, BleDevice bleDevice) {
        return unclaimBleDevice(client, bleDevice.getAddress());
    }

    public PendingResult<Status> unclaimBleDevice(GoogleApiClient client, String deviceAddress) {
        return client.zzb(new C08085(this, client, deviceAddress));
    }
}
