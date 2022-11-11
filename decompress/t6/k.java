// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import d7.c;
import d7.a;
import java.util.List;
import android.graphics.PointF;

public final class k extends g<PointF>
{
    public final PointF i;
    
    public k(final List<a<PointF>> list) {
        super((List)list);
        this.i = new PointF();
    }
    
    public final Object g(final a a, final float n) {
        return this.l(a, n, n, n);
    }
    
    public final PointF l(final a<PointF> a, float n, float b, final float n2) {
        final PointF b2 = a.b;
        if (b2 != null) {
            final PointF c = a.c;
            if (c != null) {
                final PointF pointF = b2;
                final PointF pointF2 = c;
                final c<A> e = ((t6.a)this).e;
                if (e != null) {
                    final PointF pointF3 = (PointF)e.b(a.g, a.h, (A)pointF, (A)pointF2, n, ((t6.a)this).e(), ((t6.a)this).d);
                    if (pointF3 != null) {
                        return pointF3;
                    }
                }
                final PointF i = this.i;
                n = pointF.x;
                b = a.b(pointF2.x, n, b, n);
                n = pointF.y;
                i.set(b, (pointF2.y - n) * n2 + n);
                return this.i;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
