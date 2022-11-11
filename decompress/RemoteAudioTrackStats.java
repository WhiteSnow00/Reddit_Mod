// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class RemoteAudioTrackStats extends RemoteTrackStats
{
    public final int audioLevel;
    public final int jitter;
    
    public RemoteAudioTrackStats(final String s, final int n, final String s2, final String s3, final double n2, final long n3, final int n4, final int audioLevel, final int jitter) {
        super(s, n, s2, s3, n2, n3, n4);
        this.audioLevel = audioLevel;
        this.jitter = jitter;
    }
}
