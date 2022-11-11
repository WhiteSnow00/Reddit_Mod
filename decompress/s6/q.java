// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import java.util.List;
import android.graphics.PointF;
import java.util.ArrayList;
import y6.h;
import y6.i;
import com.airbnb.lottie.LottieDrawable;
import t6.a;

public final class q implements s, a
{
    public final LottieDrawable a;
    public final t6.a<Float, Float> b;
    public i c;
    
    public q(final LottieDrawable a, final com.airbnb.lottie.model.layer.a a2, final h h) {
        this.a = a;
        h.getClass();
        final t6.a a3 = h.a.a();
        a2.c(this.b = a3);
        a3.a((a)this);
    }
    
    public static int a(final int n, final int n2) {
        int n4;
        final int n3 = n4 = n / n2;
        if ((n ^ n2) < 0) {
            n4 = n3;
            if (n2 * n3 != n) {
                n4 = n3 - 1;
            }
        }
        return n - n4 * n2;
    }
    
    public final i e(final i i) {
        final ArrayList a = i.a;
        if (a.size() <= 2) {
            return i;
        }
        final float floatValue = this.b.f();
        if (floatValue == 0.0f) {
            return i;
        }
        final ArrayList a2 = i.a;
        final boolean c = i.c;
        int j = a2.size() - 1;
        final int n = 0;
        int n2 = 0;
        while (j >= 0) {
            final w6.a a3 = (w6.a)a2.get(j);
            final int n3 = j - 1;
            final w6.a a4 = (w6.a)a2.get(a(n3, a2.size()));
            PointF pointF;
            if (j == 0 && !c) {
                pointF = i.b;
            }
            else {
                pointF = a4.c;
            }
            PointF b;
            if (j == 0 && !c) {
                b = pointF;
            }
            else {
                b = a4.b;
            }
            final PointF a5 = a3.a;
            final boolean b2 = !i.c && j == 0 && j == a2.size() - 1;
            if (b.equals((Object)pointF) && a5.equals((Object)pointF) && !b2) {
                n2 += 2;
            }
            else {
                ++n2;
            }
            j = n3;
        }
        final i c2 = this.c;
        if (c2 == null || c2.a.size() != n2) {
            final ArrayList list = new ArrayList<w6.a>(n2);
            for (int k = 0; k < n2; ++k) {
                list.add(new w6.a());
            }
            this.c = new i(new PointF(0.0f, 0.0f), false, (List)list);
        }
        final i c3 = this.c;
        c3.c = c;
        final PointF b3 = i.b;
        c3.a(b3.x, b3.y);
        final ArrayList a6 = c3.a;
        final boolean c4 = i.c;
        int n4 = 0;
        int l = n;
        for (ArrayList list2 = a; l < list2.size(); ++l) {
            final w6.a a7 = (w6.a)list2.get(l);
            final w6.a a8 = (w6.a)list2.get(a(l - 1, list2.size()));
            final w6.a a9 = (w6.a)list2.get(a(l - 2, list2.size()));
            PointF pointF2;
            if (l == 0 && !c4) {
                pointF2 = i.b;
            }
            else {
                pointF2 = a8.c;
            }
            PointF b4;
            if (l == 0 && !c4) {
                b4 = pointF2;
            }
            else {
                b4 = a8.b;
            }
            final PointF a10 = a7.a;
            final PointF c5 = a9.c;
            final PointF c6 = a7.c;
            final boolean b5 = !i.c && l == 0 && l == list2.size() - 1;
            if (b4.equals((Object)pointF2) && a10.equals((Object)pointF2) && !b5) {
                final float x = pointF2.x;
                final float x2 = c5.x;
                final float y = pointF2.y;
                final float y2 = c5.y;
                final float x3 = c6.x;
                final float y3 = c6.y;
                final float n5 = (float)Math.hypot(x - x2, y - y2);
                final float n6 = (float)Math.hypot(x3 - x, y3 - y);
                final float min = Math.min(floatValue / n5, 0.5f);
                final float min2 = Math.min(floatValue / n6, 0.5f);
                final float x4 = pointF2.x;
                final float b6 = a.b(c5.x, x4, min, x4);
                final float y4 = pointF2.y;
                final float b7 = a.b(c5.y, y4, min, y4);
                final float b8 = a.b(c6.x, x4, min2, x4);
                final float b9 = a.b(c6.y, y4, min2, y4);
                final w6.a a11 = (w6.a)a6.get(a(n4 - 1, a6.size()));
                final w6.a a12 = (w6.a)a6.get(n4);
                a11.b.set(b6, b7);
                a11.c.set(b6, b7);
                if (l == 0) {
                    c3.a(b6, b7);
                }
                a12.a.set(b6 - (b6 - x4) * 0.5519f, b7 - (b7 - y4) * 0.5519f);
                ++n4;
                final w6.a a13 = (w6.a)a6.get(n4);
                a12.b.set(b8 - (b8 - x4) * 0.5519f, b9 - (b9 - y4) * 0.5519f);
                a12.c.set(b8, b9);
                a13.a.set(b8, b9);
            }
            else {
                final w6.a a14 = (w6.a)a6.get(a(n4 - 1, a6.size()));
                final w6.a a15 = (w6.a)a6.get(n4);
                final PointF c7 = a8.c;
                a14.b.set(c7.x, c7.y);
                final PointF c8 = a8.c;
                a14.c.set(c8.x, c8.y);
                final PointF c9 = a7.c;
                a15.a.set(c9.x, c9.y);
            }
            ++n4;
        }
        return c3;
    }
    
    public final void f() {
        this.a.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
    }
}
