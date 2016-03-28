package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class zzit implements SafeParcelable {
    public static final zziu CREATOR;
    public final int id;
    final int zzFG;
    final Bundle zzFX;

    static {
        CREATOR = new zziu();
    }

    zzit(int i, int i2, Bundle bundle) {
        this.zzFG = i;
        this.id = i2;
        this.zzFX = bundle;
    }

    public int describeContents() {
        zziu com_google_android_gms_internal_zziu = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zziu com_google_android_gms_internal_zziu = CREATOR;
        zziu.zza(this, dest, flags);
    }
}
