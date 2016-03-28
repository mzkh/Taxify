package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class zzrr implements SafeParcelable {
    public static final zzrs CREATOR;
    final int versionCode;
    final int zzatf;
    final int zzatg;
    final int zzath;

    public static class zza {
        private int zzatf;
        private int zzatg;
        private int zzath;

        public zza() {
            this.zzatf = 1;
            this.zzatg = 300;
            this.zzath = 0;
        }

        public zzrr zzrp() {
            return new zzrr(1, this.zzatf, this.zzatg, this.zzath);
        }
    }

    static {
        CREATOR = new zzrs();
    }

    zzrr(int i, int i2, int i3, int i4) {
        this.versionCode = i;
        this.zzatf = i2;
        this.zzatg = i3;
        this.zzath = i4;
    }

    public int describeContents() {
        zzrs com_google_android_gms_internal_zzrs = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        zzrs com_google_android_gms_internal_zzrs = CREATOR;
        zzrs.zza(this, out, flags);
    }
}
