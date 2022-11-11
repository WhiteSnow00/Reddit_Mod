// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import java.util.Collections;
import q6.g0;
import d7.c;
import x6.f;
import x6.i;
import s6.b;
import x6.h;
import d7.d;
import android.graphics.PointF;
import android.graphics.Matrix;

public final class q
{
    public final Matrix a;
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public a<PointF, PointF> f;
    public a<?, PointF> g;
    public a<d, d> h;
    public a<Float, Float> i;
    public a<Integer, Integer> j;
    public t6.d k;
    public t6.d l;
    public a<?, Float> m;
    public a<?, Float> n;
    
    public q(final h h) {
        this.a = new Matrix();
        final b a = h.a;
        a<PointF, PointF> a2;
        if (a == null) {
            a2 = null;
        }
        else {
            a2 = a.a();
        }
        this.f = a2;
        final i b = h.b;
        a<?, PointF> a3;
        if (b == null) {
            a3 = null;
        }
        else {
            a3 = b.a();
        }
        this.g = a3;
        final f c = h.c;
        a<d, d> a4;
        if (c == null) {
            a4 = null;
        }
        else {
            a4 = c.a();
        }
        this.h = a4;
        final x6.b d = h.d;
        a<Float, Float> a5;
        if (d == null) {
            a5 = null;
        }
        else {
            a5 = d.a();
        }
        this.i = a5;
        final x6.b f = h.f;
        t6.d k;
        if (f == null) {
            k = null;
        }
        else {
            k = (t6.d)f.a();
        }
        this.k = k;
        if (k != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        }
        else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        final x6.b g = h.g;
        t6.d l;
        if (g == null) {
            l = null;
        }
        else {
            l = (t6.d)g.a();
        }
        this.l = l;
        final x6.d e = h.e;
        if (e != null) {
            this.j = e.a();
        }
        final x6.b h2 = h.h;
        if (h2 != null) {
            this.m = h2.a();
        }
        else {
            this.m = null;
        }
        final x6.b i = h.i;
        if (i != null) {
            this.n = i.a();
        }
        else {
            this.n = null;
        }
    }
    
    public final void a(final com.airbnb.lottie.model.layer.a a) {
        a.c(this.j);
        a.c(this.m);
        a.c(this.n);
        a.c(this.f);
        a.c(this.g);
        a.c(this.h);
        a.c(this.i);
        a.c((a<?, ?>)this.k);
        a.c((a<?, ?>)this.l);
    }
    
    public final void b(final a.a a) {
        final a<Integer, Integer> j = this.j;
        if (j != null) {
            j.a(a);
        }
        final a<?, Float> m = this.m;
        if (m != null) {
            m.a(a);
        }
        final a<?, Float> n = this.n;
        if (n != null) {
            n.a(a);
        }
        final a<PointF, PointF> f = this.f;
        if (f != null) {
            f.a(a);
        }
        final a<?, PointF> g = this.g;
        if (g != null) {
            g.a(a);
        }
        final a<d, d> h = this.h;
        if (h != null) {
            h.a(a);
        }
        final a<Float, Float> i = this.i;
        if (i != null) {
            i.a(a);
        }
        final t6.d k = this.k;
        if (k != null) {
            ((a)k).a(a);
        }
        final t6.d l = this.l;
        if (l != null) {
            ((a)l).a(a);
        }
    }
    
    public final boolean c(final c c, final Object o) {
        if (o == g0.f) {
            final a<PointF, PointF> f = this.f;
            if (f == null) {
                this.f = (a<PointF, PointF>)new r(c, (Object)new PointF());
            }
            else {
                f.k(c);
            }
        }
        else if (o == g0.g) {
            final a<?, PointF> g = this.g;
            if (g == null) {
                this.g = (a<?, PointF>)new r(c, (Object)new PointF());
            }
            else {
                g.k(c);
            }
        }
        else {
            if (o == g0.h) {
                final a<?, PointF> g2 = this.g;
                if (g2 instanceof n) {
                    final n n = (n)g2;
                    final c m = n.m;
                    n.m = c;
                    return true;
                }
            }
            if (o == g0.i) {
                final a<?, PointF> g3 = this.g;
                if (g3 instanceof n) {
                    final n n2 = (n)g3;
                    final c n3 = n2.n;
                    n2.n = c;
                    return true;
                }
            }
            if (o == g0.o) {
                final a<d, d> h = this.h;
                if (h == null) {
                    this.h = (a<d, d>)new r(c, (Object)new d());
                }
                else {
                    h.k(c);
                }
            }
            else if (o == g0.p) {
                final a<Float, Float> i = this.i;
                if (i == null) {
                    this.i = (a<Float, Float>)new r(c, (Object)0.0f);
                }
                else {
                    i.k(c);
                }
            }
            else if (o == g0.c) {
                final a<Integer, Integer> j = this.j;
                if (j == null) {
                    this.j = (a<Integer, Integer>)new r(c, (Object)100);
                }
                else {
                    j.k(c);
                }
            }
            else if (o == g0.C) {
                final a<?, Float> k = this.m;
                if (k == null) {
                    this.m = (a<?, Float>)new r(c, (Object)100.0f);
                }
                else {
                    k.k(c);
                }
            }
            else if (o == g0.D) {
                final a<?, Float> n4 = this.n;
                if (n4 == null) {
                    this.n = (a<?, Float>)new r(c, (Object)100.0f);
                }
                else {
                    n4.k(c);
                }
            }
            else if (o == g0.q) {
                if (this.k == null) {
                    this.k = new t6.d(Collections.singletonList(new d7.a<Float>(0.0f)));
                }
                ((a<K, Object>)this.k).k(c);
            }
            else {
                if (o != g0.r) {
                    return false;
                }
                if (this.l == null) {
                    this.l = new t6.d(Collections.singletonList(new d7.a<Float>(0.0f)));
                }
                ((a<K, Object>)this.l).k(c);
            }
        }
        return true;
    }
    
