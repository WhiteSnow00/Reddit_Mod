// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import hj.a;

public class ApiError
{
    @a("code")
    public final int code;
    @a("message")
    public final String message;
    
    public ApiError(final String message, final int code) {
        this.message = message;
        this.code = code;
    }
}
