// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ag2.d;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.a0;
import ff2.y;
import ff2.t;
import sf2.a;

public final class ObservableWindowBoundary<T, B> extends a<T, t<T>>
{
    public final y<B> g;
    public final int h;
    
    public ObservableWindowBoundary(final y<T> y, final y<B> g, final int h) {
        super((y)y);
        this.g = g;
        this.h = h;
    }
    
    public final void subscribeActual(final a0<? super t<T>> a0) {
        final WindowBoundaryMainObserver windowBoundaryMainObserver = new WindowBoundaryMainObserver((a0<? super t<T>>)a0, this.h);
        a0.onSubscribe((if2.a)windowBoundaryMainObserver);
        this.g.subscribe((a0)windowBoundaryMainObserver.boundaryObserver);
        super.f.subscribe((a0)windowBoundaryMainObserver);
    }
    
    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements a0<T>, if2.a, Runnable
    {
        public static final Object NEXT_WINDOW;
        private static final long serialVersionUID = 2233020065421370272L;
        public final ObservableWindowBoundary$a<T, B> boundaryObserver;
        public final int capacityHint;
        public volatile boolean done;
        public final a0<? super t<T>> downstream;
        public final AtomicThrowable errors;
        public final MpscLinkedQueue<Object> queue;
        public final AtomicBoolean stopWindows;
        public final AtomicReference<if2.a> upstream;
        public UnicastSubject<T> window;
        public final AtomicInteger windows;
        
        static {
            NEXT_WINDOW = new Object();
        }
        
        public WindowBoundaryMainObserver(final a0<? super t<T>> downstream, final int capacityHint) {
            this.downstream = downstream;
            this.capacityHint = capacityHint;
            this.boundaryObserver = (ObservableWindowBoundary$a<T, B>)new ObservableWindowBoundary$a(this);
            this.upstream = new AtomicReference<if2.a>();
            this.windows = new AtomicInteger(1);
            this.queue = (MpscLinkedQueue<Object>)new MpscLinkedQueue();
            this.errors = new AtomicThrowable();
            this.stopWindows = new AtomicBoolean();
        }
        
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                ((d)this.boundaryObserver).dispose();
                if (this.windows.decrementAndGet() == 0) {
                    DisposableHelper.dispose((AtomicReference)this.upstream);
                }
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
                    downstream.onNext((Object)window2);
                }
            }
            queue.clear();
            this.window = null;
        }
        
        public void innerComplete() {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            this.done = true;
            this.drain();
        }
        
        public void innerError(final Throwable t) {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            if (this.errors.addThrowable(t)) {
                this.done = true;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void innerNext() {
            this.queue.offer(WindowBoundaryMainObserver.NEXT_WINDOW);
            this.drain();
        }
        
        public boolean isDisposed() {
            return this.stopWindows.get();
        }
        
        public void onComplete() {
            ((d)this.boundaryObserver).dispose();
            this.done = true;
            this.drain();
        }
        
        public void onError(final Throwable t) {
            ((d)this.boundaryObserver).dispose();
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
        
        public void onSubscribe(final if2.a a) {
            if (DisposableHelper.setOnce((AtomicReference)this.upstream, a)) {
                this.innerNext();
            }
        }
        
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                DisposableHelper.dispose((AtomicReference)this.upstream);
            }
        }
    }
}
