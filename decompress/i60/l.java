// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ag0.a;
import kotlin.collections.EmptyList;
import ah2.f;
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
        ah2.f.f((Object)d, "beforeId");
        ah2.f.f((Object)e, "afterId");
        ah2.f.f((Object)f, "adDistance");
        ah2.f.f((Object)g, "subredditName");
        ah2.f.f((Object)h, "multiredditPath");
        ah2.f.f((Object)i, "geoFilter");
        ah2.f.f((Object)j, "categoryId");
        ah2.f.f((Object)k, "topicSlug");
        ah2.f.f((Object)l, "listingType");
        ah2.f.f((Object)n, "flair");
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
        return this.a == l.a && this.b == l.b && this.c == l.c && ah2.f.a((Object)this.d, (Object)l.d) && ah2.f.a((Object)this.e, (Object)l.e) && ah2.f.a((Object)this.f, (Object)l.f) && ah2.f.a((Object)this.g, (Object)l.g) && ah2.f.a((Object)this.h, (Object)l.h) && ah2.f.a((Object)this.i, (Object)l.i) && ah2.f.a((Object)this.j, (Object)l.j) && ah2.f.a((Object)this.k, (Object)l.k) && this.l == l.l && this.m == l.m && ah2.f.a((Object)this.n, (Object)l.n);
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
        final int f = ag0.a.f(this.k, ag0.a.f(this.j, ag0.a.f(this.i, ag0.a.f(this.h, ag0.a.f(this.g, ag0.a.f(this.f, ag0.a.f(this.e, ag0.a.f(this.d, ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        final int hashCode4 = this.l.hashCode();
        int m;
        if ((m = (this.m ? 1 : 0)) != 0) {
            m = 1;
        }
        return this.n.hashCode() + ((hashCode4 + f) * 31 + m) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ListingDataModel(id=");
        k.append(this.a);
        k.append(", sort=");
        k.append(this.b);
        k.append(", sortTimeFrame=");
        k.append(this.c);
        k.append(", beforeId=");
        k.append(this.d);
        k.append(", afterId=");
        k.append(this.e);
        k.append(", adDistance=");
        k.append(this.f);
        k.append(", subredditName=");
        k.append(this.g);
        k.append(", multiredditPath=");
        k.append(this.h);
        k.append(", geoFilter=");
        k.append(this.i);
        k.append(", categoryId=");
        k.append(this.j);
        k.append(", topicSlug=");
        k.append(this.k);
        k.append(", listingType=");
        k.append(this.l);
        k.append(", prune=");
        k.append(this.m);
        k.append(", flair=");
        return b.k(k, this.n, ')');
    }
}
