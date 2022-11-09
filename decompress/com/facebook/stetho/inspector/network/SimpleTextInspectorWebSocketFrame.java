// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

public class SimpleTextInspectorWebSocketFrame implements InspectorWebSocketFrame
{
    private final String mPayload;
    private final String mRequestId;
    
    public SimpleTextInspectorWebSocketFrame(final String mRequestId, final String mPayload) {
        this.mRequestId = mRequestId;
        this.mPayload = mPayload;
    }
    
    @Override
    public boolean mask() {
        return false;
    }
    
    @Override
    public int opcode() {
        return 1;
    }
    
    @Override
    public String payloadData() {
        return this.mPayload;
    }
    
    @Override
    public String requestId() {
        return this.mRequestId;
    }
}
