// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.io.IOException;

public interface ResponseHandler
{
    void onEOF();
    
    void onError(final IOException p0);
    
    void onRead(final int p0);
    
    void onReadDecoded(final int p0);
}
