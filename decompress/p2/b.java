// 
// Decompiled by Procyon v0.6.0
// 

package p2;

import ah2.f;

public final class b
{
    public final d a;
    
    public b(final d a) {
        f.f((Object)a, "platformLocale");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof b && (this == o || f.a((Object)this.a.a(), (Object)((b)o).a.a()));
    }
    
    @Override
    public final int hashCode() {
        return this.a.a().hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.a();
    }
}
