// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material.ripple;

import kotlinx.coroutines.JobSupport;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import cg2.j;
import zi2.c0;
import java.util.Iterator;
import vl.a;
import u2.b;
import n1.f;
import y0.d;
import i1.s;
import java.util.Map;
import i1.t;
import ng2.e;
import z0.g0;
import o0.m;
import i1.o;
import y0.c;
import o1.r;
import z0.c1;
import z0.s0;
import y0.h;

public final class CommonRippleIndicationInstance extends h implements s0
{
    public final boolean g;
    public final float h;
    public final c1<r> i;
    public final c1<c> j;
    public final o<m, RippleAnimation> k;
    
    public CommonRippleIndicationInstance() {
        throw null;
    }
    
    public CommonRippleIndicationInstance(final boolean g, final float h, final g0 i, final g0 j) {
        super(g, j);
        this.g = g;
        this.h = h;
        this.i = (c1<r>)i;
        this.j = (c1<c>)j;
        this.k = new o<m, RippleAnimation>();
    }
    
    public final void a() {
    }
    
    public final void b(final q1.c c) {
        e.f((Object)c, "<this>");
        final long a = ((r)this.i.getValue()).a;
        c.i0();
        this.f(this.h, a, (q1.e)c);
        final Iterator iterator = this.k.g.iterator();
        while (((t)iterator).hasNext()) {
            final RippleAnimation rippleAnimation = ((Map.Entry)((s)iterator).next()).getValue();
            final float d = ((c)this.j.getValue()).d;
            if (d != 0.0f) {
                final long b = r.b(a, d);
                rippleAnimation.getClass();
                if (rippleAnimation.d == null) {
                    final long e = ((q1.e)c).e();
                    final float a2 = y0.d.a;
                    rippleAnimation.d = Math.max(f.f(e), f.d(e)) * 0.3f;
                }
                if (rippleAnimation.e == null) {
                    Float e2;
                    if (Float.isNaN(rippleAnimation.b)) {
                        e2 = y0.d.a((b)c, rippleAnimation.c, ((q1.e)c).e());
                    }
                    else {
                        e2 = ((b)c).M0(rippleAnimation.b);
                    }
                    rippleAnimation.e = e2;
                }
                if (rippleAnimation.a == null) {
                    rippleAnimation.a = new n1.c(((q1.e)c).e0());
                }
                if (rippleAnimation.f == null) {
                    rippleAnimation.f = new n1.c(vl.a.T(f.f(((q1.e)c).e()) / 2.0f, f.d(((q1.e)c).e()) / 2.0f));
                }
                float floatValue;
                if ((boolean)((SnapshotMutableStateImpl)rippleAnimation.l).getValue() && !(boolean)((SnapshotMutableStateImpl)rippleAnimation.k).getValue()) {
                    floatValue = 1.0f;
                }
                else {
                    floatValue = ((Number)rippleAnimation.g.d()).floatValue();
                }
                final Float d2 = rippleAnimation.d;
                e.c((Object)d2);
                final float floatValue2 = d2;
                final Float e3 = rippleAnimation.e;
                e.c((Object)e3);
                final float q0 = ah0.b.Q0(floatValue2, (float)e3, ((Number)rippleAnimation.h.d()).floatValue());
                final n1.c a3 = rippleAnimation.a;
                e.c((Object)a3);
                final float e4 = n1.c.e(a3.a);
                final n1.c f = rippleAnimation.f;
                e.c((Object)f);
                final float q2 = ah0.b.Q0(e4, n1.c.e(f.a), ((Number)rippleAnimation.i.d()).floatValue());
                final n1.c a4 = rippleAnimation.a;
                e.c((Object)a4);
                final float f2 = n1.c.f(a4.a);
                final n1.c f3 = rippleAnimation.f;
                e.c((Object)f3);
                final long t = vl.a.T(q2, ah0.b.Q0(f2, n1.c.f(f3.a), ((Number)rippleAnimation.i.d()).floatValue()));
                final long b2 = r.b(b, r.d(b) * floatValue);
                if (rippleAnimation.c) {
                    final float f4 = n1.f.f(((q1.e)c).e());
                    final float d3 = n1.f.d(((q1.e)c).e());
                    final q1.d c2 = (q1.d)((q1.e)c).c0();
                    final long e5 = c2.e();
                    c2.a().save();
                    c2.a.b(0.0f, 0.0f, f4, d3, 1);
                    q1.e.Q((q1.e)c, b2, q0, t, null, 120);
                    c2.a().restore();
                    c2.b(e5);
                }
                else {
                    q1.e.Q((q1.e)c, b2, q0, t, null, 120);
                }
            }
        }
    }
    
    public final void c() {
        this.k.clear();
    }
    
    public final void d() {
        this.k.clear();
    }
    
    public final void e(final m m, final c0 c0) {
        e.f((Object)m, "interaction");
        e.f((Object)c0, "scope");
        final Iterator iterator = this.k.g.iterator();
        while (iterator.hasNext()) {
            final RippleAnimation rippleAnimation = ((Map.Entry<K, RippleAnimation>)iterator.next()).getValue();
            ((SnapshotMutableStateImpl)rippleAnimation.l).setValue((Object)Boolean.TRUE);
            ((JobSupport)rippleAnimation.j).q0((Object)cg2.j.a);
        }
        n1.c c2;
        if (this.g) {
            c2 = new n1.c(m.a);
        }
        else {
            c2 = null;
        }
        final RippleAnimation rippleAnimation2 = new RippleAnimation(c2, this.h, this.g);
        this.k.put(m, rippleAnimation2);
        zi2.g.g(c0, null, null, (p)new CommonRippleIndicationInstance$addRipple$2(rippleAnimation2, this, m, (gg2.c)null), 3);
    }
    
    public final void g(final m m) {
        e.f((Object)m, "interaction");
        final RippleAnimation rippleAnimation = this.k.get(m);
        if (rippleAnimation != null) {
            ((SnapshotMutableStateImpl)rippleAnimation.l).setValue((Object)Boolean.TRUE);
            ((JobSupport)rippleAnimation.j).q0((Object)cg2.j.a);
        }
    }
}
