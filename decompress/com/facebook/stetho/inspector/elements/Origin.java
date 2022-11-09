// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.json.annotation.JsonValue;

public enum Origin
{
    INJECTED("injected"), 
    INSPECTOR("inspector"), 
    REGULAR("regular"), 
    USER_AGENT("user-agent");
    
    private final String mValue;
    
    private Origin(final String mValue) {
        this.mValue = mValue;
    }
    
    @JsonValue
    public String getProtocolValue() {
        return this.mValue;
    }
}
