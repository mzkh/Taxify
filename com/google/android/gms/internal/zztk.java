package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zztk implements Creator<zztj> {
    static void zza(zztj com_google_android_gms_internal_zztj, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_internal_zztj.versionCode);
        zzb.zza(parcel, 2, com_google_android_gms_internal_zztj.packageName, false);
        zzb.zzc(parcel, 3, com_google_android_gms_internal_zztj.zzatW);
        zzb.zzc(parcel, 4, com_google_android_gms_internal_zztj.zzatX);
        zzb.zza(parcel, 5, com_google_android_gms_internal_zztj.zzatY, false);
        zzb.zza(parcel, 6, com_google_android_gms_internal_zztj.zzatZ, false);
        zzb.zza(parcel, 7, com_google_android_gms_internal_zztj.zzaua);
        zzb.zza(parcel, 8, com_google_android_gms_internal_zztj.zzaub, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzew(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzgI(x0);
    }

    public zztj zzew(Parcel parcel) {
        int i = 0;
        String str = null;
        int zzJ = zza.zzJ(parcel);
        boolean z = true;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    str4 = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zztj(i3, str4, i2, i, str3, str2, z, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zztj[] zzgI(int i) {
        return new zztj[i];
    }
}
