// 
// Decompiled by Procyon v0.6.0
// 

package wd2;

import p1.h;
import ng2.e;

public final class f
{
    public final long a;
    public final String b;
    
    public f(final long a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return this.a == f.a && e.a((Object)this.b, (Object)f.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Long.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TimedMetadata(time=");
        t.append(this.a);
        t.append(", metadata=");
        return h.c(t, this.b, ')');
    }
}
