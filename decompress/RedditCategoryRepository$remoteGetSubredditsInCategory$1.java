// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import kotlin.Metadata;
import com.reddit.domain.model.Subreddit;
import com.reddit.domain.model.listing.Listing;
import nf2.c0;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "", "after", "Lnf2/c0;", "Lcom/reddit/domain/model/listing/Listing;", "Lcom/reddit/domain/model/Subreddit;", "invoke", "(Ljava/lang/String;)Lnf2/c0;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class RedditCategoryRepository$remoteGetSubredditsInCategory$1 extends Lambda implements l<String, c0<Listing<? extends Subreddit>>>
{
    public final /* synthetic */ String $categoryId;
    public final /* synthetic */ int $limit;
    public final /* synthetic */ RedditCategoryRepository this$0;
    
    public RedditCategoryRepository$remoteGetSubredditsInCategory$1(final RedditCategoryRepository this$0, final String $categoryId, final int $limit) {
        this.this$0 = this$0;
        this.$categoryId = $categoryId;
        this.$limit = $limit;
        super(1);
    }
    
    public final c0<Listing<Subreddit>> invoke(final String s) {
        return this.this$0.b.subredditsInCategory(this.$categoryId, this.$limit, s, false, true);
    }
}
