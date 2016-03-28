package com.google.android.gms.tagmanager;

import android.util.LruCache;
import com.google.android.gms.tagmanager.zzl.zza;

class zzaz<K, V> implements zzk<K, V> {
    private LruCache<K, V> zzazc;

    /* renamed from: com.google.android.gms.tagmanager.zzaz.1 */
    class C02861 extends LruCache<K, V> {
        final /* synthetic */ zza zzazd;
        final /* synthetic */ zzaz zzaze;

        C02861(zzaz com_google_android_gms_tagmanager_zzaz, int i, zza com_google_android_gms_tagmanager_zzl_zza) {
            this.zzaze = com_google_android_gms_tagmanager_zzaz;
            this.zzazd = com_google_android_gms_tagmanager_zzl_zza;
            super(i);
        }

        protected int sizeOf(K key, V value) {
            return this.zzazd.sizeOf(key, value);
        }
    }

    zzaz(int i, zza<K, V> com_google_android_gms_tagmanager_zzl_zza_K__V) {
        this.zzazc = new C02861(this, i, com_google_android_gms_tagmanager_zzl_zza_K__V);
    }

    public V get(K key) {
        return this.zzazc.get(key);
    }

    public void zze(K k, V v) {
        this.zzazc.put(k, v);
    }
}
