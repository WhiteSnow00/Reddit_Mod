// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.richcontent;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/richcontent/Source;", "", "(Ljava/lang/String;I)V", "META", "POWERUPS", "PARENT_COMMENTS", "GIPHY_IN_COMMENTS", "SUBREDDIT", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum Source
{
    private static final Source[] $VALUES;
    
    GIPHY_IN_COMMENTS, 
    META, 
    PARENT_COMMENTS, 
    POWERUPS, 
    SUBREDDIT;
    
    private static final Source[] $values() {
        return new Source[] { Source.META, Source.POWERUPS, Source.PARENT_COMMENTS, Source.GIPHY_IN_COMMENTS, Source.SUBREDDIT };
    }
    
    static {
        $VALUES = $values();
    }
}
