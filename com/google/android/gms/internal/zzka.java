package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

public interface zzka extends IInterface {

    public static abstract class zza extends Binder implements zzka {
        public zza() {
            attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            zzjw com_google_android_gms_internal_zzjw = null;
            switch (code) {
                case CompletionEvent.STATUS_FAILURE /*1*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    zzai(data.readInt());
                    return true;
                case CompletionEvent.STATUS_CONFLICT /*2*/:
                    ApplicationMetadata applicationMetadata;
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    if (data.readInt() != 0) {
                        applicationMetadata = (ApplicationMetadata) ApplicationMetadata.CREATOR.createFromParcel(data);
                    }
                    String readString = data.readString();
                    String readString2 = data.readString();
                    if (data.readInt() != 0) {
                        z = true;
                    }
                    zza(applicationMetadata, readString, readString2, z);
                    return true;
                case CompletionEvent.STATUS_CANCELED /*3*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    zzaj(data.readInt());
                    return true;
                case Place.TYPE_AQUARIUM /*4*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    String readString3 = data.readString();
                    double readDouble = data.readDouble();
                    if (data.readInt() != 0) {
                        z = true;
                    }
                    zza(readString3, readDouble, z);
                    return true;
                case Place.TYPE_ART_GALLERY /*5*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    zzn(data.readString(), data.readString());
                    return true;
                case Place.TYPE_ATM /*6*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    zzb(data.readString(), data.createByteArray());
                    return true;
                case Place.TYPE_BAKERY /*7*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    zzal(data.readInt());
                    return true;
                case Place.TYPE_BANK /*8*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    zzak(data.readInt());
                    return true;
                case Place.TYPE_BAR /*9*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    onApplicationDisconnected(data.readInt());
                    return true;
                case Place.TYPE_BEAUTY_SALON /*10*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    zza(data.readString(), data.readLong(), data.readInt());
                    return true;
                case Place.TYPE_BICYCLE_STORE /*11*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    zza(data.readString(), data.readLong());
                    return true;
                case Place.TYPE_BOOK_STORE /*12*/:
                    zzjp com_google_android_gms_internal_zzjp;
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzjp = (zzjp) zzjp.CREATOR.createFromParcel(data);
                    }
                    zzb(com_google_android_gms_internal_zzjp);
                    return true;
                case ConnectionsStatusCodes.STATUS_ERROR /*13*/:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    if (data.readInt() != 0) {
                        com_google_android_gms_internal_zzjw = (zzjw) zzjw.CREATOR.createFromParcel(data);
                    }
                    zzb(com_google_android_gms_internal_zzjw);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void onApplicationDisconnected(int i) throws RemoteException;

    void zza(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException;

    void zza(String str, double d, boolean z) throws RemoteException;

    void zza(String str, long j) throws RemoteException;

    void zza(String str, long j, int i) throws RemoteException;

    void zzai(int i) throws RemoteException;

    void zzaj(int i) throws RemoteException;

    void zzak(int i) throws RemoteException;

    void zzal(int i) throws RemoteException;

    void zzb(zzjp com_google_android_gms_internal_zzjp) throws RemoteException;

    void zzb(zzjw com_google_android_gms_internal_zzjw) throws RemoteException;

    void zzb(String str, byte[] bArr) throws RemoteException;

    void zzn(String str, String str2) throws RemoteException;
}
