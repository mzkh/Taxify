package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class zzas implements SafeParcelable {
    public static final Creator<zzas> CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final zzp zzaGl;

    static {
        CREATOR = new zzat();
    }

    zzas(int i, int i2, zzp com_google_android_gms_wearable_internal_zzp) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzaGl = com_google_android_gms_wearable_internal_zzp;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzat.zza(this, dest, flags);
    }
}
