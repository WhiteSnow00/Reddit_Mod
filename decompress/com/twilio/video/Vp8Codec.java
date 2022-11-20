// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class Vp8Codec extends VideoCodec
{
    public static final String NAME = "VP8";
    public final boolean simulcast;
    
    public Vp8Codec() {
        this(false);
    }
    
    public Vp8Codec(final boolean simulcast) {
        super("VP8");
        this.simulcast = simulcast;
    }
}
