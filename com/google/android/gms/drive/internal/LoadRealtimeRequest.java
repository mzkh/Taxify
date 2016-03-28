package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class LoadRealtimeRequest implements SafeParcelable {
    public static final Creator<LoadRealtimeRequest> CREATOR;
    final int zzFG;
    final DriveId zzRX;
    final boolean zzUD;
    final List<String> zzUE;

    static {
        CREATOR = new zzal();
    }

    LoadRealtimeRequest(int versionCode, DriveId driveId, boolean useTestMode, List<String> customTypeWhitelist) {
        this.zzFG = versionCode;
        this.zzRX = driveId;
        this.zzUD = useTestMode;
        this.zzUE = customTypeWhitelist;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzal.zza(this, dest, flags);
    }
}
