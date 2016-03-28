package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class zzj implements SafeParcelable {
    public static final Creator<zzj> CREATOR;
    private final int zzFG;
    String zzaFl;
    String zzwG;

    static {
        CREATOR = new zzk();
    }

    zzj() {
        this.zzFG = 1;
    }

    zzj(int i, String str, String str2) {
        this.zzFG = i;
        this.zzaFl = str;
        this.zzwG = str2;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzFG;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzk.zza(this, dest, flags);
    }
}
