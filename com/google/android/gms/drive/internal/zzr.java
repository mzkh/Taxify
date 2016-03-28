package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEventService;
import com.google.android.gms.drive.events.zzc;
import com.google.android.gms.drive.events.zzd;
import com.google.android.gms.drive.internal.zzq.zza;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzr extends zzk<zzag> {
    private final String zzMh;
    private final Bundle zzTC;
    private final boolean zzTD;
    private DriveId zzTE;
    private DriveId zzTF;
    final ConnectionCallbacks zzTG;
    final Map<DriveId, Map<zzc, zzaa>> zzTH;

    /* renamed from: com.google.android.gms.drive.internal.zzr.1 */
    class C07051 extends zza {
        final /* synthetic */ DriveId zzTI;
        final /* synthetic */ int zzTJ;
        final /* synthetic */ zzaa zzTK;
        final /* synthetic */ zzr zzTL;

        C07051(zzr com_google_android_gms_drive_internal_zzr, GoogleApiClient googleApiClient, DriveId driveId, int i, zzaa com_google_android_gms_drive_internal_zzaa) {
            this.zzTL = com_google_android_gms_drive_internal_zzr;
            this.zzTI = driveId;
            this.zzTJ = i;
            this.zzTK = com_google_android_gms_drive_internal_zzaa;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new AddEventListenerRequest(this.zzTI, this.zzTJ), this.zzTK, null, new zzbl(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzr.2 */
    class C07062 extends zza {
        final /* synthetic */ DriveId zzTI;
        final /* synthetic */ int zzTJ;
        final /* synthetic */ zzr zzTL;
        final /* synthetic */ zzaa zzTM;

        C07062(zzr com_google_android_gms_drive_internal_zzr, GoogleApiClient googleApiClient, DriveId driveId, int i, zzaa com_google_android_gms_drive_internal_zzaa) {
            this.zzTL = com_google_android_gms_drive_internal_zzr;
            this.zzTI = driveId;
            this.zzTJ = i;
            this.zzTM = com_google_android_gms_drive_internal_zzaa;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new RemoveEventListenerRequest(this.zzTI, this.zzTJ), this.zzTM, null, new zzbl(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzr.3 */
    class C07073 extends zza {
        final /* synthetic */ DriveId zzTI;
        final /* synthetic */ int zzTJ;
        final /* synthetic */ zzr zzTL;

        C07073(zzr com_google_android_gms_drive_internal_zzr, GoogleApiClient googleApiClient, DriveId driveId, int i) {
            this.zzTL = com_google_android_gms_drive_internal_zzr;
            this.zzTI = driveId;
            this.zzTJ = i;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new AddEventListenerRequest(this.zzTI, this.zzTJ), null, null, new zzbl(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzr.4 */
    class C07084 extends zza {
        final /* synthetic */ DriveId zzTI;
        final /* synthetic */ int zzTJ;
        final /* synthetic */ zzr zzTL;

        C07084(zzr com_google_android_gms_drive_internal_zzr, GoogleApiClient googleApiClient, DriveId driveId, int i) {
            this.zzTL = com_google_android_gms_drive_internal_zzr;
            this.zzTI = driveId;
            this.zzTJ = i;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new RemoveEventListenerRequest(this.zzTI, this.zzTJ), null, null, new zzbl(this));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.zzr.5 */
    class C07095 extends zza {
        final /* synthetic */ zzr zzTL;
        final /* synthetic */ List zzTN;

        C07095(zzr com_google_android_gms_drive_internal_zzr, GoogleApiClient googleApiClient, List list) {
            this.zzTL = com_google_android_gms_drive_internal_zzr;
            this.zzTN = list;
            super(googleApiClient);
        }

        protected void zza(zzr com_google_android_gms_drive_internal_zzr) throws RemoteException {
            com_google_android_gms_drive_internal_zzr.zzkF().zza(new CancelPendingActionsRequest(this.zzTN), new zzbl(this));
        }
    }

    public zzr(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, Bundle bundle) {
        super(context, looper, 11, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzf);
        this.zzTH = new HashMap();
        this.zzMh = com_google_android_gms_common_internal_zzf.zziR();
        this.zzTG = connectionCallbacks;
        this.zzTC = bundle;
        Intent intent = new Intent(DriveEventService.ACTION_HANDLE_EVENT);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        switch (queryIntentServices.size()) {
            case SpinnerCompat.MODE_DIALOG /*0*/:
                this.zzTD = false;
            case CompletionEvent.STATUS_FAILURE /*1*/:
                ServiceInfo serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
                if (serviceInfo.exported) {
                    this.zzTD = true;
                    return;
                }
                throw new IllegalStateException("Drive event service " + serviceInfo.name + " must be exported in AndroidManifest.xml");
            default:
                throw new IllegalStateException("AndroidManifest.xml can only define one service that handles the " + intent.getAction() + " action");
        }
    }

    PendingResult<Status> cancelPendingActions(GoogleApiClient apiClient, List<String> pendingTags) {
        boolean z = true;
        zzx.zzO(pendingTags != null);
        if (pendingTags.isEmpty()) {
            z = false;
        }
        zzx.zzO(z);
        zzx.zza(isConnected(), (Object) "Client must be connected");
        return apiClient.zzb(new C07095(this, apiClient, pendingTags));
    }

    public void disconnect() {
        if (isConnected()) {
            try {
                ((zzag) zzjb()).zza(new DisconnectRequest());
            } catch (RemoteException e) {
            }
        }
        super.disconnect();
        this.zzTH.clear();
    }

    PendingResult<Status> zza(GoogleApiClient googleApiClient, DriveId driveId, int i) {
        zzx.zzb(zzd.zza(i, driveId), (Object) "id");
        zzx.zza(isConnected(), (Object) "Client must be connected");
        if (this.zzTD) {
            return googleApiClient.zzb(new C07073(this, googleApiClient, driveId, i));
        }
        throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
    }

    PendingResult<Status> zza(GoogleApiClient googleApiClient, DriveId driveId, int i, zzc com_google_android_gms_drive_events_zzc) {
        PendingResult<Status> com_google_android_gms_drive_internal_zzp_zzj;
        zzx.zzb(zzd.zza(i, driveId), (Object) "id");
        zzx.zzb((Object) com_google_android_gms_drive_events_zzc, (Object) "listener");
        zzx.zza(isConnected(), (Object) "Client must be connected");
        synchronized (this.zzTH) {
            Map map;
            zzaa com_google_android_gms_drive_internal_zzaa;
            Map map2 = (Map) this.zzTH.get(driveId);
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                this.zzTH.put(driveId, hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            zzaa com_google_android_gms_drive_internal_zzaa2 = (zzaa) map.get(com_google_android_gms_drive_events_zzc);
            if (com_google_android_gms_drive_internal_zzaa2 == null) {
                com_google_android_gms_drive_internal_zzaa = new zzaa(getLooper(), getContext(), i, com_google_android_gms_drive_events_zzc);
                map.put(com_google_android_gms_drive_events_zzc, com_google_android_gms_drive_internal_zzaa);
            } else if (com_google_android_gms_drive_internal_zzaa2.zzbK(i)) {
                com_google_android_gms_drive_internal_zzp_zzj = new zzj(googleApiClient, Status.zzNo);
            } else {
                com_google_android_gms_drive_internal_zzaa = com_google_android_gms_drive_internal_zzaa2;
            }
            com_google_android_gms_drive_internal_zzaa.zzbJ(i);
            com_google_android_gms_drive_internal_zzp_zzj = googleApiClient.zzb(new C07051(this, googleApiClient, driveId, i, com_google_android_gms_drive_internal_zzaa));
        }
        return com_google_android_gms_drive_internal_zzp_zzj;
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.zzTE = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.zzTF = (DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.zza(i, iBinder, bundle);
    }

    protected zzag zzab(IBinder iBinder) {
        return zzag.zza.zzac(iBinder);
    }

    PendingResult<Status> zzb(GoogleApiClient googleApiClient, DriveId driveId, int i) {
        zzx.zzb(zzd.zza(i, driveId), (Object) "id");
        zzx.zza(isConnected(), (Object) "Client must be connected");
        return googleApiClient.zzb(new C07084(this, googleApiClient, driveId, i));
    }

    PendingResult<Status> zzb(GoogleApiClient googleApiClient, DriveId driveId, int i, zzc com_google_android_gms_drive_events_zzc) {
        PendingResult<Status> com_google_android_gms_drive_internal_zzp_zzj;
        zzx.zzb(zzd.zza(i, driveId), (Object) "id");
        zzx.zza(isConnected(), (Object) "Client must be connected");
        zzx.zzb((Object) com_google_android_gms_drive_events_zzc, (Object) "listener");
        synchronized (this.zzTH) {
            Map map = (Map) this.zzTH.get(driveId);
            if (map == null) {
                com_google_android_gms_drive_internal_zzp_zzj = new zzj(googleApiClient, Status.zzNo);
            } else {
                zzaa com_google_android_gms_drive_internal_zzaa = (zzaa) map.remove(com_google_android_gms_drive_events_zzc);
                if (com_google_android_gms_drive_internal_zzaa == null) {
                    com_google_android_gms_drive_internal_zzp_zzj = new zzj(googleApiClient, Status.zzNo);
                } else {
                    if (map.isEmpty()) {
                        this.zzTH.remove(driveId);
                    }
                    com_google_android_gms_drive_internal_zzp_zzj = googleApiClient.zzb(new C07062(this, googleApiClient, driveId, i, com_google_android_gms_drive_internal_zzaa));
                }
            }
        }
        return com_google_android_gms_drive_internal_zzp_zzj;
    }

    protected String zzcF() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected String zzcG() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    public boolean zzhc() {
        return true;
    }

    protected Bundle zzhq() {
        String packageName = getContext().getPackageName();
        zzx.zzl(packageName);
        zzx.zzl(zziP());
        Bundle bundle = new Bundle();
        if (!packageName.equals(this.zzMh)) {
            bundle.putString("proxy_package_name", this.zzMh);
        }
        bundle.putAll(this.zzTC);
        return bundle;
    }

    public zzag zzkF() throws DeadObjectException {
        return (zzag) zzjb();
    }

    public DriveId zzkG() {
        return this.zzTE;
    }

    public DriveId zzkH() {
        return this.zzTF;
    }

    public boolean zzkI() {
        return this.zzTD;
    }

    protected /* synthetic */ IInterface zzp(IBinder iBinder) {
        return zzab(iBinder);
    }
}
