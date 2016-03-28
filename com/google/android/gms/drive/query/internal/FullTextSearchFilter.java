package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class FullTextSearchFilter extends AbstractFilter {
    public static final zzg CREATOR;
    final String mValue;
    final int zzFG;

    static {
        CREATOR = new zzg();
    }

    FullTextSearchFilter(int versionCode, String value) {
        this.zzFG = versionCode;
        this.mValue = value;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        zzg.zza(this, out, flags);
    }

    public <F> F zza(zzf<F> com_google_android_gms_drive_query_internal_zzf_F) {
        return com_google_android_gms_drive_query_internal_zzf_F.zzbE(this.mValue);
    }
}
