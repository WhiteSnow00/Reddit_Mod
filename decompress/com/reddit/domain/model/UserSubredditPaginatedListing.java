// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/UserSubredditPaginatedListing;", "", "subscribed", "Lcom/reddit/domain/model/PaginatedListing;", "moderated", "followed", "(Lcom/reddit/domain/model/PaginatedListing;Lcom/reddit/domain/model/PaginatedListing;Lcom/reddit/domain/model/PaginatedListing;)V", "getFollowed", "()Lcom/reddit/domain/model/PaginatedListing;", "getModerated", "getSubscribed", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UserSubredditPaginatedListing
{
    private final PaginatedListing followed;
    private final PaginatedListing moderated;
    private final PaginatedListing subscribed;
    
    public UserSubredditPaginatedListing(final PaginatedListing subscribed, final PaginatedListing moderated, final PaginatedListing followed) {
        this.subscribed = subscribed;
        this.moderated = moderated;
        this.followed = followed;
    }
    
    public final PaginatedListing component1() {
        return this.subscribed;
    }
    
    public final PaginatedListing component2() {
        return this.moderated;
    }
    
    public final PaginatedListing component3() {
        return this.followed;
    }
    
    public final UserSubredditPaginatedListing copy(final PaginatedListing paginatedListing, final PaginatedListing paginatedListing2, final PaginatedListing paginatedListing3) {
        return new UserSubredditPaginatedListing(paginatedListing, paginatedListing2, paginatedListing3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserSubredditPaginatedListing)) {
            return false;
        }
        final UserSubredditPaginatedListing userSubredditPaginatedListing = (UserSubredditPaginatedListing)o;
        return f.a((Object)this.subscribed, (Object)userSubredditPaginatedListing.subscribed) && f.a((Object)this.moderated, (Object)userSubredditPaginatedListing.moderated) && f.a((Object)this.followed, (Object)userSubredditPaginatedListing.followed);
    }
    
    public final PaginatedListing getFollowed() {
        return this.followed;
    }
    
    public final PaginatedListing getModerated() {
        return this.moderated;
    }
    
    public final PaginatedListing getSubscribed() {
        return this.subscribed;
    }
    
    @Override
    public int hashCode() {
        final PaginatedListing subscribed = this.subscribed;
        int hashCode = 0;
        int hashCode2;
        if (subscribed == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subscribed.hashCode();
        }
        final PaginatedListing moderated = this.moderated;
        int hashCode3;
        if (moderated == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = moderated.hashCode();
        }
        final PaginatedListing followed = this.followed;
        if (followed != null) {
            hashCode = followed.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UserSubredditPaginatedListing(subscribed=");
        k.append(this.subscribed);
        k.append(", moderated=");
        k.append(this.moderated);
        k.append(", followed=");
        k.append(this.followed);
        k.append(')');
        return k.toString();
    }
}
