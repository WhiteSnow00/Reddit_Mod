// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.customemojis;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006?\u0006\u0007" }, d2 = { "Lcom/reddit/domain/customemojis/EmotesSource;", "", "(Ljava/lang/String;I)V", "META", "POWERUPS", "PARENT_COMMENTS", "SUBREDDIT", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum EmotesSource
{
    private static final EmotesSource[] $VALUES;
    
    META, 
    PARENT_COMMENTS, 
    POWERUPS, 
    SUBREDDIT;
    
    private static final EmotesSource[] $values() {
        return new EmotesSource[] { EmotesSource.META, EmotesSource.POWERUPS, EmotesSource.PARENT_COMMENTS, EmotesSource.SUBREDDIT };
    }
    
    static {
        $VALUES = $values();
    }
}
