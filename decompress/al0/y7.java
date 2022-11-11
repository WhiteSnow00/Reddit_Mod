// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class y7
{
    public static final ResponseField[] f;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    
    static {
        f = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.a((Map)null, "hasNextPage", false, "hasNextPage"), ResponseField$b.a((Map)null, "hasPreviousPage", false, "hasPreviousPage"), ResponseField$b.i((Map)null, "startCursor", true, "startCursor"), ResponseField$b.i((Map)null, "endCursor", true, "endCursor") };
    }
    
    public y7(final String a, final boolean b, final boolean c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y7)) {
            return false;
        }
        final y7 y7 = (y7)o;
        return sg2.e.a((Object)this.a, (Object)y7.a) && this.b == y7.b && this.c == y7.c && sg2.e.a((Object)this.d, (Object)y7.d) && sg2.e.a((Object)this.e, (Object)y7.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        final int c = this.c ? 1 : 0;
        if (c == 0) {
            n = c;
        }
        final String d = this.d;
        int hashCode2 = 0;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode2 = e.hashCode();
        }
        return (((hashCode * 31 + n2) * 31 + n) * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("FullPageInfoFragment(__typename=");
        r.append(this.a);
        r.append(", hasNextPage=");
        r.append(this.b);
        r.append(", hasPreviousPage=");
        r.append(this.c);
        r.append(", startCursor=");
        r.append(this.d);
        r.append(", endCursor=");
        return f0.n(r, this.e, ')');
    }
}
