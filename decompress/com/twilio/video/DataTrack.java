// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public abstract class DataTrack implements Track
{
    private final boolean enabled;
    private final int maxPacketLifeTime;
    private final int maxRetransmits;
    private final String name;
    private final boolean ordered;
    private final boolean reliable;
    
    public DataTrack(final boolean enabled, final boolean ordered, final boolean reliable, final int maxPacketLifeTime, final int maxRetransmits, final String name) {
        this.enabled = enabled;
        this.ordered = ordered;
        this.reliable = reliable;
        this.maxPacketLifeTime = maxPacketLifeTime;
        this.maxRetransmits = maxRetransmits;
        this.name = name;
    }
    
    public int getMaxPacketLifeTime() {
        return this.maxPacketLifeTime;
    }
    
    public int getMaxRetransmits() {
        return this.maxRetransmits;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
    
    public boolean isOrdered() {
        return this.ordered;
    }
    
    public boolean isReliable() {
        return this.reliable;
    }
}
