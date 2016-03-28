package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zzi implements Creator<zzf> {
    static void zza(zzf com_google_android_gms_wallet_wobs_zzf, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_wallet_wobs_zzf.getVersionCode());
        zzb.zza(parcel, 2, com_google_android_gms_wallet_wobs_zzf.label, false);
        zzb.zza(parcel, 3, com_google_android_gms_wallet_wobs_zzf.zzaFf, i, false);
        zzb.zza(parcel, 4, com_google_android_gms_wallet_wobs_zzf.type, false);
        zzb.zza(parcel, 5, com_google_android_gms_wallet_wobs_zzf.zzaDG, i, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzfm(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzhM(x0);
    }

    public zzf zzfm(Parcel parcel) {
        zzl com_google_android_gms_wallet_wobs_zzl = null;
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        String str = null;
        zzg com_google_android_gms_wallet_wobs_zzg = null;
        String str2 = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    com_google_android_gms_wallet_wobs_zzg = (zzg) zza.zza(parcel, zzI, zzg.CREATOR);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    com_google_android_gms_wallet_wobs_zzl = (zzl) zza.zza(parcel, zzI, zzl.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzf(i, str2, com_google_android_gms_wallet_wobs_zzg, str, com_google_android_gms_wallet_wobs_zzl);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzf[] zzhM(int i) {
        return new zzf[i];
    }
}
