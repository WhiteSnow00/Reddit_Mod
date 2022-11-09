// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import ah2.c;
import sf2.o;
import com.reddit.data.repository.t;
import ah2.f;
import nf2.n;
import zg2.r;
import nf2.c0;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import zg2.s;
import gc0.a;
import com.reddit.domain.model.ILink;
import com.reddit.domain.model.listing.Listing;
import tt.d;

public final class i implements d<Listing<? extends ILink>, o2<ILink>>
{
    public final a a;
    public final s<Listing<? extends ILink>, SortType, SortTimeFrame, String, String, c0<Boolean>> b;
    public final r<SortType, SortTimeFrame, String, String, n<Listing<ILink>>> c;
    
    public i(final a a, final s<? super Listing<? extends ILink>, ? super SortType, ? super SortTimeFrame, ? super String, ? super String, ? extends c0<Boolean>> b, final r<? super SortType, ? super SortTimeFrame, ? super String, ? super String, ? extends n<Listing<ILink>>> c) {
        f.f((Object)a, "crowdsourceTaggingQuestionsDataSource");
        this.a = a;
        this.b = (s<Listing<? extends ILink>, SortType, SortTimeFrame, String, String, c0<Boolean>>)b;
        this.c = (r<SortType, SortTimeFrame, String, String, n<Listing<ILink>>>)c;
    }
    
    public final c0 b(final Object o, final Object o2) {
        final o2 o3 = (o2)o;
        final Listing listing = (Listing)o2;
        f.f((Object)o3, "key");
        f.f((Object)listing, "links");
        final s<Listing<? extends ILink>, SortType, SortTimeFrame, String, String, c0<Boolean>> b = this.b;
        final SortType b2 = o3.b;
        final SortTimeFrame c = o3.c;
        final String d = o3.d;
        final String l = o3.l;
        f.c((Object)l);
        final c0 p2 = ((c0)b.invoke((Object)listing, (Object)b2, (Object)c, (Object)d, (Object)l)).p((o)new t(1, listing, this.a));
        f.e((Object)p2, "flatMap { result ->\n    \u2026le.just(result)\n    }\n  }");
        return p2;
    }
    
    public final n c(final Object o) {
        final o2 o2 = (o2)o;
        f.f((Object)o2, "key");
        final r<SortType, SortTimeFrame, String, String, n<Listing<ILink>>> c = this.c;
        final SortType b = o2.b;
        final SortTimeFrame c2 = o2.c;
        final String d = o2.d;
        final String l = o2.l;
        f.c((Object)l);
        return ah2.c.f((n)c.invoke((Object)b, (Object)c2, (Object)d, (Object)l), this.a);
    }
}
