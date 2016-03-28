package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zza implements Creator<Address> {
    static void zza(Address address, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, address.getVersionCode());
        zzb.zza(parcel, 2, address.name, false);
        zzb.zza(parcel, 3, address.zzalu, false);
        zzb.zza(parcel, 4, address.zzalv, false);
        zzb.zza(parcel, 5, address.zzalw, false);
        zzb.zza(parcel, 6, address.zzyc, false);
        zzb.zza(parcel, 7, address.zzaCP, false);
        zzb.zza(parcel, 8, address.zzaCQ, false);
        zzb.zza(parcel, 9, address.zzalB, false);
        zzb.zza(parcel, 10, address.zzalD, false);
        zzb.zza(parcel, 11, address.zzalE);
        zzb.zza(parcel, 12, address.zzalF, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzeO(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzhl(x0);
    }

    public Address zzeO(Parcel parcel) {
        int zzJ = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z = false;
        String str10 = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    str = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    str2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    str3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    str4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    str6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    str7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
                    str8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    str9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    z = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_BOOK_STORE /*12*/:
                    str10 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzI);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new Address(i, str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10);
        }
        throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public Address[] zzhl(int i) {
        return new Address[i];
    }
}
