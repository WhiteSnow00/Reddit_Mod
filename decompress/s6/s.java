// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import android.graphics.ColorFilter;
import t6.b;
import android.graphics.Matrix;
import android.graphics.Canvas;
import q6.g0;
import d7.c;
import java.util.List;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.LottieDrawable;
import t6.r;

public final class s extends a
{
    public final com.airbnb.lottie.model.layer.a r;
    public final String s;
    public final boolean t;
    public final t6.a<Integer, Integer> u;
    public r v;
    
    public s(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a r, final ShapeStroke shapeStroke) {
        super(lottieDrawable, r, shapeStroke.g.toPaintCap(), shapeStroke.h.toPaintJoin(), shapeStroke.i, shapeStroke.e, shapeStroke.f, (List)shapeStroke.c, shapeStroke.b);
        this.r = r;
        this.s = shapeStroke.a;
        this.t = shapeStroke.j;
        final t6.a b = shapeStroke.d.b();
        (this.u = b).a((t6.a.a)this);
        r.d(b);
    }
    
    public final void a(final c c, final Object o) {
        super.a(c, o);
        if (o == g0.b) {
            this.u.k((d7.c<Integer>)c);
        }
        else if (o == g0.K) {
            final r v = this.v;
            if (v != null) {
                this.r.p(v);
            }
            if (c == null) {
                this.v = null;
            }
            else {
                (this.v = new r((c<A>)c, null)).a((t6.a.a)this);
                this.r.d(this.u);
            }
        }
    }
    
    public final void e(final Canvas canvas, final Matrix matrix, final int n) {
        if (this.t) {
            return;
        }
        final r6.a i = super.i;
        final b b = (b)this.u;
        i.setColor(b.l(((t6.a)b).b(), ((t6.a)b).d()));
        final r v = this.v;
        if (v != null) {
            super.i.setColorFilter((ColorFilter)v.f());
        }
        super.e(canvas, matrix, n);
    }
    
    public final String getName() {
        return this.s;
    }
}
