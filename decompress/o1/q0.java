// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import yg.a;

public final class q0
{
    public static final long b;
    public final long a = a;
    
    static {
        b = a.x(0.5f, 0.5f);
    }
    
    public static final float a(final long n) {
        return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
    }
    
    public static String b(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("TransformOrigin(packedValue=");
        sb.append(n);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof q0;
        boolean b2 = false;
        if (b) {
            if (a == ((q0)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return b(this.a);
    }
}
