// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import android.graphics.Canvas;
import androidx.compose.ui.platform.p0;
import m0.h;
import androidx.compose.ui.platform.InspectableValueKt;
import mj2.c0;
import z0.a1;
import z0.i0;
import at1.a;
import ah2.c;
import ah2.f;
import android.content.Context;
import j1.d;
import pg2.j;
import u2.i;
import zg2.l;
import z0.l0;
import java.util.List;
import android.widget.EdgeEffect;
import m0.p;
import m0.q;

public final class AndroidEdgeEffectOverscrollEffect implements q
{
    public final p a;
    public final EdgeEffect b;
    public final EdgeEffect c;
    public final EdgeEffect d;
    public final EdgeEffect e;
    public final List<EdgeEffect> f;
    public final EdgeEffect g;
    public final EdgeEffect h;
    public final EdgeEffect i;
    public final EdgeEffect j;
    public final l0 k;
    public boolean l;
    public boolean m;
    public long n;
    public final l0 o;
    public boolean p;
    public final l<i, j> q;
    public final d r;
    
    public AndroidEdgeEffectOverscrollEffect(final Context context, final p a) {
        ah2.f.f((Object)context, "context");
        this.a = a;
        final EdgeEffect l = dg.d.L(context);
        this.b = l;
        final EdgeEffect i = dg.d.L(context);
        this.c = i;
        final EdgeEffect j = dg.d.L(context);
        this.d = j;
        final EdgeEffect k = dg.d.L(context);
        this.e = k;
        int n = 0;
        final List y = ah2.c.Y((Object[])new EdgeEffect[] { j, l, k, i });
        this.f = y;
        this.g = dg.d.L(context);
        this.h = dg.d.L(context);
        this.i = dg.d.L(context);
        this.j = dg.d.L(context);
        while (n < y.size()) {
            ((EdgeEffect)y.get(n)).setColor(at1.a.X1(this.a.a));
            ++n;
        }
        this.k = a80.a.m0(pg2.j.a, (a1)i0.a);
        this.l = true;
        this.n = n1.f.b;
        this.o = a80.a.n0(Boolean.FALSE);
        final AndroidEdgeEffectOverscrollEffect$onNewSize.AndroidEdgeEffectOverscrollEffect$onNewSize$1 q = new AndroidEdgeEffectOverscrollEffect$onNewSize.AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.q = (l<i, j>)q;
        final d b = AndroidOverscrollKt.b;
        ah2.f.f((Object)b, "other");
        this.r = c0.N(b, (l)q).f0((d)new h(this, (l<? super p0, j>)InspectableValueKt.a));
    }
    