    public final Matrix d() {
        this.a.reset();
        final a<?, PointF> g = this.g;
        if (g != null) {
            final PointF pointF = g.f();
            if (pointF != null) {
                final float x = pointF.x;
                if (x != 0.0f || pointF.y != 0.0f) {
                    this.a.preTranslate(x, pointF.y);
                }
            }
        }
        final a<Float, Float> i = this.i;
        if (i != null) {
            float n;
            if (i instanceof r) {
                n = i.f();
            }
            else {
                n = ((t6.d)i).l();
            }
            if (n != 0.0f) {
                this.a.preRotate(n);
            }
        }
        final t6.d k = this.k;
        if (k != null) {
            final t6.d l = this.l;
            float n2;
            if (l == null) {
                n2 = 0.0f;
            }
            else {
                n2 = (float)Math.cos(Math.toRadians(-l.l() + 90.0f));
            }
            final t6.d j = this.l;
            float n3;
            if (j == null) {
                n3 = 1.0f;
            }
            else {
                n3 = (float)Math.sin(Math.toRadians(-j.l() + 90.0f));
            }
            final float n4 = (float)Math.tan(Math.toRadians(k.l()));
            for (int n5 = 0; n5 < 9; ++n5) {
                this.e[n5] = 0.0f;
            }
            final float[] e = this.e;
            e[0] = n2;
            e[1] = n3;
            final float n6 = -n3;
            e[3] = n6;
            e[4] = n2;
            e[8] = 1.0f;
            this.b.setValues(e);
            for (int n7 = 0; n7 < 9; ++n7) {
                this.e[n7] = 0.0f;
            }
            final float[] e2 = this.e;
            e2[0] = 1.0f;
            e2[3] = n4;
            e2[8] = (e2[4] = 1.0f);
            this.c.setValues(e2);
            for (int n8 = 0; n8 < 9; ++n8) {
                this.e[n8] = 0.0f;
            }
            final float[] e3 = this.e;
            e3[0] = n2;
            e3[1] = n6;
            e3[3] = n3;
            e3[4] = n2;
            e3[8] = 1.0f;
            this.d.setValues(e3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        final a<d, d> h = this.h;
        if (h != null) {
            final d d = h.f();
            final float a = d.a;
            if (a != 1.0f || d.b != 1.0f) {
                this.a.preScale(a, d.b);
            }
        }
        final a<PointF, PointF> f = this.f;
        if (f != null) {
            final PointF pointF2 = f.f();
            final float x2 = pointF2.x;
            if (x2 != 0.0f || pointF2.y != 0.0f) {
                this.a.preTranslate(-x2, -pointF2.y);
            }
        }
        return this.a;
    }
    
    public final Matrix e(final float n) {
        final a<?, PointF> g = this.g;
        final PointF pointF = null;
        PointF pointF2;
        if (g == null) {
            pointF2 = null;
        }
        else {
            pointF2 = g.f();
        }
        final a<d, d> h = this.h;
        d d;
        if (h == null) {
            d = null;
        }
        else {
            d = h.f();
        }
        this.a.reset();
        if (pointF2 != null) {
            this.a.preTranslate(pointF2.x * n, pointF2.y * n);
        }
        if (d != null) {
            final Matrix a = this.a;
            final double n2 = d.a;
            final double n3 = n;
            a.preScale((float)Math.pow(n2, n3), (float)Math.pow(d.b, n3));
        }
        final a<Float, Float> i = this.i;
        if (i != null) {
            final float floatValue = i.f();
            final a<PointF, PointF> f = this.f;
            PointF pointF3;
            if (f == null) {
                pointF3 = pointF;
            }
            else {
                pointF3 = f.f();
            }
            final Matrix a2 = this.a;
            float y = 0.0f;
            float x;
            if (pointF3 == null) {
                x = 0.0f;
            }
            else {
                x = pointF3.x;
            }
            if (pointF3 != null) {
                y = pointF3.y;
            }
            a2.preRotate(floatValue * n, x, y);
        }
        return this.a;
    }
}
