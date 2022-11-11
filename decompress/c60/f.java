// 
// Decompiled by Procyon v0.6.0
// 

package c60;

import sg2.e;
import b60.v;
import b60.x;
import b60.u;

public final class f
{
    public final u a;
    public final x b;
    public final v c;
    
    public f(final u a, final x b, final v c) {
        e.f((Object)a, "subreddit");
        this.a = a;
        this.b = b;
        this.c = c;
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
        return e.a((Object)this.a, (Object)f.a) && e.a((Object)this.b, (Object)f.b) && e.a((Object)this.c, (Object)f.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final x b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final v c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditQueryModel(subreddit=");
        r.append(this.a);
        r.append(", mutations=");
        r.append(this.b);
        r.append(", extras=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
}
