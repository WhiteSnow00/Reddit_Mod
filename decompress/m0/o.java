// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import hg2.i;
import o1.r;
import sg2.e;
import p0.a0;
import aa1.a;
import p0.z;

public final class o
{
    public final long a;
    public final z b;
    
    public o() {
        final long e = aa1.a.e(4284900966L);
        final a0 g = aa1.a.g(0.0f, 0.0f, 3);
        this.a = e;
        this.b = (z)g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!e.a((Object)o.class, (Object)class1)) {
            return false;
        }
        if (o != null) {
            final o o2 = (o)o;
            return r.c(this.a, o2.a) && e.a((Object)this.b, (Object)o2.b);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int m = r.m;
        return this.b.hashCode() + i.a(a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("OverscrollConfiguration(glowColor=");
        android.support.v4.media.a.q(this.a, r, ", drawPadding=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
