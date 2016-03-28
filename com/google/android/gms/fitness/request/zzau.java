package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;

public class zzau implements Creator<zzat> {
    static void zza(zzat com_google_android_gms_fitness_request_zzat, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, com_google_android_gms_fitness_request_zzat.zzml(), i, false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, com_google_android_gms_fitness_request_zzat.getVersionCode());
        zzb.zza(parcel, 2, com_google_android_gms_fitness_request_zzat.zzmm());
        zzb.zza(parcel, 3, com_google_android_gms_fitness_request_zzat.zzlQ(), false);
        zzb.zza(parcel, 4, com_google_android_gms_fitness_request_zzat.getPackageName(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzcA(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzdZ(x0);
    }

    public zzat zzcA(Parcel parcel) {
        boolean z = false;
        String str = null;
        int zzJ = zza.zzJ(parcel);
        IBinder iBinder = null;
        Subscription subscription = null;
        int i = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    subscription = (Subscription) zza.zza(parcel, zzI, Subscription.CREATOR);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    iBinder = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
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
            return new zzat(i, subscription, z, iBinder, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzat[] zzdZ(int i) {
        return new zzat[i];
    }
}
