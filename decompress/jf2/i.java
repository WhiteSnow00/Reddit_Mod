// 
// Decompiled by Procyon v0.6.0
// 

package jf2;

import io.reactivex.internal.observers.InnerQueuedObserver;

public interface i<T>
{
    void drain();
    
    void innerComplete(final InnerQueuedObserver<T> p0);
    
    void innerError(final InnerQueuedObserver<T> p0, final Throwable p1);
    
    void innerNext(final InnerQueuedObserver<T> p0, final T p1);
}
