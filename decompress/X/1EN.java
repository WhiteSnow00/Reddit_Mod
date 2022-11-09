// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import android.graphics.Bitmap;

public final class 1eN extends 106
{
    public final Bitmap LIZ;
    public final Rect LIZIZ;
    
    static {
        Covode.recordClassIndex(10666);
    }
    
    public 1eN(final Context context, final Bitmap liz) {
        CTM.LIZ((Object)context, (Object)liz);
        super(context);
        this.LIZ = liz;
        this.LIZIZ = new Rect();
    }
    
    @Override
    public final int LIZ(final Paint paint) {
        CTM.LIZ((Object)paint);
        final int right = super.LJIIIZ * this.LIZ.getWidth() / this.LIZ.getHeight();
        this.LIZIZ.right = right;
        this.LIZIZ.bottom = super.LJIIIZ;
        return right;
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final Paint paint) {
        CTM.LIZ((Object)canvas, (Object)paint);
        if (!this.LIZ.isRecycled()) {
            canvas.drawBitmap(this.LIZ, (Rect)null, this.LIZIZ, (Paint)null);
        }
    }
}
