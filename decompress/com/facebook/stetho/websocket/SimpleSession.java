// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.websocket;

public interface SimpleSession
{
    void close(final int p0, final String p1);
    
    boolean isOpen();
    
    void sendBinary(final byte[] p0);
    
    void sendText(final String p0);
}
