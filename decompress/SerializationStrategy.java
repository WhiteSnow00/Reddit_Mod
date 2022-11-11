// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.persistence;

public interface SerializationStrategy<T>
{
    T deserialize(final String p0);
    
    String serialize(final T p0);
}
