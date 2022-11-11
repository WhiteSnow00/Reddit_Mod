// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.persistence;

public interface PersistenceStrategy<T>
{
    void clear();
    
    T restore();
    
    void save(final T p0);
}
