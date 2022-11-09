// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import android.graphics.Color;

public final class e
{
    public static final ThreadLocal<double[]> a;
    
    static {
        a = new ThreadLocal<double[]>();
    }
    
    public static void a(final int n, final int n2, final int n3, final float[] array) {
        final float n4 = n / 255.0f;
        final float n5 = n2 / 255.0f;
        final float n6 = n3 / 255.0f;
        final float max = Math.max(n4, Math.max(n5, n6));
        final float min = Math.min(n4, Math.min(n5, n6));
        final float n7 = max - min;
        final float n8 = (max + min) / 2.0f;
        final float n9 = 0.0f;
        float n11;
        float n10;
        if (max == min) {
            n10 = (n11 = 0.0f);
        }
        else {
            float n12;
            if (max == n4) {
                n12 = (n5 - n6) / n7 % 6.0f;
            }
            else if (max == n5) {
                n12 = (n6 - n4) / n7 + 2.0f;
            }
            else {
                n12 = 4.0f + (n4 - n5) / n7;
            }
            final float n13 = n7 / (1.0f - Math.abs(2.0f * n8 - 1.0f));
            n10 = n12;
            n11 = n13;
        }
        float n15;
        final float n14 = n15 = n10 * 60.0f % 360.0f;
        if (n14 < 0.0f) {
            n15 = n14 + 360.0f;
        }
        float min2;
        if (n15 < 0.0f) {
            min2 = 0.0f;
        }
        else {
            min2 = Math.min(n15, 360.0f);
        }
        array[0] = min2;
        float min3;
        if (n11 < 0.0f) {
            min3 = 0.0f;
        }
        else {
            min3 = Math.min(n11, 1.0f);
        }
        array[1] = min3;
        float min4;
        if (n8 < 0.0f) {
            min4 = n9;
        }
        else {
            min4 = Math.min(n8, 1.0f);
        }
        array[2] = min4;
    }
    
    public static int b(double n, double n2, double n3) {
        final double n4 = (-0.4986 * n3 + (-1.5372 * n2 + 3.2406 * n)) / 100.0;
        final double n5 = (0.0415 * n3 + (1.8758 * n2 + -0.9689 * n)) / 100.0;
        n3 = (1.057 * n3 + (-0.204 * n2 + 0.0557 * n)) / 100.0;
        if (n4 > 0.0031308) {
            n = Math.pow(n4, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n = n4 * 12.92;
        }
        if (n5 > 0.0031308) {
            n2 = Math.pow(n5, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n2 = n5 * 12.92;
        }
        if (n3 > 0.0031308) {
            n3 = Math.pow(n3, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n3 *= 12.92;
        }
        final int n6 = (int)Math.round(n * 255.0);
        int min = 0;
        int min2;
        if (n6 < 0) {
            min2 = 0;
        }
        else {
            min2 = Math.min(n6, 255);
        }
        final int n7 = (int)Math.round(n2 * 255.0);
        int min3;
        if (n7 < 0) {
            min3 = 0;
        }
        else {
            min3 = Math.min(n7, 255);
        }
        final int n8 = (int)Math.round(n3 * 255.0);
        if (n8 >= 0) {
            min = Math.min(n8, 255);
        }
        return Color.rgb(min2, min3, min);
    }
    
    public static int c(final float n, final int n2, final int n3) {
        final float n4 = 1.0f - n;
        return Color.argb((int)(Color.alpha(n3) * n + Color.alpha(n2) * n4), (int)(Color.red(n3) * n + Color.red(n2) * n4), (int)(Color.green(n3) * n + Color.green(n2) * n4), (int)(Color.blue(n3) * n + Color.blue(n2) * n4));
    }
    
    public static double d(final int n, final int n2) {
        if (Color.alpha(n2) == 255) {
            int g = n;
            if (Color.alpha(n) < 255) {
                g = g(n, n2);
            }
            final double n3 = e(g) + 0.05;
            final double n4 = e(n2) + 0.05;
            return Math.max(n3, n4) / Math.min(n3, n4);
        }
        final StringBuilder k = a.k("background can not be translucent: #");
        k.append(Integer.toHexString(n2));
        throw new IllegalArgumentException(k.toString());
    }
    
    public static double e(int blue) {
        final ThreadLocal<double[]> a = e.a;
        double[] array;
        if ((array = a.get()) == null) {
            array = new double[3];
            a.set(array);
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
            array[0] = (0.1805 * pow3 + (0.3576 * pow2 + 0.4124 * pow)) * 100.0;
            final double n4 = (0.0722 * pow3 + (0.7152 * pow2 + 0.2126 * pow)) * 100.0;
            array[1] = n4;
            array[2] = (pow3 * 0.9505 + (pow2 * 0.1192 + pow * 0.0193)) * 100.0;
            return n4 / 100.0;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
    
    public static int f(final float n, final int n2, final int n3) {
        final int alpha = Color.alpha(n3);
        int n4 = 255;
        if (alpha != 255) {
            final StringBuilder k = a.k("background can not be translucent: #");
            k.append(Integer.toHexString(n3));
            throw new IllegalArgumentException(k.toString());
        }
        final double d = d(h(n2, 255), n3);
        final double n5 = n;
        if (d < n5) {
            return -1;
        }
        for (int n6 = 0, n7 = 0; n6 <= 10 && n4 - n7 > 1; ++n6) {
            final int n8 = (n7 + n4) / 2;
            if (d(h(n2, n8), n3) < n5) {
                n7 = n8;
            }
            else {
                n4 = n8;
            }
        }
        return n4;
    }
    
    public static int g(int blue, int blue2) {
        final int alpha = Color.alpha(blue2);
        final int alpha2 = Color.alpha(blue);
        final int n = 255 - alpha2;
        final int n2 = 255 - (255 - alpha) * n / 255;
        final int red = Color.red(blue);
        final int red2 = Color.red(blue2);
        final int n3 = 0;
        int n4;
        if (n2 == 0) {
            n4 = 0;
        }
        else {
            n4 = (red2 * alpha * n + red * 255 * alpha2) / (n2 * 255);
        }
        final int green = Color.green(blue);
        final int green2 = Color.green(blue2);
        int n5;
        if (n2 == 0) {
            n5 = 0;
        }
        else {
            n5 = (green2 * alpha * n + green * 255 * alpha2) / (n2 * 255);
        }
        blue = Color.blue(blue);
        blue2 = Color.blue(blue2);
        if (n2 == 0) {
            blue = n3;
        }
        else {
            blue = (blue2 * alpha * n + blue * 255 * alpha2) / (n2 * 255);
        }
        return Color.argb(n2, n4, n5, blue);
    }
    
    public static int h(final int n, final int n2) {
        if (n2 >= 0 && n2 <= 255) {
            return (n & 0xFFFFFF) | n2 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
