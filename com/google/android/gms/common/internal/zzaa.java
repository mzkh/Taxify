package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzq.zza;

public class zzaa implements SafeParcelable {
    public static final Creator<zzaa> CREATOR;
    final int zzFG;
    private boolean zzMT;
    private ConnectionResult zzNB;
    IBinder zzPn;
    private boolean zzQt;

    static {
        CREATOR = new zzab();
    }

    public zzaa(int i) {
        this(new ConnectionResult(i, null));
    }

    zzaa(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.zzFG = i;
        this.zzPn = iBinder;
        this.zzNB = connectionResult;
        this.zzMT = z;
        this.zzQt = z2;
    }

    public zzaa(ConnectionResult connectionResult) {
        this(1, null, connectionResult, false, false);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zzaa)) {
            return false;
        }
        zzaa com_google_android_gms_common_internal_zzaa = (zzaa) o;
        return this.zzNB.equals(com_google_android_gms_common_internal_zzaa.zzNB) && zzjn().equals(com_google_android_gms_common_internal_zzaa.zzjn());
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzab.zza(this, dest, flags);
    }

    public zzq zzjn() {
        return zza.zzR(this.zzPn);
    }

    public ConnectionResult zzjo() {
        return this.zzNB;
    }

    public boolean zzjp() {
        return this.zzMT;
    }

    public boolean zzjq() {
        return this.zzQt;
    }
}
