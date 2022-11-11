// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import aw.b;
import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class l5
{
    public static final ResponseField[] d;
    public final String a;
    public final Object b;
    public final Integer c;
    
    static {
        d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.DATETIME, "at", "at", (Map)null, true), ResponseField$b.f((Map)null, "value", true, "value") };
    }
    
    public l5(final String a, final Object b, final Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l5)) {
            return false;
        }
        final l5 l5 = (l5)o;
        return e.a((Object)this.a, (Object)l5.a) && e.a(this.b, l5.b) && e.a((Object)this.c, (Object)l5.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Object b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CreatorStatsTrendDataFragment(__typename=");
        r.append(this.a);
        r.append(", at=");
        r.append(this.b);
        r.append(", value=");
        return aw.b.i(r, this.c, ')');
    }
}
