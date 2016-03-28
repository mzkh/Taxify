package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;

public class zzc implements Creator<zzb> {
    static void zza(zzb com_google_android_gms_wearable_internal_zzb, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_wearable_internal_zzb.zzFG);
        zzb.zza(parcel, 2, com_google_android_gms_wearable_internal_zzb.zzva(), false);
        zzb.zza(parcel, 3, com_google_android_gms_wearable_internal_zzb.zzaFO, i, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzfu(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzhU(x0);
    }

    public zzb zzfu(Parcel parcel) {
        IntentFilter[] intentFilterArr = null;
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    iBinder = zza.zzp(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    intentFilterArr = (IntentFilter[]) zza.zzb(parcel, zzI, IntentFilter.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzb(i, iBinder, intentFilterArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzb[] zzhU(int i) {
        return new zzb[i];
    }
}
