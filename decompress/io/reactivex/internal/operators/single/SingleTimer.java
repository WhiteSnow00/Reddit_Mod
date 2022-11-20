// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import df2.a;
import af2.e0;
import af2.b0;
import java.util.concurrent.TimeUnit;
import af2.c0;

public final class SingleTimer extends c0<Long>
{
    public final long f;
    public final TimeUnit g;
    public final b0 h;
    
    public SingleTimer(final long f, final TimeUnit g, final b0 h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void G(final e0<? super Long> e0) {
        final TimerDisposable timerDisposable = new TimerDisposable(e0);
        e0.onSubscribe((a)timerDisposable);
        timerDisposable.setFuture(this.h.d((Runnable)timerDisposable, this.f, this.g));
    }
    
    public static final class TimerDisposable extends AtomicReference<a> implements a, Runnable
    {
        private static final long serialVersionUID = 8465401857522493082L;
        public final e0<? super Long> downstream;
        
        public TimerDisposable(final e0<? super Long> downstream) {
            this.downstream = downstream;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a)this.get());
        }
        
        public void run() {
            this.downstream.onSuccess((Object)0L);
        }
        
        public void setFuture(final a a) {
            DisposableHelper.replace((AtomicReference)this, a);
        }
    }
}
