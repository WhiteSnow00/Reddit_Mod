// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import androidx.compose.ui.node.AlignmentLines;
import androidx.compose.ui.unit.LayoutDirection;
import c2.h0$a$a;
import c2.h0;
import androidx.compose.ui.node.LayoutNode;
import c2.m;
import mg2.l;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import java.util.Map;
import cg2.j;
import a01.a;
import u2.g;
import ng2.e;
import c2.w;
import java.util.LinkedHashMap;
import androidx.compose.ui.node.NodeCoordinator;
import c2.u;

public abstract class s extends r implements u
{
    public final NodeCoordinator l;
    public final h.s m;
    public long n;
    public LinkedHashMap o;
    public final c2.s p;
    public w q;
    public final LinkedHashMap r;
    
    public s(final NodeCoordinator l, final h.s m) {
        e.f((Object)l, "coordinator");
        e.f((Object)m, "lookaheadScope");
        this.l = l;
        this.m = m;
        this.n = g.b;
        this.p = new c2.s(this);
        this.r = new LinkedHashMap();
    }
    
    public static final void c1(final s s, final w q) {
        j a;
        if (q != null) {
            s.getClass();
            ((h0)s).I0(a01.a.f(q.getWidth(), q.getHeight()));
            a = j.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            ((h0)s).I0(0L);
        }
        if (!e.a((Object)s.q, (Object)q) && q != null) {
            final LinkedHashMap o = s.o;
            if (((o != null && !o.isEmpty()) || (q.c().isEmpty() ^ true)) && !e.a((Object)q.c(), (Object)s.o)) {
                final LayoutNodeLayoutDelegate.LayoutNodeLayoutDelegate$LookaheadPassDelegate l = s.l.l.H.l;
                e.c((Object)l);
                ((AlignmentLines)l.p).g();
                LinkedHashMap o2;
                if ((o2 = s.o) == null) {
                    o2 = new LinkedHashMap();
                    s.o = o2;
                }
                o2.clear();
                o2.putAll(q.c());
            }
        }
        s.q = q;
    }
    
    public final void E0(final long n, final float n2, final l<? super o1.u, j> l) {
        if (!g.b(this.n, n)) {
            this.n = n;
            final LayoutNodeLayoutDelegate.LayoutNodeLayoutDelegate$LookaheadPassDelegate i = this.l.l.H.l;
            if (i != null) {
                i.T0();
            }
            e2.r.a1(this.l);
        }
        if (super.j) {
            return;
        }
        this.d1();
    }
    
    public int L(final int n) {
        final NodeCoordinator m = this.l.m;
        e.c((Object)m);
        final s u = m.u;
        e.c((Object)u);
        return u.L(n);
    }
    
    public final r T0() {
        final NodeCoordinator m = this.l.m;
        s u;
        if (m != null) {
            u = m.u;
        }
        else {
            u = null;
        }
        return u;
    }
    
    public final m U0() {
        return (m)this.p;
    }
    
    public final boolean V0() {
        return this.q != null;
    }
    
    public final LayoutNode W0() {
        return this.l.l;
    }
    
    public final w X0() {
        final w q = this.q;
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }
    
    public final r Y0() {
        final NodeCoordinator n = this.l.n;
        s u;
        if (n != null) {
            u = n.u;
        }
        else {
            u = null;
        }
        return u;
    }
    
    public final long Z0() {
        return this.n;
    }
    
    public final Object b() {
        return this.l.b();
    }
    
    public final void b1() {
        this.E0(this.n, 0.0f, null);
    }
    
    public void d1() {
        final h0.a.h0$a$a a = h0.a.a;
        final int width = this.X0().getWidth();
        final LayoutDirection v = this.l.l.v;
        final m d = h0.a.d;
        a.getClass();
        final int c = h0.a.c;
        final LayoutDirection b = h0.a.b;
        h0.a.c = width;
        h0.a.b = v;
        final boolean o = h0$a$a.o(a, (r)this);
        this.X0().e();
        super.k = o;
        h0.a.c = c;
        h0.a.b = b;
        h0.a.d = d;
    }
    
    public final float getDensity() {
        return this.l.getDensity();
    }
    
    public final float getFontScale() {
        return this.l.getFontScale();
    }
    
    public final LayoutDirection getLayoutDirection() {
        return this.l.l.v;
    }
    
    public int l0(final int n) {
        final NodeCoordinator m = this.l.m;
        e.c((Object)m);
        final s u = m.u;
        e.c((Object)u);
        return u.l0(n);
    }
    
    public int r0(final int n) {
        final NodeCoordinator m = this.l.m;
        e.c((Object)m);
        final s u = m.u;
        e.c((Object)u);
        return u.r0(n);
    }
    
    public int t(final int n) {
        final NodeCoordinator m = this.l.m;
        e.c((Object)m);
        final s u = m.u;
        e.c((Object)u);
        return u.t(n);
    }
}
