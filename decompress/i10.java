// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import com.reddit.type.SocialLinkType$a;
import com.apollographql.apollo.api.ResponseField$d;
import j7.k;
import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.reddit.type.SocialLinkType;
import com.apollographql.apollo.api.ResponseField;

public final class i10
{
    public static final ResponseField[] g;
    public final String a;
    public final String b;
    public final SocialLinkType c;
    public final String d;
    public final String e;
    public final Object f;
    
    static {
        g = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.ID, "id", "id", (Map)null, false), ResponseField$b.d("type", false, "type"), ResponseField$b.i((Map)null, "title", false, "title"), ResponseField$b.i((Map)null, "handle", true, "handle"), (ResponseField)ResponseField$b.b((o)CustomType.URL, "outboundUrl", "outboundUrl", (Map)null, false) };
    }
    
    public i10(final String a, final String b, final SocialLinkType c, final String d, final String e, final Object f) {
        sg2.e.f((Object)c, "type");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i10)) {
            return false;
        }
        final i10 i10 = (i10)o;
        return sg2.e.a((Object)this.a, (Object)i10.a) && sg2.e.a((Object)this.b, (Object)i10.b) && this.c == i10.c && sg2.e.a((Object)this.d, (Object)i10.d) && sg2.e.a((Object)this.e, (Object)i10.e) && sg2.e.a(this.f, i10.f);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.d, (this.c.hashCode() + b.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31);
        final String e = this.e;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        return this.f.hashCode() + (c + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SocialLinkFragment(__typename=");
        r.append(this.a);
        r.append(", id=");
        r.append(this.b);
        r.append(", type=");
        r.append(this.c);
        r.append(", title=");
        r.append(this.d);
        r.append(", handle=");
        r.append(this.e);
        r.append(", outboundUrl=");
        return wu.a.b(r, this.f, ')');
    }
    
    public static final class a
    {
        public static i10 a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] g = i10.g;
            int i = 0;
            final String f = k.f(g[0]);
            e.c((Object)f);
            final ResponseField responseField = g[1];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d = k.d((ResponseField$d)responseField);
            e.c(d);
            final String s = (String)d;
            final SocialLinkType$a companion = SocialLinkType.Companion;
            final String f2 = k.f(g[2]);
            e.c((Object)f2);
            companion.getClass();
            while (true) {
                for (SocialLinkType[] values = SocialLinkType.values(); i < values.length; ++i) {
                    SocialLinkType unknown__ = values[i];
                    if (e.a((Object)unknown__.getRawValue(), (Object)f2)) {
                        if (unknown__ == null) {
                            unknown__ = SocialLinkType.UNKNOWN__;
                        }
                        final ResponseField[] g2 = i10.g;
                        final String f3 = k.f(g2[3]);
                        e.c((Object)f3);
                        final String f4 = k.f(g2[4]);
                        final ResponseField responseField2 = g2[5];
                        e.d((Object)responseField2, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                        final Object d2 = k.d((ResponseField$d)responseField2);
                        e.c(d2);
                        return new i10(f, s, unknown__, f3, f4, d2);
                    }
                }
                SocialLinkType unknown__ = null;
                continue;
            }
        }
    }
}
