package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import com.google.android.gms.internal.zzd;
import java.util.Map;

class zzbh extends zzaj {
    private static final String ID;
    private static final String zzayC;

    static {
        ID = zza.LOWERCASE_STRING.toString();
        zzayC = zzb.ARG0.toString();
    }

    public zzbh() {
        super(ID, zzayC);
    }

    public zzd.zza zzH(Map<String, zzd.zza> map) {
        return zzde.zzx(zzde.zzg((zzd.zza) map.get(zzayC)).toLowerCase());
    }

    public boolean zzsD() {
        return true;
    }
}
