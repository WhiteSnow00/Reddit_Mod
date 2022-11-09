// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ah2.f;

public final class t
{
    public String a;
    public long b;
    public final String c;
    
    public t(final long b, final String a, final String c) {
        f.f((Object)a, "subreddit");
        f.f((Object)c, "type");
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
        return f.a((Object)this.a, (Object)t.a) && this.b == t.b && f.a((Object)this.c, (Object)t.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + b.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("StreamSubredditStateModel(subreddit=");
        k.append(this.a);
        k.append(", timestamp=");
        k.append(this.b);
        k.append(", type=");
        return b.k(k, this.c, ')');
    }
}
