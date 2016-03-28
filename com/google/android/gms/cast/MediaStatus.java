package com.google.android.gms.cast;

import com.google.android.gms.internal.zzjv;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaStatus {
    public static final long COMMAND_PAUSE = 1;
    public static final long COMMAND_SEEK = 2;
    public static final long COMMAND_SET_VOLUME = 4;
    public static final long COMMAND_SKIP_BACKWARD = 32;
    public static final long COMMAND_SKIP_FORWARD = 16;
    public static final long COMMAND_TOGGLE_MUTE = 8;
    public static final int IDLE_REASON_CANCELED = 2;
    public static final int IDLE_REASON_ERROR = 4;
    public static final int IDLE_REASON_FINISHED = 1;
    public static final int IDLE_REASON_INTERRUPTED = 3;
    public static final int IDLE_REASON_NONE = 0;
    public static final int PLAYER_STATE_BUFFERING = 4;
    public static final int PLAYER_STATE_IDLE = 1;
    public static final int PLAYER_STATE_PAUSED = 3;
    public static final int PLAYER_STATE_PLAYING = 2;
    public static final int PLAYER_STATE_UNKNOWN = 0;
    private JSONObject zzIX;
    private MediaInfo zzIY;
    private long zzJg;
    private double zzJh;
    private int zzJi;
    private int zzJj;
    private long zzJk;
    private long zzJl;
    private double zzJm;
    private boolean zzJn;
    private long[] zzJo;

    public MediaStatus(JSONObject json) throws JSONException {
        zza(json, IDLE_REASON_NONE);
    }

    public long[] getActiveTrackIds() {
        return this.zzJo;
    }

    public JSONObject getCustomData() {
        return this.zzIX;
    }

    public int getIdleReason() {
        return this.zzJj;
    }

    public MediaInfo getMediaInfo() {
        return this.zzIY;
    }

    public double getPlaybackRate() {
        return this.zzJh;
    }

    public int getPlayerState() {
        return this.zzJi;
    }

    public long getStreamPosition() {
        return this.zzJk;
    }

    public double getStreamVolume() {
        return this.zzJm;
    }

    public boolean isMediaCommandSupported(long mediaCommand) {
        return (this.zzJl & mediaCommand) != 0;
    }

    public boolean isMute() {
        return this.zzJn;
    }

    public int zza(JSONObject jSONObject, int i) throws JSONException {
        int i2;
        double d;
        long zzb;
        long[] jArr;
        int i3 = PLAYER_STATE_PLAYING;
        Object obj = null;
        Object obj2 = PLAYER_STATE_IDLE;
        long j = jSONObject.getLong("mediaSessionId");
        if (j != this.zzJg) {
            this.zzJg = j;
            i2 = PLAYER_STATE_IDLE;
        } else {
            i2 = IDLE_REASON_NONE;
        }
        if (jSONObject.has("playerState")) {
            String string = jSONObject.getString("playerState");
            int i4 = string.equals("IDLE") ? PLAYER_STATE_IDLE : string.equals("PLAYING") ? PLAYER_STATE_PLAYING : string.equals("PAUSED") ? PLAYER_STATE_PAUSED : string.equals("BUFFERING") ? PLAYER_STATE_BUFFERING : IDLE_REASON_NONE;
            if (i4 != this.zzJi) {
                this.zzJi = i4;
                i2 |= PLAYER_STATE_PLAYING;
            }
            if (i4 == PLAYER_STATE_IDLE && jSONObject.has("idleReason")) {
                string = jSONObject.getString("idleReason");
                if (!string.equals("CANCELLED")) {
                    i3 = string.equals("INTERRUPTED") ? PLAYER_STATE_PAUSED : string.equals("FINISHED") ? PLAYER_STATE_IDLE : string.equals("ERROR") ? PLAYER_STATE_BUFFERING : IDLE_REASON_NONE;
                }
                if (i3 != this.zzJj) {
                    this.zzJj = i3;
                    i2 |= PLAYER_STATE_PLAYING;
                }
            }
        }
        if (jSONObject.has("playbackRate")) {
            d = jSONObject.getDouble("playbackRate");
            if (this.zzJh != d) {
                this.zzJh = d;
                i2 |= PLAYER_STATE_PLAYING;
            }
        }
        if (jSONObject.has("currentTime") && (i & PLAYER_STATE_PLAYING) == 0) {
            zzb = zzjv.zzb(jSONObject.getDouble("currentTime"));
            if (zzb != this.zzJk) {
                this.zzJk = zzb;
                i2 |= PLAYER_STATE_PLAYING;
            }
        }
        if (jSONObject.has("supportedMediaCommands")) {
            zzb = jSONObject.getLong("supportedMediaCommands");
            if (zzb != this.zzJl) {
                this.zzJl = zzb;
                i2 |= PLAYER_STATE_PLAYING;
            }
        }
        if (jSONObject.has("volume") && (i & PLAYER_STATE_IDLE) == 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("volume");
            d = jSONObject2.getDouble("level");
            if (d != this.zzJm) {
                this.zzJm = d;
                i2 |= PLAYER_STATE_PLAYING;
            }
            boolean z = jSONObject2.getBoolean("muted");
            if (z != this.zzJn) {
                this.zzJn = z;
                i2 |= PLAYER_STATE_PLAYING;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (i3 = IDLE_REASON_NONE; i3 < length; i3 += PLAYER_STATE_IDLE) {
                jArr2[i3] = jSONArray.getLong(i3);
            }
            if (this.zzJo != null && this.zzJo.length == length) {
                for (i3 = IDLE_REASON_NONE; i3 < length; i3 += PLAYER_STATE_IDLE) {
                    if (this.zzJo[i3] != jArr2[i3]) {
                        break;
                    }
                }
                obj2 = IDLE_REASON_NONE;
            }
            if (obj2 != null) {
                this.zzJo = jArr2;
            }
            obj = obj2;
            jArr = jArr2;
        } else if (this.zzJo != null) {
            obj = PLAYER_STATE_IDLE;
            jArr = null;
        } else {
            jArr = null;
        }
        if (obj != null) {
            this.zzJo = jArr;
            i2 |= PLAYER_STATE_PLAYING;
        }
        if (jSONObject.has("customData")) {
            this.zzIX = jSONObject.getJSONObject("customData");
            i2 |= PLAYER_STATE_PLAYING;
        }
        if (!jSONObject.has("media")) {
            return i2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("media");
        this.zzIY = new MediaInfo(jSONObject3);
        i2 |= PLAYER_STATE_PLAYING;
        return jSONObject3.has("metadata") ? i2 | PLAYER_STATE_BUFFERING : i2;
    }

    public long zzhj() {
        return this.zzJg;
    }
}
