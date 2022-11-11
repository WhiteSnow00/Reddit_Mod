// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import java.util.Collection;
import android.graphics.PathMeasure;
import android.graphics.Paint;
import c7.g;
import android.graphics.Canvas;
import y6.k;
import x6.h;
import t6.q;
import java.util.ArrayList;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;
import android.graphics.Path;
import android.graphics.Matrix;
import android.graphics.RectF;
import t6.a;

public final class d implements e, m, a, w6.e
{
    public final r6.a a;
    public final RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final List<s6.c> h;
    public final LottieDrawable i;
    public ArrayList j;
    public q k;
    
    public d(final LottieDrawable i, final com.airbnb.lottie.model.layer.a a, final String f, final boolean g, final ArrayList h, final h h2) {
        this.a = new r6.a();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = f;
        this.i = i;
        this.g = g;
        this.h = h;
        if (h2 != null) {
            (this.k = new q(h2)).a(a);
            this.k.b(this);
        }
        final ArrayList<j> list = new ArrayList<j>();
        int size = h.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final s6.c c = h.get(n);
            size = n;
            if (!(c instanceof j)) {
                continue;
            }
            list.add((j)c);
            size = n;
        }
        int size2 = list.size();
        while (--size2 >= 0) {
            list.get(size2).c(h.listIterator(h.size()));
        }
    }
    
    public d(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a a, final k k) {
        final String a2 = k.a;
        final boolean c = k.c;
        final List b = k.b;
        final ArrayList list = new ArrayList<s6.c>(b.size());
        final int n = 0;
        for (int i = 0; i < b.size(); ++i) {
            final s6.c a3 = b.get(i).a(lottieDrawable, a);
            if (a3 != null) {
                list.add(a3);
            }
        }
        final List b2 = k.b;
        while (true) {
            for (int j = n; j < b2.size(); ++j) {
                final y6.c c2 = b2.get(j);
                if (c2 instanceof h) {
                    final h h = (h)c2;
                    this(lottieDrawable, a, a2, c, list, h);
                    return;
                }
            }
            final h h = null;
            continue;
        }
    }
    
    public final Path T0() {
        this.c.reset();
        final q k = this.k;
        if (k != null) {
            this.c.set(k.d());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int i = this.h.size() - 1; i >= 0; --i) {
            final s6.c c = this.h.get(i);
            if (c instanceof m) {
                this.d.addPath(((m)c).T0(), this.c);
            }
        }
        return this.d;
    }
    
    public final void a(final d7.c c, final Object o) {
        final q k = this.k;
        if (k != null) {
            k.c(c, o);
        }
    }
    
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        this.c.set(matrix);
        final q k = this.k;
        if (k != null) {
            this.c.preConcat(k.d());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.h.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final s6.c c = this.h.get(n);
            size = n;
            if (!(c instanceof e)) {
                continue;
            }
            ((e)c).b(this.e, this.c, b);
            rectF.union(this.e);
            size = n;
        }
    }
    
    public final List<m> c() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); ++i) {
                final s6.c c = this.h.get(i);
                if (c instanceof m) {
                    this.j.add(c);
                }
            }
        }
        return this.j;
    }
    
    public final void d(final Canvas canvas, final Matrix matrix, int n) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        final q k = this.k;
        int alpha = n;
        if (k != null) {
            this.c.preConcat(k.d());
            final t6.a<Integer, Integer> j = this.k.j;
            int intValue;
            if (j == null) {
                intValue = 100;
            }
            else {
                intValue = j.f();
            }
            alpha = (int)(intValue / 100.0f * n / 255.0f * 255.0f);
        }
        final boolean x = this.i.x;
        final int n2 = n = 0;
        Label_0201: {
            if (x) {
                while (true) {
                    int n3;
                    for (int i = n3 = 0; i < this.h.size(); ++i, n3 = n) {
                        n = n3;
                        if (this.h.get(i) instanceof e) {
                            n = ++n3;
                            if (n3 >= 2) {
                                final boolean b = true;
                                n = n2;
                                if (!b) {
                                    break Label_0201;
                                }
                                n = n2;
                                if (alpha != 255) {
                                    n = 1;
                                }
                                break Label_0201;
                            }
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
        if (n != 0) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.b(this.b, this.c, true);
            this.a.setAlpha(alpha);
            final RectF b2 = this.b;
            final r6.a a = this.a;
            final ThreadLocal<PathMeasure> a2 = c7.g.a;
            canvas.saveLayer(b2, (Paint)a);
            ml0.a.A();
        }
        if (n != 0) {
            alpha = 255;
        }
        for (int l = this.h.size() - 1; l >= 0; --l) {
            final s6.c value = this.h.get(l);
            if (value instanceof e) {
                ((e)value).d(canvas, this.c, alpha);
            }
        }
        if (n != 0) {
            canvas.restore();
        }
    }
    
    public final void f() {
        this.i.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
        final ArrayList list3 = new ArrayList(this.h.size() + list.size());
        list3.addAll(list);
        for (int i = this.h.size() - 1; i >= 0; --i) {
            final s6.c c = this.h.get(i);
            c.g(list3, this.h.subList(0, i));
            list3.add(c);
        }
    }
    
    public final String getName() {
        return this.f;
    }
    
    public final void h(final w6.d d, final int n, final ArrayList list, w6.d d2) {
        if (!d.c(n, this.f) && !"__container".equals(this.f)) {
            return;
        }
        w6.d d3 = d2;
        if (!"__container".equals(this.f)) {
            final String f = this.f;
            d2.getClass();
            d3 = new w6.d(d2);
            d3.a.add(f);
            if (d.a(n, this.f)) {
                d2 = new w6.d(d3);
                d2.b = (w6.e)this;
                list.add(d2);
            }
        }
        if (d.d(n, this.f)) {
            final int b = d.b(n, this.f);
            for (int i = 0; i < this.h.size(); ++i) {
                final s6.c c = this.h.get(i);
                if (c instanceof w6.e) {
                    ((w6.e)c).h(d, b + n, list, d3);
                }
            }
        }
    }
}
