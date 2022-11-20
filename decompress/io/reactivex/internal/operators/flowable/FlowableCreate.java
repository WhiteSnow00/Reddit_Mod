// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.disposables.CancellableDisposable;
import ff2.f;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicLong;
import xd.a;
import af2.i;
import nt2.d;
import nt2.c;
import io.reactivex.BackpressureStrategy;
import af2.j;
import af2.g;

public final class FlowableCreate<T> extends g<T>
{
    public final j<T> f;
    public final BackpressureStrategy g;
    
    public FlowableCreate(final j<T> f, final BackpressureStrategy g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final int n = FlowableCreate$a.a[((Enum)this.g).ordinal()];
        Object o;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        o = new BufferAsyncEmitter((nt2.c<? super Object>)c, af2.g.bufferSize());
                    }
                    else {
                        o = new LatestAsyncEmitter((nt2.c<? super Object>)c);
                    }
                }
                else {
                    o = new FlowableCreate.FlowableCreate$DropAsyncEmitter((c)c);
                }
            }
            else {
                o = new FlowableCreate.FlowableCreate$ErrorAsyncEmitter((c)c);
            }
        }
        else {
            o = new MissingEmitter((nt2.c<? super Object>)c);
        }
        c.onSubscribe((d)o);
        try {
            this.f.subscribe((i)o);
        }
        finally {
            final Throwable t;
            a.t1(t);
            ((BaseEmitter)o).onError(t);
        }
    }
    
    public abstract static class BaseEmitter<T> extends AtomicLong implements i<T>, d
    {
        private static final long serialVersionUID = 7326289992464377023L;
        public final c<? super T> downstream;
        public final SequentialDisposable serial;
        
        public BaseEmitter(final c<? super T> downstream) {
            this.downstream = downstream;
            this.serial = new SequentialDisposable();
        }
        
        public final void cancel() {
            this.serial.dispose();
            this.onUnsubscribed();
        }
        
        public void complete() {
            if (this.isCancelled()) {
                return;
            }
            try {
                this.downstream.onComplete();
            }
            finally {
                this.serial.dispose();
            }
        }
        
        public boolean error(final Throwable t) {
            Throwable t2 = t;
            if (t == null) {
                t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(t2);
                return true;
            }
            finally {
                this.serial.dispose();
            }
        }
        
        @Override
        public final boolean isCancelled() {
            return this.serial.isDisposed();
        }
        
        public void onComplete() {
            this.complete();
        }
        
        public final void onError(final Throwable t) {
            if (!this.tryOnError(t)) {
                RxJavaPlugins.onError(t);
            }
        }
        
        public abstract void onNext(final T p0);
        
        public void onRequested() {
        }
        
        public void onUnsubscribed() {
        }
        
        public final void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                cg.d.w0((AtomicLong)this, n);
                this.onRequested();
            }
        }
        
        public final long requested() {
            return this.get();
        }
        
        public final i<T> serialize() {
            return new SerializedEmitter<T>(this);
        }
        
        @Override
        public final void setCancellable(final f f) {
            this.setDisposable((df2.a)new CancellableDisposable(f));
        }
        
        @Override
        public final void setDisposable(final df2.a a) {
            this.serial.update(a);
        }
        
        @Override
        public String toString() {
            return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
        }
        
        public boolean tryOnError(final Throwable t) {
            return this.error(t);
        }
    }
    
    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T>
    {
        private static final long serialVersionUID = 2427151001689639875L;
        public volatile boolean done;
        public Throwable error;
        public final qf2.a<T> queue;
        public final AtomicInteger wip;
        
        public BufferAsyncEmitter(final c<? super T> c, final int n) {
            super(c);
            this.queue = new qf2.a<T>(n);
            this.wip = new AtomicInteger();
        }
        
        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            final nt2.c<? super T> downstream = (nt2.c<? super T>)super.downstream;
            final qf2.a<T> queue = this.queue;
            int addAndGet = 1;
            do {
                final long value = this.get();
                long n = 0L;
                long n2;
                while (true) {
                    n2 = lcmp(n, value);
                    if (n2 == 0) {
                        break;
                    }
                    if (this.isCancelled()) {
                        queue.clear();
                        return;
                    }
                    final boolean done = this.done;
                    final T poll = queue.poll();
                    final boolean b = poll == null;
                    if (done && b) {
                        final Throwable error = this.error;
                        if (error != null) {
                            this.error(error);
                        }
                        else {
                            this.complete();
                        }
                        return;
                    }
                    if (b) {
                        break;
                    }
                    downstream.onNext((Object)poll);
                    ++n;
                }
                if (n2 == 0) {
                    if (this.isCancelled()) {
                        queue.clear();
                        return;
                    }
                    final boolean done2 = this.done;
                    final boolean empty = queue.isEmpty();
                    if (done2 && empty) {
                        final Throwable error2 = this.error;
                        if (error2 != null) {
                            this.error(error2);
                        }
                        else {
                            this.complete();
                        }
                        return;
                    }
                }
                if (n != 0L) {
                    cg.d.E3((AtomicLong)this, n);
                }
            } while ((addAndGet = this.wip.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void onComplete() {
            this.done = true;
            this.drain();
        }
        
        @Override
        public void onNext(final T t) {
            if (!this.done) {
                if (!this.isCancelled()) {
                    if (t == null) {
                        this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    this.queue.offer(t);
                    this.drain();
                }
            }
        }
        
        @Override
        public void onRequested() {
            this.drain();
        }
        
        @Override
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
        
        @Override
        public boolean tryOnError(final Throwable t) {
            if (!this.done && !this.isCancelled()) {
                Throwable error;
                if ((error = t) == null) {
                    error = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                this.error = error;
                this.done = true;
                this.drain();
                return true;
            }
            return false;
        }
    }
    
    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T>
    {
        private static final long serialVersionUID = 4023437720691792495L;
        public volatile boolean done;
        public Throwable error;
        public final AtomicReference<T> queue;
        public final AtomicInteger wip;
        
        public LatestAsyncEmitter(final c<? super T> c) {
            super(c);
            this.queue = new AtomicReference<T>();
            this.wip = new AtomicInteger();
        }
        
        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            final nt2.c<? super T> downstream = (nt2.c<? super T>)super.downstream;
            final AtomicReference<T> queue = this.queue;
            int addAndGet = 1;
            do {
                final long value = this.get();
                long n = 0L;
                long n2;
                int n3;
                while (true) {
                    n2 = lcmp(n, value);
                    n3 = 0;
                    if (n2 == 0) {
                        break;
                    }
                    if (this.isCancelled()) {
                        queue.lazySet(null);
                        return;
                    }
                    final boolean done = this.done;
                    final T andSet = queue.getAndSet(null);
                    final boolean b = andSet == null;
                    if (done && b) {
                        final Throwable error = this.error;
                        if (error != null) {
                            this.error(error);
                        }
                        else {
                            this.complete();
                        }
                        return;
                    }
                    if (b) {
                        break;
                    }
                    downstream.onNext((Object)andSet);
                    ++n;
                }
                if (n2 == 0) {
                    if (this.isCancelled()) {
                        queue.lazySet(null);
                        return;
                    }
                    final boolean done2 = this.done;
                    int n4 = n3;
                    if (queue.get() == null) {
                        n4 = 1;
                    }
                    if (done2 && n4 != 0) {
                        final Throwable error2 = this.error;
                        if (error2 != null) {
                            this.error(error2);
                        }
                        else {
                            this.complete();
                        }
                        return;
                    }
                }
                if (n != 0L) {
                    cg.d.E3((AtomicLong)this, n);
                }
            } while ((addAndGet = this.wip.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void onComplete() {
            this.done = true;
            this.drain();
        }
        
        @Override
        public void onNext(final T t) {
            if (!this.done) {
                if (!this.isCancelled()) {
                    if (t == null) {
                        this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    this.queue.set(t);
                    this.drain();
                }
            }
        }
        
        @Override
        public void onRequested() {
            this.drain();
        }
        
        @Override
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }
        
        @Override
        public boolean tryOnError(final Throwable error) {
            if (!this.done && !this.isCancelled()) {
                if (error == null) {
                    this.onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
                }
                this.error = error;
                this.done = true;
                this.drain();
                return true;
            }
            return false;
        }
    }
    
    public static final class MissingEmitter<T> extends BaseEmitter<T>
    {
        private static final long serialVersionUID = 3776720187248809713L;
        
        public MissingEmitter(final c<? super T> c) {
            super(c);
        }
        
        @Override
        public void onNext(final T t) {
            if (this.isCancelled()) {
                return;
            }
            if (t != null) {
                super.downstream.onNext((Object)t);
                long value;
                do {
                    value = this.get();
                } while (value != 0L && !this.compareAndSet(value, value - 1L));
                return;
            }
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
    }
    
    public abstract static class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T>
    {
        private static final long serialVersionUID = 4127754106204442833L;
        
        public NoOverflowBaseAsyncEmitter(final c<? super T> c) {
            super(c);
        }
        
        @Override
        public final void onNext(final T t) {
            if (this.isCancelled()) {
                return;
            }
            if (t == null) {
                this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (this.get() != 0L) {
                super.downstream.onNext((Object)t);
                cg.d.E3((AtomicLong)this, 1L);
            }
            else {
                this.onOverflow();
            }
        }
        
        public abstract void onOverflow();
    }
    
    public static final class SerializedEmitter<T> extends AtomicInteger implements i<T>
    {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final BaseEmitter<T> emitter;
        public final AtomicThrowable error;
        public final if2.i<T> queue;
        
        public SerializedEmitter(final BaseEmitter<T> emitter) {
            this.emitter = emitter;
            this.error = new AtomicThrowable();
            this.queue = (if2.i<T>)new qf2.a(16);
        }
        
        public void drain() {
            if (this.getAndIncrement() == 0) {
                this.drainLoop();
            }
        }
        
        public void drainLoop() {
            final BaseEmitter<T> emitter = this.emitter;
            final if2.i<T> queue = this.queue;
            final AtomicThrowable error = this.error;
            int addAndGet = 1;
            while (!emitter.isCancelled()) {
                if (((AtomicReference)error).get() != null) {
                    ((if2.j)queue).clear();
                    emitter.onError(error.terminate());
                    return;
                }
                final boolean done = this.done;
                final Object poll = queue.poll();
                final boolean b = poll == null;
                if (done && b) {
                    emitter.onComplete();
                    return;
                }
                if (b) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    emitter.onNext((T)poll);
                }
            }
            ((if2.j)queue).clear();
        }
        
        @Override
        public boolean isCancelled() {
            return this.emitter.isCancelled();
        }
        
        public void onComplete() {
            if (!this.emitter.isCancelled()) {
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
            if (!this.emitter.isCancelled()) {
                if (!this.done) {
                    if (t == null) {
                        this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    Label_0095: {
                        if (this.get() == 0 && this.compareAndSet(0, 1)) {
                            this.emitter.onNext(t);
                            if (this.decrementAndGet() == 0) {
                                return;
                            }
                            break Label_0095;
                        }
                        final if2.i<T> queue = this.queue;
                        synchronized (queue) {
                            ((if2.j)queue).offer((Object)t);
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
        
        public long requested() {
            return this.emitter.requested();
        }
        
        public i<T> serialize() {
            return this;
        }
        
        @Override
        public void setCancellable(final f cancellable) {
            this.emitter.setCancellable(cancellable);
        }
        
        @Override
        public void setDisposable(final df2.a disposable) {
            this.emitter.setDisposable(disposable);
        }
        
        @Override
        public String toString() {
            return this.emitter.toString();
        }
        
        public boolean tryOnError(final Throwable t) {
            if (!this.emitter.isCancelled()) {
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
