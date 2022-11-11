// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import android.graphics.PointF;
import d7.c;
import d7.a;
import java.util.List;

public final class f extends g<Integer>
{
    public f(final List<a<Integer>> list) {
        super((List)list);
    }
    
    public final Object g(final a a, final float n) {
        return this.l(a, n);
    }
    
    public final int l(final a<Integer> a, final float n) {
        if (a.b != null && a.c != null) {
            final c<A> e = ((t6.a)this).e;
            if (e != null) {
                final Integer n2 = (Integer)e.b(a.g, a.h, (A)a.b, (A)a.c, n, ((t6.a)this).e(), ((t6.a)this).d);
                if (n2 != null) {
                    return n2;
                }
            }
            if (a.k == 784923401) {
                a.k = a.b;
            }
            final int k = a.k;
            if (a.l == 784923401) {
                a.l = a.c;
            }
            final int l = a.l;
            final PointF a2 = c7.f.a;
            return (int)(n * (l - k) + k);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
