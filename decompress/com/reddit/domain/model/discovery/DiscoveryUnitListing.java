// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.discovery;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.reddit.domain.model.Subreddit;
import com.reddit.domain.model.Link;
import kotlin.Pair;
import java.util.List;
import com.reddit.domain.model.Account;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB7\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u00c6\u0003J=\u0010\u0015\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/discovery/DiscoveryUnitListing;", "", "links", "", "Lkotlin/Pair;", "Lcom/reddit/domain/model/Link;", "Lcom/reddit/domain/model/discovery/DiscoveryUnitListing$LinkCause;", "subreddit", "Lcom/reddit/domain/model/Subreddit;", "account", "Lcom/reddit/domain/model/Account;", "(Ljava/util/List;Lcom/reddit/domain/model/Subreddit;Lcom/reddit/domain/model/Account;)V", "getAccount", "()Lcom/reddit/domain/model/Account;", "getLinks", "()Ljava/util/List;", "getSubreddit", "()Lcom/reddit/domain/model/Subreddit;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LinkCause", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class DiscoveryUnitListing
{
    private final Account account;
    private final List<Pair<Link, LinkCause>> links;
    private final Subreddit subreddit;
    
    public DiscoveryUnitListing(final List<Pair<Link, LinkCause>> links, final Subreddit subreddit, final Account account) {
        f.f((Object)links, "links");
        this.links = links;
        this.subreddit = subreddit;
        this.account = account;
    }
    
    public final List<Pair<Link, LinkCause>> component1() {
        return this.links;
    }
    
    public final Subreddit component2() {
        return this.subreddit;
    }
    
    public final Account component3() {
        return this.account;
    }
    
    public final DiscoveryUnitListing copy(final List<Pair<Link, LinkCause>> list, final Subreddit subreddit, final Account account) {
        f.f((Object)list, "links");
        return new DiscoveryUnitListing(list, subreddit, account);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryUnitListing)) {
            return false;
        }
        final DiscoveryUnitListing discoveryUnitListing = (DiscoveryUnitListing)o;
        return f.a((Object)this.links, (Object)discoveryUnitListing.links) && f.a((Object)this.subreddit, (Object)discoveryUnitListing.subreddit) && f.a((Object)this.account, (Object)discoveryUnitListing.account);
    }
    
    public final Account getAccount() {
        return this.account;
    }
    
    public final List<Pair<Link, LinkCause>> getLinks() {
        return this.links;
    }
    
    public final Subreddit getSubreddit() {
        return this.subreddit;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.links.hashCode();
        final Subreddit subreddit = this.subreddit;
        int hashCode2 = 0;
        int hashCode3;
        if (subreddit == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subreddit.hashCode();
        }
        final Account account = this.account;
        if (account != null) {
            hashCode2 = account.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("DiscoveryUnitListing(links=");
        k.append(this.links);
        k.append(", subreddit=");
        k.append(this.subreddit);
        k.append(", account=");
        k.append(this.account);
        k.append(')');
        return k.toString();
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/discovery/DiscoveryUnitListing$LinkCause;", "", "cause", "", "(Ljava/lang/String;)V", "getCause", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class LinkCause
    {
        public static final Companion Companion;
        private final String cause;
        
        static {
            Companion = new Companion(null);
        }
        
        public LinkCause() {
            this(null, 1, null);
        }
        
        public LinkCause(final String cause) {
            this.cause = cause;
        }
        
        public final String component1() {
            return this.cause;
        }
        
        public final LinkCause copy(final String s) {
            return new LinkCause(s);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof LinkCause && f.a((Object)this.cause, (Object)((LinkCause)o).cause));
        }
        
        public final String getCause() {
            return this.cause;
        }
        
        @Override
        public int hashCode() {
            final String cause = this.cause;
            int hashCode;
            if (cause == null) {
                hashCode = 0;
            }
            else {
                hashCode = cause.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public String toString() {
            return b.k(a.k("LinkCause(cause="), this.cause, ')');
        }
        
        @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/discovery/DiscoveryUnitListing$LinkCause$Companion;", "", "()V", "none", "Lcom/reddit/domain/model/discovery/DiscoveryUnitListing$LinkCause;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class Companion
        {
            private Companion() {
            }
            
            public final LinkCause none() {
                return new LinkCause(null, 1, null);
            }
        }
    }
}
