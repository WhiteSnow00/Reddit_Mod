// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import android.graphics.Paint;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Canvas;
import q6.g0;
import d7.c;
import x6.b;
import java.util.List;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.LottieDrawable;
import t6.r;

public final class t extends a
{
    public final com.airbnb.lottie.model.layer.a r;
    public final String s;
    public final boolean t;
    public final t6.a<Integer, Integer> u;
    public r v;
    
    public t(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a r, final ShapeStroke shapeStroke) {
        super(lottieDrawable, r, shapeStroke.g.toPaintCap(), shapeStroke.h.toPaintJoin(), shapeStroke.i, shapeStroke.e, shapeStroke.f, shapeStroke.c, shapeStroke.b);
        this.r = r;
        this.s = shapeStroke.a;
        this.t = shapeStroke.j;
        final t6.a a = shapeStroke.d.a();
        (this.u = a).a((a.a)this);
        r.c(a);
    }
    
    @Override
    public final void a(final d7.c c, final Object o) {
        super.a(c, o);
        if (o == g0.b) {
            this.u.k(c);
        }
        else if (o == g0.K) {
            final r v = this.v;
            if (v != null) {
                this.r.p((t6.a<?, ?>)v);
            }
            if (c == null) {
                this.v = null;
            }
            else {
                ((t6.a)(this.v = new r(c, (Object)null))).a((a.a)this);
                this.r.c(this.u);
            }
        }
    }
    
    @Override
    public final void d(final Canvas canvas, final Matrix matrix, final int n) {
        if (this.t) {
            return;
        }
        final r6.a i = super.i;
        final t6.b b = (t6.b)this.u;
        ((Paint)i).setColor(b.l(((t6.a)b).b(), ((t6.a)b).d()));
        final r v = this.v;
        if (v != null) {
            ((Paint)super.i).setColorFilter((ColorFilter)v.f());
        }
        super.d(canvas, matrix, n);
    }
    
    public final String getName() {
        return this.s;
    }
}
