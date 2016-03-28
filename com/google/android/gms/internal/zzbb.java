package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zzbb implements Creator<zzba> {
    static void zza(zzba com_google_android_gms_internal_zzba, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_internal_zzba.versionCode);
        zzb.zza(parcel, 2, com_google_android_gms_internal_zzba.zzpa, false);
        zzb.zzc(parcel, 3, com_google_android_gms_internal_zzba.height);
        zzb.zzc(parcel, 4, com_google_android_gms_internal_zzba.heightPixels);
        zzb.zza(parcel, 5, com_google_android_gms_internal_zzba.zzpb);
        zzb.zzc(parcel, 6, com_google_android_gms_internal_zzba.width);
        zzb.zzc(parcel, 7, com_google_android_gms_internal_zzba.widthPixels);
        zzb.zza(parcel, 8, com_google_android_gms_internal_zzba.zzpc, i, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzc(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzg(x0);
    }

    public zzba zzc(Parcel parcel) {
        zzba[] com_google_android_gms_internal_zzbaArr = null;
        int i = 0;
        int zzJ = zza.zzJ(parcel);
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i5 = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    i4 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    com_google_android_gms_internal_zzbaArr = (zzba[]) zza.zzb(parcel, zzI, zzba.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzba(i5, str, i4, i3, z, i2, i, com_google_android_gms_internal_zzbaArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzba[] zzg(int i) {
        return new zzba[i];
    }
}
