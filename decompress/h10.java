// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class h10
{
    public static final ResponseField[] f;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Object e;
    
    static {
        f = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.i((Map)null, "value", false, "value"), ResponseField$b.i((Map)null, "unit", false, "unit"), ResponseField$b.a((Map)null, "isPlusText", false, "isPlusText"), (ResponseField)ResponseField$b.b((o)CustomType.URL, "templateImageUrl", "templateImageUrl", (Map)null, false) };
    }
    
    public h10(final String a, final String b, final String c, final boolean d, final Object e) {
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
        if (!(o instanceof h10)) {
            return false;
        }
        final h10 h10 = (h10)o;
        return sg2.e.a((Object)this.a, (Object)h10.a) && sg2.e.a((Object)this.b, (Object)h10.b) && sg2.e.a((Object)this.c, (Object)h10.c) && this.d == h10.d && sg2.e.a(this.e, h10.e);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31);
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        return this.e.hashCode() + (c + d) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SingleStatCardFragment(__typename=");
        r.append(this.a);
        r.append(", value=");
        r.append(this.b);
        r.append(", unit=");
        r.append(this.c);
        r.append(", isPlusText=");
        r.append(this.d);
        r.append(", templateImageUrl=");
        return wu.a.b(r, this.e, ')');
    }
}
