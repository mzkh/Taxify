package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

abstract class zzaj<T> {
    private final HashMap<T, zzbe> zzaGo;

    static final class zzb extends zzaj<com.google.android.gms.wearable.zza.zza> {
        zzb() {
        }

        zzbe zza(com.google.android.gms.wearable.zza.zza com_google_android_gms_wearable_zza_zza, IntentFilter[] intentFilterArr) {
            return zzbe.zza(com_google_android_gms_wearable_zza_zza);
        }
    }

    static final class zzc extends zzaj<DataListener> {
        zzc() {
        }

        zzbe zza(DataListener dataListener, IntentFilter[] intentFilterArr) {
            return zzbe.zzb(dataListener, intentFilterArr);
        }
    }

    static final class zzd extends zzaj<MessageListener> {
        zzd() {
        }

        zzbe zza(MessageListener messageListener, IntentFilter[] intentFilterArr) {
            return zzbe.zzb(messageListener, intentFilterArr);
        }
    }

    static final class zze extends zzaj<NodeListener> {
        zze() {
        }

        zzbe zza(NodeListener nodeListener, IntentFilter[] intentFilterArr) {
            return zzbe.zza(nodeListener);
        }
    }

    private static class zza<T> extends zza<Status> {
        private WeakReference<Map<T, zzbe>> zzaGp;
        private WeakReference<T> zzaGq;

        zza(Map<T, zzbe> map, T t, com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status) {
            super(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status);
            this.zzaGp = new WeakReference(map);
            this.zzaGq = new WeakReference(t);
        }

        public void zza(Status status) {
            Map map = (Map) this.zzaGp.get();
            Object obj = this.zzaGq.get();
            if (!(status.getStatus().isSuccess() || map == null || obj == null)) {
                synchronized (map) {
                    zzbe com_google_android_gms_wearable_internal_zzbe = (zzbe) map.remove(obj);
                    if (com_google_android_gms_wearable_internal_zzbe != null) {
                        com_google_android_gms_wearable_internal_zzbe.clear();
                    }
                }
            }
            zzE(status);
        }
    }

    private static class zzf<T> extends zza<Status> {
        private WeakReference<Map<T, zzbe>> zzaGp;
        private WeakReference<T> zzaGq;

        zzf(Map<T, zzbe> map, T t, com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status) {
            super(com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status);
            this.zzaGp = new WeakReference(map);
            this.zzaGq = new WeakReference(t);
        }

        public void zza(Status status) {
            Map map = (Map) this.zzaGp.get();
            Object obj = this.zzaGq.get();
            if (!(status.getStatus().getStatusCode() != WearableStatusCodes.UNKNOWN_LISTENER || map == null || obj == null)) {
                synchronized (map) {
                    zzbe com_google_android_gms_wearable_internal_zzbe = (zzbe) map.remove(obj);
                    if (com_google_android_gms_wearable_internal_zzbe != null) {
                        com_google_android_gms_wearable_internal_zzbe.clear();
                    }
                }
            }
            zzE(status);
        }
    }

    zzaj() {
        this.zzaGo = new HashMap();
    }

    abstract zzbe zza(T t, IntentFilter[] intentFilterArr);

    public void zza(zzbd com_google_android_gms_wearable_internal_zzbd, com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, T t) throws RemoteException {
        synchronized (this.zzaGo) {
            zzbe com_google_android_gms_wearable_internal_zzbe = (zzbe) this.zzaGo.remove(t);
            if (com_google_android_gms_wearable_internal_zzbe == null) {
                com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status.zzd(new Status(WearableStatusCodes.UNKNOWN_LISTENER));
                return;
            }
            com_google_android_gms_wearable_internal_zzbe.clear();
            ((zzai) com_google_android_gms_wearable_internal_zzbd.zzjb()).zza(new zzf(this.zzaGo, t, com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status), new zzau(com_google_android_gms_wearable_internal_zzbe));
        }
    }

