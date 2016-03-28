package com.google.android.gms.fitness;

import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzmz;
import com.google.android.gms.internal.zzna;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zznc;
import com.google.android.gms.internal.zznc.zza;
import com.google.android.gms.internal.zznd;
import com.google.android.gms.internal.zzne;
import com.google.android.gms.internal.zzne.zzb;
import com.google.android.gms.internal.zznf;
import com.google.android.gms.internal.zzny;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzob;
import com.google.android.gms.internal.zzoc;
import com.google.android.gms.internal.zzod;
import com.google.android.gms.internal.zzoe;
import com.google.android.gms.internal.zzof;
import com.google.android.gms.internal.zzog;
import com.google.android.gms.internal.zzoi;
import java.util.concurrent.TimeUnit;

public class Fitness {
    public static final String ACTION_TRACK = "vnd.google.fitness.TRACK";
    public static final String ACTION_VIEW = "vnd.google.fitness.VIEW";
    public static final String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";
    @Deprecated
    public static final Void API;
    public static final Api<NoOptions> BLE_API;
    public static final BleApi BleApi;
    public static final Api<NoOptions> CONFIG_API;
    public static final ConfigApi ConfigApi;
    public static final String EXTRA_END_TIME = "vnd.google.fitness.end_time";
    public static final String EXTRA_START_TIME = "vnd.google.fitness.start_time";
    public static final Api<NoOptions> HISTORY_API;
    public static final HistoryApi HistoryApi;
    public static final Api<NoOptions> RECORDING_API;
    public static final RecordingApi RecordingApi;
    public static final Scope SCOPE_ACTIVITY_READ;
    public static final Scope SCOPE_ACTIVITY_READ_WRITE;
    public static final Scope SCOPE_BODY_READ;
    public static final Scope SCOPE_BODY_READ_WRITE;
    public static final Scope SCOPE_LOCATION_READ;
    public static final Scope SCOPE_LOCATION_READ_WRITE;
    public static final Api<NoOptions> SENSORS_API;
    public static final Api<NoOptions> SESSIONS_API;
    public static final SensorsApi SensorsApi;
    public static final SessionsApi SessionsApi;
    public static final Api<NoOptions> zzSe;
    public static final zzc<zzmz> zzYd;
    public static final zzc<zzna> zzYe;
    public static final zzc<zznb> zzYf;
    public static final zzc<zznc> zzYg;
    public static final zzc<zznd> zzYh;
    public static final zzc<zzne> zzYi;
    public static final zzc<zznf> zzYj;
    public static final zzny zzYk;
    public static final Scope zzYl;
    public static final Scope zzYm;

    static {
        zzYd = new zzc();
        zzYe = new zzc();
        zzYf = new zzc();
        zzYg = new zzc();
        zzYh = new zzc();
        zzYi = new zzc();
        zzYj = new zzc();
        API = null;
        SENSORS_API = new Api(new zzb(), zzYi, new Scope[0]);
        SensorsApi = new zzof();
        RECORDING_API = new Api(new zznd.zzb(), zzYh, new Scope[0]);
        RecordingApi = new zzoe();
        SESSIONS_API = new Api(new zznf.zzb(), zzYj, new Scope[0]);
        SessionsApi = new zzog();
        HISTORY_API = new Api(new zznb.zzb(), zzYf, new Scope[0]);
        HistoryApi = new zzoc();
        CONFIG_API = new Api(new zzna.zzb(), zzYe, new Scope[0]);
        ConfigApi = new zzob();
        BLE_API = new Api(new zzmz.zzb(), zzYd, new Scope[0]);
        BleApi = zzll();
        zzSe = new Api(new zza(), zzYg, new Scope[0]);
        zzYk = new zzod();
        SCOPE_ACTIVITY_READ = new Scope(Scopes.FITNESS_ACTIVITY_READ);
        SCOPE_ACTIVITY_READ_WRITE = new Scope(Scopes.FITNESS_ACTIVITY_READ_WRITE);
        SCOPE_LOCATION_READ = new Scope(Scopes.FITNESS_LOCATION_READ);
        SCOPE_LOCATION_READ_WRITE = new Scope(Scopes.FITNESS_LOCATION_READ_WRITE);
        SCOPE_BODY_READ = new Scope(Scopes.FITNESS_BODY_READ);
        SCOPE_BODY_READ_WRITE = new Scope(Scopes.FITNESS_BODY_READ_WRITE);
        zzYl = new Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
        zzYm = new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
    }

    private Fitness() {
    }

    public static long getEndTime(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(EXTRA_END_TIME, -1);
        return longExtra == -1 ? -1 : timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }

    public static long getStartTime(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(EXTRA_START_TIME, -1);
        return longExtra == -1 ? -1 : timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }

    private static BleApi zzll() {
        return VERSION.SDK_INT >= 18 ? new zzoa() : new zzoi();
    }
}
