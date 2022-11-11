// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;

public final class v
{
    public final String a;
    public final Boolean b;
    
    public v(final String a, final Boolean b) {
        e.f((Object)a, "parentExtraSubredditId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof v)) {
            return false;
        }
        final v v = (v)o;
        return e.a((Object)this.a, (Object)v.a) && e.a((Object)this.b, (Object)v.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Boolean b = this.b;
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
        final StringBuilder r = a.r("SubredditExtraDataModel(parentExtraSubredditId=");
        r.append(this.a);
        r.append(", isTitleSafe=");
        return android.support.v4.media.a.j(r, this.b, ')');
    }
}
