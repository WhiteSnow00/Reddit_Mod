// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public interface AudioDeviceRenderer
{
    AudioFormat getRendererFormat();
    
    boolean onInitRenderer();
    
    boolean onStartRendering(final AudioDeviceContext p0);
    
    boolean onStopRendering();
}
