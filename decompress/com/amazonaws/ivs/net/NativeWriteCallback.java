// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import java.nio.ByteBuffer;

class NativeWriteCallback implements WriteCallback
{
    private final long ptr;
    
    public NativeWriteCallback(final long ptr) {
        this.ptr = ptr;
    }
    
    private native void onBuffer(final long p0, final ByteBuffer p1, final int p2);
    
    public void onBuffer(final ByteBuffer byteBuffer, final int n) {
        this.onBuffer(this.ptr, byteBuffer, n);
    }
    
    public void onError(final Exception ex) {
        ex.printStackTrace();
    }
}
