// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/FollowersPage;", "", "followers", "", "Lcom/reddit/domain/model/FollowerModel;", "nextCursor", "", "(Ljava/util/List;Ljava/lang/String;)V", "getFollowers", "()Ljava/util/List;", "getNextCursor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class FollowersPage
{
    private final List<FollowerModel> followers;
    private final String nextCursor;
    
    public FollowersPage(final List<FollowerModel> followers, final String nextCursor) {
        f.f((Object)followers, "followers");
        this.followers = followers;
        this.nextCursor = nextCursor;
    }
    
    public final List<FollowerModel> component1() {
        return this.followers;
    }
    
    public final String component2() {
        return this.nextCursor;
    }
    
    public final FollowersPage copy(final List<FollowerModel> list, final String s) {
        f.f((Object)list, "followers");
        return new FollowersPage(list, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FollowersPage)) {
            return false;
        }
        final FollowersPage followersPage = (FollowersPage)o;
        return f.a((Object)this.followers, (Object)followersPage.followers) && f.a((Object)this.nextCursor, (Object)followersPage.nextCursor);
    }
    
    public final List<FollowerModel> getFollowers() {
        return this.followers;
    }
    
    public final String getNextCursor() {
        return this.nextCursor;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.followers.hashCode();
        final String nextCursor = this.nextCursor;
        int hashCode2;
        if (nextCursor == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = nextCursor.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("FollowersPage(followers=");
        k.append(this.followers);
        k.append(", nextCursor=");
        return b.k(k, this.nextCursor, ')');
    }
}
