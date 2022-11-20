// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.View;
import o1.b0;
import u2.g;
import u2.i;
import cg.d;
import androidx.compose.ui.unit.LayoutDirection;
import o1.g0;
import o1.l0;
import android.graphics.Canvas;
import o1.c;
import n1.b;
import android.os.Build$VERSION;
import ng2.e;
import h.s;
import o1.f;
import mg2.a;
import mg2.l;
import cg2.j;
import android.graphics.Matrix;
import mg2.p;
import e2.a0;

public final class RenderNodeLayer implements a0
{
    public static final p<f0, Matrix, j> r;
    public final AndroidComposeView f;
    public l<? super o1.p, j> g;
    public a<j> h;
    public boolean i;
    public final t0 j;
    public boolean k;
    public boolean l;
    public f m;
    public final q0<f0> n;
    public final s o;
    public long p;
    public final f0 q;
    
    static {
        r = (p)RenderNodeLayer$Companion$getMatrix$1.INSTANCE;
    }
    
    public RenderNodeLayer(final AndroidComposeView f, final l<? super o1.p, j> g, final a<j> h) {
        e.f((Object)f, "ownerView");
        e.f((Object)g, "drawBlock");
        e.f((Object)h, "invalidateParentLayer");
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = new t0(f.getDensity());
        this.n = (q0<f0>)new q0((p)RenderNodeLayer.r);
        this.o = new s(2, 0);
        this.p = o1.q0.b;
        f0 q;
        if (Build$VERSION.SDK_INT >= 29) {
            q = new v0(f);
        }
        else {
            q = new u0(f);
        }
        q.L();
        this.q = q;
    }
    
    public final void a(final b b, final boolean b2) {
        if (b2) {
            final float[] a = this.n.a((Object)this.q);
            if (a == null) {
                b.a = 0.0f;
                b.b = 0.0f;
                b.c = 0.0f;
                b.d = 0.0f;
            }
            else {
                if0.a.M(a, b);
            }
        }
        else {
            if0.a.M(this.n.b((Object)this.q), b);
        }
    }
    
    public final void b(final a h, final l g) {
        e.f((Object)g, "drawBlock");
        e.f((Object)h, "invalidateParentLayer");
        this.j(false);
        this.k = false;
        this.l = false;
        this.p = o1.q0.b;
        this.g = (l<? super o1.p, j>)g;
        this.h = (a<j>)h;
    }
    
    public final void c(final o1.p p) {
        e.f((Object)p, "canvas");
        final Canvas a = c.a;
        final Canvas a2 = ((o1.b)p).a;
        final boolean hardwareAccelerated = a2.isHardwareAccelerated();
        boolean l = false;
        if (hardwareAccelerated) {
            this.i();
            if (this.q.Y() > 0.0f) {
                l = true;
            }
            this.l = l;
            if (l) {
                p.k();
            }
            this.q.F(a2);
            if (this.l) {
                p.g();
            }
        }
        else {
            final float n = (float)this.q.b();
            final float n2 = (float)this.q.e();
            final float n3 = (float)this.q.a();
            final float n4 = (float)this.q.c();
            if (this.q.f() < 1.0f) {
                f m;
                if ((m = this.m) == null) {
                    m = new f();
                    this.m = m;
                }
                m.d(this.q.f());
                a2.saveLayer(n, n2, n3, n4, m.a);
            }
            else {
                p.save();
            }
            p.f(n, n2);
            p.o(this.n.b((Object)this.q));
            if (this.q.M() || this.q.V()) {
                this.j.a(p);
            }
            final l<? super o1.p, j> g = this.g;
            if (g != null) {
                g.invoke((Object)p);
            }
            p.restore();
            this.j(false);
        }
    }
    
