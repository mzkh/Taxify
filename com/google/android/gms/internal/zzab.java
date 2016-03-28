package com.google.android.gms.internal;

import android.os.Build.VERSION;

@zzgi
public class zzab {
    private static zzab zzmN;
    private static final Object zzmz;
    private final zzgj zzmO;
    private final zzei zzmP;
    private final zzem zzmQ;
    private final zzgc zzmR;
    private final zzho zzmS;
    private final zzie zzmT;
    private final zzhp zzmU;
    private final zzhg zzmV;
    private final zzlv zzmW;
    private final zzcd zzmX;
    private final zzby zzmY;
    private final zzbz zzmZ;
    private final zzfj zzna;
    private final zzdp zznb;

    static {
        zzmz = new Object();
        zza(new zzab());
    }

    protected zzab() {
        this.zzmO = new zzgj();
        this.zzmP = new zzei();
        this.zzmQ = new zzem();
        this.zzmR = new zzgc();
        this.zzmS = new zzho();
        this.zzmT = new zzie();
        this.zzmU = zzhp.zzz(VERSION.SDK_INT);
        this.zzmV = new zzhg(this.zzmS);
        this.zzmW = new zzlx();
        this.zzmX = new zzcd();
        this.zzmY = new zzby();
        this.zzmZ = new zzbz();
        this.zzna = new zzfj();
        this.zznb = new zzdp();
    }

    protected static void zza(zzab com_google_android_gms_internal_zzab) {
        synchronized (zzmz) {
            zzmN = com_google_android_gms_internal_zzab;
        }
    }

    private static zzab zzaH() {
        zzab com_google_android_gms_internal_zzab;
        synchronized (zzmz) {
            com_google_android_gms_internal_zzab = zzmN;
        }
        return com_google_android_gms_internal_zzab;
    }

    public static zzgj zzaI() {
        return zzaH().zzmO;
    }

    public static zzei zzaJ() {
        return zzaH().zzmP;
    }

    public static zzem zzaK() {
        return zzaH().zzmQ;
    }

    public static zzgc zzaL() {
        return zzaH().zzmR;
    }

    public static zzho zzaM() {
        return zzaH().zzmS;
    }

    public static zzie zzaN() {
        return zzaH().zzmT;
    }

    public static zzhp zzaO() {
        return zzaH().zzmU;
    }

    public static zzhg zzaP() {
        return zzaH().zzmV;
    }

    public static zzlv zzaQ() {
        return zzaH().zzmW;
    }

    public static zzcd zzaR() {
        return zzaH().zzmX;
    }

    public static zzby zzaS() {
        return zzaH().zzmY;
    }

    public static zzbz zzaT() {
        return zzaH().zzmZ;
    }

    public static zzfj zzaU() {
        return zzaH().zzna;
    }

    public static zzdp zzaV() {
        return zzaH().zznb;
    }
}
