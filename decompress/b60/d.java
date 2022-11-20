// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import p1.h;
import aq2.a;
import ng2.e;
import com.reddit.domain.model.Link;

public final class d
{
    public final String a;
    public final String b;
    public final Link c;
    public final String d;
    public final String e;
    
    public d(final String a, final String b, final Link c, final String d, final String e) {
        ng2.e.f((Object)a, "topicSlug");
        ng2.e.f((Object)d, "subredditId");
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
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return ng2.e.a((Object)this.a, (Object)d.a) && ng2.e.a((Object)this.b, (Object)d.b) && ng2.e.a((Object)this.c, (Object)d.c) && ng2.e.a((Object)this.d, (Object)d.d) && ng2.e.a((Object)this.e, (Object)d.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Link c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return this.e.hashCode() + aq2.a.e(this.d, ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("DiscoverTopicLinksKey(topicSlug=");
        t.append(this.a);
        t.append(", after=");
        t.append(this.b);
        t.append(", firstLink=");
        t.append(this.c);
        t.append(", subredditId=");
        t.append(this.d);
        t.append(", navSessionId=");
        return h.c(t, this.e, ')');
    }
}
