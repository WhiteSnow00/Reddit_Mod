// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.network.AsyncPrettyPrinterInitializer;
import org.json.JSONException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.io.IOException;
import com.facebook.stetho.inspector.network.ResponseBodyData;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode;
import android.content.Context;
import com.facebook.stetho.inspector.network.ResponseBodyFileManager;
import com.facebook.stetho.inspector.network.NetworkPeerManager;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Network implements ChromeDevtoolsDomain
{
    private final NetworkPeerManager mNetworkPeerManager;
    private final ResponseBodyFileManager mResponseBodyFileManager;
    
    public Network(final Context context) {
        final NetworkPeerManager orCreateInstance = NetworkPeerManager.getOrCreateInstance(context);
        this.mNetworkPeerManager = orCreateInstance;
        this.mResponseBodyFileManager = orCreateInstance.getResponseBodyFileManager();
    }
    
    private GetResponseBodyResponse readResponseBody(final String s) throws IOException, JsonRpcException {
        final GetResponseBodyResponse getResponseBodyResponse = new GetResponseBodyResponse(null);
        try {
            final ResponseBodyData file = this.mResponseBodyFileManager.readFile(s);
            getResponseBodyResponse.body = file.data;
            getResponseBodyResponse.base64Encoded = file.base64Encoded;
            return getResponseBodyResponse;
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError$ErrorCode.INTERNAL_ERROR, outOfMemoryError.toString(), (JSONObject)null));
        }
    }
    
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        ((ChromePeerManager)this.mNetworkPeerManager).removePeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        ((ChromePeerManager)this.mNetworkPeerManager).addPeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getResponseBody(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JsonRpcException {
        try {
            return (JsonRpcResult)this.readResponseBody(jsonObject.getString("requestId"));
        }
        catch (final JSONException ex) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError$ErrorCode.INTERNAL_ERROR, ex.toString(), (JSONObject)null));
        }
        catch (final IOException ex2) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError$ErrorCode.INTERNAL_ERROR, ex2.toString(), (JSONObject)null));
        }
    }
    
    public void setPrettyPrinterInitializer(final AsyncPrettyPrinterInitializer prettyPrinterInitializer) {
        Util.throwIfNull((Object)prettyPrinterInitializer);
        this.mNetworkPeerManager.setPrettyPrinterInitializer(prettyPrinterInitializer);
    }
    
    @ChromeDevtoolsMethod
    public void setUserAgentOverride(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    public static class GetResponseBodyResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public boolean base64Encoded;
        @JsonProperty(required = true)
        public String body;
        
        private GetResponseBodyResponse() {
        }
        
        public GetResponseBodyResponse(final Network$1 network$1) {
            this();
        }
    }
}
