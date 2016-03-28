package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.location.GeofenceStatusCodes;

public class zzi implements Creator<InFilter> {
    static void zza(InFilter inFilter, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, inFilter.zzFG);
        zzb.zza(parcel, 1, inFilter.zzWx, i, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzbp(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzcI(x0);
    }

    public InFilter zzbp(Parcel parcel) {
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    metadataBundle = (MetadataBundle) zza.zza(parcel, zzI, MetadataBundle.CREATOR);
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
            return new InFilter(i, metadataBundle);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public InFilter[] zzcI(int i) {
        return new InFilter[i];
    }
}
