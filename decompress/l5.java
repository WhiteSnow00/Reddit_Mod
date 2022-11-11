// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public class l5
{
    public static int a(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public static long b(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
}
