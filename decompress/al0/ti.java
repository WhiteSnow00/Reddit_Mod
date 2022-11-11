// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import j7.k;
import sg2.e;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class ti
{
    public static final ResponseField[] d;
    public final String a;
    public final boolean b;
    public final String c;
    
    static {
        d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.a((Map)null, "hasNextPage", false, "hasNextPage"), ResponseField$b.i((Map)null, "endCursor", true, "endCursor") };
    }
    
    public ti(final String a, final boolean b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ti)) {
            return false;
        }
        final ti ti = (ti)o;
        return e.a((Object)this.a, (Object)ti.a) && this.b == ti.b && e.a((Object)this.c, (Object)ti.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + b) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PageInfoFragment(__typename=");
        r.append(this.a);
        r.append(", hasNextPage=");
        r.append(this.b);
        r.append(", endCursor=");
        return f0.n(r, this.c, ')');
    }
    
    public static final class a
    {
        public static ti a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] d = ti.d;
            final String f = k.f(d[0]);
            e.c((Object)f);
            return new ti(f, f0.x(k, d[1]), k.f(d[2]));
        }
    }
}
