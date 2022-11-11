// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.reddit.type.TagType;
import com.apollographql.apollo.api.ResponseField;

public final class h5
{
    public static final ResponseField[] f;
    public final String a;
    public final String b;
    public final TagType c;
    public final String d;
    public final boolean e;
    
    static {
        f = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.ID, "id", "id", (Map)null, false), ResponseField$b.d("type", false, "type"), ResponseField$b.i((Map)null, "text", false, "text"), ResponseField$b.a((Map)null, "isRecommended", false, "isRecommended") };
    }
    
    public h5(final String a, final String b, final TagType c, final String d, final boolean e) {
        sg2.e.f((Object)c, "type");
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
        if (!(o instanceof h5)) {
            return false;
        }
        final h5 h5 = (h5)o;
        return sg2.e.a((Object)this.a, (Object)h5.a) && sg2.e.a((Object)this.b, (Object)h5.b) && this.c == h5.c && sg2.e.a((Object)this.d, (Object)h5.d) && this.e == h5.e;
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.d, (this.c.hashCode() + b.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31);
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        return c + e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CommunityTagFragment(__typename=");
        r.append(this.a);
        r.append(", id=");
        r.append(this.b);
        r.append(", type=");
        r.append(this.c);
        r.append(", text=");
        r.append(this.d);
        r.append(", isRecommended=");
        return g7.m(r, this.e, ')');
    }
}
