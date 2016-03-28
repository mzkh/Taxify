package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzia.zzb;
import com.google.android.gms.internal.zzia.zzc;
import com.google.android.gms.internal.zzia.zzd;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;

@zzgi
public class zzdf {
    private final Context mContext;
    private final Object zznh;
    private final zzhy zznl;
    private final String zzrR;
    private final WeakHashMap<zzia<zzah>, Integer> zzrS;
    private zzd<zzah> zzrT;
    private zzd<zzah> zzrU;
    private zzia<zzah> zzrV;
    private zzah zzrW;
    private int zzrX;

    /* renamed from: com.google.android.gms.internal.zzdf.4 */
    class C01954 extends TimerTask {
        final /* synthetic */ zzia zzrY;
        final /* synthetic */ zzdf zzrZ;

        C01954(zzdf com_google_android_gms_internal_zzdf, zzia com_google_android_gms_internal_zzia) {
            this.zzrZ = com_google_android_gms_internal_zzdf;
            this.zzrY = com_google_android_gms_internal_zzia;
        }

        public void run() {
            synchronized (this.zzrZ.zznh) {
                if (this.zzrY.getStatus() == -1 || this.zzrY.getStatus() == 1) {
                    return;
                }
                this.zzrZ.zzrX = 1;
                this.zzrY.reject();
            }
        }
    }

    static class zza {
        static int zzsc;
        static int zzsd;

