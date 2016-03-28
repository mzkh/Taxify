package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.internal.zzal;
import com.google.android.gms.wearable.internal.zzao;
import com.google.android.gms.wearable.internal.zze;

public abstract class WearableListenerService extends Service implements DataListener, MessageListener, NodeListener {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private String zzFO;
    private volatile int zzPm;
    private IBinder zzPp;
    private Handler zzaFF;
    private Object zzaFG;
    private boolean zzaFH;

    private class zza extends com.google.android.gms.wearable.internal.zzah.zza {
        final /* synthetic */ WearableListenerService zzaFI;

        /* renamed from: com.google.android.gms.wearable.WearableListenerService.zza.1 */
        class C03071 implements Runnable {
            final /* synthetic */ DataHolder zzaFJ;
            final /* synthetic */ zza zzaFK;

            C03071(zza com_google_android_gms_wearable_WearableListenerService_zza, DataHolder dataHolder) {
                this.zzaFK = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaFJ = dataHolder;
            }

            public void run() {
                DataEventBuffer dataEventBuffer = new DataEventBuffer(this.zzaFJ);
                try {
                    this.zzaFK.zzaFI.onDataChanged(dataEventBuffer);
                } finally {
                    dataEventBuffer.release();
                }
            }
        }

        /* renamed from: com.google.android.gms.wearable.WearableListenerService.zza.2 */
        class C03082 implements Runnable {
            final /* synthetic */ zza zzaFK;
            final /* synthetic */ zzal zzaFL;

            C03082(zza com_google_android_gms_wearable_WearableListenerService_zza, zzal com_google_android_gms_wearable_internal_zzal) {
                this.zzaFK = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaFL = com_google_android_gms_wearable_internal_zzal;
            }

            public void run() {
                this.zzaFK.zzaFI.onMessageReceived(this.zzaFL);
            }
        }

        /* renamed from: com.google.android.gms.wearable.WearableListenerService.zza.3 */
        class C03093 implements Runnable {
            final /* synthetic */ zza zzaFK;
            final /* synthetic */ zzao zzaFM;

            C03093(zza com_google_android_gms_wearable_WearableListenerService_zza, zzao com_google_android_gms_wearable_internal_zzao) {
                this.zzaFK = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaFM = com_google_android_gms_wearable_internal_zzao;
            }

            public void run() {
                this.zzaFK.zzaFI.onPeerConnected(this.zzaFM);
            }
        }

        /* renamed from: com.google.android.gms.wearable.WearableListenerService.zza.4 */
        class C03104 implements Runnable {
            final /* synthetic */ zza zzaFK;
            final /* synthetic */ zzao zzaFM;

            C03104(zza com_google_android_gms_wearable_WearableListenerService_zza, zzao com_google_android_gms_wearable_internal_zzao) {
                this.zzaFK = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaFM = com_google_android_gms_wearable_internal_zzao;
            }

            public void run() {
                this.zzaFK.zzaFI.onPeerDisconnected(this.zzaFM);
            }
        }

        private zza(WearableListenerService wearableListenerService) {
            this.zzaFI = wearableListenerService;
        }

        public void zza(zzal com_google_android_gms_wearable_internal_zzal) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onMessageReceived: " + com_google_android_gms_wearable_internal_zzal);
            }
            this.zzaFI.zzuZ();
            synchronized (this.zzaFI.zzaFG) {
                if (this.zzaFI.zzaFH) {
                    return;
                }
                this.zzaFI.zzaFF.post(new C03082(this, com_google_android_gms_wearable_internal_zzal));
            }
        }

        public void zza(zzao com_google_android_gms_wearable_internal_zzao) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onPeerConnected: " + this.zzaFI.zzFO + ": " + com_google_android_gms_wearable_internal_zzao);
            }
            this.zzaFI.zzuZ();
            synchronized (this.zzaFI.zzaFG) {
                if (this.zzaFI.zzaFH) {
                    return;
                }
                this.zzaFI.zzaFF.post(new C03093(this, com_google_android_gms_wearable_internal_zzao));
            }
        }

        public void zza(zze com_google_android_gms_wearable_internal_zze) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onNotificationReceived: " + com_google_android_gms_wearable_internal_zze);
            }
        }

        public void zzab(DataHolder dataHolder) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onDataItemChanged: " + this.zzaFI.zzFO + ": " + dataHolder);
            }
            this.zzaFI.zzuZ();
            synchronized (this.zzaFI.zzaFG) {
                if (this.zzaFI.zzaFH) {
                    dataHolder.close();
                    return;
                }
                this.zzaFI.zzaFF.post(new C03071(this, dataHolder));
            }
        }

        public void zzb(zzao com_google_android_gms_wearable_internal_zzao) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onPeerDisconnected: " + this.zzaFI.zzFO + ": " + com_google_android_gms_wearable_internal_zzao);
            }
            this.zzaFI.zzuZ();
            synchronized (this.zzaFI.zzaFG) {
                if (this.zzaFI.zzaFH) {
                    return;
                }
                this.zzaFI.zzaFF.post(new C03104(this, com_google_android_gms_wearable_internal_zzao));
            }
        }
    }

    public WearableListenerService() {
        this.zzPm = -1;
        this.zzaFG = new Object();
    }

    private void zzuZ() throws SecurityException {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.zzPm) {
            if (GooglePlayServicesUtil.zzd(this, callingUid)) {
                this.zzPm = callingUid;
                return;
            }
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    public final IBinder onBind(Intent intent) {
        return BIND_LISTENER_INTENT_ACTION.equals(intent.getAction()) ? this.zzPp : null;
    }

    public void onCreate() {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: " + getPackageName());
        }
        this.zzFO = getPackageName();
        HandlerThread handlerThread = new HandlerThread("WearableListenerService");
        handlerThread.start();
        this.zzaFF = new Handler(handlerThread.getLooper());
        this.zzPp = new zza();
    }

    public void onDataChanged(DataEventBuffer dataEvents) {
    }

    public void onDestroy() {
        synchronized (this.zzaFG) {
            this.zzaFH = true;
            this.zzaFF.getLooper().quit();
        }
        super.onDestroy();
    }

    public void onMessageReceived(MessageEvent messageEvent) {
    }

    public void onPeerConnected(Node peer) {
    }

    public void onPeerDisconnected(Node peer) {
    }
}
