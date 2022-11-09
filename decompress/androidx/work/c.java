// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import kotlinx.coroutines.JobSupport;
import androidx.work.impl.utils.futures.AbstractFuture$b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import zg2.l;
import mj2.b1;
import androidx.work.impl.utils.futures.a;
import mj2.z0;

public final class c<R> implements yg.c<R>
{
    public final z0 f;
    public final a<R> g;
    
    public c() {
        throw null;
    }
    
    public c(final b1 f) {
        final a g = new a();
        this.f = (z0)f;
        this.g = g;
        ((JobSupport)f).V((l)new JobListenableFuture$1(this));
    }
    
    public final void a(final Runnable runnable, final Executor executor) {
        this.g.a(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        return this.g.cancel(b);
    }
    
    public final R get() {
        return this.g.get();
    }
    
    public final R get(final long n, final TimeUnit timeUnit) {
        return this.g.get(n, timeUnit);
    }
    
    public final boolean isCancelled() {
        return this.g.f instanceof AbstractFuture$b;
    }
    
    public final boolean isDone() {
        return this.g.isDone();
    }
}
