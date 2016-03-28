package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.zze;

public interface zzai extends IInterface {

    public static abstract class zza extends Binder implements zzai {

        private static class zza implements zzai {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    obtain.writeInt(i);
                    this.zzle.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, Asset asset) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (asset != null) {
                        obtain.writeInt(1);
                        asset.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, PutDataRequest putDataRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (putDataRequest != null) {
                        obtain.writeInt(1);
                        putDataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, zzau com_google_android_gms_wearable_internal_zzau) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (com_google_android_gms_wearable_internal_zzau != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzau.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, zzb com_google_android_gms_wearable_internal_zzb) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (com_google_android_gms_wearable_internal_zzb != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzb.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, zze com_google_android_gms_wearable_internal_zze) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (com_google_android_gms_wearable_internal_zze != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zze.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, zze com_google_android_gms_wearable_zze) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (com_google_android_gms_wearable_zze != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_zze.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    obtain.writeString(str);
                    this.zzle.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzag com_google_android_gms_wearable_internal_zzag, String str, String str2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    this.zzle.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzag com_google_android_gms_wearable_internal_zzag, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    obtain.writeInt(i);
                    this.zzle.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzag com_google_android_gms_wearable_internal_zzag, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzag com_google_android_gms_wearable_internal_zzag, zze com_google_android_gms_wearable_zze) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (com_google_android_gms_wearable_zze != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_zze.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzag com_google_android_gms_wearable_internal_zzag, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    obtain.writeString(str);
                    this.zzle.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzc(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzc(zzag com_google_android_gms_wearable_internal_zzag, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzc(zzag com_google_android_gms_wearable_internal_zzag, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    obtain.writeString(str);
                    this.zzle.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzd(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zze(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzf(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzg(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzh(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzi(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzj(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzk(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzl(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzag != null ? com_google_android_gms_wearable_internal_zzag.asBinder() : null);
                    this.zzle.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzai zzcR(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzai)) ? new zza(iBinder) : (zzai) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            zze com_google_android_gms_wearable_zze = null;
            zzag zzcP;
            Uri uri;
            switch (code) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_zze = (zze) zze.CREATOR.createFromParcel(data);
                    }
                    zzb(zzcP, com_google_android_gms_wearable_zze);
                    reply.writeNoException();
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzj(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzk(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzl(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ATM /*6*/:
                    PutDataRequest putDataRequest;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        putDataRequest = (PutDataRequest) PutDataRequest.CREATOR.createFromParcel(data);
                    }
                    zza(zzcP, putDataRequest);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAKERY /*7*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(data);
                    }
                    zza(zzcP, uri);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BANK /*8*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzb(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAR /*9*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(data);
                    }
                    zzb(zzcP, uri);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(data);
                    }
                    zzc(zzcP, uri);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BOOK_STORE /*12*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zza(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()), data.readString(), data.readString(), data.createByteArray());
                    reply.writeNoException();
                    return true;
                case ConnectionsStatusCodes.STATUS_ERROR /*13*/:
                    Asset asset;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        asset = (Asset) Asset.CREATOR.createFromParcel(data);
                    }
                    zza(zzcP, asset);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BUS_STATION /*14*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzc(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAFE /*15*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzd(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAMPGROUND /*16*/:
                    zzb com_google_android_gms_wearable_internal_zzb;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzb = (zzb) zzb.CREATOR.createFromParcel(data);
                    }
                    zza(zzcP, com_google_android_gms_wearable_internal_zzb);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAR_DEALER /*17*/:
                    zzau com_google_android_gms_wearable_internal_zzau;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzau = (zzau) zzau.CREATOR.createFromParcel(data);
                    }
                    zza(zzcP, com_google_android_gms_wearable_internal_zzau);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAR_RENTAL /*18*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zze(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAR_REPAIR /*19*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzf(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAR_WASH /*20*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_zze = (zze) zze.CREATOR.createFromParcel(data);
                    }
                    zza(zzcP, com_google_android_gms_wearable_zze);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CASINO /*21*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zza(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CEMETERY /*22*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zza(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CHURCH /*23*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzb(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CITY_HALL /*24*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzc(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CLOTHING_STORE /*25*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzg(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CONVENIENCE_STORE /*26*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzh(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_COURTHOUSE /*27*/:
                    zze com_google_android_gms_wearable_internal_zze;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzcP = com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zze = (zze) zze.CREATOR.createFromParcel(data);
                    }
                    zza(zzcP, com_google_android_gms_wearable_internal_zze);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_DENTIST /*28*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zza(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                case Place.TYPE_DEPARTMENT_STORE /*29*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzb(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                case Place.TYPE_DOCTOR /*30*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzi(com.google.android.gms.wearable.internal.zzag.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.wearable.internal.IWearableService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, int i) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, Uri uri) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, Asset asset) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, PutDataRequest putDataRequest) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, zzau com_google_android_gms_wearable_internal_zzau) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, zzb com_google_android_gms_wearable_internal_zzb) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, zze com_google_android_gms_wearable_internal_zze) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, zze com_google_android_gms_wearable_zze) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, String str) throws RemoteException;

    void zza(zzag com_google_android_gms_wearable_internal_zzag, String str, String str2, byte[] bArr) throws RemoteException;

    void zzb(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zzb(zzag com_google_android_gms_wearable_internal_zzag, int i) throws RemoteException;

    void zzb(zzag com_google_android_gms_wearable_internal_zzag, Uri uri) throws RemoteException;

    void zzb(zzag com_google_android_gms_wearable_internal_zzag, zze com_google_android_gms_wearable_zze) throws RemoteException;

    void zzb(zzag com_google_android_gms_wearable_internal_zzag, String str) throws RemoteException;

    void zzc(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zzc(zzag com_google_android_gms_wearable_internal_zzag, Uri uri) throws RemoteException;

    void zzc(zzag com_google_android_gms_wearable_internal_zzag, String str) throws RemoteException;

    void zzd(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zze(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zzf(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zzg(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zzh(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zzi(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zzj(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zzk(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;

    void zzl(zzag com_google_android_gms_wearable_internal_zzag) throws RemoteException;
}
