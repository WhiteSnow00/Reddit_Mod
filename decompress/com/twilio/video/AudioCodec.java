// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public abstract class AudioCodec
{
    private final String name;
    
    public AudioCodec(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
