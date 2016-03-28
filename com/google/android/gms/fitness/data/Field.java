package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

public final class Field implements SafeParcelable {
    public static final Creator<Field> CREATOR;
    public static final Field FIELD_ACCURACY;
    public static final Field FIELD_ACTIVITY;
    public static final Field FIELD_ALTITUDE;
    public static final Field FIELD_AVERAGE;
    public static final Field FIELD_BPM;
    public static final Field FIELD_CALORIES;
    public static final Field FIELD_CIRCUMFERENCE;
    public static final Field FIELD_CONFIDENCE;
    public static final Field FIELD_DISTANCE;
    public static final Field FIELD_DURATION;
    public static final Field FIELD_HEIGHT;
    public static final Field FIELD_HIGH_LATITUDE;
    public static final Field FIELD_HIGH_LONGITUDE;
    public static final Field FIELD_LATITUDE;
    public static final Field FIELD_LONGITUDE;
    public static final Field FIELD_LOW_LATITUDE;
    public static final Field FIELD_LOW_LONGITUDE;
    public static final Field FIELD_MAX;
    public static final Field FIELD_MIN;
    public static final Field FIELD_PERCENTAGE;
    public static final Field FIELD_REVOLUTIONS;
    public static final Field FIELD_RPM;
    public static final Field FIELD_SPEED;
    public static final Field FIELD_STEPS;
    public static final Field FIELD_WATTS;
    public static final Field FIELD_WEIGHT;
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final Field zzZA;
    public static final Field zzZB;
    public static final Field zzZC;
    public static final Field zzZD;
    public static final Field zzZi;
    public static final Field zzZj;
    public static final Field zzZk;
    public static final Field zzZl;
    public static final Field zzZm;
    public static final Field zzZn;
    public static final Field zzZo;
    public static final Field zzZp;
    public static final Field zzZq;
    public static final Field zzZr;
    public static final Field zzZs;
    public static final Field zzZt;
    public static final Field zzZu;
    public static final Field zzZv;
    public static final Field zzZw;
    public static final Field zzZx;
    public static final Field zzZy;
    public static final Field zzZz;
    private final String mName;
    private final int zzFG;
    private final int zzZE;

    static {
        FIELD_ACTIVITY = zzbJ("activity");
        FIELD_CONFIDENCE = zzbK("confidence");
        FIELD_STEPS = zzbJ("steps");
        FIELD_DURATION = zzbJ("duration");
        FIELD_BPM = zzbK("bpm");
        FIELD_LATITUDE = zzbK("latitude");
        FIELD_LONGITUDE = zzbK("longitude");
        FIELD_ACCURACY = zzbK("accuracy");
        FIELD_ALTITUDE = zzbK("altitude");
        FIELD_DISTANCE = zzbK("distance");
        FIELD_HEIGHT = zzbK("height");
        FIELD_WEIGHT = zzbK("weight");
        FIELD_CIRCUMFERENCE = zzbK("circumference");
        FIELD_PERCENTAGE = zzbK("percentage");
        FIELD_SPEED = zzbK("speed");
        FIELD_RPM = zzbK("rpm");
        FIELD_REVOLUTIONS = zzbJ("revolutions");
        FIELD_CALORIES = zzbK("calories");
        FIELD_WATTS = zzbK("watts");
        zzZi = zzbJ("meal_type");
        zzZj = zzbK("fat.total");
        zzZk = zzbK("fat.saturated");
        zzZl = zzbK("fat.polyunsaturated");
        zzZm = zzbK("fat.monounsaturated");
        zzZn = zzbK("fat.trans");
        zzZo = zzbK("cholesterol");
        zzZp = zzbK("sodium");
        zzZq = zzbK("potassium");
        zzZr = zzbK("carbs.total");
        zzZs = zzbK("dietary_fiber");
        zzZt = zzbK("sugar");
        zzZu = zzbK("protein");
        zzZv = zzbK("vitamin_a");
        zzZw = zzbK("vitamin_c");
        zzZx = zzbK("calcium");
        zzZy = zzbK("iron");
        zzZz = zzbJ("num_segments");
        FIELD_AVERAGE = zzbK("average");
        FIELD_MAX = zzbK("max");
        FIELD_MIN = zzbK("min");
        FIELD_LOW_LATITUDE = zzbK("low_latitude");
        FIELD_LOW_LONGITUDE = zzbK("low_longitude");
        FIELD_HIGH_LATITUDE = zzbK("high_latitude");
        FIELD_HIGH_LONGITUDE = zzbK("high_longitude");
        zzZA = zzbJ("edge_type");
        zzZB = zzbK("x");
        zzZC = zzbK("y");
        zzZD = zzbK("z");
        CREATOR = new zzj();
    }

