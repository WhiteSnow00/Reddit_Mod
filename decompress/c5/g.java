// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import sg2.e;

public final class g
{
    public final int a;
    public final b0 b;
    
    public g(final int a, final b0 b) {
        e.f((Object)b, "hint");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return this.a == g.a && e.a((Object)this.b, (Object)g.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("GenerationalViewportHint(generationId=");
        r.append(this.a);
        r.append(", hint=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
