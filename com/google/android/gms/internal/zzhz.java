package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zzhz implements Creator<zzhy> {
    static void zza(zzhy com_google_android_gms_internal_zzhy, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_internal_zzhy.versionCode);
        zzb.zza(parcel, 2, com_google_android_gms_internal_zzhy.zzzH, false);
        zzb.zzc(parcel, 3, com_google_android_gms_internal_zzhy.zzzI);
        zzb.zzc(parcel, 4, com_google_android_gms_internal_zzhy.zzzJ);
        zzb.zza(parcel, 5, com_google_android_gms_internal_zzhy.zzzK);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzj(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzB(x0);
    }

    public zzhy[] zzB(int i) {
        return new zzhy[i];
    }

    public zzhy zzj(Parcel parcel) {
        boolean z = false;
        int zzJ = zza.zzJ(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzhy(i3, str, i2, i, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }
}
