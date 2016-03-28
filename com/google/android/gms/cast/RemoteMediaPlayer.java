package com.google.android.gms.cast;

import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzjr;
import com.google.android.gms.internal.zzju;
import com.google.android.gms.internal.zzkd;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzkf;
import java.io.IOException;
import org.json.JSONObject;

public class RemoteMediaPlayer implements MessageReceivedCallback {
    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2101;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 2102;
    private final zzkd zzJs;
    private final zza zzJt;
    private OnMetadataUpdatedListener zzJu;
    private OnStatusUpdatedListener zzJv;
    private final Object zznh;

    public interface OnMetadataUpdatedListener {
        void onMetadataUpdated();
    }

    public interface OnStatusUpdatedListener {
        void onStatusUpdated();
    }

    public interface MediaChannelResult extends Result {
        JSONObject getCustomData();
    }

    private class zza implements zzke {
        private GoogleApiClient zzJJ;
        private long zzJK;
        final /* synthetic */ RemoteMediaPlayer zzJw;

        private final class zza implements ResultCallback<Status> {
            private final long zzJL;
            final /* synthetic */ zza zzJM;

            zza(zza com_google_android_gms_cast_RemoteMediaPlayer_zza, long j) {
                this.zzJM = com_google_android_gms_cast_RemoteMediaPlayer_zza;
                this.zzJL = j;
            }

            public /* synthetic */ void onResult(Result x0) {
                zzi((Status) x0);
            }

            public void zzi(Status status) {
                if (!status.isSuccess()) {
                    this.zzJM.zzJw.zzJs.zzb(this.zzJL, status.getStatusCode());
                }
            }
        }

        public zza(RemoteMediaPlayer remoteMediaPlayer) {
            this.zzJw = remoteMediaPlayer;
            this.zzJK = 0;
        }

        public void zza(String str, String str2, long j, String str3) throws IOException {
            if (this.zzJJ == null) {
                throw new IOException("No GoogleApiClient available");
            }
            Cast.CastApi.sendMessage(this.zzJJ, str, str2).setResultCallback(new zza(this, j));
        }

        public void zzb(GoogleApiClient googleApiClient) {
            this.zzJJ = googleApiClient;
        }

        public long zzhk() {
            long j = this.zzJK + 1;
            this.zzJK = j;
            return j;
        }
    }

    private static final class zzc implements MediaChannelResult {
        private final Status zzHb;
        private final JSONObject zzIX;

        zzc(Status status, JSONObject jSONObject) {
            this.zzHb = status;
            this.zzIX = jSONObject;
        }

        public JSONObject getCustomData() {
            return this.zzIX;
        }

