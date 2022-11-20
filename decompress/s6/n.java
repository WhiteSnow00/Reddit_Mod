// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import java.util.List;
import java.util.Collections;
import c7.c;
import android.graphics.PointF;

public final class n extends a<PointF, PointF>
{
    public final PointF i;
    public final PointF j;
    public final a<Float, Float> k;
    public final a<Float, Float> l;
    public c7.c<Float> m;
    public c7.c<Float> n;
    
    public n(final s6.d k, final s6.d l) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = (a<Float, Float>)k;
        this.l = (a<Float, Float>)l;
        this.j(super.d);
    }
    
    @Override
    public final Object f() {
        return this.l(0.0f);
    }
    
    @Override
    public final /* bridge */ Object g(final c7.a a, final float n) {
        return this.l(n);
    }
    
    @Override
    public final void j(final float n) {
        this.k.j(n);
        this.l.j(n);
        this.i.set((float)this.k.f(), (float)this.l.f());
        for (int i = 0; i < super.a.size(); ++i) {
            ((a)super.a.get(i)).e();
        }
    }
    
    public final PointF l(final float n) {
        final c7.c<Float> m = this.m;
        final Float n2 = null;
        Float n3 = null;
        Label_0110: {
            if (m != null) {
                final c7.a<Float> b = this.k.b();
                if (b != null) {
                    final float d = this.k.d();
                    final Float h = b.h;
                    final c7.c<Float> i = this.m;
                    final float g = b.g;
                    float floatValue;
                    if (h == null) {
                        floatValue = g;
                    }
                    else {
                        floatValue = h;
                    }
                    n3 = i.b(g, floatValue, b.b, b.c, n, n, d);
                    break Label_0110;
                }
            }
            n3 = null;
        }
        Float n4 = n2;
        if (this.n != null) {
            final c7.a<Float> b2 = this.l.b();
            n4 = n2;
            if (b2 != null) {
                final float d2 = this.l.d();
                final Float h2 = b2.h;
                final c7.c<Float> n5 = this.n;
                final float g2 = b2.g;
                float floatValue2;
                if (h2 == null) {
                    floatValue2 = g2;
                }
                else {
                    floatValue2 = h2;
                }
                n4 = n5.b(g2, floatValue2, b2.b, b2.c, n, n, d2);
            }
        }
        if (n3 == null) {
            this.j.set(this.i.x, 0.0f);
        }
        else {
            this.j.set((float)n3, 0.0f);
        }
        if (n4 == null) {
            final PointF j = this.j;
            j.set(j.x, this.i.y);
        }
        else {
            final PointF k = this.j;
            k.set(k.x, (float)n4);
        }
        return this.j;
    }
}
