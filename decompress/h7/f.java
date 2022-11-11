// 
// Decompiled by Procyon v0.6.0
// 

package h7;

import aw.b;
import sg2.e;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public final class f
{
    public final String a;
    public final List<a> b;
    public final Map<String, Object> c;
    
    public f(final String a, final List b, final HashMap c) {
        e.g((Object)a, "message");
        e.g((Object)b, "locations");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final String a = this.a;
        final f f = (f)o;
        return e.a((Object)a, (Object)f.a) && e.a((Object)this.b, (Object)f.b) && e.a((Object)this.c, (Object)f.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + aw.b.c((List)this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Error(message = ");
        r.append(this.a);
        r.append(", locations = ");
        r.append(this.b);
        r.append(", customAttributes = ");
        return a81.e.o(r, (Map)this.c, ')');
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final long a = this.a;
            final a a2 = (a)o;
            return a == a2.a && this.b == a2.b;
        }
        
        @Override
        public final int hashCode() {
            return Long.hashCode(this.b) + Long.hashCode(this.a) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("Location(line = ");
            r.append(this.a);
            r.append(", column = ");
            return b.i(r, this.b, ')');
        }
    }
}
