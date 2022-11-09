// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import ah2.f;
import nf2.n;
import zg2.r;
import nf2.c0;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import zg2.s;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.listing.Listing;
import tt.d;

public final class g implements d<Listing<? extends Link>, o2<Link>>
{
    public final s<Listing<Link>, SortType, SortTimeFrame, String, String, c0<Boolean>> a;
    public final r<SortType, SortTimeFrame, String, String, n<Listing<Link>>> b;
    
    public g(final s<? super Listing<Link>, ? super SortType, ? super SortTimeFrame, ? super String, ? super String, ? extends c0<Boolean>> a, final r<? super SortType, ? super SortTimeFrame, ? super String, ? super String, ? extends n<Listing<Link>>> b) {
        this.a = (s<Listing<Link>, SortType, SortTimeFrame, String, String, c0<Boolean>>)a;
        this.b = (r<SortType, SortTimeFrame, String, String, n<Listing<Link>>>)b;
    }
    
    public final c0 b(final Object o, final Object o2) {
        final o2 o3 = (o2)o;
        final Listing listing = (Listing)o2;
        f.f((Object)o3, "key");
        f.f((Object)listing, "links");
        final s<Listing<Link>, SortType, SortTimeFrame, String, String, c0<Boolean>> a = this.a;
        final SortType b = o3.b;
        final SortTimeFrame c = o3.c;
        final String d = o3.d;
        final String j = o3.j;
        f.c((Object)j);
        return (c0)a.invoke((Object)listing, (Object)b, (Object)c, (Object)d, (Object)j);
    }
    
    public final n c(final Object o) {
        final o2 o2 = (o2)o;
        f.f((Object)o2, "key");
        final r<SortType, SortTimeFrame, String, String, n<Listing<Link>>> b = this.b;
        final SortType b2 = o2.b;
        final SortTimeFrame c = o2.c;
        final String d = o2.d;
        final String j = o2.j;
        f.c((Object)j);
        return (n)b.invoke((Object)b2, (Object)c, (Object)d, (Object)j);
    }
}
