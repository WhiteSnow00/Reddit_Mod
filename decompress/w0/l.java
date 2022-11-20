// 
// Decompiled by Procyon v0.6.0
// 

package w0;

import cg2.i;
import o1.r;

public final class l
{
    public final long a;
    public final long b;
    
    public l(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final long a = this.a;
        final l l = (l)o;
        return r.c(a, l.a) && r.c(this.b, l.b);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int m = r.m;
        return i.a(this.b) + i.a(a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("SelectionColors(selectionHandleColor=");
        a.A(this.a, t, ", selectionBackgroundColor=");
        return ph0.a.d(this.b, t, ')');
    }
}
