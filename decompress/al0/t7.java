// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import j7.k;
import sg2.e;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class t7
{
    public static final ResponseField[] d;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.i((Map)null, "field", false, "field"), ResponseField$b.i((Map)null, "message", false, "message") };
    }
    
    public t7(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t7)) {
            return false;
        }
        final t7 t7 = (t7)o;
        return e.a((Object)this.a, (Object)t7.a) && e.a((Object)this.b, (Object)t7.b) && e.a((Object)this.c, (Object)t7.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + b.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("FieldErrorFragment(__typename=");
        r.append(this.a);
        r.append(", field_=");
        r.append(this.b);
        r.append(", message=");
        return f0.n(r, this.c, ')');
    }
    
    public static final class a
    {
        public static t7 a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] d = t7.d;
            final String f = k.f(d[0]);
            e.c((Object)f);
            final String f2 = k.f(d[1]);
            e.c((Object)f2);
            final String f3 = k.f(d[2]);
            e.c((Object)f3);
            return new t7(f, f2, f3);
        }
    }
}
