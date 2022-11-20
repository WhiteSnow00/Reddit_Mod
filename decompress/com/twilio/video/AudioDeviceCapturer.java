// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public interface AudioDeviceCapturer
{
    AudioFormat getCapturerFormat();
    
    boolean onInitCapturer();
    
    boolean onStartCapturing(final AudioDeviceContext p0);
    
    boolean onStopCapturing();
}
