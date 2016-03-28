package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryEvent;

public class OnEventResponse implements SafeParcelable {
    public static final Creator<OnEventResponse> CREATOR;
    final int zzFG;
    final int zzTe;
    final ChangeEvent zzUU;
    final CompletionEvent zzUV;
    final QueryEvent zzUW;

    static {
        CREATOR = new zzau();
    }

    OnEventResponse(int versionCode, int eventType, ChangeEvent changeEvent, CompletionEvent completionEvent, QueryEvent queryEvent) {
        this.zzFG = versionCode;
        this.zzTe = eventType;
        this.zzUU = changeEvent;
        this.zzUV = completionEvent;
        this.zzUW = queryEvent;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzau.zza(this, dest, flags);
    }

    public DriveEvent zzkQ() {
        switch (this.zzTe) {
            case CompletionEvent.STATUS_FAILURE /*1*/:
                return this.zzUU;
            case CompletionEvent.STATUS_CONFLICT /*2*/:
                return this.zzUV;
            case CompletionEvent.STATUS_CANCELED /*3*/:
                return this.zzUW;
            default:
                throw new IllegalStateException("Unexpected event type " + this.zzTe);
        }
    }
}
