// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.network.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RequestError
{
    @c(LIZ = "alert")
    public String alert;
    @c(LIZ = "message")
    public String message;
    @c(LIZ = "prompts")
    public String prompts;
    public transient String url;
    
    static {
        Covode.recordClassIndex(10475);
    }
    
    public RequestError() {
        this.prompts = "Operation failed, please try again later";
    }
}
