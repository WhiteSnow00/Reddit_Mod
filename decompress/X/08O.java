// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;

public final class 08O
{
    public static final ThreadLocal<double[]> LIZ;
    
    static {
        Covode.recordClassIndex(883);
        LIZ = new ThreadLocal<double[]>();
    }
    
    public static double LIZ(int blue) {
        final ThreadLocal<double[]> liz = 08O.LIZ;
        double[] array;
        if ((array = liz.get()) == null) {
            array = new double[3];
            liz.set(array);
        }
        final int red = Color.red(blue);
        final int green = Color.green(blue);
        blue = Color.blue(blue);
        if (array.length == 3) {
            final double n = red / 255.0;
            double pow;
            if (n < 0.04045) {
                pow = n / 12.92;
            }
            else {
                pow = Math.pow((n + 0.055) / 1.055, 2.4);
            }
            final double n2 = green / 255.0;
            double pow2;
            if (n2 < 0.04045) {
                pow2 = n2 / 12.92;
            }
            else {
                pow2 = Math.pow((n2 + 0.055) / 1.055, 2.4);
            }
            final double n3 = blue / 255.0;
            double pow3;
            if (n3 < 0.04045) {
                pow3 = n3 / 12.92;
            }
            else {
                pow3 = Math.pow((n3 + 0.055) / 1.055, 2.4);
            }
            array[0] = (0.4124 * pow + 0.3576 * pow2 + 0.1805 * pow3) * 100.0;
            array[1] = (0.2126 * pow + 0.7152 * pow2 + 0.0722 * pow3) * 100.0;
            array[2] = (pow * 0.0193 + pow2 * 0.1192 + pow3 * 0.9505) * 100.0;
            return array[1] / 100.0;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
    
    public static float LIZ(final float n, final float n2) {
        if (n < 0.0f) {
            return 0.0f;
        }
        if (n > n2) {
            return n2;
        }
        return n;
    }
    
    public static int LIZ(final int n, final int n2) {
        final int alpha = Color.alpha(n2);
        final int alpha2 = Color.alpha(n);
        final int lizj = LIZJ(alpha2, alpha);
        return Color.argb(lizj, LIZ(Color.red(n), alpha2, Color.red(n2), alpha, lizj), LIZ(Color.green(n), alpha2, Color.green(n2), alpha, lizj), LIZ(Color.blue(n), alpha2, Color.blue(n2), alpha, lizj));
    }
    
    public static int LIZ(final int n, final int n2, final float n3) {
        final int alpha = Color.alpha(n2);
        int n4 = 255;
        if (alpha != 255) {
            final StringBuilder sb = new StringBuilder("background can not be translucent: #");
            sb.append(Integer.toHexString(n2));
            throw new IllegalArgumentException(sb.toString());
        }
        final double lizlll = LIZLLL(LIZIZ(n, 255), n2);
        final double n5 = n3;
        if (lizlll < n5) {
            return -1;
        }
        int n6 = 0;
        int n7 = 0;
        do {
            final int n8 = (n7 + n4) / 2;
            if (LIZLLL(LIZIZ(n, n8), n2) < n5) {
                n7 = n8;
            }
            else {
                n4 = n8;
            }
        } while (++n6 <= 10 && n4 - n7 > 1);
        return n4;
    }
    
    public static int LIZ(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return 0;
        }
        return (n * 255 * n2 + n3 * n4 * (255 - n2)) / (n5 * 255);
    }
    
    public static void LIZ(final int n, final int n2, final int n3, final float[] array) {
        final float n4 = n / 255.0f;
        final float n5 = n2 / 255.0f;
        final float n6 = n3 / 255.0f;
        final float max = Math.max(n4, Math.max(n5, n6));
        final float min = Math.min(n4, Math.min(n5, n6));
        final float n7 = max - min;
        final float n8 = (max + min) / 2.0f;
        float n9;
        float n10;
        if (max == min) {
            n9 = 0.0f;
            n10 = 0.0f;
        }
        else {
            if (max == n4) {
                n9 = (n5 - n6) / n7 % 6.0f;
            }
            else if (max == n5) {
                n9 = (n6 - n4) / n7 + 2.0f;
            }
            else {
                n9 = 4.0f + (n4 - n5) / n7;
            }
            n10 = n7 / (1.0f - Math.abs(2.0f * n8 - 1.0f));
        }
        float n12;
        final float n11 = n12 = n9 * 60.0f % 360.0f;
        if (n11 < 0.0f) {
            n12 = n11 + 360.0f;
        }
        array[0] = LIZ(n12, 360.0f);
        array[1] = LIZ(n10, 1.0f);
        array[2] = LIZ(n8, 1.0f);
    }
    
    public static void LIZ(final int n, final float[] array) {
        LIZ(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    public static int LIZIZ(final int n, final int n2) {
        if (n2 >= 0 && n2 <= 255) {
            return (n & 0xFFFFFF) | n2 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
    
    public static int LIZIZ(final int n, final int n2, final float n3) {
        final float n4 = 1.0f - n3;
        return Color.argb((int)(Color.alpha(n) * n4 + Color.alpha(n2) * n3), (int)(Color.red(n) * n4 + Color.red(n2) * n3), (int)(Color.green(n) * n4 + Color.green(n2) * n3), (int)(Color.blue(n) * n4 + Color.blue(n2) * n3));
    }
    
    public static int LIZJ(final int n, final int n2) {
        return 255 - (255 - n2) * (255 - n) / 255;
    }
    
    public static double LIZLLL(final int n, final int n2) {
        if (Color.alpha(n2) == 255) {
            int liz = n;
            if (Color.alpha(n) < 255) {
                liz = LIZ(n, n2);
            }
            final double n3 = LIZ(liz) + 0.05;
            final double n4 = LIZ(n2) + 0.05;
            return Math.max(n3, n4) / Math.min(n3, n4);
        }
        final StringBuilder sb = new StringBuilder("background can not be translucent: #");
        sb.append(Integer.toHexString(n2));
        throw new IllegalArgumentException(sb.toString());
    }
}
