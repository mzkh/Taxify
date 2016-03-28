package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

public class zzen implements Creator<zzeo> {
    static void zza(zzeo com_google_android_gms_internal_zzeo, Parcel parcel, int i) {
        int zzK = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, com_google_android_gms_internal_zzeo.versionCode);
        zzb.zza(parcel, 2, com_google_android_gms_internal_zzeo.zzun, i, false);
        zzb.zza(parcel, 3, com_google_android_gms_internal_zzeo.zzdi(), false);
        zzb.zza(parcel, 4, com_google_android_gms_internal_zzeo.zzdj(), false);
        zzb.zza(parcel, 5, com_google_android_gms_internal_zzeo.zzdk(), false);
        zzb.zza(parcel, 6, com_google_android_gms_internal_zzeo.zzdl(), false);
        zzb.zza(parcel, 7, com_google_android_gms_internal_zzeo.zzus, false);
        zzb.zza(parcel, 8, com_google_android_gms_internal_zzeo.zzut);
        zzb.zza(parcel, 9, com_google_android_gms_internal_zzeo.zzuu, false);
        zzb.zza(parcel, 10, com_google_android_gms_internal_zzeo.zzdn(), false);
        zzb.zzc(parcel, 11, com_google_android_gms_internal_zzeo.orientation);
        zzb.zzc(parcel, 12, com_google_android_gms_internal_zzeo.zzuw);
        zzb.zza(parcel, 13, com_google_android_gms_internal_zzeo.zztR, false);
        zzb.zza(parcel, 14, com_google_android_gms_internal_zzeo.zzlP, i, false);
        zzb.zza(parcel, 15, com_google_android_gms_internal_zzeo.zzdm(), false);
        zzb.zza(parcel, 17, com_google_android_gms_internal_zzeo.zzuz, i, false);
        zzb.zza(parcel, 16, com_google_android_gms_internal_zzeo.zzuy, false);
        zzb.zzH(parcel, zzK);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return zzf(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return zzq(x0);
    }

    public zzeo zzf(Parcel parcel) {
        int zzJ = zza.zzJ(parcel);
        int i = 0;
        zzek com_google_android_gms_internal_zzek = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        zzhy com_google_android_gms_internal_zzhy = null;
        IBinder iBinder6 = null;
        String str4 = null;
        zzx com_google_android_gms_internal_zzx = null;
        while (parcel.dataPosition() < zzJ) {
            int zzI = zza.zzI(parcel);
            switch (zza.zzaP(zzI)) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    i = zza.zzg(parcel, zzI);
                    break;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    com_google_android_gms_internal_zzek = (zzek) zza.zza(parcel, zzI, zzek.CREATOR);
                    break;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    iBinder = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_AQUARIUM /*4*/:
                    iBinder2 = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_ART_GALLERY /*5*/:
                    iBinder3 = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_ATM /*6*/:
                    iBinder4 = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_BAKERY /*7*/:
                    str = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BANK /*8*/:
                    z = zza.zzc(parcel, zzI);
                    break;
                case Place.TYPE_BAR /*9*/:
                    str2 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    iBinder5 = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    i2 = zza.zzg(parcel, zzI);
                    break;
                case Place.TYPE_BOOK_STORE /*12*/:
                    i3 = zza.zzg(parcel, zzI);
                    break;
                case ConnectionsStatusCodes.STATUS_ERROR /*13*/:
                    str3 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_BUS_STATION /*14*/:
                    com_google_android_gms_internal_zzhy = (zzhy) zza.zza(parcel, zzI, zzhy.CREATOR);
                    break;
                case Place.TYPE_CAFE /*15*/:
                    iBinder6 = zza.zzp(parcel, zzI);
                    break;
                case Place.TYPE_CAMPGROUND /*16*/:
                    str4 = zza.zzo(parcel, zzI);
                    break;
                case Place.TYPE_CAR_DEALER /*17*/:
                    com_google_android_gms_internal_zzx = (zzx) zza.zza(parcel, zzI, zzx.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzI);
                    break;
            }
        }
        if (parcel.dataPosition() == zzJ) {
            return new zzeo(i, com_google_android_gms_internal_zzek, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, com_google_android_gms_internal_zzhy, iBinder6, str4, com_google_android_gms_internal_zzx);
        }
        throw new zza.zza("Overread allowed size end=" + zzJ, parcel);
    }

    public zzeo[] zzq(int i) {
        return new zzeo[i];
    }
}
