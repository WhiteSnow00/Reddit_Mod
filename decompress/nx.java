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

public final class nx
{
    public static final ResponseField[] h;
    public final String a;
    public final String b;
    public final String c;
    public final Object d;
    public final String e;
    public final String f;
    public final boolean g;
    
    static {
        h = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.ID, "subredditId", "subredditId", (Map)null, false), ResponseField$b.i((Map)null, "subredditName", false, "subredditName"), (ResponseField)ResponseField$b.b((o)CustomType.URL, "deeplink", "deeplink", (Map)null, false), ResponseField$b.i((Map)null, "totalTimeOnSubreddit", true, "totalTimeOnSubreddit"), ResponseField$b.i((Map)null, "timeUnit", true, "timeUnit"), ResponseField$b.a((Map)null, "isSubscribed", false, "isSubscribed") };
    }
    
    public nx(final String a, final String b, final String c, final Object d, final String e, final String f, final boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nx)) {
            return false;
        }
        final nx nx = (nx)o;
        return sg2.e.a((Object)this.a, (Object)nx.a) && sg2.e.a((Object)this.b, (Object)nx.b) && sg2.e.a((Object)this.c, (Object)nx.c) && sg2.e.a(this.d, nx.d) && sg2.e.a((Object)this.e, (Object)nx.e) && sg2.e.a((Object)this.f, (Object)nx.f) && this.g == nx.g;
    }
    
    @Override
    public final int hashCode() {
        final int g = a81.e.g(this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final String e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final String f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        int g2;
        if ((g2 = (this.g ? 1 : 0)) != 0) {
            g2 = 1;
        }
        return ((g + hashCode2) * 31 + hashCode) * 31 + g2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("RecapSubreddit(__typename=");
        r.append(this.a);
        r.append(", subredditId=");
        r.append(this.b);
        r.append(", subredditName=");
        r.append(this.c);
        r.append(", deeplink=");
        r.append(this.d);
        r.append(", totalTimeOnSubreddit=");
        r.append(this.e);
        r.append(", timeUnit=");
        r.append(this.f);
        r.append(", isSubscribed=");
        return g7.m(r, this.g, ')');
    }
    
    public static final class a
    {
        public static nx a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] h = nx.h;
            final String f = k.f(h[0]);
            e.c((Object)f);
            final ResponseField responseField = h[1];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d = k.d((ResponseField$d)responseField);
            e.c(d);
            final String s = (String)d;
            final String f2 = k.f(h[2]);
            e.c((Object)f2);
            final ResponseField responseField2 = h[3];
            e.d((Object)responseField2, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d2 = k.d((ResponseField$d)responseField2);
            e.c(d2);
            return new nx(f, s, f2, d2, k.f(h[4]), k.f(h[5]), f0.x(k, h[6]));
        }
    }
}
