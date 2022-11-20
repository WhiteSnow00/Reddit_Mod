// 
// Decompiled by Procyon v0.6.0
// 

package pf2;

import df2.a;
import io.reactivex.internal.disposables.SequentialDisposable;
import af2.e0;
import af2.b0;
import java.util.concurrent.TimeUnit;
import af2.g0;
import af2.c0;

public final class b<T> extends c0<T>
{
    public final g0<? extends T> f;
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    public final boolean j;
    
    public b(final g0 f, final long g, final TimeUnit h, final b0 i) {
        this.f = (g0<? extends T>)f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = false;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        final SequentialDisposable sequentialDisposable = new SequentialDisposable();
        e0.onSubscribe((a)sequentialDisposable);
        this.f.a((e0)new b.b$a(this, sequentialDisposable, (e0)e0));
    }
}
