// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import b5.k;
import ng2.e;
import cg2.j;
import mg2.l;

public final class x
{
    public final Object a;
    public final l<Throwable, j> b;
    
    public x(final l b, final Object a) {
        this.a = a;
        this.b = (l<Throwable, j>)b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x)) {
            return false;
        }
        final x x = (x)o;
        return e.a(this.a, x.a) && e.a((Object)this.b, (Object)x.b);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CompletedWithCancellation(result=");
        t.append(this.a);
        t.append(", onCancellation=");
        return k.n(t, (l)this.b, ')');
    }
}
