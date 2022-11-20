// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.CompositeDisposable;
import af2.c;
import af2.e;
import af2.a;

public final class CompletableMergeArray extends a
{
    public final e[] f;
    
    public CompletableMergeArray(final e[] f) {
        this.f = f;
    }
    
    @Override
    public final void w(final c c) {
        final CompositeDisposable compositeDisposable = new CompositeDisposable();
        final CompletableMergeArray.CompletableMergeArray$InnerCompletableObserver completableMergeArray$InnerCompletableObserver = new CompletableMergeArray.CompletableMergeArray$InnerCompletableObserver(c, new AtomicBoolean(), compositeDisposable, this.f.length + 1);
        c.onSubscribe((df2.a)compositeDisposable);
        for (final e e : this.f) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (e == null) {
                compositeDisposable.dispose();
                completableMergeArray$InnerCompletableObserver.onError((Throwable)new NullPointerException("A completable source is null"));
                return;
            }
            e.a((c)completableMergeArray$InnerCompletableObserver);
        }
        completableMergeArray$InnerCompletableObserver.onComplete();
    }
}
