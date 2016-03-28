package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person.Organizations;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zztw extends zzle implements Person {
    public static final zztx CREATOR;
    private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
    String zzFA;
    final int zzFG;
    String zzIO;
    String zzSJ;
    final Set<Integer> zzauX;
    String zzavV;
    zza zzavW;
    String zzavX;
    String zzavY;
    int zzavZ;
    zzb zzawa;
    String zzawb;
    zzc zzawc;
    boolean zzawd;
    zzd zzawe;
    String zzawf;
    int zzawg;
    List<zzf> zzawh;
    List<zzg> zzawi;
    int zzawj;
    int zzawk;
    String zzawl;
    List<zzh> zzawm;
    boolean zzawn;
    int zzpo;
    String zzxX;

    public static class zze {
        public static int zzcF(String str) {
            if (str.equals("person")) {
                return 0;
            }
            if (str.equals("page")) {
                return 1;
            }
            throw new IllegalArgumentException("Unknown objectType string: " + str);
        }
    }

    public static final class zza extends zzle implements AgeRange {
        public static final zzty CREATOR;
        private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
        final int zzFG;
        final Set<Integer> zzauX;
        int zzawo;
        int zzawp;

        static {
            CREATOR = new zzty();
            zzauW = new HashMap();
            zzauW.put("max", com.google.android.gms.internal.zzld.zza.zzi("max", 2));
            zzauW.put("min", com.google.android.gms.internal.zzld.zza.zzi("min", 3));
        }

        public zza() {
            this.zzFG = 1;
            this.zzauX = new HashSet();
        }

        zza(Set<Integer> set, int i, int i2, int i3) {
            this.zzauX = set;
            this.zzFG = i;
            this.zzawo = i2;
            this.zzawp = i3;
        }

        public int describeContents() {
            zzty com_google_android_gms_internal_zzty = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zza com_google_android_gms_internal_zztw_zza = (zza) obj;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    if (!com_google_android_gms_internal_zztw_zza.zza(com_google_android_gms_internal_zzld_zza)) {
                        return false;
                    }
                    if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw_zza.zzb(com_google_android_gms_internal_zzld_zza))) {
                        return false;
                    }
                } else if (com_google_android_gms_internal_zztw_zza.zza(com_google_android_gms_internal_zzld_zza)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzsg();
        }

        public int getMax() {
            return this.zzawo;
        }

        public int getMin() {
            return this.zzawp;
        }

        public boolean hasMax() {
            return this.zzauX.contains(Integer.valueOf(2));
        }

        public boolean hasMin() {
            return this.zzauX.contains(Integer.valueOf(3));
        }

        public int hashCode() {
            int i = 0;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                int hashCode;
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            zzty com_google_android_gms_internal_zzty = CREATOR;
            zzty.zza(this, out, flags);
        }

        protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
        }

        protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    return Integer.valueOf(this.zzawo);
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    return Integer.valueOf(this.zzawp);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
            }
        }

        public /* synthetic */ Map zzjz() {
            return zzsb();
        }

        public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
            return zzauW;
        }

        public zza zzsg() {
            return this;
        }
    }

    public static final class zzb extends zzle implements Cover {
        public static final zztz CREATOR;
        private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
        final int zzFG;
        final Set<Integer> zzauX;
        zza zzawq;
        zzb zzawr;
        int zzaws;

        public static final class zza extends zzle implements CoverInfo {
            public static final zzua CREATOR;
            private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
            final int zzFG;
            final Set<Integer> zzauX;
            int zzawt;
            int zzawu;

            static {
                CREATOR = new zzua();
                zzauW = new HashMap();
                zzauW.put("leftImageOffset", com.google.android.gms.internal.zzld.zza.zzi("leftImageOffset", 2));
                zzauW.put("topImageOffset", com.google.android.gms.internal.zzld.zza.zzi("topImageOffset", 3));
            }

            public zza() {
                this.zzFG = 1;
                this.zzauX = new HashSet();
            }

            zza(Set<Integer> set, int i, int i2, int i3) {
                this.zzauX = set;
                this.zzFG = i;
                this.zzawt = i2;
                this.zzawu = i3;
            }

            public int describeContents() {
                zzua com_google_android_gms_internal_zzua = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof zza)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                zza com_google_android_gms_internal_zztw_zzb_zza = (zza) obj;
                for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                    if (zza(com_google_android_gms_internal_zzld_zza)) {
                        if (!com_google_android_gms_internal_zztw_zzb_zza.zza(com_google_android_gms_internal_zzld_zza)) {
                            return false;
                        }
                        if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw_zzb_zza.zzb(com_google_android_gms_internal_zzld_zza))) {
                            return false;
                        }
                    } else if (com_google_android_gms_internal_zztw_zzb_zza.zza(com_google_android_gms_internal_zzld_zza)) {
                        return false;
                    }
                }
                return true;
            }

            public /* synthetic */ Object freeze() {
                return zzsi();
            }

            public int getLeftImageOffset() {
                return this.zzawt;
            }

            public int getTopImageOffset() {
                return this.zzawu;
            }

            public boolean hasLeftImageOffset() {
                return this.zzauX.contains(Integer.valueOf(2));
            }

            public boolean hasTopImageOffset() {
                return this.zzauX.contains(Integer.valueOf(3));
            }

            public int hashCode() {
                int i = 0;
                for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                    int hashCode;
                    if (zza(com_google_android_gms_internal_zzld_zza)) {
                        hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public boolean isDataValid() {
                return true;
            }

            public void writeToParcel(Parcel out, int flags) {
                zzua com_google_android_gms_internal_zzua = CREATOR;
                zzua.zza(this, out, flags);
            }

            protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
                return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
            }

            protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
                switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
                    case CompletionEvent.STATUS_CONFLICT /*2*/:
                        return Integer.valueOf(this.zzawt);
                    case CompletionEvent.STATUS_CANCELED /*3*/:
                        return Integer.valueOf(this.zzawu);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
                }
            }

            public /* synthetic */ Map zzjz() {
                return zzsb();
            }

            public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
                return zzauW;
            }

            public zza zzsi() {
                return this;
            }
        }

        public static final class zzb extends zzle implements CoverPhoto {
            public static final zzub CREATOR;
            private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
            final int zzFG;
            final Set<Integer> zzauX;
            int zzli;
            int zzlj;
            String zzxX;

            static {
                CREATOR = new zzub();
                zzauW = new HashMap();
                zzauW.put("height", com.google.android.gms.internal.zzld.zza.zzi("height", 2));
                zzauW.put(PlusShare.KEY_CALL_TO_ACTION_URL, com.google.android.gms.internal.zzld.zza.zzl(PlusShare.KEY_CALL_TO_ACTION_URL, 3));
                zzauW.put("width", com.google.android.gms.internal.zzld.zza.zzi("width", 4));
            }

            public zzb() {
                this.zzFG = 1;
                this.zzauX = new HashSet();
            }

            zzb(Set<Integer> set, int i, int i2, String str, int i3) {
                this.zzauX = set;
                this.zzFG = i;
                this.zzlj = i2;
                this.zzxX = str;
                this.zzli = i3;
            }

            public int describeContents() {
                zzub com_google_android_gms_internal_zzub = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof zzb)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                zzb com_google_android_gms_internal_zztw_zzb_zzb = (zzb) obj;
                for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                    if (zza(com_google_android_gms_internal_zzld_zza)) {
                        if (!com_google_android_gms_internal_zztw_zzb_zzb.zza(com_google_android_gms_internal_zzld_zza)) {
                            return false;
                        }
                        if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw_zzb_zzb.zzb(com_google_android_gms_internal_zzld_zza))) {
                            return false;
                        }
                    } else if (com_google_android_gms_internal_zztw_zzb_zzb.zza(com_google_android_gms_internal_zzld_zza)) {
                        return false;
                    }
                }
                return true;
            }

            public /* synthetic */ Object freeze() {
                return zzsj();
            }

            public int getHeight() {
                return this.zzlj;
            }

            public String getUrl() {
                return this.zzxX;
            }

            public int getWidth() {
                return this.zzli;
            }

            public boolean hasHeight() {
                return this.zzauX.contains(Integer.valueOf(2));
            }

            public boolean hasUrl() {
                return this.zzauX.contains(Integer.valueOf(3));
            }

            public boolean hasWidth() {
                return this.zzauX.contains(Integer.valueOf(4));
            }

            public int hashCode() {
                int i = 0;
                for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                    int hashCode;
                    if (zza(com_google_android_gms_internal_zzld_zza)) {
                        hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public boolean isDataValid() {
                return true;
            }

            public void writeToParcel(Parcel out, int flags) {
                zzub com_google_android_gms_internal_zzub = CREATOR;
                zzub.zza(this, out, flags);
            }

            protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
                return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
            }

            protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
                switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
                    case CompletionEvent.STATUS_CONFLICT /*2*/:
                        return Integer.valueOf(this.zzlj);
                    case CompletionEvent.STATUS_CANCELED /*3*/:
                        return this.zzxX;
                    case Place.TYPE_AQUARIUM /*4*/:
                        return Integer.valueOf(this.zzli);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
                }
            }

            public /* synthetic */ Map zzjz() {
                return zzsb();
            }

            public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
                return zzauW;
            }

            public zzb zzsj() {
                return this;
            }
        }

        static {
            CREATOR = new zztz();
            zzauW = new HashMap();
            zzauW.put("coverInfo", com.google.android.gms.internal.zzld.zza.zza("coverInfo", 2, zza.class));
            zzauW.put("coverPhoto", com.google.android.gms.internal.zzld.zza.zza("coverPhoto", 3, zzb.class));
            zzauW.put("layout", com.google.android.gms.internal.zzld.zza.zza("layout", 4, new zzla().zzh("banner", 0), false));
        }

        public zzb() {
            this.zzFG = 1;
            this.zzauX = new HashSet();
        }

        zzb(Set<Integer> set, int i, zza com_google_android_gms_internal_zztw_zzb_zza, zzb com_google_android_gms_internal_zztw_zzb_zzb, int i2) {
            this.zzauX = set;
            this.zzFG = i;
            this.zzawq = com_google_android_gms_internal_zztw_zzb_zza;
            this.zzawr = com_google_android_gms_internal_zztw_zzb_zzb;
            this.zzaws = i2;
        }

        public int describeContents() {
            zztz com_google_android_gms_internal_zztz = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zzb)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzb com_google_android_gms_internal_zztw_zzb = (zzb) obj;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    if (!com_google_android_gms_internal_zztw_zzb.zza(com_google_android_gms_internal_zzld_zza)) {
                        return false;
                    }
                    if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw_zzb.zzb(com_google_android_gms_internal_zzld_zza))) {
                        return false;
                    }
                } else if (com_google_android_gms_internal_zztw_zzb.zza(com_google_android_gms_internal_zzld_zza)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzsh();
        }

        public CoverInfo getCoverInfo() {
            return this.zzawq;
        }

        public CoverPhoto getCoverPhoto() {
            return this.zzawr;
        }

        public int getLayout() {
            return this.zzaws;
        }

        public boolean hasCoverInfo() {
            return this.zzauX.contains(Integer.valueOf(2));
        }

        public boolean hasCoverPhoto() {
            return this.zzauX.contains(Integer.valueOf(3));
        }

        public boolean hasLayout() {
            return this.zzauX.contains(Integer.valueOf(4));
        }

        public int hashCode() {
            int i = 0;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                int hashCode;
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            zztz com_google_android_gms_internal_zztz = CREATOR;
            zztz.zza(this, out, flags);
        }

        protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
        }

        protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    return this.zzawq;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    return this.zzawr;
                case Place.TYPE_AQUARIUM /*4*/:
                    return Integer.valueOf(this.zzaws);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
            }
        }

        public /* synthetic */ Map zzjz() {
            return zzsb();
        }

        public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
            return zzauW;
        }

        public zzb zzsh() {
            return this;
        }
    }

    public static final class zzc extends zzle implements Image {
        public static final zzuc CREATOR;
        private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
        final int zzFG;
        final Set<Integer> zzauX;
        String zzxX;

        static {
            CREATOR = new zzuc();
            zzauW = new HashMap();
            zzauW.put(PlusShare.KEY_CALL_TO_ACTION_URL, com.google.android.gms.internal.zzld.zza.zzl(PlusShare.KEY_CALL_TO_ACTION_URL, 2));
        }

        public zzc() {
            this.zzFG = 1;
            this.zzauX = new HashSet();
        }

        public zzc(String str) {
            this.zzauX = new HashSet();
            this.zzFG = 1;
            this.zzxX = str;
            this.zzauX.add(Integer.valueOf(2));
        }

        zzc(Set<Integer> set, int i, String str) {
            this.zzauX = set;
            this.zzFG = i;
            this.zzxX = str;
        }

        public int describeContents() {
            zzuc com_google_android_gms_internal_zzuc = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zzc)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzc com_google_android_gms_internal_zztw_zzc = (zzc) obj;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    if (!com_google_android_gms_internal_zztw_zzc.zza(com_google_android_gms_internal_zzld_zza)) {
                        return false;
                    }
                    if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw_zzc.zzb(com_google_android_gms_internal_zzld_zza))) {
                        return false;
                    }
                } else if (com_google_android_gms_internal_zztw_zzc.zza(com_google_android_gms_internal_zzld_zza)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzsk();
        }

        public String getUrl() {
            return this.zzxX;
        }

        public boolean hasUrl() {
            return this.zzauX.contains(Integer.valueOf(2));
        }

        public int hashCode() {
            int i = 0;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                int hashCode;
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            zzuc com_google_android_gms_internal_zzuc = CREATOR;
            zzuc.zza(this, out, flags);
        }

        protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
        }

        protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    return this.zzxX;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
            }
        }

        public /* synthetic */ Map zzjz() {
            return zzsb();
        }

        public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
            return zzauW;
        }

        public zzc zzsk() {
            return this;
        }
    }

    public static final class zzd extends zzle implements Name {
        public static final zzud CREATOR;
        private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
        final int zzFG;
        final Set<Integer> zzauX;
        String zzavv;
        String zzavy;
        String zzawv;
        String zzaww;
        String zzawx;
        String zzawy;

        static {
            CREATOR = new zzud();
            zzauW = new HashMap();
            zzauW.put("familyName", com.google.android.gms.internal.zzld.zza.zzl("familyName", 2));
            zzauW.put("formatted", com.google.android.gms.internal.zzld.zza.zzl("formatted", 3));
            zzauW.put("givenName", com.google.android.gms.internal.zzld.zza.zzl("givenName", 4));
            zzauW.put("honorificPrefix", com.google.android.gms.internal.zzld.zza.zzl("honorificPrefix", 5));
            zzauW.put("honorificSuffix", com.google.android.gms.internal.zzld.zza.zzl("honorificSuffix", 6));
            zzauW.put("middleName", com.google.android.gms.internal.zzld.zza.zzl("middleName", 7));
        }

        public zzd() {
            this.zzFG = 1;
            this.zzauX = new HashSet();
        }

        zzd(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.zzauX = set;
            this.zzFG = i;
            this.zzavv = str;
            this.zzawv = str2;
            this.zzavy = str3;
            this.zzaww = str4;
            this.zzawx = str5;
            this.zzawy = str6;
        }

        public int describeContents() {
            zzud com_google_android_gms_internal_zzud = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zzd)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzd com_google_android_gms_internal_zztw_zzd = (zzd) obj;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    if (!com_google_android_gms_internal_zztw_zzd.zza(com_google_android_gms_internal_zzld_zza)) {
                        return false;
                    }
                    if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw_zzd.zzb(com_google_android_gms_internal_zzld_zza))) {
                        return false;
                    }
                } else if (com_google_android_gms_internal_zztw_zzd.zza(com_google_android_gms_internal_zzld_zza)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzsl();
        }

        public String getFamilyName() {
            return this.zzavv;
        }

        public String getFormatted() {
            return this.zzawv;
        }

        public String getGivenName() {
            return this.zzavy;
        }

        public String getHonorificPrefix() {
            return this.zzaww;
        }

        public String getHonorificSuffix() {
            return this.zzawx;
        }

        public String getMiddleName() {
            return this.zzawy;
        }

        public boolean hasFamilyName() {
            return this.zzauX.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted() {
            return this.zzauX.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName() {
            return this.zzauX.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix() {
            return this.zzauX.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix() {
            return this.zzauX.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName() {
            return this.zzauX.contains(Integer.valueOf(7));
        }

        public int hashCode() {
            int i = 0;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                int hashCode;
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            zzud com_google_android_gms_internal_zzud = CREATOR;
            zzud.zza(this, out, flags);
        }

        protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
        }

        protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    return this.zzavv;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    return this.zzawv;
                case Place.TYPE_AQUARIUM /*4*/:
                    return this.zzavy;
                case Place.TYPE_ART_GALLERY /*5*/:
                    return this.zzaww;
                case Place.TYPE_ATM /*6*/:
                    return this.zzawx;
                case Place.TYPE_BAKERY /*7*/:
                    return this.zzawy;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
            }
        }

        public /* synthetic */ Map zzjz() {
            return zzsb();
        }

        public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
            return zzauW;
        }

        public zzd zzsl() {
            return this;
        }
    }

    public static final class zzf extends zzle implements Organizations {
        public static final zzue CREATOR;
        private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
        String mName;
        final int zzFG;
        int zzJp;
        String zzSy;
        String zzZO;
        final Set<Integer> zzauX;
        String zzavK;
        String zzavu;
        String zzawA;
        boolean zzawB;
        String zzawz;

        static {
            CREATOR = new zzue();
            zzauW = new HashMap();
            zzauW.put("department", com.google.android.gms.internal.zzld.zza.zzl("department", 2));
            zzauW.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, com.google.android.gms.internal.zzld.zza.zzl(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, 3));
            zzauW.put("endDate", com.google.android.gms.internal.zzld.zza.zzl("endDate", 4));
            zzauW.put("location", com.google.android.gms.internal.zzld.zza.zzl("location", 5));
            zzauW.put("name", com.google.android.gms.internal.zzld.zza.zzl("name", 6));
            zzauW.put("primary", com.google.android.gms.internal.zzld.zza.zzk("primary", 7));
            zzauW.put("startDate", com.google.android.gms.internal.zzld.zza.zzl("startDate", 8));
            zzauW.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, com.google.android.gms.internal.zzld.zza.zzl(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, 9));
            zzauW.put("type", com.google.android.gms.internal.zzld.zza.zza("type", 10, new zzla().zzh("work", 0).zzh("school", 1), false));
        }

        public zzf() {
            this.zzFG = 1;
            this.zzauX = new HashSet();
        }

        zzf(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.zzauX = set;
            this.zzFG = i;
            this.zzawz = str;
            this.zzZO = str2;
            this.zzavu = str3;
            this.zzawA = str4;
            this.mName = str5;
            this.zzawB = z;
            this.zzavK = str6;
            this.zzSy = str7;
            this.zzJp = i2;
        }

        public int describeContents() {
            zzue com_google_android_gms_internal_zzue = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zzf)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzf com_google_android_gms_internal_zztw_zzf = (zzf) obj;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    if (!com_google_android_gms_internal_zztw_zzf.zza(com_google_android_gms_internal_zzld_zza)) {
                        return false;
                    }
                    if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw_zzf.zzb(com_google_android_gms_internal_zzld_zza))) {
                        return false;
                    }
                } else if (com_google_android_gms_internal_zztw_zzf.zza(com_google_android_gms_internal_zzld_zza)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzsm();
        }

        public String getDepartment() {
            return this.zzawz;
        }

        public String getDescription() {
            return this.zzZO;
        }

        public String getEndDate() {
            return this.zzavu;
        }

        public String getLocation() {
            return this.zzawA;
        }

        public String getName() {
            return this.mName;
        }

        public String getStartDate() {
            return this.zzavK;
        }

        public String getTitle() {
            return this.zzSy;
        }

        public int getType() {
            return this.zzJp;
        }

        public boolean hasDepartment() {
            return this.zzauX.contains(Integer.valueOf(2));
        }

        public boolean hasDescription() {
            return this.zzauX.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate() {
            return this.zzauX.contains(Integer.valueOf(4));
        }

        public boolean hasLocation() {
            return this.zzauX.contains(Integer.valueOf(5));
        }

        public boolean hasName() {
            return this.zzauX.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary() {
            return this.zzauX.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate() {
            return this.zzauX.contains(Integer.valueOf(8));
        }

        public boolean hasTitle() {
            return this.zzauX.contains(Integer.valueOf(9));
        }

        public boolean hasType() {
            return this.zzauX.contains(Integer.valueOf(10));
        }

        public int hashCode() {
            int i = 0;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                int hashCode;
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.zzawB;
        }

        public void writeToParcel(Parcel out, int flags) {
            zzue com_google_android_gms_internal_zzue = CREATOR;
            zzue.zza(this, out, flags);
        }

        protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
        }

        protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    return this.zzawz;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    return this.zzZO;
                case Place.TYPE_AQUARIUM /*4*/:
                    return this.zzavu;
                case Place.TYPE_ART_GALLERY /*5*/:
                    return this.zzawA;
                case Place.TYPE_ATM /*6*/:
                    return this.mName;
                case Place.TYPE_BAKERY /*7*/:
                    return Boolean.valueOf(this.zzawB);
                case Place.TYPE_BANK /*8*/:
                    return this.zzavK;
                case Place.TYPE_BAR /*9*/:
                    return this.zzSy;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    return Integer.valueOf(this.zzJp);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
            }
        }

        public /* synthetic */ Map zzjz() {
            return zzsb();
        }

        public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
            return zzauW;
        }

        public zzf zzsm() {
            return this;
        }
    }

    public static final class zzg extends zzle implements PlacesLived {
        public static final zzuf CREATOR;
        private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
        String mValue;
        final int zzFG;
        final Set<Integer> zzauX;
        boolean zzawB;

        static {
            CREATOR = new zzuf();
            zzauW = new HashMap();
            zzauW.put("primary", com.google.android.gms.internal.zzld.zza.zzk("primary", 2));
            zzauW.put("value", com.google.android.gms.internal.zzld.zza.zzl("value", 3));
        }

        public zzg() {
            this.zzFG = 1;
            this.zzauX = new HashSet();
        }

        zzg(Set<Integer> set, int i, boolean z, String str) {
            this.zzauX = set;
            this.zzFG = i;
            this.zzawB = z;
            this.mValue = str;
        }

        public int describeContents() {
            zzuf com_google_android_gms_internal_zzuf = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zzg)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzg com_google_android_gms_internal_zztw_zzg = (zzg) obj;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    if (!com_google_android_gms_internal_zztw_zzg.zza(com_google_android_gms_internal_zzld_zza)) {
                        return false;
                    }
                    if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw_zzg.zzb(com_google_android_gms_internal_zzld_zza))) {
                        return false;
                    }
                } else if (com_google_android_gms_internal_zztw_zzg.zza(com_google_android_gms_internal_zzld_zza)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzsn();
        }

        public String getValue() {
            return this.mValue;
        }

        public boolean hasPrimary() {
            return this.zzauX.contains(Integer.valueOf(2));
        }

        public boolean hasValue() {
            return this.zzauX.contains(Integer.valueOf(3));
        }

        public int hashCode() {
            int i = 0;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                int hashCode;
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.zzawB;
        }

        public void writeToParcel(Parcel out, int flags) {
            zzuf com_google_android_gms_internal_zzuf = CREATOR;
            zzuf.zza(this, out, flags);
        }

        protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
        }

        protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    return Boolean.valueOf(this.zzawB);
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    return this.mValue;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
            }
        }

        public /* synthetic */ Map zzjz() {
            return zzsb();
        }

        public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
            return zzauW;
        }

        public zzg zzsn() {
            return this;
        }
    }

    public static final class zzh extends zzle implements Urls {
        public static final zzug CREATOR;
        private static final HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzauW;
        String mValue;
        final int zzFG;
        int zzJp;
        final Set<Integer> zzauX;
        String zzawC;
        private final int zzawD;

        static {
            CREATOR = new zzug();
            zzauW = new HashMap();
            zzauW.put(PlusShare.KEY_CALL_TO_ACTION_LABEL, com.google.android.gms.internal.zzld.zza.zzl(PlusShare.KEY_CALL_TO_ACTION_LABEL, 5));
            zzauW.put("type", com.google.android.gms.internal.zzld.zza.zza("type", 6, new zzla().zzh("home", 0).zzh("work", 1).zzh("blog", 2).zzh(Scopes.PROFILE, 3).zzh(FitnessActivities.OTHER, 4).zzh("otherProfile", 5).zzh("contributor", 6).zzh("website", 7), false));
            zzauW.put("value", com.google.android.gms.internal.zzld.zza.zzl("value", 4));
        }

        public zzh() {
            this.zzawD = 4;
            this.zzFG = 1;
            this.zzauX = new HashSet();
        }

        zzh(Set<Integer> set, int i, String str, int i2, String str2, int i3) {
            this.zzawD = 4;
            this.zzauX = set;
            this.zzFG = i;
            this.zzawC = str;
            this.zzJp = i2;
            this.mValue = str2;
        }

        public int describeContents() {
            zzug com_google_android_gms_internal_zzug = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zzh)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzh com_google_android_gms_internal_zztw_zzh = (zzh) obj;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    if (!com_google_android_gms_internal_zztw_zzh.zza(com_google_android_gms_internal_zzld_zza)) {
                        return false;
                    }
                    if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw_zzh.zzb(com_google_android_gms_internal_zzld_zza))) {
                        return false;
                    }
                } else if (com_google_android_gms_internal_zztw_zzh.zza(com_google_android_gms_internal_zzld_zza)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Object freeze() {
            return zzsp();
        }

        public String getLabel() {
            return this.zzawC;
        }

        public int getType() {
            return this.zzJp;
        }

        public String getValue() {
            return this.mValue;
        }

        public boolean hasLabel() {
            return this.zzauX.contains(Integer.valueOf(5));
        }

        public boolean hasType() {
            return this.zzauX.contains(Integer.valueOf(6));
        }

        public boolean hasValue() {
            return this.zzauX.contains(Integer.valueOf(4));
        }

        public int hashCode() {
            int i = 0;
            for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
                int hashCode;
                if (zza(com_google_android_gms_internal_zzld_zza)) {
                    hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            zzug com_google_android_gms_internal_zzug = CREATOR;
            zzug.zza(this, out, flags);
        }

        protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
        }

        protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
            switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
                case Place.TYPE_AQUARIUM /*4*/:
                    return this.mValue;
                case Place.TYPE_ART_GALLERY /*5*/:
                    return this.zzawC;
                case Place.TYPE_ATM /*6*/:
                    return Integer.valueOf(this.zzJp);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
            }
        }

        public /* synthetic */ Map zzjz() {
            return zzsb();
        }

        public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
            return zzauW;
        }

        @Deprecated
        public int zzso() {
            return 4;
        }

        public zzh zzsp() {
            return this;
        }
    }

    static {
        CREATOR = new zztx();
        zzauW = new HashMap();
        zzauW.put("aboutMe", com.google.android.gms.internal.zzld.zza.zzl("aboutMe", 2));
        zzauW.put("ageRange", com.google.android.gms.internal.zzld.zza.zza("ageRange", 3, zza.class));
        zzauW.put("birthday", com.google.android.gms.internal.zzld.zza.zzl("birthday", 4));
        zzauW.put("braggingRights", com.google.android.gms.internal.zzld.zza.zzl("braggingRights", 5));
        zzauW.put("circledByCount", com.google.android.gms.internal.zzld.zza.zzi("circledByCount", 6));
        zzauW.put("cover", com.google.android.gms.internal.zzld.zza.zza("cover", 7, zzb.class));
        zzauW.put("currentLocation", com.google.android.gms.internal.zzld.zza.zzl("currentLocation", 8));
        zzauW.put("displayName", com.google.android.gms.internal.zzld.zza.zzl("displayName", 9));
        zzauW.put("gender", com.google.android.gms.internal.zzld.zza.zza("gender", 12, new zzla().zzh("male", 0).zzh("female", 1).zzh(FitnessActivities.OTHER, 2), false));
        zzauW.put("id", com.google.android.gms.internal.zzld.zza.zzl("id", 14));
        zzauW.put("image", com.google.android.gms.internal.zzld.zza.zza("image", 15, zzc.class));
        zzauW.put("isPlusUser", com.google.android.gms.internal.zzld.zza.zzk("isPlusUser", 16));
        zzauW.put("language", com.google.android.gms.internal.zzld.zza.zzl("language", 18));
        zzauW.put("name", com.google.android.gms.internal.zzld.zza.zza("name", 19, zzd.class));
        zzauW.put("nickname", com.google.android.gms.internal.zzld.zza.zzl("nickname", 20));
        zzauW.put("objectType", com.google.android.gms.internal.zzld.zza.zza("objectType", 21, new zzla().zzh("person", 0).zzh("page", 1), false));
        zzauW.put("organizations", com.google.android.gms.internal.zzld.zza.zzb("organizations", 22, zzf.class));
        zzauW.put("placesLived", com.google.android.gms.internal.zzld.zza.zzb("placesLived", 23, zzg.class));
        zzauW.put("plusOneCount", com.google.android.gms.internal.zzld.zza.zzi("plusOneCount", 24));
        zzauW.put("relationshipStatus", com.google.android.gms.internal.zzld.zza.zza("relationshipStatus", 25, new zzla().zzh("single", 0).zzh("in_a_relationship", 1).zzh("engaged", 2).zzh("married", 3).zzh("its_complicated", 4).zzh("open_relationship", 5).zzh("widowed", 6).zzh("in_domestic_partnership", 7).zzh("in_civil_union", 8), false));
        zzauW.put("tagline", com.google.android.gms.internal.zzld.zza.zzl("tagline", 26));
        zzauW.put(PlusShare.KEY_CALL_TO_ACTION_URL, com.google.android.gms.internal.zzld.zza.zzl(PlusShare.KEY_CALL_TO_ACTION_URL, 27));
        zzauW.put("urls", com.google.android.gms.internal.zzld.zza.zzb("urls", 28, zzh.class));
        zzauW.put("verified", com.google.android.gms.internal.zzld.zza.zzk("verified", 29));
    }

    public zztw() {
        this.zzFG = 1;
        this.zzauX = new HashSet();
    }

    public zztw(String str, String str2, zzc com_google_android_gms_internal_zztw_zzc, int i, String str3) {
        this.zzFG = 1;
        this.zzauX = new HashSet();
        this.zzSJ = str;
        this.zzauX.add(Integer.valueOf(9));
        this.zzFA = str2;
        this.zzauX.add(Integer.valueOf(14));
        this.zzawc = com_google_android_gms_internal_zztw_zzc;
        this.zzauX.add(Integer.valueOf(15));
        this.zzawg = i;
        this.zzauX.add(Integer.valueOf(21));
        this.zzxX = str3;
        this.zzauX.add(Integer.valueOf(27));
    }

    zztw(Set<Integer> set, int i, String str, zza com_google_android_gms_internal_zztw_zza, String str2, String str3, int i2, zzb com_google_android_gms_internal_zztw_zzb, String str4, String str5, int i3, String str6, zzc com_google_android_gms_internal_zztw_zzc, boolean z, String str7, zzd com_google_android_gms_internal_zztw_zzd, String str8, int i4, List<zzf> list, List<zzg> list2, int i5, int i6, String str9, String str10, List<zzh> list3, boolean z2) {
        this.zzauX = set;
        this.zzFG = i;
        this.zzavV = str;
        this.zzavW = com_google_android_gms_internal_zztw_zza;
        this.zzavX = str2;
        this.zzavY = str3;
        this.zzavZ = i2;
        this.zzawa = com_google_android_gms_internal_zztw_zzb;
        this.zzawb = str4;
        this.zzSJ = str5;
        this.zzpo = i3;
        this.zzFA = str6;
        this.zzawc = com_google_android_gms_internal_zztw_zzc;
        this.zzawd = z;
        this.zzIO = str7;
        this.zzawe = com_google_android_gms_internal_zztw_zzd;
        this.zzawf = str8;
        this.zzawg = i4;
        this.zzawh = list;
        this.zzawi = list2;
        this.zzawj = i5;
        this.zzawk = i6;
        this.zzawl = str9;
        this.zzxX = str10;
        this.zzawm = list3;
        this.zzawn = z2;
    }

    public static zztw zzj(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        zztw zzeB = CREATOR.zzeB(obtain);
        obtain.recycle();
        return zzeB;
    }

    public int describeContents() {
        zztx com_google_android_gms_internal_zztx = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zztw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zztw com_google_android_gms_internal_zztw = (zztw) obj;
        for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
            if (zza(com_google_android_gms_internal_zzld_zza)) {
                if (!com_google_android_gms_internal_zztw.zza(com_google_android_gms_internal_zzld_zza)) {
                    return false;
                }
                if (!zzb(com_google_android_gms_internal_zzld_zza).equals(com_google_android_gms_internal_zztw.zzb(com_google_android_gms_internal_zzld_zza))) {
                    return false;
                }
            } else if (com_google_android_gms_internal_zztw.zza(com_google_android_gms_internal_zzld_zza)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ Object freeze() {
        return zzsf();
    }

    public String getAboutMe() {
        return this.zzavV;
    }

    public AgeRange getAgeRange() {
        return this.zzavW;
    }

    public String getBirthday() {
        return this.zzavX;
    }

    public String getBraggingRights() {
        return this.zzavY;
    }

    public int getCircledByCount() {
        return this.zzavZ;
    }

    public Cover getCover() {
        return this.zzawa;
    }

    public String getCurrentLocation() {
        return this.zzawb;
    }

    public String getDisplayName() {
        return this.zzSJ;
    }

    public int getGender() {
        return this.zzpo;
    }

    public String getId() {
        return this.zzFA;
    }

    public Image getImage() {
        return this.zzawc;
    }

    public String getLanguage() {
        return this.zzIO;
    }

    public Name getName() {
        return this.zzawe;
    }

    public String getNickname() {
        return this.zzawf;
    }

    public int getObjectType() {
        return this.zzawg;
    }

    public List<Organizations> getOrganizations() {
        return (ArrayList) this.zzawh;
    }

    public List<PlacesLived> getPlacesLived() {
        return (ArrayList) this.zzawi;
    }

    public int getPlusOneCount() {
        return this.zzawj;
    }

    public int getRelationshipStatus() {
        return this.zzawk;
    }

    public String getTagline() {
        return this.zzawl;
    }

    public String getUrl() {
        return this.zzxX;
    }

    public List<Urls> getUrls() {
        return (ArrayList) this.zzawm;
    }

    public boolean hasAboutMe() {
        return this.zzauX.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange() {
        return this.zzauX.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday() {
        return this.zzauX.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights() {
        return this.zzauX.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount() {
        return this.zzauX.contains(Integer.valueOf(6));
    }

    public boolean hasCover() {
        return this.zzauX.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation() {
        return this.zzauX.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName() {
        return this.zzauX.contains(Integer.valueOf(9));
    }

    public boolean hasGender() {
        return this.zzauX.contains(Integer.valueOf(12));
    }

    public boolean hasId() {
        return this.zzauX.contains(Integer.valueOf(14));
    }

    public boolean hasImage() {
        return this.zzauX.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser() {
        return this.zzauX.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage() {
        return this.zzauX.contains(Integer.valueOf(18));
    }

    public boolean hasName() {
        return this.zzauX.contains(Integer.valueOf(19));
    }

    public boolean hasNickname() {
        return this.zzauX.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType() {
        return this.zzauX.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations() {
        return this.zzauX.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived() {
        return this.zzauX.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount() {
        return this.zzauX.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus() {
        return this.zzauX.contains(Integer.valueOf(25));
    }

    public boolean hasTagline() {
        return this.zzauX.contains(Integer.valueOf(26));
    }

    public boolean hasUrl() {
        return this.zzauX.contains(Integer.valueOf(27));
    }

    public boolean hasUrls() {
        return this.zzauX.contains(Integer.valueOf(28));
    }

    public boolean hasVerified() {
        return this.zzauX.contains(Integer.valueOf(29));
    }

    public int hashCode() {
        int i = 0;
        for (com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza : zzauW.values()) {
            int hashCode;
            if (zza(com_google_android_gms_internal_zzld_zza)) {
                hashCode = zzb(com_google_android_gms_internal_zzld_zza).hashCode() + (i + com_google_android_gms_internal_zzld_zza.zzjG());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isPlusUser() {
        return this.zzawd;
    }

    public boolean isVerified() {
        return this.zzawn;
    }

    public void writeToParcel(Parcel out, int flags) {
        zztx com_google_android_gms_internal_zztx = CREATOR;
        zztx.zza(this, out, flags);
    }

    protected boolean zza(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
        return this.zzauX.contains(Integer.valueOf(com_google_android_gms_internal_zzld_zza.zzjG()));
    }

    protected Object zzb(com.google.android.gms.internal.zzld.zza com_google_android_gms_internal_zzld_zza) {
        switch (com_google_android_gms_internal_zzld_zza.zzjG()) {
            case CompletionEvent.STATUS_CONFLICT /*2*/:
                return this.zzavV;
            case CompletionEvent.STATUS_CANCELED /*3*/:
                return this.zzavW;
            case Place.TYPE_AQUARIUM /*4*/:
                return this.zzavX;
            case Place.TYPE_ART_GALLERY /*5*/:
                return this.zzavY;
            case Place.TYPE_ATM /*6*/:
                return Integer.valueOf(this.zzavZ);
            case Place.TYPE_BAKERY /*7*/:
                return this.zzawa;
            case Place.TYPE_BANK /*8*/:
                return this.zzawb;
            case Place.TYPE_BAR /*9*/:
                return this.zzSJ;
            case Place.TYPE_BOOK_STORE /*12*/:
                return Integer.valueOf(this.zzpo);
            case Place.TYPE_BUS_STATION /*14*/:
                return this.zzFA;
            case Place.TYPE_CAFE /*15*/:
                return this.zzawc;
            case Place.TYPE_CAMPGROUND /*16*/:
                return Boolean.valueOf(this.zzawd);
            case Place.TYPE_CAR_RENTAL /*18*/:
                return this.zzIO;
            case Place.TYPE_CAR_REPAIR /*19*/:
                return this.zzawe;
            case Place.TYPE_CAR_WASH /*20*/:
                return this.zzawf;
            case Place.TYPE_CASINO /*21*/:
                return Integer.valueOf(this.zzawg);
            case Place.TYPE_CEMETERY /*22*/:
                return this.zzawh;
            case Place.TYPE_CHURCH /*23*/:
                return this.zzawi;
            case Place.TYPE_CITY_HALL /*24*/:
                return Integer.valueOf(this.zzawj);
            case Place.TYPE_CLOTHING_STORE /*25*/:
                return Integer.valueOf(this.zzawk);
            case Place.TYPE_CONVENIENCE_STORE /*26*/:
                return this.zzawl;
            case Place.TYPE_COURTHOUSE /*27*/:
                return this.zzxX;
            case Place.TYPE_DENTIST /*28*/:
                return this.zzawm;
            case Place.TYPE_DEPARTMENT_STORE /*29*/:
                return Boolean.valueOf(this.zzawn);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + com_google_android_gms_internal_zzld_zza.zzjG());
        }
    }

    public /* synthetic */ Map zzjz() {
        return zzsb();
    }

    public HashMap<String, com.google.android.gms.internal.zzld.zza<?, ?>> zzsb() {
        return zzauW;
    }

    public zztw zzsf() {
        return this;
    }
}
