package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.internal.zztw.zzb;
import com.google.android.gms.location.places.Place;
import java.util.HashSet;
import java.util.Set;

public class zztz implements Creator<zzb> {
    static void zza(zzb com_google_android_gms_internal_zztw_zzb, Parcel parcel, int i) {
        int zzK = com.google.android.gms.common.internal.safeparcel.zzb.zzK(parcel);
        Set set = com_google_android_gms_internal_zztw_zzb.zzauX;
        if (set.contains(Integer.valueOf(1))) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, com_google_android_gms_internal_zztw_zzb.zzFG);
        }
        if (set.contains(Integer.valueOf(2))) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, com_google_android_gms_internal_zztw_zzb.zzawq, i, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, com_google_android_gms_internal_zztw_zzb.zzawr, i, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 4, com_google_android_gms_internal_zztw_zzb.zzaws);
        }
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzeD(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzgQ(x0);
    }

    public zzb zzeD(Parcel parcel) {
        zzb.zzb com_google_android_gms_internal_zztw_zzb_zzb = null;
        int i = 0;
        int zzJ = zza.zzJ(parcel);
        Set hashSet = new HashSet();
        zzb.zza com_google_android_gms_internal_zztw_zzb_zza = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i2 = zza.zzg(parcel, zzI);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    zzb.zza com_google_android_gms_internal_zztw_zzb_zza2 = (zzb.zza) zza.zza(parcel, zzI, zzb.zza.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    com_google_android_gms_internal_zztw_zzb_zza = com_google_android_gms_internal_zztw_zzb_zza2;
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    zzb.zzb com_google_android_gms_internal_zztw_zzb_zzb2 = (zzb.zzb) zza.zza(parcel, zzI, zzb.zzb.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    com_google_android_gms_internal_zztw_zzb_zzb = com_google_android_gms_internal_zztw_zzb_zzb2;
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    i = zza.zzg(parcel, zzI);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzb(hashSet, i2, com_google_android_gms_internal_zztw_zzb_zza, com_google_android_gms_internal_zztw_zzb_zzb, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzb[] zzgQ(int i) {
        return new zzb[i];
    }
}
