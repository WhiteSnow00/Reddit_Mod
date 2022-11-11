// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.cct.internal;

import ia.a;

public abstract class ClientInfo
{
    public abstract ia.a a();
    
    public abstract ClientType b();
    
    public enum ClientType
    {
        ANDROID_FIREBASE(23), 
        UNKNOWN(0);
        
        private final int value;
        
        private ClientType(final int value) {
            this.value = value;
        }
    }
    
    public abstract static class a
    {
    }
}
