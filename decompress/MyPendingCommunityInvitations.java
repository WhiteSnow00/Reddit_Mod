// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.appcompat.widget.s0;
import ak0.m;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/MyPendingCommunityInvitations;", "", "isInvitePending", "", "pendingInvitations", "", "Lcom/reddit/domain/model/MyPendingCommunityInvitations$PendingCommunityInvitation;", "(ZLjava/util/List;)V", "()Z", "getPendingInvitations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "PendingCommunityInvitation", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MyPendingCommunityInvitations
{
    private final boolean isInvitePending;
    private final List<PendingCommunityInvitation> pendingInvitations;
    
    public MyPendingCommunityInvitations(final boolean isInvitePending, final List<PendingCommunityInvitation> pendingInvitations) {
        f.f((Object)pendingInvitations, "pendingInvitations");
        this.isInvitePending = isInvitePending;
        this.pendingInvitations = pendingInvitations;
    }
    
    public final boolean component1() {
        return this.isInvitePending;
    }
    
    public final List<PendingCommunityInvitation> component2() {
        return this.pendingInvitations;
    }
    
    public final MyPendingCommunityInvitations copy(final boolean b, final List<PendingCommunityInvitation> list) {
        f.f((Object)list, "pendingInvitations");
        return new MyPendingCommunityInvitations(b, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyPendingCommunityInvitations)) {
            return false;
        }
        final MyPendingCommunityInvitations myPendingCommunityInvitations = (MyPendingCommunityInvitations)o;
        return this.isInvitePending == myPendingCommunityInvitations.isInvitePending && f.a((Object)this.pendingInvitations, (Object)myPendingCommunityInvitations.pendingInvitations);
    }
    
    public final List<PendingCommunityInvitation> getPendingInvitations() {
        return this.pendingInvitations;
    }
    
    @Override
    public int hashCode() {
        int isInvitePending;
        if ((isInvitePending = (this.isInvitePending ? 1 : 0)) != 0) {
            isInvitePending = 1;
        }
        return this.pendingInvitations.hashCode() + isInvitePending * 31;
    }
    
    public final boolean isInvitePending() {
        return this.isInvitePending;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MyPendingCommunityInvitations(isInvitePending=");
        k.append(this.isInvitePending);
        k.append(", pendingInvitations=");
        return m.n(k, (List)this.pendingInvitations, ')');
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/MyPendingCommunityInvitations$PendingCommunityInvitation;", "", "inviter", "", "subredditId", "subredditName", "chatMessageId", "isInvitedAsModerator", "", "isContributor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getChatMessageId", "()Ljava/lang/String;", "getInviter", "()Z", "getSubredditId", "getSubredditName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class PendingCommunityInvitation
    {
        private final String chatMessageId;
        private final String inviter;
        private final boolean isContributor;
        private final boolean isInvitedAsModerator;
        private final String subredditId;
        private final String subredditName;
        
        public PendingCommunityInvitation(final String inviter, final String subredditId, final String subredditName, final String chatMessageId, final boolean isInvitedAsModerator, final boolean isContributor) {
            m.y(inviter, "inviter", subredditId, "subredditId", subredditName, "subredditName");
            this.inviter = inviter;
            this.subredditId = subredditId;
            this.subredditName = subredditName;
            this.chatMessageId = chatMessageId;
            this.isInvitedAsModerator = isInvitedAsModerator;
            this.isContributor = isContributor;
        }
        
        public final String component1() {
            return this.inviter;
        }
        
        public final String component2() {
            return this.subredditId;
        }
        
        public final String component3() {
            return this.subredditName;
        }
        
        public final String component4() {
            return this.chatMessageId;
        }
        
        public final boolean component5() {
            return this.isInvitedAsModerator;
        }
        
        public final boolean component6() {
            return this.isContributor;
        }
        
        public final PendingCommunityInvitation copy(final String s, final String s2, final String s3, final String s4, final boolean b, final boolean b2) {
            f.f((Object)s, "inviter");
            f.f((Object)s2, "subredditId");
            f.f((Object)s3, "subredditName");
            return new PendingCommunityInvitation(s, s2, s3, s4, b, b2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof PendingCommunityInvitation)) {
                return false;
            }
            final PendingCommunityInvitation pendingCommunityInvitation = (PendingCommunityInvitation)o;
            return f.a((Object)this.inviter, (Object)pendingCommunityInvitation.inviter) && f.a((Object)this.subredditId, (Object)pendingCommunityInvitation.subredditId) && f.a((Object)this.subredditName, (Object)pendingCommunityInvitation.subredditName) && f.a((Object)this.chatMessageId, (Object)pendingCommunityInvitation.chatMessageId) && this.isInvitedAsModerator == pendingCommunityInvitation.isInvitedAsModerator && this.isContributor == pendingCommunityInvitation.isContributor;
        }
        
        public final String getChatMessageId() {
            return this.chatMessageId;
        }
        
        public final String getInviter() {
            return this.inviter;
        }
        
        public final String getSubredditId() {
            return this.subredditId;
        }
        
        public final String getSubredditName() {
            return this.subredditName;
        }
        
        @Override
        public int hashCode() {
            final int f = ag0.a.f(this.subredditName, ag0.a.f(this.subredditId, this.inviter.hashCode() * 31, 31), 31);
            final String chatMessageId = this.chatMessageId;
            int hashCode;
            if (chatMessageId == null) {
                hashCode = 0;
            }
            else {
                hashCode = chatMessageId.hashCode();
            }
            final int isInvitedAsModerator = this.isInvitedAsModerator ? 1 : 0;
            int n = 1;
            int n2 = isInvitedAsModerator;
            if (isInvitedAsModerator != 0) {
                n2 = 1;
            }
            final int isContributor = this.isContributor ? 1 : 0;
            if (isContributor == 0) {
                n = isContributor;
            }
            return ((f + hashCode) * 31 + n2) * 31 + n;
        }
        
        public final boolean isContributor() {
            return this.isContributor;
        }
        
        public final boolean isInvitedAsModerator() {
            return this.isInvitedAsModerator;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("PendingCommunityInvitation(inviter=");
            k.append(this.inviter);
            k.append(", subredditId=");
            k.append(this.subredditId);
            k.append(", subredditName=");
            k.append(this.subredditName);
            k.append(", chatMessageId=");
            k.append(this.chatMessageId);
            k.append(", isInvitedAsModerator=");
            k.append(this.isInvitedAsModerator);
            k.append(", isContributor=");
            return s0.o(k, this.isContributor, ')');
        }
    }
}
