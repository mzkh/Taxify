package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.location.places.Place;

public interface zzds extends IInterface {

    public static abstract class zza extends Binder implements zzds {

        private static class zza implements zzds {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void destroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zzle.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzd getView() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zzle.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    zzd zzau = com.google.android.gms.dynamic.zzd.zza.zzau(obtain2.readStrongBinder());
                    return zzau;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zzle.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void resume() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zzle.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showInterstitial() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zzle.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzd com_google_android_gms_dynamic_zzd, zzax com_google_android_gms_internal_zzax, String str, zzdt com_google_android_gms_internal_zzdt) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    if (com_google_android_gms_internal_zzax != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzax.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (com_google_android_gms_internal_zzdt != null) {
                        iBinder = com_google_android_gms_internal_zzdt.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.zzle.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzd com_google_android_gms_dynamic_zzd, zzax com_google_android_gms_internal_zzax, String str, String str2, zzdt com_google_android_gms_internal_zzdt) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    if (com_google_android_gms_internal_zzax != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzax.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (com_google_android_gms_internal_zzdt != null) {
                        iBinder = com_google_android_gms_internal_zzdt.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.zzle.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzd com_google_android_gms_dynamic_zzd, zzba com_google_android_gms_internal_zzba, zzax com_google_android_gms_internal_zzax, String str, zzdt com_google_android_gms_internal_zzdt) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    if (com_google_android_gms_internal_zzba != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzba.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_internal_zzax != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzax.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (com_google_android_gms_internal_zzdt != null) {
                        iBinder = com_google_android_gms_internal_zzdt.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.zzle.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzd com_google_android_gms_dynamic_zzd, zzba com_google_android_gms_internal_zzba, zzax com_google_android_gms_internal_zzax, String str, String str2, zzdt com_google_android_gms_internal_zzdt) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    if (com_google_android_gms_internal_zzba != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzba.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_internal_zzax != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzax.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (com_google_android_gms_internal_zzdt != null) {
                        iBinder = com_google_android_gms_internal_zzdt.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.zzle.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }

        public static zzds zzs(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzds)) ? new zza(iBinder) : (zzds) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            zzax com_google_android_gms_internal_zzax = null;
            zzd view;
            switch (code) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    zza(com.google.android.gms.dynamic.zzd.zza.zzau(data.readStrongBinder()), data.readInt() != 0 ? zzba.CREATOR.zzc(data) : null, data.readInt() != 0 ? zzax.CREATOR.zzb(data) : null, data.readString(), com.google.android.gms.internal.zzdt.zza.zzt(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    IBinder asBinder;
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    view = getView();
                    reply.writeNoException();
                    if (view != null) {
                        asBinder = view.asBinder();
                    }
                    reply.writeStrongBinder(asBinder);
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    view = com.google.android.gms.dynamic.zzd.zza.zzau(data.readStrongBinder());
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzax = zzax.CREATOR.zzb(data);
                    }
                    zza(view, com_google_android_gms_internal_zzax, data.readString(), com.google.android.gms.internal.zzdt.zza.zzt(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    showInterstitial();
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    destroy();
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ATM /*6*/:
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    zza(com.google.android.gms.dynamic.zzd.zza.zzau(data.readStrongBinder()), data.readInt() != 0 ? zzba.CREATOR.zzc(data) : null, data.readInt() != 0 ? zzax.CREATOR.zzb(data) : null, data.readString(), data.readString(), com.google.android.gms.internal.zzdt.zza.zzt(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAKERY /*7*/:
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    zza(com.google.android.gms.dynamic.zzd.zza.zzau(data.readStrongBinder()), data.readInt() != 0 ? zzax.CREATOR.zzb(data) : null, data.readString(), data.readString(), com.google.android.gms.internal.zzdt.zza.zzt(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BANK /*8*/:
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    pause();
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAR /*9*/:
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    resume();
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void destroy() throws RemoteException;

    zzd getView() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void showInterstitial() throws RemoteException;

    void zza(zzd com_google_android_gms_dynamic_zzd, zzax com_google_android_gms_internal_zzax, String str, zzdt com_google_android_gms_internal_zzdt) throws RemoteException;

    void zza(zzd com_google_android_gms_dynamic_zzd, zzax com_google_android_gms_internal_zzax, String str, String str2, zzdt com_google_android_gms_internal_zzdt) throws RemoteException;

    void zza(zzd com_google_android_gms_dynamic_zzd, zzba com_google_android_gms_internal_zzba, zzax com_google_android_gms_internal_zzax, String str, zzdt com_google_android_gms_internal_zzdt) throws RemoteException;

    void zza(zzd com_google_android_gms_dynamic_zzd, zzba com_google_android_gms_internal_zzba, zzax com_google_android_gms_internal_zzax, String str, String str2, zzdt com_google_android_gms_internal_zzdt) throws RemoteException;
}
