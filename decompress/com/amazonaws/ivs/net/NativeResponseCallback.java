// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

class NativeResponseCallback implements ResponseCallback
{
    private final long ptr;
    
    public NativeResponseCallback(final long ptr) {
        this.ptr = ptr;
    }
    
    private native void onError(final long p0, final Exception p1);
    
    private native void onResponse(final long p0, final Response p1);
    
    public void onError(final Exception ex) {
        this.onError(this.ptr, ex);
    }
    
    public void onResponse(final Response response) {
        this.onResponse(this.ptr, response);
    }
}
