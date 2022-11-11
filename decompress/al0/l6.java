// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import com.reddit.type.DurationUnit$a;
import j7.k;
import sg2.e;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.reddit.type.DurationUnit;
import com.apollographql.apollo.api.ResponseField;

public final class l6
{
    public static final ResponseField[] d;
    public final String a;
    public final int b;
    public final DurationUnit c;
    
    static {
        d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.f((Map)null, "amount", false, "amount"), ResponseField$b.d("unit", false, "unit") };
    }
    
    public l6(final String a, final int b, final DurationUnit c) {
        e.f((Object)c, "unit");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l6)) {
            return false;
        }
        final l6 l6 = (l6)o;
        return e.a((Object)this.a, (Object)l6.a) && this.b == l6.b && this.c == l6.c;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + a.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("DurationFragment(__typename=");
        r.append(this.a);
        r.append(", amount=");
        r.append(this.b);
        r.append(", unit=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
    
    public static final class a
    {
        public static l6 a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] d = l6.d;
            final String f = k.f(d[0]);
            e.c((Object)f);
            final int f2 = a81.e.f(k, d[1]);
            final DurationUnit$a companion = DurationUnit.Companion;
            final String f3 = k.f(d[2]);
            e.c((Object)f3);
            companion.getClass();
            return new l6(f, f2, DurationUnit$a.a(f3));
        }
    }
}
