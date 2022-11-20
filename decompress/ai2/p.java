// 
// Decompiled by Procyon v0.6.0
// 

package ai2;

import java.util.Collection;
import java.util.Set;
import oi2.q0;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import ch2.j0;
import java.util.ArrayList;
import oi2.o0;
import ri2.c;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import oi2.o;
import oi2.w0;
import oi2.x;
import ri2.b;
import java.util.List;
import oi2.w;
import ri2.g;
import ri2.i;
import ri2.h;
import ri2.f;
import ri2.j;
import pi2.a$a;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import ri2.k;
import ng2.e;
import java.util.HashMap;
import oi2.t;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import pi2.d;
import pi2.c$a;
import oi2.l0;
import java.util.Map;
import pi2.a;

public final class p implements a
{
    public final Map<l0, l0> f;
    public final c$a g;
    public final d h;
    public final KotlinTypePreparator i;
    public final mg2.p<t, t, Boolean> j;
    
    public p(final HashMap f, final c$a g, final d h, final KotlinTypePreparator i, final mg2.p j) {
        e.f((Object)g, "equalityAxioms");
        e.f((Object)h, "kotlinTypeRefiner");
        e.f((Object)i, "kotlinTypePreparator");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = (mg2.p<t, t, Boolean>)j;
    }
    
    public final TypeVariance A(final k k) {
        return a$a.C(k);
    }
    
    public final boolean B(final k k, final j j) {
        return a$a.E(k, j);
    }
    
    public final f D(final f f) {
        return a$a.q0((a)this, f);
    }
    
    public final int E(final j j) {
        return a$a.e0(j);
    }
    
    public final i G(final h h, final int n) {
        return a$a.n((a)this, h, n);
    }
    
    public final int I(final h h) {
        return a$a.h0((a)this, h);
    }
    
    public final boolean J(final f f) {
        e.f((Object)f, "$receiver");
        return f instanceof sh2.e;
    }
    
    public final g K(final f f) {
        return a$a.a0((a)this, f);
    }
    
    public final w L(final ri2.d d) {
        return a$a.h(d);
    }
    
    public final List<k> M(final j j) {
        return a$a.s(j);
    }
    
    public final boolean N(final j j) {
        return a$a.J(j);
    }
    
    public final boolean P(final i i) {
        return a$a.V(i);
    }
    
    public final g Q(final f f) {
        return a$a.o0((a)this, f);
    }
    
    public final boolean R(final g g) {
        return a$a.Q(g);
    }
    
    public final boolean T(final j j) {
        return a$a.P(j);
    }
    
    public final boolean U(final g g) {
        return a$a.M((f)g);
    }
    
    public final i V(final g g, final int n) {
        e.f((Object)g, "$receiver");
        int n2 = 0;
        if (n >= 0) {
            n2 = n2;
            if (n < this.s0((f)g)) {
                n2 = 1;
            }
        }
        i a0;
        if (n2 != 0) {
            a0 = this.a0((f)g, n);
        }
        else {
            a0 = null;
        }
        return a0;
    }
    
    public final boolean W(final j j) {
        return a$a.I(j);
    }
    
    public final TypeVariance X(final i i) {
        return a$a.B(i);
    }
    
    @Override
    public final b a(final g g) {
        return a$a.d((a)this, g);
    }
    
    public final i a0(final f f, final int n) {
        return a$a.o(f, n);
    }
    
    @Override
    public final x b(final ri2.d d) {
        return a$a.Z(d);
    }
    
    public final w0 b0(final f f) {
        return a$a.c0(f);
    }
    
    @Override
    public final x c(final ri2.d d) {
        return a$a.n0(d);
    }
    
    public final boolean c0(final f f) {
        e.f((Object)f, "$receiver");
        final oi2.p j = this.j(f);
        o e;
        if (j != null) {
            e = this.e((ri2.d)j);
        }
        else {
            e = null;
        }
        return e != null;
    }
    
    @Override
    public final x d(final f f) {
        return a$a.i(f);
    }
    
    public final boolean d0(final g g) {
        return a$a.X(g);
    }
    
    public final o e(final ri2.d d) {
        return a$a.f(d);
    }
    
    public final w0 e0(final b b) {
        return a$a.b0(b);
    }
    
    @Override
    public final x f(final g g, final boolean b) {
        return a$a.p0(g, b);
    }
    
    public final boolean f0(final g g) {
        return a$a.W(g);
    }
    
