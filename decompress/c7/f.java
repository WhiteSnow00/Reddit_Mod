// 
// Decompiled by Procyon v0.6.0
// 

package c7;

import w6.e;
import s6.c;
import s6.k;
import java.util.ArrayList;
import w6.d;
import android.graphics.PointF;

public final class f
{
    public static final PointF a;
    
    static {
        a = new PointF();
    }
    
    public static PointF a(final PointF pointF, final PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }
    
    public static float b(final float n, final float n2, final float n3) {
        return Math.max(n2, Math.min(n3, n));
    }
    
    public static int c(final float n, final float n2) {
        final int n3 = (int)n;
        final int n4 = (int)n2;
        final int n5 = n3 / n4;
        final boolean b = (n3 ^ n4) >= 0;
        int n6 = n5;
        if (!b) {
            n6 = n5;
            if (n3 % n4 != 0) {
                n6 = n5 - 1;
            }
        }
        return n3 - n4 * n6;
    }
    
    public static void d(d d, final int n, final ArrayList list, d d2, final k b) {
        if (d.a(n, ((c)b).getName())) {
            final String name = ((c)b).getName();
            d2.getClass();
            d2 = new d(d2);
            d2.a.add(name);
            d = new d(d2);
            d.b = (e)b;
            list.add(d);
        }
    }
}
