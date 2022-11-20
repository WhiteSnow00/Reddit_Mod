// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model.livechat;

import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b" }, d2 = { "Lcom/reddit/domain/chat/model/livechat/LiveChatFilter;", "", "(Ljava/lang/String;I)V", "ALL", "LIVE_CHAT", "CHAT", "CHAT_REQUESTS", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum LiveChatFilter
{
    private static final LiveChatFilter[] $VALUES;
    
    ALL, 
    CHAT, 
    CHAT_REQUESTS;
    
    public static final Companion Companion;
    
    LIVE_CHAT;
    
    private static final LiveChatFilter[] $values() {
        return new LiveChatFilter[] { LiveChatFilter.ALL, LiveChatFilter.LIVE_CHAT, LiveChatFilter.CHAT, LiveChatFilter.CHAT_REQUESTS };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/livechat/LiveChatFilter$Companion;", "", "()V", "getLiveChatFilter", "Lcom/reddit/domain/chat/model/livechat/LiveChatFilter;", "value", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final LiveChatFilter getLiveChatFilter(final String s) {
            for (final LiveChatFilter liveChatFilter : LiveChatFilter.values()) {
                if (e.a((Object)liveChatFilter.name(), (Object)s)) {
                    return liveChatFilter;
                }
            }
            return null;
        }
    }
}
