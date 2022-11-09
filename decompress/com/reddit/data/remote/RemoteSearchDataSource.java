// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.data.model.search.TrendingResponse;
import av2.f;
import com.reddit.domain.model.search.RemoteSearchResult;
import nf2.c0;
import av2.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JU\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002H'JB\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'JN\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u0017" }, d2 = { "Lcom/reddit/data/remote/RemoteSearchDataSource;", "", "", "query", "", "includeOver18", "allowOver18", "includeUsers", "searchCorrelationId", "searchQueryId", "Lnf2/c0;", "Lcom/reddit/domain/model/search/RemoteSearchResult;", "getSearchSuggestions", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;)Lnf2/c0;", "withAds", "ad", "subplacement", "Lcom/reddit/data/model/search/TrendingResponse;", "getTrendingSearches", "after", "getUsers", "categoryId", "getSubreddits", "data-remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteSearchDataSource
{
    @f("api/subreddit_autocomplete_v2")
    c0<RemoteSearchResult> getSearchSuggestions(@t("query") final String p0, @t("include_over_18") final Boolean p1, @t("allow_over18") final Boolean p2, @t("include_users") final boolean p3, @t("search_correlation_id") final String p4, @t("query_id") final String p5);
    
    @f("subreddits/search")
    c0<RemoteSearchResult> getSubreddits(@t("q") final String p0, @t("after") final String p1, @t("category") final String p2, @t("query_id") final String p3, @t("search_correlation_id") final String p4, @t("include_over_18") final boolean p5);
    
    @f("api/trending_searches_v1")
    c0<TrendingResponse> getTrendingSearches(@t("search_correlation_id") final String p0, @t("withAds") final boolean p1, @t("ad") final String p2, @t("subplacement") final String p3);
    
    @f("users/search")
    c0<RemoteSearchResult> getUsers(@t("q") final String p0, @t("after") final String p1, @t("query_id") final String p2, @t("search_correlation_id") final String p3, @t("include_over_18") final boolean p4);
}
