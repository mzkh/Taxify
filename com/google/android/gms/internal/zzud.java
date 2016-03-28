package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.internal.zztw.zzd;
import com.google.android.gms.location.places.Place;
import java.util.HashSet;
import java.util.Set;

public class zzud implements Creator<zzd> {
    static void zza(zzd com_google_android_gms_internal_zztw_zzd, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        Set set = com_google_android_gms_internal_zztw_zzd.zzauX;
        if (set.contains(Integer.valueOf(1))) {
            zzb.zzc(parcel, 1, com_google_android_gms_internal_zztw_zzd.zzFG);
        }
        if (set.contains(Integer.valueOf(2))) {
            zzb.zza(parcel, 2, com_google_android_gms_internal_zztw_zzd.zzavv, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            zzb.zza(parcel, 3, com_google_android_gms_internal_zztw_zzd.zzawv, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            zzb.zza(parcel, 4, com_google_android_gms_internal_zztw_zzd.zzavy, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            zzb.zza(parcel, 5, com_google_android_gms_internal_zztw_zzd.zzaww, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            zzb.zza(parcel, 6, com_google_android_gms_internal_zztw_zzd.zzawx, true);
        }
        if (set.contains(Integer.valueOf(7))) {
            zzb.zza(parcel, 7, com_google_android_gms_internal_zztw_zzd.zzawy, true);
        }
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzeH(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzgU(x0);
    }

    public zzd zzeH(Parcel parcel) {
        String str = null;
        int zzJ = zza.zzJ(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    str6 = zza.zzo(parcel, zzI);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    str5 = zza.zzo(parcel, zzI);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    str4 = zza.zzo(parcel, zzI);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    str3 = zza.zzo(parcel, zzI);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case Place.TYPE_ATM /*6*/:
                    str2 = zza.zzo(parcel, zzI);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    str = zza.zzo(parcel, zzI);
                    hashSet.add(Integer.valueOf(7));
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzd(hashSet, i, str6, str5, str4, str3, str2, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzd[] zzgU(int i) {
        return new zzd[i];
    }
}
