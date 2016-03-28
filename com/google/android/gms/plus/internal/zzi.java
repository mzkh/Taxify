package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;

public class zzi implements Creator<zzh> {
    static void zza(zzh com_google_android_gms_plus_internal_zzh, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, com_google_android_gms_plus_internal_zzh.getAccountName(), false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, com_google_android_gms_plus_internal_zzh.getVersionCode());
        zzb.zza(parcel, 2, com_google_android_gms_plus_internal_zzh.zzrS(), false);
        zzb.zza(parcel, 3, com_google_android_gms_plus_internal_zzh.zzrT(), false);
        zzb.zza(parcel, 4, com_google_android_gms_plus_internal_zzh.zzrU(), false);
        zzb.zza(parcel, 5, com_google_android_gms_plus_internal_zzh.zzrV(), false);
        zzb.zza(parcel, 6, com_google_android_gms_plus_internal_zzh.zzrW(), false);
        zzb.zza(parcel, 7, com_google_android_gms_plus_internal_zzh.zzrX(), false);
        zzb.zza(parcel, 8, com_google_android_gms_plus_internal_zzh.zzrY(), false);
        zzb.zza(parcel, 9, com_google_android_gms_plus_internal_zzh.zzrZ(), i, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzey(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzgL(x0);
    }

    public zzh zzey(Parcel parcel) {
        PlusCommonExtras plusCommonExtras = null;
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str5 = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    str5 = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    strArr3 = zza.zzA(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    strArr2 = zza.zzA(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    strArr = zza.zzA(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    str4 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
                    plusCommonExtras = (PlusCommonExtras) zza.zza(parcel, zzI, PlusCommonExtras.CREATOR);
                    break;
                case GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE /*1000*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzh(i, str5, strArr3, strArr2, strArr, str4, str3, str2, str, plusCommonExtras);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzh[] zzgL(int i) {
        return new zzh[i];
    }
}
