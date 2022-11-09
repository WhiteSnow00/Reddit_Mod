// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import ak0.n;
import java.util.ArrayList;
import java.util.List;

public final class c extends g
{
    public final List<i> a;
    
    public c(final ArrayList a) {
        this.a = a;
    }
    
    @Override
    public final List<i> a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof g && this.a.equals(((g)o).a()));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        return n.r(a.k("BatchedLogRequest{logRequests="), (List)this.a, "}");
    }
}
