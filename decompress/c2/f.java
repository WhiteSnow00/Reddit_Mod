// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import sg2.e;
import ej2.c0;

public final class f implements c
{
    public final float a;
    
    public f() {
        this.a = 1.0f;
    }
    
    public final long a(final long n, final long n2) {
        final float a = this.a;
        return c0.p2(a, a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof f && e.a((Object)this.a, (Object)((f)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return b.h(a.r("FixedScale(value="), this.a, ')');
    }
}
