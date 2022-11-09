// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import ah2.f;
import i2.a;

public final class x
{
    public final a a;
    public final m b;
    
    public x(final a a, final m b) {
        f.f((Object)a, "text");
        f.f((Object)b, "offsetMapping");
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
        return f.a((Object)a, (Object)x.a) && f.a((Object)this.b, (Object)x.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("TransformedText(text=");
        k.append(this.a);
        k.append(", offsetMapping=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
