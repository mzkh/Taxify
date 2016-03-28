package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest implements SafeParcelable {
    public static final Creator<CloseContentsRequest> CREATOR;
    final int zzFG;
    final Contents zzTj;
    final Boolean zzTl;

    static {
        CREATOR = new zzg();
    }

    CloseContentsRequest(int versionCode, Contents contentsReference, Boolean saveResults) {
        this.zzFG = versionCode;
        this.zzTj = contentsReference;
        this.zzTl = saveResults;
    }

    public CloseContentsRequest(Contents contentsReference, boolean saveResults) {
        this(1, contentsReference, Boolean.valueOf(saveResults));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzg.zza(this, dest, flags);
    }
}
