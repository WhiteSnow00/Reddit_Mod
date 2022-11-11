// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class FollowInfo
{
    @c(LIZ = "follow_status")
    public long followStatus;
    @c(LIZ = "follower_count")
    public long followerCount;
    @c(LIZ = "following_count")
    public long followingCount;
    @c(LIZ = "push_status")
    public long pushStatus;
    
    static {
        Covode.recordClassIndex(4967);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final FollowInfo followInfo = (FollowInfo)o;
            if (this.followingCount != followInfo.followingCount) {
                return false;
            }
            if (this.followerCount != followInfo.followerCount) {
                return false;
            }
            if (this.followStatus == followInfo.followStatus) {
                return true;
            }
        }
        return false;
    }
    
    public long getFollowStatus() {
        return this.followStatus;
    }
    
    public long getFollowerCount() {
        return this.followerCount;
    }
    
    public long getFollowingCount() {
        return this.followingCount;
    }
    
    public long getPushStatus() {
        return this.pushStatus;
    }
    
    @Override
    public int hashCode() {
        final long followingCount = this.followingCount;
        final int n = (int)(followingCount ^ followingCount >>> 32);
        final long followerCount = this.followerCount;
        final int n2 = (int)(followerCount ^ followerCount >>> 32);
        final long followStatus = this.followStatus;
        return (n * 31 + n2) * 31 + (int)(followStatus ^ followStatus >>> 32);
    }
    
    public void setFollowStatus(final long followStatus) {
        this.followStatus = followStatus;
    }
    
    public void setFollowerCount(final long followerCount) {
        this.followerCount = followerCount;
    }
    
    public void setFollowingCount(final long followingCount) {
        this.followingCount = followingCount;
    }
    
    public void setPushStatus(final long pushStatus) {
        this.pushStatus = pushStatus;
    }
}
