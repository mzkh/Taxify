package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

public interface zzm extends IInterface {

    public static abstract class zza extends Binder implements zzm {

        private static class zza implements zzm {
            private IBinder zzle;

            zza(IBinder iBinder) {
                this.zzle = iBinder;
            }

            public IBinder asBinder() {
                return this.zzle;
            }

            public void zza(int i, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(BeginCompoundOperationRequest beginCompoundOperationRequest, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (beginCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        beginCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzo != null ? com_google_android_gms_drive_realtime_internal_zzo.asBinder() : null);
                    this.zzle.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(EndCompoundOperationRequest endCompoundOperationRequest, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (endCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        endCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(EndCompoundOperationRequest endCompoundOperationRequest, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (endCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        endCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzo != null ? com_google_android_gms_drive_realtime_internal_zzo.asBinder() : null);
                    this.zzle.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(ParcelableIndexReference parcelableIndexReference, zzn com_google_android_gms_drive_realtime_internal_zzn) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcelableIndexReference != null) {
                        obtain.writeInt(1);
                        parcelableIndexReference.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzn != null ? com_google_android_gms_drive_realtime_internal_zzn.asBinder() : null);
                    this.zzle.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzc com_google_android_gms_drive_realtime_internal_zzc) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzc != null ? com_google_android_gms_drive_realtime_internal_zzc.asBinder() : null);
                    this.zzle.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzd com_google_android_gms_drive_realtime_internal_zzd) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzd != null ? com_google_android_gms_drive_realtime_internal_zzd.asBinder() : null);
                    this.zzle.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zze com_google_android_gms_drive_realtime_internal_zze) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zze != null ? com_google_android_gms_drive_realtime_internal_zze.asBinder() : null);
                    this.zzle.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzh com_google_android_gms_drive_realtime_internal_zzh) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzh != null ? com_google_android_gms_drive_realtime_internal_zzh.asBinder() : null);
                    this.zzle.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzi com_google_android_gms_drive_realtime_internal_zzi) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzi != null ? com_google_android_gms_drive_realtime_internal_zzi.asBinder() : null);
                    this.zzle.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzl != null ? com_google_android_gms_drive_realtime_internal_zzl.asBinder() : null);
                    this.zzle.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzo != null ? com_google_android_gms_drive_realtime_internal_zzo.asBinder() : null);
                    this.zzle.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, int i, int i2, zzg com_google_android_gms_drive_realtime_internal_zzg) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzg != null ? com_google_android_gms_drive_realtime_internal_zzg.asBinder() : null);
                    this.zzle.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, int i, int i2, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, int i, DataHolder dataHolder, zzg com_google_android_gms_drive_realtime_internal_zzg) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzg != null ? com_google_android_gms_drive_realtime_internal_zzg.asBinder() : null);
                    this.zzle.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, int i, DataHolder dataHolder, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, int i, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzo != null ? com_google_android_gms_drive_realtime_internal_zzo.asBinder() : null);
                    this.zzle.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, int i, String str2, int i2, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, int i, String str2, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, DataHolder dataHolder, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzf com_google_android_gms_drive_realtime_internal_zzf) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzf != null ? com_google_android_gms_drive_realtime_internal_zzf.asBinder() : null);
                    this.zzle.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzk com_google_android_gms_drive_realtime_internal_zzk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzk != null ? com_google_android_gms_drive_realtime_internal_zzk.asBinder() : null);
                    this.zzle.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzl != null ? com_google_android_gms_drive_realtime_internal_zzl.asBinder() : null);
                    this.zzle.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzn com_google_android_gms_drive_realtime_internal_zzn) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzn != null ? com_google_android_gms_drive_realtime_internal_zzn.asBinder() : null);
                    this.zzle.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzo != null ? com_google_android_gms_drive_realtime_internal_zzo.asBinder() : null);
                    this.zzle.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, String str2, DataHolder dataHolder, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, String str2, zzf com_google_android_gms_drive_realtime_internal_zzf) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzf != null ? com_google_android_gms_drive_realtime_internal_zzf.asBinder() : null);
                    this.zzle.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, String str2, zzg com_google_android_gms_drive_realtime_internal_zzg) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzg != null ? com_google_android_gms_drive_realtime_internal_zzg.asBinder() : null);
                    this.zzle.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, String str2, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzc com_google_android_gms_drive_realtime_internal_zzc) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzc != null ? com_google_android_gms_drive_realtime_internal_zzc.asBinder() : null);
                    this.zzle.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzj != null ? com_google_android_gms_drive_realtime_internal_zzj.asBinder() : null);
                    this.zzle.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzl != null ? com_google_android_gms_drive_realtime_internal_zzl.asBinder() : null);
                    this.zzle.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzo != null ? com_google_android_gms_drive_realtime_internal_zzo.asBinder() : null);
                    this.zzle.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(String str, zzf com_google_android_gms_drive_realtime_internal_zzf) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzf != null ? com_google_android_gms_drive_realtime_internal_zzf.asBinder() : null);
                    this.zzle.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(String str, zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzl != null ? com_google_android_gms_drive_realtime_internal_zzl.asBinder() : null);
                    this.zzle.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(String str, zzn com_google_android_gms_drive_realtime_internal_zzn) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzn != null ? com_google_android_gms_drive_realtime_internal_zzn.asBinder() : null);
                    this.zzle.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(String str, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzo != null ? com_google_android_gms_drive_realtime_internal_zzo.asBinder() : null);
                    this.zzle.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(String str, String str2, zzf com_google_android_gms_drive_realtime_internal_zzf) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzf != null ? com_google_android_gms_drive_realtime_internal_zzf.asBinder() : null);
                    this.zzle.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzc(zzc com_google_android_gms_drive_realtime_internal_zzc) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzc != null ? com_google_android_gms_drive_realtime_internal_zzc.asBinder() : null);
                    this.zzle.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzc(String str, zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzl != null ? com_google_android_gms_drive_realtime_internal_zzl.asBinder() : null);
                    this.zzle.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzd(zzc com_google_android_gms_drive_realtime_internal_zzc) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_realtime_internal_zzc != null ? com_google_android_gms_drive_realtime_internal_zzc.asBinder() : null);
                    this.zzle.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzm zzaq(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzm)) ? new zza(iBinder) : (zzm) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            EndCompoundOperationRequest endCompoundOperationRequest = null;
            String readString;
            DataHolder zzA;
            int readInt;
            switch (code) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), com.google.android.gms.drive.realtime.internal.zzn.zza.zzar(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(com.google.android.gms.drive.realtime.internal.zzc.zza.zzag(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(com.google.android.gms.drive.realtime.internal.zzo.zza.zzas(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), data.readString(), com.google.android.gms.drive.realtime.internal.zzf.zza.zzaj(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), com.google.android.gms.drive.realtime.internal.zzl.zza.zzap(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ATM /*6*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    readString = data.readString();
                    if (data.readInt() != 0) {
                        zzA = DataHolder.CREATOR.zzA(data);
                    }
                    zza(readString, zzA, com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAKERY /*7*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BANK /*8*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzb(data.readString(), com.google.android.gms.drive.realtime.internal.zzl.zza.zzap(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BAR /*9*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzb(data.readString(), com.google.android.gms.drive.realtime.internal.zzn.zza.zzar(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), data.readInt(), data.readString(), com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), data.readInt(), data.readInt(), com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BOOK_STORE /*12*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), data.readString(), com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case ConnectionsStatusCodes.STATUS_ERROR /*13*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzb(data.readString(), com.google.android.gms.drive.realtime.internal.zzf.zza.zzaj(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_BUS_STATION /*14*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzc(data.readString(), com.google.android.gms.drive.realtime.internal.zzl.zza.zzap(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAFE /*15*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    readString = data.readString();
                    readInt = data.readInt();
                    if (data.readInt() != 0) {
                        zzA = DataHolder.CREATOR.zzA(data);
                    }
                    zza(readString, readInt, zzA, com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAMPGROUND /*16*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    readString = data.readString();
                    readInt = data.readInt();
                    if (data.readInt() != 0) {
                        zzA = DataHolder.CREATOR.zzA(data);
                    }
                    zza(readString, readInt, zzA, com.google.android.gms.drive.realtime.internal.zzg.zza.zzak(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAR_DEALER /*17*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), data.readInt(), data.readInt(), com.google.android.gms.drive.realtime.internal.zzg.zza.zzak(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAR_RENTAL /*18*/:
                    BeginCompoundOperationRequest beginCompoundOperationRequest;
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (data.readInt() != 0) {
                        beginCompoundOperationRequest = (BeginCompoundOperationRequest) BeginCompoundOperationRequest.CREATOR.createFromParcel(data);
                    }
                    zza(beginCompoundOperationRequest, com.google.android.gms.drive.realtime.internal.zzo.zza.zzas(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAR_REPAIR /*19*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (data.readInt() != 0) {
                        endCompoundOperationRequest = (EndCompoundOperationRequest) EndCompoundOperationRequest.CREATOR.createFromParcel(data);
                    }
                    zza(endCompoundOperationRequest, com.google.android.gms.drive.realtime.internal.zzo.zza.zzas(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CAR_WASH /*20*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), com.google.android.gms.drive.realtime.internal.zzf.zza.zzaj(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CASINO /*21*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), data.readString(), com.google.android.gms.drive.realtime.internal.zzg.zza.zzak(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CEMETERY /*22*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CHURCH /*23*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzb(com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CITY_HALL /*24*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzc(com.google.android.gms.drive.realtime.internal.zzc.zza.zzag(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CLOTHING_STORE /*25*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzd(com.google.android.gms.drive.realtime.internal.zzc.zza.zzag(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_CONVENIENCE_STORE /*26*/:
                    ParcelableIndexReference parcelableIndexReference;
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (data.readInt() != 0) {
                        parcelableIndexReference = (ParcelableIndexReference) ParcelableIndexReference.CREATOR.createFromParcel(data);
                    }
                    zza(parcelableIndexReference, com.google.android.gms.drive.realtime.internal.zzn.zza.zzar(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_COURTHOUSE /*27*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), com.google.android.gms.drive.realtime.internal.zzk.zza.zzao(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_DENTIST /*28*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), data.readInt(), com.google.android.gms.drive.realtime.internal.zzo.zza.zzas(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_DEPARTMENT_STORE /*29*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzb(com.google.android.gms.drive.realtime.internal.zzl.zza.zzap(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_DOCTOR /*30*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readInt(), com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ELECTRICIAN /*31*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(com.google.android.gms.drive.realtime.internal.zze.zza.zzai(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ELECTRONICS_STORE /*32*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(com.google.android.gms.drive.realtime.internal.zzd.zza.zzah(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_EMBASSY /*33*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzb(com.google.android.gms.drive.realtime.internal.zzc.zza.zzag(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_ESTABLISHMENT /*34*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(com.google.android.gms.drive.realtime.internal.zzi.zza.zzam(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_FINANCE /*35*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzb(com.google.android.gms.drive.realtime.internal.zzo.zza.zzas(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_FIRE_STATION /*36*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(com.google.android.gms.drive.realtime.internal.zzh.zza.zzal(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_FLORIST /*37*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), data.readInt(), data.readString(), data.readInt(), com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_FOOD /*38*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(data.readString(), com.google.android.gms.drive.realtime.internal.zzo.zza.zzas(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_FUNERAL_HOME /*39*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzb(data.readString(), com.google.android.gms.drive.realtime.internal.zzo.zza.zzas(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_FURNITURE_STORE /*40*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zza(com.google.android.gms.drive.realtime.internal.zzl.zza.zzap(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_GAS_STATION /*41*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (data.readInt() != 0) {
                        endCompoundOperationRequest = (EndCompoundOperationRequest) EndCompoundOperationRequest.CREATOR.createFromParcel(data);
                    }
                    zza(endCompoundOperationRequest, com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_GENERAL_CONTRACTOR /*42*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    zzb(data.readString(), data.readString(), com.google.android.gms.drive.realtime.internal.zzf.zza.zzaj(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case Place.TYPE_GROCERY_OR_SUPERMARKET /*43*/:
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    readString = data.readString();
                    String readString2 = data.readString();
                    if (data.readInt() != 0) {
                        zzA = DataHolder.CREATOR.zzA(data);
                    }
                    zza(readString, readString2, zzA, com.google.android.gms.drive.realtime.internal.zzj.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void zza(int i, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(BeginCompoundOperationRequest beginCompoundOperationRequest, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException;

    void zza(EndCompoundOperationRequest endCompoundOperationRequest, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(EndCompoundOperationRequest endCompoundOperationRequest, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException;

    void zza(ParcelableIndexReference parcelableIndexReference, zzn com_google_android_gms_drive_realtime_internal_zzn) throws RemoteException;

    void zza(zzc com_google_android_gms_drive_realtime_internal_zzc) throws RemoteException;

    void zza(zzd com_google_android_gms_drive_realtime_internal_zzd) throws RemoteException;

    void zza(zze com_google_android_gms_drive_realtime_internal_zze) throws RemoteException;

    void zza(zzh com_google_android_gms_drive_realtime_internal_zzh) throws RemoteException;

    void zza(zzi com_google_android_gms_drive_realtime_internal_zzi) throws RemoteException;

    void zza(zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException;

    void zza(zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException;

    void zza(String str, int i, int i2, zzg com_google_android_gms_drive_realtime_internal_zzg) throws RemoteException;

    void zza(String str, int i, int i2, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(String str, int i, DataHolder dataHolder, zzg com_google_android_gms_drive_realtime_internal_zzg) throws RemoteException;

    void zza(String str, int i, DataHolder dataHolder, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(String str, int i, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException;

    void zza(String str, int i, String str2, int i2, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(String str, int i, String str2, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(String str, DataHolder dataHolder, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(String str, zzf com_google_android_gms_drive_realtime_internal_zzf) throws RemoteException;

    void zza(String str, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(String str, zzk com_google_android_gms_drive_realtime_internal_zzk) throws RemoteException;

    void zza(String str, zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException;

    void zza(String str, zzn com_google_android_gms_drive_realtime_internal_zzn) throws RemoteException;

    void zza(String str, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException;

    void zza(String str, String str2, DataHolder dataHolder, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zza(String str, String str2, zzf com_google_android_gms_drive_realtime_internal_zzf) throws RemoteException;

    void zza(String str, String str2, zzg com_google_android_gms_drive_realtime_internal_zzg) throws RemoteException;

    void zza(String str, String str2, zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zzb(zzc com_google_android_gms_drive_realtime_internal_zzc) throws RemoteException;

    void zzb(zzj com_google_android_gms_drive_realtime_internal_zzj) throws RemoteException;

    void zzb(zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException;

    void zzb(zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException;

    void zzb(String str, zzf com_google_android_gms_drive_realtime_internal_zzf) throws RemoteException;

    void zzb(String str, zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException;

    void zzb(String str, zzn com_google_android_gms_drive_realtime_internal_zzn) throws RemoteException;

    void zzb(String str, zzo com_google_android_gms_drive_realtime_internal_zzo) throws RemoteException;

    void zzb(String str, String str2, zzf com_google_android_gms_drive_realtime_internal_zzf) throws RemoteException;

    void zzc(zzc com_google_android_gms_drive_realtime_internal_zzc) throws RemoteException;

    void zzc(String str, zzl com_google_android_gms_drive_realtime_internal_zzl) throws RemoteException;

    void zzd(zzc com_google_android_gms_drive_realtime_internal_zzc) throws RemoteException;
}
