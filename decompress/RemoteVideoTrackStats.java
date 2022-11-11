// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class RemoteVideoTrackStats extends RemoteTrackStats
{
    public final VideoDimensions dimensions;
    public final int frameRate;
    
    public RemoteVideoTrackStats(final String s, final int n, final String s2, final String s3, final double n2, final long n3, final int n4, final VideoDimensions dimensions, final int frameRate) {
        super(s, n, s2, s3, n2, n3, n4);
        this.dimensions = dimensions;
        this.frameRate = frameRate;
    }
}
