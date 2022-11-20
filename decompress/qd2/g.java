// 
// Decompiled by Procyon v0.6.0
// 

package qd2;

public final class g
{
    public final int a;
    public final long b;
    
    public g(final int a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof g) {
                final g g = (g)o;
                if (this.a == g.a && this.b == g.b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final long b = this.b;
        return a * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("FileSliceInfo(slicingCount=");
        t.append(this.a);
        t.append(", bytesPerFileSlice=");
        return d.k(t, this.b, ")");
    }
}
