// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.graphics.PointF;
import android.view.animation.Interpolator;

public final class 0n2 implements Interpolator
{
    public int LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;
    
    static {
        Covode.recordClassIndex(7775);
    }
    
    public 0n2() {
        final PointF liziz = new PointF();
        this.LIZIZ = liziz;
        final PointF lizj = new PointF();
        this.LIZJ = lizj;
        liziz.x = 0.65f;
        liziz.y = 0.0f;
        lizj.x = 0.35f;
        lizj.y = 1.0f;
    }
    
    private double LIZ(final double n, final double n2, final double n3) {
        final double n4 = 1.0 - n;
        final double n5 = n * n;
        final double n6 = n4 * n4;
        return n6 * n4 * 0.0 + n6 * 3.0 * n * n2 + n4 * 3.0 * n5 * n3 + n5 * n * 1.0;
    }
    
    public final float getInterpolation(final float n) {
        int i = this.LIZ;
        float n2 = n;
        while (i < 4096) {
            n2 = i * 1.0f / 4096.0f;
            if (this.LIZ(n2, this.LIZIZ.x, this.LIZJ.x) >= n) {
                this.LIZ = i;
                break;
            }
            ++i;
        }
        double liz;
        if ((liz = this.LIZ(n2, this.LIZIZ.y, this.LIZJ.y)) > 0.999) {
            liz = 1.0;
            this.LIZ = 0;
        }
        return (float)liz;
    }
}
