// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.attribution;

import com.bytedance.covode.number.Covode;

public class RequestError
{
    public static int EVENT_TIMEOUT;
    public static int NETWORK_FAILURE;
    public static int NO_DEV_KEY;
    public static int RESPONSE_CODE_FAILURE;
    public static int STOP_TRACKING;
    
    static {
        Covode.recordClassIndex(2556);
        RequestError.EVENT_TIMEOUT = 10;
        RequestError.STOP_TRACKING = 11;
        RequestError.NETWORK_FAILURE = 40;
        RequestError.NO_DEV_KEY = 41;
        RequestError.RESPONSE_CODE_FAILURE = 50;
    }
}
