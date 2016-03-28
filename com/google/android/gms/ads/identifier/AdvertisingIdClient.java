package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient {
    private final Context mContext;
    com.google.android.gms.common.zza zzln;
    zzs zzlo;
    boolean zzlp;
    Object zzlq;
    zza zzlr;
    final long zzls;

    public static final class Info {
        private final String zzlx;
        private final boolean zzly;

        public Info(String advertisingId, boolean limitAdTrackingEnabled) {
            this.zzlx = advertisingId;
            this.zzly = limitAdTrackingEnabled;
        }

        public String getId() {
            return this.zzlx;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzly;
        }

        public String toString() {
            return "{" + this.zzlx + "}" + this.zzly;
        }
    }

    static class zza extends Thread {
        private WeakReference<AdvertisingIdClient> zzlt;
        private long zzlu;
        CountDownLatch zzlv;
        boolean zzlw;

        public zza(AdvertisingIdClient advertisingIdClient, long j) {
            this.zzlt = new WeakReference(advertisingIdClient);
            this.zzlu = j;
            this.zzlv = new CountDownLatch(1);
            this.zzlw = false;
            start();
        }

        private void disconnect() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.zzlt.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzlw = true;
            }
        }

        public void cancel() {
            this.zzlv.countDown();
        }

        public void run() {
            try {
                if (!this.zzlv.await(this.zzlu, TimeUnit.MILLISECONDS)) {
                    disconnect();
                }
            } catch (InterruptedException e) {
                disconnect();
            }
        }

        public boolean zzaa() {
            return this.zzlw;
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000);
    }

    public AdvertisingIdClient(Context context, long timeoutInMillis) {
        this.zzlq = new Object();
        zzx.zzl(context);
        this.mContext = context;
        this.zzlp = false;
        this.zzls = timeoutInMillis;
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1);
        try {
            advertisingIdClient.zzb(false);
            Info info = advertisingIdClient.getInfo();
            return info;
        } finally {
            advertisingIdClient.finish();
        }
    }

    private void zzZ() {
        synchronized (this.zzlq) {
            if (this.zzlr != null) {
                this.zzlr.cancel();
                try {
                    this.zzlr.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.zzls > 0) {
                this.zzlr = new zza(this, this.zzls);
            }
        }
    }

    static zzs zza(Context context, com.google.android.gms.common.zza com_google_android_gms_common_zza) throws IOException {
        try {
            return com.google.android.gms.internal.zzs.zza.zzb(com_google_android_gms_common_zza.zzhJ());
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        }
    }

    static com.google.android.gms.common.zza zzh(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context.getPackageManager().getPackageInfo(GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE, 0);
            try {
                GooglePlayServicesUtil.zzI(context);
                ServiceConnection com_google_android_gms_common_zza = new com.google.android.gms.common.zza();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
                if (zzlo.zzka().zza(context, intent, com_google_android_gms_common_zza, 1)) {
                    return com_google_android_gms_common_zza;
                }
                throw new IOException("Connection failure");
            } catch (Throwable e) {
                throw new IOException(e);
            }
        } catch (NameNotFoundException e2) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    protected void finalize() throws Throwable {
        finish();
        super.finalize();
    }

    public void finish() {
        zzx.zzbe("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.mContext == null || this.zzln == null) {
                return;
            }
            try {
                if (this.zzlp) {
                    zzlo.zzka().zza(this.mContext, this.zzln);
                }
            } catch (Throwable e) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", e);
            }
            this.zzlp = false;
            this.zzlo = null;
            this.zzln = null;
        }
    }

    public Info getInfo() throws IOException {
        Info info;
        zzx.zzbe("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzlp) {
                synchronized (this.zzlq) {
                    if (this.zzlr == null || !this.zzlr.zzaa()) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzlp) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Throwable e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Throwable e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            zzx.zzl(this.zzln);
            zzx.zzl(this.zzlo);
            info = new Info(this.zzlo.getId(), this.zzlo.zzc(true));
        }
        zzZ();
        return info;
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzb(true);
    }

    protected void zzb(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzx.zzbe("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzlp) {
                finish();
            }
            this.zzln = zzh(this.mContext);
            this.zzlo = zza(this.mContext, this.zzln);
            this.zzlp = true;
            if (z) {
                zzZ();
            }
        }
    }
}
