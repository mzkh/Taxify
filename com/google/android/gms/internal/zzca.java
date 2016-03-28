package com.google.android.gms.internal;

import android.content.Context;
import java.util.List;

@zzgi
public final class zzca {
    public static zzbx<String> zzqA;
    public static final zzbx<Boolean> zzqB;
    public static final zzbx<Integer> zzqC;
    public static final zzbx<Integer> zzqD;
    public static final zzbx<Integer> zzqE;
    public static final zzbx<Integer> zzqF;
    public static final zzbx<Integer> zzqG;
    public static final zzbx<String> zzqH;
    public static final zzbx<Boolean> zzqI;
    public static final zzbx<Boolean> zzqJ;
    public static final zzbx<String> zzqK;
    public static final zzbx<Boolean> zzqL;
    public static final zzbx<Boolean> zzqM;
    public static final zzbx<Integer> zzqN;
    public static final zzbx<String> zzqk;
    public static final zzbx<String> zzql;
    public static final zzbx<Boolean> zzqm;
    public static final zzbx<String> zzqn;
    public static final zzbx<Boolean> zzqo;
    public static final zzbx<Boolean> zzqp;
    public static final zzbx<Boolean> zzqq;
    public static final zzbx<String> zzqr;
    public static final zzbx<String> zzqs;
    public static final zzbx<String> zzqt;
    public static final zzbx<Boolean> zzqu;
    public static final zzbx<String> zzqv;
    public static final zzbx<String> zzqw;
    public static final zzbx<String> zzqx;
    public static final zzbx<Boolean> zzqy;
    public static zzbx<Integer> zzqz;

    static {
        zzqk = zzbx.zzA("gads:sdk_core_experiment_id");
        zzql = zzbx.zzd("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
        zzqm = zzbx.zza("gads:request_builder:singleton_webview", Boolean.valueOf(false));
        zzqn = zzbx.zzA("gads:request_builder:singleton_webview_experiment_id");
        zzqo = zzbx.zza("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
        zzqp = zzbx.zza("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
        zzqq = zzbx.zza("gads:block_autoclicks", Boolean.valueOf(false));
        zzqr = zzbx.zzA("gads:block_autoclicks_experiment_id");
        zzqs = zzbx.zzA("gads:prefetch:experiment_id");
        zzqt = zzbx.zzA("gads:spam_app_context:experiment_id");
        zzqu = zzbx.zza("gads:spam_app_context:enabled", Boolean.valueOf(false));
        zzqv = zzbx.zzd("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
        zzqw = zzbx.zzd("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
        zzqx = zzbx.zzd("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
        zzqy = zzbx.zza("gads:enabled_sdk_csi", Boolean.valueOf(false));
        zzqz = zzbx.zza("gads:sdk_csi_batch_size", 20);
        zzqA = zzbx.zzd("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        zzqB = zzbx.zza("gads:enable_content_fetching", Boolean.valueOf(false));
        zzqC = zzbx.zza("gads:content_length_weight", 1);
        zzqD = zzbx.zza("gads:content_age_weight", 1);
        zzqE = zzbx.zza("gads:min_content_len", 11);
        zzqF = zzbx.zza("gads:fingerprint_number", 10);
        zzqG = zzbx.zza("gads:sleep_sec", 10);
        zzqH = zzbx.zzA("gads:kitkat_interstitial_workaround:experiment_id");
        zzqI = zzbx.zza("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
        zzqJ = zzbx.zza("gads:interstitial_follow_url", Boolean.valueOf(true));
        zzqK = zzbx.zzA("gads:interstitial_follow_url:experiment_id");
        zzqL = zzbx.zza("gads:analytics_enabled", Boolean.valueOf(true));
        zzqM = zzbx.zza("gads:ad_key_enabled", Boolean.valueOf(false));
        zzqN = zzbx.zza("gads:webview_cache_version", 0);
    }

    public static void zza(Runnable runnable) {
        zzab.zzaT().zza(runnable);
    }

    public static List<String> zzca() {
        return zzab.zzaS().zzca();
    }

    public static List<String> zzcb() {
        return zzab.zzaS().zzcb();
    }

    public static void zzl(Context context) {
        zzab.zzaT().zzl(context);
    }
}
