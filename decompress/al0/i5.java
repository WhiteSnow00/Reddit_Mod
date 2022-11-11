// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import com.apollographql.apollo.api.ResponseField$d;
import j7.k;
import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class i5
{
    public static final ResponseField[] d;
    public final String a;
    public final Object b;
    public final boolean c;
    
    static {
        d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.DATETIME, "availableAt", "availableAt", (Map)null, true), ResponseField$b.a((Map)null, "isAvailable", false, "isAvailable") };
    }
    
    public i5(final String a, final boolean c, final Object b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i5)) {
            return false;
        }
        final i5 i5 = (i5)o;
        return e.a((Object)this.a, (Object)i5.a) && e.a(this.b, i5.b) && this.c == i5.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Object b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode * 31 + hashCode2) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CreatorStatsAvailabilityFragment(__typename=");
        r.append(this.a);
        r.append(", availableAt=");
        r.append(this.b);
        r.append(", isAvailable=");
        return g7.m(r, this.c, ')');
    }
    
    public static final class a
    {
        public static i5 a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] d = i5.d;
            final String f = k.f(d[0]);
            e.c((Object)f);
            final ResponseField responseField = d[1];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            return new i5(f, f0.x(k, d[2]), k.d((ResponseField$d)responseField));
        }
    }
}
