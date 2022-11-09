// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import androidx.appcompat.widget.s0;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u00103\u001a\u00020\rH\u00c6\u0003J\t\u00104\u001a\u00020\nH\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0002\u0010#J\u000b\u00106\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010:\u001a\u00020\nH\u00c6\u0003J\t\u0010;\u001a\u00020\nH\u00c6\u0003J\t\u0010<\u001a\u00020\rH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u00c6\u0003J¬\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00c6\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\r2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\nH\u00d6\u0001J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010'R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+¨\u0006E" }, d2 = { "Lcom/reddit/domain/chat/model/ChatChannel;", "", "id", "", "name", "createdAt", "", "customType", "Lcom/reddit/domain/chat/model/ChannelCustomType;", "unreadMessageCount", "", "unreadMentionCount", "isJoined", "", "inviter", "Lcom/reddit/domain/chat/model/ChatUser;", "members", "", "lastMessage", "Lcom/reddit/domain/chat/model/Message;", "isMuted", "memberCount", "invitedTimestamp", "creationReason", "Lcom/reddit/domain/chat/model/ChannelCreationReason;", "(Ljava/lang/String;Ljava/lang/String;JLcom/reddit/domain/chat/model/ChannelCustomType;IIZLcom/reddit/domain/chat/model/ChatUser;Ljava/util/List;Lcom/reddit/domain/chat/model/Message;ZILjava/lang/Long;Lcom/reddit/domain/chat/model/ChannelCreationReason;)V", "getCreatedAt", "()J", "getCreationReason", "()Lcom/reddit/domain/chat/model/ChannelCreationReason;", "getCustomType", "()Lcom/reddit/domain/chat/model/ChannelCustomType;", "getId", "()Ljava/lang/String;", "getInvitedTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInviter", "()Lcom/reddit/domain/chat/model/ChatUser;", "()Z", "getLastMessage", "()Lcom/reddit/domain/chat/model/Message;", "getMemberCount", "()I", "getMembers", "()Ljava/util/List;", "getName", "getUnreadMentionCount", "getUnreadMessageCount", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JLcom/reddit/domain/chat/model/ChannelCustomType;IIZLcom/reddit/domain/chat/model/ChatUser;Ljava/util/List;Lcom/reddit/domain/chat/model/Message;ZILjava/lang/Long;Lcom/reddit/domain/chat/model/ChannelCreationReason;)Lcom/reddit/domain/chat/model/ChatChannel;", "equals", "other", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ChatChannel
{
    private final long createdAt;
    private final ChannelCreationReason creationReason;
    private final ChannelCustomType customType;
    private final String id;
    private final Long invitedTimestamp;
    private final ChatUser inviter;
    private final boolean isJoined;
    private final boolean isMuted;
    private final Message lastMessage;
    private final int memberCount;
    private final List<ChatUser> members;
    private final String name;
    private final int unreadMentionCount;
    private final int unreadMessageCount;
    
    public ChatChannel(final String id, final String name, final long createdAt, final ChannelCustomType customType, final int unreadMessageCount, final int unreadMentionCount, final boolean isJoined, final ChatUser inviter, final List<ChatUser> members, final Message lastMessage, final boolean isMuted, final int memberCount, final Long invitedTimestamp, final ChannelCreationReason creationReason) {
        f.f((Object)id, "id");
        f.f((Object)members, "members");
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.customType = customType;
        this.unreadMessageCount = unreadMessageCount;
        this.unreadMentionCount = unreadMentionCount;
        this.isJoined = isJoined;
        this.inviter = inviter;
        this.members = members;
        this.lastMessage = lastMessage;
        this.isMuted = isMuted;
        this.memberCount = memberCount;
        this.invitedTimestamp = invitedTimestamp;
        this.creationReason = creationReason;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final Message component10() {
        return this.lastMessage;
    }
    
    public final boolean component11() {
        return this.isMuted;
    }
    
    public final int component12() {
        return this.memberCount;
    }
    
    public final Long component13() {
        return this.invitedTimestamp;
    }
    
    public final ChannelCreationReason component14() {
        return this.creationReason;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final long component3() {
        return this.createdAt;
    }
    
    public final ChannelCustomType component4() {
        return this.customType;
    }
    
    public final int component5() {
        return this.unreadMessageCount;
    }
    
    public final int component6() {
        return this.unreadMentionCount;
    }
    
    public final boolean component7() {
        return this.isJoined;
    }
    
    public final ChatUser component8() {
        return this.inviter;
    }
    
    public final List<ChatUser> component9() {
        return this.members;
    }
    
    public final ChatChannel copy(final String s, final String s2, final long n, final ChannelCustomType channelCustomType, final int n2, final int n3, final boolean b, final ChatUser chatUser, final List<ChatUser> list, final Message message, final boolean b2, final int n4, final Long n5, final ChannelCreationReason channelCreationReason) {
        f.f((Object)s, "id");
        f.f((Object)list, "members");
        return new ChatChannel(s, s2, n, channelCustomType, n2, n3, b, chatUser, list, message, b2, n4, n5, channelCreationReason);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatChannel)) {
            return false;
        }
        final ChatChannel chatChannel = (ChatChannel)o;
        return f.a((Object)this.id, (Object)chatChannel.id) && f.a((Object)this.name, (Object)chatChannel.name) && this.createdAt == chatChannel.createdAt && this.customType == chatChannel.customType && this.unreadMessageCount == chatChannel.unreadMessageCount && this.unreadMentionCount == chatChannel.unreadMentionCount && this.isJoined == chatChannel.isJoined && f.a((Object)this.inviter, (Object)chatChannel.inviter) && f.a((Object)this.members, (Object)chatChannel.members) && f.a((Object)this.lastMessage, (Object)chatChannel.lastMessage) && this.isMuted == chatChannel.isMuted && this.memberCount == chatChannel.memberCount && f.a((Object)this.invitedTimestamp, (Object)chatChannel.invitedTimestamp) && f.a((Object)this.creationReason, (Object)chatChannel.creationReason);
    }
    
    public final long getCreatedAt() {
        return this.createdAt;
    }
    
    public final ChannelCreationReason getCreationReason() {
        return this.creationReason;
    }
    
    public final ChannelCustomType getCustomType() {
        return this.customType;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final Long getInvitedTimestamp() {
        return this.invitedTimestamp;
    }
    
    public final ChatUser getInviter() {
        return this.inviter;
    }
    
    public final Message getLastMessage() {
        return this.lastMessage;
    }
    
    public final int getMemberCount() {
        return this.memberCount;
    }
    
    public final List<ChatUser> getMembers() {
        return this.members;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final int getUnreadMentionCount() {
        return this.unreadMentionCount;
    }
    
    public final int getUnreadMessageCount() {
        return this.unreadMessageCount;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String name = this.name;
        final int n = 0;
        int hashCode2;
        if (name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = name.hashCode();
        }
        final int c = b.c(this.createdAt, (hashCode * 31 + hashCode2) * 31, 31);
        final ChannelCustomType customType = this.customType;
        int hashCode3;
        if (customType == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = customType.hashCode();
        }
        final int e = s0.e(this.unreadMentionCount, s0.e(this.unreadMessageCount, (c + hashCode3) * 31, 31), 31);
        final int isJoined = this.isJoined ? 1 : 0;
        final int n2 = 1;
        int n3 = isJoined;
        if (isJoined != 0) {
            n3 = 1;
        }
        final ChatUser inviter = this.inviter;
        int hashCode4;
        if (inviter == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = inviter.hashCode();
        }
        final int a = a2.b.a((List)this.members, ((e + n3) * 31 + hashCode4) * 31, 31);
        final Message lastMessage = this.lastMessage;
        int hashCode5;
        if (lastMessage == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = lastMessage.hashCode();
        }
        int isMuted = this.isMuted ? 1 : 0;
        if (isMuted != 0) {
            isMuted = n2;
        }
        final int e2 = s0.e(this.memberCount, ((a + hashCode5) * 31 + isMuted) * 31, 31);
        final Long invitedTimestamp = this.invitedTimestamp;
        int hashCode6;
        if (invitedTimestamp == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = invitedTimestamp.hashCode();
        }
        final ChannelCreationReason creationReason = this.creationReason;
        int hashCode7;
        if (creationReason == null) {
            hashCode7 = n;
        }
        else {
            hashCode7 = creationReason.hashCode();
        }
        return (e2 + hashCode6) * 31 + hashCode7;
    }
    
    public final boolean isJoined() {
        return this.isJoined;
    }
    
    public final boolean isMuted() {
        return this.isMuted;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ChatChannel(id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", createdAt=");
        k.append(this.createdAt);
        k.append(", customType=");
        k.append(this.customType);
        k.append(", unreadMessageCount=");
        k.append(this.unreadMessageCount);
        k.append(", unreadMentionCount=");
        k.append(this.unreadMentionCount);
        k.append(", isJoined=");
        k.append(this.isJoined);
        k.append(", inviter=");
        k.append(this.inviter);
        k.append(", members=");
        k.append(this.members);
        k.append(", lastMessage=");
        k.append(this.lastMessage);
        k.append(", isMuted=");
        k.append(this.isMuted);
        k.append(", memberCount=");
        k.append(this.memberCount);
        k.append(", invitedTimestamp=");
        k.append(this.invitedTimestamp);
        k.append(", creationReason=");
        k.append(this.creationReason);
        k.append(')');
        return k.toString();
    }
}
