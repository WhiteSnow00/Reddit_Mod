// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.postsets.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/postsets/model/PostSetPostType;", "", "(Ljava/lang/String;I)V", "TEXT", "VIDEO", "IMAGE", "WEB_LINK", "UNSUPPORTED", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum PostSetPostType
{
    private static final PostSetPostType[] $VALUES;
    
    IMAGE, 
    TEXT, 
    UNSUPPORTED, 
    VIDEO, 
    WEB_LINK;
    
    private static final PostSetPostType[] $values() {
        return new PostSetPostType[] { PostSetPostType.TEXT, PostSetPostType.VIDEO, PostSetPostType.IMAGE, PostSetPostType.WEB_LINK, PostSetPostType.UNSUPPORTED };
    }
    
    static {
        $VALUES = $values();
    }
}
