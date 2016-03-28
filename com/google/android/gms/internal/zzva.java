package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public interface zzva extends IInterface {

    public static abstract class zza extends Binder implements zzva {

        private static class zza implements zzva {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(int i, Account account, zzuz com_google_android_gms_internal_zzuz) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(i);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzuz != null ? com_google_android_gms_internal_zzuz.asBinder() : null);
                    this.zzle.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzc com_google_android_gms_common_internal_zzc, zzuz com_google_android_gms_internal_zzuz) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (com_google_android_gms_common_internal_zzc != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_common_internal_zzc.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzuz != null ? com_google_android_gms_internal_zzuz.asBinder() : null);
                    this.zzle.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzq com_google_android_gms_common_internal_zzq, int i, boolean z) throws RemoteException {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeStrongBinder(com_google_android_gms_common_internal_zzq != null ? com_google_android_gms_common_internal_zzq.asBinder() : null);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.zzle.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzy com_google_android_gms_common_internal_zzy, zzt com_google_android_gms_common_internal_zzt) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (com_google_android_gms_common_internal_zzy != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_common_internal_zzy.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_common_internal_zzt != null ? com_google_android_gms_common_internal_zzt.asBinder() : null);
                    this.zzle.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzuw com_google_android_gms_internal_zzuw) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (com_google_android_gms_internal_zzuw != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzuw.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzaf(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.zzle.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzhb(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(i);
                    this.zzle.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzva zzcF(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzva)) ? new zza(iBinder) : (zzva) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            Account account = null;
            switch (code) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    zzc com_google_android_gms_common_internal_zzc;
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (data.readInt() != 0) {
                        com_google_android_gms_common_internal_zzc = (zzc) zzc.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_common_internal_zzc, com.google.android.gms.internal.zzuz.zza.zzcE(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    zzuw com_google_android_gms_internal_zzuw;
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzuw = (zzuw) zzuw.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_internal_zzuw);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    zzaf(data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    zzy com_google_android_gms_common_internal_zzy;
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (data.readInt() != 0) {
                        com_google_android_gms_common_internal_zzy = (zzy) zzy.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_common_internal_zzy, com.google.android.gms.common.internal.zzt.zza.zzV(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAKERY /*7*/:
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    zzhb(data.readInt());
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BANK /*8*/:
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    int readInt = data.readInt();
                    if (data.readInt() != 0) {
                        account = (Account) Account.CREATOR.createFromParcel(data);
                    }
                    zza(readInt, account, com.google.android.gms.internal.zzuz.zza.zzcE(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAR /*9*/:
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    zzq zzR = com.google.android.gms.common.internal.zzq.zza.zzR(data.readStrongBinder());
                    int readInt2 = data.readInt();
                    if (data.readInt() != 0) {
                        z = true;
                    }
                    zza(zzR, readInt2, z);
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.signin.internal.ISignInService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(int i, Account account, zzuz com_google_android_gms_internal_zzuz) throws RemoteException;

    void zza(zzc com_google_android_gms_common_internal_zzc, zzuz com_google_android_gms_internal_zzuz) throws RemoteException;

    void zza(zzq com_google_android_gms_common_internal_zzq, int i, boolean z) throws RemoteException;

    void zza(zzy com_google_android_gms_common_internal_zzy, zzt com_google_android_gms_common_internal_zzt) throws RemoteException;

    void zza(zzuw com_google_android_gms_internal_zzuw) throws RemoteException;

    void zzaf(boolean z) throws RemoteException;

    void zzhb(int i) throws RemoteException;
}
