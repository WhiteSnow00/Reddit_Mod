// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import android.graphics.Path$Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;

public final class u implements v$a
{
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    
    public u(final float c, final float d) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final Canvas canvas, final Paint paint, final RectF rectF) {
        final Path path = new Path();
        final float a = this.a;
        final float b = this.b;
        final float c = this.c;
        final float d = this.d;
        path.addRoundRect(rectF, new float[] { a, a, b, b, c, c, d, d }, Path$Direction.CW);
        canvas.drawPath(path, paint);
    }
}
