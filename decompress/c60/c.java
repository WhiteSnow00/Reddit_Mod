// 
// Decompiled by Procyon v0.6.0
// 

package c60;

import sg2.e;
import b60.m;
import java.util.List;
import b60.l;

public final class c
{
    public final l a;
    public final List<b> b;
    public final List<m> c;
    
    public c(final l a, final List<b> b, final List<m> c) {
        e.f((Object)b, "links");
        e.f((Object)c, "discoveryUnits");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return e.a((Object)this.a, (Object)c.a) && e.a((Object)this.b, (Object)c.b) && e.a((Object)this.c, (Object)c.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + aw.b.c((List)this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ListingQueryModel(listing=");
        r.append(this.a);
        r.append(", links=");
        r.append(this.b);
        r.append(", discoveryUnits=");
        return d.o(r, (List)this.c, ')');
    }
}
