package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@zzgi
public class zzih extends zzid {
    public zzih(zzic com_google_android_gms_internal_zzic, boolean z) {
        super(com_google_android_gms_internal_zzic, z);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String url) {
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(url).getName())) {
                return super.shouldInterceptRequest(webView, url);
            }
            if (webView instanceof zzic) {
                zzic com_google_android_gms_internal_zzic = (zzic) webView;
                com_google_android_gms_internal_zzic.zzeG().zzde();
                String str = com_google_android_gms_internal_zzic.zzad().zzpb ? (String) zzca.zzqx.get() : com_google_android_gms_internal_zzic.zzeK() ? (String) zzca.zzqw.get() : (String) zzca.zzqv.get();
                zzhx.zzab("shouldInterceptRequest(" + str + ")");
                return zzd(com_google_android_gms_internal_zzic.getContext(), this.zzmu.zzeJ().zzzH, str);
            }
            zzhx.zzac("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return super.shouldInterceptRequest(webView, url);
        } catch (IOException e) {
            zzhx.zzac("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, url);
        }
    }

    protected WebResourceResponse zzd(Context context, String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        try {
            zzab.zzaM().zza(context, str, true, httpURLConnection, true);
            httpURLConnection.addRequestProperty("Cache-Control", "max-stale=3600");
            httpURLConnection.connect();
            WebResourceResponse webResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(zzab.zzaM().zza(new InputStreamReader(httpURLConnection.getInputStream())).getBytes("UTF-8")));
            return webResourceResponse;
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
