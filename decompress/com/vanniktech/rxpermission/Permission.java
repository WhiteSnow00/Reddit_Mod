// 
// Decompiled by Procyon v0.6.0
// 

package com.vanniktech.rxpermission;

public abstract class Permission
{
    public abstract String a();
    
    public abstract State b();
    
    public enum State
    {
        private static final State[] $VALUES;
        
        DENIED, 
        DENIED_NOT_SHOWN, 
        GRANTED, 
        REVOKED_BY_POLICY;
    }
}
