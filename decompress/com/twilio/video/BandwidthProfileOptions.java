// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class BandwidthProfileOptions
{
    private final VideoBandwidthProfileOptions videoBandwidthProfileOptions;
    
    public BandwidthProfileOptions() {
        this.videoBandwidthProfileOptions = new VideoBandwidthProfileOptions$Builder().build();
    }
    
    public BandwidthProfileOptions(final VideoBandwidthProfileOptions videoBandwidthProfileOptions) {
        Preconditions.checkNotNull((Object)videoBandwidthProfileOptions, (Object)"VideoBandwidthProfileOptions should not be null");
        this.videoBandwidthProfileOptions = videoBandwidthProfileOptions;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof BandwidthProfileOptions && this.getVideoBandwidthProfileOptions().equals((Object)((BandwidthProfileOptions)o).getVideoBandwidthProfileOptions()));
    }
    
    public VideoBandwidthProfileOptions getVideoBandwidthProfileOptions() {
        return this.videoBandwidthProfileOptions;
    }
    
    @Override
    public int hashCode() {
        return this.getVideoBandwidthProfileOptions().hashCode();
    }
}
