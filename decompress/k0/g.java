// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import ah2.f;

public abstract class g
{
    static {
        new h(new t(null, null, null, null, 15));
    }
    
    public abstract t a();
    
    public final h b(final h h) {
        final t a = ((h)this).a;
        i i;
        if ((i = a.a) == null) {
            i = h.a.a;
        }
        q q;
        if ((q = a.b) == null) {
            q = h.a.b;
        }
        d d;
        if ((d = a.c) == null) {
            d = h.a.c;
        }
        m m;
        if ((m = a.d) == null) {
            m = h.a.d;
        }
        return new h(new t(i, q, d, m));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof g && f.a((Object)((g)o).a(), (Object)this.a());
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }
}
