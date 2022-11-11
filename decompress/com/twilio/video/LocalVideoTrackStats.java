// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class LocalVideoTrackStats extends LocalTrackStats
{
    public final VideoDimensions captureDimensions;
    public final int capturedFrameRate;
    public final VideoDimensions dimensions;
    public final int frameRate;
    
    public LocalVideoTrackStats(final String s, final int n, final String s2, final String s3, final double n2, final long n3, final int n4, final long n5, final VideoDimensions captureDimensions, final VideoDimensions dimensions, final int capturedFrameRate, final int frameRate) {
        super(s, n, s2, s3, n2, n3, n4, n5);
        this.captureDimensions = captureDimensions;
        this.dimensions = dimensions;
        this.frameRate = frameRate;
        this.capturedFrameRate = capturedFrameRate;
    }
}
