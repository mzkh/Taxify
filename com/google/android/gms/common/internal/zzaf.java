package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zzaf implements Creator<zzae> {
    static void zza(zzae com_google_android_gms_common_internal_zzae, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_common_internal_zzae.zzFG);
        zzb.zzc(parcel, 2, com_google_android_gms_common_internal_zzae.zzjr());
        zzb.zza(parcel, 3, com_google_android_gms_common_internal_zzae.zzPn, false);
        zzb.zza(parcel, 4, com_google_android_gms_common_internal_zzae.zzjs(), i, false);
        zzb.zza(parcel, 5, com_google_android_gms_common_internal_zzae.zzjt(), false);
        zzb.zza(parcel, 6, com_google_android_gms_common_internal_zzae.getCallingPackage(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzH(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzaO(x0);
    }

    public zzae zzH(Parcel parcel) {
        int i = 0;
        String str = null;
        int zzJ = zza.zzJ(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    iBinder = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    scopeArr = (Scope[]) zza.zzb(parcel, zzI, Scope.CREATOR);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    bundle = zza.zzq(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzae(i2, i, iBinder, scopeArr, bundle, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzae[] zzaO(int i) {
        return new zzae[i];
    }
}
