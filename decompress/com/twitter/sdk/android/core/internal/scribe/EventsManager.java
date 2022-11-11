// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

public interface EventsManager<T>
{
    void deleteAllEvents();
    
    void recordEvent(final T p0);
    
    void sendEvents();
}
