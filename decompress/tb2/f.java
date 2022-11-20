// 
// Decompiled by Procyon v0.6.0
// 

package tb2;

import ng2.e;
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
        final StringBuilder t = a.t("WikiScreenDependencies(view=");
        t.append(this.a);
        t.append(", params=");
        t.append(this.b);
        t.append(')');
        return t.toString();
    }
}
