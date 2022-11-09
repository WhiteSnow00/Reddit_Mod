// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import java.util.ArrayList;
import c7.f;
import c7.c;
import android.graphics.PointF;
import s6.r;
import java.util.List;
import android.graphics.Path;
import y6.h;

public final class m extends a<h, Path>
{
    public final h i;
    public final Path j;
    public List<r> k;
    
    public m(final List<d7.a<h>> list) {
        super(list);
        this.i = new h();
        this.j = new Path();
    }
    
    @Override
    public final Object g(final d7.a a, final float n) {
        final h h = (h)a.b;
        final h h2 = (h)a.c;
        final h i = this.i;
        if (i.b == null) {
            i.b = new PointF();
        }
        i.c = (h.c || h2.c);
        if (h.a.size() != h2.a.size()) {
            final StringBuilder k = a.k("Curves must have the same number of control points. Shape 1: ");
            k.append(h.a.size());
            k.append("\tShape 2: ");
            k.append(h2.a.size());
            c7.c.b(k.toString());
        }
        final int min = Math.min(h.a.size(), h2.a.size());
        if (i.a.size() < min) {
            for (int j = i.a.size(); j < min; ++j) {
                i.a.add(new w6.a());
            }
        }
        else if (i.a.size() > min) {
            for (int l = i.a.size() - 1; l >= min; --l) {
                final ArrayList a2 = i.a;
                a2.remove(a2.size() - 1);
            }
        }
        final PointF b = h.b;
        final PointF b2 = h2.b;
        final float x = b.x;
        final float x2 = b2.x;
        final PointF a3 = c7.f.a;
        final float c = d.c(x2, x, n, x);
        final float y = b.y;
        i.a(c, (b2.y - y) * n + y);
        for (int n2 = i.a.size() - 1; n2 >= 0; --n2) {
            final w6.a a4 = h.a.get(n2);
            final w6.a a5 = h2.a.get(n2);
            final PointF a6 = a4.a;
            final PointF b3 = a4.b;
            final PointF c2 = a4.c;
            final PointF a7 = a5.a;
            final PointF b4 = a5.b;
            final PointF c3 = a5.c;
            final w6.a a8 = i.a.get(n2);
            final float x3 = a6.x;
            final float c4 = d.c(a7.x, x3, n, x3);
            final float y2 = a6.y;
            a8.a.set(c4, d.c(a7.y, y2, n, y2));
            final w6.a a9 = i.a.get(n2);
            final float x4 = b3.x;
            final float c5 = d.c(b4.x, x4, n, x4);
            final float y3 = b3.y;
            a9.b.set(c5, d.c(b4.y, y3, n, y3));
            final w6.a a10 = i.a.get(n2);
            final float x5 = c2.x;
            final float c6 = d.c(c3.x, x5, n, x5);
            final float y4 = c2.y;
            a10.c.set(c6, d.c(c3.y, y4, n, y4));
        }
        h h3 = this.i;
        final List<r> m = this.k;
        h h4 = h3;
        if (m != null) {
            int n3 = m.size() - 1;
            while (true) {
                h4 = h3;
                if (n3 < 0) {
                    break;
                }
                h3 = this.k.get(n3).f(h3);
                --n3;
            }
        }
        final Path j2 = this.j;
        j2.reset();
        final PointF b5 = h4.b;
        j2.moveTo(b5.x, b5.y);
        c7.f.a.set(b5.x, b5.y);
        for (int n4 = 0; n4 < h4.a.size(); ++n4) {
            final w6.a a11 = h4.a.get(n4);
            final PointF a12 = a11.a;
            final PointF b6 = a11.b;
            final PointF c7 = a11.c;
            final PointF a13 = c7.f.a;
            if (a12.equals((Object)a13) && b6.equals((Object)c7)) {
                j2.lineTo(c7.x, c7.y);
            }
            else {
                j2.cubicTo(a12.x, a12.y, b6.x, b6.y, c7.x, c7.y);
            }
            a13.set(c7.x, c7.y);
        }
        if (h4.c) {
            j2.close();
        }
        return this.j;
    }
}
