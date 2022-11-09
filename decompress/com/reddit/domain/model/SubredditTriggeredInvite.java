// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.viewpager.widget.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/model/SubredditTriggeredInvite;", "", "subredditName", "", "status", "Lcom/reddit/domain/model/SubredditTriggeredInvite$Status;", "shownUtc", "", "(Ljava/lang/String;Lcom/reddit/domain/model/SubredditTriggeredInvite$Status;J)V", "getShownUtc", "()J", "getStatus", "()Lcom/reddit/domain/model/SubredditTriggeredInvite$Status;", "getSubredditName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditTriggeredInvite
{
    private final long shownUtc;
    private final Status status;
    private final String subredditName;
    
    public SubredditTriggeredInvite(final String subredditName, final Status status, final long shownUtc) {
        f.f((Object)subredditName, "subredditName");
        f.f((Object)status, "status");
        this.subredditName = subredditName;
        this.status = status;
        this.shownUtc = shownUtc;
    }
    
    public final String component1() {
        return this.subredditName;
    }
    
    public final Status component2() {
        return this.status;
    }
    
    public final long component3() {
        return this.shownUtc;
    }
    
    public final SubredditTriggeredInvite copy(final String s, final Status status, final long n) {
        f.f((Object)s, "subredditName");
        f.f((Object)status, "status");
        return new SubredditTriggeredInvite(s, status, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditTriggeredInvite)) {
            return false;
        }
        final SubredditTriggeredInvite subredditTriggeredInvite = (SubredditTriggeredInvite)o;
        return f.a((Object)this.subredditName, (Object)subredditTriggeredInvite.subredditName) && this.status == subredditTriggeredInvite.status && this.shownUtc == subredditTriggeredInvite.shownUtc;
    }
    
    public final long getShownUtc() {
        return this.shownUtc;
    }
    
    public final Status getStatus() {
        return this.status;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.shownUtc) + (this.status.hashCode() + this.subredditName.hashCode() * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditTriggeredInvite(subredditName=");
        k.append(this.subredditName);
        k.append(", status=");
        k.append(this.status);
        k.append(", shownUtc=");
        return c.k(k, this.shownUtc, ')');
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/SubredditTriggeredInvite$Status;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "ACCEPTED", "REJECTED", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Status
    {
        ACCEPTED, 
        REJECTED, 
        UNKNOWN;
    }
}
