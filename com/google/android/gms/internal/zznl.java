package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.zzaa;
import com.google.android.gms.fitness.request.zze;
import com.google.android.gms.fitness.request.zzr;
import com.google.android.gms.fitness.request.zzy;
import com.google.android.gms.location.places.Place;

public interface zznl extends IInterface {

    public static abstract class zza extends Binder implements zznl {

        private static class zza implements zznl {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(DataDeleteRequest dataDeleteRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataDeleteRequest != null) {
                        obtain.writeInt(1);
                        dataDeleteRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(DataReadRequest dataReadRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataReadRequest != null) {
                        obtain.writeInt(1);
                        dataReadRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzaa com_google_android_gms_fitness_request_zzaa) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (com_google_android_gms_fitness_request_zzaa != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zzaa.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zze com_google_android_gms_fitness_request_zze) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (com_google_android_gms_fitness_request_zze != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zze.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzr com_google_android_gms_fitness_request_zzr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (com_google_android_gms_fitness_request_zzr != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zzr.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzy com_google_android_gms_fitness_request_zzy) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (com_google_android_gms_fitness_request_zzy != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zzy.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static zznl zzaI(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zznl)) ? new zza(iBinder) : (zznl) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            zzy com_google_android_gms_fitness_request_zzy = null;
            switch (code) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    DataReadRequest dataReadRequest;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        dataReadRequest = (DataReadRequest) DataReadRequest.CREATOR.createFromParcel(data);
                    }
                    zza(dataReadRequest);
                    return true;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    zze com_google_android_gms_fitness_request_zze;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zze = (zze) zze.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zze);
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    DataDeleteRequest dataDeleteRequest;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        dataDeleteRequest = (DataDeleteRequest) DataDeleteRequest.CREATOR.createFromParcel(data);
                    }
                    zza(dataDeleteRequest);
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    zzr com_google_android_gms_fitness_request_zzr;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zzr = (zzr) zzr.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zzr);
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    zzaa com_google_android_gms_fitness_request_zzaa;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zzaa = (zzaa) zzaa.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zzaa);
                    return true;
                case Place.TYPE_ATM /*6*/:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zzy = (zzy) zzy.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zzy);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(DataDeleteRequest dataDeleteRequest) throws RemoteException;

    void zza(DataReadRequest dataReadRequest) throws RemoteException;

    void zza(zzaa com_google_android_gms_fitness_request_zzaa) throws RemoteException;

    void zza(zze com_google_android_gms_fitness_request_zze) throws RemoteException;

    void zza(zzr com_google_android_gms_fitness_request_zzr) throws RemoteException;

    void zza(zzy com_google_android_gms_fitness_request_zzy) throws RemoteException;
}
