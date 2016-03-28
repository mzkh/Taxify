package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import com.google.android.gms.internal.zzd;
import java.util.Map;

class zze extends zzaj {
    private static final String ID;
    private static final String zzaxn;
    private static final String zzaxo;
    private final Context zzlN;

    static {
        ID = zza.ADWORDS_CLICK_REFERRER.toString();
        zzaxn = zzb.COMPONENT.toString();
        zzaxo = zzb.CONVERSION_ID.toString();
    }

    public zze(Context context) {
        super(ID, zzaxo);
        this.zzlN = context;
    }

    public zzd.zza zzH(Map<String, zzd.zza> map) {
        zzd.zza com_google_android_gms_internal_zzd_zza = (zzd.zza) map.get(zzaxo);
        if (com_google_android_gms_internal_zzd_zza == null) {
            return zzde.zzuf();
        }
        String zzg = zzde.zzg(com_google_android_gms_internal_zzd_zza);
        com_google_android_gms_internal_zzd_zza = (zzd.zza) map.get(zzaxn);
        String zzf = zzaw.zzf(this.zzlN, zzg, com_google_android_gms_internal_zzd_zza != null ? zzde.zzg(com_google_android_gms_internal_zzd_zza) : null);
        return zzf != null ? zzde.zzx(zzf) : zzde.zzuf();
    }

    public boolean zzsD() {
        return true;
    }
}
