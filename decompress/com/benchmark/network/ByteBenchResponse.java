// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.network;

import com.bytedance.covode.number.Covode;

public class ByteBenchResponse
{
    public String mData;
    public int mErrorCode;
    public int mHttpCode;
    public String mMessage;
    
    static {
        Covode.recordClassIndex(2975);
    }
    
    public ByteBenchResponse() {
        this.mHttpCode = 400;
        this.mData = "";
        this.mErrorCode = -1;
        this.mMessage = "";
    }
}
