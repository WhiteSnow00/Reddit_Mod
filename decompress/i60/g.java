// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import ak0.m;

public final class g
{
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    
    public g(final String a, final String b, final int c, final String d) {
        m.y(a, "id", b, "subredditName", d, "questionJson");
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
        return f.a((Object)this.a, (Object)g.a) && f.a((Object)this.b, (Object)g.b) && this.c == g.c && f.a((Object)this.d, (Object)g.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + s0.e(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CrowdsourceTaggingQuestionDataModel(id=");
        k.append(this.a);
        k.append(", subredditName=");
        k.append(this.b);
        k.append(", ordinal=");
        k.append(this.c);
        k.append(", questionJson=");
        return b.k(k, this.d, ')');
    }
}
