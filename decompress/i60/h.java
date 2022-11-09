// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ag0.a;
import androidx.appcompat.widget.s0;
import ah2.f;
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
        ah2.f.f((Object)a, "id");
        ah2.f.f((Object)b, "type");
        ah2.f.f((Object)d, "topicSlug");
        ah2.f.f((Object)f, "after");
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
        return ah2.f.a((Object)this.a, (Object)h.a) && this.b == h.b && this.c == h.c && ah2.f.a((Object)this.d, (Object)h.d) && ah2.f.a((Object)this.e, (Object)h.e) && ah2.f.a((Object)this.f, (Object)h.f);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.d, s0.e(this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31), 31);
        final String e = this.e;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        return this.f.hashCode() + (f + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("DiscoverFeedItemDataModel(id=");
        k.append(this.a);
        k.append(", type=");
        k.append(this.b);
        k.append(", ordinal=");
        k.append(this.c);
        k.append(", topicSlug=");
        k.append(this.d);
        k.append(", json=");
        k.append(this.e);
        k.append(", after=");
        return b.k(k, this.f, ')');
    }
}
