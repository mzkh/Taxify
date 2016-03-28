package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Operator implements SafeParcelable {
    public static final Creator<Operator> CREATOR;
    public static final Operator zzWM;
    public static final Operator zzWN;
    public static final Operator zzWO;
    public static final Operator zzWP;
    public static final Operator zzWQ;
    public static final Operator zzWR;
    public static final Operator zzWS;
    public static final Operator zzWT;
    public static final Operator zzWU;
    final String mTag;
    final int zzFG;

    static {
        CREATOR = new zzm();
        zzWM = new Operator("=");
        zzWN = new Operator("<");
        zzWO = new Operator("<=");
        zzWP = new Operator(">");
        zzWQ = new Operator(">=");
        zzWR = new Operator("and");
        zzWS = new Operator("or");
        zzWT = new Operator("not");
        zzWU = new Operator("contains");
    }

    Operator(int versionCode, String tag) {
        this.zzFG = versionCode;
        this.mTag = tag;
    }

    private Operator(String tag) {
        this(1, tag);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Operator operator = (Operator) obj;
        return this.mTag == null ? operator.mTag == null : this.mTag.equals(operator.mTag);
    }

    public String getTag() {
        return this.mTag;
    }

    public int hashCode() {
        return (this.mTag == null ? 0 : this.mTag.hashCode()) + 31;
    }

    public void writeToParcel(Parcel out, int flags) {
        zzm.zza(this, out, flags);
    }
}
