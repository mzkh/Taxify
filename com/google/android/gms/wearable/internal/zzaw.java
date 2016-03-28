package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class zzaw implements SafeParcelable {
    public static final Creator<zzaw> CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final int zzaGD;

    static {
        CREATOR = new zzax();
    }

    zzaw(int i, int i2, int i3) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzaGD = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzax.zza(this, dest, flags);
    }
}