        public Status getStatus() {
            return this.zzHb;
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.1 */
    class C06451 extends zzkd {
        final /* synthetic */ RemoteMediaPlayer zzJw;

        C06451(RemoteMediaPlayer remoteMediaPlayer, String str) {
            this.zzJw = remoteMediaPlayer;
            super(str);
        }

        protected void onMetadataUpdated() {
            this.zzJw.onMetadataUpdated();
        }

        protected void onStatusUpdated() {
            this.zzJw.onStatusUpdated();
        }
    }

    private static abstract class zzb extends zzjr<MediaChannelResult> {
        zzkf zzJN;

        /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.zzb.1 */
        class C03501 implements zzkf {
            final /* synthetic */ zzb zzJO;

            C03501(zzb com_google_android_gms_cast_RemoteMediaPlayer_zzb) {
                this.zzJO = com_google_android_gms_cast_RemoteMediaPlayer_zzb;
            }

            public void zza(long j, int i, Object obj) {
                this.zzJO.setResult(new zzc(new Status(i), obj instanceof JSONObject ? (JSONObject) obj : null));
            }

            public void zzn(long j) {
                this.zzJO.setResult(this.zzJO.zzj(new Status(RemoteMediaPlayer.STATUS_REPLACED)));
            }
        }

        /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.zzb.2 */
        class C04732 implements MediaChannelResult {
            final /* synthetic */ Status zzGT;
            final /* synthetic */ zzb zzJO;

            C04732(zzb com_google_android_gms_cast_RemoteMediaPlayer_zzb, Status status) {
                this.zzJO = com_google_android_gms_cast_RemoteMediaPlayer_zzb;
                this.zzGT = status;
            }

            public JSONObject getCustomData() {
                return null;
            }

            public Status getStatus() {
                return this.zzGT;
            }
        }

        zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.zzJN = new C03501(this);
        }

        public /* synthetic */ Result createFailedResult(Status x0) {
            return zzj(x0);
        }

        public MediaChannelResult zzj(Status status) {
            return new C04732(this, status);
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.10 */
    class AnonymousClass10 extends zzb {
        final /* synthetic */ JSONObject zzJE;
        final /* synthetic */ boolean zzJI;
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;

        AnonymousClass10(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2, boolean z, JSONObject jSONObject) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            this.zzJI = z;
            this.zzJE = jSONObject;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zza(this.zzJN, this.zzJI, this.zzJE);
                    this.zzJw.zzJt.zzb(null);
                } catch (IllegalStateException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e2) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.11 */
    class AnonymousClass11 extends zzb {
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;

        AnonymousClass11(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zza(this.zzJN);
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.2 */
    class C06932 extends zzb {
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;
        final /* synthetic */ long[] zzJy;

        C06932(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2, long[] jArr) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            this.zzJy = jArr;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zza(this.zzJN, this.zzJy);
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.3 */
    class C06943 extends zzb {
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;
        final /* synthetic */ TextTrackStyle zzJz;

        C06943(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2, TextTrackStyle textTrackStyle) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            this.zzJz = textTrackStyle;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zza(this.zzJN, this.zzJz);
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.4 */
    class C06954 extends zzb {
        final /* synthetic */ MediaInfo zzJA;
        final /* synthetic */ boolean zzJB;
        final /* synthetic */ long zzJC;
        final /* synthetic */ long[] zzJD;
        final /* synthetic */ JSONObject zzJE;
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;

        C06954(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            this.zzJA = mediaInfo;
            this.zzJB = z;
            this.zzJC = j;
            this.zzJD = jArr;
            this.zzJE = jSONObject;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zza(this.zzJN, this.zzJA, this.zzJB, this.zzJC, this.zzJD, this.zzJE);
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.5 */
    class C06965 extends zzb {
        final /* synthetic */ JSONObject zzJE;
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;

        C06965(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2, JSONObject jSONObject) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            this.zzJE = jSONObject;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zza(this.zzJN, this.zzJE);
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.6 */
    class C06976 extends zzb {
        final /* synthetic */ JSONObject zzJE;
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;

        C06976(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2, JSONObject jSONObject) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            this.zzJE = jSONObject;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zzb(this.zzJN, this.zzJE);
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.7 */
    class C06987 extends zzb {
        final /* synthetic */ JSONObject zzJE;
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;

        C06987(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2, JSONObject jSONObject) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            this.zzJE = jSONObject;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zzc(this.zzJN, this.zzJE);
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.8 */
    class C06998 extends zzb {
        final /* synthetic */ JSONObject zzJE;
        final /* synthetic */ long zzJF;
        final /* synthetic */ int zzJG;
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;

        C06998(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2, long j, int i, JSONObject jSONObject) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            this.zzJF = j;
            this.zzJG = i;
            this.zzJE = jSONObject;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zza(this.zzJN, this.zzJF, this.zzJG, this.zzJE);
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer.9 */
    class C07009 extends zzb {
        final /* synthetic */ JSONObject zzJE;
        final /* synthetic */ double zzJH;
        final /* synthetic */ RemoteMediaPlayer zzJw;
        final /* synthetic */ GoogleApiClient zzJx;

        C07009(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, GoogleApiClient googleApiClient2, double d, JSONObject jSONObject) {
            this.zzJw = remoteMediaPlayer;
            this.zzJx = googleApiClient2;
            this.zzJH = d;
            this.zzJE = jSONObject;
            super(googleApiClient);
        }

        protected void zza(zzju com_google_android_gms_internal_zzju) {
            synchronized (this.zzJw.zznh) {
                this.zzJw.zzJt.zzb(this.zzJx);
                try {
                    this.zzJw.zzJs.zza(this.zzJN, this.zzJH, this.zzJE);
                    this.zzJw.zzJt.zzb(null);
                } catch (IllegalStateException e) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (IllegalArgumentException e2) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (IOException e3) {
                    setResult(zzj(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                    this.zzJw.zzJt.zzb(null);
                } catch (Throwable th) {
                    this.zzJw.zzJt.zzb(null);
                }
            }
        }
    }

    public RemoteMediaPlayer() {
        this.zznh = new Object();
        this.zzJt = new zza(this);
        this.zzJs = new C06451(this, null);
        this.zzJs.zza(this.zzJt);
    }

    private void onMetadataUpdated() {
        if (this.zzJu != null) {
            this.zzJu.onMetadataUpdated();
        }
    }

    private void onStatusUpdated() {
        if (this.zzJv != null) {
            this.zzJv.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition() {
        long approximateStreamPosition;
        synchronized (this.zznh) {
            approximateStreamPosition = this.zzJs.getApproximateStreamPosition();
        }
        return approximateStreamPosition;
    }

    public MediaInfo getMediaInfo() {
        MediaInfo mediaInfo;
        synchronized (this.zznh) {
            mediaInfo = this.zzJs.getMediaInfo();
        }
        return mediaInfo;
    }

    public MediaStatus getMediaStatus() {
        MediaStatus mediaStatus;
        synchronized (this.zznh) {
            mediaStatus = this.zzJs.getMediaStatus();
        }
        return mediaStatus;
    }

    public String getNamespace() {
        return this.zzJs.getNamespace();
    }

    public long getStreamDuration() {
        long streamDuration;
        synchronized (this.zznh) {
            streamDuration = this.zzJs.getStreamDuration();
        }
        return streamDuration;
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient apiClient, MediaInfo mediaInfo) {
        return load(apiClient, mediaInfo, true, 0, null, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay) {
        return load(apiClient, mediaInfo, autoplay, 0, null, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay, long playPosition) {
        return load(apiClient, mediaInfo, autoplay, playPosition, null, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay, long playPosition, JSONObject customData) {
        return load(apiClient, mediaInfo, autoplay, playPosition, null, customData);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay, long playPosition, long[] activeTrackIds, JSONObject customData) {
        return apiClient.zzb(new C06954(this, apiClient, apiClient, mediaInfo, autoplay, playPosition, activeTrackIds, customData));
    }

    public void onMessageReceived(CastDevice castDevice, String namespace, String message) {
        this.zzJs.zzaI(message);
    }

    public PendingResult<MediaChannelResult> pause(GoogleApiClient apiClient) {
        return pause(apiClient, null);
    }

    public PendingResult<MediaChannelResult> pause(GoogleApiClient apiClient, JSONObject customData) {
        return apiClient.zzb(new C06965(this, apiClient, apiClient, customData));
    }

    public PendingResult<MediaChannelResult> play(GoogleApiClient apiClient) {
        return play(apiClient, null);
    }

    public PendingResult<MediaChannelResult> play(GoogleApiClient apiClient, JSONObject customData) {
        return apiClient.zzb(new C06987(this, apiClient, apiClient, customData));
    }

    public PendingResult<MediaChannelResult> requestStatus(GoogleApiClient apiClient) {
        return apiClient.zzb(new AnonymousClass11(this, apiClient, apiClient));
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient apiClient, long position) {
        return seek(apiClient, position, STATUS_SUCCEEDED, null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient apiClient, long position, int resumeState) {
        return seek(apiClient, position, resumeState, null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient apiClient, long position, int resumeState, JSONObject customData) {
        return apiClient.zzb(new C06998(this, apiClient, apiClient, position, resumeState, customData));
    }

    public PendingResult<MediaChannelResult> setActiveMediaTracks(GoogleApiClient apiClient, long[] trackIds) {
        if (trackIds != null) {
            return apiClient.zzb(new C06932(this, apiClient, apiClient, trackIds));
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener listener) {
        this.zzJu = listener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener listener) {
        this.zzJv = listener;
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient apiClient, boolean muteState) {
        return setStreamMute(apiClient, muteState, null);
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient apiClient, boolean muteState, JSONObject customData) {
        return apiClient.zzb(new AnonymousClass10(this, apiClient, apiClient, muteState, customData));
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient apiClient, double volume) throws IllegalArgumentException {
        return setStreamVolume(apiClient, volume, null);
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient apiClient, double volume, JSONObject customData) throws IllegalArgumentException {
        if (!Double.isInfinite(volume) && !Double.isNaN(volume)) {
            return apiClient.zzb(new C07009(this, apiClient, apiClient, volume, customData));
        }
        throw new IllegalArgumentException("Volume cannot be " + volume);
    }

    public PendingResult<MediaChannelResult> setTextTrackStyle(GoogleApiClient apiClient, TextTrackStyle trackStyle) {
        if (trackStyle != null) {
            return apiClient.zzb(new C06943(this, apiClient, apiClient, trackStyle));
        }
        throw new IllegalArgumentException("trackStyle cannot be null");
    }

    public PendingResult<MediaChannelResult> stop(GoogleApiClient apiClient) {
        return stop(apiClient, null);
    }

    public PendingResult<MediaChannelResult> stop(GoogleApiClient apiClient, JSONObject customData) {
        return apiClient.zzb(new C06976(this, apiClient, apiClient, customData));
    }
}
