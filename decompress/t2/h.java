// 
// Decompiled by Procyon v0.6.0
// 

package t2;

import u2.k;
import u2.j;
import mj2.c0;

public final class h
{
    public static final h c;
    public final long a;
    public final long b;
    
    static {
        c = new h(c0.G(0), c0.G(0));
    }
    
    public h(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final long a = this.a;
        final h h = (h)o;
        return j.a(a, h.a) && j.a(this.b, h.b);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final k[] b = j.b;
        return Long.hashCode(this.b) + Long.hashCode(a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("TextIndent(firstLine=");
        k.append((Object)j.d(this.a));
        k.append(", restLine=");
        k.append((Object)j.d(this.b));
        k.append(')');
        return k.toString();
    }
}
