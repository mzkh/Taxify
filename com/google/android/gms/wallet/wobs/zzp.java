package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class zzp implements SafeParcelable {
    public static final Creator<zzp> CREATOR;
    private final int zzFG;
    String zzaFl;
    zzl zzaFo;
    zzn zzaFp;
    zzn zzaFq;
    String zzwG;

    static {
        CREATOR = new zzq();
    }

    zzp() {
        this.zzFG = 1;
    }

    zzp(int i, String str, String str2, zzl com_google_android_gms_wallet_wobs_zzl, zzn com_google_android_gms_wallet_wobs_zzn, zzn com_google_android_gms_wallet_wobs_zzn2) {
        this.zzFG = i;
        this.zzaFl = str;
        this.zzwG = str2;
        this.zzaFo = com_google_android_gms_wallet_wobs_zzl;
        this.zzaFp = com_google_android_gms_wallet_wobs_zzn;
        this.zzaFq = com_google_android_gms_wallet_wobs_zzn2;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzFG;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzq.zza(this, dest, flags);
    }
}
