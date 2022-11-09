// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import ak0.n;

public final class f extends j
{
    public final long a;
    
    public f(final long a) {
        this.a = a;
    }
    
    @Override
    public final long b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof j) {
            if (this.a != ((j)o).b()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32) ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        return n.o(a.k("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
