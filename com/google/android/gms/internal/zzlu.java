package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.regex.Pattern;

public final class zzlu {
    private static Pattern zzRN;

    static {
        zzRN = null;
    }

    public static boolean zzQ(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int zzbb(int i) {
        return i / GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE;
    }

    public static int zzbc(int i) {
        return (i % GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE) / 100;
    }

    public static boolean zzbd(int i) {
        return zzbc(i) == 3;
    }
}