    public final boolean a() {
        final List<EdgeEffect> f = this.f;
        final int size = f.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            if (dg.d.c0((EdgeEffect)f.get(n)) == 0.0f ^ true) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final j b(final long n) {
        boolean b = false;
        this.m = false;
        if (u2.l.b(n) > 0.0f) {
            dg.d.M0(this.d, at1.a.D1(u2.l.b(n)));
        }
        else if (u2.l.b(n) < 0.0f) {
            dg.d.M0(this.e, -at1.a.D1(u2.l.b(n)));
        }
        if (u2.l.c(n) > 0.0f) {
            dg.d.M0(this.b, at1.a.D1(u2.l.c(n)));
        }
        else if (u2.l.c(n) < 0.0f) {
            dg.d.M0(this.c, -at1.a.D1(u2.l.c(n)));
        }
        if (n == u2.l.b) {
            b = true;
        }
        if (!b) {
            this.k();
        }
        this.g();
        return pg2.j.a;
    }
    
    public final d c() {
        return this.r;
    }
    
    public final long d(long y0, final n1.c c) {
        final boolean m = this.m;
        final int n = 0;
        final int n2 = 0;
        float n3 = 0.0f;
        if (!m) {
            final long i = a80.a.I(this.n);
            if (dg.d.c0(this.d) != 0.0f) {
                this.m(n1.c.b, i);
            }
            if (dg.d.c0(this.e) != 0.0f) {
                this.n(n1.c.b, i);
            }
            if (dg.d.c0(this.b) != 0.0f) {
                this.o(n1.c.b, i);
            }
            if (dg.d.c0(this.c) != 0.0f) {
                this.l(n1.c.b, i);
            }
            this.m = true;
        }
        long n4;
        if (c != null) {
            n4 = c.a;
        }
        else {
            n4 = a80.a.I(this.n);
        }
        float n5 = 0.0f;
        Label_0387: {
            if (n1.c.d(y0) != 0.0f) {
                if (dg.d.c0(this.b) != 0.0f) {
                    final float o = this.o(y0, n4);
                    final boolean b = dg.d.c0(this.b) == 0.0f;
                    n5 = o;
                    if (b) {
                        this.b.onRelease();
                        n5 = o;
                    }
                    break Label_0387;
                }
                else if (dg.d.c0(this.c) != 0.0f) {
                    final float l = this.l(y0, n4);
                    final boolean b2 = dg.d.c0(this.c) == 0.0f;
                    n5 = l;
                    if (b2) {
                        this.c.onRelease();
                        n5 = l;
                    }
                    break Label_0387;
                }
            }
            n5 = 0.0f;
        }
        if (n1.c.c(y0) != 0.0f) {
            if (dg.d.c0(this.d) != 0.0f) {
                final float j = this.m(y0, n4);
                int n6 = n2;
                if (dg.d.c0(this.d) == 0.0f) {
                    n6 = 1;
                }
                n3 = j;
                if (n6 != 0) {
                    this.d.onRelease();
                    n3 = j;
                }
            }
            else if (dg.d.c0(this.e) != 0.0f) {
                final float n7 = this.n(y0, n4);
                int n8 = n;
                if (dg.d.c0(this.e) == 0.0f) {
                    n8 = 1;
                }
                n3 = n7;
                if (n8 != 0) {
                    this.e.onRelease();
                    n3 = n7;
                }
            }
        }
        y0 = yd.a.y0(n3, n5);
        if (!n1.c.a(y0, n1.c.b)) {
            this.k();
        }
        return y0;
    }
    
    public final u2.l e(long g) {
        final float b = u2.l.b(g);
        final float n = 0.0f;
        final int n2 = 0;
        float n3;
        if (b > 0.0f && dg.d.c0(this.d) != 0.0f) {
            dg.d.M0(this.d, at1.a.D1(u2.l.b(g)));
            n3 = u2.l.b(g);
        }
        else if (u2.l.b(g) < 0.0f && dg.d.c0(this.e) != 0.0f) {
            dg.d.M0(this.e, -at1.a.D1(u2.l.b(g)));
            n3 = u2.l.b(g);
        }
        else {
            n3 = 0.0f;
        }
        float n4;
        if (u2.l.c(g) > 0.0f && dg.d.c0(this.b) != 0.0f) {
            dg.d.M0(this.b, at1.a.D1(u2.l.c(g)));
            n4 = u2.l.c(g);
        }
        else {
            n4 = n;
            if (u2.l.c(g) < 0.0f) {
                final boolean b2 = dg.d.c0(this.c) == 0.0f;
                n4 = n;
                if (!b2) {
                    dg.d.M0(this.c, -at1.a.D1(u2.l.c(g)));
                    n4 = u2.l.c(g);
                }
            }
        }
        g = aj2.c.g(n3, n4);
        int n5 = n2;
        if (g == u2.l.b) {
            n5 = 1;
        }
        if (n5 == 0) {
            this.k();
        }
        return new u2.l(g);
    }
    
    public final void f(final long n, final long n2, final n1.c c, int n3) {
        boolean b = false;
        if (n3 == 1) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            long n4;
            if (c != null) {
                n4 = c.a;
            }
            else {
                n4 = a80.a.I(this.n);
            }
            if (n1.c.c(n2) > 0.0f) {
                this.m(n2, n4);
            }
            else if (n1.c.c(n2) < 0.0f) {
                this.n(n2, n4);
            }
            if (n1.c.d(n2) > 0.0f) {
                this.o(n2, n4);
            }
            else if (n1.c.d(n2) < 0.0f) {
                this.l(n2, n4);
            }
            n3 = ((n1.c.a(n2, n1.c.b) ^ true) ? 1 : 0);
        }
        else {
            n3 = 0;
        }
        int finished;
        if (!this.d.isFinished() && n1.c.c(n) < 0.0f) {
            this.d.onRelease();
            finished = (this.d.isFinished() ? 1 : 0);
        }
        else {
            finished = 0;
        }
        int n5 = finished;
        if (!this.e.isFinished()) {
            n5 = finished;
            if (n1.c.c(n) > 0.0f) {
                this.e.onRelease();
                n5 = ((finished || this.e.isFinished()) ? 1 : 0);
            }
        }
        int n6 = n5;
        if (!this.b.isFinished()) {
            n6 = n5;
            if (n1.c.d(n) < 0.0f) {
                this.b.onRelease();
                n6 = ((n5 || this.b.isFinished()) ? 1 : 0);
            }
        }
        int n7 = n6;
        if (!this.c.isFinished()) {
            n7 = n6;
            if (n1.c.d(n) > 0.0f) {
                this.c.onRelease();
                n7 = ((n6 || this.c.isFinished()) ? 1 : 0);
            }
        }
        if (n7 || n3 != 0) {
            b = true;
        }
        if (b) {
            this.k();
        }
    }
    
