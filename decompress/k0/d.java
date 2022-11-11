// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import al0.g7;
import sg2.e;
import l0.s;
import u2.i;
import rg2.l;
import j1.a;

public final class d
{
    public final a a;
    public final l<i, i> b;
    public final s<i> c;
    public final boolean d;
    
    public d(final s c, final a a, final l b, final boolean d) {
        e.f((Object)a, "alignment");
        e.f((Object)b, "size");
        e.f((Object)c, "animationSpec");
        this.a = a;
        this.b = b;
        this.c = (s<i>)c;
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
        return e.a((Object)this.a, (Object)d.a) && e.a((Object)this.b, (Object)d.b) && e.a((Object)this.c, (Object)d.c) && this.d == d.d;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        return (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ChangeSize(alignment=");
        r.append(this.a);
        r.append(", size=");
        r.append(this.b);
        r.append(", animationSpec=");
        r.append(this.c);
        r.append(", clip=");
        return g7.m(r, this.d, ')');
    }
}
