// 
// Decompiled by Procyon v0.6.0
// 

package r0;

public final class c
{
    public final long a;
    
    public c(final long a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof c;
        boolean b2 = false;
        if (b) {
            if (a == ((c)o).a) {
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
        final long a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("GridItemSpan(packedValue=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }
}
