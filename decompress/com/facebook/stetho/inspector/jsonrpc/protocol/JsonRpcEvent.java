// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.jsonrpc.protocol;

import org.json.JSONObject;
import com.facebook.stetho.json.annotation.JsonProperty;

public class JsonRpcEvent
{
    @JsonProperty(required = true)
    public String method;
    @JsonProperty
    public JSONObject params;
    
    public JsonRpcEvent() {
    }
    
    public JsonRpcEvent(final String method, final JSONObject params) {
        this.method = method;
        this.params = params;
    }
}
