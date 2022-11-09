// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime.backends;

public abstract class BackendResponse
{
    public abstract long a();
    
    public abstract Status b();
    
    public enum Status
    {
        FATAL_ERROR, 
        INVALID_PAYLOAD, 
        OK, 
        TRANSIENT_ERROR;
    }
}
