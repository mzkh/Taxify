package com.google.android.gms.analytics;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

class zzam implements zzm {
    String zzFr;
    double zzFs;
    int zzFt;
    int zzFu;
    int zzFv;
    int zzFw;
    Map<String, String> zzFx;

    zzam() {
        this.zzFs = -1.0d;
        this.zzFt = -1;
        this.zzFu = -1;
        this.zzFv = -1;
        this.zzFw = -1;
        this.zzFx = new HashMap();
    }

    public int getSessionTimeout() {
        return this.zzFt;
    }

    public String zzas(String str) {
        String str2 = (String) this.zzFx.get(str);
        return str2 != null ? str2 : str;
    }

    public boolean zzgK() {
        return this.zzFr != null;
    }

    public String zzgL() {
        return this.zzFr;
    }

    public boolean zzgM() {
        return this.zzFs >= 0.0d;
    }

    public double zzgN() {
        return this.zzFs;
    }

    public boolean zzgO() {
        return this.zzFt >= 0;
    }

    public boolean zzgP() {
        return this.zzFu != -1;
    }

    public boolean zzgQ() {
        return this.zzFu == 1;
    }

    public boolean zzgR() {
        return this.zzFv != -1;
    }

    public boolean zzgS() {
        return this.zzFv == 1;
    }

    public boolean zzgT() {
        return this.zzFw == 1;
    }

    public String zzq(Activity activity) {
        return zzas(activity.getClass().getCanonicalName());
    }
}
