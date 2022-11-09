// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import android.net.LocalSocket;

public class SocketLike
{
    private final LeakyBufferedInputStream mLeakyInput;
    private final LocalSocket mSocket;
    
    public SocketLike(final LocalSocket mSocket, final LeakyBufferedInputStream mLeakyInput) {
        this.mSocket = mSocket;
        this.mLeakyInput = mLeakyInput;
    }
    
    public SocketLike(final SocketLike socketLike, final LeakyBufferedInputStream leakyBufferedInputStream) {
        this(socketLike.mSocket, leakyBufferedInputStream);
    }
    
    public InputStream getInput() throws IOException {
        return this.mLeakyInput.leakBufferAndStream();
    }
    
    public OutputStream getOutput() throws IOException {
        return this.mSocket.getOutputStream();
    }
}
