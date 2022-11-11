// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscriptions;

import nf2.g;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements g<T>
{
    private static final long serialVersionUID = -6671519529404341862L;
    
    public final boolean offer(final T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public final boolean offer(final T t, final T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
