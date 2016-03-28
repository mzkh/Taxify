package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.internal.zzms;
import com.google.android.gms.internal.zzmw;
import com.google.android.gms.internal.zzxd.zza;
import com.google.android.gms.internal.zzxd.zzc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bucket implements SafeParcelable {
    public static final Creator<Bucket> CREATOR;
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;
    public static final Comparator<Bucket> zzYB;
    private final int zzFG;
    private final long zzON;
    private final int zzYC;
    private final List<DataSet> zzYD;
    private final int zzYE;
    private boolean zzYF;
    private final long zzYq;
    private final Session zzYs;

    /* renamed from: com.google.android.gms.fitness.data.Bucket.1 */
    static class C01551 implements Comparator<Bucket> {
        C01551() {
        }

        public /* synthetic */ int compare(Object x0, Object x1) {
            return zza((Bucket) x0, (Bucket) x1);
        }

        public int zza(Bucket bucket, Bucket bucket2) {
            return zzmd.compare(bucket.getStartTime(TimeUnit.MILLISECONDS), bucket2.getStartTime(TimeUnit.MILLISECONDS));
        }
    }

    static {
        zzYB = new C01551();
        CREATOR = new zzd();
    }

    Bucket(int versionCode, long startTimeMillis, long endTimeMillis, Session session, int activityType, List<DataSet> dataSets, int bucketType, boolean serverHasMoreData) {
        this.zzYF = false;
        this.zzFG = versionCode;
        this.zzON = startTimeMillis;
        this.zzYq = endTimeMillis;
        this.zzYs = session;
        this.zzYC = activityType;
        this.zzYD = dataSets;
        this.zzYE = bucketType;
        this.zzYF = serverHasMoreData;
    }

    public Bucket(RawBucket bucket, List<DataSource> uniqueDataSources) {
        this(zzms.zzb(bucket), (List) uniqueDataSources);
    }

    public Bucket(zza bucket, List<DataSource> uniqueDataSources) {
        this(TYPE_SESSION, bucket.zzaIq, bucket.zzaIr, bucket.zzaIt == null ? null : zzmw.zzZW.zza(bucket.zzaIt), bucket.zzaIu, zza(bucket.zzaIv, uniqueDataSources), bucket.zzaIw, bucket.zzaIx);
    }

    private static List<DataSet> zza(zzc[] com_google_android_gms_internal_zzxd_zzcArr, List<DataSource> list) {
        List<DataSet> arrayList = new ArrayList(com_google_android_gms_internal_zzxd_zzcArr.length);
        int length = com_google_android_gms_internal_zzxd_zzcArr.length;
        for (int i = 0; i < length; i += TYPE_TIME) {
            arrayList.add(new DataSet(com_google_android_gms_internal_zzxd_zzcArr[i], (List) list));
        }
        return arrayList;
    }

    private boolean zza(Bucket bucket) {
        return this.zzON == bucket.zzON && this.zzYq == bucket.zzYq && this.zzYC == bucket.zzYC && zzw.equal(this.zzYD, bucket.zzYD) && this.zzYE == bucket.zzYE && this.zzYF == bucket.zzYF;
    }

    public static String zzdg(int i) {
        switch (i) {
            case SpinnerCompat.MODE_DIALOG /*0*/:
                return FitnessActivities.UNKNOWN;
            case TYPE_TIME /*1*/:
                return "time";
            case TYPE_SESSION /*2*/:
                return "session";
            case TYPE_ACTIVITY_TYPE /*3*/:
                return "type";
            case TYPE_ACTIVITY_SEGMENT /*4*/:
                return "segment";
            default:
                return "bug";
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        return o == this || ((o instanceof Bucket) && zza((Bucket) o));
    }

    public String getActivity() {
        return FitnessActivities.getName(this.zzYC);
    }

    public int getBucketType() {
        return this.zzYE;
    }

    public DataSet getDataSet(DataType dataType) {
        for (DataSet dataSet : this.zzYD) {
            if (dataSet.getDataType().equals(dataType)) {
                return dataSet;
            }
        }
        return null;
    }

    public List<DataSet> getDataSets() {
        return this.zzYD;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzYq, TimeUnit.MILLISECONDS);
    }

    public Session getSession() {
        return this.zzYs;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzON, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.zzFG;
    }

    public int hashCode() {
        Object[] objArr = new Object[TYPE_ACTIVITY_SEGMENT];
        objArr[0] = Long.valueOf(this.zzON);
        objArr[TYPE_TIME] = Long.valueOf(this.zzYq);
        objArr[TYPE_SESSION] = Integer.valueOf(this.zzYC);
        objArr[TYPE_ACTIVITY_TYPE] = Integer.valueOf(this.zzYE);
        return zzw.hashCode(objArr);
    }

    public String toString() {
        return zzw.zzk(this).zza("startTime", Long.valueOf(this.zzON)).zza("endTime", Long.valueOf(this.zzYq)).zza("activity", Integer.valueOf(this.zzYC)).zza("dataSets", this.zzYD).zza("bucketType", zzdg(this.zzYE)).zza("serverHasMoreData", Boolean.valueOf(this.zzYF)).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzd.zza(this, dest, flags);
    }

    public boolean zzb(Bucket bucket) {
        return this.zzON == bucket.zzON && this.zzYq == bucket.zzYq && this.zzYC == bucket.zzYC && this.zzYE == bucket.zzYE;
    }

    public int zzln() {
        return this.zzYC;
    }

    public boolean zzlo() {
        if (this.zzYF) {
            return true;
        }
        for (DataSet zzlo : this.zzYD) {
            if (zzlo.zzlo()) {
                return true;
            }
        }
        return false;
    }

    public long zzlp() {
        return this.zzON;
    }

    public long zzlq() {
        return this.zzYq;
    }
}
