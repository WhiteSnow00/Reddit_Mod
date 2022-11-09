// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import com.reddit.news.ui.composables.RecommendationContextSection;
import e2.m;
import o1.p;
import c2.z;
import pg2.j;
import e2.l;
import yd.a;
import j1.d;
import e2.g;
import c2.t;
import a1.e;
import java.util.List;
import c2.e0;
import c2.s;
import e2.c;
import o1.r;
import c2.u;
import o1.f;

public final class b extends LayoutNodeWrapper implements u2.b
{
    public static final f H;
    public final /* synthetic */ u G;
    
    static {
        final f h = new f();
        h.c(r.e);
        h.v(1.0f);
        h.w(1);
        H = h;
    }
    
    public b(final LayoutNode layoutNode) {
        ah2.f.f((Object)layoutNode, "layoutNode");
        super(layoutNode);
        this.G = layoutNode.v;
    }
    
    public final int C(final int n) {
        final c t = super.j.t;
        final s a = t.a();
        final LayoutNode a2 = t.a;
        return a.h(a2.v, a2.q(), n);
    }
    
    public final int D(final int n) {
        final c t = super.j.t;
        final s a = t.a();
        final LayoutNode a2 = t.a;
        return a.f(a2.v, a2.q(), n);
    }
    
    public final int F(final int n) {
        final c t = super.j.t;
        final s a = t.a();
        final LayoutNode a2 = t.a;
        return a.d(a2.v, a2.q(), n);
    }
    
    public final e0 I(final long n) {
        ((e0)this).t0(n);
        final e v = super.j.v();
        final int h = v.h;
        if (h > 0) {
            int n2 = 0;
            final T[] f = v.f;
            do {
                final LayoutNode layoutNode = (LayoutNode)f[n2];
                final LayoutNode$UsageByParent notUsed = LayoutNode$UsageByParent.NotUsed;
                layoutNode.getClass();
                ah2.f.f((Object)notUsed, "<set-?>");
                layoutNode.D = notUsed;
            } while (++n2 < h);
        }
        final LayoutNode j = super.j;
        final t c = j.s.c(j.v, j.q(), n);
        final LayoutNode i = super.j;
        i.getClass();
        ah2.f.f((Object)c, "measureResult");
        i.H.l1(c);
        this.h1();
        return (e0)this;
    }
    
    public final float M0(final float n) {
        return this.G.M0(n);
    }
    
    public final u W0() {
        return super.j.v;
    }
    
    public final long b0(final long n) {
        return this.G.b0(n);
    }
    
    public final <T extends g<T, M>, C, M extends d> void d1(final LayoutNodeWrapper$c<T, C, M> layoutNodeWrapper$c, final long n, final e2.b<C> b, final boolean b2, boolean b3) {
        ah2.f.f((Object)layoutNodeWrapper$c, "hitTestSource");
        ah2.f.f((Object)b, "hitTestResult");
        boolean b5 = false;
        Label_0146: {
            if (layoutNodeWrapper$c.e(super.j)) {
                boolean b4 = false;
                Label_0077: {
                    if (a.F1(n)) {
                        final l a = super.A;
                        if (a == null || !super.l || a.g(n)) {
                            b4 = true;
                            break Label_0077;
                        }
                    }
                    b4 = false;
                }
                if (b4) {
                    b5 = true;
                    break Label_0146;
                }
                if (b2) {
                    final float q0 = this.Q0(n, this.X0());
                    if (!Float.isInfinite(q0) && !Float.isNaN(q0)) {
                        b5 = true;
                        b3 = false;
                        break Label_0146;
                    }
                }
            }
            b5 = false;
        }
        if (b5) {
            final int h = b.h;
            final e t = super.j.t();
            int h2 = t.h;
            if (h2 > 0) {
                final T[] f = t.f;
                --h2;
                do {
                    final LayoutNode layoutNode = (LayoutNode)f[h2];
                    boolean b7 = false;
                    Label_0317: {
                        if (layoutNode.z) {
                            layoutNodeWrapper$c.c(layoutNode, n, (e2.b)b, b2, b3);
                            final long a2 = b.a();
                            boolean b6 = false;
                            Label_0303: {
                                if (Float.intBitsToFloat((int)(a2 >> 32)) < 0.0f && at1.a.Y0(a2)) {
                                    if (!layoutNode.I.k.m1()) {
                                        b6 = false;
                                        break Label_0303;
                                    }
                                    b.h = b.i - 1;
                                }
                                b6 = true;
                            }
                            if (!b6) {
                                b7 = true;
                                break Label_0317;
                            }
                        }
                        b7 = false;
                    }
                    if (b7) {
                        break;
                    }
                } while (--h2 >= 0);
            }
            b.h = h;
        }
    }
    
