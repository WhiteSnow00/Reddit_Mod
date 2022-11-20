// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.completable;

import af2.c;
import af2.b0;
import af2.e;
import af2.a;

public final class CompletableObserveOn extends a
{
    public final e f;
    public final b0 g;
    
    public CompletableObserveOn(final e f, final b0 g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void w(final c c) {
        this.f.a((c)new CompletableObserveOn.CompletableObserveOn$ObserveOnCompletableObserver(c, this.g));
    }
}
