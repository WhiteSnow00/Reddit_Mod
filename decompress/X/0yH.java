// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;

public final class 0yH
{
    static {
        Covode.recordClassIndex(10384);
    }
    
    public static final Path LIZ(float n, float n2, float n3, float n4) {
        final Path path = new Path();
        float n5 = n3;
        if (n3 < 0.0f) {
            n5 = 0.0f;
        }
        n3 = n4;
        if (n4 < 0.0f) {
            n3 = 0.0f;
        }
        final float n6 = n - 0.0f;
        final float n7 = n2 - 0.0f;
        n4 = n6 / 2.0f;
        n2 = n5;
        if (n5 > n4) {
            n2 = n4;
        }
        final float n8 = n7 / 2.0f;
        n4 = n3;
        if (n3 > n8) {
            n4 = n8;
        }
        n3 = n6 - n2 * 2.0f;
        final float n9 = n7 - 2.0f * n4;
        path.moveTo(n, n4 + 0.0f);
        final float n10 = -n4;
        n = -n2;
        path.rQuadTo(0.0f, n10, n, n10);
        path.rLineTo(-n3, 0.0f);
        path.rLineTo(n, 0.0f);
        path.rLineTo(0.0f, n4);
        path.rLineTo(0.0f, n9);
        path.rLineTo(0.0f, n4);
        path.rLineTo(n2, 0.0f);
        path.rLineTo(n3, 0.0f);
        path.rQuadTo(n2, 0.0f, n2, n10);
        path.rLineTo(0.0f, -n9);
        path.close();
        return path;
    }
}
