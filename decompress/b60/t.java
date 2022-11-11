// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import al0.f0;
import sg2.e;

public final class t
{
    public String a;
    public long b;
    public final String c;
    
    public t(final long b, final String a, final String c) {
        e.f((Object)a, "subreddit");
        e.f((Object)c, "type");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t)) {
            return false;
        }
        final t t = (t)o;
        return e.a((Object)this.a, (Object)t.a) && this.b == t.b && e.a((Object)this.c, (Object)t.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + b.b(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("StreamSubredditStateModel(subreddit=");
        r.append(this.a);
        r.append(", timestamp=");
        r.append(this.b);
        r.append(", type=");
        return f0.n(r, this.c, ')');
    }
}
