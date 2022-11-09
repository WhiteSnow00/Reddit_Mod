// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector;

import ag0.a;

public class MismatchedResponseException extends MessageHandlingException
{
    public long mRequestId;
    
    public MismatchedResponseException(final long mRequestId) {
        super(a.o("Response for request id ", mRequestId, ", but no such request is pending"));
        this.mRequestId = mRequestId;
    }
    
    public long getRequestId() {
        return this.mRequestId;
    }
}
