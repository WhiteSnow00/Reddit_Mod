// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import java.util.List;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import com.bytedance.covode.number.Covode;

public final class 1no extends 1hH
{
    public final 1gs LJII;
    
    static {
        Covode.recordClassIndex(2332);
    }
    
    public 1no(final 0LK 0lk, final 0Jy 0Jy) {
        super(0lk, 0Jy);
        (this.LJII = new 1gs(0lk, this, new 1Be("__container", 0Jy.LIZ))).LIZ(Collections.emptyList(), Collections.emptyList());
    }
    
    @Override
    public final void LIZ(final RectF rectF, final Matrix matrix) {
        super.LIZ(rectF, matrix);
        this.LJII.LIZ(rectF, super.LIZ);
    }
    
    @Override
    public final void LIZIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4) {
        this.LJII.LIZ(0k3, n, list, 0k4);
    }
    
    @Override
    public final void LIZIZ(final Canvas canvas, final Matrix matrix, final int n) {
        this.LJII.LIZ(canvas, matrix, n);
    }
    
    @Override
    public final void LIZIZ(final RectF rectF, final Matrix matrix) {
        super.LIZIZ(rectF, matrix);
        this.LJII.LIZ(rectF, super.LIZ);
    }
}
