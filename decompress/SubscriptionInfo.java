// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003JI\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/streaming/SubscriptionInfo;", "", "isSubscribedToSubreddit", "", "isFollowingUser", "isNsfw", "isDefault", "snoovatarUrl", "", "iconUrl", "(ZZZZLjava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "()Z", "getSnoovatarUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubscriptionInfo
{
    private final String iconUrl;
    private final boolean isDefault;
    private final boolean isFollowingUser;
    private final boolean isNsfw;
    private final boolean isSubscribedToSubreddit;
    private final String snoovatarUrl;
    
    public SubscriptionInfo(final boolean isSubscribedToSubreddit, final boolean isFollowingUser, final boolean isNsfw, final boolean isDefault, final String snoovatarUrl, final String iconUrl) {
        this.isSubscribedToSubreddit = isSubscribedToSubreddit;
        this.isFollowingUser = isFollowingUser;
        this.isNsfw = isNsfw;
        this.isDefault = isDefault;
        this.snoovatarUrl = snoovatarUrl;
        this.iconUrl = iconUrl;
    }
    
    public final boolean component1() {
        return this.isSubscribedToSubreddit;
    }
    
    public final boolean component2() {
        return this.isFollowingUser;
    }
    
    public final boolean component3() {
        return this.isNsfw;
    }
    
    public final boolean component4() {
        return this.isDefault;
    }
    
    public final String component5() {
        return this.snoovatarUrl;
    }
    
    public final String component6() {
        return this.iconUrl;
    }
    
    public final SubscriptionInfo copy(final boolean b, final boolean b2, final boolean b3, final boolean b4, final String s, final String s2) {
        return new SubscriptionInfo(b, b2, b3, b4, s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionInfo)) {
            return false;
        }
        final SubscriptionInfo subscriptionInfo = (SubscriptionInfo)o;
        return this.isSubscribedToSubreddit == subscriptionInfo.isSubscribedToSubreddit && this.isFollowingUser == subscriptionInfo.isFollowingUser && this.isNsfw == subscriptionInfo.isNsfw && this.isDefault == subscriptionInfo.isDefault && f.a((Object)this.snoovatarUrl, (Object)subscriptionInfo.snoovatarUrl) && f.a((Object)this.iconUrl, (Object)subscriptionInfo.iconUrl);
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getSnoovatarUrl() {
        return this.snoovatarUrl;
    }
    
    @Override
    public int hashCode() {
        final int isSubscribedToSubreddit = this.isSubscribedToSubreddit ? 1 : 0;
        int n = 1;
        int n2 = isSubscribedToSubreddit;
        if (isSubscribedToSubreddit != 0) {
            n2 = 1;
        }
        int isFollowingUser;
        if ((isFollowingUser = (this.isFollowingUser ? 1 : 0)) != 0) {
            isFollowingUser = 1;
        }
        int isNsfw;
        if ((isNsfw = (this.isNsfw ? 1 : 0)) != 0) {
            isNsfw = 1;
        }
        final int isDefault = this.isDefault ? 1 : 0;
        if (isDefault == 0) {
            n = isDefault;
        }
        final String snoovatarUrl = this.snoovatarUrl;
        int hashCode = 0;
        int hashCode2;
        if (snoovatarUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = snoovatarUrl.hashCode();
        }
        final String iconUrl = this.iconUrl;
        if (iconUrl != null) {
            hashCode = iconUrl.hashCode();
        }
        return ((((n2 * 31 + isFollowingUser) * 31 + isNsfw) * 31 + n) * 31 + hashCode2) * 31 + hashCode;
    }
    
    public final boolean isDefault() {
        return this.isDefault;
    }
    
    public final boolean isFollowingUser() {
        return this.isFollowingUser;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
    
    public final boolean isSubscribedToSubreddit() {
        return this.isSubscribedToSubreddit;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubscriptionInfo(isSubscribedToSubreddit=");
        k.append(this.isSubscribedToSubreddit);
        k.append(", isFollowingUser=");
        k.append(this.isFollowingUser);
        k.append(", isNsfw=");
        k.append(this.isNsfw);
        k.append(", isDefault=");
        k.append(this.isDefault);
        k.append(", snoovatarUrl=");
        k.append(this.snoovatarUrl);
        k.append(", iconUrl=");
        return b.k(k, this.iconUrl, ')');
    }
}
