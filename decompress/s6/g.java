// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import w6.d;
import java.util.List;
import android.graphics.PointF;
import android.graphics.Paint;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.MaskFilter;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import q6.g0;
import x6.b;
import y6.j;
import t6.c;
import com.airbnb.lottie.LottieDrawable;
import t6.r;
import t6.f;
import java.util.ArrayList;
import android.graphics.Path;
import t6.a;

public final class g implements e, a, k
{
    public final Path a;
    public final r6.a b;
    public final com.airbnb.lottie.model.layer.a c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final t6.a<Integer, Integer> g;
    public final f h;
    public r i;
    public final LottieDrawable j;
    public t6.a<Float, Float> k;
    public float l;
    public t6.c m;
    
    public g(final LottieDrawable j, final com.airbnb.lottie.model.layer.a c, final j i) {
        final Path a = new Path();
        this.a = a;
        this.b = new r6.a(1);
        this.f = new ArrayList();
        this.c = c;
        this.d = i.c;
        this.e = i.f;
        this.j = j;
        if (c.l() != null) {
            (this.k = ((b)c.l().f).a()).a((a)this);
            c.c(this.k);
        }
        if (c.m() != null) {
            this.m = new t6.c((a)this, c, c.m());
        }
        if (i.d != null && i.e != null) {
            a.setFillType(i.b);
            final t6.a a2 = i.d.a();
            (this.g = a2).a((a)this);
            c.c(a2);
            final t6.a a3 = i.e.a();
            this.h = (f)a3;
            a3.a((a)this);
            c.c(a3);
            return;
        }
        this.g = null;
        this.h = null;
    }
    
    public final void a(final d7.c c, final Object o) {
        if (o == g0.a) {
            this.g.k(c);
        }
        else if (o == g0.d) {
            ((t6.a<K, Object>)this.h).k(c);
        }
        else if (o == g0.K) {
            final r i = this.i;
            if (i != null) {
                this.c.p((t6.a<?, ?>)i);
            }
            if (c == null) {
                this.i = null;
            }
            else {
                ((t6.a)(this.i = new r(c, (Object)null))).a((a)this);
                this.c.c((t6.a<?, ?>)this.i);
            }
        }
        else if (o == g0.j) {
            final t6.a<Float, Float> k = this.k;
            if (k != null) {
                k.k(c);
            }
            else {
                (this.k = (t6.a<Float, Float>)new r(c, (Object)null)).a((a)this);
                this.c.c(this.k);
            }
        }
        else {
            if (o == g0.e) {
                final t6.c m = this.m;
                if (m != null) {
                    m.b.k(c);
                    return;
                }
            }
            if (o == g0.G) {
                final t6.c j = this.m;
                if (j != null) {
                    j.b(c);
                    return;
                }
            }
            if (o == g0.H) {
                final t6.c l = this.m;
                if (l != null) {
                    ((t6.a<K, Object>)l.d).k(c);
                    return;
                }
            }
            if (o == g0.I) {
                final t6.c m2 = this.m;
                if (m2 != null) {
                    ((t6.a<K, Object>)m2.e).k(c);
                    return;
                }
            }
            if (o == g0.J) {
                final t6.c m3 = this.m;
                if (m3 != null) {
                    ((t6.a<K, Object>)m3.f).k(c);
                }
            }
        }
    }
    
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); ++i) {
            this.a.addPath(((m)this.f.get(i)).T0(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
    
    public final void d(final Canvas canvas, final Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        final t6.b b = (t6.b)this.g;
        final int l = b.l(((t6.a)b).b(), ((t6.a)b).d());
        i = (int)(i / 255.0f * ((t6.a<K, Integer>)this.h).f() / 100.0f * 255.0f);
        final r6.a b2 = this.b;
        final PointF a = c7.f.a;
        final int min = Math.min(255, i);
        i = 0;
        ((Paint)b2).setColor(Math.max(0, min) << 24 | (l & 0xFFFFFF));
        final r j = this.i;
        if (j != null) {
            ((Paint)this.b).setColorFilter((ColorFilter)j.f());
        }
        final t6.a<Float, Float> k = this.k;
        if (k != null) {
            final float floatValue = k.f();
            if (floatValue == 0.0f) {
                ((Paint)this.b).setMaskFilter((MaskFilter)null);
            }
            else if (floatValue != this.l) {
                final com.airbnb.lottie.model.layer.a c = this.c;
                BlurMaskFilter b3;
                if (c.A == floatValue) {
                    b3 = c.B;
                }
                else {
                    b3 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter$Blur.NORMAL);
                    c.B = b3;
                    c.A = floatValue;
                }
                ((Paint)this.b).setMaskFilter((MaskFilter)b3);
            }
            this.l = floatValue;
        }
        final t6.c m = this.m;
        if (m != null) {
            m.a(this.b);
        }
        this.a.reset();
        while (i < this.f.size()) {
            this.a.addPath(this.f.get(i).T0(), matrix);
            ++i;
        }
        canvas.drawPath(this.a, (Paint)this.b);
        ml0.a.A();
    }
    
    public final void f() {
        this.j.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
        for (int i = 0; i < list2.size(); ++i) {
            final s6.c c = list2.get(i);
            if (c instanceof m) {
                this.f.add(c);
            }
        }
    }
    
    public final String getName() {
        return this.d;
    }
    
    public final void h(final d d, final int n, final ArrayList list, final d d2) {
        c7.f.d(d, n, list, d2, (k)this);
    }
}
