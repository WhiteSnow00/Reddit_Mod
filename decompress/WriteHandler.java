// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.websocket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedOutputStream;

class WriteHandler
{
    private final BufferedOutputStream mBufferedOutput;
    
    public WriteHandler(final OutputStream outputStream) {
        this.mBufferedOutput = new BufferedOutputStream(outputStream, 1024);
    }
    
    public void write(final Frame frame, final WriteCallback writeCallback) {
        monitorenter(this);
        try {
            try {
                frame.writeTo(this.mBufferedOutput);
                this.mBufferedOutput.flush();
                writeCallback.onSuccess();
            }
            finally {}
        }
        catch (final IOException ex) {
            writeCallback.onFailure(ex);
        }
        monitorexit(this);
        return;
        monitorexit(this);
    }
}
