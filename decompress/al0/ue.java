// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import j7.k;
import sg2.e;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class ue
{
    public static final ResponseField[] d;
    public final String a;
    public final int b;
    public final int c;
    
    static {
        d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.f((Map)null, "width", false, "width"), ResponseField$b.f((Map)null, "height", false, "height") };
    }
    
    public ue(final String a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ue)) {
            return false;
        }
        final ue ue = (ue)o;
        return e.a((Object)this.a, (Object)ue.a) && this.b == ue.b && this.c == ue.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + a.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("MediaDimensions(__typename=");
        r.append(this.a);
        r.append(", width=");
        r.append(this.b);
        r.append(", height=");
        return d.l(r, this.c, ')');
    }
    
    public static final class a
    {
        public static ue a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] d = ue.d;
            final String f = k.f(d[0]);
            e.c((Object)f);
            return new ue(f, a81.e.f(k, d[1]), a81.e.f(k, d[2]));
        }
    }
}
