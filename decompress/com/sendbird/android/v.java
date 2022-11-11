// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.concurrent.Executors;
import ec2.a;
import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import sg2.e;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public final class v implements ExecutorService
{
    public final ArrayList f;
    public final ExecutorService g;
    
    public v(final ExecutorService g) {
        e.f((Object)g, "executorService");
        this.g = g;
        this.f = new ArrayList();
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.g.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        e.f((Object)runnable, "command");
        throw new UnsupportedOperationException("execute operation not supported");
    }
    
    @Override
    public final <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> collection) {
        e.f((Object)collection, "tasks");
        final List<Future<Object>> invokeAll = this.g.invokeAll(collection);
        e.e((Object)invokeAll, "executorService.invokeAll(tasks)");
        synchronized (this.f) {
            this.f.addAll(invokeAll);
            return (List<Future<T>>)invokeAll;
        }
    }
    
    @Override
    public final <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> collection, final long n, final TimeUnit timeUnit) {
        e.f((Object)collection, "tasks");
        e.f((Object)timeUnit, "unit");
        final List<Future<Object>> invokeAll = this.g.invokeAll(collection, n, timeUnit);
        e.e((Object)invokeAll, "executorService.invokeAll(tasks, timeout, unit)");
        synchronized (this.f) {
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
        final StringBuilder sb = new StringBuilder();
        sb.append("submit runnable: ");
        sb.append(runnable);
        ec2.a.a(sb.toString());
        final Future<?> submit = this.g.submit(runnable);
        e.e((Object)submit, "executorService.submit(task)");
        synchronized (this.f) {
            this.f.add(submit);
            return submit;
        }
    }
    
    @Override
    public final <T> Future<T> submit(final Runnable runnable, final T t) {
        e.f((Object)runnable, "task");
        final StringBuilder sb = new StringBuilder();
        sb.append("submit runnable: ");
        sb.append(runnable);
        sb.append(", result: ");
        sb.append(t);
        ec2.a.a(sb.toString());
        final Future<T> submit = this.g.submit(runnable, t);
        e.e((Object)submit, "executorService.submit(task, result)");
        synchronized (this.f) {
            this.f.add(submit);
            return submit;
        }
    }
    
    @Override
    public final <T> Future<T> submit(final Callable<T> callable) {
        e.f((Object)callable, "task");
        final StringBuilder sb = new StringBuilder();
        sb.append("submit callable: ");
        sb.append(callable);
        ec2.a.a(sb.toString());
        final Future<T> submit = this.g.submit(callable);
        e.e((Object)submit, "executorService.submit(task)");
        synchronized (this.f) {
            this.f.add(submit);
            return submit;
        }
    }
    
    public static final class a
    {
        public static v a() {
            final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
            e.e((Object)singleThreadExecutor, "Executors.newSingleThreadExecutor()");
            return new v(singleThreadExecutor);
        }
    }
}
