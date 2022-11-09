// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Matrix;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

public final class 0x8
{
    static {
        Covode.recordClassIndex(10221);
    }
    
    public static final Bitmap LIZ(Bitmap bitmap, final int n, final int n2) {
        MethodCollector.i(9321);
        CTM.LIZ((Object)bitmap);
        final int height = bitmap.getHeight();
        final int width = bitmap.getWidth();
        final float n3 = n / (float)width;
        final float n4 = n2 / (float)height;
        final Matrix matrix = new Matrix();
        matrix.postScale(n3, n4);
        bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        MethodCollector.o(9321);
        return bitmap;
    }
}
