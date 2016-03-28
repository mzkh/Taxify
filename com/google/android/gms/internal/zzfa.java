package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zzfa implements Creator<zzfb> {
    static void zza(zzfb com_google_android_gms_internal_zzfb, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_internal_zzfb.versionCode);
        zzb.zza(parcel, 3, com_google_android_gms_internal_zzfb.zzdt(), false);
        zzb.zza(parcel, 4, com_google_android_gms_internal_zzfb.zzdu(), false);
        zzb.zza(parcel, 5, com_google_android_gms_internal_zzfb.zzdv(), false);
        zzb.zza(parcel, 6, com_google_android_gms_internal_zzfb.zzds(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzg(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzr(x0);
    }

    public zzfb zzg(Parcel parcel) {
        IBinder iBinder = null;
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    iBinder4 = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    iBinder3 = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    iBinder2 = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    iBinder = zza.zzp(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzfb(i, iBinder4, iBinder3, iBinder2, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzfb[] zzr(int i) {
        return new zzfb[i];
    }
}
