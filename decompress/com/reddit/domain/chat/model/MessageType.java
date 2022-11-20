// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/chat/model/MessageType;", "", "(Ljava/lang/String;I)V", "TEXT_TYPE", "REDDIT_POST_CONTENT_TYPE", "REDDIT_CROSS_POST_CONTENT_TYPE", "SNOOMOJI_IMAGE_TYPE", "EMPTY_HEADER_TYPE", "ONE_ON_ONE_HEADER_TYPE", "DIRECT_HEADER_TYPE", "GROUP_HEADER_TYPE", "TYPING_INDICATOR_TYPE", "COLLAPSED_MESSAGES", "TOP_PRELOADER", "BOTTOM_PRELOADER", "SYSTEM_MESSAGE", "COMMUNITY_INVITE_TYPE", "POTENTIALLY_OFFENSIVE", "IMAGE_TYPE", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum MessageType
{
    private static final MessageType[] $VALUES;
    
    BOTTOM_PRELOADER, 
    COLLAPSED_MESSAGES, 
    COMMUNITY_INVITE_TYPE, 
    DIRECT_HEADER_TYPE, 
    EMPTY_HEADER_TYPE, 
    GROUP_HEADER_TYPE, 
    IMAGE_TYPE, 
    ONE_ON_ONE_HEADER_TYPE, 
    POTENTIALLY_OFFENSIVE, 
    REDDIT_CROSS_POST_CONTENT_TYPE, 
    REDDIT_POST_CONTENT_TYPE, 
    SNOOMOJI_IMAGE_TYPE, 
    SYSTEM_MESSAGE, 
    TEXT_TYPE, 
    TOP_PRELOADER, 
    TYPING_INDICATOR_TYPE;
    
    private static final MessageType[] $values() {
        return new MessageType[] { MessageType.TEXT_TYPE, MessageType.REDDIT_POST_CONTENT_TYPE, MessageType.REDDIT_CROSS_POST_CONTENT_TYPE, MessageType.SNOOMOJI_IMAGE_TYPE, MessageType.EMPTY_HEADER_TYPE, MessageType.ONE_ON_ONE_HEADER_TYPE, MessageType.DIRECT_HEADER_TYPE, MessageType.GROUP_HEADER_TYPE, MessageType.TYPING_INDICATOR_TYPE, MessageType.COLLAPSED_MESSAGES, MessageType.TOP_PRELOADER, MessageType.BOTTOM_PRELOADER, MessageType.SYSTEM_MESSAGE, MessageType.COMMUNITY_INVITE_TYPE, MessageType.POTENTIALLY_OFFENSIVE, MessageType.IMAGE_TYPE };
    }
    
    static {
        $VALUES = $values();
    }
}
