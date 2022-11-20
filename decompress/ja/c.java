// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import java.util.ArrayList;
import java.util.List;

public final class c extends g
{
    public final List<i> a;
    
    public c(final ArrayList a) {
        this.a = a;
    }
    
    public final List<i> a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof g && this.a.equals(((g)o).a()));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        return a.s(a.t("BatchedLogRequest{logRequests="), (List)this.a, "}");
    }
}
