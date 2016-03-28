package com.google.android.gms.drive.query;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.zzmi;
import com.google.android.gms.internal.zzmk;
import java.util.Date;

public class SearchableField {
    public static final SearchableMetadataField<Boolean> IS_PINNED;
    public static final SearchableOrderedMetadataField<Date> LAST_VIEWED_BY_ME;
    public static final SearchableMetadataField<String> MIME_TYPE;
    public static final SearchableOrderedMetadataField<Date> MODIFIED_DATE;
    public static final SearchableCollectionMetadataField<DriveId> PARENTS;
    public static final SearchableMetadataField<Boolean> STARRED;
    public static final SearchableMetadataField<String> TITLE;
    public static final SearchableMetadataField<Boolean> TRASHED;
    public static final SearchableOrderedMetadataField<Date> zzWs;
    public static final SearchableMetadataField<AppVisibleCustomProperties> zzWt;

    static {
        TITLE = zzmi.zzVV;
        MIME_TYPE = zzmi.zzVM;
        TRASHED = zzmi.zzVW;
        PARENTS = zzmi.zzVR;
        zzWs = zzmk.zzWi;
        STARRED = zzmi.zzVT;
        MODIFIED_DATE = zzmk.zzWg;
        LAST_VIEWED_BY_ME = zzmk.zzWf;
        IS_PINNED = zzmi.zzVF;
        zzWt = zzmi.zzVu;
    }
}
