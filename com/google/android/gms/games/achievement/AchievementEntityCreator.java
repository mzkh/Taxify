package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

public class AchievementEntityCreator implements Creator<AchievementEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    static void zza(AchievementEntity achievementEntity, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, achievementEntity.getAchievementId(), false);
        zzb.zzc(parcel, 2, achievementEntity.getType());
        zzb.zza(parcel, 3, achievementEntity.getName(), false);
        zzb.zza(parcel, 4, achievementEntity.getDescription(), false);
        zzb.zza(parcel, 5, achievementEntity.getUnlockedImageUri(), i, false);
        zzb.zza(parcel, 6, achievementEntity.getUnlockedImageUrl(), false);
        zzb.zza(parcel, 7, achievementEntity.getRevealedImageUri(), i, false);
        zzb.zza(parcel, 8, achievementEntity.getRevealedImageUrl(), false);
        zzb.zzc(parcel, 9, achievementEntity.getTotalSteps());
        zzb.zza(parcel, 10, achievementEntity.getFormattedTotalSteps(), false);
        zzb.zza(parcel, 11, achievementEntity.getPlayer(), i, false);
        zzb.zzc(parcel, 12, achievementEntity.getState());
        zzb.zzc(parcel, 13, achievementEntity.getCurrentSteps());
        zzb.zza(parcel, 14, achievementEntity.getFormattedCurrentSteps(), false);
        zzb.zza(parcel, 15, achievementEntity.getLastUpdatedTimestamp());
        zzb.zza(parcel, 16, achievementEntity.getXpValue());
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, achievementEntity.getVersionCode());
        zzb.zzH(parcel, zzK);
    }

    public AchievementEntity createFromParcel(Parcel parcel) {
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        Uri uri2 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        PlayerEntity playerEntity = null;
        int i4 = 0;
        int i5 = 0;
        String str7 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    uri = (Uri) zza.zza(parcel, zzI, Uri.CREATOR);
                    break;
                case Place.TYPE_ATM /*6*/:
                    str4 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    uri2 = (Uri) zza.zza(parcel, zzI, Uri.CREATOR);
                    break;
                case Place.TYPE_BANK /*8*/:
                    str5 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    str6 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    playerEntity = (PlayerEntity) zza.zza(parcel, zzI, PlayerEntity.CREATOR);
                    break;
                case Place.TYPE_BOOK_STORE /*12*/:
                    i4 = zza.zzg(parcel, zzI);
                    break;
                case ConnectionsStatusCodes.STATUS_ERROR /*13*/:
                    i5 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_BUS_STATION /*14*/:
                    str7 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_CAFE /*15*/:
                    j = zza.zzi(parcel, zzI);
                    break;
                case Place.TYPE_CAMPGROUND /*16*/:
                    j2 = zza.zzi(parcel, zzI);
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
            return new AchievementEntity(i, str, i2, str2, str3, uri, str4, uri2, str5, i3, str6, playerEntity, i4, i5, str7, j, j2);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public AchievementEntity[] newArray(int size) {
        return new AchievementEntity[size];
    }
}
