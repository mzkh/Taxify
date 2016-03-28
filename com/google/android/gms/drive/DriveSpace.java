package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DriveSpace implements SafeParcelable {
    public static final Creator<DriveSpace> CREATOR;
    public static final DriveSpace zzSl;
    public static final DriveSpace zzSm;
    public static final DriveSpace zzSn;
    public static final Set<DriveSpace> zzSo;
    public static final String zzSp;
    private final String mName;
    final int zzFG;

    static {
        CREATOR = new zzg();
        zzSl = new DriveSpace("DRIVE");
        zzSm = new DriveSpace("APP_DATA_FOLDER");
        zzSn = new DriveSpace("GOOGLE_PHOTOS");
        zzSo = Collections.unmodifiableSet(new HashSet(Arrays.asList(new DriveSpace[]{zzSl, zzSm, zzSn})));
        zzSp = TextUtils.join(",", zzSo.toArray());
    }

    DriveSpace(int versionCode, String name) {
        this.zzFG = versionCode;
        this.mName = (String) zzx.zzl(name);
    }

    private DriveSpace(String name) {
        this(1, name);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        return (o == null || o.getClass() != DriveSpace.class) ? false : this.mName.equals(((DriveSpace) o).mName);
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        return 1247068382 ^ this.mName.hashCode();
    }

    public String toString() {
        return this.mName;
    }

    public void writeToParcel(Parcel out, int flags) {
        zzg.zza(this, out, flags);
    }
}
