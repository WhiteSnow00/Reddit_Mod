// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import android.os.Build$VERSION;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public final class e
{
    public static final Bitmap a(final w w) {
        sg2.e.f((Object)w, "<this>");
        if (w instanceof d) {
            return ((d)w).a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }
    
    public static final Bitmap$Config b(final int n) {
        final int n2 = 0;
        Bitmap$Config bitmap$Config;
        if (n == 0) {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        else if (n == 1) {
            bitmap$Config = Bitmap$Config.ALPHA_8;
        }
        else if (n == 2) {
            bitmap$Config = Bitmap$Config.RGB_565;
        }
        else {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 26 && n == 3) {
                bitmap$Config = Bitmap$Config.RGBA_F16;
            }
            else {
                if (sdk_INT >= 26) {
                    int n3 = n2;
                    if (n == 4) {
                        n3 = 1;
                    }
                    if (n3 != 0) {
                        bitmap$Config = Bitmap$Config.HARDWARE;
                        return bitmap$Config;
                    }
                }
                bitmap$Config = Bitmap$Config.ARGB_8888;
            }
        }
        return bitmap$Config;
    }
    
    public static final int c(final Bitmap$Config bitmap$Config) {
        int n;
        if (bitmap$Config == Bitmap$Config.ALPHA_8) {
            n = 1;
        }
        else if (bitmap$Config == Bitmap$Config.RGB_565) {
            n = 2;
        }
        else {
            if (bitmap$Config != Bitmap$Config.ARGB_4444) {
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 26 && bitmap$Config == Bitmap$Config.RGBA_F16) {
                    n = 3;
                    return n;
                }
                if (sdk_INT >= 26 && bitmap$Config == Bitmap$Config.HARDWARE) {
                    n = 4;
                    return n;
                }
            }
            n = 0;
        }
        return n;
    }
}
