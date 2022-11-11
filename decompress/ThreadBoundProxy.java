// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.common.ThreadBound;

public abstract class ThreadBoundProxy implements ThreadBound
{
    private final ThreadBound mEnforcer;
    
    public ThreadBoundProxy(final ThreadBound threadBound) {
        this.mEnforcer = Util.throwIfNull(threadBound);
    }
    
    @Override
    public final boolean checkThreadAccess() {
        return this.mEnforcer.checkThreadAccess();
    }
    
    @Override
    public final <V> V postAndWait(final UncheckedCallable<V> uncheckedCallable) {
        return this.mEnforcer.postAndWait(uncheckedCallable);
    }
    
    @Override
    public final void postAndWait(final Runnable runnable) {
        this.mEnforcer.postAndWait(runnable);
    }
    
    @Override
    public final void postDelayed(final Runnable runnable, final long n) {
        this.mEnforcer.postDelayed(runnable, n);
    }
    
    @Override
    public final void removeCallbacks(final Runnable runnable) {
        this.mEnforcer.removeCallbacks(runnable);
    }
    
    @Override
    public final void verifyThreadAccess() {
        this.mEnforcer.verifyThreadAccess();
    }
}
