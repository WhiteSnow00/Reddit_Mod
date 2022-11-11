// 
// Decompiled by Procyon v0.6.0
// 

package ao0;

import sg2.e;
import com.reddit.domain.meta.model.MetaCorrelation;

public final class a
{
    public final jl0.a a;
    public final String b;
    public String c;
    public final MetaCorrelation d;
    
    public a(final jl0.a a, final String b, final String c, final MetaCorrelation d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b) && e.a((Object)this.c, (Object)a.c) && e.a((Object)this.d, (Object)a.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return this.d.hashCode() + ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Parameters(subreddit=");
        r.append(this.a);
        r.append(", userId=");
        r.append(this.b);
        r.append(", username=");
        r.append(this.c);
        r.append(", correlation=");
        r.append(this.d);
        r.append(')');
        return r.toString();
    }
}
