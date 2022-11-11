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

public final class m50
{
    public static final ResponseField[] d;
    public final String a;
    public final Object b;
    public final String c;
    
    static {
        d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.URL, "url", "url", (Map)null, false), ResponseField$b.i((Map)null, "mimeType", false, "mimeType") };
    }
    
    public m50(final String a, final Object b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m50)) {
            return false;
        }
        final m50 m50 = (m50)o;
        return e.a((Object)this.a, (Object)m50.a) && e.a(this.b, m50.b) && e.a((Object)this.c, (Object)m50.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + a81.e.g(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditMediaIcon(__typename=");
        r.append(this.a);
        r.append(", url=");
        r.append(this.b);
        r.append(", mimeType=");
        return f0.n(r, this.c, ')');
    }
    
    public static final class a
    {
        public static m50 a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] d = m50.d;
            final String f = k.f(d[0]);
            e.c((Object)f);
            final ResponseField responseField = d[1];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d2 = k.d((ResponseField$d)responseField);
            e.c(d2);
            final String f2 = k.f(d[2]);
            e.c((Object)f2);
            return new m50(f, d2, f2);
        }
    }
}
