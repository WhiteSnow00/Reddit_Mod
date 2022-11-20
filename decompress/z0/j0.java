// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import p1.h;
import ng2.e;

public final class j0
{
    public final String a;
    
    public j0(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof j0 && e.a((Object)this.a, (Object)((j0)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return h.c(a.t("OpaqueKey(key="), this.a, ')');
    }
}
