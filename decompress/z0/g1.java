// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import ah2.f;

public final class g1<T> implements e1<T>
{
    public final T f;
    
    public g1(final T f) {
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof g1 && ah2.f.a((Object)this.f, (Object)((g1)o).f));
    }
    
    @Override
    public final T getValue() {
        return this.f;
    }
    
    @Override
    public final int hashCode() {
        final T f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        return zu.a.b(a.k("StaticValueHolder(value="), (Object)this.f, ')');
    }
}
