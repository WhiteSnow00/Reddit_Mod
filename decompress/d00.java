// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import aw.b;
import sg2.e;
import com.apollographql.apollo.api.ResponseField$d;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class d00
{
    public static final ResponseField[] m;
    public final String a;
    public final Object b;
    public final Integer c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Integer l;
    
    static {
        final ResponseField i = ResponseField$b.i((Map)null, "__typename", false, "__typename");
        final CustomType datetime = CustomType.DATETIME;
        final ResponseField$d b = ResponseField$b.b((o)datetime, "endedAt", "endedAt", (Map)null, true);
        final ResponseField f = ResponseField$b.f((Map)null, "height", true, "height");
        final ResponseField$d b2 = ResponseField$b.b((o)datetime, "hlsExistsAt", "hlsExistsAt", (Map)null, true);
        final CustomType url = CustomType.URL;
        m = new ResponseField[] { i, (ResponseField)b, f, (ResponseField)b2, (ResponseField)ResponseField$b.b((o)url, "hlsUrl", "hlsUrl", (Map)null, false), (ResponseField)ResponseField$b.b((o)datetime, "killedAt", "killedAt", (Map)null, true), (ResponseField)ResponseField$b.b((o)datetime, "publishAt", "publishAt", (Map)null, true), (ResponseField)ResponseField$b.b((o)datetime, "publishDoneAt", "publishDoneAt", (Map)null, true), (ResponseField)ResponseField$b.b((o)datetime, "purgedAt", "purgedAt", (Map)null, true), (ResponseField)ResponseField$b.b((o)url, "scrubberMediaUrl", "scrubberMediaUrl", (Map)null, false), (ResponseField)ResponseField$b.b((o)datetime, "updatedAt", "updatedAt", (Map)null, true), ResponseField$b.f((Map)null, "width", true, "width") };
    }
    
    public d00(final String a, final Object b, final Integer c, final Object d, final Object e, final Object f, final Object g, final Object h, final Object i, final Object j, final Object k, final Integer l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d00)) {
            return false;
        }
        final d00 d00 = (d00)o;
        return sg2.e.a((Object)this.a, (Object)d00.a) && sg2.e.a(this.b, d00.b) && sg2.e.a((Object)this.c, (Object)d00.c) && sg2.e.a(this.d, d00.d) && sg2.e.a(this.e, d00.e) && sg2.e.a(this.f, d00.f) && sg2.e.a(this.g, d00.g) && sg2.e.a(this.h, d00.h) && sg2.e.a(this.i, d00.i) && sg2.e.a(this.j, d00.j) && sg2.e.a(this.k, d00.k) && sg2.e.a((Object)this.l, (Object)d00.l);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Object b = this.b;
        final int n = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final Object d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final int g = a81.e.g(this.e, (((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31, 31);
        final Object f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final Object g2 = this.g;
        int hashCode6;
        if (g2 == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g2.hashCode();
        }
        final Object h = this.h;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final Object i = this.i;
        int hashCode8;
        if (i == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = i.hashCode();
        }
        final int g3 = a81.e.g(this.j, ((((g + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31, 31);
        final Object k = this.k;
        int hashCode9;
        if (k == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = k.hashCode();
        }
        final Integer l = this.l;
        int hashCode10;
        if (l == null) {
            hashCode10 = n;
        }
        else {
            hashCode10 = l.hashCode();
        }
        return (g3 + hashCode9) * 31 + hashCode10;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("RpanMediaFragment(__typename=");
        r.append(this.a);
        r.append(", endedAt=");
        r.append(this.b);
        r.append(", height=");
        r.append(this.c);
        r.append(", hlsExistsAt=");
        r.append(this.d);
        r.append(", hlsUrl=");
        r.append(this.e);
        r.append(", killedAt=");
        r.append(this.f);
        r.append(", publishAt=");
        r.append(this.g);
        r.append(", publishDoneAt=");
        r.append(this.h);
        r.append(", purgedAt=");
        r.append(this.i);
        r.append(", scrubberMediaUrl=");
        r.append(this.j);
        r.append(", updatedAt=");
        r.append(this.k);
        r.append(", width=");
        return aw.b.i(r, this.l, ')');
    }
}
