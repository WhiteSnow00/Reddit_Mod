// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import java.util.ArrayList;
import b7.f;
import b7.c;
import android.graphics.PointF;
import r6.r;
import java.util.List;
import android.graphics.Path;
import x6.h;

public final class m extends a<h, Path>
{
    public final h i;
    public final Path j;
    public List<r> k;
    
    public m(final List<c7.a<h>> list) {
        super(list);
        this.i = new h();
        this.j = new Path();
    }
    
    @Override
    public final Object g(final c7.a a, final float n) {
        final h h = (h)a.b;
        final h h2 = (h)a.c;
        final h i = this.i;
        if (i.b == null) {
            i.b = new PointF();
        }
        i.c = (h.c || h2.c);
        if (h.a.size() != h2.a.size()) {
            final StringBuilder t = a.t("Curves must have the same number of control points. Shape 1: ");
            t.append(h.a.size());
            t.append("\tShape 2: ");
            t.append(h2.a.size());
            b7.c.b(t.toString());
        }
        final int min = Math.min(h.a.size(), h2.a.size());
        if (i.a.size() < min) {
            for (int j = i.a.size(); j < min; ++j) {
                i.a.add(new v6.a());
            }
        }
        else if (i.a.size() > min) {
            for (int k = i.a.size() - 1; k >= min; --k) {
                final ArrayList a2 = i.a;
                a2.remove(a2.size() - 1);
            }
        }
        final PointF b = h.b;
        final PointF b2 = h2.b;
        final float x = b.x;
        final float x2 = b2.x;
        final PointF a3 = b7.f.a;
        final float b3 = d.b(x2, x, n, x);
        final float y = b.y;
        i.a(b3, (b2.y - y) * n + y);
        for (int l = i.a.size() - 1; l >= 0; --l) {
            final v6.a a4 = h.a.get(l);
            final v6.a a5 = h2.a.get(l);
            final PointF a6 = a4.a;
            final PointF b4 = a4.b;
            final PointF c = a4.c;
            final PointF a7 = a5.a;
            final PointF b5 = a5.b;
            final PointF c2 = a5.c;
            final v6.a a8 = i.a.get(l);
            final float x3 = a6.x;
            final float b6 = d.b(a7.x, x3, n, x3);
            final float y2 = a6.y;
            a8.a.set(b6, d.b(a7.y, y2, n, y2));
            final v6.a a9 = i.a.get(l);
            final float x4 = b4.x;
            final float b7 = d.b(b5.x, x4, n, x4);
            final float y3 = b4.y;
            a9.b.set(b7, d.b(b5.y, y3, n, y3));
            final v6.a a10 = i.a.get(l);
            final float x5 = c.x;
            final float b8 = d.b(c2.x, x5, n, x5);
            final float y4 = c.y;
            a10.c.set(b8, d.b(c2.y, y4, n, y4));
        }
        h h3 = this.i;
        final List<r> m = this.k;
        h h4 = h3;
        if (m != null) {
            int n2 = m.size() - 1;
            while (true) {
                h4 = h3;
                if (n2 < 0) {
                    break;
                }
                h3 = this.k.get(n2).h(h3);
                --n2;
            }
        }
        final Path j2 = this.j;
        j2.reset();
        final PointF b9 = h4.b;
        j2.moveTo(b9.x, b9.y);
        b7.f.a.set(b9.x, b9.y);
        for (int n3 = 0; n3 < h4.a.size(); ++n3) {
            final v6.a a11 = h4.a.get(n3);
            final PointF a12 = a11.a;
            final PointF b10 = a11.b;
            final PointF c3 = a11.c;
            final PointF a13 = b7.f.a;
            if (a12.equals((Object)a13) && b10.equals((Object)c3)) {
                j2.lineTo(c3.x, c3.y);
            }
            else {
                j2.cubicTo(a12.x, a12.y, b10.x, b10.y, c3.x, c3.y);
            }
            a13.set(c3.x, c3.y);
        }
        if (h4.c) {
            j2.close();
        }
        return this.j;
    }
}
