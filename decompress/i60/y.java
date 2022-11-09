// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ak0.m;
import ah2.f;
import java.util.List;

public final class y
{
    public final String a;
    public final List<String> b;
    
    public y(final String a, final List<String> b) {
        f.f((Object)a, "parentPinnedPostsSubredditId");
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
        return f.a((Object)this.a, (Object)y.a) && f.a((Object)this.b, (Object)y.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SubredditPinnedPostsDataModel(parentPinnedPostsSubredditId=");
        k.append(this.a);
        k.append(", pinnedPosts=");
        return m.n(k, (List)this.b, ')');
    }
}
