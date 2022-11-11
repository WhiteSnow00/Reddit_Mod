// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import w6.d;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;
import q6.g0;
import d7.c;
import y6.b;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.Path;
import t6.a;

public final class f implements m, a, k
{
    public final Path a;
    public final String b;
    public final LottieDrawable c;
    public final t6.k d;
    public final t6.a<?, PointF> e;
    public final b f;
    public final s6.b g;
    public boolean h;
    
    public f(final LottieDrawable c, final com.airbnb.lottie.model.layer.a a, final b f) {
        this.a = new Path();
        this.g = new s6.b(0);
        this.b = f.a;
        this.c = c;
        final t6.a a2 = f.c.a();
        this.d = (t6.k)a2;
        final t6.a a3 = f.b.a();
        this.e = a3;
        this.f = f;
        a.c(a2);
        a.c(a3);
        a2.a((a)this);
        a3.a((a)this);
    }
    
    public final Path T0() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.h = true;
            return this.a;
        }
        final PointF pointF = ((t6.a<K, PointF>)this.d).f();
        final float n = pointF.x / 2.0f;
        final float n2 = pointF.y / 2.0f;
        final float n3 = n * 0.55228f;
        final float n4 = 0.55228f * n2;
        this.a.reset();
        if (this.f.d) {
            final Path a = this.a;
            final float n5 = -n2;
            a.moveTo(0.0f, n5);
            final Path a2 = this.a;
            final float n6 = 0.0f - n3;
            final float n7 = -n;
            final float n8 = 0.0f - n4;
            a2.cubicTo(n6, n5, n7, n8, n7, 0.0f);
            final Path a3 = this.a;
            final float n9 = n4 + 0.0f;
            a3.cubicTo(n7, n9, n6, n2, 0.0f, n2);
            final Path a4 = this.a;
            final float n10 = n3 + 0.0f;
            a4.cubicTo(n10, n2, n, n9, n, 0.0f);
            this.a.cubicTo(n, n8, n10, n5, 0.0f, n5);
        }
        else {
            final Path a5 = this.a;
            final float n11 = -n2;
            a5.moveTo(0.0f, n11);
            final Path a6 = this.a;
            final float n12 = n3 + 0.0f;
            final float n13 = 0.0f - n4;
            a6.cubicTo(n12, n11, n, n13, n, 0.0f);
            final Path a7 = this.a;
            final float n14 = n4 + 0.0f;
            a7.cubicTo(n, n14, n12, n2, 0.0f, n2);
            final Path a8 = this.a;
            final float n15 = 0.0f - n3;
            final float n16 = -n;
            a8.cubicTo(n15, n2, n16, n14, n16, 0.0f);
            this.a.cubicTo(n16, n13, n15, n11, 0.0f, n11);
        }
        final PointF pointF2 = this.e.f();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.g.c(this.a);
        this.h = true;
        return this.a;
    }
    
    public final void a(final d7.c c, final Object o) {
        if (o == g0.k) {
            ((t6.a<K, Object>)this.d).k(c);
        }
        else if (o == g0.n) {
            this.e.k(c);
        }
    }
    
    public final void f() {
        this.h = false;
        this.c.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
        int n = 0;
        while (true) {
            final ArrayList list3 = (ArrayList)list;
            if (n >= list3.size()) {
                break;
            }
            final s6.c c = list3.get(n);
            if (c instanceof u) {
                final u u = (u)c;
                if (u.c == ShapeTrimPath$Type.SIMULTANEOUSLY) {
                    this.g.a.add(u);
                    u.a((a)this);
                }
            }
            ++n;
        }
    }
    
    public final String getName() {
        return this.b;
    }
    
    public final void h(final d d, final int n, final ArrayList list, final d d2) {
        c7.f.d(d, n, list, d2, (k)this);
    }
}
