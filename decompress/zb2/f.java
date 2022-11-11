// 
// Decompiled by Procyon v0.6.0
// 

package zb2;

import sg2.e;
import com.reddit.wiki.wiki.WikiScreen;

public final class f
{
    public final c a;
    public final a b;
    
    public f(final WikiScreen a, final a b) {
        e.f((Object)a, "view");
        this.a = (c)a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return e.a((Object)this.a, (Object)f.a) && e.a((Object)this.b, (Object)f.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("WikiScreenDependencies(view=");
        r.append(this.a);
        r.append(", params=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
