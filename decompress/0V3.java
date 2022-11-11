// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0V3
{
    public float[] LIZ;
    public int[] LIZIZ;
    
    static {
        Covode.recordClassIndex(4765);
    }
    
    public 0V3(final float n, final float n2, final float n3, final float n4, final int n5, final int n6) {
        final float[] liz = new float[4];
        this.LIZ = liz;
        final int[] liziz = new int[2];
        this.LIZIZ = liziz;
        liz[0] = n;
        liz[1] = n2;
        liz[2] = n3;
        liz[3] = n4;
        liziz[0] = n5;
        liziz[1] = n6;
    }
    
    public final int LIZ(int n, int n2) {
        int n4;
        final int n3 = n4 = 0;
        if (n >= 0) {
            if (n > 3) {
                n4 = n3;
            }
            else {
                n2 *= (int)this.LIZ[n];
                final int n5 = n % 2;
                final int[] liziz = this.LIZIZ;
                if ((n = n2) > liziz[n5]) {
                    n = liziz[n5];
                }
                if (n < 0) {
                    n4 = n3;
                }
                else {
                    n4 = n;
                }
            }
        }
        return n4;
    }
}
