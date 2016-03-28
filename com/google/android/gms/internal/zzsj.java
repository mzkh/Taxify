package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zzsj implements Creator<zzsi> {
    static void zza(zzsi com_google_android_gms_internal_zzsi, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_internal_zzsi.getVersionCode());
        zzb.zzc(parcel, 2, com_google_android_gms_internal_zzsi.getContentType());
        zzb.zza(parcel, 3, com_google_android_gms_internal_zzsi.getUri(), false);
        zzb.zza(parcel, 4, com_google_android_gms_internal_zzsi.getMimeType(), false);
        zzb.zza(parcel, 5, com_google_android_gms_internal_zzsi.getDomain(), false);
        zzb.zza(parcel, 6, com_google_android_gms_internal_zzsi.getType(), false);
        zzb.zza(parcel, 7, com_google_android_gms_internal_zzsi.getPayload(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzes(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzgE(x0);
    }

    public zzsi zzes(Parcel parcel) {
        int i = 0;
        byte[] bArr = null;
        int zzJ = zza.zzJ(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    str4 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    bArr = zza.zzr(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzsi(i2, i, str4, str3, str2, str, bArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzsi[] zzgE(int i) {
        return new zzsi[i];
    }
}
