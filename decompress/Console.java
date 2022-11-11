// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.json.annotation.JsonValue;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.console.ConsolePeerManager;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Console implements ChromeDevtoolsDomain
{
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        ConsolePeerManager.getOrCreateInstance().removePeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        ConsolePeerManager.getOrCreateInstance().addPeer(jsonRpcPeer);
    }
    
    public static class CallFrame
    {
        @JsonProperty(required = true)
        public int columnNumber;
        @JsonProperty(required = true)
        public String functionName;
        @JsonProperty(required = true)
        public int lineNumber;
        @JsonProperty(required = true)
        public String url;
        
        public CallFrame() {
        }
        
        public CallFrame(final String functionName, final String url, final int lineNumber, final int columnNumber) {
            this.functionName = functionName;
            this.url = url;
            this.lineNumber = lineNumber;
            this.columnNumber = columnNumber;
        }
    }
    
    public static class ConsoleMessage
    {
        @JsonProperty(required = true)
        public MessageLevel level;
        @JsonProperty(required = true)
        public MessageSource source;
        @JsonProperty(required = true)
        public String text;
    }
    
    public static class MessageAddedRequest
    {
        @JsonProperty(required = true)
        public ConsoleMessage message;
    }
    
    public enum MessageLevel
    {
        DEBUG("debug"), 
        ERROR("error"), 
        LOG("log"), 
        WARNING("warning");
        
        private final String mProtocolValue;
        
        private MessageLevel(final String mProtocolValue) {
            this.mProtocolValue = mProtocolValue;
        }
        
        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }
    
    public enum MessageSource
    {
        APPCACHE("appcache"), 
        CONSOLE_API("console-api"), 
        CSS("css"), 
        JAVASCRIPT("javascript"), 
        NETWORK("network"), 
        OTHER("other"), 
        RENDERING("rendering"), 
        SECURITY("security"), 
        STORAGE("storage"), 
        XML("xml");
        
        private final String mProtocolValue;
        
        private MessageSource(final String mProtocolValue) {
            this.mProtocolValue = mProtocolValue;
        }
        
        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }
}
