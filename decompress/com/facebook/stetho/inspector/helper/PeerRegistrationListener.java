// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;

public interface PeerRegistrationListener
{
    void onPeerRegistered(final JsonRpcPeer p0);
    
    void onPeerUnregistered(final JsonRpcPeer p0);
}
