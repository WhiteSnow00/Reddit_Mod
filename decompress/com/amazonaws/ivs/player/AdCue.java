// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.util.Objects;

public class AdCue extends Cue
{
    public final String adUrl;
    public final String advertiserId;
    public final String clickTrackingUrl;
    public final String creativeId;
    public final long duration;
    public final String lineItemId;
    public final String orderId;
    public final int podCount;
    public final int podPosition;
    public final AdCue.AdCue$RollType rollType;
    public final String trackingUrlComplete;
    public final String trackingUrlStart;
    
    public AdCue(final long n, final long n2, final AdCue.AdCue$RollType rollType, final long duration, final String adUrl, final String advertiserId, final String creativeId, final String lineItemId, final String orderId, final String clickTrackingUrl, final String trackingUrlStart, final String trackingUrlComplete, final int podPosition, final int podCount) {
        super(n, n2);
        this.rollType = rollType;
        this.duration = duration;
        this.adUrl = adUrl;
        this.advertiserId = advertiserId;
        this.creativeId = creativeId;
        this.lineItemId = lineItemId;
        this.orderId = orderId;
        this.clickTrackingUrl = clickTrackingUrl;
        this.trackingUrlStart = trackingUrlStart;
        this.trackingUrlComplete = trackingUrlComplete;
        this.podPosition = podPosition;
        this.podCount = podCount;
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final AdCue adCue = (AdCue)o;
        if (this.rollType != adCue.rollType || this.duration != adCue.duration || !this.adUrl.equals(adCue.adUrl) || !this.advertiserId.equals(adCue.advertiserId) || !this.creativeId.equals(adCue.creativeId) || !this.lineItemId.equals(adCue.lineItemId) || !this.orderId.equals(adCue.orderId) || !this.clickTrackingUrl.equals(adCue.clickTrackingUrl) || !this.trackingUrlStart.equals(adCue.trackingUrlStart) || !this.trackingUrlComplete.equals(adCue.trackingUrlComplete) || this.podPosition != adCue.podPosition || this.podCount != adCue.podCount) {
            b = false;
        }
        return b;
    }
    
    public int hashCode() {
        return Objects.hash(super.startTime, super.endTime, this.rollType, this.duration, this.adUrl, this.advertiserId, this.creativeId, this.lineItemId, this.orderId, this.clickTrackingUrl, this.trackingUrlStart, this.trackingUrlComplete, this.podPosition, this.podCount);
    }
}
