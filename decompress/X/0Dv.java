// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;

public final class 0dv
{
    static {
        Covode.recordClassIndex(5904);
    }
    
    public static int LIZ(final Canvas canvas, final float n, final float n2, final float n3, final float n4, final Paint paint) {
        return canvas.saveLayer(n, n2, n3, n4, paint);
    }
    
    public static int LIZ(final Canvas canvas, final int n, final int n2, final Paint paint) {
        return LIZ(canvas, 0.0f, 0.0f, (float)n, (float)n2, paint);
    }
    
    public static int LIZ(final Canvas canvas, final Rect rect, final Paint paint) {
        return LIZ(canvas, (float)rect.left, (float)rect.top, (float)rect.right, (float)rect.bottom, paint);
    }
}
