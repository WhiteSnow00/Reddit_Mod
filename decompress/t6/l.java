// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import android.graphics.PointF;
import d7.c;
import c7.f;
import d7.a;
import java.util.List;
import d7.d;

public final class l extends g<d>
{
    public final d i;
    
    public l(final List<a<d>> list) {
        super((List)list);
        this.i = new d();
    }
    
    public final Object g(final a a, float b) {
        final T b2 = a.b;
        if (b2 != null) {
            final T c = a.c;
            if (c != null) {
                final d d = (d)b2;
                final d d2 = (d)c;
                final c<A> e = ((t6.a)this).e;
                if (e != null) {
                    final d i = (d)e.b(a.g, a.h, (A)d, (A)d2, b, ((t6.a)this).e(), ((t6.a)this).d);
                    if (i != null) {
                        return i;
                    }
                }
                final d i = this.i;
                final float a2 = d.a;
                final float a3 = d2.a;
                final PointF a4 = f.a;
                final float b3 = a.b(a3, a2, b, a2);
                final float b4 = d.b;
                b = a.b(d2.b, b4, b, b4);
                i.a = b3;
                i.b = b;
                return i;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
