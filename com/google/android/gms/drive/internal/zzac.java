package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public class zzac implements Creator<FileUploadPreferencesImpl> {
    static void zza(FileUploadPreferencesImpl fileUploadPreferencesImpl, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, fileUploadPreferencesImpl.zzFG);
        zzb.zzc(parcel, 2, fileUploadPreferencesImpl.zzUs);
        zzb.zzc(parcel, 3, fileUploadPreferencesImpl.zzUt);
        zzb.zza(parcel, 4, fileUploadPreferencesImpl.zzUu);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzav(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzbO(x0);
    }

    public FileUploadPreferencesImpl zzav(Parcel parcel) {
        boolean z = false;
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new FileUploadPreferencesImpl(i3, i2, i, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public FileUploadPreferencesImpl[] zzbO(int i) {
        return new FileUploadPreferencesImpl[i];
    }
}
