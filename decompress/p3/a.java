// 
// Decompiled by Procyon v0.6.0
// 

package p3;

import q3.e;
import os.h;
import android.graphics.Color;

public final class a
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    
    public a(final float a, final float b, final float c, final float d, final float e, final float f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static a a(final int n) {
        final l k = l.k;
        final float i = h.i(Color.red(n));
        final float j = h.i(Color.green(n));
        final float l = h.i(Color.blue(n));
        final float[][] m = h.i;
        final float[] array = m[0];
        final float n2 = array[2] * l + (array[1] * j + array[0] * i);
        final float[] array2 = m[1];
        final float n3 = array2[2] * l + (array2[1] * j + array2[0] * i);
        final float[] array3 = m[2];
        final float n4 = l * array3[2] + (j * array3[1] + i * array3[0]);
        final float[][] f = h.f;
        final float[] array4 = f[0];
        final float n5 = array4[0];
        final float n6 = array4[1];
        final float n7 = array4[2];
        final float[] array5 = f[1];
        final float n8 = array5[0];
        final float n9 = array5[1];
        final float n10 = array5[2];
        final float[] array6 = f[2];
        final float n11 = array6[0];
        final float n12 = array6[1];
        final float n13 = array6[2];
        final float[] g = k.g;
        final float n14 = g[0] * (n7 * n4 + (n6 * n3 + n5 * n2));
        final float n15 = g[1] * (n10 * n4 + (n9 * n3 + n8 * n2));
        final float n16 = g[2] * (n4 * n13 + (n3 * n12 + n2 * n11));
        final float n17 = (float)Math.pow(Math.abs(n14) * k.h / 100.0, 0.42);
        final float n18 = (float)Math.pow(Math.abs(n15) * k.h / 100.0, 0.42);
        final float n19 = (float)Math.pow(Math.abs(n16) * k.h / 100.0, 0.42);
        final float n20 = Math.signum(n14) * 400.0f * n17 / (n17 + 27.13f);
        final float n21 = Math.signum(n15) * 400.0f * n18 / (n18 + 27.13f);
        final float n22 = Math.signum(n16) * 400.0f * n19 / (n19 + 27.13f);
        final double n23 = n20;
        final double n24 = n21;
        final double n25 = n22;
        final float n26 = (float)(n24 * -12.0 + n23 * 11.0 + n25) / 11.0f;
        final float n27 = (float)(n20 + n21 - n25 * 2.0) / 9.0f;
        final float n28 = n21 * 20.0f;
        final float n29 = (21.0f * n22 + (n20 * 20.0f + n28)) / 20.0f;
        final float n30 = (n20 * 40.0f + n28 + n22) / 20.0f;
        final float n31 = (float)Math.atan2(n27, n26) * 180.0f / 3.1415927f;
        float n32;
        if (n31 < 0.0f) {
            n32 = n31 + 360.0f;
        }
        else {
            n32 = n31;
            if (n31 >= 360.0f) {
                n32 = n31 - 360.0f;
            }
        }
        final float n33 = 3.1415927f * n32 / 180.0f;
        final float n34 = (float)Math.pow(n30 * k.b / k.a, k.d * k.j) * 100.0f;
        Math.sqrt(n34 / 100.0f);
        float n35;
        if (n32 < 20.14) {
            n35 = 360.0f + n32;
        }
        else {
            n35 = n32;
        }
        final float n36 = (float)Math.pow(1.64 - Math.pow(0.29, k.f), 0.73) * (float)Math.pow((float)(Math.cos(n35 * 3.141592653589793 / 180.0 + 2.0) + 3.8) * 0.25f * 3846.1538f * k.e * k.c * (float)Math.sqrt(n27 * n27 + n26 * n26) / (n29 + 0.305f), 0.9);
        final float n37 = n36 * (float)Math.sqrt(n34 / 100.0);
        final float i2 = k.i;
        Math.sqrt(n36 * k.d / (k.a + 4.0f));
        final float n38 = 1.7f * n34 / (0.007f * n34 + 1.0f);
        final float n39 = (float)Math.log(i2 * n37 * 0.0228f + 1.0f) * 43.85965f;
        final double n40 = n33;
        return new a(n32, n37, n34, n38, n39 * (float)Math.cos(n40), n39 * (float)Math.sin(n40));
    }
    
    public static a b(final float n, final float n2, final float n3) {
        final l k = l.k;
        final float d = k.d;
        final double n4 = n / 100.0;
        Math.sqrt(n4);
        final float i = k.i;
        Math.sqrt(n2 / (float)Math.sqrt(n4) * k.d / (k.a + 4.0f));
        final float n5 = 3.1415927f * n3 / 180.0f;
        final float n6 = 1.7f * n / (0.007f * n + 1.0f);
        final float n7 = (float)Math.log(i * n2 * 0.0228 + 1.0) * 43.85965f;
        final double n8 = n5;
        return new a(n3, n2, n, n6, n7 * (float)Math.cos(n8), n7 * (float)Math.sin(n8));
    }
    
    public final int c(final l l) {
        final float b = this.b;
        float n2 = 0.0f;
        Label_0044: {
            if (b != 0.0) {
                final double n = this.c;
                if (n != 0.0) {
                    n2 = b / (float)Math.sqrt(n / 100.0);
                    break Label_0044;
                }
            }
            n2 = 0.0f;
        }
        final float n3 = (float)Math.pow(n2 / Math.pow(1.64 - Math.pow(0.29, l.f), 0.73), 1.1111111111111112);
        final double n4 = this.a * 3.1415927f / 180.0f;
        final float n5 = (float)(Math.cos(2.0 + n4) + 3.8);
        final float a = l.a;
        final float n6 = (float)Math.pow(this.c / 100.0, 1.0 / l.d / l.j);
        final float e = l.e;
        final float c = l.c;
        final float n7 = a * n6 / l.b;
        final float n8 = (float)Math.sin(n4);
        final float n9 = (float)Math.cos(n4);
        final float n10 = (0.305f + n7) * 23.0f * n3 / (n3 * 108.0f * n8 + (11.0f * n3 * n9 + n5 * 0.25f * 3846.1538f * e * c * 23.0f));
        final float n11 = n9 * n10;
        final float n12 = n10 * n8;
        final float n13 = n7 * 460.0f;
        final float n14 = (288.0f * n12 + (451.0f * n11 + n13)) / 1403.0f;
        final float n15 = (n13 - 891.0f * n11 - 261.0f * n12) / 1403.0f;
        final float n16 = (n13 - n11 * 220.0f - n12 * 6300.0f) / 1403.0f;
        final float n17 = (float)Math.max(0.0, Math.abs(n14) * 27.13 / (400.0 - Math.abs(n14)));
        final float signum = Math.signum(n14);
        final float n18 = 100.0f / l.h;
        final float n19 = (float)Math.pow(n17, 2.380952380952381);
        final float n20 = (float)Math.max(0.0, Math.abs(n15) * 27.13 / (400.0 - Math.abs(n15)));
        final float signum2 = Math.signum(n15);
        final float n21 = 100.0f / l.h;
        final float n22 = (float)Math.pow(n20, 2.380952380952381);
        final float n23 = (float)Math.max(0.0, Math.abs(n16) * 27.13 / (400.0 - Math.abs(n16)));
        final float signum3 = Math.signum(n16);
        final float n24 = 100.0f / l.h;
        final float n25 = (float)Math.pow(n23, 2.380952380952381);
        final float[] g = l.g;
        final float n26 = n18 * signum * n19 / g[0];
        final float n27 = n21 * signum2 * n22 / g[1];
        final float n28 = n24 * signum3 * n25 / g[2];
        final float[][] g2 = h.g;
        final float[] array = g2[0];
        final float n29 = array[0];
        final float n30 = array[1];
        final float n31 = array[2];
        final float[] array2 = g2[1];
        final float n32 = array2[0];
        final float n33 = array2[1];
        final float n34 = array2[2];
        final float[] array3 = g2[2];
        return q3.e.b(n31 * n28 + (n30 * n27 + n29 * n26), n34 * n28 + (n33 * n27 + n32 * n26), n28 * array3[2] + (n27 * array3[1] + n26 * array3[0]));
    }
}
