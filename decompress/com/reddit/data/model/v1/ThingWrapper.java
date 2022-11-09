// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import java.io.Serializable;

@Deprecated
public abstract class ThingWrapper<T extends Thing> implements Serializable
{
    private T data;
    private String kind;
    
    public T getData() {
        return this.data;
    }
    
    public String getKind() {
        return this.kind;
    }
    
    public void setData(final T data) {
        this.data = data;
    }
    
    public void setKind(final String kind) {
        this.kind = kind;
    }
}
