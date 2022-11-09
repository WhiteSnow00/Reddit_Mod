// 
// Decompiled by Procyon v0.6.0
// 

package w60;

import javax.inject.Inject;
import ah2.f;
import com.reddit.data.snoovatar.mapper.storefront.StorefrontListingGqlToDomainMapper;
import jw0.a;

public final class j implements d
{
    public final a a;
    public final StorefrontListingGqlToDomainMapper b;
    public final i c;
    
    @Inject
    public j(final i c, final StorefrontListingGqlToDomainMapper b, final a a) {
        f.f((Object)a, "redditLogger");
        f.f((Object)b, "listingMapper");
        f.f((Object)c, "artistMapper");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final a a() {
        return this.a;
    }
}
