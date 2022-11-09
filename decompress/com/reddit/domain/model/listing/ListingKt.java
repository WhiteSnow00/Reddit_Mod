// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import java.util.Iterator;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import ah2.f;
import com.reddit.domain.model.ILink;
import com.reddit.domain.model.Link;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0005" }, d2 = { "toILinkListing", "Lcom/reddit/domain/model/listing/Listing;", "Lcom/reddit/domain/model/ILink;", "Lcom/reddit/domain/model/Link;", "toLinkListing", "model_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class ListingKt
{
    public static final Listing<ILink> toILinkListing(final Listing<Link> listing) {
        f.f((Object)listing, "<this>");
        return new Listing<ILink>(listing.getChildren(), listing.getAfter(), listing.getBefore(), listing.getAdDistance(), listing.getGeoFilter(), listing.getHasRecommendations(), null, 64, null);
    }
    
    public static final Listing<Link> toLinkListing(final Listing<? extends ILink> listing) {
        f.f((Object)listing, "<this>");
        final List<? extends ILink> children = listing.getChildren();
        final ArrayList list = new ArrayList();
        for (final Object next : children) {
            if (next instanceof Link) {
                list.add(next);
            }
        }
        return new Listing<Link>(list, listing.getAfter(), listing.getBefore(), listing.getAdDistance(), listing.getGeoFilter(), listing.getHasRecommendations(), null, 64, null);
    }
}
