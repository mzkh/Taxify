package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class MatchAllFilter extends AbstractFilter {
    public static final zzk CREATOR;
    final int zzFG;

    static {
        CREATOR = new zzk();
    }

    public MatchAllFilter() {
        this(1);
    }

    MatchAllFilter(int versionCode) {
        this.zzFG = versionCode;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        zzk.zza(this, out, flags);
    }

    public <F> F zza(zzf<F> com_google_android_gms_drive_query_internal_zzf_F) {
        return com_google_android_gms_drive_query_internal_zzf_F.zzlf();
    }
}
