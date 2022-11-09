// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import mj2.c0;

public final class f implements c
{
    public final float a;
    
    public f() {
        this.a = 1.0f;
    }
    
    @Override
    public final long a(final long n, final long n2) {
        final float a = this.a;
        return c0.g(a, a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof f && ah2.f.a((Object)this.a, (Object)((f)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return androidx.viewpager.widget.c.j(a.k("FixedScale(value="), this.a, ')');
    }
}
