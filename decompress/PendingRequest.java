// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.jsonrpc;

public class PendingRequest
{
    public final PendingRequestCallback callback;
    public final long requestId;
    
    public PendingRequest(final long requestId, final PendingRequestCallback callback) {
        this.requestId = requestId;
        this.callback = callback;
    }
}
