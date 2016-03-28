package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

class zzl<K, V> {
    final zza<K, V> zzaxu;

    public interface zza<K, V> {
        int sizeOf(K k, V v);
    }

    /* renamed from: com.google.android.gms.tagmanager.zzl.1 */
    class C04551 implements zza<K, V> {
        final /* synthetic */ zzl zzaxv;

        C04551(zzl com_google_android_gms_tagmanager_zzl) {
            this.zzaxv = com_google_android_gms_tagmanager_zzl;
        }

        public int sizeOf(K k, V v) {
            return 1;
        }
    }

    public zzl() {
        this.zzaxu = new C04551(this);
    }

    public zzk<K, V> zza(int i, zza<K, V> com_google_android_gms_tagmanager_zzl_zza_K__V) {
        if (i > 0) {
            return zzsF() < 12 ? new zzcv(i, com_google_android_gms_tagmanager_zzl_zza_K__V) : new zzaz(i, com_google_android_gms_tagmanager_zzl_zza_K__V);
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    int zzsF() {
        return VERSION.SDK_INT;
    }
}
