// 
// Decompiled by Procyon v0.6.0
// 

package wd2;

import aq2.a;

public final class d
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public d(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return this.a == d.a && this.b == d.b && this.c == d.c && this.d == d.d;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.d) + aq2.a.c(this.c, aq2.a.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PlayerStats(videoBitrate=");
        t.append(this.a);
        t.append(", videoFramesDecoded=");
        t.append(this.b);
        t.append(", videoFramesDropped=");
        t.append(this.c);
        t.append(", videoFramesRendered=");
        return d.j(t, this.d, ')');
    }
}
