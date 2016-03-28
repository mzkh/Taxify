package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

public interface zzag extends IInterface {

    public static abstract class zza extends Binder implements zzag {

        private static class zza implements zzag {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
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

            public void zza(zzaa com_google_android_gms_wearable_internal_zzaa) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzaa != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzaa.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzac com_google_android_gms_wearable_internal_zzac) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzac != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzac.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzae com_google_android_gms_wearable_internal_zzae) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzae != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzae.writeToParcel(obtain, 0);
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

            public void zza(zzas com_google_android_gms_wearable_internal_zzas) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzas != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzas.writeToParcel(obtain, 0);
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

            public void zza(zzaw com_google_android_gms_wearable_internal_zzaw) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzaw != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzaw.writeToParcel(obtain, 0);
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

            public void zza(zzaz com_google_android_gms_wearable_internal_zzaz) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzaz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzaz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzs com_google_android_gms_wearable_internal_zzs) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzs != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzs.writeToParcel(obtain, 0);
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

            public void zza(zzu com_google_android_gms_wearable_internal_zzu) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzu != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzu.writeToParcel(obtain, 0);
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

            public void zza(zzw com_google_android_gms_wearable_internal_zzw) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzw != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzw.writeToParcel(obtain, 0);
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

            public void zza(zzy com_google_android_gms_wearable_internal_zzy) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (com_google_android_gms_wearable_internal_zzy != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_wearable_internal_zzy.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzac(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }

        public static zzag zzcP(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzag)) ? new zza(iBinder) : (zzag) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            zzaz com_google_android_gms_wearable_internal_zzaz = null;
            switch (code) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    zzu com_google_android_gms_wearable_internal_zzu;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzu = (zzu) zzu.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzu);
                    reply.writeNoException();
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    zzas com_google_android_gms_wearable_internal_zzas;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzas = (zzas) zzas.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzas);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    zzaa com_google_android_gms_wearable_internal_zzaa;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzaa = (zzaa) zzaa.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzaa);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    DataHolder zzA;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        zzA = DataHolder.CREATOR.zzA(data);
                    }
                    zzac(zzA);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ATM /*6*/:
                    zzs com_google_android_gms_wearable_internal_zzs;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzs = (zzs) zzs.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzs);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAKERY /*7*/:
                    zzaw com_google_android_gms_wearable_internal_zzaw;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzaw = (zzaw) zzaw.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzaw);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BANK /*8*/:
                    zzac com_google_android_gms_wearable_internal_zzac;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzac = (zzac) zzac.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzac);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAR /*9*/:
                    zzae com_google_android_gms_wearable_internal_zzae;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzae = (zzae) zzae.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzae);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    zzy com_google_android_gms_wearable_internal_zzy;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzy = (zzy) zzy.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzy);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    Status createFromParcel;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        createFromParcel = Status.CREATOR.createFromParcel(data);
                    }
                    zza(createFromParcel);
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BOOK_STORE /*12*/:
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzaz = (zzaz) zzaz.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzaz);
                    reply.writeNoException();
                    return true;
                case ConnectionsStatusCodes.STATUS_ERROR /*13*/:
                    zzw com_google_android_gms_wearable_internal_zzw;
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (data.readInt() != 0) {
                        com_google_android_gms_wearable_internal_zzw = (zzw) zzw.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_wearable_internal_zzw);
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(Status status) throws RemoteException;

    void zza(zzaa com_google_android_gms_wearable_internal_zzaa) throws RemoteException;

    void zza(zzac com_google_android_gms_wearable_internal_zzac) throws RemoteException;

    void zza(zzae com_google_android_gms_wearable_internal_zzae) throws RemoteException;

    void zza(zzas com_google_android_gms_wearable_internal_zzas) throws RemoteException;

    void zza(zzaw com_google_android_gms_wearable_internal_zzaw) throws RemoteException;

    void zza(zzaz com_google_android_gms_wearable_internal_zzaz) throws RemoteException;

    void zza(zzs com_google_android_gms_wearable_internal_zzs) throws RemoteException;

    void zza(zzu com_google_android_gms_wearable_internal_zzu) throws RemoteException;

    void zza(zzw com_google_android_gms_wearable_internal_zzw) throws RemoteException;

    void zza(zzy com_google_android_gms_wearable_internal_zzy) throws RemoteException;

    void zzac(DataHolder dataHolder) throws RemoteException;
}
