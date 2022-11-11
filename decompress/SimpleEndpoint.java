// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.websocket;

public interface SimpleEndpoint
{
    void onClose(final SimpleSession p0, final int p1, final String p2);
    
    void onError(final SimpleSession p0, final Throwable p1);
    
    void onMessage(final SimpleSession p0, final String p1);
    
    void onMessage(final SimpleSession p0, final byte[] p1, final int p2);
    
    void onOpen(final SimpleSession p0);
}
