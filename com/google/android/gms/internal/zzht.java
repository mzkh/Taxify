package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@zzgi
public class zzht {
    public static final zza<Void> zzzB;

    /* renamed from: com.google.android.gms.internal.zzht.2 */
    class C02402 implements Callable<T> {
        final /* synthetic */ String zzzC;
        final /* synthetic */ zza zzzD;
        final /* synthetic */ zzht zzzE;

        C02402(zzht com_google_android_gms_internal_zzht, String str, zza com_google_android_gms_internal_zzht_zza) {
            this.zzzE = com_google_android_gms_internal_zzht;
            this.zzzC = str;
            this.zzzD = com_google_android_gms_internal_zzht_zza;
        }

        public T call() {
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = this.zzzE.zzW(this.zzzC);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return this.zzzD.zzdQ();
                }
                T zzb = this.zzzD.zzb(httpURLConnection.getInputStream());
                if (httpURLConnection == null) {
                    return zzb;
                }
                httpURLConnection.disconnect();
                return zzb;
            } catch (Throwable e) {
                zzhx.zzd("Error making HTTP request.", e);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable e2) {
                zzhx.zzd("Error making HTTP request.", e2);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }

    public interface zza<T> {
        T zzb(InputStream inputStream);

        T zzdQ();
    }

    /* renamed from: com.google.android.gms.internal.zzht.1 */
    static class C04101 implements zza {
        C04101() {
        }

        public /* synthetic */ Object zzb(InputStream inputStream) {
            return zzc(inputStream);
        }

        public Void zzc(InputStream inputStream) {
            return null;
        }

        public /* synthetic */ Object zzdQ() {
            return zzeA();
        }

        public Void zzeA() {
            return null;
        }
    }

    static {
        zzzB = new C04101();
    }

    protected HttpURLConnection zzW(String str) throws MalformedURLException, IOException {
        return (HttpURLConnection) new URL(str).openConnection();
    }

    public <T> Future<T> zza(String str, zza<T> com_google_android_gms_internal_zzht_zza_T) {
        return zzhn.submit(new C02402(this, str, com_google_android_gms_internal_zzht_zza_T));
    }
}
