// 
// Decompiled by Procyon v0.6.0
// 

package sj2;

import kotlin.time.DurationUnit;
import lg.e0;
import sg2.e;
import rj2.c;
import qj2.d;
import qj2.d$i;
import dj2.a;
import pj2.b;

public final class u implements b<a>
{
    public static final u a;
    public static final w0 b;
    
    static {
        a = new u();
        b = new w0("kotlin.time.Duration", (d)d$i.a);
    }
    
    public final Object deserialize(c x) {
        e.f((Object)x, "decoder");
        final int i = dj2.a.i;
        x = (c)x.x();
        e.f((Object)x, "value");
        try {
            return new a(e0.k((String)x));
        }
        catch (final IllegalArgumentException ex) {
            throw new IllegalArgumentException(a.k("Invalid ISO duration string format: '", (String)x, "'."), ex);
        }
    }
    
    public final qj2.e getDescriptor() {
        return (qj2.e)u.b;
    }
    
    public final void serialize(final rj2.d d, final Object o) {
        final long f = ((a)o).f;
        e.f((Object)d, "encoder");
        final int i = dj2.a.i;
        final StringBuilder sb = new StringBuilder();
        final long n = lcmp(f, 0L);
        final int n2 = 1;
        if (n < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long n3;
        if (n < 0) {
            n3 = ((int)f & 0x1) + (-(f >> 1) << 1);
            final int a = dj2.b.a;
        }
        else {
            n3 = f;
        }
        final long o2 = dj2.a.o(n3, DurationUnit.HOURS);
        final int h = dj2.a.h(n3);
        final int k = dj2.a.k(n3);
        final int j = dj2.a.i(n3);
        long n4 = o2;
        if (dj2.a.l(f)) {
            n4 = 9999999999999L;
        }
        final boolean b = n4 != 0L;
        final boolean b2 = k != 0 || j != 0;
        int n5 = n2;
        if (h == 0) {
            if (b2 && b) {
                n5 = n2;
            }
            else {
                n5 = 0;
            }
        }
        if (b) {
            sb.append(n4);
            sb.append('H');
        }
        if (n5 != 0) {
            sb.append(h);
            sb.append('M');
        }
        if (b2 || (!b && n5 == 0)) {
            dj2.a.c(sb, k, j, 9, "S", true);
        }
        final String string = sb.toString();
        e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        d.w(string);
    }
}
