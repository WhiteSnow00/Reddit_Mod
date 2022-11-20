// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model.livechat;

import b5.k;
import ng2.e;
import com.reddit.domain.chat.model.ChatUser;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/chat/model/livechat/LiveChatInvite;", "", "inviter", "Lcom/reddit/domain/chat/model/ChatUser;", "invitedTimestampMillis", "", "(Lcom/reddit/domain/chat/model/ChatUser;J)V", "getInvitedTimestampMillis", "()J", "getInviter", "()Lcom/reddit/domain/chat/model/ChatUser;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class LiveChatInvite
{
    private final long invitedTimestampMillis;
    private final ChatUser inviter;
    
    public LiveChatInvite(final ChatUser inviter, final long invitedTimestampMillis) {
        e.f((Object)inviter, "inviter");
        this.inviter = inviter;
        this.invitedTimestampMillis = invitedTimestampMillis;
    }
    
    public static LiveChatInvite copy$default(final LiveChatInvite liveChatInvite, ChatUser inviter, long invitedTimestampMillis, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            inviter = liveChatInvite.inviter;
        }
        if ((n & 0x2) != 0x0) {
            invitedTimestampMillis = liveChatInvite.invitedTimestampMillis;
        }
        return liveChatInvite.copy(inviter, invitedTimestampMillis);
    }
    
    public final ChatUser component1() {
        return this.inviter;
    }
    
    public final long component2() {
        return this.invitedTimestampMillis;
    }
    
    public final LiveChatInvite copy(final ChatUser chatUser, final long n) {
        e.f((Object)chatUser, "inviter");
        return new LiveChatInvite(chatUser, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LiveChatInvite)) {
            return false;
        }
        final LiveChatInvite liveChatInvite = (LiveChatInvite)o;
        return e.a((Object)this.inviter, (Object)liveChatInvite.inviter) && this.invitedTimestampMillis == liveChatInvite.invitedTimestampMillis;
    }
    
    public final long getInvitedTimestampMillis() {
        return this.invitedTimestampMillis;
    }
    
    public final ChatUser getInviter() {
        return this.inviter;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.invitedTimestampMillis) + this.inviter.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("LiveChatInvite(inviter=");
        t.append(this.inviter);
        t.append(", invitedTimestampMillis=");
        return k.k(t, this.invitedTimestampMillis, ')');
    }
}
