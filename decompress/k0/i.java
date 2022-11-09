// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import ah2.f;
import l0.s;

public final class i
{
    public final float a;
    public final s<Float> b;
    
    public i(final float a, final s<Float> b) {
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
        return f.a((Object)this.a, (Object)i.a) && f.a((Object)this.b, (Object)i.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Fade(alpha=");
        k.append(this.a);
        k.append(", animationSpec=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
