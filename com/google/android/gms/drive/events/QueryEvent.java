package com.google.android.gms.drive.events;

import android.os.Parcel;

public class QueryEvent implements DriveEvent {
    public static final zze CREATOR;
    final int zzFG;

    static {
        CREATOR = new zze();
    }

    public QueryEvent() {
        this(1);
    }

    QueryEvent(int versionCode) {
        this.zzFG = versionCode;
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 3;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zze.zza(this, dest, flags);
    }
}
