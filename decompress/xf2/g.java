// 
// Decompiled by Procyon v0.6.0
// 

package xf2;

import io.reactivex.internal.subscribers.InnerQueuedSubscriber;

public interface g<T>
{
    void drain();
    
    void innerComplete(final InnerQueuedSubscriber<T> p0);
    
    void innerError(final InnerQueuedSubscriber<T> p0, final Throwable p1);
    
    void innerNext(final InnerQueuedSubscriber<T> p0, final T p1);
}
