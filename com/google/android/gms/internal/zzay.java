package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.List;

public class zzay implements Creator<zzax> {
    static void zza(zzax com_google_android_gms_internal_zzax, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_internal_zzax.versionCode);
        zzb.zza(parcel, 2, com_google_android_gms_internal_zzax.zzoL);
        zzb.zza(parcel, 3, com_google_android_gms_internal_zzax.extras, false);
        zzb.zzc(parcel, 4, com_google_android_gms_internal_zzax.zzoM);
        zzb.zzb(parcel, 5, com_google_android_gms_internal_zzax.zzoN, false);
        zzb.zza(parcel, 6, com_google_android_gms_internal_zzax.zzoO);
        zzb.zzc(parcel, 7, com_google_android_gms_internal_zzax.zzoP);
        zzb.zza(parcel, 8, com_google_android_gms_internal_zzax.zzoQ);
        zzb.zza(parcel, 9, com_google_android_gms_internal_zzax.zzoR, false);
        zzb.zza(parcel, 10, com_google_android_gms_internal_zzax.zzoS, i, false);
        zzb.zza(parcel, 11, com_google_android_gms_internal_zzax.zzoT, i, false);
        zzb.zza(parcel, 12, com_google_android_gms_internal_zzax.zzoU, false);
        zzb.zza(parcel, 13, com_google_android_gms_internal_zzax.zzoV, false);
        zzb.zza(parcel, 14, com_google_android_gms_internal_zzax.zzoW, false);
        zzb.zzb(parcel, 15, com_google_android_gms_internal_zzax.zzoX, false);
        zzb.zza(parcel, 16, com_google_android_gms_internal_zzax.zzoY, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzb(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzf(x0);
    }

    public zzax zzb(Parcel parcel) {
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        zzbs com_google_android_gms_internal_zzbs = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    j = zza.zzi(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    bundle = zza.zzq(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    list = zza.zzC(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    z2 = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    com_google_android_gms_internal_zzbs = (zzbs) zza.zza(parcel, zzI, zzbs.CREATOR);
                    break;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    location = (Location) zza.zza(parcel, zzI, Location.CREATOR);
                    break;
                case Place.TYPE_BOOK_STORE /*12*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case ConnectionsStatusCodes.STATUS_ERROR /*13*/:
                    bundle2 = zza.zzq(parcel, zzI);
                    break;
                case Place.TYPE_BUS_STATION /*14*/:
                    bundle3 = zza.zzq(parcel, zzI);
                    break;
                case Place.TYPE_CAFE /*15*/:
                    list2 = zza.zzC(parcel, zzI);
                    break;
                case Place.TYPE_CAMPGROUND /*16*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzax(i, j, bundle, i2, list, z, i3, z2, str, com_google_android_gms_internal_zzbs, location, str2, bundle2, bundle3, list2, str3);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzax[] zzf(int i) {
        return new zzax[i];
    }
}
