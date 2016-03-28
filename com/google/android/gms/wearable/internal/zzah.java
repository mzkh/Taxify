package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public interface zzah extends IInterface {

    public static abstract class zza extends Binder implements zzah {

        private static class zza implements zzah {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(zzal com_google_android_gms_wearable_internal_zzal) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (com_google_android_gms_wearable_internal_zzal != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzal.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzao com_google_android_gms_wearable_internal_zzao) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (com_google_android_gms_wearable_internal_zzao != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzao.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zze com_google_android_gms_wearable_internal_zze) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (com_google_android_gms_wearable_internal_zze != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zze.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zzab(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zzb(zzao com_google_android_gms_wearable_internal_zzao) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (com_google_android_gms_wearable_internal_zzao != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzao.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }

        public static zzah zzcQ(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzah)) ? new zza(iBinder) : (zzah) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            zze com_google_android_gms_wearable_internal_zze = null;
            zzao com_google_android_gms_wearable_internal_zzao;
            switch (code) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    DataHolder zzA;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (data.readInt() != 0) {
                        zzA = DataHolder.CREATOR.zzA(data);
                    }
                    zzab(zzA);
                    return true;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    zzal com_google_android_gms_wearable_internal_zzal;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzal = (zzal) zzal.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzal);
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzao = (zzao) zzao.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzao);
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzao = (zzao) zzao.CREATOR.createFromParcel(data);
                    }
                    zzb(com_google_android_gms_wearable_internal_zzao);
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zze = (zze) zze.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zze);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(zzal com_google_android_gms_wearable_internal_zzal) throws RemoteException;

    void zza(zzao com_google_android_gms_wearable_internal_zzao) throws RemoteException;

    void zza(zze com_google_android_gms_wearable_internal_zze) throws RemoteException;

    void zzab(DataHolder dataHolder) throws RemoteException;

    void zzb(zzao com_google_android_gms_wearable_internal_zzao) throws RemoteException;
}
