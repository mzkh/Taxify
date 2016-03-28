package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;
import java.util.ArrayList;

public class ExtendedGameEntityCreator implements Creator<ExtendedGameEntity> {
    static void zza(ExtendedGameEntity extendedGameEntity, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zza(parcel, 1, extendedGameEntity.zzor(), i, false);
        zzb.zzc(parcel, GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, extendedGameEntity.getVersionCode());
        zzb.zzc(parcel, 2, extendedGameEntity.zzoi());
        zzb.zza(parcel, 3, extendedGameEntity.zzoj());
        zzb.zzc(parcel, 4, extendedGameEntity.zzok());
        zzb.zza(parcel, 5, extendedGameEntity.zzol());
        zzb.zza(parcel, 6, extendedGameEntity.zzom());
        zzb.zza(parcel, 7, extendedGameEntity.zzon(), false);
        zzb.zza(parcel, 8, extendedGameEntity.zzoo());
        zzb.zza(parcel, 9, extendedGameEntity.zzop(), false);
        zzb.zzc(parcel, 10, extendedGameEntity.zzoh(), false);
        zzb.zza(parcel, 11, extendedGameEntity.zzoq(), i, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzcZ(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzeL(x0);
    }

    public ExtendedGameEntity zzcZ(Parcel parcel) {
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        long j3 = 0;
        String str2 = null;
        ArrayList arrayList = null;
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    gameEntity = (GameEntity) zza.zza(parcel, zzI, GameEntity.CREATOR);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    j = zza.zzi(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    j2 = zza.zzi(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    j3 = zza.zzi(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    arrayList = zza.zzc(parcel, zzI, GameBadgeEntity.CREATOR);
                    break;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    snapshotMetadataEntity = (SnapshotMetadataEntity) zza.zza(parcel, zzI, SnapshotMetadataEntity.CREATOR);
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
            return new ExtendedGameEntity(i, gameEntity, i2, z, i3, j, j2, str, j3, str2, arrayList, snapshotMetadataEntity);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public ExtendedGameEntity[] zzeL(int i) {
        return new ExtendedGameEntity[i];
    }
}
