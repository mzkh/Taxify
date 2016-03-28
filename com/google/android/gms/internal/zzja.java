package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;

public class zzja implements Creator<zziz> {
    static void zza(zziz com_google_android_gms_internal_zziz, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, com_google_android_gms_internal_zziz.name, false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, com_google_android_gms_internal_zziz.zzFG);
        zzb.zza(parcel, 2, com_google_android_gms_internal_zziz.zzGh, false);
        zzb.zza(parcel, 3, com_google_android_gms_internal_zziz.zzGi);
        zzb.zzc(parcel, 4, com_google_android_gms_internal_zziz.weight);
        zzb.zza(parcel, 5, com_google_android_gms_internal_zziz.zzGj);
        zzb.zza(parcel, 6, com_google_android_gms_internal_zziz.zzGk, false);
        zzb.zza(parcel, 7, com_google_android_gms_internal_zziz.zzGl, i, false);
        zzb.zza(parcel, 8, com_google_android_gms_internal_zziz.zzGm, false);
        zzb.zza(parcel, 11, com_google_android_gms_internal_zziz.zzGn, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzr(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzX(x0);
    }

    public zziz[] zzX(int i) {
        return new zziz[i];
    }

    public zziz zzr(Parcel parcel) {
        boolean z = false;
        String str = null;
        int zzJ = zza.zzJ(parcel);
        int i = 1;
        int[] iArr = null;
        zzit[] com_google_android_gms_internal_zzitArr = null;
        String str2 = null;
        boolean z2 = false;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    str4 = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    z2 = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    com_google_android_gms_internal_zzitArr = (zzit[]) zza.zzb(parcel, zzI, zzit.CREATOR);
                    break;
                case Place.TYPE_BANK /*8*/:
                    iArr = zza.zzu(parcel, zzI);
                    break;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE /*1000*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zziz(i2, str4, str3, z2, i, z, str2, com_google_android_gms_internal_zzitArr, iArr, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }
}
