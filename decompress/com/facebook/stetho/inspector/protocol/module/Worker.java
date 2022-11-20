// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Worker implements ChromeDevtoolsDomain
{
    @ChromeDevtoolsMethod
    public JsonRpcResult canInspectWorkers(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        return (JsonRpcResult)new SimpleBooleanResult(true);
    }
}
