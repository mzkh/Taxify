package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import java.util.List;

public class zzao implements Creator<OnChangesResponse> {
    static void zza(OnChangesResponse onChangesResponse, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, onChangesResponse.zzFG);
        zzb.zza(parcel, 2, onChangesResponse.zzUL, i, false);
        zzb.zzc(parcel, 3, onChangesResponse.zzUM, false);
        zzb.zza(parcel, 4, onChangesResponse.zzUN, i, false);
        zzb.zza(parcel, 5, onChangesResponse.zzUO);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzaB(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzbU(x0);
    }

    public OnChangesResponse zzaB(Parcel parcel) {
        boolean z = false;
        ChangeSequenceNumber changeSequenceNumber = null;
        int zzJ = zza.zzJ(parcel);
        List list = null;
        DataHolder dataHolder = null;
        int i = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    dataHolder = (DataHolder) zza.zza(parcel, zzI, DataHolder.CREATOR);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    list = zza.zzc(parcel, zzI, DriveId.CREATOR);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    changeSequenceNumber = (ChangeSequenceNumber) zza.zza(parcel, zzI, ChangeSequenceNumber.CREATOR);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new OnChangesResponse(i, dataHolder, list, changeSequenceNumber, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public OnChangesResponse[] zzbU(int i) {
        return new OnChangesResponse[i];
    }
}
