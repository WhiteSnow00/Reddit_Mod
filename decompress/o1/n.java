// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import n1.c;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import wd.a;
import sg2.e;
import java.util.List;
import n1.f;

public abstract class n
{
    static {
        new a();
    }
    
    public n() {
        final int d = f.d;
    }
    
    public abstract void a(final float p0, final long p1, final a0 p2);
    
    public static final class a
    {
        public static y a(final List list, float n, final int n2) {
            if ((n2 & 0x4) != 0x0) {
                n = Float.POSITIVE_INFINITY;
            }
            e.f((Object)list, "colors");
            return c(list, wd.a.f(0.0f, 0.0f), wd.a.f(n, 0.0f), 0);
        }
        
        public static y b(final Pair[] array) {
            return d(Arrays.copyOf(array, array.length), wd.a.f(0.0f, 0.0f), wd.a.f(Float.POSITIVE_INFINITY, 0.0f), 0);
        }
        
        public static y c(final List list, final long n, final long n2, final int n3) {
            e.f((Object)list, "colors");
            return new y(list, null, n, n2, n3);
        }
        
        public static y d(final Pair[] array, final long n, final long n2, final int n3) {
            e.f((Object)array, "colorStops");
            final int length = array.length;
            final ArrayList list = new ArrayList<r>(length);
            final int n4 = 0;
            for (int i = 0; i < length; ++i) {
                list.add(new r(((r)array[i].getSecond()).a));
            }
            final int length2 = array.length;
            final ArrayList list2 = new ArrayList<Float>(length2);
            for (int j = n4; j < length2; ++j) {
                list2.add(((Number)array[j].getFirst()).floatValue());
            }
            return new y(list, list2, n, n2, n3);
        }
        
        public static y e(final Pair[] array, long b, long c, final int n) {
            if ((n & 0x2) != 0x0) {
                b = c.b;
            }
            if ((n & 0x4) != 0x0) {
                c = c.c;
            }
            return d(array, b, c, 0);
        }
        
        public static y f(final List list, float n, float n2, final int n3) {
            if ((n3 & 0x2) != 0x0) {
                n = 0.0f;
            }
            if ((n3 & 0x4) != 0x0) {
                n2 = Float.POSITIVE_INFINITY;
            }
            e.f((Object)list, "colors");
            return c(list, wd.a.f(0.0f, n), wd.a.f(0.0f, n2), 0);
        }
        
        public static y g(final Pair[] array, float n, final int n2) {
            if ((n2 & 0x2) != 0x0) {
                n = 0.0f;
            }
            float n3;
            if ((n2 & 0x4) != 0x0) {
                n3 = Float.POSITIVE_INFINITY;
            }
            else {
                n3 = 0.0f;
            }
            return d(Arrays.copyOf(array, array.length), wd.a.f(0.0f, n), wd.a.f(0.0f, n3), 0);
        }
    }
}
