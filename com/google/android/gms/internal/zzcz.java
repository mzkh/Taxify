package com.google.android.gms.internal;

import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import java.util.HashMap;
import java.util.Map;

@zzgi
public class zzcz implements zzcv {
    static final Map<String, Integer> zzrM;
    private final zzu zzrK;
    private final zzeb zzrL;

    static {
        zzrM = new HashMap();
        zzrM.put("resize", Integer.valueOf(1));
        zzrM.put("playVideo", Integer.valueOf(2));
        zzrM.put("storePicture", Integer.valueOf(3));
        zzrM.put("createCalendarEvent", Integer.valueOf(4));
        zzrM.put("setOrientationProperties", Integer.valueOf(5));
        zzrM.put("closeResizedAd", Integer.valueOf(6));
    }

    public zzcz(zzu com_google_android_gms_internal_zzu, zzeb com_google_android_gms_internal_zzeb) {
        this.zzrK = com_google_android_gms_internal_zzu;
        this.zzrL = com_google_android_gms_internal_zzeb;
    }

    public void zza(zzic com_google_android_gms_internal_zzic, Map<String, String> map) {
        int intValue = ((Integer) zzrM.get((String) map.get("a"))).intValue();
        if (intValue == 5 || this.zzrK == null || this.zzrK.zzaB()) {
            switch (intValue) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    this.zzrL.zzg(map);
                    return;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    new zzed(com_google_android_gms_internal_zzic, map).execute();
                    return;
                case Place.TYPE_AQUARIUM /*4*/:
                    new zzea(com_google_android_gms_internal_zzic, map).execute();
                    return;
                case Place.TYPE_ART_GALLERY /*5*/:
                    new zzec(com_google_android_gms_internal_zzic, map).execute();
                    return;
                case Place.TYPE_ATM /*6*/:
                    this.zzrL.zzm(true);
                    return;
                default:
                    zzhx.zzaa("Unknown MRAID command called.");
                    return;
            }
        }
        this.zzrK.zzd(null);
    }
}