    public void zza(zzbd com_google_android_gms_wearable_internal_zzbd, com.google.android.gms.common.api.zza.zzb<Status> com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status, T t, IntentFilter[] intentFilterArr) throws RemoteException {
        zzbe zza = zza(t, intentFilterArr);
        synchronized (this.zzaGo) {
            if (this.zzaGo.get(t) != null) {
                com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status.zzd(new Status(WearableStatusCodes.DUPLICATE_LISTENER));
                return;
            }
            this.zzaGo.put(t, zza);
            try {
                ((zzai) com_google_android_gms_wearable_internal_zzbd.zzjb()).zza(new zza(this.zzaGo, t, com_google_android_gms_common_api_zza_zzb_com_google_android_gms_common_api_Status), new zzb(zza));
            } catch (RemoteException e) {
                this.zzaGo.remove(t);
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzb(com.google.android.gms.wearable.internal.zzbd r9) {
        /*
        r8 = this;
        r3 = r8.zzaGo;
        monitor-enter(r3);
        r4 = new com.google.android.gms.wearable.internal.zzbc$zzh;	 Catch:{ all -> 0x0096 }
        r4.<init>();	 Catch:{ all -> 0x0096 }
        r0 = r8.zzaGo;	 Catch:{ all -> 0x0096 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0096 }
        r5 = r0.iterator();	 Catch:{ all -> 0x0096 }
    L_0x0012:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0096 }
        if (r0 == 0) goto L_0x0099;
    L_0x0018:
        r0 = r5.next();	 Catch:{ all -> 0x0096 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0096 }
        r1 = r0.getValue();	 Catch:{ all -> 0x0096 }
        r1 = (com.google.android.gms.wearable.internal.zzbe) r1;	 Catch:{ all -> 0x0096 }
        if (r1 == 0) goto L_0x0012;
    L_0x0026:
        r1.clear();	 Catch:{ all -> 0x0096 }
        r2 = r9.isConnected();	 Catch:{ all -> 0x0096 }
        if (r2 == 0) goto L_0x0012;
    L_0x002f:
        r2 = r9.zzjb();	 Catch:{ RemoteException -> 0x006d }
        r2 = (com.google.android.gms.wearable.internal.zzai) r2;	 Catch:{ RemoteException -> 0x006d }
        r6 = new com.google.android.gms.wearable.internal.zzau;	 Catch:{ RemoteException -> 0x006d }
        r6.<init>(r1);	 Catch:{ RemoteException -> 0x006d }
        r2.zza(r4, r6);	 Catch:{ RemoteException -> 0x006d }
        r2 = "WearableClient";
        r6 = 2;
        r2 = android.util.Log.isLoggable(r2, r6);	 Catch:{ RemoteException -> 0x006d }
        if (r2 == 0) goto L_0x0012;
    L_0x0046:
        r2 = "WearableClient";
        r6 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x006d }
        r6.<init>();	 Catch:{ RemoteException -> 0x006d }
        r7 = "disconnect: removed: ";
        r6 = r6.append(r7);	 Catch:{ RemoteException -> 0x006d }
        r7 = r0.getKey();	 Catch:{ RemoteException -> 0x006d }
        r6 = r6.append(r7);	 Catch:{ RemoteException -> 0x006d }
        r7 = "/";
        r6 = r6.append(r7);	 Catch:{ RemoteException -> 0x006d }
        r6 = r6.append(r1);	 Catch:{ RemoteException -> 0x006d }
        r6 = r6.toString();	 Catch:{ RemoteException -> 0x006d }
        android.util.Log.d(r2, r6);	 Catch:{ RemoteException -> 0x006d }
        goto L_0x0012;
    L_0x006d:
        r2 = move-exception;
        r2 = "WearableClient";
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0096 }
        r6.<init>();	 Catch:{ all -> 0x0096 }
        r7 = "disconnect: Didn't remove: ";
        r6 = r6.append(r7);	 Catch:{ all -> 0x0096 }
        r0 = r0.getKey();	 Catch:{ all -> 0x0096 }
        r0 = r6.append(r0);	 Catch:{ all -> 0x0096 }
        r6 = "/";
        r0 = r0.append(r6);	 Catch:{ all -> 0x0096 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0096 }
        r0 = r0.toString();	 Catch:{ all -> 0x0096 }
        android.util.Log.w(r2, r0);	 Catch:{ all -> 0x0096 }
        goto L_0x0012;
    L_0x0096:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0096 }
        throw r0;
    L_0x0099:
        r0 = r8.zzaGo;	 Catch:{ all -> 0x0096 }
        r0.clear();	 Catch:{ all -> 0x0096 }
        monitor-exit(r3);	 Catch:{ all -> 0x0096 }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzaj.zzb(com.google.android.gms.wearable.internal.zzbd):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzcS(android.os.IBinder r10) {
        /*
        r9 = this;
        r2 = r9.zzaGo;
        monitor-enter(r2);
        r3 = com.google.android.gms.wearable.internal.zzai.zza.zzcR(r10);	 Catch:{ all -> 0x0088 }
        r4 = new com.google.android.gms.wearable.internal.zzbc$zzh;	 Catch:{ all -> 0x0088 }
        r4.<init>();	 Catch:{ all -> 0x0088 }
        r0 = r9.zzaGo;	 Catch:{ all -> 0x0088 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0088 }
        r5 = r0.iterator();	 Catch:{ all -> 0x0088 }
    L_0x0016:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0088 }
        if (r0 == 0) goto L_0x008b;
    L_0x001c:
        r0 = r5.next();	 Catch:{ all -> 0x0088 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0088 }
        r1 = r0.getValue();	 Catch:{ all -> 0x0088 }
        r1 = (com.google.android.gms.wearable.internal.zzbe) r1;	 Catch:{ all -> 0x0088 }
        r6 = new com.google.android.gms.wearable.internal.zzb;	 Catch:{ RemoteException -> 0x0060 }
        r6.<init>(r1);	 Catch:{ RemoteException -> 0x0060 }
        r3.zza(r4, r6);	 Catch:{ RemoteException -> 0x0060 }
        r6 = "WearableClient";
        r7 = 2;
        r6 = android.util.Log.isLoggable(r6, r7);	 Catch:{ RemoteException -> 0x0060 }
        if (r6 == 0) goto L_0x0016;
    L_0x0039:
        r6 = "WearableClient";
        r7 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x0060 }
        r7.<init>();	 Catch:{ RemoteException -> 0x0060 }
        r8 = "onPostInitHandler: added: ";
        r7 = r7.append(r8);	 Catch:{ RemoteException -> 0x0060 }
        r8 = r0.getKey();	 Catch:{ RemoteException -> 0x0060 }
        r7 = r7.append(r8);	 Catch:{ RemoteException -> 0x0060 }
        r8 = "/";
        r7 = r7.append(r8);	 Catch:{ RemoteException -> 0x0060 }
        r7 = r7.append(r1);	 Catch:{ RemoteException -> 0x0060 }
        r7 = r7.toString();	 Catch:{ RemoteException -> 0x0060 }
        android.util.Log.d(r6, r7);	 Catch:{ RemoteException -> 0x0060 }
        goto L_0x0016;
    L_0x0060:
        r6 = move-exception;
        r6 = "WearableClient";
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0088 }
        r7.<init>();	 Catch:{ all -> 0x0088 }
        r8 = "onPostInitHandler: Didn't add: ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x0088 }
        r0 = r0.getKey();	 Catch:{ all -> 0x0088 }
        r0 = r7.append(r0);	 Catch:{ all -> 0x0088 }
        r7 = "/";
        r0 = r0.append(r7);	 Catch:{ all -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0088 }
        r0 = r0.toString();	 Catch:{ all -> 0x0088 }
        android.util.Log.d(r6, r0);	 Catch:{ all -> 0x0088 }
        goto L_0x0016;
    L_0x0088:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0088 }
        throw r0;
    L_0x008b:
        monitor-exit(r2);	 Catch:{ all -> 0x0088 }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzaj.zzcS(android.os.IBinder):void");
    }
}
