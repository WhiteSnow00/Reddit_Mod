// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Inspector implements ChromeDevtoolsDomain
{
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
}
