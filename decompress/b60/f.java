// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import p1.h;
import ng2.e;
import com.reddit.listing.model.sort.HistorySortType;

public final class f
{
    public final String a;
    public final HistorySortType b;
    public final String c;
    
    public f(final String a, final HistorySortType b, final String c) {
        e.f((Object)a, "username");
        e.f((Object)b, "sort");
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
        return e.a((Object)this.a, (Object)f.a) && this.b == f.b && e.a((Object)this.c, (Object)f.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("HistoryKey(username=");
        t.append(this.a);
        t.append(", sort=");
        t.append(this.b);
        t.append(", after=");
        return h.c(t, this.c, ')');
    }
}
