// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.websocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.BufferedInputStream;

class ReadHandler
{
    private final BufferedInputStream mBufferedInput;
    private final ByteArrayOutputStream mCurrentPayload;
    private final SimpleEndpoint mEndpoint;
    
    public ReadHandler(final InputStream inputStream, final SimpleEndpoint mEndpoint) {
        this.mCurrentPayload = new ByteArrayOutputStream();
        this.mBufferedInput = new BufferedInputStream(inputStream, 1024);
        this.mEndpoint = mEndpoint;
    }
    
    public void readLoop(final ReadCallback readCallback) throws IOException {
        final Frame frame = new Frame();
        do {
            frame.readFrom(this.mBufferedInput);
            this.mCurrentPayload.write(frame.payloadData, 0, (int)frame.payloadLen);
            if (frame.fin) {
                final byte[] byteArray = this.mCurrentPayload.toByteArray();
                readCallback.onCompleteFrame(frame.opcode, byteArray, byteArray.length);
                this.mCurrentPayload.reset();
            }
        } while (frame.opcode != 8);
    }
}
