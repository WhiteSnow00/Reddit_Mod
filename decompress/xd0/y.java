// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import p1.h;
import ng2.e;
import java.util.ArrayList;
import java.util.List;

public final class y<T>
{
    public final T a;
    public final List<String> b;
    
    public y(final Object a, final ArrayList b) {
        this.a = (T)a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final y y = (y)o;
        return e.a((Object)this.a, (Object)y.a) && e.a((Object)this.b, (Object)y.b);
    }
    
    @Override
    public final int hashCode() {
        final T a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final List<String> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Response(data=");
        t.append(this.a);
        t.append(", errors=");
        return h.d(t, (List)this.b, ')');
    }
}
