// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

class DrmListener implements DrmSession$Listener
{
    private final long ptr;
    
    public DrmListener(final long ptr) {
        this.ptr = ptr;
    }
    
    private native void onError(final long p0, final String p1);
    
    private native void onKeyExpired(final long p0);
    
    private native void onKeyRequested(final long p0);
    
    private native void onProvisionRequested(final long p0);
    
    public void onError(final String s) {
        this.onError(this.ptr, s);
    }
    
    public void onKeyExpired() {
        this.onKeyExpired(this.ptr);
    }
    
    public void onKeyRequested() {
        this.onKeyRequested(this.ptr);
    }
    
    public void onProvisionRequested() {
        this.onProvisionRequested(this.ptr);
    }
}
