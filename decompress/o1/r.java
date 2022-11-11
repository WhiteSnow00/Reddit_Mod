// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import hg2.i;
import al0.f0;
import ui.b;
import sg2.e;
import p1.c;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import aa1.a;

public final class r
{
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public final long a = a;
    
    static {
        b = a.e(4278190080L);
        a.e(4282664004L);
        c = a.e(4287137928L);
        a.e(4291611852L);
        d = a.e(4294967295L);
        e = a.e(4294901760L);
        f = a.e(4278255360L);
        g = a.e(4278190335L);
        h = a.e(4294967040L);
        i = a.e(4278255615L);
        j = a.e(4294902015L);
        k = a.d(0);
        l = a.c(0.0f, 0.0f, 0.0f, 0.0f, (c)ColorSpaces.s);
    }
    
    public static final long a(final long n, final c c) {
        sg2.e.f((Object)c, "colorSpace");
        if (sg2.e.a((Object)c, (Object)f(n))) {
            return n;
        }
        final p1.e z = wd.a.z(f(n), c, 2);
        final float[] n2 = a.n0(n);
        z.a(n2);
        return a.c(n2[0], n2[1], n2[2], n2[3], c);
    }
    
    public static long b(final long n, final float n2) {
        return a.c(h(n), g(n), e(n), n2, f(n));
    }
    
    public static final boolean c(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float d(final long n) {
        float n2;
        float n3;
        if ((0x3FL & n) == 0x0L) {
            n2 = (float)ui.b.e0(n >>> 56 & 0xFFL);
            n3 = 255.0f;
        }
        else {
            n2 = (float)ui.b.e0(n >>> 6 & 0x3FFL);
            n3 = 1023.0f;
        }
        return n2 / n3;
    }
    
    public static final float e(final long n) {
        float c;
        if ((0x3FL & n) == 0x0L) {
            c = (float)ui.b.e0(n >>> 32 & 0xFFL) / 255.0f;
        }
        else {
            c = t.c((short)(n >>> 16 & 0xFFFFL));
        }
        return c;
    }
    
    public static final c f(final long n) {
        final float[] a = ColorSpaces.a;
        return ColorSpaces.u[(int)(n & 0x3FL)];
    }
    
    public static final float g(final long n) {
        float c;
        if ((0x3FL & n) == 0x0L) {
            c = (float)ui.b.e0(n >>> 40 & 0xFFL) / 255.0f;
        }
        else {
            c = t.c((short)(n >>> 32 & 0xFFFFL));
        }
        return c;
    }
    
    public static final float h(final long n) {
        float c;
        if ((0x3FL & n) == 0x0L) {
            c = (float)ui.b.e0(n >>> 48 & 0xFFL) / 255.0f;
        }
        else {
            c = t.c((short)(n >>> 48 & 0xFFFFL));
        }
        return c;
    }
    
    public static String i(final long n) {
        final StringBuilder r = a.r("Color(");
        r.append(h(n));
        r.append(", ");
        r.append(g(n));
        r.append(", ");
        r.append(e(n));
        r.append(", ");
        r.append(d(n));
        r.append(", ");
        return f0.n(r, f(n).a, ')');
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof r;
        boolean b2 = false;
        if (b) {
            if (a == ((r)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return hg2.i.a(this.a);
    }
    
    @Override
    public final String toString() {
        return i(this.a);
    }
}
