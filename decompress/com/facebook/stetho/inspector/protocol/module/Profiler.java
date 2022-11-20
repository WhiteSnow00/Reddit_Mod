// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.List;
import java.util.Collections;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Profiler implements ChromeDevtoolsDomain
{
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getProfileHeaders(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final ProfileHeaderResponse profileHeaderResponse = new ProfileHeaderResponse(null);
        profileHeaderResponse.headers = Collections.emptyList();
        return (JsonRpcResult)profileHeaderResponse;
    }
    
    @ChromeDevtoolsMethod
    public void setSamplingInterval(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    public static class ProfileHeaderResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<Profiler$ProfileHeader> headers;
        
        private ProfileHeaderResponse() {
        }
        
        public ProfileHeaderResponse(final Profiler$1 profiler$1) {
            this();
        }
    }
}
