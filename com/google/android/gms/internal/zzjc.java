package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;

public class zzjc implements Creator<zzjb> {
    static void zza(zzjb com_google_android_gms_internal_zzjb, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, com_google_android_gms_internal_zzjb.zzGw, i, false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, com_google_android_gms_internal_zzjb.zzFG);
        zzb.zza(parcel, 2, com_google_android_gms_internal_zzjb.zzGx);
        zzb.zzc(parcel, 3, com_google_android_gms_internal_zzjb.zzGy);
        zzb.zza(parcel, 4, com_google_android_gms_internal_zzjb.zzpZ, false);
        zzb.zza(parcel, 5, com_google_android_gms_internal_zzjb.zzGz, i, false);
        zzb.zza(parcel, 6, com_google_android_gms_internal_zzjb.zzGA);
        zzb.zzc(parcel, 7, com_google_android_gms_internal_zzjb.zzGB);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzs(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzY(x0);
    }

    public zzjb[] zzY(int i) {
        return new zzjb[i];
    }

    public zzjb zzs(Parcel parcel) {
        zzin com_google_android_gms_internal_zzin = null;
        boolean z = false;
        int zzJ = zza.zzJ(parcel);
        long j = 0;
        int i = -1;
        String str = null;
        int i2 = 0;
        zzip com_google_android_gms_internal_zzip = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    com_google_android_gms_internal_zzip = (zzip) zza.zza(parcel, zzI, zzip.CREATOR);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    j = zza.zzi(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    com_google_android_gms_internal_zzin = (zzin) zza.zza(parcel, zzI, zzin.CREATOR);
                    break;
                case Place.TYPE_ATM /*6*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE /*1000*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzjb(i3, com_google_android_gms_internal_zzip, j, i2, str, com_google_android_gms_internal_zzin, z, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }
}
