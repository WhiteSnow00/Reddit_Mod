// 
// Decompiled by Procyon v0.6.0
// 

package h2;

import al0.f0;
import sg2.e;
import rg2.a;

public final class d
{
    public final String a;
    public final a<Boolean> b;
    
    public d(final String a, final a<Boolean> b) {
        e.f((Object)a, "label");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final String a = this.a;
        final d d = (d)o;
        return e.a((Object)a, (Object)d.a) && e.a((Object)this.b, (Object)d.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CustomAccessibilityAction(label=");
        r.append(this.a);
        r.append(", action=");
        return f0.o(r, (a)this.b, ')');
    }
}
