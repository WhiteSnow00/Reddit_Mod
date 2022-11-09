// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import androidx.appcompat.widget.s0;
import ah2.f;
import l0.s;
import u2.i;
import zg2.l;
import j1.a;

public final class d
{
    public final a a;
    public final l<i, i> b;
    public final s<i> c;
    public final boolean d;
    
    public d(final s c, final a a, final l b, final boolean d) {
        f.f((Object)a, "alignment");
        f.f((Object)b, "size");
        f.f((Object)c, "animationSpec");
        this.a = a;
        this.b = (l<i, i>)b;
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
        return f.a((Object)this.a, (Object)d.a) && f.a((Object)this.b, (Object)d.b) && f.a((Object)this.c, (Object)d.c) && this.d == d.d;
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
        final StringBuilder k = a.k("ChangeSize(alignment=");
        k.append(this.a);
        k.append(", size=");
        k.append(this.b);
        k.append(", animationSpec=");
        k.append(this.c);
        k.append(", clip=");
        return s0.o(k, this.d, ')');
    }
}
