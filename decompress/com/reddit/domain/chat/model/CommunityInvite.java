// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import al0.f0;
import sg2.e;
import android.support.v4.media.a;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/chat/model/CommunityInvite;", "", "subredditId", "", "subredditName", "invitePending", "", "inviteType", "inviteMessage", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getInviteMessage", "()Ljava/lang/String;", "getInvitePending", "()Z", "getInviteType", "getSubredditId", "getSubredditName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CommunityInvite
{
    private final String inviteMessage;
    private final boolean invitePending;
    private final String inviteType;
    private final String subredditId;
    private final String subredditName;
    
    public CommunityInvite(@n(name = "subreddit_id") final String subredditId, @n(name = "subreddit_name") final String subredditName, @n(name = "invite_pending") final boolean invitePending, @n(name = "invite_type") final String inviteType, @n(name = "invite_message") final String inviteMessage) {
        a.t(subredditId, "subredditId", subredditName, "subredditName", inviteType, "inviteType", inviteMessage, "inviteMessage");
        this.subredditId = subredditId;
        this.subredditName = subredditName;
        this.invitePending = invitePending;
        this.inviteType = inviteType;
        this.inviteMessage = inviteMessage;
    }
    
    public final String component1() {
        return this.subredditId;
    }
    
    public final String component2() {
        return this.subredditName;
    }
    
    public final boolean component3() {
        return this.invitePending;
    }
    
    public final String component4() {
        return this.inviteType;
    }
    
    public final String component5() {
        return this.inviteMessage;
    }
    
    public final CommunityInvite copy(@n(name = "subreddit_id") final String s, @n(name = "subreddit_name") final String s2, @n(name = "invite_pending") final boolean b, @n(name = "invite_type") final String s3, @n(name = "invite_message") final String s4) {
        e.f((Object)s, "subredditId");
        e.f((Object)s2, "subredditName");
        e.f((Object)s3, "inviteType");
        e.f((Object)s4, "inviteMessage");
        return new CommunityInvite(s, s2, b, s3, s4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommunityInvite)) {
            return false;
        }
        final CommunityInvite communityInvite = (CommunityInvite)o;
        return e.a((Object)this.subredditId, (Object)communityInvite.subredditId) && e.a((Object)this.subredditName, (Object)communityInvite.subredditName) && this.invitePending == communityInvite.invitePending && e.a((Object)this.inviteType, (Object)communityInvite.inviteType) && e.a((Object)this.inviteMessage, (Object)communityInvite.inviteMessage);
    }
    
    public final String getInviteMessage() {
        return this.inviteMessage;
    }
    
    public final boolean getInvitePending() {
        return this.invitePending;
    }
    
    public final String getInviteType() {
        return this.inviteType;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.subredditName, this.subredditId.hashCode() * 31, 31);
        int invitePending;
        if ((invitePending = (this.invitePending ? 1 : 0)) != 0) {
            invitePending = 1;
        }
        return this.inviteMessage.hashCode() + b.c(this.inviteType, (c + invitePending) * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("CommunityInvite(subredditId=");
        r.append(this.subredditId);
        r.append(", subredditName=");
        r.append(this.subredditName);
        r.append(", invitePending=");
        r.append(this.invitePending);
        r.append(", inviteType=");
        r.append(this.inviteType);
        r.append(", inviteMessage=");
        return f0.n(r, this.inviteMessage, ')');
    }
}
