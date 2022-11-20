// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.List;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import java.util.Collections;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class HeapProfiler implements ChromeDevtoolsDomain
{
    @ChromeDevtoolsMethod
    public JsonRpcResult getProfileHeaders(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final ProfileHeaderResponse profileHeaderResponse = new ProfileHeaderResponse(null);
        profileHeaderResponse.headers = Collections.emptyList();
        return (JsonRpcResult)profileHeaderResponse;
    }
    
    public static class ProfileHeaderResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<HeapProfiler$ProfileHeader> headers;
        
        private ProfileHeaderResponse() {
        }
        
        public ProfileHeaderResponse(final HeapProfiler$1 heapProfiler$1) {
            this();
        }
    }
}
