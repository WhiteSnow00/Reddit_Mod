// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import java.util.Iterator;
import ff2.y;

public final class BlockingObservableIterable<T> implements Iterable<T>
{
    public final y<? extends T> f;
    public final int g;
    
    public BlockingObservableIterable(final y<? extends T> f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Iterator<T> iterator() {
        final BlockingObservableIterable.BlockingObservableIterable$BlockingObservableIterator blockingObservableIterable$BlockingObservableIterator = new BlockingObservableIterable.BlockingObservableIterable$BlockingObservableIterator(this.g);
        this.f.subscribe((a0)blockingObservableIterable$BlockingObservableIterator);
        return (Iterator<T>)blockingObservableIterable$BlockingObservableIterator;
    }
}
