package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;

public class zzio implements Creator<zzin> {
    static void zza(zzin com_google_android_gms_internal_zzin, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, com_google_android_gms_internal_zzin.zzFH, i, false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, com_google_android_gms_internal_zzin.zzFG);
        zzb.zza(parcel, 2, com_google_android_gms_internal_zzin.zzFI, false);
        zzb.zza(parcel, 3, com_google_android_gms_internal_zzin.zzFJ);
        zzb.zza(parcel, 4, com_google_android_gms_internal_zzin.account, i, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzl(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzP(x0);
    }

    public zzin[] zzP(int i) {
        return new zzin[i];
    }

    public zzin zzl(Parcel parcel) {
        boolean z = false;
        Account account = null;
        int zzJ = zza.zzJ(parcel);
        String str = null;
        zzir[] com_google_android_gms_internal_zzirArr = null;
        int i = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    com_google_android_gms_internal_zzirArr = (zzir[]) zza.zzb(parcel, zzI, zzir.CREATOR);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    account = (Account) zza.zza(parcel, zzI, Account.CREATOR);
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
            return new zzin(i, com_google_android_gms_internal_zzirArr, str, z, account);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }
}
