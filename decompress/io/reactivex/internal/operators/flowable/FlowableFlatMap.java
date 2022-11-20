// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import if2.f;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.Callable;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import if2.i;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import if2.j;
import nt2.d;
import java.util.concurrent.atomic.AtomicReference;
import af2.l;
import lf2.f1;
import nt2.c;
import af2.g;
import nt2.b;
import ff2.o;
import lf2.a;

public final class FlowableFlatMap<T, U> extends a<T, U>
{
    public final o<? super T, ? extends b<? extends U>> g;
    public final boolean h;
    public final int i;
    public final int j;
    
    public FlowableFlatMap(final g<T> g, final o<? super T, ? extends b<? extends U>> g2, final boolean h, final int i, final int j) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final c<? super U> c) {
        if (f1.a(c, this.g, (b)super.f)) {
            return;
        }
        super.f.subscribe(new MergeSubscriber<Object, Object>(c, this.g, this.h, this.i, this.j));
    }
    
    public static final class InnerSubscriber<T, U> extends AtomicReference<d> implements l<U>, df2.a
    {
        private static final long serialVersionUID = -4606175640614850599L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;
        public final long id;
        public final int limit;
        public final MergeSubscriber<T, U> parent;
        public long produced;
        public volatile j<U> queue;
        
        public InnerSubscriber(final MergeSubscriber<T, U> parent, final long id) {
            this.id = id;
            this.parent = parent;
            final int bufferSize = parent.bufferSize;
            this.bufferSize = bufferSize;
            this.limit = bufferSize >> 2;
        }
        
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }
        
        public boolean isDisposed() {
            return this.get() == SubscriptionHelper.CANCELLED;
        }
        
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }
        
        public void onError(final Throwable t) {
            this.lazySet((d)SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, t);
        }
        
        public void onNext(final U u) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u, this);
            }
            else {
                this.parent.drain();
            }
        }
        
        @Override
        public void onSubscribe(final d d) {
            if (SubscriptionHelper.setOnce(this, d)) {
                if (d instanceof if2.g) {
                    final if2.g g = (if2.g)d;
                    final int requestFusion = ((f)g).requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = (j<U>)g;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = (j<U>)g;
                    }
                }
                d.request((long)this.bufferSize);
            }
        }
        
        public void requestMore(long produced) {
            if (this.fusionMode != 1) {
                produced += this.produced;
                if (produced >= this.limit) {
                    this.produced = 0L;
                    this.get().request(produced);
                }
                else {
                    this.produced = produced;
                }
            }
        }
    }
    
    public static final class MergeSubscriber<T, U> extends AtomicInteger implements l<T>, d
    {
        public static final InnerSubscriber<?, ?>[] CANCELLED;
        public static final InnerSubscriber<?, ?>[] EMPTY;
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final c<? super U> downstream;
        public final AtomicThrowable errs;
        public long lastId;
        public int lastIndex;
        public final o<? super T, ? extends b<? extends U>> mapper;
        public final int maxConcurrency;
        public volatile i<U> queue;
        public final AtomicLong requested;
        public int scalarEmitted;
        public final int scalarLimit;
        public final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        public long uniqueId;
        public d upstream;
        
        static {
            EMPTY = new InnerSubscriber[0];
            CANCELLED = new InnerSubscriber[0];
        }
        
        public MergeSubscriber(final c<? super U> downstream, final o<? super T, ? extends b<? extends U>> mapper, final boolean delayErrors, final int maxConcurrency, final int bufferSize) {
            this.errs = new AtomicThrowable();
            final AtomicReference subscribers = new AtomicReference();
            this.subscribers = subscribers;
            this.requested = new AtomicLong();
            this.downstream = downstream;
            this.mapper = mapper;
            this.delayErrors = delayErrors;
            this.maxConcurrency = maxConcurrency;
            this.bufferSize = bufferSize;
            this.scalarLimit = Math.max(1, maxConcurrency >> 1);
            subscribers.lazySet(MergeSubscriber.EMPTY);
        }
        
        public boolean addInner(final InnerSubscriber<T, U> innerSubscriber) {
            boolean b;
        Label_0092:
            do {
                final InnerSubscriber[] array = this.subscribers.get();
                final InnerSubscriber<?, ?>[] cancelled = MergeSubscriber.CANCELLED;
                b = false;
                if (array == cancelled) {
                    innerSubscriber.dispose();
                    return false;
                }
                final int length = array.length;
                final InnerSubscriber[] array2 = new InnerSubscriber[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = innerSubscriber;
                final AtomicReference<InnerSubscriber<?, ?>[]> subscribers = this.subscribers;
                while (!subscribers.compareAndSet(array, array2)) {
                    if (subscribers.get() != array) {
                        continue Label_0092;
                    }
                }
                b = true;
            } while (!b);
            return true;
        }
        
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.disposeAll();
                if (this.getAndIncrement() == 0) {
                    final i<U> queue = this.queue;
                    if (queue != null) {
                        ((j)queue).clear();
                    }
                }
            }
        }
        
        public boolean checkTerminate() {
            if (this.cancelled) {
                this.clearScalarQueue();
                return true;
            }
            if (!this.delayErrors && ((AtomicReference<Object>)this.errs).get() != null) {
                this.clearScalarQueue();
                final Throwable terminate = this.errs.terminate();
                if (terminate != ExceptionHelper.a) {
                    this.downstream.onError(terminate);
                }
                return true;
            }
            return false;
        }
        
        public void clearScalarQueue() {
            final i<U> queue = this.queue;
            if (queue != null) {
                ((j)queue).clear();
            }
        }
        
        public void disposeAll() {
            final InnerSubscriber[] array = this.subscribers.get();
            final InnerSubscriber<?, ?>[] cancelled = MergeSubscriber.CANCELLED;
            if (array != cancelled) {
                final InnerSubscriber[] array2 = this.subscribers.getAndSet(cancelled);
                if (array2 != cancelled) {
                    for (int length = array2.length, i = 0; i < length; ++i) {
                        array2[i].dispose();
                    }
                    final Throwable terminate = this.errs.terminate();
                    if (terminate != null && terminate != ExceptionHelper.a) {
                        RxJavaPlugins.onError(terminate);
                    }
                }
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() == 0) {
                this.drainLoop();
            }
        }
        
        public void drainLoop() {
            final c<? super U> downstream = this.downstream;
            int addAndGet = 1;
            while (!this.checkTerminate()) {
                final i<U> queue = this.queue;
                long n = this.requested.get();
                final boolean b = n == Long.MAX_VALUE;
                long n2 = 0L;
                long n3 = n;
                long n4 = n2;
                if (queue != null) {
                    while (true) {
                        long n5 = 0L;
                        Object poll = null;
                        while (n != 0L) {
                            poll = queue.poll();
                            if (this.checkTerminate()) {
                                return;
                            }
                            if (poll == null) {
                                break;
                            }
                            downstream.onNext(poll);
                            ++n2;
                            ++n5;
                            --n;
                        }
                        if (n5 != 0L) {
                            if (b) {
                                n = Long.MAX_VALUE;
                            }
                            else {
                                n = this.requested.addAndGet(-n5);
                            }
                        }
                        n3 = n;
                        n4 = n2;
                        if (n == 0L) {
                            break;
                        }
                        if (poll == null) {
                            n3 = n;
                            n4 = n2;
                            break;
                        }
                    }
                }
                final boolean done = this.done;
                final i<U> queue2 = this.queue;
                final InnerSubscriber[] array = this.subscribers.get();
                final int length = array.length;
                if (done && (queue2 == null || ((j)queue2).isEmpty()) && length == 0) {
                    final Throwable terminate = this.errs.terminate();
                    if (terminate != ExceptionHelper.a) {
                        if (terminate == null) {
                            downstream.onComplete();
                        }
                        else {
                            downstream.onError(terminate);
                        }
                    }
                    return;
                }
                long n9;
                int n11;
                if (length != 0) {
                    final long lastId = this.lastId;
                    final int lastIndex = this.lastIndex;
                    int lastIndex2 = 0;
                    Label_0405: {
                        if (length > lastIndex) {
                            lastIndex2 = lastIndex;
                            if (array[lastIndex].id == lastId) {
                                break Label_0405;
                            }
                        }
                        if (length <= (lastIndex2 = lastIndex)) {
                            lastIndex2 = 0;
                        }
                        for (int n6 = 0; n6 < length && array[lastIndex2].id != lastId; ++n6) {
                            if (++lastIndex2 == length) {
                                lastIndex2 = 0;
                            }
                        }
                        this.lastIndex = lastIndex2;
                        this.lastId = array[lastIndex2].id;
                    }
                    final int n7 = 0;
                    final int n8 = 0;
                    n9 = n4;
                    final int n10 = length;
                    long addAndGet2 = n3;
                    int i = n8;
                    int lastIndex3 = lastIndex2;
                    n11 = n7;
                Label_0768:
                    while (i < n10) {
                        if (this.checkTerminate()) {
                            return;
                        }
                        final InnerSubscriber innerSubscriber = array[lastIndex3];
                        final Throwable t = null;
                        while (!this.checkTerminate()) {
                            final j<U> queue3 = innerSubscriber.queue;
                            Label_0762: {
                                long n12;
                                if (queue3 == null) {
                                    n12 = addAndGet2;
                                }
                                else {
                                    long n13 = 0L;
                                    while (addAndGet2 != 0L) {
                                        try {
                                            final Object poll2 = queue3.poll();
                                            if (poll2 != null) {
                                                downstream.onNext(poll2);
                                                if (this.checkTerminate()) {
                                                    return;
                                                }
                                                --addAndGet2;
                                                ++n13;
                                                continue;
                                            }
                                        }
                                        finally {
                                            xd.a.t1(t);
                                            innerSubscriber.dispose();
                                            this.errs.addThrowable(t);
                                            if (!this.delayErrors) {
                                                this.upstream.cancel();
                                            }
                                            if (this.checkTerminate()) {
                                                return;
                                            }
                                            this.removeInner(innerSubscriber);
                                            ++i;
                                            n11 = 1;
                                            break Label_0762;
                                        }
                                        break;
                                    }
                                    if (n13 != 0L) {
                                        if (!b) {
                                            addAndGet2 = this.requested.addAndGet(-n13);
                                        }
                                        else {
                                            addAndGet2 = Long.MAX_VALUE;
                                        }
                                        innerSubscriber.requestMore(n13);
                                    }
                                    n12 = addAndGet2;
                                    if (addAndGet2 != 0L) {
                                        if (t != null) {
                                            continue;
                                        }
                                        n12 = addAndGet2;
                                    }
                                }
                                final boolean done2 = innerSubscriber.done;
                                final j<U> queue4 = innerSubscriber.queue;
                                if (done2 && (queue4 == null || queue4.isEmpty())) {
                                    this.removeInner(innerSubscriber);
                                    if (this.checkTerminate()) {
                                        return;
                                    }
                                    ++n9;
                                    n11 = 1;
                                }
                                if (n12 == 0L) {
                                    break Label_0768;
                                }
                                if (++lastIndex3 == n10) {
                                    lastIndex3 = 0;
                                }
                                addAndGet2 = n12;
                            }
                            ++i;
                            continue Label_0768;
                        }
                        return;
                    }
                    this.lastIndex = lastIndex3;
                    this.lastId = array[lastIndex3].id;
                }
                else {
                    n9 = n4;
                    n11 = 0;
                }
                if (n9 != 0L && !this.cancelled) {
                    this.upstream.request(n9);
                }
                if (n11 != 0) {
                    continue;
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        public j<U> getInnerQueue(final InnerSubscriber<T, U> innerSubscriber) {
            Object queue;
            if ((queue = innerSubscriber.queue) == null) {
                queue = new SpscArrayQueue(this.bufferSize);
                innerSubscriber.queue = (if2.j<U>)queue;
            }
            return (j<U>)queue;
        }
        
        public j<U> getMainQueue() {
            Object queue;
            if ((queue = this.queue) == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    queue = new qf2.a(this.bufferSize);
                }
                else {
                    queue = new SpscArrayQueue(this.maxConcurrency);
                }
                this.queue = (i<U>)queue;
            }
            return (j<U>)queue;
        }
        
        public void innerError(final InnerSubscriber<T, U> innerSubscriber, final Throwable t) {
            if (this.errs.addThrowable(t)) {
                innerSubscriber.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    final InnerSubscriber[] array = this.subscribers.getAndSet(MergeSubscriber.CANCELLED);
                    for (int length = array.length, i = 0; i < length; ++i) {
                        array[i].dispose();
                    }
                }
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.drain();
        }
        
        public void onError(final Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
                return;
            }
            if (this.errs.addThrowable(t)) {
                this.done = true;
                if (!this.delayErrors) {
                    final InnerSubscriber[] array = this.subscribers.getAndSet(MergeSubscriber.CANCELLED);
                    for (int length = array.length, i = 0; i < length; ++i) {
                        array[i].dispose();
                    }
                }
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            if (this.done) {
                return;
            }
            try {
                final Object apply = this.mapper.apply((Object)t);
                hf2.a.b(apply, "The mapper returned a null Publisher");
                final b b = (b)apply;
                if (b instanceof Callable) {
                    try {
                        final Object call = ((Callable<Object>)b).call();
                        if (call != null) {
                            this.tryEmitScalar((U)call);
                            return;
                        }
                        if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                            return;
                        }
                        final int scalarEmitted = this.scalarEmitted + 1;
                        this.scalarEmitted = scalarEmitted;
                        final int scalarLimit = this.scalarLimit;
                        if (scalarEmitted == scalarLimit) {
                            this.scalarEmitted = 0;
                            this.upstream.request((long)scalarLimit);
                        }
                        return;
                    }
                    finally {
                        final Throwable t2;
                        xd.a.t1(t2);
                        this.errs.addThrowable(t2);
                        this.drain();
                        return;
                    }
                }
                final long uniqueId = this.uniqueId;
                this.uniqueId = 1L + uniqueId;
                final InnerSubscriber innerSubscriber = new InnerSubscriber((MergeSubscriber<Object, Object>)this, uniqueId);
                if (this.addInner((InnerSubscriber<T, U>)innerSubscriber)) {
                    b.subscribe((c)innerSubscriber);
                }
            }
            finally {
                final Throwable t3;
                xd.a.t1(t3);
                this.upstream.cancel();
                this.onError(t3);
            }
        }
        
        @Override
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
                if (!this.cancelled) {
                    final int maxConcurrency = this.maxConcurrency;
                    if (maxConcurrency == Integer.MAX_VALUE) {
                        upstream.request(Long.MAX_VALUE);
                    }
                    else {
                        upstream.request((long)maxConcurrency);
                    }
                }
            }
        }
        
        public void removeInner(final InnerSubscriber<T, U> innerSubscriber) {
            int i;
        Label_0150:
            do {
                final InnerSubscriber[] array = this.subscribers.get();
                final int length = array.length;
                if (length == 0) {
                    return;
                }
                final int n = -1;
                final int n2 = 0;
                int n3 = 0;
                int n4;
                while (true) {
                    n4 = n;
                    if (n3 >= length) {
                        break;
                    }
                    if (array[n3] == innerSubscriber) {
                        n4 = n3;
                        break;
                    }
                    ++n3;
                }
                if (n4 < 0) {
                    return;
                }
                InnerSubscriber<?, ?>[] empty;
                if (length == 1) {
                    empty = MergeSubscriber.EMPTY;
                }
                else {
                    empty = new InnerSubscriber[length - 1];
                    System.arraycopy(array, 0, empty, 0, n4);
                    System.arraycopy(array, n4 + 1, empty, n4, length - n4 - 1);
                }
                final AtomicReference<InnerSubscriber<?, ?>[]> subscribers = this.subscribers;
                while (!subscribers.compareAndSet(array, empty)) {
                    if (subscribers.get() != array) {
                        i = n2;
                        continue Label_0150;
                    }
                }
                i = 1;
            } while (i == 0);
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                cg.d.w0(this.requested, n);
                this.drain();
            }
        }
        
        public void tryEmit(final U u, final InnerSubscriber<T, U> innerSubscriber) {
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                final long value = this.requested.get();
                final if2.j<U> queue = innerSubscriber.queue;
                if (value != 0L && (queue == null || queue.isEmpty())) {
                    this.downstream.onNext((Object)u);
                    if (value != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1L);
                }
                else {
                    if2.j<U> innerQueue;
                    if ((innerQueue = queue) == null) {
                        innerQueue = this.getInnerQueue(innerSubscriber);
                    }
                    if (!innerQueue.offer((Object)u)) {
                        this.onError((Throwable)new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            else {
                Object queue2;
                if ((queue2 = innerSubscriber.queue) == null) {
                    queue2 = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = (if2.j<U>)queue2;
                }
                if (!((j)queue2).offer((Object)u)) {
                    this.onError((Throwable)new MissingBackpressureException("Inner queue full?!"));
                    return;
                }
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.drainLoop();
        }
        
        public void tryEmitScalar(final U u) {
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                final long value = this.requested.get();
                final i<U> queue = this.queue;
                if (value != 0L && (queue == null || ((j)queue).isEmpty())) {
                    this.downstream.onNext((Object)u);
                    if (value != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        final int scalarEmitted = this.scalarEmitted + 1;
                        this.scalarEmitted = scalarEmitted;
                        final int scalarLimit = this.scalarLimit;
                        if (scalarEmitted == scalarLimit) {
                            this.scalarEmitted = 0;
                            this.upstream.request((long)scalarLimit);
                        }
                    }
                }
                else {
                    j mainQueue;
                    if ((mainQueue = (j)queue) == null) {
                        mainQueue = this.getMainQueue();
                    }
                    if (!mainQueue.offer((Object)u)) {
                        this.onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            else {
                if (!this.getMainQueue().offer((Object)u)) {
                    this.onError(new IllegalStateException("Scalar queue full?!"));
                    return;
                }
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.drainLoop();
        }
    }
}
