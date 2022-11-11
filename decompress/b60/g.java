// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import al0.f0;
import sg2.e;
import al0.b;

public final class g
{
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    
    public g(final String a, final String b, final int c, final String d) {
        al0.b.q(a, "id", b, "subredditName", d, "questionJson");
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
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return e.a((Object)this.a, (Object)g.a) && e.a((Object)this.b, (Object)g.b) && this.c == g.c && e.a((Object)this.d, (Object)g.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + a.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CrowdsourceTaggingQuestionDataModel(id=");
        r.append(this.a);
        r.append(", subredditName=");
        r.append(this.b);
        r.append(", ordinal=");
        r.append(this.c);
        r.append(", questionJson=");
        return f0.n(r, this.d, ')');
    }
}
