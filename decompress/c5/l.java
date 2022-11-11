// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import kotlin.NoWhenBranchMatchedException;
import androidx.paging.LoadType;
import sg2.e;

public final class l
{
    public static final l d;
    public final k a;
    public final k b;
    public final k c;
    
    static {
        final k.c c = k.c.c;
        d = new l(c, c, c);
    }
    
    public l(final k a, final k b, final k c) {
        e.f((Object)a, "refresh");
        e.f((Object)b, "prepend");
        e.f((Object)c, "append");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static l a(final l l, k.c a, k.c b, k.c c, final int n) {
        if ((n & 0x1) != 0x0) {
            a = (k.c)l.a;
        }
        if ((n & 0x2) != 0x0) {
            b = (k.c)l.b;
        }
        if ((n & 0x4) != 0x0) {
            c = (k.c)l.c;
        }
        l.getClass();
        e.f((Object)a, "refresh");
        e.f((Object)b, "prepend");
        e.f((Object)c, "append");
        return new l(a, b, c);
    }
    
    public final l b(final LoadType loadType) {
        final k.c c = k.c.c;
        e.f((Object)loadType, "loadType");
        final int n = l.a.a[loadType.ordinal()];
        l l;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                l = a(this, c, null, null, 6);
            }
            else {
                l = a(this, null, c, null, 5);
            }
        }
        else {
            l = a(this, null, null, c, 3);
        }
        return l;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        return e.a((Object)this.a, (Object)l.a) && e.a((Object)this.b, (Object)l.b) && e.a((Object)this.c, (Object)l.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("LoadStates(refresh=");
        r.append(this.a);
        r.append(", prepend=");
        r.append(this.b);
        r.append(", append=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
}
