// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public abstract class RemoteTrackStats extends BaseTrackStats
{
    public final long bytesReceived;
    public final int packetsReceived;
    
    public RemoteTrackStats(final String s, final int n, final String s2, final String s3, final double n2, final long bytesReceived, final int packetsReceived) {
        super(s, n, s2, s3, n2);
        this.bytesReceived = bytesReceived;
        this.packetsReceived = packetsReceived;
    }
}
