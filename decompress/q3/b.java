// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import android.graphics.BlendModeColorFilter;
import android.graphics.BlendMode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.os.Build$VERSION;
import android.graphics.ColorFilter;
import androidx.core.graphics.BlendModeCompat;

public final class b
{
    public static ColorFilter a(final int n, final BlendModeCompat blendModeCompat) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object o = null;
        final ColorFilter colorFilter = null;
        if (sdk_INT >= 29) {
            final Object a = d.a(blendModeCompat);
            ColorFilter a2 = colorFilter;
            if (a != null) {
                a2 = b.a.a(n, a);
            }
            return a2;
        }
        PorterDuff$Mode porterDuff$Mode = null;
        Label_0266: {
            if (blendModeCompat != null) {
                switch (c.a[blendModeCompat.ordinal()]) {
                    case 18: {
                        porterDuff$Mode = PorterDuff$Mode.LIGHTEN;
                        break Label_0266;
                    }
                    case 17: {
                        porterDuff$Mode = PorterDuff$Mode.DARKEN;
                        break Label_0266;
                    }
                    case 16: {
                        porterDuff$Mode = PorterDuff$Mode.OVERLAY;
                        break Label_0266;
                    }
                    case 15: {
                        porterDuff$Mode = PorterDuff$Mode.SCREEN;
                        break Label_0266;
                    }
                    case 14: {
                        porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
                        break Label_0266;
                    }
                    case 13: {
                        porterDuff$Mode = PorterDuff$Mode.ADD;
                        break Label_0266;
                    }
                    case 12: {
                        porterDuff$Mode = PorterDuff$Mode.XOR;
                        break Label_0266;
                    }
                    case 11: {
                        porterDuff$Mode = PorterDuff$Mode.DST_ATOP;
                        break Label_0266;
                    }
                    case 10: {
                        porterDuff$Mode = PorterDuff$Mode.SRC_ATOP;
                        break Label_0266;
                    }
                    case 9: {
                        porterDuff$Mode = PorterDuff$Mode.DST_OUT;
                        break Label_0266;
                    }
                    case 8: {
                        porterDuff$Mode = PorterDuff$Mode.SRC_OUT;
                        break Label_0266;
                    }
                    case 7: {
                        porterDuff$Mode = PorterDuff$Mode.DST_IN;
                        break Label_0266;
                    }
                    case 6: {
                        porterDuff$Mode = PorterDuff$Mode.SRC_IN;
                        break Label_0266;
                    }
                    case 5: {
                        porterDuff$Mode = PorterDuff$Mode.DST_OVER;
                        break Label_0266;
                    }
                    case 4: {
                        porterDuff$Mode = PorterDuff$Mode.SRC_OVER;
                        break Label_0266;
                    }
                    case 3: {
                        porterDuff$Mode = PorterDuff$Mode.DST;
                        break Label_0266;
                    }
                    case 2: {
                        porterDuff$Mode = PorterDuff$Mode.SRC;
                        break Label_0266;
                    }
                    case 1: {
                        porterDuff$Mode = PorterDuff$Mode.CLEAR;
                        break Label_0266;
                    }
                }
            }
            porterDuff$Mode = null;
        }
        if (porterDuff$Mode != null) {
            o = new PorterDuffColorFilter(n, porterDuff$Mode);
        }
        return (ColorFilter)o;
    }
    
    public static final class a
    {
        public static ColorFilter a(final int n, final Object o) {
            return new BlendModeColorFilter(n, (BlendMode)o);
        }
    }
}
