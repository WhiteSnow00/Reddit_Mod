// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class g60
{
    public static final ResponseField[] g;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final String f;
    
    static {
        g = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.i((Map)null, "name", false, "name"), ResponseField$b.i((Map)null, "path", false, "path"), ResponseField$b.f((Map)null, "depth", false, "depth"), ResponseField$b.a((Map)null, "isPagePresent", false, "isPagePresent"), ResponseField$b.i((Map)null, "parent", true, "parent") };
    }
    
    public g60(final String a, final String b, final String c, final int d, final boolean e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g60)) {
            return false;
        }
        final g60 g60 = (g60)o;
        return sg2.e.a((Object)this.a, (Object)g60.a) && sg2.e.a((Object)this.b, (Object)g60.b) && sg2.e.a((Object)this.c, (Object)g60.c) && this.d == g60.d && this.e == g60.e && sg2.e.a((Object)this.f, (Object)g60.f);
    }
    
    @Override
    public final int hashCode() {
        final int c = a.c(this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final String f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        return (c + e) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditWikiPageNodeFragment(__typename=");
        r.append(this.a);
        r.append(", name=");
        r.append(this.b);
        r.append(", path=");
        r.append(this.c);
        r.append(", depth=");
        r.append(this.d);
        r.append(", isPagePresent=");
        r.append(this.e);
        r.append(", parent=");
        return f0.n(r, this.f, ')');
    }
}
