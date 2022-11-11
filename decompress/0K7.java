// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0k7
{
    static {
        Covode.recordClassIndex(7092);
    }
    
    public static boolean LIZ(final int n, final int n2) {
        return (n & n2) == n2;
    }
    
    public static int LIZIZ(final int n, final int n2) {
        int n3 = n;
        if (LIZ(n, n2)) {
            n3 = (n ^ n2);
        }
        return n3;
    }
}