    public final void d(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final long p18, final l0 l0, final boolean b, final g0 g0, final long n11, final long n12, final LayoutDirection layoutDirection, final u2.b b2) {
        e.f((Object)l0, "shape");
        e.f((Object)layoutDirection, "layoutDirection");
        e.f((Object)b2, "density");
        this.p = p18;
        final boolean m = this.q.M();
        final boolean b3 = false;
        final boolean b4 = m && !(this.j.i ^ true);
        this.q.x(n);
        this.q.z(n2);
        this.q.d(n3);
        this.q.B(n4);
        this.q.j(n5);
        this.q.H(n6);
        this.q.W(d.l4(n11));
        this.q.X(d.l4(n12));
        this.q.r(n9);
        this.q.p(n7);
        this.q.q(n8);
        this.q.o(n10);
        final f0 q = this.q;
        final int c = o1.q0.c;
        q.P(Float.intBitsToFloat((int)(p18 >> 32)) * this.q.getWidth());
        this.q.Q(o1.q0.a(p18) * this.q.getHeight());
        this.q.S(b && l0 != o1.f0.a);
        this.q.G(b && l0 == o1.f0.a);
        this.q.E(g0);
        final boolean d = this.j.d(l0, this.q.f(), this.q.M(), this.q.Y(), layoutDirection, b2);
        this.q.R(this.j.b());
        int n13 = b3 ? 1 : 0;
        if (this.q.M()) {
            n13 = (b3 ? 1 : 0);
            if (!(this.j.i ^ true)) {
                n13 = 1;
            }
        }
        if ((b4 ? 1 : 0) == n13 && (n13 == 0 || !d)) {
            if (Build$VERSION.SDK_INT >= 26) {
                y1.a.a(this.f);
            }
            else {
                ((View)this.f).invalidate();
            }
        }
        else if (!this.i && !this.k) {
            ((View)this.f).invalidate();
            this.j(true);
        }
        if (!this.l && this.q.Y() > 0.0f) {
            final a<j> h = this.h;
            if (h != null) {
                h.invoke();
            }
        }
        this.n.c();
    }
    
    public final void destroy() {
        if (this.q.K()) {
            this.q.U();
        }
        this.g = null;
        this.h = null;
        this.k = true;
        this.j(false);
        final AndroidComposeView f = this.f;
        f.A = true;
        f.M((a0)this);
    }
    
    public final long e(long n, final boolean b) {
        if (b) {
            final float[] a = this.n.a((Object)this.q);
            if (a != null) {
                n = if0.a.L(a, n);
            }
            else {
                final int e = n1.c.e;
                n = n1.c.c;
            }
        }
        else {
            n = if0.a.L(this.n.b((Object)this.q), n);
        }
        return n;
    }
    
    public final void f(long d) {
        final int n = (int)(d >> 32);
        final int b = u2.i.b(d);
        final f0 q = this.q;
        d = this.p;
        final int c = o1.q0.c;
        final float intBitsToFloat = Float.intBitsToFloat((int)(d >> 32));
        final float n2 = (float)n;
        q.P(intBitsToFloat * n2);
        final f0 q2 = this.q;
        final float a = o1.q0.a(this.p);
        final float n3 = (float)b;
        q2.Q(a * n3);
        final f0 q3 = this.q;
        if (q3.T(q3.b(), this.q.e(), this.q.b() + n, this.q.e() + b)) {
            final t0 j = this.j;
            d = vl.a.d0(n2, n3);
            if (!n1.f.c(j.d, d)) {
                j.d = d;
                j.h = true;
            }
            this.q.R(this.j.b());
            if (!this.i && !this.k) {
                ((View)this.f).invalidate();
                this.j(true);
            }
            this.n.c();
        }
    }
    
    public final boolean g(final long n) {
        final float e = n1.c.e(n);
        final float f = n1.c.f(n);
        final boolean v = this.q.V();
        boolean b = true;
        if (v) {
            if (0.0f > e || e >= this.q.getWidth() || 0.0f > f || f >= this.q.getHeight()) {
                b = false;
            }
            return b;
        }
        return !this.q.M() || this.j.c(n);
    }
    
    public final void h(final long n) {
        final int b = this.q.b();
        final int e = this.q.e();
        final int n2 = (int)(n >> 32);
        final int c = u2.g.c(n);
        if (b != n2 || e != c) {
            this.q.O(n2 - b);
            this.q.J(c - e);
            if (Build$VERSION.SDK_INT >= 26) {
                y1.a.a(this.f);
            }
            else {
                ((View)this.f).invalidate();
            }
            this.n.c();
        }
    }
    
    public final void i() {
        if (this.i || !this.q.K()) {
            this.j(false);
            b0 g = null;
            Label_0064: {
                if (this.q.M()) {
                    final t0 j = this.j;
                    if (!(j.i ^ true)) {
                        j.e();
                        g = j.g;
                        break Label_0064;
                    }
                }
                g = null;
            }
            final l<? super o1.p, j> g2 = this.g;
            if (g2 != null) {
                this.q.I(this.o, g, g2);
            }
        }
    }
    
    public final void invalidate() {
        if (!this.i && !this.k) {
            ((View)this.f).invalidate();
            this.j(true);
        }
    }
    
    public final void j(final boolean i) {
        if (i != this.i) {
            this.i = i;
            this.f.K((a0)this, i);
        }
    }
}
