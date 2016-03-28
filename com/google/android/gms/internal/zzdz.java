package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.zza;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import java.util.Date;
import java.util.HashSet;

@zzgi
public final class zzdz {

    /* renamed from: com.google.android.gms.internal.zzdz.1 */
    static /* synthetic */ class C02071 {
        static final /* synthetic */ int[] zzsX;
        static final /* synthetic */ int[] zzsY;

        static {
            zzsY = new int[ErrorCode.values().length];
            try {
                zzsY[ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                zzsY[ErrorCode.INVALID_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                zzsY[ErrorCode.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                zzsY[ErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            zzsX = new int[Gender.values().length];
            try {
                zzsX[Gender.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                zzsX[Gender.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                zzsX[Gender.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    public static int zza(ErrorCode errorCode) {
        switch (C02071.zzsY[errorCode.ordinal()]) {
            case CompletionEvent.STATUS_CONFLICT /*2*/:
                return 1;
            case CompletionEvent.STATUS_CANCELED /*3*/:
                return 2;
            case Place.TYPE_AQUARIUM /*4*/:
                return 3;
            default:
                return 0;
        }
    }

    public static AdSize zzb(zzba com_google_android_gms_internal_zzba) {
        int i = 0;
        AdSize[] adSizeArr = new AdSize[]{AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
        while (i < adSizeArr.length) {
            if (adSizeArr[i].getWidth() == com_google_android_gms_internal_zzba.width && adSizeArr[i].getHeight() == com_google_android_gms_internal_zzba.height) {
                return adSizeArr[i];
            }
            i++;
        }
        return new AdSize(zza.zza(com_google_android_gms_internal_zzba.width, com_google_android_gms_internal_zzba.height, com_google_android_gms_internal_zzba.zzpa));
    }

    public static MediationAdRequest zzd(zzax com_google_android_gms_internal_zzax) {
        return new MediationAdRequest(new Date(com_google_android_gms_internal_zzax.zzoL), zzn(com_google_android_gms_internal_zzax.zzoM), com_google_android_gms_internal_zzax.zzoN != null ? new HashSet(com_google_android_gms_internal_zzax.zzoN) : null, com_google_android_gms_internal_zzax.zzoO, com_google_android_gms_internal_zzax.zzoT);
    }

    public static Gender zzn(int i) {
        switch (i) {
            case CompletionEvent.STATUS_FAILURE /*1*/:
                return Gender.MALE;
            case CompletionEvent.STATUS_CONFLICT /*2*/:
                return Gender.FEMALE;
            default:
                return Gender.UNKNOWN;
        }
    }
}
