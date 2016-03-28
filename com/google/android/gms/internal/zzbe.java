package com.google.android.gms.internal;

@zzgi
public class zzbe {
    private static final Object zzmz;
    private static zzbe zzpg;
    private final zzhw zzph;
    private final zzaw zzpi;
    private final zzbf zzpj;
    private final zzbr zzpk;

    static {
        zzmz = new Object();
        zza(new zzbe());
    }

    protected zzbe() {
        this.zzph = new zzhw();
        this.zzpi = new zzaw();
        this.zzpj = new zzbf();
        this.zzpk = new zzbr();
    }

    protected static void zza(zzbe com_google_android_gms_internal_zzbe) {
        synchronized (zzmz) {
            zzpg = com_google_android_gms_internal_zzbe;
        }
    }

    private static zzbe zzbC() {
        zzbe com_google_android_gms_internal_zzbe;
        synchronized (zzmz) {
            com_google_android_gms_internal_zzbe = zzpg;
        }
        return com_google_android_gms_internal_zzbe;
    }

    public static zzhw zzbD() {
        return zzbC().zzph;
    }

    public static zzaw zzbE() {
        return zzbC().zzpi;
    }

    public static zzbf zzbF() {
        return zzbC().zzpj;
    }
}
