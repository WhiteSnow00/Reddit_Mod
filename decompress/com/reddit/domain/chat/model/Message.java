// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import aq2.a;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003Ja\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006." }, d2 = { "Lcom/reddit/domain/chat/model/Message;", "", "id", "", "channelId", "", "createdAt", "type", "Lcom/reddit/domain/chat/model/ChatMessageType;", "customType", "Lcom/reddit/domain/chat/model/ChatMessageCustomType;", "data", "Lcom/reddit/domain/chat/model/ChatMessageData;", "message", "sender", "Lcom/reddit/domain/chat/model/ChatUser;", "(JLjava/lang/String;JLcom/reddit/domain/chat/model/ChatMessageType;Lcom/reddit/domain/chat/model/ChatMessageCustomType;Lcom/reddit/domain/chat/model/ChatMessageData;Ljava/lang/String;Lcom/reddit/domain/chat/model/ChatUser;)V", "getChannelId", "()Ljava/lang/String;", "getCreatedAt", "()J", "getCustomType", "()Lcom/reddit/domain/chat/model/ChatMessageCustomType;", "getData", "()Lcom/reddit/domain/chat/model/ChatMessageData;", "getId", "getMessage", "getSender", "()Lcom/reddit/domain/chat/model/ChatUser;", "getType", "()Lcom/reddit/domain/chat/model/ChatMessageType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Message
{
    private final String channelId;
    private final long createdAt;
    private final ChatMessageCustomType customType;
    private final ChatMessageData data;
    private final long id;
    private final String message;
    private final ChatUser sender;
    private final ChatMessageType type;
    
    public Message(final long id, final String channelId, final long createdAt, final ChatMessageType type, final ChatMessageCustomType customType, final ChatMessageData data, final String message, final ChatUser sender) {
        e.f((Object)channelId, "channelId");
        e.f((Object)message, "message");
        this.id = id;
        this.channelId = channelId;
        this.createdAt = createdAt;
        this.type = type;
        this.customType = customType;
        this.data = data;
        this.message = message;
        this.sender = sender;
    }
    
    public static Message copy$default(final Message message, long id, String channelId, long createdAt, ChatMessageType type, ChatMessageCustomType customType, ChatMessageData data, String message2, ChatUser sender, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            id = message.id;
        }
        if ((n & 0x2) != 0x0) {
            channelId = message.channelId;
        }
        if ((n & 0x4) != 0x0) {
            createdAt = message.createdAt;
        }
        if ((n & 0x8) != 0x0) {
            type = message.type;
        }
        if ((n & 0x10) != 0x0) {
            customType = message.customType;
        }
        if ((n & 0x20) != 0x0) {
            data = message.data;
        }
        if ((n & 0x40) != 0x0) {
            message2 = message.message;
        }
        if ((n & 0x80) != 0x0) {
            sender = message.sender;
        }
        return message.copy(id, channelId, createdAt, type, customType, data, message2, sender);
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.channelId;
    }
    
    public final long component3() {
        return this.createdAt;
    }
    
    public final ChatMessageType component4() {
        return this.type;
    }
    
    public final ChatMessageCustomType component5() {
        return this.customType;
    }
    
    public final ChatMessageData component6() {
        return this.data;
    }
    
    public final String component7() {
        return this.message;
    }
    
    public final ChatUser component8() {
        return this.sender;
    }
    
    public final Message copy(final long n, final String s, final long n2, final ChatMessageType chatMessageType, final ChatMessageCustomType chatMessageCustomType, final ChatMessageData chatMessageData, final String s2, final ChatUser chatUser) {
        e.f((Object)s, "channelId");
        e.f((Object)s2, "message");
        return new Message(n, s, n2, chatMessageType, chatMessageCustomType, chatMessageData, s2, chatUser);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Message)) {
            return false;
        }
        final Message message = (Message)o;
        return this.id == message.id && e.a((Object)this.channelId, (Object)message.channelId) && this.createdAt == message.createdAt && this.type == message.type && this.customType == message.customType && e.a((Object)this.data, (Object)message.data) && e.a((Object)this.message, (Object)message.message) && e.a((Object)this.sender, (Object)message.sender);
    }
    
    public final String getChannelId() {
        return this.channelId;
    }
    
    public final long getCreatedAt() {
        return this.createdAt;
    }
    
    public final ChatMessageCustomType getCustomType() {
        return this.customType;
    }
    
    public final ChatMessageData getData() {
        return this.data;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final String getMessage() {
        return this.message;
    }
    
    public final ChatUser getSender() {
        return this.sender;
    }
    
    public final ChatMessageType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int b = b.b(this.createdAt, a.e(this.channelId, Long.hashCode(this.id) * 31, 31), 31);
        final ChatMessageType type = this.type;
        final int n = 0;
        int hashCode;
        if (type == null) {
            hashCode = 0;
        }
        else {
            hashCode = type.hashCode();
        }
        final ChatMessageCustomType customType = this.customType;
        int hashCode2;
        if (customType == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = customType.hashCode();
        }
        final ChatMessageData data = this.data;
        int hashCode3;
        if (data == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = data.hashCode();
        }
        final int e = a.e(this.message, (((b + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31, 31);
        final ChatUser sender = this.sender;
        int hashCode4;
        if (sender == null) {
            hashCode4 = n;
        }
        else {
            hashCode4 = sender.hashCode();
        }
        return e + hashCode4;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Message(id=");
        t.append(this.id);
        t.append(", channelId=");
        t.append(this.channelId);
        t.append(", createdAt=");
        t.append(this.createdAt);
        t.append(", type=");
        t.append(this.type);
        t.append(", customType=");
        t.append(this.customType);
        t.append(", data=");
        t.append(this.data);
        t.append(", message=");
        t.append(this.message);
        t.append(", sender=");
        t.append(this.sender);
        t.append(')');
        return t.toString();
    }
}
