// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.posts;

import ah2.f;
import kotlin.Metadata;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "Lcom/reddit/domain/model/Link;", "it", "Lcom/reddit/domain/model/search/DiscoveryUnitSearchResult;", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PagedPostResultsRepository$cacheMediaPosts$1$1$1 extends Lambda implements l<DiscoveryUnitSearchResult, Link>
{
    public static final PagedPostResultsRepository$cacheMediaPosts$1$1$1 INSTANCE;
    
    static {
        INSTANCE = new PagedPostResultsRepository$cacheMediaPosts$1$1$1();
    }
    
    public PagedPostResultsRepository$cacheMediaPosts$1$1$1() {
        super(1);
    }
    
    public final Link invoke(final DiscoveryUnitSearchResult discoveryUnitSearchResult) {
        f.f((Object)discoveryUnitSearchResult, "it");
        return null;
    }
}
