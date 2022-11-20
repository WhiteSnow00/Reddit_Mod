// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class OpusCodec extends AudioCodec
{
    public static final String NAME = "opus";
    private final boolean useDtx;
    
    public OpusCodec() {
        this(true);
    }
    
    public OpusCodec(final boolean useDtx) {
        super("opus");
        this.useDtx = useDtx;
    }
    
    public boolean isDtxEnabled() {
        return this.useDtx;
    }
}
