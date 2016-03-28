package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.places.Place;
import java.util.List;

public class zzph implements Creator<zzpg> {
    static void zza(zzpg com_google_android_gms_internal_zzpg, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, com_google_android_gms_internal_zzpg.zzabx, i, false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, com_google_android_gms_internal_zzpg.getVersionCode());
        zzb.zza(parcel, 2, com_google_android_gms_internal_zzpg.zzanh);
        zzb.zza(parcel, 3, com_google_android_gms_internal_zzpg.zzani);
        zzb.zza(parcel, 4, com_google_android_gms_internal_zzpg.zzanj);
        zzb.zzc(parcel, 5, com_google_android_gms_internal_zzpg.zzank, false);
        zzb.zza(parcel, 6, com_google_android_gms_internal_zzpg.mTag, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzdv(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzfu(x0);
    }

    public zzpg zzdv(Parcel parcel) {
        String str = null;
        boolean z = true;
        boolean z2 = false;
        int zzJ = zza.zzJ(parcel);
        List list = zzpg.zzang;
        boolean z3 = true;
        LocationRequest locationRequest = null;
        int i = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    locationRequest = (LocationRequest) zza.zza(parcel, zzI, LocationRequest.CREATOR);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    z2 = zza.zzc(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    z3 = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    list = zza.zzc(parcel, zzI, zzox.CREATOR);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE /*1000*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzpg(i, locationRequest, z2, z3, z, list, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzpg[] zzfu(int i) {
        return new zzpg[i];
    }
}
