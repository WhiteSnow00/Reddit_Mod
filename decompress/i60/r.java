// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ag0.a;
import ah2.f;
import ak0.m;
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
        m.y(d, "name", e, "traceName", f, "service");
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
        return this.a == r.a && this.b == r.b && this.c == r.c && ah2.f.a((Object)this.d, (Object)r.d) && ah2.f.a((Object)this.e, (Object)r.e) && ah2.f.a((Object)this.f, (Object)r.f) && ah2.f.a((Object)this.g, (Object)r.g) && this.h == r.h && this.i == r.i && ah2.f.a((Object)this.j, (Object)r.j);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.f, ag0.a.f(this.e, ag0.a.f(this.d, b.c(this.c, b.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
        final Long g = this.g;
        int hashCode;
        if (g == null) {
            hashCode = 0;
        }
        else {
            hashCode = g.hashCode();
        }
        final int c = b.c(this.h, (f + hashCode) * 31, 31);
        int i;
        if ((i = (this.i ? 1 : 0)) != 0) {
            i = 1;
        }
        return this.j.hashCode() + (c + i) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SpanDataModel(id=");
        k.append(this.a);
        k.append(", startTime=");
        k.append(this.b);
        k.append(", endTime=");
        k.append(this.c);
        k.append(", name=");
        k.append(this.d);
        k.append(", traceName=");
        k.append(this.e);
        k.append(", service=");
        k.append(this.f);
        k.append(", parentId=");
        k.append(this.g);
        k.append(", traceId=");
        k.append(this.h);
        k.append(", dispatched=");
        k.append(this.i);
        k.append(", tags=");
        k.append(this.j);
        k.append(')');
        return k.toString();
    }
}
