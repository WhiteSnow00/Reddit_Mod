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

public final class k6
{
    public static final ResponseField[] c;
    public final String a;
    public final Object b;
    
    static {
        c = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.URL, "url", "url", (Map)null, false) };
    }
    
    public k6(final String a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k6)) {
            return false;
        }
        final k6 k6 = (k6)o;
        return e.a((Object)this.a, (Object)k6.a) && e.a(this.b, k6.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("DownloadMediaFragment(__typename=");
        r.append(this.a);
        r.append(", url=");
        return wu.a.b(r, this.b, ')');
    }
}
