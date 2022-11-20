// 
// Decompiled by Procyon v0.6.0
// 

package s40;

import b5.k;

public final class c
{
    public final long a;
    public final long b;
    
    public c(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return this.a == c.a && this.b == c.b;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + Long.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("KarmaTimestampStatistic(timestamp=");
        t.append(this.a);
        t.append(", value=");
        return k.k(t, this.b, ')');
    }
}
