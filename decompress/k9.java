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

public final class k9
{
    public static final ResponseField[] d;
    public final String a;
    public final int b;
    public final String c;
    
    static {
        d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.f((Map)null, "price", false, "price"), (ResponseField)ResponseField$b.b((o)CustomType.ID, "googleExternalProductId", "googleExternalProductId", (Map)null, true) };
    }
    
    public k9(final String a, final int b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k9)) {
            return false;
        }
        final k9 k9 = (k9)o;
        return e.a((Object)this.a, (Object)k9.a) && this.b == k9.b && e.a((Object)this.c, (Object)k9.c);
    }
    
    @Override
    public final int hashCode() {
        final int c = a.c(this.b, this.a.hashCode() * 31, 31);
        final String c2 = this.c;
        int hashCode;
        if (c2 == null) {
            hashCode = 0;
        }
        else {
            hashCode = c2.hashCode();
        }
        return c + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("GqlStorefrontPriceInfo(__typename=");
        r.append(this.a);
        r.append(", price=");
        r.append(this.b);
        r.append(", googleExternalProductId=");
        return f0.n(r, this.c, ')');
    }
    
    public static final class a
    {
        public static k9 a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] d = k9.d;
            final String f = k.f(d[0]);
            e.c((Object)f);
            final int f2 = a81.e.f(k, d[1]);
            final ResponseField responseField = d[2];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            return new k9(f, f2, (String)k.d((ResponseField$d)responseField));
        }
    }
}
