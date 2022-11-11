// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/UserSubredditListings;", "", "subscribed", "Lcom/reddit/domain/model/ProgressableListing;", "moderating", "following", "(Lcom/reddit/domain/model/ProgressableListing;Lcom/reddit/domain/model/ProgressableListing;Lcom/reddit/domain/model/ProgressableListing;)V", "getFollowing", "()Lcom/reddit/domain/model/ProgressableListing;", "getModerating", "getSubscribed", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UserSubredditListings
{
    private final ProgressableListing following;
    private final ProgressableListing moderating;
    private final ProgressableListing subscribed;
    
    public UserSubredditListings(final ProgressableListing subscribed, final ProgressableListing moderating, final ProgressableListing following) {
        f.f((Object)subscribed, "subscribed");
        f.f((Object)moderating, "moderating");
        f.f((Object)following, "following");
        this.subscribed = subscribed;
        this.moderating = moderating;
        this.following = following;
    }
    
    public final ProgressableListing component1() {
        return this.subscribed;
    }
    
    public final ProgressableListing component2() {
        return this.moderating;
    }
    
    public final ProgressableListing component3() {
        return this.following;
    }
    
    public final UserSubredditListings copy(final ProgressableListing progressableListing, final ProgressableListing progressableListing2, final ProgressableListing progressableListing3) {
        f.f((Object)progressableListing, "subscribed");
        f.f((Object)progressableListing2, "moderating");
        f.f((Object)progressableListing3, "following");
        return new UserSubredditListings(progressableListing, progressableListing2, progressableListing3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserSubredditListings)) {
            return false;
        }
        final UserSubredditListings userSubredditListings = (UserSubredditListings)o;
        return f.a((Object)this.subscribed, (Object)userSubredditListings.subscribed) && f.a((Object)this.moderating, (Object)userSubredditListings.moderating) && f.a((Object)this.following, (Object)userSubredditListings.following);
    }
    
    public final ProgressableListing getFollowing() {
        return this.following;
    }
    
    public final ProgressableListing getModerating() {
        return this.moderating;
    }
    
    public final ProgressableListing getSubscribed() {
        return this.subscribed;
    }
    
    @Override
    public int hashCode() {
        return this.following.hashCode() + (this.moderating.hashCode() + this.subscribed.hashCode() * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UserSubredditListings(subscribed=");
        k.append(this.subscribed);
        k.append(", moderating=");
        k.append(this.moderating);
        k.append(", following=");
        k.append(this.following);
        k.append(')');
        return k.toString();
    }
}
