// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.a0;
import ff2.y;
import ff2.t;
import sf2.a;

public final class ObservableWindow<T> extends a<T, t<T>>
{
    public final long g;
    public final long h;
    public final int i;
    
    public ObservableWindow(final y<T> y, final long g, final long h, final int i) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void subscribeActual(final a0<? super t<T>> a0) {
        if (this.g == this.h) {
            super.f.subscribe((a0)new WindowExactObserver((ff2.a0<? super ff2.t<Object>>)a0, this.g, this.i));
        }
        else {
            super.f.subscribe((a0)new WindowSkipObserver((ff2.a0<? super ff2.t<Object>>)a0, this.g, this.h, this.i));
        }
    }
    
    public static final class WindowExactObserver<T> extends AtomicInteger implements a0<T>, if2.a, Runnable
    {
        private static final long serialVersionUID = -7481782523886138128L;
        public volatile boolean cancelled;
        public final int capacityHint;
        public final long count;
        public final a0<? super t<T>> downstream;
        public long size;
        public if2.a upstream;
        public UnicastSubject<T> window;
        
        public WindowExactObserver(final a0<? super t<T>> downstream, final long count, final int capacityHint) {
            this.downstream = downstream;
            this.count = count;
            this.capacityHint = capacityHint;
        }
        
        public void dispose() {
            this.cancelled = true;
        }
        
        public boolean isDisposed() {
            return this.cancelled;
        }
        
        public void onComplete() {
            final UnicastSubject<T> window = this.window;
            if (window != null) {
                this.window = null;
                window.onComplete();
            }
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            final UnicastSubject<T> window = this.window;
            if (window != null) {
                this.window = null;
                window.onError(t);
            }
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            UnicastSubject<T> window;
            final UnicastSubject<T> unicastSubject = window = this.window;
            if (unicastSubject == null) {
                window = unicastSubject;
                if (!this.cancelled) {
                    window = new UnicastSubject<T>(this.capacityHint, this);
                    this.window = window;
                    this.downstream.onNext((Object)window);
                }
            }
            if (window != null) {
                window.onNext(t);
                final long size = this.size + 1L;
                this.size = size;
                if (size >= this.count) {
                    this.size = 0L;
                    this.window = null;
                    window.onComplete();
                    if (this.cancelled) {
                        this.upstream.dispose();
                    }
                }
            }
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
            }
        }
        
        public void run() {
            if (this.cancelled) {
                this.upstream.dispose();
            }
        }
    }
    
    public static final class WindowSkipObserver<T> extends AtomicBoolean implements a0<T>, if2.a, Runnable
    {
        private static final long serialVersionUID = 3366976432059579510L;
        public volatile boolean cancelled;
        public final int capacityHint;
        public final long count;
        public final a0<? super t<T>> downstream;
        public long firstEmission;
        public long index;
        public final long skip;
        public if2.a upstream;
        public final ArrayDeque<UnicastSubject<T>> windows;
        public final AtomicInteger wip;
        
        public WindowSkipObserver(final a0<? super t<T>> downstream, final long count, final long skip, final int capacityHint) {
            this.wip = new AtomicInteger();
            this.downstream = downstream;
            this.count = count;
            this.skip = skip;
            this.capacityHint = capacityHint;
            this.windows = new ArrayDeque<UnicastSubject<T>>();
        }
        
        public void dispose() {
            this.cancelled = true;
        }
        
        public boolean isDisposed() {
            return this.cancelled;
        }
        
        public void onComplete() {
            final ArrayDeque<UnicastSubject<T>> windows = this.windows;
            while (!windows.isEmpty()) {
                windows.poll().onComplete();
            }
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            final ArrayDeque<UnicastSubject<T>> windows = this.windows;
            while (!windows.isEmpty()) {
                windows.poll().onError(t);
            }
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            final ArrayDeque<UnicastSubject<T>> windows = this.windows;
            final long index = this.index;
            final long skip = this.skip;
            if (index % skip == 0L && !this.cancelled) {
                this.wip.getAndIncrement();
                final UnicastSubject unicastSubject = new UnicastSubject(this.capacityHint, this);
                windows.offer(unicastSubject);
                this.downstream.onNext((Object)unicastSubject);
            }
            final long firstEmission = this.firstEmission + 1L;
            final Iterator<UnicastSubject<T>> iterator = windows.iterator();
            while (iterator.hasNext()) {
                iterator.next().onNext(t);
            }
            if (firstEmission >= this.count) {
                windows.poll().onComplete();
                if (windows.isEmpty() && this.cancelled) {
                    this.upstream.dispose();
                    return;
                }
                this.firstEmission = firstEmission - skip;
            }
            else {
                this.firstEmission = firstEmission;
            }
            this.index = index + 1L;
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
            }
        }
        
        public void run() {
            if (this.wip.decrementAndGet() == 0 && this.cancelled) {
                this.upstream.dispose();
            }
        }
    }
}
