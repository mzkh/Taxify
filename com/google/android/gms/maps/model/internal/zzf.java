package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;

public class zzf implements Creator<zze> {
    static void zza(zze com_google_android_gms_maps_model_internal_zze, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_maps_model_internal_zze.getVersionCode());
        zzb.zza(parcel, 2, com_google_android_gms_maps_model_internal_zze.zzqM(), i, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzej(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzgm(x0);
    }

    public zze zzej(Parcel parcel) {
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        zza com_google_android_gms_maps_model_internal_zza = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    com_google_android_gms_maps_model_internal_zza = (zza) zza.zza(parcel, zzI, zza.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zze(i, com_google_android_gms_maps_model_internal_zza);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zze[] zzgm(int i) {
        return new zze[i];
    }
}
