// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public interface VideoCapturer extends tvi.webrtc.VideoCapturer
{
    default void changeCaptureFormat(final int n, final int n2, final int n3) {
    }
    
    default void dispose() {
    }
    
    default VideoFormat getCaptureFormat() {
        return new VideoFormat(VideoDimensions.VGA_VIDEO_DIMENSIONS, 30);
    }
}
