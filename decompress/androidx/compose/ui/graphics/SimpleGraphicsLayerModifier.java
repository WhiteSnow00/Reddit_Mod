// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.graphics;

import cg2.i;
import c2.h0;
import c2.w;
import c2.x;
import o1.r;
import ng2.e;
import o1.q0;
import cg2.j;
import o1.u;
import mg2.l;
import o1.g0;
import o1.l0;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class SimpleGraphicsLayerModifier extends p0 implements a
{
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final long q;
    public final l0 r;
    public final boolean s;
    public final g0 t;
    public final long u;
    public final long v;
    public final l<u, j> w;
    
    public SimpleGraphicsLayerModifier() {
        throw null;
    }
    
    public SimpleGraphicsLayerModifier(final float g, final float h, final float i, final float j, final float k, final float l, final float m, final float n, final float o, final float p17, final long q, final l0 r, final boolean s, final g0 t, final long u, final long v, final l l2) {
        super(l2);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p17;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = (l<u, j>)new SimpleGraphicsLayerModifier$layerBlock.SimpleGraphicsLayerModifier$layerBlock$1(this);
    }
    
    public final boolean equals(final Object o) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier;
        if (o instanceof SimpleGraphicsLayerModifier) {
            simpleGraphicsLayerModifier = (SimpleGraphicsLayerModifier)o;
        }
        else {
            simpleGraphicsLayerModifier = null;
        }
        final boolean b = false;
        if (simpleGraphicsLayerModifier == null) {
            return false;
        }
        final boolean b2 = this.g == simpleGraphicsLayerModifier.g;
        boolean b3 = b;
        if (b2) {
            final boolean b4 = this.h == simpleGraphicsLayerModifier.h;
            b3 = b;
            if (b4) {
                final boolean b5 = this.i == simpleGraphicsLayerModifier.i;
                b3 = b;
                if (b5) {
                    final boolean b6 = this.j == simpleGraphicsLayerModifier.j;
                    b3 = b;
                    if (b6) {
                        final boolean b7 = this.k == simpleGraphicsLayerModifier.k;
                        b3 = b;
                        if (b7) {
                            final boolean b8 = this.l == simpleGraphicsLayerModifier.l;
                            b3 = b;
                            if (b8) {
                                final boolean b9 = this.m == simpleGraphicsLayerModifier.m;
                                b3 = b;
                                if (b9) {
                                    final boolean b10 = this.n == simpleGraphicsLayerModifier.n;
                                    b3 = b;
                                    if (b10) {
                                        final boolean b11 = this.o == simpleGraphicsLayerModifier.o;
                                        b3 = b;
                                        if (b11) {
                                            final boolean b12 = this.p == simpleGraphicsLayerModifier.p;
                                            b3 = b;
                                            if (b12) {
                                                final long q = this.q;
                                                final long q2 = simpleGraphicsLayerModifier.q;
                                                final int c = q0.c;
                                                final boolean b13 = q == q2;
                                                b3 = b;
                                                if (b13) {
                                                    b3 = b;
                                                    if (e.a((Object)this.r, (Object)simpleGraphicsLayerModifier.r)) {
                                                        b3 = b;
                                                        if (this.s == simpleGraphicsLayerModifier.s) {
                                                            b3 = b;
                                                            if (e.a((Object)this.t, (Object)simpleGraphicsLayerModifier.t)) {
                                                                b3 = b;
                                                                if (o1.r.c(this.u, simpleGraphicsLayerModifier.u)) {
                                                                    b3 = b;
                                                                    if (o1.r.c(this.v, simpleGraphicsLayerModifier.v)) {
                                                                        b3 = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    public final w h(final x x, final c2.u u, final long n) {
        e.f((Object)x, "$this$measure");
        final h0 s0 = u.s0(n);
        return x.N0(x, s0.f, s0.g, (l)new SimpleGraphicsLayerModifier$measure.SimpleGraphicsLayerModifier$measure$1(s0, this));
    }
    
    public final int hashCode() {
        final int b = aq2.a.b(this.p, aq2.a.b(this.o, aq2.a.b(this.n, aq2.a.b(this.m, aq2.a.b(this.l, aq2.a.b(this.k, aq2.a.b(this.j, aq2.a.b(this.i, aq2.a.b(this.h, Float.hashCode(this.g) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        final long q = this.q;
        final int c = q0.c;
        final int b2 = b.b(q, b, 31);
        final int hashCode = this.r.hashCode();
        final int hashCode2 = Boolean.hashCode(this.s);
        final g0 t = this.t;
        int hashCode3;
        if (t != null) {
            hashCode3 = t.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final long u = this.u;
        final int m = o1.r.m;
        return cg2.i.a(this.v) + t5.w.c(u, ((hashCode2 + (hashCode + b2) * 31) * 31 + hashCode3) * 31, 31);
    }
    
    public final String toString() {
        final StringBuilder t = a.t("SimpleGraphicsLayerModifier(scaleX=");
        t.append(this.g);
        t.append(", scaleY=");
        t.append(this.h);
        t.append(", alpha = ");
        t.append(this.i);
        t.append(", translationX=");
        t.append(this.j);
        t.append(", translationY=");
        t.append(this.k);
        t.append(", shadowElevation=");
        t.append(this.l);
        t.append(", rotationX=");
        t.append(this.m);
        t.append(", rotationY=");
        t.append(this.n);
        t.append(", rotationZ=");
        t.append(this.o);
        t.append(", cameraDistance=");
        t.append(this.p);
        t.append(", transformOrigin=");
        t.append((Object)q0.b(this.q));
        t.append(", shape=");
        t.append(this.r);
        t.append(", clip=");
        t.append(this.s);
        t.append(", renderEffect=");
        t.append(this.t);
        t.append(", ambientShadowColor=");
        a.A(this.u, t, ", spotShadowColor=");
        return ph0.a.d(this.v, t, ')');
    }
}
