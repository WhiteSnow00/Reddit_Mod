// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;
import java.util.List;

public final class y
{
    public final String a;
    public final List<String> b;
    
    public y(final String a, final List<String> b) {
        e.f((Object)a, "parentPinnedPostsSubredditId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final y y = (y)o;
        return e.a((Object)this.a, (Object)y.a) && e.a((Object)this.b, (Object)y.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditPinnedPostsDataModel(parentPinnedPostsSubredditId=");
        r.append(this.a);
        r.append(", pinnedPosts=");
        return d.o(r, (List)this.b, ')');
    }
}
