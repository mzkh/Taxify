package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions.Builder;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.internal.zzjr;
import com.google.android.gms.internal.zzju;
import com.google.android.gms.internal.zzjy;
import com.google.android.gms.internal.zzkb;
import java.io.IOException;

public final class Cast {
    public static final Api<CastOptions> API;
    public static final CastApi CastApi;
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 65536;
    public static final int MAX_NAMESPACE_LENGTH = 128;
    private static final zzb<zzju, CastOptions> zzGS;

    public interface CastApi {

        public static final class zza implements CastApi {

            /* renamed from: com.google.android.gms.cast.Cast.CastApi.zza.1 */
            class C06841 extends zzjy {
                final /* synthetic */ String zzIr;
                final /* synthetic */ String zzIs;
                final /* synthetic */ zza zzIt;

                C06841(zza com_google_android_gms_cast_Cast_CastApi_zza, GoogleApiClient googleApiClient, String str, String str2) {
                    this.zzIt = com_google_android_gms_cast_Cast_CastApi_zza;
                    this.zzIr = str;
                    this.zzIs = str2;
                    super(googleApiClient);
                }

                protected void zza(zzju com_google_android_gms_internal_zzju) throws RemoteException {
                    try {
                        com_google_android_gms_internal_zzju.zza(this.zzIr, this.zzIs, (com.google.android.gms.common.api.zza.zzb) this);
                    } catch (IllegalArgumentException e) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    } catch (IllegalStateException e2) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    }
                }
            }

            /* renamed from: com.google.android.gms.cast.Cast.CastApi.zza.2 */
            class C06852 extends zza {
                final /* synthetic */ zza zzIt;
                final /* synthetic */ String zzIu;

                C06852(zza com_google_android_gms_cast_Cast_CastApi_zza, GoogleApiClient googleApiClient, String str) {
                    this.zzIt = com_google_android_gms_cast_Cast_CastApi_zza;
                    this.zzIu = str;
                    super(googleApiClient);
                }

