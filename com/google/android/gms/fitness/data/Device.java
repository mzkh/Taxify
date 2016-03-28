package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zznz;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.places.Place;

public final class Device implements SafeParcelable {
    public static final Creator<Device> CREATOR;
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;
    private final int zzFG;
    private final int zzJp;
    private final String zzYw;
    private final String zzZe;
    private final String zzZf;
    private final String zzZg;
    private final int zzZh;

    static {
        CREATOR = new zzi();
    }

    Device(int versionCode, String manufacturer, String model, String version, String uid, int type, int platformType) {
        this.zzFG = versionCode;
        this.zzZe = (String) zzx.zzl(manufacturer);
        this.zzZf = (String) zzx.zzl(model);
        this.zzYw = "";
        this.zzZg = (String) zzx.zzl(uid);
        this.zzJp = type;
        this.zzZh = platformType;
    }

    public Device(String manufacturer, String model, String uid, int type) {
        this(manufacturer, model, "", uid, type, TYPE_UNKNOWN);
    }

    public Device(String manufacturer, String model, String version, String uid, int type) {
        this(manufacturer, model, uid, type);
    }

    public Device(String manufacturer, String model, String version, String uid, int type, int platformType) {
        this(TYPE_PHONE, manufacturer, model, "", uid, type, platformType);
    }

    public static Device getLocalDevice(Context context) {
        int zzU = zzU(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, VERSION.RELEASE, zzT(context), zzU, TYPE_TABLET);
    }

    private static String zzT(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    private static int zzU(Context context) {
        switch (zzW(context)) {
            case Place.TYPE_BANK /*8*/:
            case Place.TYPE_BAR /*9*/:
                return TYPE_UNKNOWN;
            case Place.TYPE_BEAUTY_SALON /*10*/:
                return zzV(context) ? TYPE_WATCH : TYPE_UNKNOWN;
            default:
                return zzY(context) ? TYPE_PHONE : TYPE_TABLET;
        }
    }

    public static boolean zzV(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 6;
    }

    private static int zzW(Context context) {
        return ((zzX(context) % GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE) / 100) + TYPE_SCALE;
    }

    private static int zzX(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, TYPE_UNKNOWN).versionCode;
        } catch (NameNotFoundException e) {
            Log.w("Fitness", "Could not find package info for Google Play Services");
            return -1;
        }
    }

    private static boolean zzY(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0;
    }

    private boolean zza(Device device) {
        return zzw.equal(this.zzZe, device.zzZe) && zzw.equal(this.zzZf, device.zzZf) && zzw.equal(this.zzYw, device.zzYw) && zzw.equal(this.zzZg, device.zzZg) && this.zzJp == device.zzJp && this.zzZh == device.zzZh;
    }

    private boolean zzlE() {
        return zzlD() == TYPE_PHONE;
    }

    public int describeContents() {
        return TYPE_UNKNOWN;
    }

    public boolean equals(Object that) {
        return this == that || ((that instanceof Device) && zza((Device) that));
    }

    public String getManufacturer() {
        return this.zzZe;
    }

    public String getModel() {
        return this.zzZf;
    }

    String getStreamIdentifier() {
        Object[] objArr = new Object[TYPE_WATCH];
        objArr[TYPE_UNKNOWN] = this.zzZe;
        objArr[TYPE_PHONE] = this.zzZf;
        objArr[TYPE_TABLET] = this.zzZg;
        return String.format("%s:%s:%s", objArr);
    }

    public int getType() {
        return this.zzJp;
    }

    public String getUid() {
        return this.zzZg;
    }

    public String getVersion() {
        return this.zzYw;
    }

    int getVersionCode() {
        return this.zzFG;
    }

    public int hashCode() {
        Object[] objArr = new Object[TYPE_SCALE];
        objArr[TYPE_UNKNOWN] = this.zzZe;
        objArr[TYPE_PHONE] = this.zzZf;
        objArr[TYPE_TABLET] = this.zzYw;
        objArr[TYPE_WATCH] = this.zzZg;
        objArr[TYPE_CHEST_STRAP] = Integer.valueOf(this.zzJp);
        return zzw.hashCode(objArr);
    }

    public String toString() {
        Object[] objArr = new Object[TYPE_CHEST_STRAP];
        objArr[TYPE_UNKNOWN] = getStreamIdentifier();
        objArr[TYPE_PHONE] = this.zzYw;
        objArr[TYPE_TABLET] = Integer.valueOf(this.zzJp);
        objArr[TYPE_WATCH] = Integer.valueOf(this.zzZh);
        return String.format("Device{%s:%s:%s:%s}", objArr);
    }

    public void writeToParcel(Parcel parcel, int flags) {
        zzi.zza(this, parcel, flags);
    }

    public int zzlD() {
        return this.zzZh;
    }

    public String zzlF() {
        return (zznz.zzlM() || zzlE()) ? this.zzZg : zznz.zzbM(this.zzZg);
    }
}
