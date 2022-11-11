// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import j7.k;
import sg2.e;
import com.apollographql.apollo.api.ResponseField$d;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class r6
{
    public static final ResponseField[] i;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Object e;
    public final Object f;
    public final int g;
    public final String h;
    
    static {
        final ResponseField j = ResponseField$b.i((Map)null, "__typename", false, "__typename");
        final ResponseField$d b = ResponseField$b.b((o)CustomType.ID, "id", "id", (Map)null, false);
        final ResponseField k = ResponseField$b.i((Map)null, "title", false, "title");
        final ResponseField l = ResponseField$b.i((Map)null, "description", true, "description");
        final CustomType url = CustomType.URL;
        i = new ResponseField[] { j, (ResponseField)b, k, l, (ResponseField)ResponseField$b.b((o)url, "url", "url", (Map)null, false), (ResponseField)ResponseField$b.b((o)url, "iconUrl", "iconUrl", (Map)null, true), ResponseField$b.f((Map)null, "maxImpressionsCount", false, "maxImpressionsCount"), ResponseField$b.i((Map)null, "experimentName", true, "experimentName") };
    }
    
    public r6(final String a, final String b, final String c, final String d, final Object e, final Object f, final int g, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r6)) {
            return false;
        }
        final r6 r6 = (r6)o;
        return sg2.e.a((Object)this.a, (Object)r6.a) && sg2.e.a((Object)this.b, (Object)r6.b) && sg2.e.a((Object)this.c, (Object)r6.c) && sg2.e.a((Object)this.d, (Object)r6.d) && sg2.e.a(this.e, r6.e) && sg2.e.a(this.f, r6.f) && this.g == r6.g && sg2.e.a((Object)this.h, (Object)r6.h);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31);
        final String d = this.d;
        final int n = 0;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        final int g = a81.e.g(this.e, (c + hashCode) * 31, 31);
        final Object f = this.f;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final int c2 = a.c(this.g, (g + hashCode2) * 31, 31);
        final String h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = h.hashCode();
        }
        return c2 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("FeaturedAnnouncementFragment(__typename=");
        r.append(this.a);
        r.append(", id=");
        r.append(this.b);
        r.append(", title=");
        r.append(this.c);
        r.append(", description=");
        r.append(this.d);
        r.append(", url=");
        r.append(this.e);
        r.append(", iconUrl=");
        r.append(this.f);
        r.append(", maxImpressionsCount=");
        r.append(this.g);
        r.append(", experimentName=");
        return f0.n(r, this.h, ')');
    }
    
    public static final class a
    {
        public static r6 a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] i = r6.i;
            final String f = k.f(i[0]);
            e.c((Object)f);
            final ResponseField responseField = i[1];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d = k.d((ResponseField$d)responseField);
            e.c(d);
            final String s = (String)d;
            final String f2 = k.f(i[2]);
            e.c((Object)f2);
            final String f3 = k.f(i[3]);
            final ResponseField responseField2 = i[4];
            e.d((Object)responseField2, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d2 = k.d((ResponseField$d)responseField2);
            e.c(d2);
            final ResponseField responseField3 = i[5];
            e.d((Object)responseField3, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            return new r6(f, s, f2, f3, d2, k.d((ResponseField$d)responseField3), a81.e.f(k, i[6]), k.f(i[7]));
        }
    }
}