                protected void zza(zzju com_google_android_gms_internal_zzju) throws RemoteException {
                    try {
                        com_google_android_gms_internal_zzju.zza(this.zzIu, false, (com.google.android.gms.common.api.zza.zzb) this);
                    } catch (IllegalStateException e) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    }
                }
            }

            /* renamed from: com.google.android.gms.cast.Cast.CastApi.zza.3 */
            class C06863 extends zza {
                final /* synthetic */ zza zzIt;
                final /* synthetic */ String zzIu;
                final /* synthetic */ LaunchOptions zzIv;

                C06863(zza com_google_android_gms_cast_Cast_CastApi_zza, GoogleApiClient googleApiClient, String str, LaunchOptions launchOptions) {
                    this.zzIt = com_google_android_gms_cast_Cast_CastApi_zza;
                    this.zzIu = str;
                    this.zzIv = launchOptions;
                    super(googleApiClient);
                }

                protected void zza(zzju com_google_android_gms_internal_zzju) throws RemoteException {
                    try {
                        com_google_android_gms_internal_zzju.zza(this.zzIu, this.zzIv, (com.google.android.gms.common.api.zza.zzb) this);
                    } catch (IllegalStateException e) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    }
                }
            }

            /* renamed from: com.google.android.gms.cast.Cast.CastApi.zza.4 */
            class C06874 extends zza {
                final /* synthetic */ zza zzIt;
                final /* synthetic */ String zzIu;
                final /* synthetic */ String zzIw;

                C06874(zza com_google_android_gms_cast_Cast_CastApi_zza, GoogleApiClient googleApiClient, String str, String str2) {
                    this.zzIt = com_google_android_gms_cast_Cast_CastApi_zza;
                    this.zzIu = str;
                    this.zzIw = str2;
                    super(googleApiClient);
                }

                protected void zza(zzju com_google_android_gms_internal_zzju) throws RemoteException {
                    try {
                        com_google_android_gms_internal_zzju.zzb(this.zzIu, this.zzIw, this);
                    } catch (IllegalStateException e) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    }
                }
            }

            /* renamed from: com.google.android.gms.cast.Cast.CastApi.zza.5 */
            class C06885 extends zza {
                final /* synthetic */ zza zzIt;
                final /* synthetic */ String zzIu;

                C06885(zza com_google_android_gms_cast_Cast_CastApi_zza, GoogleApiClient googleApiClient, String str) {
                    this.zzIt = com_google_android_gms_cast_Cast_CastApi_zza;
                    this.zzIu = str;
                    super(googleApiClient);
                }

                protected void zza(zzju com_google_android_gms_internal_zzju) throws RemoteException {
                    try {
                        com_google_android_gms_internal_zzju.zzb(this.zzIu, null, this);
                    } catch (IllegalStateException e) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    }
                }
            }

            /* renamed from: com.google.android.gms.cast.Cast.CastApi.zza.6 */
            class C06896 extends zza {
                final /* synthetic */ zza zzIt;

                C06896(zza com_google_android_gms_cast_Cast_CastApi_zza, GoogleApiClient googleApiClient) {
                    this.zzIt = com_google_android_gms_cast_Cast_CastApi_zza;
                    super(googleApiClient);
                }

                protected void zza(zzju com_google_android_gms_internal_zzju) throws RemoteException {
                    try {
                        com_google_android_gms_internal_zzju.zzb(null, null, this);
                    } catch (IllegalStateException e) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    }
                }
            }

            /* renamed from: com.google.android.gms.cast.Cast.CastApi.zza.7 */
            class C06907 extends zzjy {
                final /* synthetic */ zza zzIt;

                C06907(zza com_google_android_gms_cast_Cast_CastApi_zza, GoogleApiClient googleApiClient) {
                    this.zzIt = com_google_android_gms_cast_Cast_CastApi_zza;
                    super(googleApiClient);
                }

                protected void zza(zzju com_google_android_gms_internal_zzju) throws RemoteException {
                    try {
                        com_google_android_gms_internal_zzju.zzd((com.google.android.gms.common.api.zza.zzb) this);
                    } catch (IllegalStateException e) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    }
                }
            }

            /* renamed from: com.google.android.gms.cast.Cast.CastApi.zza.8 */
            class C06918 extends zzjy {
                final /* synthetic */ zza zzIt;

                C06918(zza com_google_android_gms_cast_Cast_CastApi_zza, GoogleApiClient googleApiClient) {
                    this.zzIt = com_google_android_gms_cast_Cast_CastApi_zza;
                    super(googleApiClient);
                }

                protected void zza(zzju com_google_android_gms_internal_zzju) throws RemoteException {
                    try {
                        com_google_android_gms_internal_zzju.zza("", (com.google.android.gms.common.api.zza.zzb) this);
                    } catch (IllegalStateException e) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    }
                }
            }

            /* renamed from: com.google.android.gms.cast.Cast.CastApi.zza.9 */
            class C06929 extends zzjy {
                final /* synthetic */ zza zzIt;
                final /* synthetic */ String zzIw;

                C06929(zza com_google_android_gms_cast_Cast_CastApi_zza, GoogleApiClient googleApiClient, String str) {
                    this.zzIt = com_google_android_gms_cast_Cast_CastApi_zza;
                    this.zzIw = str;
                    super(googleApiClient);
                }

                protected void zza(zzju com_google_android_gms_internal_zzju) throws RemoteException {
                    if (TextUtils.isEmpty(this.zzIw)) {
                        zzd(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, "IllegalArgument: sessionId cannot be null or empty");
                        return;
                    }
                    try {
                        com_google_android_gms_internal_zzju.zza(this.zzIw, (com.google.android.gms.common.api.zza.zzb) this);
                    } catch (IllegalStateException e) {
                        zzah(GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE);
                    }
                }
            }

            public ApplicationMetadata getApplicationMetadata(GoogleApiClient client) throws IllegalStateException {
                return ((zzju) client.zza(zzkb.zzGR)).getApplicationMetadata();
            }

            public String getApplicationStatus(GoogleApiClient client) throws IllegalStateException {
                return ((zzju) client.zza(zzkb.zzGR)).getApplicationStatus();
            }

            public double getVolume(GoogleApiClient client) throws IllegalStateException {
                return ((zzju) client.zza(zzkb.zzGR)).zzhs();
            }

            public boolean isMute(GoogleApiClient client) throws IllegalStateException {
                return ((zzju) client.zza(zzkb.zzGR)).isMute();
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient client) {
                return client.zzb(new C06896(this, client));
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient client, String applicationId) {
                return client.zzb(new C06885(this, client, applicationId));
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient client, String applicationId, String sessionId) {
                return client.zzb(new C06874(this, client, applicationId, sessionId));
            }

            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient client, String applicationId) {
                return client.zzb(new C06852(this, client, applicationId));
            }

            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient client, String applicationId, LaunchOptions options) {
                return client.zzb(new C06863(this, client, applicationId, options));
            }

            @Deprecated
            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient client, String applicationId, boolean relaunchIfRunning) {
                return launchApplication(client, applicationId, new Builder().setRelaunchIfRunning(relaunchIfRunning).build());
            }

            public PendingResult<Status> leaveApplication(GoogleApiClient client) {
                return client.zzb(new C06907(this, client));
            }

            public void removeMessageReceivedCallbacks(GoogleApiClient client, String namespace) throws IOException, IllegalArgumentException {
                try {
                    ((zzju) client.zza(zzkb.zzGR)).zzaJ(namespace);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void requestStatus(GoogleApiClient client) throws IOException, IllegalStateException {
                try {
                    ((zzju) client.zza(zzkb.zzGR)).zzhr();
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public PendingResult<Status> sendMessage(GoogleApiClient client, String namespace, String message) {
                return client.zzb(new C06841(this, client, namespace, message));
            }

            public void setMessageReceivedCallbacks(GoogleApiClient client, String namespace, MessageReceivedCallback callbacks) throws IOException, IllegalStateException {
                try {
                    ((zzju) client.zza(zzkb.zzGR)).zza(namespace, callbacks);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void setMute(GoogleApiClient client, boolean mute) throws IOException, IllegalStateException {
                try {
                    ((zzju) client.zza(zzkb.zzGR)).zzL(mute);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void setVolume(GoogleApiClient client, double volume) throws IOException, IllegalArgumentException, IllegalStateException {
                try {
                    ((zzju) client.zza(zzkb.zzGR)).zza(volume);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public PendingResult<Status> stopApplication(GoogleApiClient client) {
                return client.zzb(new C06918(this, client));
            }

            public PendingResult<Status> stopApplication(GoogleApiClient client, String sessionId) {
                return client.zzb(new C06929(this, client, sessionId));
            }
        }

        ApplicationMetadata getApplicationMetadata(GoogleApiClient googleApiClient) throws IllegalStateException;

        String getApplicationStatus(GoogleApiClient googleApiClient) throws IllegalStateException;

        double getVolume(GoogleApiClient googleApiClient) throws IllegalStateException;

        boolean isMute(GoogleApiClient googleApiClient) throws IllegalStateException;

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient);

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str);

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str, String str2);

        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str);

        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str, LaunchOptions launchOptions);

        @Deprecated
        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str, boolean z);

        PendingResult<Status> leaveApplication(GoogleApiClient googleApiClient);

        void removeMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str) throws IOException, IllegalArgumentException;

        void requestStatus(GoogleApiClient googleApiClient) throws IOException, IllegalStateException;

        PendingResult<Status> sendMessage(GoogleApiClient googleApiClient, String str, String str2);

        void setMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str, MessageReceivedCallback messageReceivedCallback) throws IOException, IllegalStateException;

        void setMute(GoogleApiClient googleApiClient, boolean z) throws IOException, IllegalStateException;

        void setVolume(GoogleApiClient googleApiClient, double d) throws IOException, IllegalArgumentException, IllegalStateException;

        PendingResult<Status> stopApplication(GoogleApiClient googleApiClient);

        PendingResult<Status> stopApplication(GoogleApiClient googleApiClient, String str);
    }

    public static class Listener {
        public void onApplicationDisconnected(int statusCode) {
        }

        public void onApplicationMetadataChanged(ApplicationMetadata applicationMetadata) {
        }

        public void onApplicationStatusChanged() {
        }

        public void onVolumeChanged() {
        }

        public void zzab(int i) {
        }

        public void zzac(int i) {
        }
    }

    public interface MessageReceivedCallback {
        void onMessageReceived(CastDevice castDevice, String str, String str2);
    }

    /* renamed from: com.google.android.gms.cast.Cast.1 */
    static class C03491 implements zzb<zzju, CastOptions> {
        C03491() {
        }

        public int getPriority() {
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }

        public zzju zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, CastOptions castOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            zzx.zzb((Object) castOptions, (Object) "Setting the API options is required.");
            return new zzju(context, looper, castOptions.zzIx, (long) castOptions.zzIz, castOptions.zzIy, connectionCallbacks, onConnectionFailedListener);
        }
    }

    public interface ApplicationConnectionResult extends Result {
        ApplicationMetadata getApplicationMetadata();

        String getApplicationStatus();

        String getSessionId();

        boolean getWasLaunched();
    }

    public static final class CastOptions implements HasOptions {
        final CastDevice zzIx;
        final Listener zzIy;
        private final int zzIz;

        public static final class Builder {
            CastDevice zzIA;
            Listener zzIB;
            private int zzIC;

            private Builder(CastDevice castDevice, Listener castListener) {
                zzx.zzb((Object) castDevice, (Object) "CastDevice parameter cannot be null");
                zzx.zzb((Object) castListener, (Object) "CastListener parameter cannot be null");
                this.zzIA = castDevice;
                this.zzIB = castListener;
                this.zzIC = 0;
            }

            public CastOptions build() {
                return new CastOptions();
            }

            public Builder setVerboseLoggingEnabled(boolean enabled) {
                if (enabled) {
                    this.zzIC |= 1;
                } else {
                    this.zzIC &= -2;
                }
                return this;
            }
        }

        private CastOptions(Builder builder) {
            this.zzIx = builder.zzIA;
            this.zzIy = builder.zzIB;
            this.zzIz = builder.zzIC;
        }

        public static Builder builder(CastDevice castDevice, Listener castListener) {
            return new Builder(castListener, null);
        }
    }

    private static abstract class zza extends zzjr<ApplicationConnectionResult> {

        /* renamed from: com.google.android.gms.cast.Cast.zza.1 */
        class C04721 implements ApplicationConnectionResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ zza zzID;

            C04721(zza com_google_android_gms_cast_Cast_zza, Status status) {
                this.zzID = com_google_android_gms_cast_Cast_zza;
                this.zzGT = status;
            }

            public ApplicationMetadata getApplicationMetadata() {
                return null;
            }

            public String getApplicationStatus() {
                return null;
            }

            public String getSessionId() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }

            public boolean getWasLaunched() {
                return false;
            }
        }

        public zza(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzh(x0);
        }

        public ApplicationConnectionResult zzh(Status status) {
            return new C04721(this, status);
        }
    }

    static {
        zzGS = new C03491();
        API = new Api(zzGS, zzkb.zzGR, new Scope[0]);
        CastApi = new zza();
    }

    private Cast() {
    }
}
