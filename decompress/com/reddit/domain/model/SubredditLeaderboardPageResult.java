// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import java.util.List;
import com.reddit.domain.model.paging.PageInfo;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f" }, d2 = { "Lcom/reddit/domain/model/SubredditLeaderboardPageResult;", "", "pageInfo", "Lcom/reddit/domain/model/paging/PageInfo;", "subreddits", "", "Lcom/reddit/domain/model/SubredditLeaderboardModel;", "(Lcom/reddit/domain/model/paging/PageInfo;Ljava/util/List;)V", "getPageInfo", "()Lcom/reddit/domain/model/paging/PageInfo;", "getSubreddits", "()Ljava/util/List;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditLeaderboardPageResult
{
    private final PageInfo pageInfo;
    private final List<SubredditLeaderboardModel> subreddits;
    
    public SubredditLeaderboardPageResult(final PageInfo pageInfo, final List<SubredditLeaderboardModel> subreddits) {
        f.f((Object)pageInfo, "pageInfo");
        f.f((Object)subreddits, "subreddits");
        this.pageInfo = pageInfo;
        this.subreddits = subreddits;
    }
    
    public final PageInfo getPageInfo() {
        return this.pageInfo;
    }
    
    public final List<SubredditLeaderboardModel> getSubreddits() {
        return this.subreddits;
    }
}
