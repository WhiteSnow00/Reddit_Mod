// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.repository;

import ah2.f;
import kotlin.Metadata;
import com.reddit.domain.meta.model.Badge;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/reddit/domain/meta/model/Badge;", "invoke", "(Lcom/reddit/domain/meta/model/Badge;)Ljava/lang/Boolean;" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class RedditMetaBadgesRepository$requestSelectedBadges$1$badgesGrouped$1 extends Lambda implements l<Badge, Boolean>
{
    public static final RedditMetaBadgesRepository$requestSelectedBadges$1$badgesGrouped$1 INSTANCE;
    
    static {
        INSTANCE = new RedditMetaBadgesRepository$requestSelectedBadges$1$badgesGrouped$1();
    }
    
    public RedditMetaBadgesRepository$requestSelectedBadges$1$badgesGrouped$1() {
        super(1);
    }
    
    public final Boolean invoke(final Badge badge) {
        f.f((Object)badge, "it");
        return badge.t != null;
    }
}
