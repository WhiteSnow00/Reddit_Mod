// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import sg2.e;
import u2.c;
import u2.b;

public final class i0 implements u
{
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public long l;
    public long m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public l0 s;
    public boolean t;
    public b u;
    public g0 v;
    
    public i0() {
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        final long a = o1.v.a;
        this.l = a;
        this.m = a;
        this.q = 8.0f;
        this.r = q0.b;
        this.s = f0.a;
        this.u = (b)new c(1.0f, 1.0f);
    }
    
    @Override
    public final void L(final boolean t) {
        this.t = t;
    }
    
    @Override
    public final void M(final long r) {
        this.r = r;
    }
    
    @Override
    public final void P(final float k) {
        this.k = k;
    }
    
    @Override
    public final void d(final float h) {
        this.h = h;
    }
    
    @Override
    public final void g(final float j) {
        this.j = j;
    }
    
    public final float getDensity() {
        return this.u.getDensity();
    }
    
    public final float getFontScale() {
        return this.u.getFontScale();
    }
    
    @Override
    public final void i0(final l0 s) {
        e.f((Object)s, "<set-?>");
        this.s = s;
    }
    
    @Override
    public final void l(final float q) {
        this.q = q;
    }
    
    @Override
    public final void m(final float n) {
        this.n = n;
    }
    
    @Override
    public final void n(final float o) {
        this.o = o;
    }
    
    @Override
    public final void p(final float p) {
        this.p = p;
    }
    
    @Override
    public final void t0(final long l) {
        this.l = l;
    }
    
    @Override
    public final void u(final float f) {
        this.f = f;
    }
    
    @Override
    public final void w(final float g) {
        this.g = g;
    }
    
    @Override
    public final void x(final float i) {
        this.i = i;
    }
    
    @Override
    public final void y0(final long m) {
        this.m = m;
    }
    
    @Override
    public final void z(final g0 v) {
        this.v = v;
    }
}
