// 
// Decompiled by Procyon v0.6.0
// 

package xe;

import java.util.concurrent.CancellationException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import qd.h1;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import yd.a;

public final class j
{
    public static <TResult> TResult a(final g<TResult> g) throws ExecutionException, InterruptedException {
        a.R0("Must not be called on the main application thread");
        if (g == null) {
            throw new NullPointerException("Task must not be null");
        }
        if (g.m()) {
            return (TResult)h((g<Object>)g);
        }
        final l l = new l();
        final v b = i.b;
        g.d(b, l);
        g.c(b, l);
        g.a(b, l);
        l.a.await();
        return (TResult)h((g<Object>)g);
    }
    
    public static <TResult> TResult b(final g<TResult> g, final long n, final TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        a.R0("Must not be called on the main application thread");
        if (g == null) {
            throw new NullPointerException("Task must not be null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("TimeUnit must not be null");
        }
        if (g.m()) {
            return h(g);
        }
        final l l = new l();
        final v b = i.b;
        g.d(b, l);
        g.c(b, l);
        g.a(b, l);
        if (l.a.await(n, timeUnit)) {
            return h(g);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
    
    @Deprecated
    public static x c(final Executor executor, final Callable callable) {
        if (executor != null) {
            final x x = new x();
            executor.execute((Runnable)new h1(x, (Object)callable));
            return x;
        }
        throw new NullPointerException("Executor must not be null");
    }
    
    public static x d(final Exception ex) {
        final x x = new x();
        x.s(ex);
        return x;
    }
    
    public static x e(final Object o) {
        final x x = new x();
        x.t(o);
        return x;
    }
    
    public static x f(final List list) {
        if (list != null && !list.isEmpty()) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() != null) {
                    continue;
                }
                throw new NullPointerException("null tasks are not accepted");
            }
            final x x = new x();
            final m m = new m(list.size(), x);
            for (final g g : list) {
                final v b = i.b;
                g.d(b, m);
                g.c(b, m);
                g.a(b, m);
            }
            return x;
        }
        return e(null);
    }
    
    public static g<List<g<?>>> g(g<?>... g) {
        if (g.length == 0) {
            return e(Collections.emptyList());
        }
        final List<Object> list = Arrays.asList((Object[])(Object)g);
        if (list != null && !list.isEmpty()) {
            g = f(list).h(i.a, new k(list));
        }
        else {
            g = e(Collections.emptyList());
        }
        return g;
    }
    
    public static <TResult> TResult h(final g<TResult> g) throws ExecutionException {
        if (g.n()) {
            return g.j();
        }
        if (g.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(g.i());
    }
}
