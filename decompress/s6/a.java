// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import android.graphics.PointF;
import android.graphics.Paint;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.MaskFilter;
import android.graphics.ColorFilter;
import android.graphics.PathEffect;
import android.graphics.DashPathEffect;
import c7.g;
import android.graphics.Canvas;
import android.graphics.Matrix;
import q6.g0;
import android.graphics.Paint$Style;
import java.util.List;
import x6.b;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import t6.c;
import t6.r;
import t6.f;
import t6.d;
import java.util.ArrayList;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.PathMeasure;

public abstract class a implements a.a, k, e
{
    public final PathMeasure a;
    public final Path b;
    public final Path c;
    public final RectF d;
    public final LottieDrawable e;
    public final com.airbnb.lottie.model.layer.a f;
    public final ArrayList g;
    public final float[] h;
    public final r6.a i;
    public final d j;
    public final f k;
    public final ArrayList l;
    public final d m;
    public r n;
    public a<Float, Float> o;
    public float p;
    public t6.c q;
    
    public a(final LottieDrawable e, final com.airbnb.lottie.model.layer.a f, final Paint$Cap strokeCap, final Paint$Join strokeJoin, final float strokeMiter, final x6.d d, final b b, final List<b> list, final b b2) {
        this.a = new PathMeasure();
        this.b = new Path();
        this.c = new Path();
        this.d = new RectF();
        this.g = new ArrayList();
        final r6.a i = new r6.a(1);
        this.i = i;
        this.p = 0.0f;
        this.e = e;
        this.f = f;
        ((Paint)i).setStyle(Paint$Style.STROKE);
        ((Paint)i).setStrokeCap(strokeCap);
        ((Paint)i).setStrokeJoin(strokeJoin);
        ((Paint)i).setStrokeMiter(strokeMiter);
        this.k = (f)d.a();
        this.j = (d)b.a();
        if (b2 == null) {
            this.m = null;
        }
        else {
            this.m = (d)b2.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        final int n = 0;
        for (int j = 0; j < list.size(); ++j) {
            this.l.add(((b)list.get(j)).a());
        }
        f.c((a<?, ?>)this.k);
        f.c((a<?, ?>)this.j);
        for (int k = 0; k < this.l.size(); ++k) {
            f.c((a<?, ?>)this.l.get(k));
        }
        final d m = this.m;
        if (m != null) {
            f.c((a<?, ?>)m);
        }
        ((a)this.k).a((a.a)this);
        ((a)this.j).a((a.a)this);
        for (int l = n; l < list.size(); ++l) {
            ((a)this.l.get(l)).a((a.a)this);
        }
        final d m2 = this.m;
        if (m2 != null) {
            ((a)m2).a((a.a)this);
        }
        if (f.l() != null) {
            (this.o = ((b)f.l().f).a()).a((a.a)this);
            f.c(this.o);
        }
        if (f.m() != null) {
            this.q = new t6.c((a.a)this, f, f.m());
        }
    }
    
    public void a(final d7.c c, final Object o) {
        if (o == g0.d) {
            ((a<K, Object>)this.k).k(c);
        }
        else if (o == g0.s) {
            ((a<K, Object>)this.j).k(c);
        }
        else if (o == g0.K) {
            final r n = this.n;
            if (n != null) {
                this.f.p((a<?, ?>)n);
            }
            if (c == null) {
                this.n = null;
            }
            else {
                ((a)(this.n = new r(c, (Object)null))).a((a.a)this);
                this.f.c((a<?, ?>)this.n);
            }
        }
        else if (o == g0.j) {
            final a<Float, Float> o2 = this.o;
            if (o2 != null) {
                o2.k(c);
            }
            else {
                (this.o = (a<Float, Float>)new r(c, (Object)null)).a((a.a)this);
                this.f.c(this.o);
            }
        }
        else {
            if (o == g0.e) {
                final t6.c q = this.q;
                if (q != null) {
                    q.b.k(c);
                    return;
                }
            }
            if (o == g0.G) {
                final t6.c q2 = this.q;
                if (q2 != null) {
                    q2.b(c);
                    return;
                }
            }
            if (o == g0.H) {
                final t6.c q3 = this.q;
                if (q3 != null) {
                    ((a<K, Object>)q3.d).k(c);
                    return;
                }
            }
            if (o == g0.I) {
                final t6.c q4 = this.q;
                if (q4 != null) {
                    ((a<K, Object>)q4.e).k(c);
                    return;
                }
            }
            if (o == g0.J) {
                final t6.c q5 = this.q;
                if (q5 != null) {
                    ((a<K, Object>)q5.f).k(c);
                }
            }
        }
    }
    
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        this.b.reset();
        for (int i = 0; i < this.g.size(); ++i) {
            final a a = this.g.get(i);
            for (int j = 0; j < a.a.size(); ++j) {
                this.b.addPath(((m)a.a.get(j)).T0(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        final float l = this.j.l();
        final RectF d = this.d;
        final float left = d.left;
        final float n = l / 2.0f;
        d.set(left - n, d.top - n, d.right + n, d.bottom + n);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        ml0.a.A();
    }
    
    public void d(final Canvas canvas, final Matrix matrix, int i) {
        final float[] array = c7.g.d.get();
        array[1] = (array[0] = 0.0f);
        array[2] = 37394.73f;
        array[3] = 39575.234f;
        matrix.mapPoints(array);
        if (array[0] == array[2] || array[1] == array[3]) {
            ml0.a.A();
            return;
        }
        final float n = i / 255.0f;
        final f k = this.k;
        i = (int)(n * k.l(((a)k).b(), ((a)k).d()) / 100.0f * 255.0f);
        final r6.a j = this.i;
        final PointF a = c7.f.a;
        j.setAlpha(Math.max(0, Math.min(255, i)));
        ((Paint)this.i).setStrokeWidth(c7.g.d(matrix) * this.j.l());
        if (((Paint)this.i).getStrokeWidth() <= 0.0f) {
            ml0.a.A();
            return;
        }
        if (this.l.isEmpty()) {
            ml0.a.A();
        }
        else {
            final float d = c7.g.d(matrix);
            float[] h;
            float[] h2;
            float[] h3;
            for (i = 0; i < this.l.size(); ++i) {
                this.h[i] = this.l.get(i).f();
                if (i % 2 == 0) {
                    h = this.h;
                    if (h[i] < 1.0f) {
                        h[i] = 1.0f;
                    }
                }
                else {
                    h2 = this.h;
                    if (h2[i] < 0.1f) {
                        h2[i] = 0.1f;
                    }
                }
                h3 = this.h;
                h3[i] *= d;
            }
            final d m = this.m;
            float n2;
            if (m == null) {
                n2 = 0.0f;
            }
            else {
                n2 = ((a<K, Float>)m).f() * d;
            }
            ((Paint)this.i).setPathEffect((PathEffect)new DashPathEffect(this.h, n2));
            ml0.a.A();
        }
        final r n3 = this.n;
        if (n3 != null) {
            ((Paint)this.i).setColorFilter((ColorFilter)n3.f());
        }
        final a<Float, Float> o = this.o;
        if (o != null) {
            final float floatValue = o.f();
            if (floatValue == 0.0f) {
                ((Paint)this.i).setMaskFilter((MaskFilter)null);
            }
            else if (floatValue != this.p) {
                final com.airbnb.lottie.model.layer.a f = this.f;
                BlurMaskFilter b;
                if (f.A == floatValue) {
                    b = f.B;
                }
                else {
                    b = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter$Blur.NORMAL);
                    f.B = b;
                    f.A = floatValue;
                }
                ((Paint)this.i).setMaskFilter((MaskFilter)b);
            }
            this.p = floatValue;
        }
        final t6.c q = this.q;
        if (q != null) {
            q.a(this.i);
        }
        a a2;
        int size;
        float n4;
        float n5;
        float n6;
        float length;
        float n7;
        float n8;
        float min;
        int l;
        float n9;
        float length2;
        float n10;
        float n11;
        float n12;
        float n13;
        float n14;
        int n15;
        for (i = 0; i < this.g.size(); ++i) {
            a2 = this.g.get(i);
            if (a2.b != null) {
                this.b.reset();
                size = a2.a.size();
                while (--size >= 0) {
                    this.b.addPath(((m)a2.a.get(size)).T0(), matrix);
                }
                n4 = ((a<K, Float>)a2.b.d).f() / 100.0f;
                n5 = ((a<K, Float>)a2.b.e).f() / 100.0f;
                n6 = ((a<K, Float>)a2.b.f).f() / 360.0f;
                if (n4 < 0.01f && n5 > 0.99f) {
                    canvas.drawPath(this.b, (Paint)this.i);
                    ml0.a.A();
                }
                else {
                    this.a.setPath(this.b, false);
                    length = this.a.getLength();
                    while (this.a.nextContour()) {
                        length += this.a.getLength();
                    }
                    n7 = n6 * length;
                    n8 = n4 * length + n7;
                    min = Math.min(n5 * length + n7, n8 + length - 1.0f);
                    l = a2.a.size() - 1;
                    n9 = 0.0f;
                    while (l >= 0) {
                        this.c.set(((m)a2.a.get(l)).T0());
                        this.c.transform(matrix);
                        this.a.setPath(this.c, false);
                        length2 = this.a.getLength();
                        Label_1141: {
                            if (min > length) {
                                n10 = min - length;
                                if (n10 < n9 + length2 && n9 < n10) {
                                    if (n8 > length) {
                                        n11 = (n8 - length) / length2;
                                    }
                                    else {
                                        n11 = 0.0f;
                                    }
                                    c7.g.a(this.c, n11, Math.min(n10 / length2, 1.0f), 0.0f);
                                    canvas.drawPath(this.c, (Paint)this.i);
                                    break Label_1141;
                                }
                            }
                            n12 = n9 + length2;
                            if (n12 >= n8) {
                                if (n9 <= min) {
                                    if (n12 <= min && n8 < n9) {
                                        canvas.drawPath(this.c, (Paint)this.i);
                                    }
                                    else {
                                        if (n8 < n9) {
                                            n13 = 0.0f;
                                        }
                                        else {
                                            n13 = (n8 - n9) / length2;
                                        }
                                        if (min > n12) {
                                            n14 = 1.0f;
                                        }
                                        else {
                                            n14 = (min - n9) / length2;
                                        }
                                        c7.g.a(this.c, n13, n14, 0.0f);
                                        canvas.drawPath(this.c, (Paint)this.i);
                                    }
                                }
                            }
                        }
                        n9 += length2;
                        --l;
                    }
                    ml0.a.A();
                }
            }
            else {
                this.b.reset();
                for (n15 = a2.a.size() - 1; n15 >= 0; --n15) {
                    this.b.addPath(((m)a2.a.get(n15)).T0(), matrix);
                }
                ml0.a.A();
                canvas.drawPath(this.b, (Paint)this.i);
                ml0.a.A();
            }
        }
        ml0.a.A();
    }
    
    @Override
    public final void f() {
        this.e.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
        final ArrayList list3 = (ArrayList)list;
        int i = list3.size() - 1;
        final a a = null;
        u u = null;
        while (i >= 0) {
            final s6.c c = list3.get(i);
            u u2 = u;
            if (c instanceof u) {
                final u u3 = (u)c;
                u2 = u;
                if (u3.c == ShapeTrimPath$Type.INDIVIDUALLY) {
                    u2 = u3;
                }
            }
            --i;
            u = u2;
        }
        if (u != null) {
            u.a((a.a)this);
        }
        int size = list2.size();
        a a2 = a;
        while (--size >= 0) {
            final s6.c c2 = list2.get(size);
            a a3 = null;
            Label_0220: {
                if (c2 instanceof u) {
                    final u u4 = (u)c2;
                    if (u4.c == ShapeTrimPath$Type.INDIVIDUALLY) {
                        if (a2 != null) {
                            this.g.add(a2);
                        }
                        a3 = new a(u4);
                        u4.a((a.a)this);
                        break Label_0220;
                    }
                }
                a3 = a2;
                if (c2 instanceof m) {
                    if ((a3 = a2) == null) {
                        a3 = new a(u);
                    }
                    a3.a.add(c2);
                }
            }
            a2 = a3;
        }
        if (a2 != null) {
            this.g.add(a2);
        }
    }
    
    public final void h(final w6.d d, final int n, final ArrayList list, final w6.d d2) {
        c7.f.d(d, n, list, d2, (k)this);
    }
    
    public static final class a
    {
        public final ArrayList a;
        public final u b;
        
        public a(final u b) {
            this.a = new ArrayList();
            this.b = b;
        }
    }
}
