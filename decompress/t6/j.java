// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import d7.c;
import android.graphics.Path;
import d7.a;
import java.util.List;
import android.graphics.PathMeasure;
import android.graphics.PointF;

public final class j extends g<PointF>
{
    public final PointF i;
    public final float[] j;
    public final PathMeasure k;
    public i l;
    
    public j(final List<? extends a<PointF>> list) {
        super((List)list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }
    
    public final Object g(final a a, final float n) {
        final i l = (i)a;
        final Path q = l.q;
        PointF i;
        if (q == null) {
            i = (PointF)a.b;
        }
        else {
            final c<A> e = ((t6.a)this).e;
            if (e != null) {
                i = (PointF)e.b(((a)l).g, ((a)l).h, (A)((a)l).b, (A)((a)l).c, ((t6.a)this).e(), n, ((t6.a)this).d);
                if (i != null) {
                    return i;
                }
            }
            if (this.l != l) {
                this.k.setPath(q, false);
                this.l = l;
            }
            final PathMeasure k = this.k;
            k.getPosTan(k.getLength() * n, this.j, (float[])null);
            final PointF j = this.i;
            final float[] m = this.j;
            j.set(m[0], m[1]);
            i = this.i;
        }
        return i;
    }
}
