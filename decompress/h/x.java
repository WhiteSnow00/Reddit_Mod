// 
// Decompiled by Procyon v0.6.0
// 

package h;

import a81.e;

public final class x
{
    public static x d;
    public long a;
    public long b;
    public int c;
    
    public final void a(double n, double n2, final long n3) {
        final float n4 = (n3 - 946728000000L) / 8.64E7f;
        final float n5 = 0.01720197f * n4 + 6.24006f;
        final double n6 = n5;
        final double n7 = Math.sin(n5 * 3.0f) * 5.236000106378924E-6 + (Math.sin(2.0f * n5) * 3.4906598739326E-4 + (Math.sin(n6) * 0.03341960161924362 + n6)) + 1.796593063 + 3.141592653589793;
        n2 = -n2 / 360.0;
        n2 = Math.sin(2.0 * n7) * -0.0069 + (Math.sin(n6) * 0.0053 + (Math.round(n4 - 9.0E-4f - n2) + 9.0E-4f + n2));
        final double asin = Math.asin(Math.sin(0.4092797040939331) * Math.sin(n7));
        final double n8 = 0.01745329238474369 * n;
        final double sin = Math.sin(-0.10471975803375244);
        final double sin2 = Math.sin(n8);
        n = Math.sin(asin);
        n = e.d(asin, Math.cos(n8), sin - n * sin2);
        if (n >= 1.0) {
            this.c = 1;
            this.a = -1L;
            this.b = -1L;
            return;
        }
        if (n <= -1.0) {
            this.c = 0;
            this.a = -1L;
            this.b = -1L;
            return;
        }
        n = (float)(Math.acos(n) / 6.283185307179586);
        this.a = Math.round((n2 + n) * 8.64E7) + 946728000000L;
        final long b = Math.round((n2 - n) * 8.64E7) + 946728000000L;
        this.b = b;
        if (b < n3 && this.a > n3) {
            this.c = 0;
        }
        else {
            this.c = 1;
        }
    }
}
