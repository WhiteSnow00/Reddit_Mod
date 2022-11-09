// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common;

public interface ThreadBound
{
    boolean checkThreadAccess();
    
     <V> V postAndWait(final UncheckedCallable<V> p0);
    
    void postAndWait(final Runnable p0);
    
    void postDelayed(final Runnable p0, final long p1);
    
    void removeCallbacks(final Runnable p0);
    
    void verifyThreadAccess();
}
