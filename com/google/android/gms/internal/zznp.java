package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.zzai;
import com.google.android.gms.fitness.request.zzak;
import com.google.android.gms.fitness.request.zzam;
import com.google.android.gms.fitness.request.zzao;
import com.google.android.gms.location.places.Place;

public interface zznp extends IInterface {

    public static abstract class zza extends Binder implements zznp {

        private static class zza implements zznp {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(SessionInsertRequest sessionInsertRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (sessionInsertRequest != null) {
                        obtain.writeInt(1);
                        sessionInsertRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(SessionReadRequest sessionReadRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (sessionReadRequest != null) {
                        obtain.writeInt(1);
                        sessionReadRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzai com_google_android_gms_fitness_request_zzai) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (com_google_android_gms_fitness_request_zzai != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zzai.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzak com_google_android_gms_fitness_request_zzak) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (com_google_android_gms_fitness_request_zzak != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zzak.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzam com_google_android_gms_fitness_request_zzam) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (com_google_android_gms_fitness_request_zzam != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zzam.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zza(zzao com_google_android_gms_fitness_request_zzao) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (com_google_android_gms_fitness_request_zzao != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_fitness_request_zzao.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzle.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static zznp zzaM(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zznp)) ? new zza(iBinder) : (zznp) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            zzao com_google_android_gms_fitness_request_zzao = null;
            switch (code) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    zzak com_google_android_gms_fitness_request_zzak;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zzak = (zzak) zzak.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zzak);
                    return true;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    zzam com_google_android_gms_fitness_request_zzam;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zzam = (zzam) zzam.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zzam);
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    SessionInsertRequest sessionInsertRequest;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (data.readInt() != 0) {
                        sessionInsertRequest = (SessionInsertRequest) SessionInsertRequest.CREATOR.createFromParcel(data);
                    }
                    zza(sessionInsertRequest);
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    SessionReadRequest sessionReadRequest;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (data.readInt() != 0) {
                        sessionReadRequest = (SessionReadRequest) SessionReadRequest.CREATOR.createFromParcel(data);
                    }
                    zza(sessionReadRequest);
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    zzai com_google_android_gms_fitness_request_zzai;
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zzai = (zzai) zzai.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zzai);
                    return true;
                case Place.TYPE_ATM /*6*/:
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (data.readInt() != 0) {
                        com_google_android_gms_fitness_request_zzao = (zzao) zzao.CREATOR.createFromParcel(data);
                    }
                    zza(com_google_android_gms_fitness_request_zzao);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(SessionInsertRequest sessionInsertRequest) throws RemoteException;

    void zza(SessionReadRequest sessionReadRequest) throws RemoteException;

    void zza(zzai com_google_android_gms_fitness_request_zzai) throws RemoteException;

    void zza(zzak com_google_android_gms_fitness_request_zzak) throws RemoteException;

    void zza(zzam com_google_android_gms_fitness_request_zzam) throws RemoteException;

    void zza(zzao com_google_android_gms_fitness_request_zzao) throws RemoteException;
}
