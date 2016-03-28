package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.internal.zzr;

public final class ExecutionOptions {
    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 65536;
    private final String zzSq;
    private final boolean zzSr;
    private final int zzSs;

    public static final class Builder {
        private String zzSq;
        private boolean zzSr;
        private int zzSs;

        public Builder() {
            this.zzSs = ExecutionOptions.CONFLICT_STRATEGY_OVERWRITE_REMOTE;
        }

        public ExecutionOptions build() {
            if (this.zzSs != ExecutionOptions.CONFLICT_STRATEGY_KEEP_REMOTE || this.zzSr) {
                return new ExecutionOptions(this.zzSq, this.zzSr, this.zzSs);
            }
            throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
        }

        public Builder setConflictStrategy(int strategy) {
            if (ExecutionOptions.zzbm(strategy)) {
                this.zzSs = strategy;
                return this;
            }
            throw new IllegalArgumentException("Unrecognized value for conflict strategy: " + strategy);
        }

        public Builder setNotifyOnCompletion(boolean notify) {
            this.zzSr = notify;
            return this;
        }

        public Builder setTrackingTag(String trackingTag) {
            if (ExecutionOptions.zzbv(trackingTag)) {
                this.zzSq = trackingTag;
                return this;
            }
            Object[] objArr = new Object[ExecutionOptions.CONFLICT_STRATEGY_KEEP_REMOTE];
            objArr[ExecutionOptions.CONFLICT_STRATEGY_OVERWRITE_REMOTE] = Integer.valueOf(ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH);
            throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", objArr));
        }
    }

    public ExecutionOptions(String trackingTag, boolean notifyOnCompletion, int conflictStrategy) {
        this.zzSq = trackingTag;
        this.zzSr = notifyOnCompletion;
        this.zzSs = conflictStrategy;
    }

    public static void zza(GoogleApiClient googleApiClient, ExecutionOptions executionOptions) {
        zzr com_google_android_gms_drive_internal_zzr = (zzr) googleApiClient.zza(Drive.zzGR);
        if (executionOptions.zzku() && !com_google_android_gms_drive_internal_zzr.zzkI()) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        }
    }

    public static boolean zzbl(int i) {
        switch (i) {
            case CONFLICT_STRATEGY_KEEP_REMOTE /*1*/:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzbm(int i) {
        switch (i) {
            case CONFLICT_STRATEGY_OVERWRITE_REMOTE /*0*/:
            case CONFLICT_STRATEGY_KEEP_REMOTE /*1*/:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzbv(String str) {
        return (str == null || str.isEmpty() || str.length() > MAX_TRACKING_TAG_STRING_LENGTH) ? false : true;
    }

    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        if (o == this) {
            return true;
        }
        ExecutionOptions executionOptions = (ExecutionOptions) o;
        return zzw.equal(this.zzSq, executionOptions.zzSq) && this.zzSs == executionOptions.zzSs && this.zzSr == executionOptions.zzSr;
    }

    public int hashCode() {
        return zzw.hashCode(this.zzSq, Integer.valueOf(this.zzSs), Boolean.valueOf(this.zzSr));
    }

    public String zzkt() {
        return this.zzSq;
    }

    public boolean zzku() {
        return this.zzSr;
    }

    public int zzkv() {
        return this.zzSs;
    }
}
