// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import com.reddit.listing.common.ListingType;
import kotlin.Metadata;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.listing.Listing;
import nf2.n;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "", "afterLocal", "Lnf2/n;", "Lcom/reddit/domain/model/listing/Listing;", "Lcom/reddit/domain/model/Link;", "invoke", "(Ljava/lang/String;)Lnf2/n;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class DatabaseLinkDataSource$getAllLinks$fetch$1 extends Lambda implements l<String, n<Listing<? extends Link>>>
{
    public final /* synthetic */ String $categoryId;
    public final /* synthetic */ String $flair;
    public final /* synthetic */ String $geoFilter;
    public final /* synthetic */ ListingType $listingType;
    public final /* synthetic */ String $multiredditPath;
    public final /* synthetic */ SortType $sort;
    public final /* synthetic */ SortTimeFrame $sortTimeFrame;
    public final /* synthetic */ String $subredditName;
    public final /* synthetic */ String $topicSlug;
    public final /* synthetic */ DatabaseLinkDataSource this$0;
    
    public DatabaseLinkDataSource$getAllLinks$fetch$1(final DatabaseLinkDataSource this$0, final SortType $sort, final SortTimeFrame $sortTimeFrame, final ListingType $listingType, final String $subredditName, final String $multiredditPath, final String $geoFilter, final String $categoryId, final String $topicSlug, final String $flair) {
        this.this$0 = this$0;
        this.$sort = $sort;
        this.$sortTimeFrame = $sortTimeFrame;
        this.$listingType = $listingType;
        this.$subredditName = $subredditName;
        this.$multiredditPath = $multiredditPath;
        this.$geoFilter = $geoFilter;
        this.$categoryId = $categoryId;
        this.$topicSlug = $topicSlug;
        this.$flair = $flair;
        super(1);
    }
    
    public final n<Listing<Link>> invoke(final String s) {
        return this.this$0.i(this.$sort, this.$sortTimeFrame, s, this.$listingType, this.$subredditName, this.$multiredditPath, this.$geoFilter, this.$categoryId, this.$topicSlug, this.$flair);
    }
}
