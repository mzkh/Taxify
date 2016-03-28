package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;

public class zzwa implements Creator<zzvz> {
    static void zza(zzvz com_google_android_gms_internal_zzvz, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_internal_zzvz.getVersionCode());
        zzb.zza(parcel, 2, com_google_android_gms_internal_zzvz.zzaEr, false);
        zzb.zza(parcel, 3, com_google_android_gms_internal_zzvz.zzaEs, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzfe(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzhB(x0);
    }

    public zzvz zzfe(Parcel parcel) {
        String[] strArr = null;
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        byte[][] bArr = (byte[][]) null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    strArr = zza.zzA(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    bArr = zza.zzs(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzvz(i, strArr, bArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzvz[] zzhB(int i) {
        return new zzvz[i];
    }
}