        static {
            zzsc = 60000;
            zzsd = 10000;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzdf.1 */
    class C03951 implements com.google.android.gms.internal.zzah.zza {
        final /* synthetic */ zzia zzrY;
        final /* synthetic */ zzdf zzrZ;

        /* renamed from: com.google.android.gms.internal.zzdf.1.1 */
        class C01941 extends TimerTask {
            final /* synthetic */ C03951 zzsa;

            C01941(C03951 c03951) {
                this.zzsa = c03951;
            }

            public void run() {
                synchronized (this.zzsa.zzrZ.zznh) {
                    if (this.zzsa.zzrY.getStatus() == -1 || this.zzsa.zzrY.getStatus() == 1) {
                        return;
                    }
                    this.zzsa.zzrZ.zzrX = 1;
                    this.zzsa.zzrY.reject();
                }
            }
        }

        C03951(zzdf com_google_android_gms_internal_zzdf, zzia com_google_android_gms_internal_zzia) {
            this.zzrZ = com_google_android_gms_internal_zzdf;
            this.zzrY = com_google_android_gms_internal_zzia;
        }

        public void zzbk() {
            new Timer().schedule(new C01941(this), (long) zza.zzsd);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzdf.2 */
    class C03962 implements zzcv {
        final /* synthetic */ zzia zzrY;
        final /* synthetic */ zzdf zzrZ;

        C03962(zzdf com_google_android_gms_internal_zzdf, zzia com_google_android_gms_internal_zzia) {
            this.zzrZ = com_google_android_gms_internal_zzdf;
            this.zzrY = com_google_android_gms_internal_zzia;
        }

        public void zza(zzic com_google_android_gms_internal_zzic, Map<String, String> map) {
            synchronized (this.zzrZ.zznh) {
                if (this.zzrY.getStatus() == -1 || this.zzrY.getStatus() == 1) {
                    return;
                }
                this.zzrY.zzc(this.zzrZ.zzrW);
                this.zzrY.zza(this.zzrZ.zzrT, new zzb());
                this.zzrZ.zzrX = 0;
                if (this.zzrY != this.zzrZ.zzrV) {
                    this.zzrZ.zzd(this.zzrZ.zzrV);
                }
                this.zzrZ.zzrV = this.zzrY;
                this.zzrZ.zzc(this.zzrZ.zzrV);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzdf.3 */
    class C03973 implements zzcv {
        final /* synthetic */ zzdf zzrZ;
        final /* synthetic */ zzhv zzsb;

        C03973(zzdf com_google_android_gms_internal_zzdf, zzhv com_google_android_gms_internal_zzhv) {
            this.zzrZ = com_google_android_gms_internal_zzdf;
            this.zzsb = com_google_android_gms_internal_zzhv;
        }

        public void zza(zzic com_google_android_gms_internal_zzic, Map<String, String> map) {
            synchronized (this.zzrZ.zznh) {
                this.zzrZ.zzrX = 1;
                zzhx.zzaa("Javascript is requesting an update");
                this.zzrZ.zzrW.zzb("/requestReload", (zzcv) this.zzsb.get());
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzdf.5 */
    class C03985 implements zzd<zzah> {
        final /* synthetic */ zzdf zzrZ;

        C03985(zzdf com_google_android_gms_internal_zzdf) {
            this.zzrZ = com_google_android_gms_internal_zzdf;
        }

        public /* synthetic */ void zza(Object obj) {
            zzb((zzah) obj);
        }

        public void zzb(zzah com_google_android_gms_internal_zzah) {
            com_google_android_gms_internal_zzah.destroy();
        }
    }

    public zzdf(Context context, zzhy com_google_android_gms_internal_zzhy, String str) {
        this.zznh = new Object();
        this.zzrX = 1;
        this.zzrR = str;
        this.mContext = context.getApplicationContext();
        this.zznl = com_google_android_gms_internal_zzhy;
        this.zzrS = new WeakHashMap();
        this.zzrT = new zzc();
        this.zzrU = new zzc();
    }

    public zzdf(Context context, zzhy com_google_android_gms_internal_zzhy, String str, zzd<zzah> com_google_android_gms_internal_zzia_zzd_com_google_android_gms_internal_zzah, zzd<zzah> com_google_android_gms_internal_zzia_zzd_com_google_android_gms_internal_zzah2) {
        this(context, com_google_android_gms_internal_zzhy, str);
        this.zzrT = com_google_android_gms_internal_zzia_zzd_com_google_android_gms_internal_zzah;
        this.zzrU = com_google_android_gms_internal_zzia_zzd_com_google_android_gms_internal_zzah2;
    }

    private void zza(zzia<zzah> com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah) {
        this.zzrX = 2;
        this.zzrW = zza(this.mContext, this.zznl);
        this.zzrW.zza(new C03951(this, com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah));
        this.zzrW.zza("/jsLoaded", new C03962(this, com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah));
        zzhv com_google_android_gms_internal_zzhv = new zzhv();
        zzcv c03973 = new C03973(this, com_google_android_gms_internal_zzhv);
        com_google_android_gms_internal_zzhv.set(c03973);
        this.zzrW.zza("/requestReload", c03973);
        if (this.zzrR.endsWith(".js")) {
            this.zzrW.zzf(this.zzrR);
        } else {
            this.zzrW.zzg(this.zzrR);
        }
        new Timer().schedule(new C01954(this, com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah), (long) zza.zzsc);
    }

    protected zzah zza(Context context, zzhy com_google_android_gms_internal_zzhy) {
        return new zzaj(context, com_google_android_gms_internal_zzhy);
    }

    public void zzb(zzia<zzah> com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah) {
        synchronized (this.zznh) {
            zzd((zzia) com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah);
        }
    }

    protected void zzc(zzia<zzah> com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah) {
        synchronized (this.zznh) {
            Integer num = (Integer) this.zzrS.get(com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah);
            if (num == null) {
                num = Integer.valueOf(0);
            }
            zzhx.zzab("Incremented use-counter for js engine.");
            this.zzrS.put(com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah, Integer.valueOf(num.intValue() + 1));
        }
    }

    public zzia<zzah> zzcJ() {
        zzia<zzah> com_google_android_gms_internal_zzib;
        synchronized (this.zznh) {
            if (this.zzrV == null || this.zzrV.getStatus() == -1) {
                com_google_android_gms_internal_zzib = new zzib();
                this.zzrV = com_google_android_gms_internal_zzib;
                zza((zzia) com_google_android_gms_internal_zzib);
                zzc((zzia) com_google_android_gms_internal_zzib);
            } else if (this.zzrX == 0) {
                zzc(this.zzrV);
                com_google_android_gms_internal_zzib = this.zzrV;
            } else if (this.zzrX == 1) {
                zza(new zzib());
                zzc(this.zzrV);
                com_google_android_gms_internal_zzib = this.zzrV;
            } else if (this.zzrX == 2) {
                zzc(this.zzrV);
                com_google_android_gms_internal_zzib = this.zzrV;
            } else {
                zzc(this.zzrV);
                com_google_android_gms_internal_zzib = this.zzrV;
            }
        }
        return com_google_android_gms_internal_zzib;
    }

    protected void zzd(zzia<zzah> com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah) {
        synchronized (this.zznh) {
            Integer num = (Integer) this.zzrS.get(com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah);
            if (num == null || num.intValue() == 0) {
                return;
            }
            num = Integer.valueOf(num.intValue() - 1);
            if (num.intValue() != 0) {
                zzhx.zzab("Decremented use-counter for js engine.");
                this.zzrS.put(com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah, num);
            } else {
                zzhx.zzab("Removing js engine.");
                this.zzrS.remove(com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah);
                com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah.zza(this.zzrU, new zzb());
                com_google_android_gms_internal_zzia_com_google_android_gms_internal_zzah.zza(new C03985(this), new zzb());
            }
        }
    }
}
