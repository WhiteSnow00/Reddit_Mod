// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class SubscribeInfo
{
    @c(LIZ = "enable_subscription")
    public boolean anchorEnableSubscription;
    @c(LIZ = "qualification")
    public boolean isAnchorQualified;
    @c(LIZ = "is_in_grace_period")
    public boolean isInGracePeriod;
    @c(LIZ = "is_subscribe")
    public boolean isSubscribed;
    @c(LIZ = "is_subscribed_to_anchor")
    public boolean isSubscribedToCurrentAnchor;
    @c(LIZ = "badge")
    public SubscribeBadge subscribeBadge;
    @c(LIZ = "subscriber_count")
    public int subscriberCount;
    
    static {
        Covode.recordClassIndex(4973);
    }
    
    public SubscribeBadge getSubscribeBadge() {
        return this.subscribeBadge;
    }
    
    public int getSubscriberCount() {
        return this.subscriberCount;
    }
    
    public boolean isAnchorQualified() {
        return this.isAnchorQualified;
    }
    
    public boolean isInGracePeriod() {
        return this.isInGracePeriod;
    }
    
    public boolean isSubscribed() {
        return this.isSubscribed;
    }
    
    public boolean isSubscribedToCurrentAnchor() {
        return this.isSubscribedToCurrentAnchor;
    }
    
    public void setAnchorQualified(final boolean isAnchorQualified) {
        this.isAnchorQualified = isAnchorQualified;
    }
    
    public void setInGracePeriod(final boolean isInGracePeriod) {
        this.isInGracePeriod = isInGracePeriod;
    }
    
    public void setSubscribeBadge(final SubscribeBadge subscribeBadge) {
        this.subscribeBadge = subscribeBadge;
    }
    
    public void setSubscribed(final boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }
    
    public void setSubscribedToCurrentAnchor(final boolean isSubscribedToCurrentAnchor) {
        this.isSubscribedToCurrentAnchor = isSubscribedToCurrentAnchor;
    }
    
    public void setSubscriberCount(final int subscriberCount) {
        this.subscriberCount = subscriberCount;
    }
}
