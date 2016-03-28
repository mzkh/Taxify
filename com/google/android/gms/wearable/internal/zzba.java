package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import java.util.List;

public class zzba implements Creator<zzaz> {
    static void zza(zzaz com_google_android_gms_wearable_internal_zzaz, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_wearable_internal_zzaz.versionCode);
        zzb.zzc(parcel, 2, com_google_android_gms_wearable_internal_zzaz.statusCode);
        zzb.zza(parcel, 3, com_google_android_gms_wearable_internal_zzaz.zzaGC);
        zzb.zzc(parcel, 4, com_google_android_gms_wearable_internal_zzaz.zzaGE, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzfL(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzil(x0);
    }

    public zzaz zzfL(Parcel parcel) {
        int i = 0;
        int zzJ = zza.zzJ(parcel);
        long j = 0;
        List list = null;
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
                    j = zza.zzi(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    list = zza.zzc(parcel, zzI, zzaq.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzaz(i2, i, j, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzaz[] zzil(int i) {
        return new zzaz[i];
    }
}
