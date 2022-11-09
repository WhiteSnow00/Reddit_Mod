// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.io.UnsupportedEncodingException;

public class SimpleBinaryInspectorWebSocketFrame implements InspectorWebSocketFrame
{
    private final byte[] mPayload;
    private final String mRequestId;
    
    public SimpleBinaryInspectorWebSocketFrame(final String mRequestId, final byte[] mPayload) {
        this.mRequestId = mRequestId;
        this.mPayload = mPayload;
    }
    
    @Override
    public boolean mask() {
        return false;
    }
    
    @Override
    public int opcode() {
        return 2;
    }
    
    @Override
    public String payloadData() {
        try {
            return new String(this.mPayload, "UTF-8");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    @Override
    public String requestId() {
        return this.mRequestId;
    }
}
