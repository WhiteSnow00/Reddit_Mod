// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.jsonrpc;

import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;

public class JsonRpcException extends Exception
{
    private final JsonRpcError mErrorMessage;
    
    public JsonRpcException(final JsonRpcError jsonRpcError) {
        final StringBuilder sb = new StringBuilder();
        sb.append(jsonRpcError.code);
        sb.append(": ");
        sb.append(jsonRpcError.message);
        super(sb.toString());
        this.mErrorMessage = Util.throwIfNull(jsonRpcError);
    }
    
    public JsonRpcError getErrorMessage() {
        return this.mErrorMessage;
    }
}
