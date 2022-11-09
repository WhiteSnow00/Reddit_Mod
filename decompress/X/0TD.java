// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0Td
{
    public final 76X LIZ;
    
    static {
        Covode.recordClassIndex(4626);
    }
    
    public 0Td(final 76X liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ(int n) {
        while ((n & 0xFFFFFF80) != 0x0) {
            this.LIZ.LIZ((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.LIZ.LIZ(n);
    }
    
    public final void LIZ(final int n, final int n2) {
        this.LIZ(n << 3 | n2);
    }
    
    public final void LIZ(long n) {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.LIZ.LIZ(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.LIZ.LIZ((int)n);
    }
    
    public final void LIZ(final String s) {
        this.LIZ.LIZ(s);
    }
}
