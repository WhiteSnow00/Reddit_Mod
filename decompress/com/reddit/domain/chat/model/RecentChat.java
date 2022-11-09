// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ag0.a;
import a2.b;
import ah2.f;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/RecentChat;", "Lcom/reddit/domain/chat/model/WithLastVisit;", "()V", "RecentChatPost", "RecentGroupChannel", "Lcom/reddit/domain/chat/model/RecentChat$RecentChatPost;", "Lcom/reddit/domain/chat/model/RecentChat$RecentGroupChannel;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class RecentChat implements WithLastVisit
{
    private RecentChat() {
    }
    
    @Metadata(d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\rH\u00c6\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006'" }, d2 = { "Lcom/reddit/domain/chat/model/RecentChat$RecentGroupChannel;", "Lcom/reddit/domain/chat/model/RecentChat;", "channelUrl", "", "members", "", "Lcom/reddit/domain/chat/model/ChatMember;", "inviter", "isOneToOne", "", "isAccepted", "name", "lastVisitTime", "", "(Ljava/lang/String;Ljava/util/List;Lcom/reddit/domain/chat/model/ChatMember;ZZLjava/lang/String;J)V", "getChannelUrl", "()Ljava/lang/String;", "getInviter", "()Lcom/reddit/domain/chat/model/ChatMember;", "()Z", "getLastVisitTime", "()J", "getMembers", "()Ljava/util/List;", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class RecentGroupChannel extends RecentChat
    {
        private final String channelUrl;
        private final ChatMember inviter;
        private final boolean isAccepted;
        private final boolean isOneToOne;
        private final long lastVisitTime;
        private final List<ChatMember> members;
        private final String name;
        
        public RecentGroupChannel(final String channelUrl, final List<? extends ChatMember> members, final ChatMember inviter, final boolean isOneToOne, final boolean isAccepted, final String name, final long lastVisitTime) {
            f.f((Object)channelUrl, "channelUrl");
            f.f((Object)members, "members");
            f.f((Object)name, "name");
            super(null);
            this.channelUrl = channelUrl;
            this.members = (List<ChatMember>)members;
            this.inviter = inviter;
            this.isOneToOne = isOneToOne;
            this.isAccepted = isAccepted;
            this.name = name;
            this.lastVisitTime = lastVisitTime;
        }
        
        public final String component1() {
            return this.channelUrl;
        }
        
        public final List<ChatMember> component2() {
            return this.members;
        }
        
        public final ChatMember component3() {
            return this.inviter;
        }
        
        public final boolean component4() {
            return this.isOneToOne;
        }
        
        public final boolean component5() {
            return this.isAccepted;
        }
        
        public final String component6() {
            return this.name;
        }
        
        public final long component7() {
            return this.getLastVisitTime();
        }
        
        public final RecentGroupChannel copy(final String s, final List<? extends ChatMember> list, final ChatMember chatMember, final boolean b, final boolean b2, final String s2, final long n) {
            f.f((Object)s, "channelUrl");
            f.f((Object)list, "members");
            f.f((Object)s2, "name");
            return new RecentGroupChannel(s, list, chatMember, b, b2, s2, n);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof RecentGroupChannel)) {
                return false;
            }
            final RecentGroupChannel recentGroupChannel = (RecentGroupChannel)o;
            return f.a((Object)this.channelUrl, (Object)recentGroupChannel.channelUrl) && f.a((Object)this.members, (Object)recentGroupChannel.members) && f.a((Object)this.inviter, (Object)recentGroupChannel.inviter) && this.isOneToOne == recentGroupChannel.isOneToOne && this.isAccepted == recentGroupChannel.isAccepted && f.a((Object)this.name, (Object)recentGroupChannel.name) && this.getLastVisitTime() == recentGroupChannel.getLastVisitTime();
        }
        
        public final String getChannelUrl() {
            return this.channelUrl;
        }
        
        public final ChatMember getInviter() {
            return this.inviter;
        }
        
        public long getLastVisitTime() {
            return this.lastVisitTime;
        }
        
        public final List<ChatMember> getMembers() {
            return this.members;
        }
        
        public final String getName() {
            return this.name;
        }
        
        @Override
        public int hashCode() {
            final int a = b.a((List)this.members, this.channelUrl.hashCode() * 31, 31);
            final ChatMember inviter = this.inviter;
            int hashCode;
            if (inviter == null) {
                hashCode = 0;
            }
            else {
                hashCode = inviter.hashCode();
            }
            final int isOneToOne = this.isOneToOne ? 1 : 0;
            int n = 1;
            int n2 = isOneToOne;
            if (isOneToOne != 0) {
                n2 = 1;
            }
            final int isAccepted = this.isAccepted ? 1 : 0;
            if (isAccepted == 0) {
                n = isAccepted;
            }
            return Long.hashCode(this.getLastVisitTime()) + ag0.a.f(this.name, (((a + hashCode) * 31 + n2) * 31 + n) * 31, 31);
        }
        
        public final boolean isAccepted() {
            return this.isAccepted;
        }
        
        public final boolean isOneToOne() {
            return this.isOneToOne;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("RecentGroupChannel(channelUrl=");
            k.append(this.channelUrl);
            k.append(", members=");
            k.append(this.members);
            k.append(", inviter=");
            k.append(this.inviter);
            k.append(", isOneToOne=");
            k.append(this.isOneToOne);
            k.append(", isAccepted=");
            k.append(this.isAccepted);
            k.append(", name=");
            k.append(this.name);
            k.append(", lastVisitTime=");
            k.append(this.getLastVisitTime());
            k.append(')');
            return k.toString();
        }
    }
}