    public final void g() {
        final List<EdgeEffect> f = this.f;
        int n;
        for (int size = f.size(), i = n = 0; i < size; ++i) {
            final EdgeEffect edgeEffect = f.get(i);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && n == 0) {
                n = 0;
            }
            else {
                n = 1;
            }
        }
        if (n != 0) {
            this.k();
        }
    }
    
    public final boolean h(final e2.f f, final EdgeEffect edgeEffect, final Canvas canvas) {
        final int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-n1.f.e(this.n), -n1.f.c(this.n) + f.M0(this.a.b.a()));
        final boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
    
    public final boolean i(final e2.f f, final EdgeEffect edgeEffect, final Canvas canvas) {
        final int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-n1.f.c(this.n), f.M0(this.a.b.b(f.getLayoutDirection())));
        final boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
    
    public final boolean isEnabled() {
        return ((SnapshotMutableStateImpl<Boolean>)this.o).getValue();
    }
    
    public final boolean j(final e2.f f, final EdgeEffect edgeEffect, final Canvas canvas) {
        final int save = canvas.save();
        final int d1 = at1.a.D1(n1.f.e(this.n));
        final float c = this.a.b.c(f.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, f.M0(c) + -(float)d1);
        final boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
    
    public final void k() {
        if (this.l) {
            ((SnapshotMutableStateImpl<j>)this.k).setValue(pg2.j.a);
        }
    }
    
    public final float l(final long n, final long n2) {
        return n1.f.c(this.n) * -dg.d.N0(this.c, -(n1.c.d(n) / n1.f.c(this.n)), 1 - n1.c.c(n2) / n1.f.e(this.n));
    }
    
    public final float m(final long n, final long n2) {
        return n1.f.e(this.n) * dg.d.N0(this.d, n1.c.c(n) / n1.f.e(this.n), 1 - n1.c.d(n2) / n1.f.c(this.n));
    }
    
    public final float n(final long n, final long n2) {
        return n1.f.e(this.n) * -dg.d.N0(this.e, -(n1.c.c(n) / n1.f.e(this.n)), n1.c.d(n2) / n1.f.c(this.n));
    }
    
    public final float o(final long n, final long n2) {
        return n1.f.c(this.n) * dg.d.N0(this.b, n1.c.d(n) / n1.f.c(this.n), n1.c.c(n2) / n1.f.e(this.n));
    }
    
    public final void setEnabled(final boolean p) {
        final boolean b = this.p != p;
        ((SnapshotMutableStateImpl<Boolean>)this.o).setValue(Boolean.valueOf(p));
        this.p = p;
        if (b) {
            this.m = false;
            this.g();
        }
    }
}
