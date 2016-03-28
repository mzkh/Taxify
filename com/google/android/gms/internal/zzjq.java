package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;

public class zzjq implements Creator<zzjp> {
    static void zza(zzjp com_google_android_gms_internal_zzjp, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_internal_zzjp.getVersionCode());
        zzb.zza(parcel, 2, com_google_android_gms_internal_zzjp.zzhl(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzw(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzag(x0);
    }

    public zzjp[] zzag(int i) {
        return new zzjp[i];
    }

    public zzjp zzw(Parcel parcel) {
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzjp(i, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }
}
