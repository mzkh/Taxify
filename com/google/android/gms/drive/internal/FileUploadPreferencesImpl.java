package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;
import com.google.android.gms.drive.events.CompletionEvent;

public final class FileUploadPreferencesImpl implements SafeParcelable, FileUploadPreferences {
    public static final Creator<FileUploadPreferencesImpl> CREATOR;
    final int zzFG;
    int zzUs;
    int zzUt;
    boolean zzUu;

    static {
        CREATOR = new zzac();
    }

    FileUploadPreferencesImpl(int versionCode, int networkTypePreference, int batteryUsagePreference, boolean allowRoaming) {
        this.zzFG = versionCode;
        this.zzUs = networkTypePreference;
        this.zzUt = batteryUsagePreference;
        this.zzUu = allowRoaming;
    }

    public static boolean zzbM(int i) {
        switch (i) {
            case CompletionEvent.STATUS_FAILURE /*1*/:
            case CompletionEvent.STATUS_CONFLICT /*2*/:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzbN(int i) {
        switch (i) {
            case FileUploadPreferences.BATTERY_USAGE_UNRESTRICTED /*256*/:
            case FileUploadPreferences.BATTERY_USAGE_CHARGING_ONLY /*257*/:
                return true;
            default:
                return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getBatteryUsagePreference() {
        return !zzbN(this.zzUt) ? 0 : this.zzUt;
    }

    public int getNetworkTypePreference() {
        return !zzbM(this.zzUs) ? 0 : this.zzUs;
    }

    public boolean isRoamingAllowed() {
        return this.zzUu;
    }

    public void setBatteryUsagePreference(int batteryUsagePreference) {
        if (zzbN(batteryUsagePreference)) {
            this.zzUt = batteryUsagePreference;
            return;
        }
        throw new IllegalArgumentException("Invalid battery usage preference value.");
    }

    public void setNetworkTypePreference(int networkTypePreference) {
        if (zzbM(networkTypePreference)) {
            this.zzUs = networkTypePreference;
            return;
        }
        throw new IllegalArgumentException("Invalid data connection preference value.");
    }

    public void setRoamingAllowed(boolean allowRoaming) {
        this.zzUu = allowRoaming;
    }

    public void writeToParcel(Parcel parcel, int flags) {
        zzac.zza(this, parcel, flags);
    }
}
