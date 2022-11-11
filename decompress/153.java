// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Typeface;
import android.graphics.Paint$Style;
import android.text.TextPaint;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import android.graphics.Paint;

public final class 153 extends 09P
{
    public static Paint LIZLLL;
    
    static {
        Covode.recordClassIndex(1002);
    }
    
    public 153(final 09L 09L) {
        super(09L);
    }
    
    public final void draw(final Canvas canvas, final CharSequence charSequence, int liz, final int n, final float n2, final int n3, final int n4, final int n5, final Paint paint) {
        if (09K.LIZ().LJFF) {
            final float n6 = (float)n3;
            final float n7 = super.LIZIZ;
            final float n8 = (float)n5;
            if (153.LIZLLL == null) {
                (153.LIZLLL = (Paint)new TextPaint()).setColor(09K.LIZ().LJI);
                153.LIZLLL.setStyle(Paint$Style.FILL);
            }
            canvas.drawRect(n2, n6, n2 + n7, n8, 153.LIZLLL);
        }
        final 09L liz2 = super.LIZ;
        final float n9 = (float)n4;
        final Typeface lizlll = liz2.LIZIZ.LIZLLL;
        final Typeface typeface = paint.getTypeface();
        paint.setTypeface(lizlll);
        liz = liz2.LIZ;
        canvas.drawText(liz2.LIZIZ.LIZIZ, liz * 2, 2, n2, n9, paint);
        paint.setTypeface(typeface);
    }
}
