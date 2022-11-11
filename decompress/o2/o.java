// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import java.util.List;
import cj2.j;
import sg2.e;
import i2.a;

public final class o implements y
{
    public final char f;
    
    public o() {
        this(0);
    }
    
    public o(final int n) {
        this.f = 8226;
    }
    
    @Override
    public final x c(final i2.a a) {
        e.f((Object)a, "text");
        return new x(new i2.a(6, j.J0(a.f.length(), String.valueOf(this.f)), null), m.a.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof o && this.f == ((o)o).f);
    }
    
    @Override
    public final int hashCode() {
        return Character.hashCode(this.f);
    }
}
