// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.jsonrpc;

import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcResponse;

public interface PendingRequestCallback
{
    void onResponse(final JsonRpcPeer p0, final JsonRpcResponse p1);
}
