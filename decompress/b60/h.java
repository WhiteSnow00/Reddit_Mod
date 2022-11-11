// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import al0.f0;
import sg2.e;
import com.reddit.data.room.model.ItemType;

public final class h
{
    public final String a;
    public final ItemType b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    
    public h(final String a, final ItemType b, final int c, final String d, final String e, final String f) {
        sg2.e.f((Object)a, "id");
        sg2.e.f((Object)b, "type");
        sg2.e.f((Object)d, "topicSlug");
        sg2.e.f((Object)f, "after");
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
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return sg2.e.a((Object)this.a, (Object)h.a) && this.b == h.b && this.c == h.c && sg2.e.a((Object)this.d, (Object)h.d) && sg2.e.a((Object)this.e, (Object)h.e) && sg2.e.a((Object)this.f, (Object)h.f);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.d, a.c(this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31), 31);
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
        final StringBuilder r = a.r("DiscoverFeedItemDataModel(id=");
        r.append(this.a);
        r.append(", type=");
        r.append(this.b);
        r.append(", ordinal=");
        r.append(this.c);
        r.append(", topicSlug=");
        r.append(this.d);
        r.append(", json=");
        r.append(this.e);
        r.append(", after=");
        return f0.n(r, this.f, ')');
    }
}
