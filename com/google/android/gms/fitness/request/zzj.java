package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;
import java.util.List;

public class zzj implements Creator<DataSourcesRequest> {
    static void zza(DataSourcesRequest dataSourcesRequest, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, dataSourcesRequest.getDataTypes(), false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, dataSourcesRequest.getVersionCode());
        zzb.zza(parcel, 2, dataSourcesRequest.zzlY(), false);
        zzb.zza(parcel, 3, dataSourcesRequest.zzlZ());
        zzb.zza(parcel, 4, dataSourcesRequest.zzlQ(), false);
        zzb.zza(parcel, 5, dataSourcesRequest.getPackageName(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzcg(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzdE(x0);
    }

    public DataSourcesRequest zzcg(Parcel parcel) {
        boolean z = false;
        String str = null;
        int zzJ = zza.zzJ(parcel);
        IBinder iBinder = null;
        List list = null;
        List list2 = null;
        int i = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    list2 = zza.zzc(parcel, zzI, DataType.CREATOR);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    list = zza.zzB(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    iBinder = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
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
            return new DataSourcesRequest(i, list2, list, z, iBinder, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public DataSourcesRequest[] zzdE(int i) {
        return new DataSourcesRequest[i];
    }
}
