package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.ParentDriveIdSet;
import com.google.android.gms.drive.metadata.internal.zzj;
import com.google.android.gms.drive.metadata.internal.zzm;
import com.google.android.gms.drive.metadata.internal.zzn;
import com.google.android.gms.drive.metadata.internal.zzo;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class zzmi {
    public static final MetadataField<String> zzVA;
    public static final MetadataField<Boolean> zzVB;
    public static final MetadataField<Boolean> zzVC;
    public static final MetadataField<Boolean> zzVD;
    public static final MetadataField<Boolean> zzVE;
    public static final zzb zzVF;
    public static final MetadataField<Boolean> zzVG;
    public static final MetadataField<Boolean> zzVH;
    public static final MetadataField<Boolean> zzVI;
    public static final MetadataField<Boolean> zzVJ;
    public static final MetadataField<Boolean> zzVK;
    public static final MetadataField<Boolean> zzVL;
    public static final zzc zzVM;
    public static final MetadataField<String> zzVN;
    public static final com.google.android.gms.drive.metadata.zzb<String> zzVO;
    public static final zzo zzVP;
    public static final zzo zzVQ;
    public static final zzd zzVR;
    public static final zze zzVS;
    public static final zzg zzVT;
    public static final MetadataField<com.google.android.gms.common.data.zza> zzVU;
    public static final zzh zzVV;
    public static final zzi zzVW;
    public static final MetadataField<String> zzVX;
    public static final MetadataField<String> zzVY;
    public static final MetadataField<String> zzVZ;
    public static final MetadataField<DriveId> zzVs;
    public static final MetadataField<String> zzVt;
    public static final zza zzVu;
    public static final MetadataField<String> zzVv;
    public static final MetadataField<String> zzVw;
    public static final MetadataField<String> zzVx;
    public static final MetadataField<Long> zzVy;
    public static final MetadataField<Boolean> zzVz;
    public static final com.google.android.gms.drive.metadata.internal.zzb zzWa;
    public static final MetadataField<String> zzWb;
    public static final MetadataField<String> zzWc;
    public static final zzf zzWd;

    /* renamed from: com.google.android.gms.internal.zzmi.1 */
    static class C06461 extends com.google.android.gms.drive.metadata.internal.zzb {
        C06461(String str, Collection collection, Collection collection2, int i) {
            super(str, collection, collection2, i);
        }

        protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
            return zze(dataHolder, i, i2);
        }

        protected Boolean zze(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.zzb("trashed", i, i2) == 2);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzmi.2 */
    static class C06472 extends zzj<com.google.android.gms.common.data.zza> {
        C06472(String str, Collection collection, Collection collection2, int i) {
            super(str, collection, collection2, i);
        }

        protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
            return zzk(dataHolder, i, i2);
        }

        protected com.google.android.gms.common.data.zza zzk(DataHolder dataHolder, int i, int i2) {
            throw new IllegalStateException("Thumbnail field is write only");
        }
    }

    public static class zzb extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField<Boolean> {
        public zzb(String str, int i) {
            super(str, i);
        }
    }

    public static class zzc extends zzn implements SearchableMetadataField<String> {
        public zzc(String str, int i) {
            super(str, i);
        }
    }

    public static class zze extends com.google.android.gms.drive.metadata.internal.zzg implements SortableMetadataField<Long> {
        public zze(String str, int i) {
            super(str, i);
        }
    }

    public static class zzg extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField<Boolean> {
        public zzg(String str, int i) {
            super(str, i);
        }
    }

    public static class zzh extends zzn implements SearchableMetadataField<String>, SortableMetadataField<String> {
        public zzh(String str, int i) {
            super(str, i);
        }
    }

    public static class zzi extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField<Boolean> {
        public zzi(String str, int i) {
            super(str, i);
        }

        protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
            return zze(dataHolder, i, i2);
        }

        protected Boolean zze(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.zzb(getName(), i, i2) != 0);
        }
    }

    public static class zza extends zzmj implements SearchableMetadataField<AppVisibleCustomProperties> {
        public zza(int i) {
            super(i);
        }
    }

    public static class zzd extends com.google.android.gms.drive.metadata.internal.zzi<DriveId> implements SearchableCollectionMetadataField<DriveId> {
        public zzd(int i) {
            super("parents", Collections.emptySet(), Arrays.asList(new String[]{"parentsExtra", "dbInstanceId"}), i);
        }

        protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
            return zzd(dataHolder, i, i2);
        }

        protected Collection<DriveId> zzd(DataHolder dataHolder, int i, int i2) {
            Bundle zziu = dataHolder.zziu();
            List parcelableArrayList = zziu.getParcelableArrayList("parentsExtra");
            if (parcelableArrayList == null) {
                return null;
            }
            return ((ParentDriveIdSet) parcelableArrayList.get(i)).zzs(zziu.getLong("dbInstanceId"));
        }

        protected /* synthetic */ Object zzl(Bundle bundle) {
            return zzq(bundle);
        }

        protected Collection<DriveId> zzq(Bundle bundle) {
            Collection zzq = super.zzq(bundle);
            return zzq == null ? null : new HashSet(zzq);
        }
    }

    public static class zzf extends com.google.android.gms.drive.metadata.internal.zzi<DriveSpace> {
        public zzf(int i) {
            super("spaces", Arrays.asList(new String[]{"inDriveSpace", "isAppData", "inGooglePhotosSpace"}), Collections.emptySet(), i);
        }

        protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
            return zzd(dataHolder, i, i2);
        }

        protected Collection<DriveSpace> zzd(DataHolder dataHolder, int i, int i2) {
            Collection arrayList = new ArrayList();
            if (dataHolder.zzd("inDriveSpace", i, i2)) {
                arrayList.add(DriveSpace.zzSl);
            }
            if (dataHolder.zzd("isAppData", i, i2)) {
                arrayList.add(DriveSpace.zzSm);
            }
            if (dataHolder.zzd("inGooglePhotosSpace", i, i2)) {
                arrayList.add(DriveSpace.zzSn);
            }
            return arrayList;
        }
    }

    static {
        zzVs = zzml.zzWj;
        zzVt = new zzn("alternateLink", 4300000);
        zzVu = new zza(5000000);
        zzVv = new zzn(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, 4300000);
        zzVw = new zzn("embedLink", 4300000);
        zzVx = new zzn("fileExtension", 4300000);
        zzVy = new com.google.android.gms.drive.metadata.internal.zzg("fileSize", 4300000);
        zzVz = new com.google.android.gms.drive.metadata.internal.zzb("hasThumbnail", 4300000);
        zzVA = new zzn("indexableText", 4300000);
        zzVB = new com.google.android.gms.drive.metadata.internal.zzb("isAppData", 4300000);
        zzVC = new com.google.android.gms.drive.metadata.internal.zzb("isCopyable", 4300000);
        zzVD = new com.google.android.gms.drive.metadata.internal.zzb("isEditable", 4100000);
        zzVE = new C06461("isExplicitlyTrashed", Collections.singleton("trashed"), Collections.emptySet(), 7000000);
        zzVF = new zzb("isPinned", 4100000);
        zzVG = new com.google.android.gms.drive.metadata.internal.zzb("isRestricted", 4300000);
        zzVH = new com.google.android.gms.drive.metadata.internal.zzb("isShared", 4300000);
        zzVI = new com.google.android.gms.drive.metadata.internal.zzb("isGooglePhotosFolder", 7000000);
        zzVJ = new com.google.android.gms.drive.metadata.internal.zzb("isGooglePhotosRootFolder", 7000000);
        zzVK = new com.google.android.gms.drive.metadata.internal.zzb("isTrashable", 4400000);
        zzVL = new com.google.android.gms.drive.metadata.internal.zzb("isViewed", 4300000);
        zzVM = new zzc("mimeType", 4100000);
        zzVN = new zzn("originalFilename", 4300000);
        zzVO = new zzm("ownerNames", 4300000);
        zzVP = new zzo("lastModifyingUser", 6000000);
        zzVQ = new zzo("sharingUser", 6000000);
        zzVR = new zzd(4100000);
        zzVS = new zze("quotaBytesUsed", 4300000);
        zzVT = new zzg("starred", 4100000);
        zzVU = new C06472("thumbnail", Collections.emptySet(), Collections.emptySet(), 4400000);
        zzVV = new zzh(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, 4100000);
        zzVW = new zzi("trashed", 4100000);
        zzVX = new zzn("webContentLink", 4300000);
        zzVY = new zzn("webViewLink", 4300000);
        zzVZ = new zzn("uniqueIdentifier", 5000000);
        zzWa = new com.google.android.gms.drive.metadata.internal.zzb("writersCanShare", 6000000);
        zzWb = new zzn("role", 6000000);
        zzWc = new zzn("md5Checksum", 7000000);
        zzWd = new zzf(7000000);
    }
}
