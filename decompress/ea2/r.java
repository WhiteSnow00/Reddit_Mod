// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import sg2.e;

public final class r extends v
{
    public final int a;
    
    public r(final int a) {
        this.a = a;
    }
    
    public final boolean a(final v v) {
        e.f((Object)v, "item");
        return v instanceof r && ((r)v).a == this.a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof r && this.a == ((r)o).a);
    }
    
    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
    
    public final String toString() {
        return d.l(a.r("TitleItem(title="), this.a, ')');
    }
}
