// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.sendbird.android.BaseChannel;
import com.sendbird.android.BaseMessage;
import ng2.e;
import com.sendbird.android.t4;
import com.sendbird.android.GroupChannel;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J5\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$" }, d2 = { "Lcom/reddit/domain/chat/model/MessageTransformation;", "", "Lcom/sendbird/android/t4;", "component1", "Lcom/reddit/domain/chat/model/UserData;", "component2", "Lcom/sendbird/android/GroupChannel;", "component3", "Lcom/reddit/domain/chat/model/SendBirdConfig;", "component4", "message", "sender", "channel", "config", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/sendbird/android/t4;", "getMessage", "()Lcom/sendbird/android/t4;", "Lcom/reddit/domain/chat/model/UserData;", "getSender", "()Lcom/reddit/domain/chat/model/UserData;", "Lcom/sendbird/android/GroupChannel;", "getChannel", "()Lcom/sendbird/android/GroupChannel;", "Lcom/reddit/domain/chat/model/SendBirdConfig;", "getConfig", "()Lcom/reddit/domain/chat/model/SendBirdConfig;", "<init>", "(Lcom/sendbird/android/t4;Lcom/reddit/domain/chat/model/UserData;Lcom/sendbird/android/GroupChannel;Lcom/reddit/domain/chat/model/SendBirdConfig;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class MessageTransformation
{
    private final GroupChannel channel;
    private final SendBirdConfig config;
    private final t4 message;
    private final UserData sender;
    
    public MessageTransformation(final t4 message, final UserData sender, final GroupChannel channel, final SendBirdConfig config) {
        e.f((Object)message, "message");
        e.f((Object)channel, "channel");
        this.message = message;
        this.sender = sender;
        this.channel = channel;
        this.config = config;
    }
    
    public static MessageTransformation copy$default(final MessageTransformation messageTransformation, t4 message, UserData sender, GroupChannel channel, SendBirdConfig config, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            message = messageTransformation.message;
        }
        if ((n & 0x2) != 0x0) {
            sender = messageTransformation.sender;
        }
        if ((n & 0x4) != 0x0) {
            channel = messageTransformation.channel;
        }
        if ((n & 0x8) != 0x0) {
            config = messageTransformation.config;
        }
        return messageTransformation.copy(message, sender, channel, config);
    }
    
    public final t4 component1() {
        return this.message;
    }
    
    public final UserData component2() {
        return this.sender;
    }
    
    public final GroupChannel component3() {
        return this.channel;
    }
    
    public final SendBirdConfig component4() {
        return this.config;
    }
    
    public final MessageTransformation copy(final t4 t4, final UserData userData, final GroupChannel groupChannel, final SendBirdConfig sendBirdConfig) {
        e.f((Object)t4, "message");
        e.f((Object)groupChannel, "channel");
        return new MessageTransformation(t4, userData, groupChannel, sendBirdConfig);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageTransformation)) {
            return false;
        }
        final MessageTransformation messageTransformation = (MessageTransformation)o;
        return e.a((Object)this.message, (Object)messageTransformation.message) && e.a((Object)this.sender, (Object)messageTransformation.sender) && e.a((Object)this.channel, (Object)messageTransformation.channel) && e.a((Object)this.config, (Object)messageTransformation.config);
    }
    
    public final GroupChannel getChannel() {
        return this.channel;
    }
    
    public final SendBirdConfig getConfig() {
        return this.config;
    }
    
    public final t4 getMessage() {
        return this.message;
    }
    
    public final UserData getSender() {
        return this.sender;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = ((BaseMessage)this.message).hashCode();
        final UserData sender = this.sender;
        int hashCode2 = 0;
        int hashCode3;
        if (sender == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = sender.hashCode();
        }
        final int hashCode4 = ((BaseChannel)this.channel).hashCode();
        final SendBirdConfig config = this.config;
        if (config != null) {
            hashCode2 = config.hashCode();
        }
        return (hashCode4 + (hashCode * 31 + hashCode3) * 31) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("MessageTransformation(message=");
        t.append(this.message);
        t.append(", sender=");
        t.append(this.sender);
        t.append(", channel=");
        t.append(this.channel);
        t.append(", config=");
        t.append(this.config);
        t.append(')');
        return t.toString();
    }
}
