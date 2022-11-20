// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import java.util.List;
import java.util.Collections;
import p6.h0;
import w6.b;
import w6.i;
import pc.c;
import w6.h;
import c7.d;
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
    public s6.d k;
    public s6.d l;
    public a<?, Float> m;
    public a<?, Float> n;
    
    public q(final h h) {
        this.a = new Matrix();
        final c a = h.a;
        a<PointF, PointF> b;
        if (a == null) {
            b = null;
        }
        else {
            b = a.b();
        }
        this.f = b;
        final i<PointF, PointF> b2 = h.b;
        a<?, PointF> b3;
        if (b2 == null) {
            b3 = null;
        }
        else {
            b3 = b2.b();
        }
        this.g = b3;
        final w6.a c = h.c;
        a<d, d> b4;
        if (c == null) {
            b4 = null;
        }
        else {
            b4 = c.b();
        }
        this.h = b4;
        final b d = h.d;
        a<Float, Float> b5;
        if (d == null) {
            b5 = null;
        }
        else {
            b5 = d.b();
        }
        this.i = b5;
        final b f = h.f;
        s6.d k;
        if (f == null) {
            k = null;
        }
        else {
            k = (s6.d)f.b();
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
        final b g = h.g;
        s6.d l;
        if (g == null) {
            l = null;
        }
        else {
            l = (s6.d)g.b();
        }
        this.l = l;
        final w6.d e = h.e;
        if (e != null) {
            this.j = e.b();
        }
        final b h2 = h.h;
        if (h2 != null) {
            this.m = h2.b();
        }
        else {
            this.m = null;
        }
        final b i = h.i;
        if (i != null) {
            this.n = i.b();
        }
        else {
            this.n = null;
        }
    }
    
    public final void a(final com.airbnb.lottie.model.layer.a a) {
        a.c((a)this.j);
        a.c((a)this.m);
        a.c((a)this.n);
        a.c((a)this.f);
        a.c((a)this.g);
        a.c((a)this.h);
        a.c((a)this.i);
        a.c((a)this.k);
        a.c((a)this.l);
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
        final s6.d k = this.k;
        if (k != null) {
            ((a)k).a(a);
        }
        final s6.d l = this.l;
        if (l != null) {
            ((a)l).a(a);
        }
    }
    
    public final boolean c(final c7.c c, final Object o) {
        if (o == h0.f) {
            final a<PointF, PointF> f = this.f;
            if (f == null) {
                this.f = new r<PointF, PointF>(c, new PointF());
            }
            else {
                f.k(c);
            }
        }
        else if (o == h0.g) {
            final a<?, PointF> g = this.g;
            if (g == null) {
                this.g = new r<Object, PointF>(c, new PointF());
            }
            else {
                g.k(c);
            }
        }
        else {
            if (o == h0.h) {
                final a<?, PointF> g2 = this.g;
                if (g2 instanceof n) {
                    final n n = (n)g2;
                    final c7.c<Float> m = n.m;
                    n.m = c;
                    return true;
                }
            }
            if (o == h0.i) {
                final a<?, PointF> g3 = this.g;
                if (g3 instanceof n) {
                    final n n2 = (n)g3;
                    final c7.c<Float> n3 = n2.n;
                    n2.n = c;
                    return true;
                }
            }
            if (o == h0.o) {
                final a<d, d> h = this.h;
                if (h == null) {
                    this.h = new r<d, d>(c, new d());
                }
                else {
                    h.k(c);
                }
            }
            else if (o == h0.p) {
                final a<Float, Float> i = this.i;
                if (i == null) {
                    this.i = new r<Float, Float>(c, 0.0f);
                }
                else {
                    i.k(c);
                }
            }
            else if (o == h0.c) {
                final a<Integer, Integer> j = this.j;
                if (j == null) {
                    this.j = new r<Integer, Integer>(c, 100);
                }
                else {
                    j.k(c);
                }
            }
            else if (o == h0.C) {
                final a<?, Float> k = this.m;
                if (k == null) {
                    this.m = new r<Object, Float>(c, 100.0f);
                }
                else {
                    k.k(c);
                }
            }
            else if (o == h0.D) {
                final a<?, Float> n4 = this.n;
                if (n4 == null) {
                    this.n = new r<Object, Float>(c, 100.0f);
                }
                else {
                    n4.k(c);
                }
            }
            else if (o == h0.q) {
                if (this.k == null) {
                    this.k = new s6.d((List)Collections.singletonList(new c7.a(0.0f)));
                }
                ((a<K, Object>)this.k).k(c);
            }
            else {
                if (o != h0.r) {
                    return false;
                }
                if (this.l == null) {
                    this.l = new s6.d((List)Collections.singletonList(new c7.a(0.0f)));
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
                n = ((s6.d)i).l();
            }
            if (n != 0.0f) {
                this.a.preRotate(n);
            }
        }
        final s6.d k = this.k;
        if (k != null) {
            final s6.d l = this.l;
            float n2;
            if (l == null) {
                n2 = 0.0f;
            }
            else {
                n2 = (float)Math.cos(Math.toRadians(-l.l() + 90.0f));
            }
            final s6.d j = this.l;
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
