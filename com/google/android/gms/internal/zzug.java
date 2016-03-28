package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.internal.zztw.zzh;
import com.google.android.gms.location.places.Place;
import java.util.HashSet;
import java.util.Set;

public class zzug implements Creator<zzh> {
    static void zza(zzh com_google_android_gms_internal_zztw_zzh, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        Set set = com_google_android_gms_internal_zztw_zzh.zzauX;
        if (set.contains(Integer.valueOf(1))) {
            zzb.zzc(parcel, 1, com_google_android_gms_internal_zztw_zzh.zzFG);
        }
        if (set.contains(Integer.valueOf(3))) {
            zzb.zzc(parcel, 3, com_google_android_gms_internal_zztw_zzh.zzso());
        }
        if (set.contains(Integer.valueOf(4))) {
            zzb.zza(parcel, 4, com_google_android_gms_internal_zztw_zzh.mValue, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            zzb.zza(parcel, 5, com_google_android_gms_internal_zztw_zzh.zzawC, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            zzb.zzc(parcel, 6, com_google_android_gms_internal_zztw_zzh.zzJp);
        }
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzeK(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzgX(x0);
    }

    public zzh zzeK(Parcel parcel) {
        String str = null;
        int i = 0;
        int zzJ = zza.zzJ(parcel);
        Set hashSet = new HashSet();
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i3 = zza.zzg(parcel, zzI);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    i = zza.zzg(parcel, zzI);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    str = zza.zzo(parcel, zzI);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    str2 = zza.zzo(parcel, zzI);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case Place.TYPE_ATM /*6*/:
                    i2 = zza.zzg(parcel, zzI);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzh(hashSet, i3, str2, i2, str, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzh[] zzgX(int i) {
        return new zzh[i];
    }
}
