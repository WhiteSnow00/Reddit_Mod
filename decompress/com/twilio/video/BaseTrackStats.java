// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public abstract class BaseTrackStats
{
    public final String codec;
    public final int packetsLost;
    public final String ssrc;
    public final double timestamp;
    public final String trackSid;
    
    public BaseTrackStats(final String trackSid, final int packetsLost, final String codec, final String ssrc, final double timestamp) {
        this.trackSid = trackSid;
        this.packetsLost = packetsLost;
        this.codec = codec;
        this.ssrc = ssrc;
        this.timestamp = timestamp;
    }
}
