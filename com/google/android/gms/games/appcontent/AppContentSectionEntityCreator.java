package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;
import java.util.ArrayList;

public class AppContentSectionEntityCreator implements Creator<AppContentSectionEntity> {
    static void zza(AppContentSectionEntity appContentSectionEntity, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, appContentSectionEntity.getActions(), false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, appContentSectionEntity.getVersionCode());
        zzb.zzc(parcel, 3, appContentSectionEntity.zznd(), false);
        zzb.zza(parcel, 4, appContentSectionEntity.zzmJ(), false);
        zzb.zza(parcel, 5, appContentSectionEntity.getExtras(), false);
        zzb.zza(parcel, 6, appContentSectionEntity.zzmV(), false);
        zzb.zza(parcel, 7, appContentSectionEntity.getTitle(), false);
        zzb.zza(parcel, 8, appContentSectionEntity.getType(), false);
        zzb.zza(parcel, 9, appContentSectionEntity.getId(), false);
        zzb.zza(parcel, 10, appContentSectionEntity.zzne(), false);
        zzb.zzc(parcel, 14, appContentSectionEntity.zzmT(), false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzcV(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzev(x0);
    }

    public AppContentSectionEntity zzcV(Parcel parcel) {
        ArrayList arrayList = null;
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Bundle bundle = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    arrayList3 = zza.zzc(parcel, zzI, AppContentActionEntity.CREATOR);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    arrayList2 = zza.zzc(parcel, zzI, AppContentCardEntity.CREATOR);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    str6 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    bundle = zza.zzq(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str5 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    str4 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BUS_STATION /*14*/:
                    arrayList = zza.zzc(parcel, zzI, AppContentAnnotationEntity.CREATOR);
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
            return new AppContentSectionEntity(i, arrayList3, arrayList2, str6, bundle, str5, str4, str3, str2, str, arrayList);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public AppContentSectionEntity[] zzev(int i) {
        return new AppContentSectionEntity[i];
    }
}
