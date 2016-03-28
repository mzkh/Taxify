package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.GeofenceStatusCodes;

public class zzro implements SafeParcelable {
    public static final zzrp CREATOR;
    private final byte[] content;
    private final String type;
    final int versionCode;

    static {
        CREATOR = new zzrp();
    }

    zzro(int i, byte[] bArr, String str) {
        zzx.zzb(bArr.length <= GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(bArr.length), Integer.valueOf(GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE));
        this.versionCode = i;
        this.content = (byte[]) zzx.zzl(bArr);
        this.type = (String) zzx.zzl(str);
    }

    public int describeContents() {
        zzrp com_google_android_gms_internal_zzrp = CREATOR;
        return 0;
    }

    public String getType() {
        return this.type;
    }

    public void writeToParcel(Parcel out, int flags) {
        zzrp com_google_android_gms_internal_zzrp = CREATOR;
        zzrp.zza(this, out, flags);
    }

    public byte[] zzro() {
        return this.content;
    }
}
