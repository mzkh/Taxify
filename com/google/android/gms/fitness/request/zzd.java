package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;
import java.util.List;

public class zzd implements Creator<DataDeleteRequest> {
    static void zza(DataDeleteRequest dataDeleteRequest, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, dataDeleteRequest.zzlp());
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, dataDeleteRequest.getVersionCode());
        zzb.zza(parcel, 2, dataDeleteRequest.zzlq());
        zzb.zzc(parcel, 3, dataDeleteRequest.getDataSources(), false);
        zzb.zzc(parcel, 4, dataDeleteRequest.getDataTypes(), false);
        zzb.zzc(parcel, 5, dataDeleteRequest.getSessions(), false);
        zzb.zza(parcel, 6, dataDeleteRequest.zzlR());
        zzb.zza(parcel, 7, dataDeleteRequest.zzlS());
        zzb.zza(parcel, 8, dataDeleteRequest.zzlQ(), false);
        zzb.zza(parcel, 9, dataDeleteRequest.getPackageName(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzcc(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzdA(x0);
    }

    public DataDeleteRequest zzcc(Parcel parcel) {
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        long j = 0;
        long j2 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        String str = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    j = zza.zzi(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    j2 = zza.zzi(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    list = zza.zzc(parcel, zzI, DataSource.CREATOR);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    list2 = zza.zzc(parcel, zzI, DataType.CREATOR);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    list3 = zza.zzc(parcel, zzI, Session.CREATOR);
                    break;
                case Place.TYPE_ATM /*6*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    z2 = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    iBinder = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
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
            return new DataDeleteRequest(i, j, j2, list, list2, list3, z, z2, iBinder, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public DataDeleteRequest[] zzdA(int i) {
        return new DataDeleteRequest[i];
    }
}
