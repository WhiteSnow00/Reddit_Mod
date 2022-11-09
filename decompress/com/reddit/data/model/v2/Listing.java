// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v2;

import java.util.List;

public interface Listing<T> extends Iterable<T>
{
    void add(final Listing<? extends T> p0);
    
    boolean contains(final T p0);
    
    Listing<T> copy();
    
    T get(final int p0);
    
    String getAdDistance();
    
    String getAfter();
    
    String getBefore();
    
    List<T> getEntities();
    
     <U extends T> void insert(final int p0, final U p1);
    
    boolean isEmpty();
    
    void remove(final int p0);
    
    int size();
}
