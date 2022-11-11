// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import nf2.n;
import nf2.c0;
import com.nytimes.android.external.store3.base.RecordState;
import ah2.f;
import c50.i0;
import tt.e;
import com.reddit.data.local.UserLinkKey;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.listing.Listing;
import tt.d;

public final class p2 implements d<Listing<? extends Link>, UserLinkKey>, e<UserLinkKey>
{
    public final i0 a;
    
    public p2(final i0 a) {
        f.f((Object)a, "local");
        this.a = a;
    }
    
    public final RecordState a(final Object o) {
        f.f((Object)o, "key");
        return RecordState.STALE;
    }
    
    public final c0 b(final Object o, final Object o2) {
        final UserLinkKey userLinkKey = (UserLinkKey)o;
        final Listing listing = (Listing)o2;
        f.f((Object)userLinkKey, "key");
        f.f((Object)listing, "links");
        return this.a.P(listing, userLinkKey.b, userLinkKey.d, userLinkKey.a, userLinkKey.c);
    }
    
    public final n c(final Object o) {
        final UserLinkKey userLinkKey = (UserLinkKey)o;
        f.f((Object)userLinkKey, "key");
        return this.a.y(userLinkKey.b, userLinkKey.d, userLinkKey.a, userLinkKey.c);
    }
}
