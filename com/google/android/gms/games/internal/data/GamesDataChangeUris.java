package com.google.android.gms.games.internal.data;

import android.net.Uri;
import com.google.android.gms.games.Games;

public final class GamesDataChangeUris {
    private static final Uri zzahK;
    public static final Uri zzahL;
    public static final Uri zzahM;

    static {
        zzahK = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        zzahL = zzahK.buildUpon().appendPath("invitations").build();
        zzahM = zzahK.buildUpon().appendEncodedPath(Games.EXTRA_PLAYER_IDS).build();
    }
}
