package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.zzl;
import com.google.android.gms.fitness.request.zzp;
import com.google.android.gms.location.places.Place;

public interface zznk extends IInterface {

    public static abstract class zza extends Binder implements zznk {

        private static class zza implements zznk {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(DataTypeCreateRequest dataTypeCreateRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (dataTypeCreateRequest != null) {
                        obtain.writeInt(1);
                        dataTypeCreateRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzl com_google_android_gms_fitness_request_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (com_google_android_gms_fitness_request_zzl != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zzl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzp com_google_android_gms_fitness_request_zzp) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (com_google_android_gms_fitness_request_zzp != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zzp.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(22, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static zznk zzaH(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zznk)) ? new zza(iBinder) : (zznk) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            zzp com_google_android_gms_fitness_request_zzp = null;
            switch (code) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    DataTypeCreateRequest dataTypeCreateRequest;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (data.readInt() != 0) {
                        dataTypeCreateRequest = (DataTypeCreateRequest) DataTypeCreateRequest.CREATOR.createFromParcel(data);
                    }
                    zza(dataTypeCreateRequest);
                    return true;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    zzl com_google_android_gms_fitness_request_zzl;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zzl = (zzl) zzl.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zzl);
                    return true;
                case Place.TYPE_CEMETERY /*22*/:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zzp = (zzp) zzp.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zzp);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(DataTypeCreateRequest dataTypeCreateRequest) throws RemoteException;

    void zza(zzl com_google_android_gms_fitness_request_zzl) throws RemoteException;

    void zza(zzp com_google_android_gms_fitness_request_zzp) throws RemoteException;
}
