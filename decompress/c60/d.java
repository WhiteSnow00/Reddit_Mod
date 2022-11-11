// 
// Decompiled by Procyon v0.6.0
// 

package c60;

import sg2.e;
import b60.x;
import b60.p;

public final class d
{
    public final p a;
    public final x b;
    
    public d(final p a, final x b) {
        e.f((Object)a, "subreddit");
        this.a = a;
        this.b = b;
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
        return e.a((Object)this.a, (Object)d.a) && e.a((Object)this.b, (Object)d.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final x b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("RecentSubredditQueryModel(subreddit=");
        r.append(this.a);
        r.append(", mutations=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
