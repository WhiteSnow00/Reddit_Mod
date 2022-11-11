// 
// Decompiled by Procyon v0.6.0
// 

package z6;

import java.util.ArrayList;
import b7.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import y6.k;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.b;
import com.airbnb.lottie.model.layer.a;

public final class d extends a
{
    public final s6.d C;
    public final b D;
    
    public d(final LottieDrawable lottieDrawable, final Layer layer, final b d) {
        super(lottieDrawable, layer);
        this.D = d;
        (this.C = new s6.d(lottieDrawable, this, new k("__container", false, layer.a))).g(Collections.emptyList(), Collections.emptyList());
    }
    
    @Override
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        super.b(rectF, matrix, b);
        this.C.b(rectF, super.n, b);
    }
    
    @Override
    public final void k(final Canvas canvas, final Matrix matrix, final int n) {
        this.C.d(canvas, matrix, n);
    }
    
    @Override
    public final y6.a l() {
        final y6.a w = super.p.w;
        if (w != null) {
            return w;
        }
        return ((a)this.D).p.w;
    }
    
    @Override
    public final j m() {
        final j x = super.p.x;
        if (x != null) {
            return x;
        }
        return ((a)this.D).p.x;
    }
    
    @Override
    public final void q(final w6.d d, final int n, final ArrayList list, final w6.d d2) {
        this.C.h(d, n, list, d2);
    }
}
