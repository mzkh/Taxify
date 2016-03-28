package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zze;

@Deprecated
public class zzu implements SafeParcelable {
    public static final Creator<zzu> CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final zze zzaGi;

    static {
        CREATOR = new zzv();
    }

    zzu(int i, int i2, zze com_google_android_gms_wearable_zze) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzaGi = com_google_android_gms_wearable_zze;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzv.zza(this, dest, flags);
    }
}
