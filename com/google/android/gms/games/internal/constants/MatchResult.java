package com.google.android.gms.games.internal.constants;

import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.location.places.Place;

public final class MatchResult {
    public static boolean isValid(int result) {
        switch (result) {
            case SpinnerCompat.MODE_DIALOG /*0*/:
            case CompletionEvent.STATUS_FAILURE /*1*/:
            case CompletionEvent.STATUS_CONFLICT /*2*/:
            case CompletionEvent.STATUS_CANCELED /*3*/:
            case Place.TYPE_AQUARIUM /*4*/:
            case Place.TYPE_ART_GALLERY /*5*/:
                return true;
            default:
                return false;
        }
    }
}
