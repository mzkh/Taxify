package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.LocationSource.OnLocationChangedListener;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzi;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.zzj;
import com.google.android.gms.maps.model.internal.zzl;
import com.google.android.gms.maps.model.internal.zzn;

public final class GoogleMap {
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate zzapq;
    private UiSettings zzapr;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location location);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.10 */
    class AnonymousClass10 extends com.google.android.gms.maps.internal.zzn.zza {
        final /* synthetic */ OnMarkerClickListener zzapE;
        final /* synthetic */ GoogleMap zzapt;

        AnonymousClass10(GoogleMap googleMap, OnMarkerClickListener onMarkerClickListener) {
            this.zzapt = googleMap;
            this.zzapE = onMarkerClickListener;
        }

        public boolean zza(zzl com_google_android_gms_maps_model_internal_zzl) {
            return this.zzapE.onMarkerClick(new Marker(com_google_android_gms_maps_model_internal_zzl));
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.11 */
    class AnonymousClass11 extends com.google.android.gms.maps.internal.zzo.zza {
        final /* synthetic */ OnMarkerDragListener zzapF;
        final /* synthetic */ GoogleMap zzapt;

        AnonymousClass11(GoogleMap googleMap, OnMarkerDragListener onMarkerDragListener) {
            this.zzapt = googleMap;
            this.zzapF = onMarkerDragListener;
        }

        public void zzb(zzl com_google_android_gms_maps_model_internal_zzl) {
            this.zzapF.onMarkerDragStart(new Marker(com_google_android_gms_maps_model_internal_zzl));
        }

        public void zzc(zzl com_google_android_gms_maps_model_internal_zzl) {
            this.zzapF.onMarkerDragEnd(new Marker(com_google_android_gms_maps_model_internal_zzl));
        }

        public void zzd(zzl com_google_android_gms_maps_model_internal_zzl) {
            this.zzapF.onMarkerDrag(new Marker(com_google_android_gms_maps_model_internal_zzl));
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.12 */
    class AnonymousClass12 extends com.google.android.gms.maps.internal.zzh.zza {
        final /* synthetic */ OnInfoWindowClickListener zzapG;
        final /* synthetic */ GoogleMap zzapt;

        AnonymousClass12(GoogleMap googleMap, OnInfoWindowClickListener onInfoWindowClickListener) {
            this.zzapt = googleMap;
            this.zzapG = onInfoWindowClickListener;
        }

        public void zze(zzl com_google_android_gms_maps_model_internal_zzl) {
            this.zzapG.onInfoWindowClick(new Marker(com_google_android_gms_maps_model_internal_zzl));
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.13 */
    class AnonymousClass13 extends com.google.android.gms.maps.internal.zzd.zza {
        final /* synthetic */ InfoWindowAdapter zzapH;
        final /* synthetic */ GoogleMap zzapt;

        AnonymousClass13(GoogleMap googleMap, InfoWindowAdapter infoWindowAdapter) {
            this.zzapt = googleMap;
            this.zzapH = infoWindowAdapter;
        }

        public zzd zzf(zzl com_google_android_gms_maps_model_internal_zzl) {
            return zze.zzn(this.zzapH.getInfoWindow(new Marker(com_google_android_gms_maps_model_internal_zzl)));
        }

        public zzd zzg(zzl com_google_android_gms_maps_model_internal_zzl) {
            return zze.zzn(this.zzapH.getInfoContents(new Marker(com_google_android_gms_maps_model_internal_zzl)));
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.1 */
    class C06261 extends com.google.android.gms.maps.internal.zzg.zza {
        final /* synthetic */ OnIndoorStateChangeListener zzaps;
        final /* synthetic */ GoogleMap zzapt;

        C06261(GoogleMap googleMap, OnIndoorStateChangeListener onIndoorStateChangeListener) {
            this.zzapt = googleMap;
            this.zzaps = onIndoorStateChangeListener;
        }

        public void onIndoorBuildingFocused() {
            this.zzaps.onIndoorBuildingFocused();
        }

        public void zza(zzj com_google_android_gms_maps_model_internal_zzj) {
            this.zzaps.onIndoorLevelActivated(new IndoorBuilding(com_google_android_gms_maps_model_internal_zzj));
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.2 */
    class C06272 extends com.google.android.gms.maps.internal.zzq.zza {
        final /* synthetic */ GoogleMap zzapt;
        final /* synthetic */ OnMyLocationChangeListener zzapu;

        C06272(GoogleMap googleMap, OnMyLocationChangeListener onMyLocationChangeListener) {
            this.zzapt = googleMap;
            this.zzapu = onMyLocationChangeListener;
        }

        public void zzc(Location location) {
            this.zzapu.onMyLocationChange(location);
        }

        public void zzg(zzd com_google_android_gms_dynamic_zzd) {
            this.zzapu.onMyLocationChange((Location) zze.zzf(com_google_android_gms_dynamic_zzd));
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.3 */
    class C06283 extends com.google.android.gms.maps.internal.zzp.zza {
        final /* synthetic */ GoogleMap zzapt;
        final /* synthetic */ OnMyLocationButtonClickListener zzapv;

        C06283(GoogleMap googleMap, OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
            this.zzapt = googleMap;
            this.zzapv = onMyLocationButtonClickListener;
        }

        public boolean onMyLocationButtonClick() throws RemoteException {
            return this.zzapv.onMyLocationButtonClick();
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.4 */
    class C06294 extends com.google.android.gms.maps.internal.zzk.zza {
        final /* synthetic */ GoogleMap zzapt;
        final /* synthetic */ OnMapLoadedCallback zzapw;

        C06294(GoogleMap googleMap, OnMapLoadedCallback onMapLoadedCallback) {
            this.zzapt = googleMap;
            this.zzapw = onMapLoadedCallback;
        }

        public void onMapLoaded() throws RemoteException {
            this.zzapw.onMapLoaded();
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.5 */
    class C06305 extends com.google.android.gms.maps.internal.zzv.zza {
        final /* synthetic */ GoogleMap zzapt;
        final /* synthetic */ SnapshotReadyCallback zzapx;

        C06305(GoogleMap googleMap, SnapshotReadyCallback snapshotReadyCallback) {
            this.zzapt = googleMap;
            this.zzapx = snapshotReadyCallback;
        }

        public void onSnapshotReady(Bitmap snapshot) throws RemoteException {
            this.zzapx.onSnapshotReady(snapshot);
        }

        public void zzh(zzd com_google_android_gms_dynamic_zzd) throws RemoteException {
            this.zzapx.onSnapshotReady((Bitmap) zze.zzf(com_google_android_gms_dynamic_zzd));
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.6 */
    class C06316 extends com.google.android.gms.maps.internal.ILocationSourceDelegate.zza {
        final /* synthetic */ GoogleMap zzapt;
        final /* synthetic */ LocationSource zzapy;

        /* renamed from: com.google.android.gms.maps.GoogleMap.6.1 */
        class C04371 implements OnLocationChangedListener {
            final /* synthetic */ C06316 zzapA;
            final /* synthetic */ zzi zzapz;

            C04371(C06316 c06316, zzi com_google_android_gms_maps_internal_zzi) {
                this.zzapA = c06316;
                this.zzapz = com_google_android_gms_maps_internal_zzi;
            }

            public void onLocationChanged(Location location) {
                try {
                    this.zzapz.zzd(location);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
        }

        C06316(GoogleMap googleMap, LocationSource locationSource) {
            this.zzapt = googleMap;
            this.zzapy = locationSource;
        }

        public void activate(zzi listener) {
            this.zzapy.activate(new C04371(this, listener));
        }

        public void deactivate() {
            this.zzapy.deactivate();
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.7 */
    class C06327 extends com.google.android.gms.maps.internal.zzf.zza {
        final /* synthetic */ OnCameraChangeListener zzapB;
        final /* synthetic */ GoogleMap zzapt;

        C06327(GoogleMap googleMap, OnCameraChangeListener onCameraChangeListener) {
            this.zzapt = googleMap;
            this.zzapB = onCameraChangeListener;
        }

        public void onCameraChange(CameraPosition position) {
            this.zzapB.onCameraChange(position);
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.8 */
    class C06338 extends com.google.android.gms.maps.internal.zzj.zza {
        final /* synthetic */ OnMapClickListener zzapC;
        final /* synthetic */ GoogleMap zzapt;

        C06338(GoogleMap googleMap, OnMapClickListener onMapClickListener) {
            this.zzapt = googleMap;
            this.zzapC = onMapClickListener;
        }

        public void onMapClick(LatLng point) {
            this.zzapC.onMapClick(point);
        }
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap.9 */
    class C06349 extends com.google.android.gms.maps.internal.zzl.zza {
        final /* synthetic */ OnMapLongClickListener zzapD;
        final /* synthetic */ GoogleMap zzapt;

        C06349(GoogleMap googleMap, OnMapLongClickListener onMapLongClickListener) {
            this.zzapt = googleMap;
            this.zzapD = onMapLongClickListener;
        }

        public void onMapLongClick(LatLng point) {
            this.zzapD.onMapLongClick(point);
        }
    }

    private static final class zza extends com.google.android.gms.maps.internal.zzb.zza {
        private final CancelableCallback zzapI;

        zza(CancelableCallback cancelableCallback) {
            this.zzapI = cancelableCallback;
        }

        public void onCancel() {
            this.zzapI.onCancel();
        }

        public void onFinish() {
            this.zzapI.onFinish();
        }
    }

    protected GoogleMap(IGoogleMapDelegate map) {
        this.zzapq = (IGoogleMapDelegate) zzx.zzl(map);
    }

    public final Circle addCircle(CircleOptions options) {
        try {
            return new Circle(this.zzapq.addCircle(options));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions options) {
        try {
            com.google.android.gms.maps.model.internal.zzi addGroundOverlay = this.zzapq.addGroundOverlay(options);
            return addGroundOverlay != null ? new GroundOverlay(addGroundOverlay) : null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Marker addMarker(MarkerOptions options) {
        try {
            zzl addMarker = this.zzapq.addMarker(options);
            return addMarker != null ? new Marker(addMarker) : null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polygon addPolygon(PolygonOptions options) {
        try {
            return new Polygon(this.zzapq.addPolygon(options));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polyline addPolyline(PolylineOptions options) {
        try {
            return new Polyline(this.zzapq.addPolyline(options));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions options) {
        try {
            zzn addTileOverlay = this.zzapq.addTileOverlay(options);
            return addTileOverlay != null ? new TileOverlay(addTileOverlay) : null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate update) {
        try {
            this.zzapq.animateCamera(update.zzqe());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate update, int durationMs, CancelableCallback callback) {
        try {
            this.zzapq.animateCameraWithDurationAndCallback(update.zzqe(), durationMs, callback == null ? null : new zza(callback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate update, CancelableCallback callback) {
        try {
            this.zzapq.animateCameraWithCallback(update.zzqe(), callback == null ? null : new zza(callback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void clear() {
        try {
            this.zzapq.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            return this.zzapq.getCameraPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public IndoorBuilding getFocusedBuilding() {
        try {
            zzj focusedBuilding = this.zzapq.getFocusedBuilding();
            return focusedBuilding != null ? new IndoorBuilding(focusedBuilding) : null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getMapType() {
        try {
            return this.zzapq.getMapType();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.zzapq.getMaxZoomLevel();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.zzapq.getMinZoomLevel();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.zzapq.getMyLocation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Projection getProjection() {
        try {
            return new Projection(this.zzapq.getProjection());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final UiSettings getUiSettings() {
        try {
            if (this.zzapr == null) {
                this.zzapr = new UiSettings(this.zzapq.getUiSettings());
            }
            return this.zzapr;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isBuildingsEnabled() {
        try {
            return this.zzapq.isBuildingsEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.zzapq.isIndoorEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.zzapq.isMyLocationEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.zzapq.isTrafficEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void moveCamera(CameraUpdate update) {
        try {
            this.zzapq.moveCamera(update.zzqe());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setBuildingsEnabled(boolean enabled) {
        try {
            this.zzapq.setBuildingsEnabled(enabled);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setContentDescription(String description) {
        try {
            this.zzapq.setContentDescription(description);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean setIndoorEnabled(boolean enabled) {
        try {
            return this.zzapq.setIndoorEnabled(enabled);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter adapter) {
        if (adapter == null) {
            try {
                this.zzapq.setInfoWindowAdapter(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setInfoWindowAdapter(new AnonymousClass13(this, adapter));
    }

    public final void setLocationSource(LocationSource source) {
        if (source == null) {
            try {
                this.zzapq.setLocationSource(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setLocationSource(new C06316(this, source));
    }

    public final void setMapType(int type) {
        try {
            this.zzapq.setMapType(type);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean enabled) {
        try {
            this.zzapq.setMyLocationEnabled(enabled);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraChangeListener(OnCameraChangeListener listener) {
        if (listener == null) {
            try {
                this.zzapq.setOnCameraChangeListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnCameraChangeListener(new C06327(this, listener));
    }

    public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener listener) {
        if (listener == null) {
            try {
                this.zzapq.setOnIndoorStateChangeListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnIndoorStateChangeListener(new C06261(this, listener));
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener listener) {
        if (listener == null) {
            try {
                this.zzapq.setOnInfoWindowClickListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnInfoWindowClickListener(new AnonymousClass12(this, listener));
    }

    public final void setOnMapClickListener(OnMapClickListener listener) {
        if (listener == null) {
            try {
                this.zzapq.setOnMapClickListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnMapClickListener(new C06338(this, listener));
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback callback) {
        if (callback == null) {
            try {
                this.zzapq.setOnMapLoadedCallback(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnMapLoadedCallback(new C06294(this, callback));
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener listener) {
        if (listener == null) {
            try {
                this.zzapq.setOnMapLongClickListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnMapLongClickListener(new C06349(this, listener));
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener listener) {
        if (listener == null) {
            try {
                this.zzapq.setOnMarkerClickListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnMarkerClickListener(new AnonymousClass10(this, listener));
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener listener) {
        if (listener == null) {
            try {
                this.zzapq.setOnMarkerDragListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnMarkerDragListener(new AnonymousClass11(this, listener));
    }

    public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener listener) {
        if (listener == null) {
            try {
                this.zzapq.setOnMyLocationButtonClickListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnMyLocationButtonClickListener(new C06283(this, listener));
    }

    @Deprecated
    public final void setOnMyLocationChangeListener(OnMyLocationChangeListener listener) {
        if (listener == null) {
            try {
                this.zzapq.setOnMyLocationChangeListener(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.zzapq.setOnMyLocationChangeListener(new C06272(this, listener));
    }

    public final void setPadding(int left, int top, int right, int bottom) {
        try {
            this.zzapq.setPadding(left, top, right, bottom);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTrafficEnabled(boolean enabled) {
        try {
            this.zzapq.setTrafficEnabled(enabled);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void snapshot(SnapshotReadyCallback callback) {
        snapshot(callback, null);
    }

    public final void snapshot(SnapshotReadyCallback callback, Bitmap bitmap) {
        try {
            this.zzapq.snapshot(new C06305(this, callback), (zze) (bitmap != null ? zze.zzn(bitmap) : null));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            this.zzapq.stopAnimation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    IGoogleMapDelegate zzqg() {
        return this.zzapq;
    }
}
