// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;

public final class t implements v$a
{
    public final /* synthetic */ int a;
    
    public t(final int a) {
        this.a = a;
    }
    
    public final void a(final Canvas canvas, final Paint paint, final RectF rectF) {
        final float n = (float)this.a;
        canvas.drawRoundRect(rectF, n, n, paint);
    }
}
