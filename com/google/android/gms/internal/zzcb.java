package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.LinkedHashMap;
import java.util.Map;

public class zzcb {
    private Context mContext;
    private String zznf;
    private boolean zzqO;
    private int zzqP;
    private int zzqQ;
    private int zzqR;
    private int zzqS;
    private String zzqT;
    private Map<String, String> zzqU;

    public zzcb() {
        this.mContext = null;
        this.zznf = null;
        this.zzqO = ((Boolean) zzca.zzqy.get()).booleanValue();
        this.zzqT = (String) zzca.zzqA.get();
        this.zzqQ = 30;
        this.zzqR = 3;
        this.zzqS = 100;
        this.zzqP = ((Integer) zzca.zzqz.get()).intValue();
        this.zzqU = new LinkedHashMap();
        this.zzqU.put("s", "gmob_sdk");
        this.zzqU.put("v", "3");
        this.zzqU.put("os", VERSION.RELEASE);
        this.zzqU.put("sdk", VERSION.SDK);
        this.zzqU.put("device", zzab.zzaM().zzev());
    }

    Context getContext() {
        return this.mContext;
    }

    String zzaX() {
        return this.zznf;
    }

    public zzcb zzb(Context context, String str) {
        this.mContext = context;
        this.zznf = str;
        this.zzqU.put("ua", zzab.zzaM().zze(context, str));
        try {
            this.zzqU.put("app", context.getApplicationContext().getPackageName());
        } catch (NullPointerException e) {
            zzhx.zzac("Cannot get the application name. Set to null.");
            this.zzqU.put("app", null);
        }
        return this;
    }

    boolean zzcd() {
        return this.zzqO;
    }

    String zzce() {
        return this.zzqT;
    }

    int zzcf() {
        return this.zzqQ;
    }

    int zzcg() {
        return this.zzqR;
    }

    int zzch() {
        return this.zzqS;
    }

    int zzci() {
        return this.zzqP;
    }

    Map<String, String> zzcj() {
        return this.zzqU;
    }
}
