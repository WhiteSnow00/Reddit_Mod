// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import ah2.f;
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
        this.s = (l0)f0.a;
        this.u = new c(1.0f, 1.0f);
    }
    
    @Override
    public final void J(final boolean t) {
        this.t = t;
    }
    
    @Override
    public final void K(final long r) {
        this.r = r;
    }
    
    @Override
    public final void O(final float k) {
        this.k = k;
    }
    
    @Override
    public final void d(final float h) {
        this.h = h;
    }
    
    @Override
    public final void e0(final l0 s) {
        ah2.f.f((Object)s, "<set-?>");
        this.s = s;
    }
    
    @Override
    public final void g(final float j) {
        this.j = j;
    }
    
    @Override
    public final float getDensity() {
        return this.u.getDensity();
    }
    
    @Override
    public final float getFontScale() {
        return this.u.getFontScale();
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
    public final void o(final float p) {
        this.p = p;
    }
    
    @Override
    public final void p0(final long l) {
        this.l = l;
    }
    
    @Override
    public final void t(final float f) {
        this.f = f;
    }
    
    @Override
    public final void u0(final long m) {
        this.m = m;
    }
    
    @Override
    public final void v(final float g) {
        this.g = g;
    }
    
    @Override
    public final void x(final float i) {
        this.i = i;
    }
    
    @Override
    public final void z(final g0 v) {
        this.v = v;
    }
}
