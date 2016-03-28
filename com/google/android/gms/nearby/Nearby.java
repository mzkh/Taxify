package com.google.android.gms.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzrl;
import com.google.android.gms.internal.zzrq;
import com.google.android.gms.internal.zzrz;
import com.google.android.gms.internal.zzsk;
import com.google.android.gms.internal.zzsr;
import com.google.android.gms.nearby.connection.Connections;

public final class Nearby {
    public static final Api<NoOptions> CONNECTIONS_API;
    public static final Connections Connections;
    public static final Api<NoOptions> zzasA;
    public static final zzrq zzasB;
    public static final Api<NoOptions> zzasC;
    public static final zzsk zzasD;

    static {
        CONNECTIONS_API = new Api(zzrl.zzGS, zzrl.zzGR, new Scope[0]);
        Connections = new zzrl();
        zzasA = new Api(zzrz.zzGS, zzrz.zzGR, new Scope[0]);
        zzasB = new zzrz();
        zzasC = new Api(zzsr.zzGS, zzsr.zzGR, new Scope[0]);
        zzasD = new zzsr();
    }

    private Nearby() {
    }
}
