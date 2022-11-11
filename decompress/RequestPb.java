// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.network.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RequestPb
{
    @c(LIZ = "enable")
    public boolean enable;
    @c(LIZ = "pass_through_api")
    public String passThroughApi;
    @c(LIZ = "switches")
    public String switches;
    
    static {
        Covode.recordClassIndex(10460);
    }
    
    public static RequestPb defaultInstance() {
        final RequestPb requestPb = new RequestPb();
        requestPb.enable = false;
        requestPb.switches = "{}";
        requestPb.passThroughApi = "";
        return requestPb;
    }
    
    public String getPassThroughApi() {
        return this.passThroughApi;
    }
    
    public String getSwitches() {
        return this.switches;
    }
    
    public boolean isEnable() {
        return this.enable;
    }
}
