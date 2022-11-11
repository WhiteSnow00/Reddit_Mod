// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import android.graphics.PointF;
import c7.f;
import d7.a;
import java.util.List;
import y6.d;

public final class e extends g<d>
{
    public final d i;
    
    public e(final List<a<d>> list) {
        super((List)list);
        int length = 0;
        final d d = (d)list.get(0).b;
        if (d != null) {
            length = d.b.length;
        }
        this.i = new d(new float[length], new int[length]);
    }
    
    public final Object g(final a a, final float n) {
        final d i = this.i;
        final d d = (d)a.b;
        final d d2 = (d)a.c;
        i.getClass();
        if (d.b.length == d2.b.length) {
            int n2 = 0;
            while (true) {
                final int[] b = d.b;
                if (n2 >= b.length) {
                    break;
                }
                final float[] a2 = i.a;
                final float n3 = d.a[n2];
                final float n4 = d2.a[n2];
                final PointF a3 = f.a;
                a2[n2] = a.b(n4, n3, n, n3);
                i.b[n2] = vl.a.J(n, b[n2], d2.b[n2]);
                ++n2;
            }
            return this.i;
        }
        final StringBuilder r = a.r("Cannot interpolate between gradients. Lengths vary (");
        r.append(d.b.length);
        r.append(" vs ");
        throw new IllegalArgumentException(al0.a.l(r, d2.b.length, ")"));
    }
}
