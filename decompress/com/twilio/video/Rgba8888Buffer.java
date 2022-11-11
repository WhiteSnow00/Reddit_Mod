// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import tvi.webrtc.VideoFrame$I420Buffer;
import tvi.webrtc.JavaI420Buffer;
import java.nio.ByteBuffer;
import tvi.webrtc.VideoFrame$Buffer;

public class Rgba8888Buffer implements VideoFrame$Buffer
{
    private final ByteBuffer data;
    private final int height;
    private final int width;
    
    public Rgba8888Buffer(final ByteBuffer data, final int width, final int height) {
        this.data = data;
        this.width = width;
        this.height = height;
    }
    
    private static native void nativeCropAndScale(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final byte[] p6, final int p7, final int p8, final ByteBuffer p9, final int p10, final ByteBuffer p11, final int p12, final ByteBuffer p13, final int p14);
    
    public VideoFrame$Buffer cropAndScale(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final JavaI420Buffer allocate = JavaI420Buffer.allocate(n5, n6);
        nativeCropAndScale(n, n2, n3, n4, n5, n6, this.data.array(), this.width, this.height, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return (VideoFrame$Buffer)allocate;
    }
    
    public ByteBuffer getData() {
        return this.data;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public void release() {
    }
    
    public void retain() {
    }
    
    public VideoFrame$I420Buffer toI420() {
        final int width = this.width;
        final int height = this.height;
        return (VideoFrame$I420Buffer)this.cropAndScale(0, 0, width, height, width, height);
    }
}
