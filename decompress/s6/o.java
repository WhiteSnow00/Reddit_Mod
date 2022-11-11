// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;
import q6.g0;
import d7.c;
import y6.f;
import t6.d;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.RectF;
import android.graphics.Path;
import t6.a;

public final class o implements a, k, m
{
    public final Path a;
    public final RectF b;
    public final String c;
    public final boolean d;
    public final LottieDrawable e;
    public final t6.a<?, PointF> f;
    public final t6.a<?, PointF> g;
    public final d h;
    public final b i;
    public t6.a<Float, Float> j;
    public boolean k;
    
    public o(final LottieDrawable e, final com.airbnb.lottie.model.layer.a a, final f f) {
        this.a = new Path();
        this.b = new RectF();
        this.i = new b(0);
        this.j = null;
        this.c = f.a;
        this.d = f.e;
        this.e = e;
        final t6.a a2 = f.b.a();
        this.f = a2;
        final t6.a a3 = f.c.a();
        this.g = a3;
        final t6.a a4 = f.d.a();
        this.h = (d)a4;
        a.c(a2);
        a.c(a3);
        a.c(a4);
        a2.a((a)this);
        a3.a((a)this);
        a4.a((a)this);
    }
    
    public final Path T0() {
        if (this.k) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.k = true;
            return this.a;
        }
        final PointF pointF = this.g.f();
        final float n = pointF.x / 2.0f;
        final float n2 = pointF.y / 2.0f;
        final d h = this.h;
        float l;
        if (h == null) {
            l = 0.0f;
        }
        else {
            l = h.l();
        }
        float min = l;
        if (l == 0.0f) {
            final t6.a<Float, Float> j = this.j;
            min = l;
            if (j != null) {
                min = Math.min(j.f(), Math.min(n, n2));
            }
        }
        final float min2 = Math.min(n, n2);
        float n3 = min;
        if (min > min2) {
            n3 = min2;
        }
        final PointF pointF2 = this.f.f();
        this.a.moveTo(pointF2.x + n, pointF2.y - n2 + n3);
        this.a.lineTo(pointF2.x + n, pointF2.y + n2 - n3);
        final float n4 = fcmpl(n3, 0.0f);
        if (n4 > 0) {
            final RectF b = this.b;
            final float n5 = pointF2.x + n;
            final float n6 = n3 * 2.0f;
            final float n7 = pointF2.y + n2;
            b.set(n5 - n6, n7 - n6, n5, n7);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - n + n3, pointF2.y + n2);
        if (n4 > 0) {
            final RectF b2 = this.b;
            final float n8 = pointF2.x - n;
            final float n9 = pointF2.y + n2;
            final float n10 = n3 * 2.0f;
            b2.set(n8, n9 - n10, n10 + n8, n9);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - n, pointF2.y - n2 + n3);
        if (n4 > 0) {
            final RectF b3 = this.b;
            final float n11 = pointF2.x - n;
            final float n12 = pointF2.y - n2;
            final float n13 = n3 * 2.0f;
            b3.set(n11, n12, n11 + n13, n13 + n12);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x + n - n3, pointF2.y - n2);
        if (n4 > 0) {
            final RectF b4 = this.b;
            final float n14 = pointF2.x + n;
            final float n15 = n3 * 2.0f;
            final float n16 = pointF2.y - n2;
            b4.set(n14 - n15, n16, n14, n15 + n16);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.c(this.a);
        this.k = true;
        return this.a;
    }
    
    public final void a(final d7.c c, final Object o) {
        if (o == g0.l) {
            this.g.k(c);
        }
        else if (o == g0.n) {
            this.f.k(c);
        }
        else if (o == g0.m) {
            ((t6.a<K, Object>)this.h).k(c);
        }
    }
    
    @Override
    public final void f() {
        this.k = false;
        this.e.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
        int n = 0;
        while (true) {
            final ArrayList list3 = (ArrayList)list;
            if (n >= list3.size()) {
                break;
            }
            final s6.c c = list3.get(n);
            Label_0091: {
                if (c instanceof u) {
                    final u u = (u)c;
                    if (u.c == ShapeTrimPath$Type.SIMULTANEOUSLY) {
                        this.i.a.add(u);
                        u.a((a)this);
                        break Label_0091;
                    }
                }
                if (c instanceof q) {
                    this.j = ((q)c).b;
                }
            }
            ++n;
        }
    }
    
    public final String getName() {
        return this.c;
    }
    
    public final void h(final w6.d d, final int n, final ArrayList list, final w6.d d2) {
        c7.f.d(d, n, list, d2, (k)this);
    }
}
