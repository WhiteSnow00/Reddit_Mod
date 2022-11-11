// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

public abstract class ReplyableWrapper<T extends Thing & Replyable> extends ThingWrapper<T>
{
    public String getId() {
        return this.getData().getId();
    }
    
    public String getName() {
        return this.getData().getName();
    }
    
    public abstract String getParentId();
}
