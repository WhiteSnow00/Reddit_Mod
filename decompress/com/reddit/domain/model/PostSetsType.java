// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/PostSetsType;", "", "(Ljava/lang/String;I)V", "TEXT", "LINK", "CROSSPOST", "PREDICTION_TOURNAMENT", "LIVE_AUDIO", "GALLERY", "VIDEO", "VIDEO_PROCESSING", "IMAGE", "CHAT", "POLL", "RPAN", "UNKNOWN", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum PostSetsType
{
    private static final PostSetsType[] $VALUES;
    
    CHAT, 
    CROSSPOST, 
    GALLERY, 
    IMAGE, 
    LINK, 
    LIVE_AUDIO, 
    POLL, 
    PREDICTION_TOURNAMENT, 
    RPAN, 
    TEXT, 
    UNKNOWN, 
    VIDEO, 
    VIDEO_PROCESSING;
    
    private static final PostSetsType[] $values() {
        return new PostSetsType[] { PostSetsType.TEXT, PostSetsType.LINK, PostSetsType.CROSSPOST, PostSetsType.PREDICTION_TOURNAMENT, PostSetsType.LIVE_AUDIO, PostSetsType.GALLERY, PostSetsType.VIDEO, PostSetsType.VIDEO_PROCESSING, PostSetsType.IMAGE, PostSetsType.CHAT, PostSetsType.POLL, PostSetsType.RPAN, PostSetsType.UNKNOWN };
    }
    
    static {
        $VALUES = $values();
    }
}
