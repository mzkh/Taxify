package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzgi
public class zzez implements zzex {
    private final Context mContext;
    final Set<WebView> zzuN;

    /* renamed from: com.google.android.gms.internal.zzez.1 */
    class C02161 implements Runnable {
        final /* synthetic */ String zzuO;
        final /* synthetic */ String zzuP;
        final /* synthetic */ zzez zzuQ;

        /* renamed from: com.google.android.gms.internal.zzez.1.1 */
        class C02151 extends WebViewClient {
            final /* synthetic */ WebView zzov;
            final /* synthetic */ C02161 zzuR;

            C02151(C02161 c02161, WebView webView) {
                this.zzuR = c02161;
                this.zzov = webView;
            }

            public void onPageFinished(WebView view, String url) {
                zzhx.zzY("Loading assets have finished");
                this.zzuR.zzuQ.zzuN.remove(this.zzov);
            }

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                zzhx.zzac("Loading assets have failed.");
                this.zzuR.zzuQ.zzuN.remove(this.zzov);
            }
        }

        C02161(zzez com_google_android_gms_internal_zzez, String str, String str2) {
            this.zzuQ = com_google_android_gms_internal_zzez;
            this.zzuO = str;
            this.zzuP = str2;
        }

        public void run() {
            WebView zzdr = this.zzuQ.zzdr();
            zzdr.setWebViewClient(new C02151(this, zzdr));
            this.zzuQ.zzuN.add(zzdr);
            zzdr.loadDataWithBaseURL(this.zzuO, this.zzuP, "text/html", "UTF-8", null);
            zzhx.zzY("Fetching assets finished.");
        }
    }

    public zzez(Context context) {
        this.zzuN = Collections.synchronizedSet(new HashSet());
        this.mContext = context;
    }

    public void zza(String str, String str2, String str3) {
        zzhx.zzY("Fetching assets for the given html");
        zzhw.zzzG.post(new C02161(this, str2, str3));
    }

    public WebView zzdr() {
        WebView webView = new WebView(this.mContext);
        webView.getSettings().setJavaScriptEnabled(true);
        return webView;
    }
}
