package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzr;
import com.google.android.gms.maps.internal.zzs.zza;
import com.google.android.gms.maps.internal.zzt;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama {
    private final IStreetViewPanoramaDelegate zzaqk;

    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    /* renamed from: com.google.android.gms.maps.StreetViewPanorama.1 */
    class C06371 extends zza {
        final /* synthetic */ OnStreetViewPanoramaChangeListener zzaql;
        final /* synthetic */ StreetViewPanorama zzaqm;

        C06371(StreetViewPanorama streetViewPanorama, OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
            this.zzaqm = streetViewPanorama;
            this.zzaql = onStreetViewPanoramaChangeListener;
        }

        public void onStreetViewPanoramaChange(StreetViewPanoramaLocation location) {
            this.zzaql.onStreetViewPanoramaChange(location);
        }
    }

    /* renamed from: com.google.android.gms.maps.StreetViewPanorama.2 */
    class C06382 extends zzr.zza {
        final /* synthetic */ StreetViewPanorama zzaqm;
        final /* synthetic */ OnStreetViewPanoramaCameraChangeListener zzaqn;

        C06382(StreetViewPanorama streetViewPanorama, OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
            this.zzaqm = streetViewPanorama;
            this.zzaqn = onStreetViewPanoramaCameraChangeListener;
        }

        public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera camera) {
            this.zzaqn.onStreetViewPanoramaCameraChange(camera);
        }
    }

    /* renamed from: com.google.android.gms.maps.StreetViewPanorama.3 */
    class C06393 extends zzt.zza {
        final /* synthetic */ StreetViewPanorama zzaqm;
        final /* synthetic */ OnStreetViewPanoramaClickListener zzaqo;

        C06393(StreetViewPanorama streetViewPanorama, OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
            this.zzaqm = streetViewPanorama;
            this.zzaqo = onStreetViewPanoramaClickListener;
        }

        public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation orientation) {
            this.zzaqo.onStreetViewPanoramaClick(orientation);
        }
    }

    protected StreetViewPanorama(IStreetViewPanoramaDelegate sv) {
        this.zzaqk = (IStreetViewPanoramaDelegate) zzx.zzl(sv);
    }

    public void animateTo(StreetViewPanoramaCamera camera, long duration) {
        try {
            this.zzaqk.animateTo(camera, duration);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public StreetViewPanoramaLocation getLocation() {
        try {
            return this.zzaqk.getStreetViewPanoramaLocation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public StreetViewPanoramaCamera getPanoramaCamera() {
        try {
            return this.zzaqk.getPanoramaCamera();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isPanningGesturesEnabled() {
        try {
            return this.zzaqk.isPanningGesturesEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isStreetNamesEnabled() {
        try {
            return this.zzaqk.isStreetNamesEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isUserNavigationEnabled() {
        try {
            return this.zzaqk.isUserNavigationEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.zzaqk.isZoomGesturesEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public Point orientationToPoint(StreetViewPanoramaOrientation orientation) {
        try {
            zzd orientationToPoint = this.zzaqk.orientationToPoint(orientation);
            return orientationToPoint == null ? null : (Point) zze.zzf(orientationToPoint);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public StreetViewPanoramaOrientation pointToOrientation(Point point) {
        try {
            return this.zzaqk.pointToOrientation(zze.zzn(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener listener) {
        if (listener == null) {
            try {
                this.zzaqk.setOnStreetViewPanoramaCameraChangeListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzaqk.setOnStreetViewPanoramaCameraChangeListener(new C06382(this, listener));
    }

    public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener listener) {
        if (listener == null) {
            try {
                this.zzaqk.setOnStreetViewPanoramaChangeListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzaqk.setOnStreetViewPanoramaChangeListener(new C06371(this, listener));
    }

    public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener listener) {
        if (listener == null) {
            try {
                this.zzaqk.setOnStreetViewPanoramaClickListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzaqk.setOnStreetViewPanoramaClickListener(new C06393(this, listener));
    }

    public void setPanningGesturesEnabled(boolean enablePanning) {
        try {
            this.zzaqk.enablePanning(enablePanning);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(LatLng position) {
        try {
            this.zzaqk.setPosition(position);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(LatLng position, int radius) {
        try {
            this.zzaqk.setPositionWithRadius(position, radius);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(String panoId) {
        try {
            this.zzaqk.setPositionWithID(panoId);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setStreetNamesEnabled(boolean enableStreetNames) {
        try {
            this.zzaqk.enableStreetNames(enableStreetNames);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setUserNavigationEnabled(boolean enableUserNavigation) {
        try {
            this.zzaqk.enableUserNavigation(enableUserNavigation);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setZoomGesturesEnabled(boolean enableZoom) {
        try {
            this.zzaqk.enableZoom(enableZoom);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    IStreetViewPanoramaDelegate zzqu() {
        return this.zzaqk;
    }
}
