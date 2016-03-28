package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class zzj extends zzi {
    private static AdvertisingIdClient zzkN;
    private static CountDownLatch zzkO;
    private static boolean zzkP;

    class zza {
        private String zzkQ;
        private boolean zzkR;
        final /* synthetic */ zzj zzkS;

        public zza(zzj com_google_android_gms_internal_zzj, String str, boolean z) {
            this.zzkS = com_google_android_gms_internal_zzj;
            this.zzkQ = str;
            this.zzkR = z;
        }

        public String getId() {
            return this.zzkQ;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzkR;
        }
    }

    private static final class zzb implements Runnable {
        private Context zzkT;

        public zzb(Context context) {
            this.zzkT = context.getApplicationContext();
            if (this.zzkT == null) {
                this.zzkT = context;
            }
        }

        public void run() {
            try {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzkT);
                advertisingIdClient.start();
                synchronized (zzj.class) {
                    if (zzj.zzkN == null) {
                        zzj.zzkN = advertisingIdClient;
                    } else {
                        advertisingIdClient.finish();
                    }
                }
            } catch (GooglePlayServicesNotAvailableException e) {
                zzj.zzkP = true;
            } catch (IOException e2) {
            } catch (GooglePlayServicesRepairableException e3) {
            }
            zzj.zzkO.countDown();
        }
    }

    static {
        zzkN = null;
        zzkO = new CountDownLatch(1);
    }

    protected zzj(Context context, zzm com_google_android_gms_internal_zzm, zzn com_google_android_gms_internal_zzn) {
        super(context, com_google_android_gms_internal_zzm, com_google_android_gms_internal_zzn);
    }

    public static zzj zza(String str, Context context) {
        zzm com_google_android_gms_internal_zze = new zze();
        zzi.zza(str, context, com_google_android_gms_internal_zze);
        synchronized (zzj.class) {
            if (zzkN == null) {
                new Thread(new zzb(context)).start();
            }
        }
        return new zzj(context, com_google_android_gms_internal_zze, new zzp(239));
    }

    protected void zzb(Context context) {
        super.zzb(context);
        try {
            if (zzkP) {
                zza(24, zzi.zzd(context));
                return;
            }
            zza zzz = zzz();
            zza(28, zzz.isLimitAdTrackingEnabled() ? 1 : 0);
            String id = zzz.getId();
            if (id != null) {
                zza(26, 5);
                zza(24, id);
            }
        } catch (IOException e) {
        } catch (zza e2) {
        }
    }

    zza zzz() throws IOException {
        int i = 0;
        synchronized (zzj.class) {
            try {
                zza com_google_android_gms_internal_zzj_zza;
                if (!zzkO.await(2, TimeUnit.SECONDS)) {
                    com_google_android_gms_internal_zzj_zza = new zza(this, null, false);
                    return com_google_android_gms_internal_zzj_zza;
                } else if (zzkN == null) {
                    com_google_android_gms_internal_zzj_zza = new zza(this, null, false);
                    return com_google_android_gms_internal_zzj_zza;
                } else {
                    String str;
                    Info info = zzkN.getInfo();
                    String id = info.getId();
                    if (id == null || !id.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")) {
                        str = id;
                    } else {
                        byte[] bArr = new byte[16];
                        int i2 = 0;
                        while (i < id.length()) {
                            if (i == 8 || i == 13 || i == 18 || i == 23) {
                                i++;
                            }
                            bArr[i2] = (byte) ((Character.digit(id.charAt(i), 16) << 4) + Character.digit(id.charAt(i + 1), 16));
                            i2++;
                            i += 2;
                        }
                        str = this.zzkx.zza(bArr, true);
                    }
                    return new zza(this, str, info.isLimitAdTrackingEnabled());
                }
            } catch (InterruptedException e) {
                return new zza(this, null, false);
            }
        }
    }
}
