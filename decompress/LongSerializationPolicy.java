// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.com.google.gson;

import fc2.g;

public enum LongSerializationPolicy
{
    DEFAULT("DEFAULT", 0), 
    STRING("STRING", 1);
    
    public abstract g serialize(final Long p0);
}
