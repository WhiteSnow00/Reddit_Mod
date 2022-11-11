// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import sg2.e;
import i2.a;

public final class x
{
    public final a a;
    public final m b;
    
    public x(final a a, final m b) {
        e.f((Object)a, "text");
        e.f((Object)b, "offsetMapping");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x)) {
            return false;
        }
        final a a = this.a;
        final x x = (x)o;
        return e.a((Object)a, (Object)x.a) && e.a((Object)this.b, (Object)x.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("TransformedText(text=");
        r.append((Object)this.a);
        r.append(", offsetMapping=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
