// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.posts;

import ah2.f;
import kotlin.Metadata;
import com.reddit.domain.model.Link;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Lcom/reddit/domain/model/Link;", "it", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PagedPostResultsRepository$cacheMediaPosts$1$1$2 extends Lambda implements l<Link, Link>
{
    public static final PagedPostResultsRepository$cacheMediaPosts$1$1$2 INSTANCE;
    
    static {
        INSTANCE = new PagedPostResultsRepository$cacheMediaPosts$1$1$2();
    }
    
    public PagedPostResultsRepository$cacheMediaPosts$1$1$2() {
        super(1);
    }
    
    public final Link invoke(final Link link) {
        f.f((Object)link, "it");
        return link;
    }
}
