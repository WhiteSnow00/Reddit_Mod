// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import o1.q0;
import ah2.f;
import l0.s;

public final class m
{
    public final float a;
    public final long b;
    public final s<Float> c;
    
    public m() {
        throw null;
    }
    
    public m(final float a, final long b, final s c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        if (!f.a((Object)this.a, (Object)m.a)) {
            return false;
        }
        final long b = this.b;
        final long b2 = m.b;
        final int c = q0.c;
        return b == b2 && f.a((Object)this.c, (Object)m.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = Float.hashCode(this.a);
        final long b = this.b;
        final int c = q0.c;
        return this.c.hashCode() + b.c(b, hashCode * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Scale(scale=");
        k.append(this.a);
        k.append(", transformOrigin=");
        k.append((Object)q0.b(this.b));
        k.append(", animationSpec=");
        k.append(this.c);
        k.append(')');
        return k.toString();
    }
}
