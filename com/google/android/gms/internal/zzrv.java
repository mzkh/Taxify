package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public interface zzrv extends IInterface {

    public static abstract class zza extends Binder implements zzrv {

        private static class zza implements zzrv {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(zzsa com_google_android_gms_internal_zzsa) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (com_google_android_gms_internal_zzsa != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzsa.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzsc com_google_android_gms_internal_zzsc) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (com_google_android_gms_internal_zzsc != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzsc.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzse com_google_android_gms_internal_zzse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (com_google_android_gms_internal_zzse != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzsg com_google_android_gms_internal_zzsg) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (com_google_android_gms_internal_zzsg != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzsg.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static zzrv zzcl(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzrv)) ? new zza(iBinder) : (zzrv) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            zzsg com_google_android_gms_internal_zzsg = null;
            switch (code) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    zzsa com_google_android_gms_internal_zzsa;
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzsa = (zzsa) zzsa.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_internal_zzsa);
                    return true;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    zzse com_google_android_gms_internal_zzse;
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzse = (zzse) zzse.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_internal_zzse);
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    zzsc com_google_android_gms_internal_zzsc;
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzsc = (zzsc) zzsc.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_internal_zzsc);
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzsg = (zzsg) zzsg.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_internal_zzsg);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(zzsa com_google_android_gms_internal_zzsa) throws RemoteException;

    void zza(zzsc com_google_android_gms_internal_zzsc) throws RemoteException;

    void zza(zzse com_google_android_gms_internal_zzse) throws RemoteException;

    void zza(zzsg com_google_android_gms_internal_zzsg) throws RemoteException;
}
