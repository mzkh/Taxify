package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SortOrder implements SafeParcelable {
    public static final Creator<SortOrder> CREATOR;
    final int zzFG;
    final List<FieldWithSortOrder> zzWu;
    final boolean zzWv;

    public static class Builder {
        private final List<FieldWithSortOrder> zzWu;
        private boolean zzWv;

        public Builder() {
            this.zzWu = new ArrayList();
            this.zzWv = false;
        }

        public Builder addSortAscending(SortableMetadataField sortField) {
            this.zzWu.add(new FieldWithSortOrder(sortField.getName(), true));
            return this;
        }

        public Builder addSortDescending(SortableMetadataField sortField) {
            this.zzWu.add(new FieldWithSortOrder(sortField.getName(), false));
            return this;
        }

        public SortOrder build() {
            return new SortOrder(this.zzWv, null);
        }
    }

    static {
        CREATOR = new zzb();
    }

    SortOrder(int versionCode, List<FieldWithSortOrder> sortingFields, boolean sortFolderFirst) {
        this.zzFG = versionCode;
        this.zzWu = sortingFields;
        this.zzWv = sortFolderFirst;
    }

    private SortOrder(List<FieldWithSortOrder> sortingFields, boolean sortFolderFirst) {
        this(1, (List) sortingFields, sortFolderFirst);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "SortOrder[%s, %s]", new Object[]{TextUtils.join(",", this.zzWu), Boolean.valueOf(this.zzWv)});
    }

    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }
}
