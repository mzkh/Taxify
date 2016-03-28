package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class zzh implements Creator<GiftCardWalletObject> {
    static void zza(GiftCardWalletObject giftCardWalletObject, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, giftCardWalletObject.getVersionCode());
        zzb.zza(parcel, 2, giftCardWalletObject.zzaDk, i, false);
        zzb.zza(parcel, 3, giftCardWalletObject.zzaDl, false);
        zzb.zza(parcel, 4, giftCardWalletObject.pin, false);
        zzb.zza(parcel, 5, giftCardWalletObject.zzaDm, false);
        zzb.zza(parcel, 6, giftCardWalletObject.zzaDn);
        zzb.zza(parcel, 7, giftCardWalletObject.zzaDo, false);
        zzb.zza(parcel, 8, giftCardWalletObject.zzaDp);
        zzb.zza(parcel, 9, giftCardWalletObject.zzaDq, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzeU(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzhr(x0);
    }

    public GiftCardWalletObject zzeU(Parcel parcel) {
        long j = 0;
        String str = null;
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        String str2 = null;
        long j2 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        CommonWalletObject commonWalletObject = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    commonWalletObject = (CommonWalletObject) zza.zza(parcel, zzI, CommonWalletObject.CREATOR);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    str5 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    str4 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    j2 = zza.zzi(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    j = zza.zzi(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new GiftCardWalletObject(i, commonWalletObject, str5, str4, str3, j2, str2, j, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public GiftCardWalletObject[] zzhr(int i) {
        return new GiftCardWalletObject[i];
    }
}
