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

public final class vh
{
    public static final ResponseField[] f;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    
    static {
        f = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.ID, "id", "id", (Map)null, false), ResponseField$b.i((Map)null, "description", false, "description"), ResponseField$b.i((Map)null, "buttonCtaText", false, "buttonCtaText"), ResponseField$b.i((Map)null, "nftTitle", false, "title") };
    }
    
    public vh(final String a, final String b, final String c, final String d, final String e) {
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
        if (!(o instanceof vh)) {
            return false;
        }
        final vh vh = (vh)o;
        return sg2.e.a((Object)this.a, (Object)vh.a) && sg2.e.a((Object)this.b, (Object)vh.b) && sg2.e.a((Object)this.c, (Object)vh.c) && sg2.e.a((Object)this.d, (Object)vh.d) && sg2.e.a((Object)this.e, (Object)vh.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + b.c(this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("NftBannerFeedFragment(__typename=");
        r.append(this.a);
        r.append(", id=");
        r.append(this.b);
        r.append(", description=");
        r.append(this.c);
        r.append(", buttonCtaText=");
        r.append(this.d);
        r.append(", nftTitle=");
        return f0.n(r, this.e, ')');
    }
    
    public static final class a
    {
        public static vh a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] f = vh.f;
            final String f2 = k.f(f[0]);
            e.c((Object)f2);
            final ResponseField responseField = f[1];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d = k.d((ResponseField$d)responseField);
            e.c(d);
            final String s = (String)d;
            final String f3 = k.f(f[2]);
            e.c((Object)f3);
            final String f4 = k.f(f[3]);
            e.c((Object)f4);
            final String f5 = k.f(f[4]);
            e.c((Object)f5);
            return new vh(f2, s, f3, f4, f5);
        }
    }
}
