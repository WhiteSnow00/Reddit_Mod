// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.View;
import o1.b0;
import u2.g;
import u2.i;
import o1.f0;
import androidx.compose.ui.unit.LayoutDirection;
import o1.g0;
import o1.l0;
import android.graphics.Canvas;
import aj2.c;
import n1.b;
import android.os.Build$VERSION;
import o1.q0;
import h.s;
import o1.f;
import zg2.a;
import pg2.j;
import android.graphics.Matrix;
import zg2.p;
import e2.l;

public final class RenderNodeLayer implements l
{
    public static final p<h0, Matrix, j> r;
    public final AndroidComposeView f;
    public zg2.l<? super o1.p, j> g;
    public a<j> h;
    public boolean i;
    public final u0 j;
    public boolean k;
    public boolean l;
    public f m;
    public final r0<h0> n;
    public final s o;
    public long p;
    public final h0 q;
    
    static {
        r = (p)RenderNodeLayer$Companion$getMatrix.RenderNodeLayer$Companion$getMatrix$1.INSTANCE;
    }
    
    public RenderNodeLayer(final AndroidComposeView f, final zg2.l<? super o1.p, j> g, final a<j> h) {
        ah2.f.f((Object)f, "ownerView");
        ah2.f.f((Object)g, "drawBlock");
        ah2.f.f((Object)h, "invalidateParentLayer");
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = new u0(f.getDensity());
        this.n = (r0<h0>)new r0((p)RenderNodeLayer.r);
        this.o = new s(1, 0);
        this.p = q0.b;
        Object q;
        if (Build$VERSION.SDK_INT >= 29) {
            q = new w0(f);
        }
        else {
            q = new v0(f);
        }
        ((h0)q).F();
        this.q = (h0)q;
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
                c.q0(a, b);
            }
        }
        else {
            c.q0(this.n.b((Object)this.q), b);
        }
    }
    
    public final void b(final a h, final zg2.l g) {
        ah2.f.f((Object)g, "drawBlock");
        ah2.f.f((Object)h, "invalidateParentLayer");
        this.j(false);
        this.k = false;
        this.l = false;
        this.p = q0.b;
        this.g = (zg2.l<? super o1.p, j>)g;
        this.h = (a<j>)h;
    }
    
    public final void c(final o1.p p) {
        ah2.f.f((Object)p, "canvas");
        final Canvas a = o1.c.a;
        final Canvas a2 = ((o1.b)p).a;
        final boolean hardwareAccelerated = a2.isHardwareAccelerated();
        boolean l = false;
        if (hardwareAccelerated) {
            this.i();
            if (this.q.T() > 0.0f) {
                l = true;
            }
            this.l = l;
            if (l) {
                p.k();
            }
            this.q.A(a2);
            if (this.l) {
                p.g();
            }
        }
        else {
            final float n = (float)this.q.b();
            final float n2 = (float)this.q.e();
            final float n3 = (float)this.q.a();
            final float n4 = (float)this.q.c();
            if (this.q.u() < 1.0f) {
                f m;
                if ((m = this.m) == null) {
                    m = new f();
                    this.m = m;
                }
                m.d(this.q.u());
                a2.saveLayer(n, n2, n3, n4, m.a);
            }
            else {
                p.save();
            }
            p.f(n, n2);
            p.o(this.n.b((Object)this.q));
            if (this.q.G() || this.q.Q()) {
                this.j.a(p);
            }
            final zg2.l<? super o1.p, j> g = this.g;
            if (g != null) {
                g.invoke((Object)p);
            }
            p.restore();
            this.j(false);
        }
    }
    
    public final void d(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final long p18, final l0 l0, final boolean b, final g0 g0, final long n11, final long n12, final LayoutDirection layoutDirection, final u2.b b2) {
        ah2.f.f((Object)l0, "shape");
        ah2.f.f((Object)layoutDirection, "layoutDirection");
        ah2.f.f((Object)b2, "density");
        this.p = p18;
        final boolean g2 = this.q.G();
        final boolean b3 = false;
        final boolean b4 = g2 && !(this.j.i ^ true);
        this.q.t(n);
        this.q.v(n2);
        this.q.d(n3);
        this.q.x(n4);
        this.q.g(n5);
        this.q.C(n6);
        this.q.R(at1.a.X1(n11));
        this.q.S(at1.a.X1(n12));
        this.q.o(n9);
        this.q.m(n7);
        this.q.n(n8);
        this.q.l(n10);
        final h0 q = this.q;
        final int c = q0.c;
        q.J(Float.intBitsToFloat((int)(p18 >> 32)) * this.q.getWidth());
        this.q.K(q0.a(p18) * this.q.getHeight());
        this.q.M(b && l0 != f0.a);
        this.q.B(b && l0 == f0.a);
        this.q.z(g0);
        final boolean d = this.j.d(l0, this.q.u(), this.q.G(), this.q.T(), layoutDirection, b2);
        this.q.L(this.j.b());
        int n13 = b3 ? 1 : 0;
        if (this.q.G()) {
            n13 = (b3 ? 1 : 0);
            if (!(this.j.i ^ true)) {
                n13 = 1;
            }
        }
        if ((b4 ? 1 : 0) == n13 && (n13 == 0 || !d)) {
            if (Build$VERSION.SDK_INT >= 26) {
                x1.a.a(this.f);
            }
            else {
                ((View)this.f).invalidate();
            }
        }
        else if (!this.i && !this.k) {
            ((View)this.f).invalidate();
            this.j(true);
        }
        if (!this.l && this.q.T() > 0.0f) {
            final a<j> h = this.h;
            if (h != null) {
                h.invoke();
            }
        }
        this.n.c();
    }
    
    public final void destroy() {
        if (this.q.E()) {
            this.q.P();
        }
        this.g = null;
        this.h = null;
        this.k = true;
        this.j(false);
        final AndroidComposeView f = this.f;
        f.A = true;
        f.L((l)this);
    }
    
    public final long e(long n, final boolean b) {
        if (b) {
            final float[] a = this.n.a((Object)this.q);
            if (a != null) {
                n = c.p0(a, n);
            }
            else {
                final int e = n1.c.e;
                n = n1.c.c;
            }
        }
        else {
            n = c.p0(this.n.b((Object)this.q), n);
        }
        return n;
    }
    
    public final void f(long d) {
        final int n = (int)(d >> 32);
        final int b = u2.i.b(d);
        final h0 q = this.q;
        d = this.p;
        final int c = q0.c;
        final float intBitsToFloat = Float.intBitsToFloat((int)(d >> 32));
        final float n2 = (float)n;
        q.J(intBitsToFloat * n2);
        final h0 q2 = this.q;
        final float a = q0.a(this.p);
        final float n3 = (float)b;
        q2.K(a * n3);
        final h0 q3 = this.q;
        if (q3.O(q3.b(), this.q.e(), this.q.b() + n, this.q.e() + b)) {
            final u0 j = this.j;
            d = a80.a.f(n2, n3);
            if (!n1.f.b(j.d, d)) {
                j.d = d;
                j.h = true;
            }
            this.q.L(this.j.b());
            if (!this.i && !this.k) {
                ((View)this.f).invalidate();
                this.j(true);
            }
            this.n.c();
        }
    }
    
    public final boolean g(final long n) {
        final float c = n1.c.c(n);
        final float d = n1.c.d(n);
        final boolean q = this.q.Q();
        boolean b = true;
        if (q) {
            if (0.0f > c || c >= this.q.getWidth() || 0.0f > d || d >= this.q.getHeight()) {
                b = false;
            }
            return b;
        }
        return !this.q.G() || this.j.c(n);
    }
    
    public final void h(final long n) {
        final int b = this.q.b();
        final int e = this.q.e();
        final int n2 = (int)(n >> 32);
        final int b2 = u2.g.b(n);
        if (b != n2 || e != b2) {
            this.q.I(n2 - b);
            this.q.D(b2 - e);
            if (Build$VERSION.SDK_INT >= 26) {
                x1.a.a(this.f);
            }
            else {
                ((View)this.f).invalidate();
            }
            this.n.c();
        }
    }
    
    public final void i() {
        if (this.i || !this.q.E()) {
            this.j(false);
            b0 g = null;
            Label_0064: {
                if (this.q.G()) {
                    final u0 j = this.j;
                    if (!(j.i ^ true)) {
                        j.e();
                        g = j.g;
                        break Label_0064;
                    }
                }
                g = null;
            }
            final zg2.l<? super o1.p, j> g2 = this.g;
            if (g2 != null) {
                this.q.N(this.o, g, (zg2.l)g2);
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
            this.f.J((l)this, i);
        }
    }
}
