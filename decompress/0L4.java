// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import android.graphics.PointF;

public final class 0L4
{
    public static final ThreadLocal<PointF> LIZ;
    
    static {
        Covode.recordClassIndex(2422);
        LIZ = new 0L3();
    }
    
    public static float LIZ(final float n, final float n2, final float n3) {
        return Math.max(n2, Math.min(n3, n));
    }
    
    public static int LIZ(final float n, final float n2) {
        final int n3 = (int)n;
        final int n4 = (int)n2;
        final int n5 = n3 / n4;
        int n6;
        if ((n3 ^ n4) >= 0) {
            n6 = 1;
        }
        else {
            n6 = 0;
        }
        int n7 = n5;
        if (n6 == 0) {
            n7 = n5;
            if (n3 % n4 != 0) {
                n7 = n5 - 1;
            }
        }
        return n3 - n4 * n7;
    }
    
    public static int LIZ(final int n) {
        return Math.max(0, Math.min(255, n));
    }
    
    public static int LIZ(final int n, final int n2, final float n3) {
        return (int)(n + n3 * (n2 - n));
    }
    
    public static PointF LIZ(final PointF pointF, final PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }
    
    public static void LIZ(final 0Jo 0Jo, final Path path) {
        path.reset();
        final PointF liziz = 0Jo.LIZIZ;
        path.moveTo(liziz.x, liziz.y);
        PointF pointF;
        if (0KM.a.LIZ) {
            pointF = 0L4.LIZ.get();
            pointF.set(liziz.x, liziz.y);
        }
        else {
            pointF = new PointF(liziz.x, liziz.y);
        }
        for (int i = 0; i < 0Jo.LIZ.size(); ++i) {
            final 0Jg 0Jg = 0Jo.LIZ.get(i);
            final PointF liz = 0Jg.LIZ;
            final PointF liziz2 = 0Jg.LIZIZ;
            final PointF lizj = 0Jg.LIZJ;
            if (liz.equals((Object)pointF) && liziz2.equals((Object)lizj)) {
                path.lineTo(lizj.x, lizj.y);
            }
            else {
                path.cubicTo(liz.x, liz.y, liziz2.x, liziz2.y, lizj.x, lizj.y);
            }
            pointF.set(lizj.x, lizj.y);
        }
        if (0Jo.LIZJ) {
            path.close();
        }
    }
    
    public static void LIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4, final 1BH 1bh) {
        if (0k3.LIZJ(1bh.LIZIZ(), n)) {
            list.add(0k4.LIZ(1bh.LIZIZ()).LIZ(1bh));
        }
    }
}
