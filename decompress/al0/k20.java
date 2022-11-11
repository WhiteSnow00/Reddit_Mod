// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import com.apollographql.apollo.api.ResponseField$d;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class k20
{
    public static final ResponseField[] f;
    public final String a;
    public final String b;
    public final String c;
    public final Object d;
    public final Object e;
    
    static {
        final ResponseField i = ResponseField$b.i((Map)null, "__typename", false, "__typename");
        final ResponseField$d b = ResponseField$b.b((o)CustomType.ID, "subredditId", "subredditId", (Map)null, false);
        final ResponseField j = ResponseField$b.i((Map)null, "subredditName", false, "subredditName");
        final CustomType url = CustomType.URL;
        f = new ResponseField[] { i, (ResponseField)b, j, (ResponseField)ResponseField$b.b((o)url, "deeplink", "deeplink", (Map)null, false), (ResponseField)ResponseField$b.b((o)url, "templateImageUrl", "templateImageUrl", (Map)null, false) };
    }
    
    public k20(final Object d, final Object e, final String a, final String b, final String c) {
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
        if (!(o instanceof k20)) {
            return false;
        }
        final k20 k20 = (k20)o;
        return sg2.e.a((Object)this.a, (Object)k20.a) && sg2.e.a((Object)this.b, (Object)k20.b) && sg2.e.a((Object)this.c, (Object)k20.c) && sg2.e.a(this.d, k20.d) && sg2.e.a(this.e, k20.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + a81.e.g(this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditCardFragment(__typename=");
        r.append(this.a);
        r.append(", subredditId=");
        r.append(this.b);
        r.append(", subredditName=");
        r.append(this.c);
        r.append(", deeplink=");
        r.append(this.d);
        r.append(", templateImageUrl=");
        return wu.a.b(r, this.e, ')');
    }
}
