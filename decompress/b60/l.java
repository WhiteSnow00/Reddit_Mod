// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import al0.f0;
import kotlin.collections.EmptyList;
import sg2.e;
import java.util.List;
import com.reddit.listing.common.ListingType;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;

public final class l
{
    public final long a;
    public final SortType b;
    public final SortTimeFrame c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final ListingType l;
    public final boolean m;
    public final String n;
    public List<j> o;
    public List<m> p;
    
    public l(final long a, final SortType b, final SortTimeFrame c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final String k, final ListingType l, final boolean m, final String n) {
        sg2.e.f((Object)d, "beforeId");
        sg2.e.f((Object)e, "afterId");
        sg2.e.f((Object)f, "adDistance");
        sg2.e.f((Object)g, "subredditName");
        sg2.e.f((Object)h, "multiredditPath");
        sg2.e.f((Object)i, "geoFilter");
        sg2.e.f((Object)j, "categoryId");
        sg2.e.f((Object)k, "topicSlug");
        sg2.e.f((Object)l, "listingType");
        sg2.e.f((Object)n, "flair");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        final EmptyList instance = EmptyList.INSTANCE;
        this.o = (List<j>)instance;
        this.p = (List<m>)instance;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        return this.a == l.a && this.b == l.b && this.c == l.c && sg2.e.a((Object)this.d, (Object)l.d) && sg2.e.a((Object)this.e, (Object)l.e) && sg2.e.a((Object)this.f, (Object)l.f) && sg2.e.a((Object)this.g, (Object)l.g) && sg2.e.a((Object)this.h, (Object)l.h) && sg2.e.a((Object)this.i, (Object)l.i) && sg2.e.a((Object)this.j, (Object)l.j) && sg2.e.a((Object)this.k, (Object)l.k) && this.l == l.l && this.m == l.m && sg2.e.a((Object)this.n, (Object)l.n);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = Long.hashCode(this.a);
        final SortType b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final SortTimeFrame c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        final int c2 = b.c(this.k, b.c(this.j, b.c(this.i, b.c(this.h, b.c(this.g, b.c(this.f, b.c(this.e, b.c(this.d, ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        final int hashCode4 = this.l.hashCode();
        int m;
        if ((m = (this.m ? 1 : 0)) != 0) {
            m = 1;
        }
        return this.n.hashCode() + ((hashCode4 + c2) * 31 + m) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ListingDataModel(id=");
        r.append(this.a);
        r.append(", sort=");
        r.append(this.b);
        r.append(", sortTimeFrame=");
        r.append(this.c);
        r.append(", beforeId=");
        r.append(this.d);
        r.append(", afterId=");
        r.append(this.e);
        r.append(", adDistance=");
        r.append(this.f);
        r.append(", subredditName=");
        r.append(this.g);
        r.append(", multiredditPath=");
        r.append(this.h);
        r.append(", geoFilter=");
        r.append(this.i);
        r.append(", categoryId=");
        r.append(this.j);
        r.append(", topicSlug=");
        r.append(this.k);
        r.append(", listingType=");
        r.append(this.l);
        r.append(", prune=");
        r.append(this.m);
        r.append(", flair=");
        return f0.n(r, this.n, ')');
    }
}
