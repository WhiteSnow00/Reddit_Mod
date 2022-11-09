// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/ChatId;", "", "()V", "ChatPostId", "GroupChatId", "Lcom/reddit/domain/chat/model/ChatId$ChatPostId;", "Lcom/reddit/domain/chat/model/ChatId$GroupChatId;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class ChatId
{
    private ChatId() {
    }
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/chat/model/ChatId$ChatPostId;", "Lcom/reddit/domain/chat/model/ChatId;", "linkId", "", "(Ljava/lang/String;)V", "getLinkId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class ChatPostId extends ChatId
    {
        private final String linkId;
        
        public ChatPostId(final String linkId) {
            f.f((Object)linkId, "linkId");
            super(null);
            this.linkId = linkId;
        }
        
        public final String component1() {
            return this.linkId;
        }
        
        public final ChatPostId copy(final String s) {
            f.f((Object)s, "linkId");
            return new ChatPostId(s);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof ChatPostId && f.a((Object)this.linkId, (Object)((ChatPostId)o).linkId));
        }
        
        public final String getLinkId() {
            return this.linkId;
        }
        
        @Override
        public int hashCode() {
            return this.linkId.hashCode();
        }
        
        @Override
        public String toString() {
            return b.k(a.k("ChatPostId(linkId="), this.linkId, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/chat/model/ChatId$GroupChatId;", "Lcom/reddit/domain/chat/model/ChatId;", "chatUrl", "", "(Ljava/lang/String;)V", "getChatUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class GroupChatId extends ChatId
    {
        private final String chatUrl;
        
        public GroupChatId(final String chatUrl) {
            f.f((Object)chatUrl, "chatUrl");
            super(null);
            this.chatUrl = chatUrl;
        }
        
        public final String component1() {
            return this.chatUrl;
        }
        
        public final GroupChatId copy(final String s) {
            f.f((Object)s, "chatUrl");
            return new GroupChatId(s);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof GroupChatId && f.a((Object)this.chatUrl, (Object)((GroupChatId)o).chatUrl));
        }
        
        public final String getChatUrl() {
            return this.chatUrl;
        }
        
        @Override
        public int hashCode() {
            return this.chatUrl.hashCode();
        }
        
        @Override
        public String toString() {
            return b.k(a.k("GroupChatId(chatUrl="), this.chatUrl, ')');
        }
    }
}
