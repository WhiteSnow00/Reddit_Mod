// 
// Decompiled by Procyon v0.6.0
// 

package xc0;

import p1.h;
import ng2.e;
import java.util.List;

public final class b
{
    public final String a;
    public final String b;
    public final String c;
    public final List<a> d;
    
    public b(final String a, final String b, final String c, final List<a> d) {
        e.f((Object)a, "id");
        e.f((Object)b, "title");
        e.f((Object)c, "name");
        e.f((Object)d, "subreddits");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static b a(final b b, final List list) {
        final String a = b.a;
        final String b2 = b.b;
        final String c = b.c;
        e.f((Object)a, "id");
        e.f((Object)b2, "title");
        e.f((Object)c, "name");
        e.f((Object)list, "subreddits");
        return new b(a, b2, c, list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return e.a((Object)this.a, (Object)b.a) && e.a((Object)this.b, (Object)b.b) && e.a((Object)this.c, (Object)b.c) && e.a((Object)this.d, (Object)b.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + aq2.a.e(this.c, aq2.a.e(this.b, this.a.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("InterestTopicWithSubreddits(id=");
        t.append(this.a);
        t.append(", title=");
        t.append(this.b);
        t.append(", name=");
        t.append(this.c);
        t.append(", subreddits=");
        return h.d(t, (List)this.d, ')');
    }
}
