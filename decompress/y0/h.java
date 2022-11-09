// 
// Decompiled by Procyon v0.6.0
// 

package y0;

import q1.e;
import o1.r;
import e2.f;
import mj2.b0;
import o0.m;
import z0.h0;
import m0.l;

public abstract class h implements l
{
    public final k f;
    
    public h(final boolean b, final h0 h0) {
        this.f = new k(b, h0);
    }
    
    public abstract void e(final m p0, final b0 p1);
    
    public final void f(float n, long b, final f f) {
        final k f2 = this.f;
        f2.getClass();
        if (Float.isNaN(n)) {
            n = d.a(f, f2.a, f.b());
        }
        else {
            n = f.M0(n);
        }
        final float floatValue = ((Number)f2.c.d()).floatValue();
        if (floatValue > 0.0f) {
            final long b2 = r.b(b, floatValue);
            if (f2.a) {
                final float e = n1.f.e(f.b());
                final float c = n1.f.c(f.b());
                final q1.d g = f.f.g;
                b = g.b();
                g.a().save();
                g.a.b(0.0f, 0.0f, e, c, 1);
                q1.e.L(f, b2, n, 0L, null, 124);
                g.a().restore();
                g.c(b);
            }
            else {
                e.L(f, b2, n, 0L, null, 124);
            }
        }
    }
    
    public abstract void g(final m p0);
}
