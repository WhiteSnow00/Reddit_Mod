// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import hj.a;
import java.util.List;

public class ApiErrors
{
    @a("errors")
    public final List<ApiError> errors;
    
    private ApiErrors() {
        this(null);
    }
    
    public ApiErrors(final List<ApiError> list) {
        this.errors = ModelUtils.getSafeList((List)list);
    }
}
