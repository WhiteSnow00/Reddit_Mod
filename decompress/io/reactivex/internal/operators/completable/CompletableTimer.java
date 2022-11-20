// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.completable;

import af2.c;
import af2.b0;
import java.util.concurrent.TimeUnit;
import af2.a;

public final class CompletableTimer extends a
{
    public final long f;
    public final TimeUnit g;
    public final b0 h;
    
    public CompletableTimer(final long f, final TimeUnit g, final b0 h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void w(final c c) {
        final CompletableTimer.CompletableTimer$TimerDisposable completableTimer$TimerDisposable = new CompletableTimer.CompletableTimer$TimerDisposable(c);
        c.onSubscribe((df2.a)completableTimer$TimerDisposable);
        completableTimer$TimerDisposable.setFuture(this.h.d((Runnable)completableTimer$TimerDisposable, this.f, this.g));
    }
}
