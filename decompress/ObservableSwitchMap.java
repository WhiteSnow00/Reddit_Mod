// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import nf2.f;
import io.reactivex.plugins.RxJavaPlugins;
import ej2.c0;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import nf2.e;
import io.reactivex.internal.disposables.DisposableHelper;
import nf2.j;
import java.util.concurrent.atomic.AtomicReference;
import ff2.a0;
import ff2.y;
import kf2.o;
import sf2.a;

public final class ObservableSwitchMap<T, R> extends a<T, R>
{
    public final o<? super T, ? extends y<? extends R>> g;
    public final int h;
    public final boolean i;
    
    public ObservableSwitchMap(final y<T> y, final o<? super T, ? extends y<? extends R>> g, final int h, final boolean i) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        if (ObservableScalarXMap.a(a0, this.g, super.f)) {
            return;
        }
        super.f.subscribe((a0)new SwitchMapObserver((ff2.a0<? super Object>)a0, (kf2.o<? super Object, ? extends ff2.y<?>>)this.g, this.h, this.i));
    }
    
    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<if2.a> implements a0<R>
    {
        private static final long serialVersionUID = 3837284832786408377L;
        public final int bufferSize;
        public volatile boolean done;
        public final long index;
        public final SwitchMapObserver<T, R> parent;
        public volatile j<R> queue;
        
        public SwitchMapInnerObserver(final SwitchMapObserver<T, R> parent, final long index, final int bufferSize) {
            this.parent = parent;
            this.index = index;
            this.bufferSize = bufferSize;
        }
        
        public void cancel() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.drain();
            }
        }
        
        public void onError(final Throwable t) {
            this.parent.innerError(this, t);
        }
        
        public void onNext(final R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.offer((Object)r);
                }
                this.parent.drain();
            }
        }
        
        public void onSubscribe(final if2.a a) {
            if (DisposableHelper.setOnce((AtomicReference)this, a)) {
                if (a instanceof e) {
                    final e e = (e)a;
                    final int requestFusion = ((f)e).requestFusion(7);
                    if (requestFusion == 1) {
                        this.queue = (j<R>)e;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.queue = (j<R>)e;
                        return;
                    }
                }
                this.queue = (j<R>)new vf2.a(this.bufferSize);
            }
        }
    }
    
    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements a0<T>, if2.a
    {
        public static final SwitchMapInnerObserver<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        public final AtomicReference<SwitchMapInnerObserver<T, R>> active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final a0<? super R> downstream;
        public final AtomicThrowable errors;
        public final o<? super T, ? extends y<? extends R>> mapper;
        public volatile long unique;
        public if2.a upstream;
        
        static {
            (CANCELLED = new SwitchMapInnerObserver(null, -1L, 1)).cancel();
        }
        
        public SwitchMapObserver(final a0<? super R> downstream, final o<? super T, ? extends y<? extends R>> mapper, final int bufferSize, final boolean delayErrors) {
            this.active = new AtomicReference<SwitchMapInnerObserver<T, R>>();
            this.downstream = downstream;
            this.mapper = mapper;
            this.bufferSize = bufferSize;
            this.delayErrors = delayErrors;
            this.errors = new AtomicThrowable();
        }
        
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                this.disposeInner();
            }
        }
        
        public void disposeInner() {
            final SwitchMapInnerObserver switchMapInnerObserver = this.active.get();
            final SwitchMapInnerObserver<Object, Object> cancelled = SwitchMapObserver.CANCELLED;
            if (switchMapInnerObserver != cancelled) {
                final SwitchMapInnerObserver switchMapInnerObserver2 = this.active.getAndSet((SwitchMapInnerObserver<T, R>)cancelled);
                if (switchMapInnerObserver2 != cancelled && switchMapInnerObserver2 != null) {
                    switchMapInnerObserver2.cancel();
                }
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final a0<? super R> downstream = this.downstream;
            final AtomicReference<SwitchMapInnerObserver<T, R>> active = this.active;
            final boolean delayErrors = this.delayErrors;
            int addAndGet = 1;
        Label_0026:
            while (!this.cancelled) {
                if (this.done) {
                    final boolean b = active.get() == null;
                    if (delayErrors) {
                        if (b) {
                            final Throwable t = this.errors.get();
                            if (t != null) {
                                downstream.onError(t);
                            }
                            else {
                                downstream.onComplete();
                            }
                            return;
                        }
                    }
                    else {
                        if (this.errors.get() != null) {
                            downstream.onError(this.errors.terminate());
                            return;
                        }
                        if (b) {
                            downstream.onComplete();
                            return;
                        }
                    }
                }
                final SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver)active.get();
                Label_0498: {
                    if (switchMapInnerObserver != null) {
                        final j<R> queue = ((SwitchMapInnerObserver)switchMapInnerObserver).queue;
                        if (queue != null) {
                            if (((SwitchMapInnerObserver)switchMapInnerObserver).done) {
                                final boolean empty = queue.isEmpty();
                                if (delayErrors) {
                                    if (empty) {
                                        while (!active.compareAndSet(switchMapInnerObserver, null)) {
                                            if (active.get() != switchMapInnerObserver) {
                                                break;
                                            }
                                        }
                                        continue;
                                    }
                                }
                                else {
                                    if (this.errors.get() != null) {
                                        downstream.onError(this.errors.terminate());
                                        return;
                                    }
                                    if (empty) {
                                        while (!active.compareAndSet(switchMapInnerObserver, null)) {
                                            if (active.get() != switchMapInnerObserver) {
                                                break;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                            while (!this.cancelled) {
                                boolean b2 = false;
                                Label_0479: {
                                    if (switchMapInnerObserver == active.get()) {
                                        if (!delayErrors && this.errors.get() != null) {
                                            downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                        final boolean done = ((SwitchMapInnerObserver)switchMapInnerObserver).done;
                                        Object o = null;
                                        try {
                                            queue.poll();
                                        }
                                        finally {
                                            final Throwable t2;
                                            c0.i4(t2);
                                            this.errors.addThrowable(t2);
                                            while (true) {
                                                while (!active.compareAndSet(switchMapInnerObserver, null)) {
                                                    if (active.get() != switchMapInnerObserver) {
                                                        if (!delayErrors) {
                                                            this.disposeInner();
                                                            this.upstream.dispose();
                                                            this.done = true;
                                                        }
                                                        else {
                                                            switchMapInnerObserver.cancel();
                                                        }
                                                        b2 = true;
                                                        o = null;
                                                    }
                                                }
                                                continue;
                                            }
                                        }
                                        final boolean b3 = o == null;
                                        if (done && b3) {
                                            while (!active.compareAndSet(switchMapInnerObserver, null)) {
                                                if (active.get() != switchMapInnerObserver) {
                                                    break;
                                                }
                                            }
                                        }
                                        else {
                                            if (b3) {
                                                break Label_0479;
                                            }
                                            downstream.onNext(o);
                                            continue;
                                        }
                                    }
                                    b2 = true;
                                }
                                if (b2) {
                                    continue Label_0026;
                                }
                                break Label_0498;
                            }
                            return;
                        }
                    }
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        public void innerError(final SwitchMapInnerObserver<T, R> switchMapInnerObserver, final Throwable t) {
            if (switchMapInnerObserver.index == this.unique && this.errors.addThrowable(t)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    this.done = true;
                }
                switchMapInnerObserver.done = true;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public boolean isDisposed() {
            return this.cancelled;
        }
        
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.drain();
            }
        }
        
        public void onError(final Throwable t) {
            if (!this.done && this.errors.addThrowable(t)) {
                if (!this.delayErrors) {
                    this.disposeInner();
                }
                this.done = true;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            final long unique = this.unique + 1L;
            this.unique = unique;
            final SwitchMapInnerObserver switchMapInnerObserver = this.active.get();
            if (switchMapInnerObserver != null) {
                switchMapInnerObserver.cancel();
            }
            try {
                final Object apply = this.mapper.apply((Object)t);
                mf2.a.b(apply, "The ObservableSource returned is null");
                final y y = (y)apply;
                final SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver((SwitchMapObserver<Object, Object>)this, unique, this.bufferSize);
                boolean b;
            Label_0129:
                do {
                    final SwitchMapInnerObserver switchMapInnerObserver3 = this.active.get();
                    if (switchMapInnerObserver3 == SwitchMapObserver.CANCELLED) {
                        return;
                    }
                    final AtomicReference<SwitchMapInnerObserver<T, R>> active = this.active;
                    while (!active.compareAndSet(switchMapInnerObserver3, (SwitchMapInnerObserver<T, R>)switchMapInnerObserver2)) {
                        if (active.get() != switchMapInnerObserver3) {
                            b = false;
                            continue Label_0129;
                        }
                    }
                    b = true;
                } while (!b);
                y.subscribe((a0)switchMapInnerObserver2);
            }
            finally {
                final Throwable t2;
                c0.i4(t2);
                this.upstream.dispose();
                this.onError(t2);
            }
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
            }
        }
    }
}
