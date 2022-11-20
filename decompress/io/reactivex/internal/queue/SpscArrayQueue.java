// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicLong;
import if2.i;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements i<E>
{
    public static final Integer f;
    private static final long serialVersionUID = -1296597691183856449L;
    public final AtomicLong consumerIndex;
    public final int lookAheadStep;
    public final int mask;
    public final AtomicLong producerIndex;
    public long producerLookAhead;
    
    static {
        f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    }
    
    public SpscArrayQueue(final int n) {
        super(1 << 32 - Integer.numberOfLeadingZeros(n - 1));
        this.mask = this.length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(n / 4, SpscArrayQueue.f);
    }
    
    public int calcElementOffset(final long n) {
        return (int)n & this.mask;
    }
    
    public int calcElementOffset(final long n, final int n2) {
        return (int)n & n2;
    }
    
    public void clear() {
        while (true) {
            if (this.poll() == null) {
                if (!this.isEmpty()) {
                    continue;
                }
                break;
            }
        }
    }
    
    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }
    
    public E lvElement(final int n) {
        return this.get(n);
    }
    
    public boolean offer(final E e) {
        if (e != null) {
            final int mask = this.mask;
            final long value = this.producerIndex.get();
            final int calcElementOffset = this.calcElementOffset(value, mask);
            if (value >= this.producerLookAhead) {
                final long producerLookAhead = this.lookAheadStep + value;
                if (this.lvElement(this.calcElementOffset(producerLookAhead, mask)) == null) {
                    this.producerLookAhead = producerLookAhead;
                }
                else if (this.lvElement(calcElementOffset) != null) {
                    return false;
                }
            }
            this.soElement(calcElementOffset, e);
            this.soProducerIndex(value + 1L);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
    
    public boolean offer(final E e, final E e2) {
        return this.offer(e) && this.offer(e2);
    }
    
    public E poll() {
        final long value = this.consumerIndex.get();
        final int calcElementOffset = this.calcElementOffset(value);
        final E lvElement = this.lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        this.soConsumerIndex(value + 1L);
        this.soElement(calcElementOffset, null);
        return lvElement;
    }
    
    public void soConsumerIndex(final long n) {
        this.consumerIndex.lazySet(n);
    }
    
    public void soElement(final int n, final E e) {
        this.lazySet(n, e);
    }
    
    public void soProducerIndex(final long n) {
        this.producerIndex.lazySet(n);
    }
}
