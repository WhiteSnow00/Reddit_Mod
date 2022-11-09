// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

public class Listing<T>
{
    private String after;
    private String before;
    private ListChildren<T> data;
    
    public ListChildren<T> getData() {
        return this.data;
    }
}
