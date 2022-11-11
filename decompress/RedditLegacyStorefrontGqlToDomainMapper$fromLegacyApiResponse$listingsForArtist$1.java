// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper.storefront;

import java.util.Iterator;
import java.util.ArrayList;
import kotlin.Metadata;
import com.reddit.domain.snoovatar.model.storefront.StorefrontListing;
import java.util.List;
import ue0.f;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Lue0/f;", "artist", "", "Lcom/reddit/domain/snoovatar/model/storefront/StorefrontListing;", "invoke", "(Lue0/f;)Ljava/util/List;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class RedditLegacyStorefrontGqlToDomainMapper$fromLegacyApiResponse$listingsForArtist$1 extends Lambda implements l<f, List<? extends StorefrontListing>>
{
    public final /* synthetic */ List<StorefrontListing> $listings;
    
    public RedditLegacyStorefrontGqlToDomainMapper$fromLegacyApiResponse$listingsForArtist$1(final List<StorefrontListing> $listings) {
        this.$listings = $listings;
        super(1);
    }
    
    public final List<StorefrontListing> invoke(final f f) {
        ah2.f.f((Object)f, "artist");
        final List<StorefrontListing> $listings = this.$listings;
        final ArrayList list = new ArrayList();
        for (final StorefrontListing next : $listings) {
            if (ah2.f.a((Object)next.c, (Object)f.a)) {
                list.add(next);
            }
        }
        return list;
    }
}
