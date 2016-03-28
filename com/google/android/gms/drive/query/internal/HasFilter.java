package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class HasFilter<T> extends AbstractFilter {
    public static final zzh CREATOR;
    final int zzFG;
    final MetadataBundle zzWx;
    final MetadataField<T> zzWy;

    static {
        CREATOR = new zzh();
    }

    HasFilter(int versionCode, MetadataBundle value) {
        this.zzFG = versionCode;
        this.zzWx = value;
        this.zzWy = zze.zzb(value);
    }

    public HasFilter(SearchableMetadataField<T> field, T value) {
        this(1, MetadataBundle.zza(field, value));
    }

    public int describeContents() {
        return 0;
    }

    public T getValue() {
        return this.zzWx.zza(this.zzWy);
    }

    public void writeToParcel(Parcel out, int flags) {
        zzh.zza(this, out, flags);
    }

    public <F> F zza(zzf<F> com_google_android_gms_drive_query_internal_zzf_F) {
        return com_google_android_gms_drive_query_internal_zzf_F.zzd(this.zzWy, getValue());
    }
}
