// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.network;

import X.0N9;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class ByteBenchRequest
{
    public int mCode;
    public String mContentType;
    public HashMap<String, String> mHeaders;
    public int mHttpMethod;
    public String mMessage;
    public String mRequestBody;
    public long mResponseLength;
    public String mUrl;
    public boolean mUseCommonParams;
    
    static {
        Covode.recordClassIndex(2974);
    }
    
    public ByteBenchRequest() {
        this.mUrl = "";
        this.mHttpMethod = 0N9.LIZ.ordinal();
        this.mRequestBody = "";
        this.mContentType = "application/json";
        this.mMessage = "";
        this.mUseCommonParams = true;
        this.mCode = 0;
    }
}
