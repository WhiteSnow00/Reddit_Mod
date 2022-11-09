// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.graphics.PointF;
import android.view.animation.Interpolator;

public class 0do implements Interpolator
{
    public final PointF LIZ;
    public final PointF LIZIZ;
    public int LIZJ;
    
    static {
        Covode.recordClassIndex(5885);
    }
    
    public 0do() {
        this.LIZ = new PointF();
        this.LIZIZ = new PointF();
    }
    
    public 0do(final byte b) {
        final PointF liz = new PointF();
        this.LIZ = liz;
        final PointF liziz = new PointF();
        this.LIZIZ = liziz;
        liz.x = 0.32f;
        liz.y = 0.94f;
        liziz.x = 0.6f;
        liziz.y = 1.0f;
    }
    
    public static double LIZ(final double n, final double n2, final double n3) {
        final double n4 = 1.0 - n;
        final double n5 = n * n;
        final double n6 = n4 * n4;
        return n6 * n4 * 0.0 + n6 * 3.0 * n * n2 + n4 * 3.0 * n5 * n3 + n5 * n * 1.0;
    }
    
    public float getInterpolation(final float n) {
        int i = this.LIZJ;
        float n2 = n;
        while (i < 4096) {
            n2 = i * 1.0f / 4096.0f;
            if (LIZ(n2, this.LIZ.x, this.LIZIZ.x) >= n) {
                this.LIZJ = i;
                break;
            }
            ++i;
        }
        double liz;
        if ((liz = LIZ(n2, this.LIZ.y, this.LIZIZ.y)) > 0.999) {
            liz = 1.0;
            this.LIZJ = 0;
        }
        return (float)liz;
    }
}
