// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import ej2.c0;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.a0;
import ff2.y;
import java.util.concurrent.Callable;
import ff2.t;
import sf2.a;

public final class ObservableWindowBoundarySupplier<T, B> extends a<T, t<T>>
{
    public final Callable<? extends y<B>> g;
    public final int h;
    
    public ObservableWindowBoundarySupplier(final y<T> y, final Callable<? extends y<B>> g, final int h) {
        super((y)y);
        this.g = g;
        this.h = h;
    }
    
    public final void subscribeActual(final a0<? super t<T>> a0) {
        super.f.subscribe((a0)new WindowBoundaryMainObserver((ff2.a0<? super ff2.t<Object>>)a0, this.h, (Callable<? extends ff2.y<Object>>)this.g));
    }
    
    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements a0<T>, if2.a, Runnable
    {
        public static final ObservableWindowBoundarySupplier$a<Object, Object> BOUNDARY_DISPOSED;
        public static final Object NEXT_WINDOW;
        private static final long serialVersionUID = 2233020065421370272L;
        public final AtomicReference<ObservableWindowBoundarySupplier$a<T, B>> boundaryObserver;
        public final int capacityHint;
        public volatile boolean done;
        public final a0<? super t<T>> downstream;
        public final AtomicThrowable errors;
        public final Callable<? extends y<B>> other;
        public final MpscLinkedQueue<Object> queue;
        public final AtomicBoolean stopWindows;
        public if2.a upstream;
        public UnicastSubject<T> window;
        public final AtomicInteger windows;
        
        static {
            BOUNDARY_DISPOSED = new ObservableWindowBoundarySupplier$a((WindowBoundaryMainObserver)null);
            NEXT_WINDOW = new Object();
        }
        
        public WindowBoundaryMainObserver(final a0<? super t<T>> downstream, final int capacityHint, final Callable<? extends y<B>> other) {
            this.downstream = downstream;
            this.capacityHint = capacityHint;
            this.boundaryObserver = new AtomicReference<ObservableWindowBoundarySupplier$a<T, B>>();
            this.windows = new AtomicInteger(1);
            this.queue = (MpscLinkedQueue<Object>)new MpscLinkedQueue();
            this.errors = new AtomicThrowable();
            this.stopWindows = new AtomicBoolean();
            this.other = other;
        }
        
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }
        
        public void disposeBoundary() {
            final AtomicReference<ObservableWindowBoundarySupplier$a<T, B>> boundaryObserver = this.boundaryObserver;
            final ObservableWindowBoundarySupplier$a<Object, Object> boundary_DISPOSED = WindowBoundaryMainObserver.BOUNDARY_DISPOSED;
            final if2.a a = (if2.a)boundaryObserver.getAndSet((ObservableWindowBoundarySupplier$a<T, B>)boundary_DISPOSED);
            if (a != null && a != boundary_DISPOSED) {
                a.dispose();
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final a0<? super t<T>> downstream = this.downstream;
            final MpscLinkedQueue<Object> queue = this.queue;
            final AtomicThrowable errors = this.errors;
            int addAndGet = 1;
        Label_0026:
            while (this.windows.get() != 0) {
                final UnicastSubject<T> window = this.window;
                final boolean done = this.done;
                if (done && errors.get() != null) {
                    queue.clear();
                    final Throwable terminate = errors.terminate();
                    if (window != null) {
                        this.window = null;
                        window.onError(terminate);
                    }
                    downstream.onError(terminate);
                    return;
                }
                final Object poll = queue.poll();
                final int n = 0;
                final boolean b = poll == null;
                if (done && b) {
                    final Throwable terminate2 = errors.terminate();
                    if (terminate2 == null) {
                        if (window != null) {
                            this.window = null;
                            window.onComplete();
                        }
                        downstream.onComplete();
                    }
                    else {
                        if (window != null) {
                            this.window = null;
                            window.onError(terminate2);
                        }
                        downstream.onError(terminate2);
                    }
                    return;
                }
                if (b) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (poll != WindowBoundaryMainObserver.NEXT_WINDOW) {
                    window.onNext((T)poll);
                }
                else {
                    if (window != null) {
                        this.window = null;
                        window.onComplete();
                    }
                    if (this.stopWindows.get()) {
                        continue;
                    }
                    final UnicastSubject<T> window2 = new UnicastSubject<T>(this.capacityHint, this);
                    this.window = window2;
                    this.windows.getAndIncrement();
                    try {
                        final y<B> call = (y<B>)this.other.call();
                        mf2.a.b((Object)call, "The other Callable returned a null ObservableSource");
                        final y y = call;
                        final ObservableWindowBoundarySupplier$a observableWindowBoundarySupplier$a = new ObservableWindowBoundarySupplier$a(this);
                        final AtomicReference<ObservableWindowBoundarySupplier$a<T, B>> boundaryObserver = this.boundaryObserver;
                        while (true) {
                            while (!boundaryObserver.compareAndSet(null, (ObservableWindowBoundarySupplier$a<T, B>)observableWindowBoundarySupplier$a)) {
                                if (boundaryObserver.get() != null) {
                                    final int n2 = n;
                                    if (n2 != 0) {
                                        y.subscribe((a0)observableWindowBoundarySupplier$a);
                                        downstream.onNext((Object)window2);
                                        continue Label_0026;
                                    }
                                    continue Label_0026;
                                }
                            }
                            final int n2 = 1;
                            continue;
                        }
                    }
                    finally {
                        final Throwable t;
                        c0.i4(t);
                        errors.addThrowable(t);
                        this.done = true;
                    }
                }
            }
            queue.clear();
            this.window = null;
        }
        
        public void innerComplete() {
            this.upstream.dispose();
            this.done = true;
            this.drain();
        }
        
        public void innerError(final Throwable t) {
            this.upstream.dispose();
            if (this.errors.addThrowable(t)) {
                this.done = true;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void innerNext(final ObservableWindowBoundarySupplier$a<T, B> observableWindowBoundarySupplier$a) {
            final AtomicReference<ObservableWindowBoundarySupplier$a<T, B>> boundaryObserver = this.boundaryObserver;
            while (true) {
                while (!boundaryObserver.compareAndSet(observableWindowBoundarySupplier$a, null)) {
                    if (boundaryObserver.get() != observableWindowBoundarySupplier$a) {
                        this.queue.offer(WindowBoundaryMainObserver.NEXT_WINDOW);
                        this.drain();
                        return;
                    }
                }
                continue;
            }
        }
        
        public boolean isDisposed() {
            return this.stopWindows.get();
        }
        
        public void onComplete() {
            this.disposeBoundary();
            this.done = true;
            this.drain();
        }
        
        public void onError(final Throwable t) {
            this.disposeBoundary();
            if (this.errors.addThrowable(t)) {
                this.done = true;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            this.queue.offer((Object)t);
            this.drain();
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
                this.queue.offer(WindowBoundaryMainObserver.NEXT_WINDOW);
                this.drain();
            }
        }
        
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }
    }
}
