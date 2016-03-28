package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.internal.zzb;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzi extends zzdc {
    private static final String ID;
    private static final String URL;
    private static final String zzaxp;
    private static final String zzaxq;
    static final String zzaxr;
    private static final Set<String> zzaxs;
    private final Context mContext;
    private final zza zzaxt;

    public interface zza {
        zzaq zzsE();
    }

    /* renamed from: com.google.android.gms.tagmanager.zzi.1 */
    class C04541 implements zza {
        final /* synthetic */ Context zznK;

        C04541(Context context) {
            this.zznK = context;
        }

        public zzaq zzsE() {
            return zzy.zzak(this.zznK);
        }
    }

    static {
        ID = com.google.android.gms.internal.zza.ARBITRARY_PIXEL.toString();
        URL = zzb.URL.toString();
        zzaxp = zzb.ADDITIONAL_PARAMS.toString();
        zzaxq = zzb.UNREPEATABLE.toString();
        zzaxr = "gtm_" + ID + "_unrepeatable";
        zzaxs = new HashSet();
    }

    public zzi(Context context) {
        this(context, new C04541(context));
    }

    zzi(Context context, zza com_google_android_gms_tagmanager_zzi_zza) {
        super(ID, URL);
        this.zzaxt = com_google_android_gms_tagmanager_zzi_zza;
        this.mContext = context;
    }

    private synchronized boolean zzcI(String str) {
        boolean z = true;
        synchronized (this) {
            if (!zzcK(str)) {
                if (zzcJ(str)) {
                    zzaxs.add(str);
                } else {
                    z = false;
                }
            }
        }
        return z;
    }

    public void zzJ(Map<String, com.google.android.gms.internal.zzd.zza> map) {
        String zzg = map.get(zzaxq) != null ? zzde.zzg((com.google.android.gms.internal.zzd.zza) map.get(zzaxq)) : null;
        if (zzg == null || !zzcI(zzg)) {
            Builder buildUpon = Uri.parse(zzde.zzg((com.google.android.gms.internal.zzd.zza) map.get(URL))).buildUpon();
            com.google.android.gms.internal.zzd.zza com_google_android_gms_internal_zzd_zza = (com.google.android.gms.internal.zzd.zza) map.get(zzaxp);
            if (com_google_android_gms_internal_zzd_zza != null) {
                Object zzl = zzde.zzl(com_google_android_gms_internal_zzd_zza);
                if (zzl instanceof List) {
                    for (Object zzl2 : (List) zzl2) {
                        if (zzl2 instanceof Map) {
                            for (Entry entry : ((Map) zzl2).entrySet()) {
                                buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                            }
                        } else {
                            zzbf.zzZ("ArbitraryPixel: additional params contains non-map: not sending partial hit: " + buildUpon.build().toString());
                            return;
                        }
                    }
                }
                zzbf.zzZ("ArbitraryPixel: additional params not a list: not sending partial hit: " + buildUpon.build().toString());
                return;
            }
            String uri = buildUpon.build().toString();
            this.zzaxt.zzsE().zzcY(uri);
            zzbf.zzab("ArbitraryPixel: url = " + uri);
            if (zzg != null) {
                synchronized (zzi.class) {
                    zzaxs.add(zzg);
                    zzcu.zza(this.mContext, zzaxr, zzg, "true");
                }
            }
        }
    }

    boolean zzcJ(String str) {
        return this.mContext.getSharedPreferences(zzaxr, 0).contains(str);
    }

    boolean zzcK(String str) {
        return zzaxs.contains(str);
    }
}
