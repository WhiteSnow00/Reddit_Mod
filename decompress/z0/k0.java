// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import ah2.f;

public final class k0
{
    public final String a;
    
    public k0(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof k0 && f.a((Object)this.a, (Object)((k0)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return b.k(a.k("OpaqueKey(key="), this.a, ')');
    }
}
