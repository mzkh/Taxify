package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.zzc;
import com.google.android.gms.location.places.zzf;

public interface zzpt extends IInterface {

    public static abstract class zza extends Binder implements zzpt {

        private static class zza implements zzpt {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(zzqh com_google_android_gms_internal_zzqh, PendingIntent pendingIntent, zzpv com_google_android_gms_internal_zzpv) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (com_google_android_gms_internal_zzqh != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzqh.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzpv != null ? com_google_android_gms_internal_zzpv.asBinder() : null);
                    this.zzle.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(PlaceFilter placeFilter, zzqh com_google_android_gms_internal_zzqh, zzpv com_google_android_gms_internal_zzpv) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (placeFilter != null) {
                        obtain.writeInt(1);
                        placeFilter.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_internal_zzqh != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzqh.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzpv != null ? com_google_android_gms_internal_zzpv.asBinder() : null);
                    this.zzle.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(PlaceReport placeReport, zzqh com_google_android_gms_internal_zzqh, zzpv com_google_android_gms_internal_zzpv) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (placeReport != null) {
                        obtain.writeInt(1);
                        placeReport.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_internal_zzqh != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzqh.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzpv != null ? com_google_android_gms_internal_zzpv.asBinder() : null);
                    this.zzle.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzc com_google_android_gms_location_places_zzc, zzqh com_google_android_gms_internal_zzqh, PendingIntent pendingIntent, zzpv com_google_android_gms_internal_zzpv) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (com_google_android_gms_location_places_zzc != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_zzc.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_internal_zzqh != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzqh.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzpv != null ? com_google_android_gms_internal_zzpv.asBinder() : null);
                    this.zzle.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzf com_google_android_gms_location_places_zzf, zzqh com_google_android_gms_internal_zzqh, PendingIntent pendingIntent, zzpv com_google_android_gms_internal_zzpv) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (com_google_android_gms_location_places_zzf != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_zzf.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_internal_zzqh != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzqh.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzpv != null ? com_google_android_gms_internal_zzpv.asBinder() : null);
                    this.zzle.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzqh com_google_android_gms_internal_zzqh, PendingIntent pendingIntent, zzpv com_google_android_gms_internal_zzpv) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (com_google_android_gms_internal_zzqh != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzqh.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzpv != null ? com_google_android_gms_internal_zzpv.asBinder() : null);
                    this.zzle.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzpt zzbn(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzpt)) ? new zza(iBinder) : (zzpt) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            zzqh com_google_android_gms_internal_zzqh = null;
            switch (code) {
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zza(data.readInt() != 0 ? zzf.CREATOR.zzdC(data) : null, data.readInt() != 0 ? zzqh.CREATOR.zzdI(data) : null, data.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(data) : null, com.google.android.gms.internal.zzpv.zza.zzbp(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zza(data.readInt() != 0 ? zzqh.CREATOR.zzdI(data) : null, data.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(data) : null, com.google.android.gms.internal.zzpv.zza.zzbp(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zza(data.readInt() != 0 ? zzc.CREATOR.zzdA(data) : null, data.readInt() != 0 ? zzqh.CREATOR.zzdI(data) : null, data.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(data) : null, com.google.android.gms.internal.zzpv.zza.zzbp(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zzb(data.readInt() != 0 ? zzqh.CREATOR.zzdI(data) : null, data.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(data) : null, com.google.android.gms.internal.zzpv.zza.zzbp(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ATM /*6*/:
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    PlaceFilter zzdB = data.readInt() != 0 ? PlaceFilter.CREATOR.zzdB(data) : null;
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzqh = zzqh.CREATOR.zzdI(data);
                    }
                    zza(zzdB, com_google_android_gms_internal_zzqh, com.google.android.gms.internal.zzpv.zza.zzbp(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAKERY /*7*/:
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    PlaceReport createFromParcel = data.readInt() != 0 ? PlaceReport.CREATOR.createFromParcel(data) : null;
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzqh = zzqh.CREATOR.zzdI(data);
                    }
                    zza(createFromParcel, com_google_android_gms_internal_zzqh, com.google.android.gms.internal.zzpv.zza.zzbp(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(zzqh com_google_android_gms_internal_zzqh, PendingIntent pendingIntent, zzpv com_google_android_gms_internal_zzpv) throws RemoteException;

    void zza(PlaceFilter placeFilter, zzqh com_google_android_gms_internal_zzqh, zzpv com_google_android_gms_internal_zzpv) throws RemoteException;

    void zza(PlaceReport placeReport, zzqh com_google_android_gms_internal_zzqh, zzpv com_google_android_gms_internal_zzpv) throws RemoteException;

    void zza(zzc com_google_android_gms_location_places_zzc, zzqh com_google_android_gms_internal_zzqh, PendingIntent pendingIntent, zzpv com_google_android_gms_internal_zzpv) throws RemoteException;

    void zza(zzf com_google_android_gms_location_places_zzf, zzqh com_google_android_gms_internal_zzqh, PendingIntent pendingIntent, zzpv com_google_android_gms_internal_zzpv) throws RemoteException;

    void zzb(zzqh com_google_android_gms_internal_zzqh, PendingIntent pendingIntent, zzpv com_google_android_gms_internal_zzpv) throws RemoteException;
}
