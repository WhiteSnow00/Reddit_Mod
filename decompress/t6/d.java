// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import android.graphics.PointF;
import d7.c;
import c7.f;
import d7.a;
import java.util.List;

public final class d extends g<Float>
{
    public d(final List<a<Float>> list) {
        super((List)list);
    }
    
    public final Object g(final a a, final float n) {
        return this.m(a, n);
    }
    
    public final float l() {
        return this.m(((t6.a<Float, A>)this).b(), ((t6.a)this).d());
    }
    
    public final float m(final a<Float> a, final float n) {
        if (a.b != null && a.c != null) {
            final c<A> e = ((t6.a)this).e;
            if (e != null) {
                final Float n2 = (Float)e.b(a.g, a.h, (A)a.b, (A)a.c, n, ((t6.a)this).e(), ((t6.a)this).d);
                if (n2 != null) {
                    return n2;
                }
            }
            if (a.i == -3987645.8f) {
                a.i = a.b;
            }
            final float i = a.i;
            if (a.j == -3987645.8f) {
                a.j = a.c;
            }
            final float j = a.j;
            final PointF a2 = f.a;
            return a.b(j, i, n, i);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
