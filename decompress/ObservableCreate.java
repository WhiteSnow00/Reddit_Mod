// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.disposables.CancellableDisposable;
import kf2.f;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import ej2.c0;
import ff2.v;
import if2.a;
import ff2.a0;
import ff2.w;
import ff2.t;

public final class ObservableCreate<T> extends t<T>
{
    public final w<T> f;
    
    public ObservableCreate(final w<T> f) {
        this.f = f;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final CreateEmitter createEmitter = new CreateEmitter((a0<? super T>)a0);
        a0.onSubscribe((a)createEmitter);
        try {
            this.f.B((v)createEmitter);
        }
        finally {
            final Throwable t;
            c0.i4(t);
            createEmitter.onError(t);
        }
    }
    
    public static final class CreateEmitter<T> extends AtomicReference<a> implements v<T>, a
    {
        private static final long serialVersionUID = -3434801548987643227L;
        public final a0<? super T> observer;
        
        public CreateEmitter(final a0<? super T> observer) {
            this.observer = observer;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a)this.get());
        }
        
        public void onComplete() {
            if (!this.isDisposed()) {
                try {
                    this.observer.onComplete();
                }
                finally {
                    this.dispose();
                }
            }
        }
        
        public void onError(final Throwable t) {
            if (!this.tryOnError(t)) {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            if (t == null) {
                this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!this.isDisposed()) {
                this.observer.onNext((Object)t);
            }
        }
        
        public v<T> serialize() {
            return (v<T>)new SerializedEmitter((ff2.v<Object>)this);
        }
        
        public void setCancellable(final f f) {
            this.setDisposable((a)new CancellableDisposable(f));
        }
        
        public void setDisposable(final a a) {
            DisposableHelper.set((AtomicReference)this, a);
        }
        
        @Override
        public String toString() {
            return String.format("%s{%s}", CreateEmitter.class.getSimpleName(), super.toString());
        }
        
        public boolean tryOnError(final Throwable t) {
            Throwable t2 = t;
            if (t == null) {
                t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!this.isDisposed()) {
                try {
                    this.observer.onError(t2);
                    return true;
                }
                finally {
                    this.dispose();
                }
            }
            return false;
        }
    }
    
    public static final class SerializedEmitter<T> extends AtomicInteger implements v<T>
    {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final v<T> emitter;
        public final AtomicThrowable error;
        public final vf2.a<T> queue;
        
        public SerializedEmitter(final v<T> emitter) {
            this.emitter = emitter;
            this.error = new AtomicThrowable();
            this.queue = new vf2.a<T>(16);
        }
        
        public void drain() {
            if (this.getAndIncrement() == 0) {
                this.drainLoop();
            }
        }
        
        public void drainLoop() {
            final v<T> emitter = this.emitter;
            final vf2.a<T> queue = this.queue;
            final AtomicThrowable error = this.error;
            int addAndGet = 1;
            while (!emitter.isDisposed()) {
                if (error.get() != null) {
                    queue.clear();
                    ((ff2.f)emitter).onError(error.terminate());
                    return;
                }
                final boolean done = this.done;
                final T poll = queue.poll();
                final boolean b = poll == null;
                if (done && b) {
                    ((ff2.f)emitter).onComplete();
                    return;
                }
                if (b) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    ((ff2.f)emitter).onNext((Object)poll);
                }
            }
            queue.clear();
        }
        
        public boolean isDisposed() {
            return this.emitter.isDisposed();
        }
        
        public void onComplete() {
            if (!this.emitter.isDisposed()) {
                if (!this.done) {
                    this.done = true;
                    this.drain();
                }
            }
        }
        
        public void onError(final Throwable t) {
            if (!this.tryOnError(t)) {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            if (!this.emitter.isDisposed()) {
                if (!this.done) {
                    if (t == null) {
                        this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    Label_0097: {
                        if (this.get() == 0 && this.compareAndSet(0, 1)) {
                            ((ff2.f)this.emitter).onNext((Object)t);
                            if (this.decrementAndGet() == 0) {
                                return;
                            }
                            break Label_0097;
                        }
                        final vf2.a<T> queue = this.queue;
                        synchronized (queue) {
                            queue.offer(t);
                            monitorexit(queue);
                            if (this.getAndIncrement() != 0) {
                                return;
                            }
                            this.drainLoop();
                        }
                    }
                }
            }
        }
        
        public v<T> serialize() {
            return (v<T>)this;
        }
        
        public void setCancellable(final f cancellable) {
            this.emitter.setCancellable(cancellable);
        }
        
        public void setDisposable(final a disposable) {
            this.emitter.setDisposable(disposable);
        }
        
        @Override
        public String toString() {
            return this.emitter.toString();
        }
        
        public boolean tryOnError(final Throwable t) {
            if (!this.emitter.isDisposed()) {
                if (!this.done) {
                    Throwable t2;
                    if ((t2 = t) == null) {
                        t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                    }
                    if (this.error.addThrowable(t2)) {
                        this.done = true;
                        this.drain();
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