    @Override
    public final l0 g(final g g) {
        return a$a.l0(g);
    }
    
    public final pi2.b g0(final g g) {
        return a$a.i0((a)this, g);
    }
    
    public final boolean h(final b b) {
        return a$a.U(b);
    }
    
    public final boolean h0(final j j) {
        return a$a.H(j);
    }
    
    public final x i(final g g, final CaptureStatus captureStatus) {
        return a$a.k(g, captureStatus);
    }
    
    public final List<i> i0(final f f) {
        return a$a.p(f);
    }
    
    public final oi2.p j(final f f) {
        return a$a.g(f);
    }
    
    public final boolean j0(final g g) {
        e.f((Object)g, "$receiver");
        return this.v((j)this.g(g));
    }
    
    public final boolean k(final f f) {
        return a$a.S(f);
    }
    
    public final oi2.j l(final g g) {
        return a$a.e(g);
    }
    
    @Override
    public final w0 l0(final g g, final g g2) {
        return a$a.m((a)this, g, g2);
    }
    
    public final CaptureStatus m(final b b) {
        return a$a.l(b);
    }
    
    public final x m0(final c c) {
        return a$a.d0(c);
    }
    
    public final o0 n(final ri2.a a) {
        return a$a.g0(a);
    }
    
    public final w0 n0(final i i) {
        return a$a.w(i);
    }
    
    public final w0 o(final ArrayList list) {
        return a$a.G(list);
    }
    
    public final void o0(final g g, final j j) {
    }
    
    public final j p(final f f) {
        return a$a.m0((a)this, f);
    }
    
    public final boolean p0(final j j) {
        return a$a.L(j);
    }
    
    public final boolean q0(final g g) {
        e.f((Object)g, "$receiver");
        return this.W((j)this.g(g));
    }
    
    public final boolean r(final j j, final j i) {
        e.f((Object)j, "c1");
        e.f((Object)i, "c2");
        if (!(j instanceof l0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i instanceof l0) {
            final boolean a = a$a.a(j, i);
            boolean b = false;
            if (!a) {
                final l0 l0 = (l0)j;
                final l0 l2 = (l0)i;
                boolean b2 = false;
                Label_0147: {
                    Label_0140: {
                        if (!this.g.a(l0, l2)) {
                            final Map<l0, l0> f = this.f;
                            if (f != null) {
                                final l0 l3 = f.get(l0);
                                final l0 l4 = this.f.get(l2);
                                if ((l3 != null && e.a((Object)l3, (Object)l2)) || (l4 != null && e.a((Object)l4, (Object)l0))) {
                                    break Label_0140;
                                }
                            }
                            b2 = false;
                            break Label_0147;
                        }
                    }
                    b2 = true;
                }
                if (!b2) {
                    return b;
                }
            }
            b = true;
            return b;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final h r0(final g g) {
        return a$a.c(g);
    }
    
    public final boolean s(final b b) {
        e.f((Object)b, "$receiver");
        return b instanceof bi2.a;
    }
    
    public final int s0(final f f) {
        return a$a.b(f);
    }
    
    public final boolean t(final f f) {
        return a$a.K((a)this, f);
    }
    
    public final j0 t0(final ri2.o o) {
        return a$a.x(o);
    }
    
    public final NewCapturedTypeConstructor u(final b b) {
        return a$a.k0(b);
    }
    
    public final boolean u0(final g g, final g g2) {
        return a$a.F(g, g2);
    }
    
    public final boolean v(final j j) {
        return a$a.O(j);
    }
    
    public final boolean w(final g g) {
        e.f((Object)g, "$receiver");
        final x d = this.d((f)g);
        b a;
        if (d != null) {
            a = this.a((g)d);
        }
        else {
            a = null;
        }
        return a != null;
    }
    
    public final boolean w0(final f f) {
        e.f((Object)f, "$receiver");
        return this.z0(this.p(f)) && !this.k(f);
    }
    
    public final k x(final j j, final int n) {
        return a$a.r(j, n);
    }
    
    public final boolean x0(final f f) {
        e.f((Object)f, "$receiver");
        return this.R(this.K(f)) != this.R(this.Q(f));
    }
    
    public final q0 y(final f f) {
        return a$a.j(f);
    }
    
    public final Set y0(final g g) {
        return a$a.f0((a)this, g);
    }
    
    public final Collection<f> z(final j j) {
        return a$a.j0(j);
    }
    
    public final boolean z0(final j j) {
        return a$a.R(j);
    }
}
