// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import java.util.List;
import android.graphics.Paint;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.MaskFilter;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import y6.d;
import android.graphics.PointF;
import android.graphics.Canvas;
import android.graphics.Matrix;
import q6.g0;
import x6.b;
import t6.c;
import com.airbnb.lottie.LottieDrawable;
import t6.r;
import t6.g;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.LinearGradient;
import j0.f;
import t6.a;

public final class h implements e, a, k
{
    public final String a;
    public final boolean b;
    public final com.airbnb.lottie.model.layer.a c;
    public final f<LinearGradient> d;
    public final f<RadialGradient> e;
    public final Path f;
    public final r6.a g;
    public final RectF h;
    public final ArrayList i;
    public final GradientType j;
    public final g k;
    public final t6.f l;
    public final t6.k m;
    public final t6.k n;
    public r o;
    public r p;
    public final LottieDrawable q;
    public final int r;
    public t6.a<Float, Float> s;
    public float t;
    public t6.c u;
    
    public h(final LottieDrawable q, final com.airbnb.lottie.model.layer.a c, final y6.e e) {
        this.d = (f<LinearGradient>)new f();
        this.e = (f<RadialGradient>)new f();
        final Path f = new Path();
        this.f = f;
        this.g = new r6.a(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = c;
        this.a = e.g;
        this.b = e.h;
        this.q = q;
        this.j = e.a;
        f.setFillType(e.b);
        this.r = (int)(q.f.b() / 32.0f);
        final t6.a a = e.c.a();
        this.k = (g)a;
        a.a((a)this);
        c.c(a);
        final t6.a a2 = e.d.a();
        this.l = (t6.f)a2;
        a2.a((a)this);
        c.c(a2);
        final t6.a a3 = e.e.a();
        this.m = (t6.k)a3;
        a3.a((a)this);
        c.c(a3);
        final t6.a a4 = e.f.a();
        this.n = (t6.k)a4;
        a4.a((a)this);
        c.c(a4);
        if (c.l() != null) {
            (this.s = ((b)c.l().f).a()).a((a)this);
            c.c(this.s);
        }
        if (c.m() != null) {
            this.u = new t6.c((a)this, c, c.m());
        }
    }
    
    public final void a(final d7.c c, final Object o) {
        if (o == g0.d) {
            ((t6.a<K, Object>)this.l).k(c);
        }
        else if (o == g0.K) {
            final r o2 = this.o;
            if (o2 != null) {
                this.c.p((t6.a<?, ?>)o2);
            }
            if (c == null) {
                this.o = null;
            }
            else {
                ((t6.a)(this.o = new r(c, (Object)null))).a((a)this);
                this.c.c((t6.a<?, ?>)this.o);
            }
        }
        else if (o == g0.L) {
            final r p2 = this.p;
            if (p2 != null) {
                this.c.p((t6.a<?, ?>)p2);
            }
            if (c == null) {
                this.p = null;
            }
            else {
                this.d.b();
                this.e.b();
                ((t6.a)(this.p = new r(c, (Object)null))).a((a)this);
                this.c.c((t6.a<?, ?>)this.p);
            }
        }
        else if (o == g0.j) {
            final t6.a<Float, Float> s = this.s;
            if (s != null) {
                s.k(c);
            }
            else {
                (this.s = (t6.a<Float, Float>)new r(c, (Object)null)).a((a)this);
                this.c.c(this.s);
            }
        }
        else {
            if (o == g0.e) {
                final t6.c u = this.u;
                if (u != null) {
                    u.b.k(c);
                    return;
                }
            }
            if (o == g0.G) {
                final t6.c u2 = this.u;
                if (u2 != null) {
                    u2.b(c);
                    return;
                }
            }
            if (o == g0.H) {
                final t6.c u3 = this.u;
                if (u3 != null) {
                    ((t6.a<K, Object>)u3.d).k(c);
                    return;
                }
            }
            if (o == g0.I) {
                final t6.c u4 = this.u;
                if (u4 != null) {
                    ((t6.a<K, Object>)u4.e).k(c);
                    return;
                }
            }
            if (o == g0.J) {
                final t6.c u5 = this.u;
                if (u5 != null) {
                    ((t6.a<K, Object>)u5.f).k(c);
                }
            }
        }
    }
    
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); ++i) {
            this.f.addPath(((m)this.i.get(i)).T0(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
    
    public final int[] c(int[] array) {
        final r p = this.p;
        int[] array2 = array;
        if (p != null) {
            final Integer[] array3 = (Integer[])p.f();
            final int length = array.length;
            final int length2 = array3.length;
            final int n = 0;
            int n2 = 0;
            if (length == length2) {
                while (true) {
                    array2 = array;
                    if (n2 >= array.length) {
                        break;
                    }
                    array[n2] = array3[n2];
                    ++n2;
                }
            }
            else {
                array = new int[array3.length];
                int n3 = n;
                while (true) {
                    array2 = array;
                    if (n3 >= array3.length) {
                        break;
                    }
                    array[n3] = array3[n3];
                    ++n3;
                }
            }
        }
        return array2;
    }
    
    public final void d(final Canvas canvas, final Matrix localMatrix, int n) {
        if (this.b) {
            return;
        }
        this.f.reset();
        for (int i = 0; i < this.i.size(); ++i) {
            this.f.addPath(((m)this.i.get(i)).T0(), localMatrix);
        }
        this.f.computeBounds(this.h, false);
        Object shader;
        if (this.j == GradientType.LINEAR) {
            final int j = this.i();
            final f<LinearGradient> d = this.d;
            final long n2 = j;
            shader = d.e(n2, (Long)null);
            if (shader == null) {
                final PointF pointF = ((t6.a<K, PointF>)this.m).f();
                final PointF pointF2 = ((t6.a<K, PointF>)this.n).f();
                final d d2 = ((t6.a<K, d>)this.k).f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, this.c(d2.b), d2.a, Shader$TileMode.CLAMP);
                this.d.g(n2, shader);
            }
        }
        else {
            final int k = this.i();
            final f<RadialGradient> e = this.e;
            final long n3 = k;
            shader = e.e(n3, (Long)null);
            if (shader == null) {
                final PointF pointF3 = ((t6.a<K, PointF>)this.m).f();
                final PointF pointF4 = ((t6.a<K, PointF>)this.n).f();
                final d d3 = ((t6.a<K, d>)this.k).f();
                final int[] c = this.c(d3.b);
                final float[] a = d3.a;
                final float x = pointF3.x;
                final float y = pointF3.y;
                float n4;
                if ((n4 = (float)Math.hypot(pointF4.x - x, pointF4.y - y)) <= 0.0f) {
                    n4 = 0.001f;
                }
                shader = new RadialGradient(x, y, n4, c, a, Shader$TileMode.CLAMP);
                this.e.g(n3, shader);
            }
        }
        ((Shader)shader).setLocalMatrix(localMatrix);
        ((Paint)this.g).setShader((Shader)shader);
        final r o = this.o;
        if (o != null) {
            ((Paint)this.g).setColorFilter((ColorFilter)o.f());
        }
        final t6.a<Float, Float> s = this.s;
        if (s != null) {
            final float floatValue = s.f();
            if (floatValue == 0.0f) {
                ((Paint)this.g).setMaskFilter((MaskFilter)null);
            }
            else if (floatValue != this.t) {
                ((Paint)this.g).setMaskFilter((MaskFilter)new BlurMaskFilter(floatValue, BlurMaskFilter$Blur.NORMAL));
            }
            this.t = floatValue;
        }
        final t6.c u = this.u;
        if (u != null) {
            u.a(this.g);
        }
        n = (int)(n / 255.0f * ((t6.a<K, Integer>)this.l).f() / 100.0f * 255.0f);
        final r6.a g = this.g;
        final PointF a2 = c7.f.a;
        g.setAlpha(Math.max(0, Math.min(255, n)));
        canvas.drawPath(this.f, (Paint)this.g);
        ml0.a.A();
    }
    
    public final void f() {
        this.q.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
        for (int i = 0; i < list2.size(); ++i) {
            final s6.c c = list2.get(i);
            if (c instanceof m) {
                this.i.add(c);
            }
        }
    }
    
    public final String getName() {
        return this.a;
    }
    
    public final void h(final w6.d d, final int n, final ArrayList list, final w6.d d2) {
        c7.f.d(d, n, list, d2, (k)this);
    }
    
    public final int i() {
        final int round = Math.round(((t6.a)this.m).d * this.r);
        final int round2 = Math.round(((t6.a)this.n).d * this.r);
        final int round3 = Math.round(((t6.a)this.k).d * this.r);
        int n;
        if (round != 0) {
            n = round * 527;
        }
        else {
            n = 17;
        }
        int n2 = n;
        if (round2 != 0) {
            n2 = n * 31 * round2;
        }
        int n3 = n2;
        if (round3 != 0) {
            n3 = n2 * 31 * round3;
        }
        return n3;
    }
}
