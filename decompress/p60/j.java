// 
// Decompiled by Procyon v0.6.0
// 

package p60;

import javax.inject.Inject;
import sg2.e;
import com.reddit.data.snoovatar.mapper.storefront.StorefrontListingGqlToDomainMapper;
import cw0.a;

public final class j implements d
{
    public final a a;
    public final StorefrontListingGqlToDomainMapper b;
    public final i c;
    
    @Inject
    public j(final i c, final StorefrontListingGqlToDomainMapper b, final a a) {
        e.f((Object)a, "redditLogger");
        e.f((Object)b, "listingMapper");
        e.f((Object)c, "artistMapper");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final a a() {
        return this.a;
    }
}
