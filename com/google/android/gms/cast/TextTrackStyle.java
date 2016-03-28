package com.google.android.gms.cast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zzjv;
import com.google.android.gms.internal.zzma;
import com.google.android.gms.internal.zzme;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle {
    public static final int COLOR_UNSPECIFIED = 0;
    public static final float DEFAULT_FONT_SCALE = 1.0f;
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int EDGE_TYPE_UNSPECIFIED = -1;
    public static final int FONT_FAMILY_CASUAL = 4;
    public static final int FONT_FAMILY_CURSIVE = 5;
    public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
    public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
    public static final int FONT_FAMILY_SANS_SERIF = 0;
    public static final int FONT_FAMILY_SERIF = 2;
    public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
    public static final int FONT_FAMILY_UNSPECIFIED = -1;
    public static final int FONT_STYLE_BOLD = 1;
    public static final int FONT_STYLE_BOLD_ITALIC = 3;
    public static final int FONT_STYLE_ITALIC = 2;
    public static final int FONT_STYLE_NORMAL = 0;
    public static final int FONT_STYLE_UNSPECIFIED = -1;
    public static final int WINDOW_TYPE_NONE = 0;
    public static final int WINDOW_TYPE_NORMAL = 1;
    public static final int WINDOW_TYPE_ROUNDED = 2;
    public static final int WINDOW_TYPE_UNSPECIFIED = -1;
    private int zzAz;
    private JSONObject zzIX;
    private float zzJP;
    private int zzJQ;
    private int zzJR;
    private int zzJS;
    private int zzJT;
    private int zzJU;
    private int zzJV;
    private String zzJW;
    private int zzJX;
    private int zzJY;

    public TextTrackStyle() {
        clear();
    }

    private void clear() {
        this.zzJP = DEFAULT_FONT_SCALE;
        this.zzJQ = WINDOW_TYPE_NONE;
        this.zzAz = WINDOW_TYPE_NONE;
        this.zzJR = WINDOW_TYPE_UNSPECIFIED;
        this.zzJS = WINDOW_TYPE_NONE;
        this.zzJT = WINDOW_TYPE_UNSPECIFIED;
        this.zzJU = WINDOW_TYPE_NONE;
        this.zzJV = WINDOW_TYPE_NONE;
        this.zzJW = null;
        this.zzJX = WINDOW_TYPE_UNSPECIFIED;
        this.zzJY = WINDOW_TYPE_UNSPECIFIED;
        this.zzIX = null;
    }

    public static TextTrackStyle fromSystemSettings(Context context) {
        TextTrackStyle textTrackStyle = new TextTrackStyle();
        if (!zzme.zzkj()) {
            return textTrackStyle;
        }
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        textTrackStyle.setFontScale(captioningManager.getFontScale());
        CaptionStyle userStyle = captioningManager.getUserStyle();
        textTrackStyle.setBackgroundColor(userStyle.backgroundColor);
        textTrackStyle.setForegroundColor(userStyle.foregroundColor);
        switch (userStyle.edgeType) {
            case WINDOW_TYPE_NORMAL /*1*/:
                textTrackStyle.setEdgeType(WINDOW_TYPE_NORMAL);
                break;
            case WINDOW_TYPE_ROUNDED /*2*/:
                textTrackStyle.setEdgeType(WINDOW_TYPE_ROUNDED);
                break;
            default:
                textTrackStyle.setEdgeType(WINDOW_TYPE_NONE);
                break;
        }
        textTrackStyle.setEdgeColor(userStyle.edgeColor);
        Typeface typeface = userStyle.getTypeface();
        if (typeface != null) {
            if (Typeface.MONOSPACE.equals(typeface)) {
                textTrackStyle.setFontGenericFamily(WINDOW_TYPE_NORMAL);
            } else if (Typeface.SANS_SERIF.equals(typeface)) {
                textTrackStyle.setFontGenericFamily(WINDOW_TYPE_NONE);
            } else if (Typeface.SERIF.equals(typeface)) {
                textTrackStyle.setFontGenericFamily(WINDOW_TYPE_ROUNDED);
            } else {
                textTrackStyle.setFontGenericFamily(WINDOW_TYPE_NONE);
            }
            boolean isBold = typeface.isBold();
            boolean isItalic = typeface.isItalic();
            if (isBold && isItalic) {
                textTrackStyle.setFontStyle(FONT_STYLE_BOLD_ITALIC);
            } else if (isBold) {
                textTrackStyle.setFontStyle(WINDOW_TYPE_NORMAL);
            } else if (isItalic) {
                textTrackStyle.setFontStyle(WINDOW_TYPE_ROUNDED);
            } else {
                textTrackStyle.setFontStyle(WINDOW_TYPE_NONE);
            }
        }
        return textTrackStyle;
    }

    private int zzaH(String str) {
        int i = WINDOW_TYPE_NONE;
        if (str != null && str.length() == 9 && str.charAt(i) == '#') {
            try {
                i = Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(WINDOW_TYPE_NORMAL, FONT_STYLE_BOLD_ITALIC), 16), Integer.parseInt(str.substring(FONT_STYLE_BOLD_ITALIC, FONT_FAMILY_CURSIVE), 16), Integer.parseInt(str.substring(FONT_FAMILY_CURSIVE, 7), 16));
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    private String zzy(int i) {
        Object[] objArr = new Object[FONT_FAMILY_CASUAL];
        objArr[WINDOW_TYPE_NONE] = Integer.valueOf(Color.red(i));
        objArr[WINDOW_TYPE_NORMAL] = Integer.valueOf(Color.green(i));
        objArr[WINDOW_TYPE_ROUNDED] = Integer.valueOf(Color.blue(i));
        objArr[FONT_STYLE_BOLD_ITALIC] = Integer.valueOf(Color.alpha(i));
        return String.format("#%02X%02X%02X%02X", objArr);
    }

    public boolean equals(Object other) {
        boolean z = true;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) other;
        if ((this.zzIX == null ? WINDOW_TYPE_NORMAL : false) != (textTrackStyle.zzIX == null ? WINDOW_TYPE_NORMAL : false)) {
            return false;
        }
        if (this.zzIX != null && textTrackStyle.zzIX != null && !zzma.zzd(this.zzIX, textTrackStyle.zzIX)) {
            return false;
        }
        if (!(this.zzJP == textTrackStyle.zzJP && this.zzJQ == textTrackStyle.zzJQ && this.zzAz == textTrackStyle.zzAz && this.zzJR == textTrackStyle.zzJR && this.zzJS == textTrackStyle.zzJS && this.zzJT == textTrackStyle.zzJT && this.zzJV == textTrackStyle.zzJV && zzjv.zza(this.zzJW, textTrackStyle.zzJW) && this.zzJX == textTrackStyle.zzJX && this.zzJY == textTrackStyle.zzJY)) {
            z = false;
        }
        return z;
    }

    public int getBackgroundColor() {
        return this.zzAz;
    }

    public JSONObject getCustomData() {
        return this.zzIX;
    }

    public int getEdgeColor() {
        return this.zzJS;
    }

    public int getEdgeType() {
        return this.zzJR;
    }

    public String getFontFamily() {
        return this.zzJW;
    }

    public int getFontGenericFamily() {
        return this.zzJX;
    }

    public float getFontScale() {
        return this.zzJP;
    }

    public int getFontStyle() {
        return this.zzJY;
    }

    public int getForegroundColor() {
        return this.zzJQ;
    }

    public int getWindowColor() {
        return this.zzJU;
    }

    public int getWindowCornerRadius() {
        return this.zzJV;
    }

    public int getWindowType() {
        return this.zzJT;
    }

    public int hashCode() {
        return zzw.hashCode(Float.valueOf(this.zzJP), Integer.valueOf(this.zzJQ), Integer.valueOf(this.zzAz), Integer.valueOf(this.zzJR), Integer.valueOf(this.zzJS), Integer.valueOf(this.zzJT), Integer.valueOf(this.zzJU), Integer.valueOf(this.zzJV), this.zzJW, Integer.valueOf(this.zzJX), Integer.valueOf(this.zzJY), this.zzIX);
    }

    public void setBackgroundColor(int backgroundColor) {
        this.zzAz = backgroundColor;
    }

    public void setCustomData(JSONObject customData) {
        this.zzIX = customData;
    }

    public void setEdgeColor(int edgeColor) {
        this.zzJS = edgeColor;
    }

    public void setEdgeType(int edgeType) {
        if (edgeType < 0 || edgeType > FONT_FAMILY_CASUAL) {
            throw new IllegalArgumentException("invalid edgeType");
        }
        this.zzJR = edgeType;
    }

    public void setFontFamily(String fontFamily) {
        this.zzJW = fontFamily;
    }

    public void setFontGenericFamily(int fontGenericFamily) {
        if (fontGenericFamily < 0 || fontGenericFamily > FONT_FAMILY_SMALL_CAPITALS) {
            throw new IllegalArgumentException("invalid fontGenericFamily");
        }
        this.zzJX = fontGenericFamily;
    }

    public void setFontScale(float fontScale) {
        this.zzJP = fontScale;
    }

    public void setFontStyle(int fontStyle) {
        if (fontStyle < 0 || fontStyle > FONT_STYLE_BOLD_ITALIC) {
            throw new IllegalArgumentException("invalid fontStyle");
        }
        this.zzJY = fontStyle;
    }

    public void setForegroundColor(int foregroundColor) {
        this.zzJQ = foregroundColor;
    }

    public void setWindowColor(int windowColor) {
        this.zzJU = windowColor;
    }

    public void setWindowCornerRadius(int windowCornerRadius) {
        if (windowCornerRadius < 0) {
            throw new IllegalArgumentException("invalid windowCornerRadius");
        }
        this.zzJV = windowCornerRadius;
    }

    public void setWindowType(int windowType) {
        if (windowType < 0 || windowType > WINDOW_TYPE_ROUNDED) {
            throw new IllegalArgumentException("invalid windowType");
        }
        this.zzJT = windowType;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", (double) this.zzJP);
            if (this.zzJQ != 0) {
                jSONObject.put("foregroundColor", zzy(this.zzJQ));
            }
            if (this.zzAz != 0) {
                jSONObject.put("backgroundColor", zzy(this.zzAz));
            }
            switch (this.zzJR) {
                case WINDOW_TYPE_NONE /*0*/:
                    jSONObject.put("edgeType", "NONE");
                    break;
                case WINDOW_TYPE_NORMAL /*1*/:
                    jSONObject.put("edgeType", "OUTLINE");
                    break;
                case WINDOW_TYPE_ROUNDED /*2*/:
                    jSONObject.put("edgeType", "DROP_SHADOW");
                    break;
                case FONT_STYLE_BOLD_ITALIC /*3*/:
                    jSONObject.put("edgeType", "RAISED");
                    break;
                case FONT_FAMILY_CASUAL /*4*/:
                    jSONObject.put("edgeType", "DEPRESSED");
                    break;
            }
            if (this.zzJS != 0) {
                jSONObject.put("edgeColor", zzy(this.zzJS));
            }
            switch (this.zzJT) {
                case WINDOW_TYPE_NONE /*0*/:
                    jSONObject.put("windowType", "NONE");
                    break;
                case WINDOW_TYPE_NORMAL /*1*/:
                    jSONObject.put("windowType", "NORMAL");
                    break;
                case WINDOW_TYPE_ROUNDED /*2*/:
                    jSONObject.put("windowType", "ROUNDED_CORNERS");
                    break;
            }
            if (this.zzJU != 0) {
                jSONObject.put("windowColor", zzy(this.zzJU));
            }
            if (this.zzJT == WINDOW_TYPE_ROUNDED) {
                jSONObject.put("windowRoundedCornerRadius", this.zzJV);
            }
            if (this.zzJW != null) {
                jSONObject.put("fontFamily", this.zzJW);
            }
            switch (this.zzJX) {
                case WINDOW_TYPE_NONE /*0*/:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case WINDOW_TYPE_NORMAL /*1*/:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case WINDOW_TYPE_ROUNDED /*2*/:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case FONT_STYLE_BOLD_ITALIC /*3*/:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case FONT_FAMILY_CASUAL /*4*/:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case FONT_FAMILY_CURSIVE /*5*/:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case FONT_FAMILY_SMALL_CAPITALS /*6*/:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            switch (this.zzJY) {
                case WINDOW_TYPE_NONE /*0*/:
                    jSONObject.put("fontStyle", "NORMAL");
                    break;
                case WINDOW_TYPE_NORMAL /*1*/:
                    jSONObject.put("fontStyle", "BOLD");
                    break;
                case WINDOW_TYPE_ROUNDED /*2*/:
                    jSONObject.put("fontStyle", "ITALIC");
                    break;
                case FONT_STYLE_BOLD_ITALIC /*3*/:
                    jSONObject.put("fontStyle", "BOLD_ITALIC");
                    break;
            }
            if (this.zzIX != null) {
                jSONObject.put("customData", this.zzIX);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public void zzd(JSONObject jSONObject) throws JSONException {
        String string;
        clear();
        this.zzJP = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.zzJQ = zzaH(jSONObject.optString("foregroundColor"));
        this.zzAz = zzaH(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.zzJR = WINDOW_TYPE_NONE;
            } else if ("OUTLINE".equals(string)) {
                this.zzJR = WINDOW_TYPE_NORMAL;
            } else if ("DROP_SHADOW".equals(string)) {
                this.zzJR = WINDOW_TYPE_ROUNDED;
            } else if ("RAISED".equals(string)) {
                this.zzJR = FONT_STYLE_BOLD_ITALIC;
            } else if ("DEPRESSED".equals(string)) {
                this.zzJR = FONT_FAMILY_CASUAL;
            }
        }
        this.zzJS = zzaH(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            string = jSONObject.getString("windowType");
            if ("NONE".equals(string)) {
                this.zzJT = WINDOW_TYPE_NONE;
            } else if ("NORMAL".equals(string)) {
                this.zzJT = WINDOW_TYPE_NORMAL;
            } else if ("ROUNDED_CORNERS".equals(string)) {
                this.zzJT = WINDOW_TYPE_ROUNDED;
            }
        }
        this.zzJU = zzaH(jSONObject.optString("windowColor"));
        if (this.zzJT == WINDOW_TYPE_ROUNDED) {
            this.zzJV = jSONObject.optInt("windowRoundedCornerRadius", WINDOW_TYPE_NONE);
        }
        this.zzJW = jSONObject.optString("fontFamily", null);
        if (jSONObject.has("fontGenericFamily")) {
            string = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string)) {
                this.zzJX = WINDOW_TYPE_NONE;
            } else if ("MONOSPACED_SANS_SERIF".equals(string)) {
                this.zzJX = WINDOW_TYPE_NORMAL;
            } else if ("SERIF".equals(string)) {
                this.zzJX = WINDOW_TYPE_ROUNDED;
            } else if ("MONOSPACED_SERIF".equals(string)) {
                this.zzJX = FONT_STYLE_BOLD_ITALIC;
            } else if ("CASUAL".equals(string)) {
                this.zzJX = FONT_FAMILY_CASUAL;
            } else if ("CURSIVE".equals(string)) {
                this.zzJX = FONT_FAMILY_CURSIVE;
            } else if ("SMALL_CAPITALS".equals(string)) {
                this.zzJX = FONT_FAMILY_SMALL_CAPITALS;
            }
        }
        if (jSONObject.has("fontStyle")) {
            string = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string)) {
                this.zzJY = WINDOW_TYPE_NONE;
            } else if ("BOLD".equals(string)) {
                this.zzJY = WINDOW_TYPE_NORMAL;
            } else if ("ITALIC".equals(string)) {
                this.zzJY = WINDOW_TYPE_ROUNDED;
            } else if ("BOLD_ITALIC".equals(string)) {
                this.zzJY = FONT_STYLE_BOLD_ITALIC;
            }
        }
        this.zzIX = jSONObject.optJSONObject("customData");
    }
}
