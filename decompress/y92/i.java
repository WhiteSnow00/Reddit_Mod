// 
// Decompiled by Procyon v0.6.0
// 

package y92;

import al0.f0;
import sg2.e;
import hg2.j;
import rg2.a;

public final class i
{
    public final int a;
    public final a<j> b;
    
    public i(final int a, final a<j> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return this.a == i.a && e.a((Object)this.b, (Object)i.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("NextButtonData(text=");
        r.append(this.a);
        r.append(", onClick=");
        return f0.o(r, (a)this.b, ')');
    }
}