    Field(int versionCode, String name, int format) {
        this.zzFG = versionCode;
        this.mName = (String) zzx.zzl(name);
        this.zzZE = format;
    }

    private Field(String name, int format) {
        this(FORMAT_INT32, name, format);
    }

    private boolean zza(Field field) {
        return this.mName.equals(field.mName) && this.zzZE == field.zzZE;
    }

    private static Field zzbJ(String str) {
        return new Field(str, FORMAT_INT32);
    }

    private static Field zzbK(String str) {
        return new Field(str, FORMAT_FLOAT);
    }

    public static Field zzn(String str, int i) {
        Object obj = -1;
        switch (str.hashCode()) {
            case -2131707655:
                if (str.equals("accuracy")) {
                    obj = null;
                    break;
                }
                break;
            case -1992012396:
                if (str.equals("duration")) {
                    obj = 12;
                    break;
                }
                break;
            case -1930010315:
                if (str.equals("potassium")) {
                    obj = 29;
                    break;
                }
                break;
            case -1762597548:
                if (str.equals("vitamin_a")) {
                    obj = 40;
                    break;
                }
                break;
            case -1762597546:
                if (str.equals("vitamin_c")) {
                    obj = 41;
                    break;
                }
                break;
            case -1734926706:
                if (str.equals("cholesterol")) {
                    obj = 7;
                    break;
                }
                break;
            case -1655966961:
                if (str.equals("activity")) {
                    obj = FORMAT_INT32;
                    break;
                }
                break;
            case -1569430471:
                if (str.equals("num_segments")) {
                    obj = 26;
                    break;
                }
                break;
            case -1439978388:
                if (str.equals("latitude")) {
                    obj = 18;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    obj = 14;
                    break;
                }
                break;
            case -1124148177:
                if (str.equals("fat.total")) {
                    obj = 38;
                    break;
                }
                break;
            case -1124076653:
                if (str.equals("fat.trans")) {
                    obj = 39;
                    break;
                }
                break;
            case -984531717:
                if (str.equals("fat.polyunsaturated")) {
                    obj = 28;
                    break;
                }
                break;
            case -921832806:
                if (str.equals("percentage")) {
                    obj = 27;
                    break;
                }
                break;
            case -897020359:
                if (str.equals("sodium")) {
                    obj = 34;
                    break;
                }
                break;
            case -791592328:
                if (str.equals("weight")) {
                    obj = 43;
                    break;
                }
                break;
            case -631448035:
                if (str.equals("average")) {
                    obj = 3;
                    break;
                }
                break;
            case -626344110:
                if (str.equals("high_longitude")) {
                    obj = 16;
                    break;
                }
                break;
            case -619868540:
                if (str.equals("low_longitude")) {
                    obj = 21;
                    break;
                }
                break;
            case -612488479:
                if (str.equals("dietary_fiber")) {
                    obj = 10;
                    break;
                }
                break;
            case -494782871:
                if (str.equals("high_latitude")) {
                    obj = 15;
                    break;
                }
                break;
            case -437053898:
                if (str.equals("meal_type")) {
                    obj = 23;
                    break;
                }
                break;
            case -309012605:
                if (str.equals("protein")) {
                    obj = 30;
                    break;
                }
                break;
            case -277306353:
                if (str.equals("circumference")) {
                    obj = 8;
                    break;
                }
                break;
            case -168965370:
                if (str.equals("calories")) {
                    obj = 6;
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    obj = 44;
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    obj = 45;
                    break;
                }
                break;
            case 122:
                if (str.equals("z")) {
                    obj = 46;
                    break;
                }
                break;
            case 97759:
                if (str.equals("bpm")) {
                    obj = 4;
                    break;
                }
                break;
            case 107876:
                if (str.equals("max")) {
                    obj = 22;
                    break;
                }
                break;
            case 108114:
                if (str.equals("min")) {
                    obj = 24;
                    break;
                }
                break;
            case 113135:
                if (str.equals("rpm")) {
                    obj = 32;
                    break;
                }
                break;
            case 3241160:
                if (str.equals("iron")) {
                    obj = 17;
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    obj = 35;
                    break;
                }
                break;
            case 109792566:
                if (str.equals("sugar")) {
                    obj = 36;
                    break;
                }
                break;
            case 112903913:
                if (str.equals("watts")) {
                    obj = 42;
                    break;
                }
                break;
            case 125042491:
                if (str.equals("carbs.total")) {
                    obj = 37;
                    break;
                }
                break;
            case 137365935:
                if (str.equals("longitude")) {
                    obj = 19;
                    break;
                }
                break;
            case 198162679:
                if (str.equals("low_latitude")) {
                    obj = 20;
                    break;
                }
                break;
            case 215325440:
                if (str.equals("fat.saturated")) {
                    obj = 33;
                    break;
                }
                break;
            case 224520316:
                if (str.equals("edge_type")) {
                    obj = 13;
                    break;
                }
                break;
            case 288459765:
                if (str.equals("distance")) {
                    obj = 11;
                    break;
                }
                break;
            case 548373068:
                if (str.equals("calcium")) {
                    obj = 5;
                    break;
                }
                break;
            case 811264586:
                if (str.equals("revolutions")) {
                    obj = 31;
                    break;
                }
                break;
            case 829251210:
                if (str.equals("confidence")) {
                    obj = 9;
                    break;
                }
                break;
            case 1205114244:
                if (str.equals("fat.monounsaturated")) {
                    obj = 25;
                    break;
                }
                break;
            case 2036550306:
                if (str.equals("altitude")) {
                    obj = FORMAT_FLOAT;
                    break;
                }
                break;
        }
        switch (obj) {
            case SpinnerCompat.MODE_DIALOG /*0*/:
                return FIELD_ACCURACY;
            case FORMAT_INT32 /*1*/:
                return FIELD_ACTIVITY;
            case FORMAT_FLOAT /*2*/:
                return FIELD_ALTITUDE;
            case CompletionEvent.STATUS_CANCELED /*3*/:
                return FIELD_AVERAGE;
            case Place.TYPE_AQUARIUM /*4*/:
                return FIELD_BPM;
            case Place.TYPE_ART_GALLERY /*5*/:
                return zzZx;
            case Place.TYPE_ATM /*6*/:
                return FIELD_CALORIES;
            case Place.TYPE_BAKERY /*7*/:
                return zzZo;
            case Place.TYPE_BANK /*8*/:
                return FIELD_CIRCUMFERENCE;
            case Place.TYPE_BAR /*9*/:
                return FIELD_CONFIDENCE;
            case Place.TYPE_BEAUTY_SALON /*10*/:
                return zzZs;
            case Place.TYPE_BICYCLE_STORE /*11*/:
                return FIELD_DISTANCE;
            case Place.TYPE_BOOK_STORE /*12*/:
                return FIELD_DURATION;
            case ConnectionsStatusCodes.STATUS_ERROR /*13*/:
                return zzZA;
            case Place.TYPE_BUS_STATION /*14*/:
                return FIELD_HEIGHT;
            case Place.TYPE_CAFE /*15*/:
                return FIELD_HIGH_LATITUDE;
            case Place.TYPE_CAMPGROUND /*16*/:
                return FIELD_HIGH_LONGITUDE;
            case Place.TYPE_CAR_DEALER /*17*/:
                return zzZy;
            case Place.TYPE_CAR_RENTAL /*18*/:
                return FIELD_LATITUDE;
            case Place.TYPE_CAR_REPAIR /*19*/:
                return FIELD_LONGITUDE;
            case Place.TYPE_CAR_WASH /*20*/:
                return FIELD_LOW_LATITUDE;
            case Place.TYPE_CASINO /*21*/:
                return FIELD_LOW_LONGITUDE;
            case Place.TYPE_CEMETERY /*22*/:
                return FIELD_MAX;
            case Place.TYPE_CHURCH /*23*/:
                return zzZi;
            case Place.TYPE_CITY_HALL /*24*/:
                return FIELD_MIN;
            case Place.TYPE_CLOTHING_STORE /*25*/:
                return zzZm;
            case Place.TYPE_CONVENIENCE_STORE /*26*/:
                return zzZz;
            case Place.TYPE_COURTHOUSE /*27*/:
                return FIELD_PERCENTAGE;
            case Place.TYPE_DENTIST /*28*/:
                return zzZl;
            case Place.TYPE_DEPARTMENT_STORE /*29*/:
                return zzZq;
            case Place.TYPE_DOCTOR /*30*/:
                return zzZu;
            case Place.TYPE_ELECTRICIAN /*31*/:
                return FIELD_REVOLUTIONS;
            case Place.TYPE_ELECTRONICS_STORE /*32*/:
                return FIELD_RPM;
            case Place.TYPE_EMBASSY /*33*/:
                return zzZk;
            case Place.TYPE_ESTABLISHMENT /*34*/:
                return zzZp;
            case Place.TYPE_FINANCE /*35*/:
                return FIELD_SPEED;
            case Place.TYPE_FIRE_STATION /*36*/:
                return zzZt;
            case Place.TYPE_FLORIST /*37*/:
                return zzZr;
            case Place.TYPE_FOOD /*38*/:
                return zzZj;
            case Place.TYPE_FUNERAL_HOME /*39*/:
                return zzZn;
            case Place.TYPE_FURNITURE_STORE /*40*/:
                return zzZv;
            case Place.TYPE_GAS_STATION /*41*/:
                return zzZw;
            case Place.TYPE_GENERAL_CONTRACTOR /*42*/:
                return FIELD_WATTS;
            case Place.TYPE_GROCERY_OR_SUPERMARKET /*43*/:
                return FIELD_WEIGHT;
            case Place.TYPE_GYM /*44*/:
                return zzZB;
            case Place.TYPE_HAIR_CARE /*45*/:
                return zzZC;
            case Place.TYPE_HARDWARE_STORE /*46*/:
                return zzZD;
            default:
                return new Field(str, i);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object that) {
        return this == that || ((that instanceof Field) && zza((Field) that));
    }

    public int getFormat() {
        return this.zzZE;
    }

    public String getName() {
        return this.mName;
    }

    int getVersionCode() {
        return this.zzFG;
    }

    public int hashCode() {
        return this.mName.hashCode();
    }

    public String toString() {
        String str = "%s(%s)";
        Object[] objArr = new Object[FORMAT_FLOAT];
        objArr[0] = this.mName;
        objArr[FORMAT_INT32] = this.zzZE == FORMAT_INT32 ? "i" : "f";
        return String.format(str, objArr);
    }

    public void writeToParcel(Parcel dest, int flags) {
        zzj.zza(this, dest, flags);
    }
}
