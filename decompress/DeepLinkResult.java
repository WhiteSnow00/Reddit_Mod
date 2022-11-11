// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.deeplink;

import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public class DeepLinkResult
{
    public final DeepLink deepLink;
    public final Error error;
    public final Status status;
    
    static {
        Covode.recordClassIndex(2561);
    }
    
    public DeepLinkResult(final DeepLink deepLink, final Error error) {
        this.deepLink = deepLink;
        this.error = error;
        if (error != null) {
            this.status = Status.ERROR;
            return;
        }
        if (deepLink != null) {
            this.status = Status.FOUND;
            return;
        }
        this.status = Status.NOT_FOUND;
    }
    
    public DeepLink getDeepLink() {
        return this.deepLink;
    }
    
    public Error getError() {
        return this.error;
    }
    
    public Status getStatus() {
        return this.status;
    }
    
    @Override
    public String toString() {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("deepLink", (Object)this.deepLink);
            jsonObject.put("error", (Object)this.error);
            jsonObject.put("status", (Object)this.status);
            return jsonObject.toString();
        }
        catch (final JSONException ex) {
            return jsonObject.toString();
        }
    }
    
    public enum Error
    {
        DEVELOPER_ERROR, 
        HTTP_STATUS_CODE, 
        NETWORK, 
        TIMEOUT, 
        UNEXPECTED;
        
        static {
            Covode.recordClassIndex(2562);
        }
    }
    
    public enum Status
    {
        ERROR, 
        FOUND, 
        NOT_FOUND;
        
        static {
            Covode.recordClassIndex(2563);
        }
    }
}
