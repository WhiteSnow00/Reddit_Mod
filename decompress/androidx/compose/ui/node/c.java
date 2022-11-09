// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import c2.h;
import o1.p;
import androidx.compose.ui.unit.LayoutDirection;
import e2.g;
import c2.z;
import pg2.j;
import c2.u;
import e2.l;
import c2.e0;
import o1.r;
import z0.h0;
import androidx.compose.ui.layout.a;
import o1.f;

public final class c extends LayoutNodeWrapper
{
    public static final f K;
    public LayoutNodeWrapper G;
    public a H;
    public boolean I;
    public h0<a> J;
    
    static {
        final f k = new f();
        k.c(r.g);
        k.v(1.0f);
        k.w(1);
        K = k;
    }
    
    public c(final LayoutNodeWrapper g, final a h) {
        ah2.f.f((Object)g, "wrapped");
        ah2.f.f((Object)h, "modifier");
        super(g.j);
        this.G = g;
        this.H = h;
    }
    
    public final int C(final int n) {
        return this.q1().h(this.W0(), this.G, n);
    }
    
    public final int D(final int n) {
        return this.q1().k(this.W0(), this.G, n);
    }
    
    public final int F(final int n) {
        return this.q1().y(this.W0(), this.G, n);
    }
    
    public final e0 I(final long n) {
        ((e0)this).t0(n);
        this.l1(this.H.u(this.W0(), (c2.r)this.G, n));
        final l a = super.A;
        if (a != null) {
            a.f(((e0)this).h);
        }
        this.h1();
        return (e0)this;
    }
    
    public final u W0() {
        return this.G.W0();
    }
    
    public final LayoutNodeWrapper Z0() {
        return this.G;
    }
    
    public final void f0(final long n, final float n2, final zg2.l<? super o1.u, j> l) {
        super.f0(n, n2, (zg2.l)l);
        final LayoutNodeWrapper k = super.k;
        boolean b = true;
        if (k == null || !k.v) {
            b = false;
        }
        if (b) {
            return;
        }
        for (g h = super.x[4]; h != null; h = h.h) {
            ((z)((g)h).g).R((c2.l)this);
        }
        final e0.a.a a = e0.a.a;
        final int c = (int)(((e0)this).h >> 32);
        final LayoutDirection layoutDirection = this.W0().getLayoutDirection();
        a.getClass();
        final int c2 = e0.a.c;
        final LayoutDirection b2 = e0.a.b;
        e0.a.c = c;
        e0.a.b = layoutDirection;
        this.V0().e();
        e0.a.c = c2;
        e0.a.b = b2;
    }
    
    public final void i1() {
        super.i1();
        final h0<a> j = this.J;
        if (j != null) {
            j.setValue(this.H);
        }
    }
    
    public final void j1(final p p) {
        ah2.f.f((Object)p, "canvas");
        this.G.R0(p);
        if (aj2.c.H0(super.j).getShowLayoutBounds()) {
            this.S0(p, c.K);
        }
    }
    
    public final a q1() {
        Object j;
        if ((j = this.J) == null) {
            j = a80.a.n0(this.H);
        }
        this.J = (h0<a>)j;
        return ((h0<a>)j).getValue();
    }
    
    public final void r1() {
        final l a = super.A;
        if (a != null) {
            a.invalidate();
        }
        this.G.k = this;
    }
    
    public final int u(final int n) {
        return this.q1().c(this.W0(), this.G, n);
    }
    
    public final int z0(final c2.a a) {
        ah2.f.f((Object)a, "alignmentLine");
        final boolean containsKey = this.V0().c().containsKey(a);
        int intValue = Integer.MIN_VALUE;
        if (containsKey) {
            final Integer n = this.V0().c().get(a);
            if (n != null) {
                intValue = n;
            }
            return intValue;
        }
        final int p = this.G.p(a);
        if (p == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        super.v = true;
        this.f0(super.t, super.u, (zg2.l<? super o1.u, j>)super.m);
        super.v = false;
        int n2;
        if (a instanceof h) {
            n2 = u2.g.b(this.G.t) + p;
        }
        else {
            n2 = (int)(this.G.t >> 32) + p;
        }
        return n2;
    }
}
