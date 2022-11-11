// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import android.graphics.PointF;
import c7.f;
import android.graphics.Canvas;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.ListIterator;
import android.graphics.RectF;
import q6.g0;
import d7.c;
import x6.h;
import y6.g;
import t6.q;
import t6.d;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.Path;
import android.graphics.Matrix;
import t6.a;

public final class p implements e, m, j, a, k
{
    public final Matrix a;
    public final Path b;
    public final LottieDrawable c;
    public final com.airbnb.lottie.model.layer.a d;
    public final String e;
    public final boolean f;
    public final d g;
    public final d h;
    public final q i;
    public s6.d j;
    
    public p(final LottieDrawable c, final com.airbnb.lottie.model.layer.a d, final g g) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = c;
        this.d = d;
        this.e = g.a;
        this.f = g.e;
        final t6.a a = g.b.a();
        this.g = (d)a;
        d.c(a);
        a.a((a)this);
        final t6.a a2 = g.c.a();
        this.h = (d)a2;
        d.c(a2);
        a2.a((a)this);
        final h d2 = g.d;
        d2.getClass();
        final q i = new q(d2);
        (this.i = i).a(d);
        i.b(this);
    }
    
    public final Path T0() {
        final Path t0 = this.j.T0();
        this.b.reset();
        final float floatValue = ((t6.a<K, Float>)this.g).f();
        final float floatValue2 = ((t6.a<K, Float>)this.h).f();
        int n = (int)floatValue;
        while (--n >= 0) {
            this.a.set(this.i.e(n + floatValue2));
            this.b.addPath(t0, this.a);
        }
        return this.b;
    }
    
    public final void a(final d7.c c, final Object o) {
        if (this.i.c(c, o)) {
            return;
        }
        if (o == g0.u) {
            ((t6.a<K, Object>)this.g).k(c);
        }
        else if (o == g0.v) {
            ((t6.a<K, Object>)this.h).k(c);
        }
    }
    
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        this.j.b(rectF, matrix, b);
    }
    
    public final void c(final ListIterator<s6.c> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {}
        final ArrayList list = new ArrayList();
        while (listIterator.hasPrevious()) {
            list.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(list);
        this.j = new s6.d(this.c, this.d, "Repeater", this.f, list, null);
    }
    
    public final void d(final Canvas canvas, final Matrix matrix, final int n) {
        final float floatValue = ((t6.a<K, Float>)this.g).f();
        final float floatValue2 = ((t6.a<K, Float>)this.h).f();
        final float n2 = this.i.m.f() / 100.0f;
        final float n3 = this.i.n.f() / 100.0f;
        int n4 = (int)floatValue;
        while (--n4 >= 0) {
            this.a.set(matrix);
            final Matrix a = this.a;
            final q i = this.i;
            final float n5 = (float)n4;
            a.preConcat(i.e(n5 + floatValue2));
            final float n6 = (float)n;
            final float n7 = n5 / floatValue;
            final PointF a2 = c7.f.a;
            this.j.d(canvas, this.a, (int)(((n3 - n2) * n7 + n2) * n6));
        }
    }
    
    public final void f() {
        this.c.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
        this.j.g(list, list2);
    }
    
    public final String getName() {
        return this.e;
    }
    
    public final void h(final w6.d d, final int n, final ArrayList list, final w6.d d2) {
        c7.f.d(d, n, list, d2, (k)this);
    }
}
