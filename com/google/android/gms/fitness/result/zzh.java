package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.GeofenceStatusCodes;

public class zzh implements Creator<DataTypeResult> {
    static void zza(DataTypeResult dataTypeResult, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, dataTypeResult.getStatus(), i, false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, dataTypeResult.getVersionCode());
        zzb.zza(parcel, 3, dataTypeResult.getDataType(), i, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzcI(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzeh(x0);
    }

    public DataTypeResult zzcI(Parcel parcel) {
        DataType dataType = null;
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < zzJ) {
            int i2;
            DataType dataType2;
            Status status2;
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i2 = i;
                    Status status3 = (Status) zza.zza(parcel, zzI, Status.CREATOR);
                    dataType2 = dataType;
                    status2 = status3;
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    dataType2 = (DataType) zza.zza(parcel, zzI, DataType.CREATOR);
                    status2 = status;
                    i2 = i;
                    break;
                case GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE /*1000*/:
                    DataType dataType3 = dataType;
                    status2 = status;
                    i2 = zza.zzg(parcel, zzI);
                    dataType2 = dataType3;
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    dataType2 = dataType;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            dataType = dataType2;
        }
        if (parcel.dataPosition() == zzJ) {
            return new DataTypeResult(i, status, dataType);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public DataTypeResult[] zzeh(int i) {
        return new DataTypeResult[i];
    }
}
