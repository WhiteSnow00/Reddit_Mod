// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ah2.f;

public final class v
{
    public final String a;
    public final Boolean b;
    
    public v(final String a, final Boolean b) {
        f.f((Object)a, "parentExtraSubredditId");
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
        return f.a((Object)this.a, (Object)v.a) && f.a((Object)this.b, (Object)v.b);
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
        final StringBuilder k = a.k("SubredditExtraDataModel(parentExtraSubredditId=");
        k.append(this.a);
        k.append(", isTitleSafe=");
        return d.m(k, this.b, ')');
    }
}
