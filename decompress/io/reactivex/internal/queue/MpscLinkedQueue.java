// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicReference;
import if2.i;

public final class MpscLinkedQueue<T> implements i<T>
{
    public final AtomicReference<MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode<T>> f;
    public final AtomicReference<MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode<T>> g;
    
    public MpscLinkedQueue() {
        final AtomicReference f = new AtomicReference();
        this.f = f;
        final AtomicReference g = new AtomicReference();
        this.g = g;
        final MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode mpscLinkedQueue$LinkedQueueNode = new MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode();
        g.lazySet(mpscLinkedQueue$LinkedQueueNode);
        final MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode mpscLinkedQueue$LinkedQueueNode2 = f.getAndSet(mpscLinkedQueue$LinkedQueueNode);
    }
    
    public final void clear() {
        while (this.poll() != null && !this.isEmpty()) {}
    }
    
    public final boolean isEmpty() {
        return this.g.get() == this.f.get();
    }
    
    public final boolean offer(final T t) {
        if (t != null) {
            final MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode mpscLinkedQueue$LinkedQueueNode = new MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode((Object)t);
            this.f.getAndSet((MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode<T>)mpscLinkedQueue$LinkedQueueNode).soNext(mpscLinkedQueue$LinkedQueueNode);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
    
    public final T poll() {
        final MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode mpscLinkedQueue$LinkedQueueNode = this.g.get();
        final MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode lvNext = mpscLinkedQueue$LinkedQueueNode.lvNext();
        if (lvNext != null) {
            final Object andNullValue = lvNext.getAndNullValue();
            this.g.lazySet((MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode<T>)lvNext);
            return (T)andNullValue;
        }
        if (mpscLinkedQueue$LinkedQueueNode != this.f.get()) {
            MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode lvNext2;
            do {
                lvNext2 = mpscLinkedQueue$LinkedQueueNode.lvNext();
            } while (lvNext2 == null);
            final Object andNullValue2 = lvNext2.getAndNullValue();
            this.g.lazySet((MpscLinkedQueue.MpscLinkedQueue$LinkedQueueNode<T>)lvNext2);
            return (T)andNullValue2;
        }
        return null;
    }
}
