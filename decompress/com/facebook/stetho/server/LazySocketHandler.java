// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server;

import java.io.IOException;
import android.net.LocalSocket;

public class LazySocketHandler implements SocketHandler
{
    private SocketHandler mSocketHandler;
    private final SocketHandlerFactory mSocketHandlerFactory;
    
    public LazySocketHandler(final SocketHandlerFactory mSocketHandlerFactory) {
        this.mSocketHandlerFactory = mSocketHandlerFactory;
    }
    
    private SocketHandler getSocketHandler() {
        synchronized (this) {
            if (this.mSocketHandler == null) {
                this.mSocketHandler = this.mSocketHandlerFactory.create();
            }
            return this.mSocketHandler;
        }
    }
    
    public void onAccepted(final LocalSocket localSocket) throws IOException {
        this.getSocketHandler().onAccepted(localSocket);
    }
}
