// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import ff2.l;
import java.util.Iterator;
import ff2.g;

public final class BlockingFlowableIterable<T> implements Iterable<T>
{
    public final g<T> f;
    public final int g;
    
    public BlockingFlowableIterable(final g<T> f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Iterator<T> iterator() {
        final BlockingFlowableIterable.BlockingFlowableIterable$BlockingFlowableIterator blockingFlowableIterable$BlockingFlowableIterator = new BlockingFlowableIterable.BlockingFlowableIterable$BlockingFlowableIterator(this.g);
        this.f.subscribe((ff2.l<? super T>)blockingFlowableIterable$BlockingFlowableIterator);
        return (Iterator<T>)blockingFlowableIterable$BlockingFlowableIterator;
    }
}
