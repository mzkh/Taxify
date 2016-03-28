package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import com.google.android.gms.internal.zzd;
import java.util.List;
import java.util.Map;

class zzw extends zzdc {
    private static final String ID;
    private static final String VALUE;
    private static final String zzayx;
    private final DataLayer zzaxx;

    static {
        ID = zza.DATA_LAYER_WRITE.toString();
        VALUE = zzb.VALUE.toString();
        zzayx = zzb.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();
    }

    public zzw(DataLayer dataLayer) {
        super(ID, VALUE);
        this.zzaxx = dataLayer;
    }

    private void zza(zzd.zza com_google_android_gms_internal_zzd_zza) {
        if (com_google_android_gms_internal_zzd_zza != null && com_google_android_gms_internal_zzd_zza != zzde.zztZ()) {
            String zzg = zzde.zzg(com_google_android_gms_internal_zzd_zza);
            if (zzg != zzde.zzue()) {
                this.zzaxx.zzcU(zzg);
            }
        }
    }

    private void zzb(zzd.zza com_google_android_gms_internal_zzd_zza) {
        if (com_google_android_gms_internal_zzd_zza != null && com_google_android_gms_internal_zzd_zza != zzde.zztZ()) {
            Object zzl = zzde.zzl(com_google_android_gms_internal_zzd_zza);
            if (zzl instanceof List) {
                for (Object zzl2 : (List) zzl2) {
                    if (zzl2 instanceof Map) {
                        this.zzaxx.push((Map) zzl2);
                    }
                }
            }
        }
    }

    public void zzJ(Map<String, zzd.zza> map) {
        zzb((zzd.zza) map.get(VALUE));
        zza((zzd.zza) map.get(zzayx));
    }
}
