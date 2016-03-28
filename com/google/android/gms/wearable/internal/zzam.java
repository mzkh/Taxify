package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zzam implements Creator<zzal> {
    static void zza(zzal com_google_android_gms_wearable_internal_zzal, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_wearable_internal_zzal.zzFG);
        zzb.zzc(parcel, 2, com_google_android_gms_wearable_internal_zzal.getRequestId());
        zzb.zza(parcel, 3, com_google_android_gms_wearable_internal_zzal.getPath(), false);
        zzb.zza(parcel, 4, com_google_android_gms_wearable_internal_zzal.getData(), false);
        zzb.zza(parcel, 5, com_google_android_gms_wearable_internal_zzal.getSourceNodeId(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzfF(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzif(x0);
    }

    public zzal zzfF(Parcel parcel) {
        int i = 0;
        String str = null;
        int zzJ = zza.zzJ(parcel);
        byte[] bArr = null;
        String str2 = null;
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
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    bArr = zza.zzr(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzal(i2, i, str2, bArr, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzal[] zzif(int i) {
        return new zzal[i];
    }
}
