// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import java.nio.ByteBuffer;

class NativeReadCallback implements ReadCallback
{
    private final long ptr;
    
    public NativeReadCallback(final long ptr) {
        this.ptr = ptr;
    }
    
    private native int getTimeout(final long p0);
    
    private native boolean onBuffer(final long p0, final ByteBuffer p1, final int p2, final boolean p3);
    
    private native void onError(final long p0, final Exception p1);
    
    public int getTimeout() {
        return this.getTimeout(this.ptr);
    }
    
    public boolean onBuffer(final ByteBuffer byteBuffer, final int n, final boolean b) {
        return this.onBuffer(this.ptr, byteBuffer, n, b);
    }
    
    public void onError(final Exception ex) {
        this.onError(this.ptr, ex);
    }
}
