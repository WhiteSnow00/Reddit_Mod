// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import android.graphics.PorterDuff$Mode;
import android.graphics.BlendMode;

public final class a
{
    public static final BlendMode a(final int n) {
        final int n2 = 0;
        BlendMode blendMode;
        if (n == 0) {
            blendMode = BlendMode.CLEAR;
        }
        else if (n == 1) {
            blendMode = BlendMode.SRC;
        }
        else if (n == 2) {
            blendMode = BlendMode.DST;
        }
        else if (n == 3) {
            blendMode = BlendMode.SRC_OVER;
        }
        else if (n == 4) {
            blendMode = BlendMode.DST_OVER;
        }
        else if (n == 5) {
            blendMode = BlendMode.SRC_IN;
        }
        else if (n == 6) {
            blendMode = BlendMode.DST_IN;
        }
        else if (n == 7) {
            blendMode = BlendMode.SRC_OUT;
        }
        else if (n == 8) {
            blendMode = BlendMode.DST_OUT;
        }
        else if (n == 9) {
            blendMode = BlendMode.SRC_ATOP;
        }
        else if (n == 10) {
            blendMode = BlendMode.DST_ATOP;
        }
        else if (n == 11) {
            blendMode = BlendMode.XOR;
        }
        else if (n == 12) {
            blendMode = BlendMode.PLUS;
        }
        else if (n == 13) {
            blendMode = BlendMode.MODULATE;
        }
        else if (n == 14) {
            blendMode = BlendMode.SCREEN;
        }
        else if (n == 15) {
            blendMode = BlendMode.OVERLAY;
        }
        else if (n == 16) {
            blendMode = BlendMode.DARKEN;
        }
        else if (n == 17) {
            blendMode = BlendMode.LIGHTEN;
        }
        else if (n == 18) {
            blendMode = BlendMode.COLOR_DODGE;
        }
        else if (n == 19) {
            blendMode = BlendMode.COLOR_BURN;
        }
        else if (n == 20) {
            blendMode = BlendMode.HARD_LIGHT;
        }
        else if (n == 21) {
            blendMode = BlendMode.SOFT_LIGHT;
        }
        else if (n == 22) {
            blendMode = BlendMode.DIFFERENCE;
        }
        else if (n == 23) {
            blendMode = BlendMode.EXCLUSION;
        }
        else if (n == 24) {
            blendMode = BlendMode.MULTIPLY;
        }
        else if (n == 25) {
            blendMode = BlendMode.HUE;
        }
        else if (n == 26) {
            blendMode = BlendMode.SATURATION;
        }
        else if (n == 27) {
            blendMode = BlendMode.COLOR;
        }
        else {
            int n3 = n2;
            if (n == 28) {
                n3 = 1;
            }
            if (n3 != 0) {
                blendMode = BlendMode.LUMINOSITY;
            }
            else {
                blendMode = BlendMode.SRC_OVER;
            }
        }
        return blendMode;
    }
    
    public static final PorterDuff$Mode b(final int n) {
        final int n2 = 0;
        PorterDuff$Mode porterDuff$Mode;
        if (n == 0) {
            porterDuff$Mode = PorterDuff$Mode.CLEAR;
        }
        else if (n == 1) {
            porterDuff$Mode = PorterDuff$Mode.SRC;
        }
        else if (n == 2) {
            porterDuff$Mode = PorterDuff$Mode.DST;
        }
        else if (n == 3) {
            porterDuff$Mode = PorterDuff$Mode.SRC_OVER;
        }
        else if (n == 4) {
            porterDuff$Mode = PorterDuff$Mode.DST_OVER;
        }
        else if (n == 5) {
            porterDuff$Mode = PorterDuff$Mode.SRC_IN;
        }
        else if (n == 6) {
            porterDuff$Mode = PorterDuff$Mode.DST_IN;
        }
        else if (n == 7) {
            porterDuff$Mode = PorterDuff$Mode.SRC_OUT;
        }
        else if (n == 8) {
            porterDuff$Mode = PorterDuff$Mode.DST_OUT;
        }
        else if (n == 9) {
            porterDuff$Mode = PorterDuff$Mode.SRC_ATOP;
        }
        else if (n == 10) {
            porterDuff$Mode = PorterDuff$Mode.DST_ATOP;
        }
        else if (n == 11) {
            porterDuff$Mode = PorterDuff$Mode.XOR;
        }
        else if (n == 12) {
            porterDuff$Mode = PorterDuff$Mode.ADD;
        }
        else if (n == 14) {
            porterDuff$Mode = PorterDuff$Mode.SCREEN;
        }
        else if (n == 15) {
            porterDuff$Mode = PorterDuff$Mode.OVERLAY;
        }
        else if (n == 16) {
            porterDuff$Mode = PorterDuff$Mode.DARKEN;
        }
        else if (n == 17) {
            porterDuff$Mode = PorterDuff$Mode.LIGHTEN;
        }
        else {
            int n3 = n2;
            if (n == 13) {
                n3 = 1;
            }
            if (n3 != 0) {
                porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
            }
            else {
                porterDuff$Mode = PorterDuff$Mode.SRC_OVER;
            }
        }
        return porterDuff$Mode;
    }
}
