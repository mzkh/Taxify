package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;

public class AppContentAnnotationEntityCreator implements Creator<AppContentAnnotationEntity> {
    static void zza(AppContentAnnotationEntity appContentAnnotationEntity, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, appContentAnnotationEntity.getDescription(), false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, appContentAnnotationEntity.getVersionCode());
        zzb.zza(parcel, 2, appContentAnnotationEntity.zzmO(), i, false);
        zzb.zza(parcel, 3, appContentAnnotationEntity.getTitle(), false);
        zzb.zza(parcel, 5, appContentAnnotationEntity.getId(), false);
        zzb.zza(parcel, 6, appContentAnnotationEntity.zzmR(), false);
        zzb.zza(parcel, 7, appContentAnnotationEntity.zzmM(), false);
        zzb.zzc(parcel, 8, appContentAnnotationEntity.zzmN());
        zzb.zzc(parcel, 9, appContentAnnotationEntity.zzmQ());
        zzb.zza(parcel, 10, appContentAnnotationEntity.zzmP(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzcS(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzes(x0);
    }

    public AppContentAnnotationEntity zzcS(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int zzJ = zza.zzJ(parcel);
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    str5 = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    uri = (Uri) zza.zza(parcel, zzI, Uri.CREATOR);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    str4 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    bundle = zza.zzq(parcel, zzI);
                    break;
                case GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE /*1000*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new AppContentAnnotationEntity(i3, str5, uri, str4, str3, str2, str, i2, i, bundle);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public AppContentAnnotationEntity[] zzes(int i) {
        return new AppContentAnnotationEntity[i];
    }
}
