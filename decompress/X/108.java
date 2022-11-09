// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Paint$FontMetricsInt;
import kotlin.jvm.internal.n;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public final class 108 extends ReplacementSpan
{
    public final Paint LIZ;
    public final 1eO LIZIZ;
    
    static {
        Covode.recordClassIndex(10674);
    }
    
    public 108(final 1eO liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
        this.LIZ = new Paint(1);
    }
    
    public final void draw(final Canvas canvas, final CharSequence charSequence, final int n, final int n2, final float n3, final int n4, final int n5, final int n6, final Paint paint) {
        CTM.LIZ((Object)canvas, (Object)paint);
        canvas.save();
        final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        n.LIZIZ((Object)fontMetricsInt, "");
        canvas.translate(n3, (float)((fontMetricsInt.descent + n5 + n5 + fontMetricsInt.ascent) / 2 - this.LIZIZ.LJIIIZ / 2));
        this.LIZIZ.LIZIZ(canvas, this.LIZ);
        canvas.restore();
    }
    
    public final int getSize(final Paint paint, final CharSequence charSequence, final int n, final int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        CTM.LIZ((Object)paint);
        return this.LIZIZ.LIZ(paint, paint$FontMetricsInt);
    }
}
