// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.data.adapter.RecommendedCategoryType;
import com.reddit.data.model.category.RecommendedCategory;
import com.reddit.data.adapter.ListingEnveloped;
import com.reddit.domain.model.Subreddit;
import com.reddit.domain.model.listing.Listing;
import av2.f;
import com.reddit.domain.model.SubredditCategory;
import java.util.List;
import nf2.c0;
import av2.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0003\u0010\t\u001a\u00020\bH'JH\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000f\u001a\u00020\b2\b\b\u0003\u0010\u0010\u001a\u00020\bH'J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002H'¨\u0006\u0016" }, d2 = { "Lcom/reddit/data/remote/RemoteCategoryDataSource;", "", "", "subredditId", "Lnf2/c0;", "", "Lcom/reddit/domain/model/SubredditCategory;", "categoriesForSubreddit", "", "extended", "subredditCategories", "categoryId", "", "limit", "after", "onboarding", "shuffle", "Lcom/reddit/domain/model/listing/Listing;", "Lcom/reddit/domain/model/Subreddit;", "subredditsInCategory", "Lcom/reddit/data/model/category/RecommendedCategory;", "subredditsInRecommended", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteCategoryDataSource
{
    @f("api/categories_for_subreddit")
    c0<List<SubredditCategory>> categoriesForSubreddit(@t("subreddit") final String p0);
    
    @f("api/available_subreddit_categories")
    c0<List<SubredditCategory>> subredditCategories(@t("use_extended_categories") final boolean p0);
    
    @f("api/subreddits_in_category")
    @ListingEnveloped
    c0<Listing<Subreddit>> subredditsInCategory(@t("category_id") final String p0, @t("limit") final int p1, @t("after") final String p2, @t("onboarding") final boolean p3, @t("shuffle") final boolean p4);
    
    @f("api/recommended_subreddits")
    @RecommendedCategoryType
    c0<RecommendedCategory> subredditsInRecommended(@t("after") final String p0);
}
