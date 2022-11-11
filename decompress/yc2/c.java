// 
// Decompiled by Procyon v0.6.0
// 

package yc2;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import sg2.e;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

public final class c implements ScheduledExecutorService
{
    public final ArrayList f;
    public final ScheduledExecutorService g;
    
    public c() {
        final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        e.e((Object)singleThreadScheduledExecutor, "Executors.newSingleThreadScheduledExecutor()");
        this.g = singleThreadScheduledExecutor;
        this.f = new ArrayList();
    }
    
    public final void a(final Future future) {
        synchronized (this) {
            this.f.add(future);
        }
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.g.awaitTermination(n, timeUnit);
    }
    
    public final void b(final ScheduledFuture scheduledFuture) {
        synchronized (this) {
            this.f.add(scheduledFuture);
        }
    }
    
    public final void c(final boolean b) {
        synchronized (this) {
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                ((Future)iterator.next()).cancel(b);
            }
            this.f.clear();
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        e.f((Object)runnable, "command");
        final ScheduledFuture<?> schedule = this.g.schedule(runnable, 0L, TimeUnit.MILLISECONDS);
        e.e((Object)schedule, "scheduledExecutorService\u2026L, TimeUnit.MILLISECONDS)");
        this.a(schedule);
    }
    
    @Override
    public final <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> collection) throws InterruptedException {
        e.f((Object)collection, "tasks");
        final List<Future<Object>> invokeAll = this.g.invokeAll((Collection<? extends Callable<Object>>)collection);
        e.e((Object)invokeAll, "scheduledExecutorService.invokeAll(tasks)");
        synchronized (this) {
            this.f.addAll(invokeAll);
            return (List<Future<T>>)invokeAll;
        }
    }
    
    @Override
    public final <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> collection, final long n, final TimeUnit timeUnit) throws InterruptedException {
        e.f((Object)collection, "tasks");
        e.f((Object)timeUnit, "unit");
        final List<Future<Object>> invokeAll = this.g.invokeAll((Collection<? extends Callable<Object>>)collection, n, timeUnit);
        e.e((Object)invokeAll, "scheduledExecutorService\u2026All(tasks, timeout, unit)");
        synchronized (this) {
            this.f.addAll(invokeAll);
            return (List<Future<T>>)invokeAll;
        }
    }
    
    @Override
    public final <T> T invokeAny(final Collection<? extends Callable<T>> collection) {
        return this.g.invokeAny(collection);
    }
    
    @Override
    public final <T> T invokeAny(final Collection<? extends Callable<T>> collection, final long n, final TimeUnit timeUnit) {
        return this.g.invokeAny(collection, n, timeUnit);
    }
    
    @Override
    public final boolean isShutdown() {
        return this.g.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.g.isTerminated();
    }
    
    @Override
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        e.f((Object)runnable, "command");
        e.f((Object)timeUnit, "unit");
        final ScheduledFuture<?> schedule = this.g.schedule(runnable, n, timeUnit);
        e.e((Object)schedule, "scheduledExecutorService\u2026ule(command, delay, unit)");
        this.b(schedule);
        return schedule;
    }
    
    @Override
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long n, final TimeUnit timeUnit) {
        e.f((Object)callable, "callable");
        e.f((Object)timeUnit, "unit");
        final ScheduledFuture<V> schedule = this.g.schedule(callable, n, timeUnit);
        e.e((Object)schedule, "scheduledExecutorService\u2026le(callable, delay, unit)");
        this.b(schedule);
        return schedule;
    }
    
    @Override
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        e.f((Object)runnable, "command");
        e.f((Object)timeUnit, "unit");
        final ScheduledFuture<?> scheduleAtFixedRate = this.g.scheduleAtFixedRate(runnable, n, n2, timeUnit);
        e.e((Object)scheduleAtFixedRate, "scheduledExecutorService\u2026itialDelay, period, unit)");
        this.b(scheduleAtFixedRate);
        return scheduleAtFixedRate;
    }
    
    @Override
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        e.f((Object)runnable, "command");
        e.f((Object)timeUnit, "unit");
        final ScheduledFuture<?> scheduleWithFixedDelay = this.g.scheduleWithFixedDelay(runnable, n, n2, timeUnit);
        e.e((Object)scheduleWithFixedDelay, "scheduledExecutorService\u2026nitialDelay, delay, unit)");
        this.b(scheduleWithFixedDelay);
        return scheduleWithFixedDelay;
    }
    
    @Override
    public final void shutdown() {
        this.g.shutdown();
    }
    
    @Override
    public final List<Runnable> shutdownNow() {
        return this.g.shutdownNow();
    }
    
    @Override
    public final Future<?> submit(final Runnable runnable) {
        e.f((Object)runnable, "task");
        final Future<?> submit = this.g.submit(runnable);
        e.e((Object)submit, "scheduledExecutorService.submit(task)");
        this.a(submit);
        return submit;
    }
    
    @Override
    public final <T> Future<T> submit(final Runnable runnable, final T t) {
        e.f((Object)runnable, "task");
        final Future<T> submit = this.g.submit(runnable, t);
        e.e((Object)submit, "scheduledExecutorService.submit(task, result)");
        this.a(submit);
        return submit;
    }
    
    @Override
    public final <T> Future<T> submit(final Callable<T> callable) {
        e.f((Object)callable, "task");
        final Future<T> submit = this.g.submit(callable);
        e.e((Object)submit, "scheduledExecutorService.submit(task)");
        this.a(submit);
        return submit;
    }
}
