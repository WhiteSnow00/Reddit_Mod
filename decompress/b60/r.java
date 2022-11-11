// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;
import al0.b;
import com.reddit.data.room.model.SpanTags;

public final class r
{
    public long a;
    public long b;
    public long c;
    public String d;
    public String e;
    public String f;
    public Long g;
    public long h;
    public boolean i;
    public SpanTags j;
    
    public r(final long a, final long b, final long c, final String d, final String e, final String f, final Long g, final long h, final SpanTags j) {
        al0.b.q(d, "name", e, "traceName", f, "service");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = false;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r)) {
            return false;
        }
        final r r = (r)o;
        return this.a == r.a && this.b == r.b && this.c == r.c && sg2.e.a((Object)this.d, (Object)r.d) && sg2.e.a((Object)this.e, (Object)r.e) && sg2.e.a((Object)this.f, (Object)r.f) && sg2.e.a((Object)this.g, (Object)r.g) && this.h == r.h && this.i == r.i && sg2.e.a((Object)this.j, (Object)r.j);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.f, b.c(this.e, b.c(this.d, b.b(this.c, b.b(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
        final Long g = this.g;
        int hashCode;
        if (g == null) {
            hashCode = 0;
        }
        else {
            hashCode = g.hashCode();
        }
        final int b = b.b(this.h, (c + hashCode) * 31, 31);
        int i;
        if ((i = (this.i ? 1 : 0)) != 0) {
            i = 1;
        }
        return this.j.hashCode() + (b + i) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SpanDataModel(id=");
        r.append(this.a);
        r.append(", startTime=");
        r.append(this.b);
        r.append(", endTime=");
        r.append(this.c);
        r.append(", name=");
        r.append(this.d);
        r.append(", traceName=");
        r.append(this.e);
        r.append(", service=");
        r.append(this.f);
        r.append(", parentId=");
        r.append(this.g);
        r.append(", traceId=");
        r.append(this.h);
        r.append(", dispatched=");
        r.append(this.i);
        r.append(", tags=");
        r.append(this.j);
        r.append(')');
        return r.toString();
    }
}
