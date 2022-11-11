// 
// Decompiled by Procyon v0.6.0
// 

package z6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;

public final class c extends a
{
    public c(final LottieDrawable lottieDrawable, final Layer layer) {
        super(lottieDrawable, layer);
    }
    
    @Override
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        super.b(rectF, matrix, b);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public final void k(final Canvas canvas, final Matrix matrix, final int n) {
    }
}