    public final long f(final long n) {
        return this.G.f(n);
    }
    
    public final void f0(final long n, float u, final zg2.l<? super o1.u, j> l) {
        super.f0(n, u, (zg2.l)l);
        final LayoutNodeWrapper k = super.k;
        final int n2 = 0;
        if (k != null && k.v) {
            return;
        }
        for (g h = super.x[4]; h != null; h = h.h) {
            ((z)((g)h).g).R((c2.l)this);
        }
        final LayoutNode j = super.j;
        final LayoutNode s = j.s();
        final b h2 = j.H;
        u = h2.u;
        androidx.compose.ui.node.c c;
        for (LayoutNodeWrapper layoutNodeWrapper = j.I.k; !ah2.f.a((Object)layoutNodeWrapper, (Object)h2); layoutNodeWrapper = c.G) {
            c = (androidx.compose.ui.node.c)layoutNodeWrapper;
            u += c.u;
        }
        if (u != j.J) {
            j.J = u;
            if (s != null) {
                s.M();
            }
            if (s != null) {
                s.y();
            }
        }
        if (!j.z) {
            if (s != null) {
                s.y();
            }
            j.G();
        }
        if (s != null) {
            if (!j.U && s.n == LayoutNode$LayoutState.LayingOut) {
                int n3 = n2;
                if (j.A == Integer.MAX_VALUE) {
                    n3 = 1;
                }
                if (n3 == 0) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                final int c2 = s.C;
                j.A = c2;
                s.C = c2 + 1;
            }
        }
        else {
            j.A = 0;
        }
        j.E();
    }
    
    public final float getDensity() {
        return this.G.getDensity();
    }
    
    public final float getFontScale() {
        return this.G.getFontScale();
    }
    
    public final float i(final long n) {
        return this.G.i(n);
    }
    
    public final long j(final float n) {
        return this.G.j(n);
    }
    
    public final void j1(final p p) {
        ah2.f.f((Object)p, "canvas");
        final m h0 = aj2.c.H0(super.j);
        final e t = super.j.t();
        final int h2 = t.h;
        if (h2 > 0) {
            int n = 0;
            final T[] f = t.f;
            do {
                final LayoutNode layoutNode = (LayoutNode)f[n];
                if (layoutNode.z) {
                    layoutNode.p(p);
                }
            } while (++n < h2);
        }
        if (h0.getShowLayoutBounds()) {
            this.S0(p, b.H);
        }
    }
    
    public final float q(final int n) {
        return this.G.q(n);
    }
    
    public final float r(final float n) {
        return this.G.r(n);
    }
    
    public final long s() {
        final float f = RecommendationContextSection.f;
        return this.G.s();
    }
    
    public final int s0(final float n) {
        return this.G.s0(n);
    }
    
    public final int u(final int n) {
        final c t = super.j.t;
        final s a = t.a();
        final LayoutNode a2 = t.a;
        return a.g(a2.v, a2.q(), n);
    }
    
    public final float x0(final long n) {
        return this.G.x0(n);
    }
    
    public final int z0(final c2.a a) {
        ah2.f.f((Object)a, "alignmentLine");
        final LayoutNode j = super.j;
        if (!j.I.n) {
            if (j.n == LayoutNode$LayoutState.Measuring) {
                final e2.e y = j.y;
                y.f = true;
                if (y.b) {
                    j.W = true;
                }
            }
            else {
                j.y.g = true;
            }
        }
        j.E();
        final Integer n = j.y.i.get(a);
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = Integer.MIN_VALUE;
        }
        return intValue;
    }
}
