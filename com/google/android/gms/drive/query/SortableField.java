package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.internal.zzmi;
import com.google.android.gms.internal.zzmk;
import java.util.Date;

public class SortableField {
    public static final SortableMetadataField<Date> CREATED_DATE;
    public static final SortableMetadataField<Date> LAST_VIEWED_BY_ME;
    public static final SortableMetadataField<Date> MODIFIED_BY_ME_DATE;
    public static final SortableMetadataField<Date> MODIFIED_DATE;
    public static final SortableMetadataField<Long> QUOTA_USED;
    public static final SortableMetadataField<Date> SHARED_WITH_ME_DATE;
    public static final SortableMetadataField<String> TITLE;

    static {
        TITLE = zzmi.zzVV;
        CREATED_DATE = zzmk.zzWe;
        MODIFIED_DATE = zzmk.zzWg;
        MODIFIED_BY_ME_DATE = zzmk.zzWh;
        LAST_VIEWED_BY_ME = zzmk.zzWf;
        SHARED_WITH_ME_DATE = zzmk.zzWi;
        QUOTA_USED = zzmi.zzVS;
    }
}
