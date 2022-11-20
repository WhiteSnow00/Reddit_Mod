// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public abstract class LocalTrackStats extends BaseTrackStats
{
    public final long bytesSent;
    public final int packetsSent;
    public final long roundTripTime;
    
    public LocalTrackStats(final String s, final int n, final String s2, final String s3, final double n2, final long bytesSent, final int packetsSent, final long roundTripTime) {
        super(s, n, s2, s3, n2);
        this.bytesSent = bytesSent;
        this.packetsSent = packetsSent;
        this.roundTripTime = roundTripTime;
    }
}
