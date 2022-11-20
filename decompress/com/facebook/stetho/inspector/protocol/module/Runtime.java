// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import java.util.List;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import org.json.JSONObject;
import org.json.JSONException;
import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.runtime.RhinoDetectingRuntimeReplFactory;
import android.content.Context;
import com.facebook.stetho.inspector.console.RuntimeRepl;
import java.util.Collections;
import java.util.HashMap;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Map;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Runtime implements ChromeDevtoolsDomain
{
    private static final Map<JsonRpcPeer, Runtime.Runtime$Session> sSessions;
    private final ObjectMapper mObjectMapper;
    private final RuntimeReplFactory mReplFactory;
    
    static {
        sSessions = Collections.synchronizedMap(new HashMap<JsonRpcPeer, Runtime.Runtime$Session>());
    }
    
    @Deprecated
    public Runtime() {
        this((RuntimeReplFactory)new RuntimeReplFactory() {
            public RuntimeRepl newInstance() {
                return (RuntimeRepl)new RuntimeRepl(this) {
                    public final Runtime$1 this$1;
                    
                    public Object evaluate(final String s) throws Throwable {
                        return "Not supported with legacy Runtime module";
                    }
                };
            }
        });
    }
    
    public Runtime(final Context context) {
        this((RuntimeReplFactory)new RhinoDetectingRuntimeReplFactory(context));
    }
    
    public Runtime(final RuntimeReplFactory mReplFactory) {
        this.mObjectMapper = new ObjectMapper();
        this.mReplFactory = mReplFactory;
    }
    
    public static Map access$100() {
        return Runtime.sSessions;
    }
    
    public static String access$300(final Object o) {
        return getPropertyClassName(o);
    }
    
    private static String getPropertyClassName(final Object o) {
        String s;
        if ((s = o.getClass().getSimpleName()).length() == 0) {
            s = o.getClass().getName();
        }
        return s;
    }
    
    private static Runtime.Runtime$Session getSession(final JsonRpcPeer jsonRpcPeer) {
        synchronized (Runtime.class) {
            final Map<JsonRpcPeer, Runtime.Runtime$Session> sSessions = Runtime.sSessions;
            Runtime.Runtime$Session runtime$Session;
            if ((runtime$Session = sSessions.get(jsonRpcPeer)) == null) {
                runtime$Session = new Runtime.Runtime$Session((Runtime$1)null);
                sSessions.put(jsonRpcPeer, runtime$Session);
                jsonRpcPeer.registerDisconnectReceiver((DisconnectReceiver)new DisconnectReceiver(jsonRpcPeer) {
                    public final JsonRpcPeer val$peer;
                    
                    public void onDisconnect() {
                        Runtime.access$100().remove(this.val$peer);
                    }
                });
            }
            return runtime$Session;
        }
    }
    
    public static int mapObject(final JsonRpcPeer jsonRpcPeer, final Object o) {
        return getSession(jsonRpcPeer).getObjects().putObject(o);
    }
    
    public static void releaseObject(final JsonRpcPeer jsonRpcPeer, final Integer n) throws JSONException {
        getSession(jsonRpcPeer).getObjects().removeObjectById((int)n);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult callFunctionOn(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JsonRpcException {
        final Runtime.Runtime$CallFunctionOnRequest runtime$CallFunctionOnRequest = (Runtime.Runtime$CallFunctionOnRequest)this.mObjectMapper.convertValue((Object)jsonObject, (Class)Runtime.Runtime$CallFunctionOnRequest.class);
        final Runtime.Runtime$Session session = getSession(jsonRpcPeer);
        final Object objectOrThrow = session.getObjectOrThrow(runtime$CallFunctionOnRequest.objectId);
        if (runtime$CallFunctionOnRequest.functionDeclaration.startsWith("function protoList(")) {
            final Runtime.Runtime$ObjectProtoContainer runtime$ObjectProtoContainer = new Runtime.Runtime$ObjectProtoContainer(objectOrThrow);
            final Runtime$RemoteObject result = new Runtime$RemoteObject();
            result.type = Runtime.Runtime$ObjectType.OBJECT;
            result.subtype = Runtime.Runtime$ObjectSubType.NODE;
            result.className = objectOrThrow.getClass().getName();
            result.description = getPropertyClassName(objectOrThrow);
            result.objectId = String.valueOf(session.getObjects().putObject((Object)runtime$ObjectProtoContainer));
            final CallFunctionOnResponse callFunctionOnResponse = new CallFunctionOnResponse(null);
            callFunctionOnResponse.result = result;
            callFunctionOnResponse.wasThrown = Boolean.FALSE;
            return (JsonRpcResult)callFunctionOnResponse;
        }
        final JsonRpcError$ErrorCode internal_ERROR = JsonRpcError$ErrorCode.INTERNAL_ERROR;
        final StringBuilder t = a.t("Expected protoList, got: ");
        t.append(runtime$CallFunctionOnRequest.functionDeclaration);
        throw new JsonRpcException(new JsonRpcError(internal_ERROR, t.toString(), (JSONObject)null));
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult evaluate(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        return (JsonRpcResult)getSession(jsonRpcPeer).evaluate(this.mReplFactory, jsonObject);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getProperties(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JsonRpcException {
        return (JsonRpcResult)getSession(jsonRpcPeer).getProperties(jsonObject);
    }
    
    @ChromeDevtoolsMethod
    public void releaseObject(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JSONException {
        getSession(jsonRpcPeer).getObjects().removeObjectById(Integer.parseInt(jsonObject.getString("objectId")));
    }
    
    @ChromeDevtoolsMethod
    public void releaseObjectGroup(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Ignoring request to releaseObjectGroup: ");
        sb.append(jsonObject);
        LogUtil.w(sb.toString());
    }
    
    public static class CallFunctionOnResponse implements JsonRpcResult
    {
        @JsonProperty
        public Runtime$RemoteObject result;
        @JsonProperty(required = false)
        public Boolean wasThrown;
        
        private CallFunctionOnResponse() {
        }
        
        public CallFunctionOnResponse(final Runtime$1 runtimeReplFactory) {
            this();
        }
    }
    
    public static class EvaluateRequest implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public String expression;
        @JsonProperty(required = true)
        public String objectGroup;
        
        private EvaluateRequest() {
        }
    }
    
    public static class EvaluateResponse implements JsonRpcResult
    {
        @JsonProperty
        public Runtime$ExceptionDetails exceptionDetails;
        @JsonProperty(required = true)
        public Runtime$RemoteObject result;
        @JsonProperty(required = true)
        public boolean wasThrown;
        
        private EvaluateResponse() {
        }
        
        public EvaluateResponse(final Runtime$1 runtimeReplFactory) {
            this();
        }
    }
    
    public static class GetPropertiesRequest implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public String objectId;
        @JsonProperty(required = true)
        public boolean ownProperties;
        
        private GetPropertiesRequest() {
        }
    }
    
    public static class GetPropertiesResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<Runtime$PropertyDescriptor> result;
        
        private GetPropertiesResponse() {
        }
        
        public GetPropertiesResponse(final Runtime$1 runtimeReplFactory) {
            this();
        }
    }
}
