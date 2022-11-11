// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.RxJavaPlugins;
import lw0.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import sf2.k1;
import io.reactivex.internal.disposables.EmptyDisposable;
import ej2.c0;
import java.util.Arrays;
import ff2.a0;
import kf2.o;
import ff2.y;
import sf2.a;

public final class ObservableWithLatestFromMany<T, R> extends sf2.a<T, R>
{
    public final y<?>[] g;
    public final Iterable<? extends y<?>> h;
    public final o<? super Object[], R> i;
    
    public ObservableWithLatestFromMany(final y<T> y, final Iterable<? extends y<?>> h, final o<? super Object[], R> i) {
        super((y)y);
        this.g = null;
        this.h = h;
        this.i = i;
    }
    
    public ObservableWithLatestFromMany(final y<T> y, final y<?>[] g, final o<? super Object[], R> i) {
        super((y)y);
        this.g = g;
        this.h = null;
        this.i = i;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        y[] g = this.g;
        int length = 0;
        Label_0110: {
            if (g == null) {
                y[] array = new y[8];
                try {
                    final Iterator<? extends y<?>> iterator = this.h.iterator();
                    int n = 0;
                    while (true) {
                        g = array;
                        length = n;
                        if (!iterator.hasNext()) {
                            break Label_0110;
                        }
                        final y y = iterator.next();
                        g = array;
                        if (n == array.length) {
                            g = Arrays.copyOf(array, (n >> 1) + n);
                        }
                        g[n] = y;
                        ++n;
                        array = g;
                    }
                }
                finally {
                    final Throwable t;
                    c0.i4(t);
                    EmptyDisposable.error(t, (a0)a0);
                    return;
                }
            }
            length = g.length;
        }
        if (length == 0) {
            new k1(super.f, (o)new a()).subscribeActual((a0)a0);
            return;
        }
        final WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver((ff2.a0<? super Object>)a0, (kf2.o<? super Object[], Object>)this.i, length);
        a0.onSubscribe((if2.a)withLatestFromObserver);
        withLatestFromObserver.subscribe(g, length);
        super.f.subscribe((a0)withLatestFromObserver);
    }
    
    public static final class WithLatestFromObserver<T, R> extends AtomicInteger implements a0<T>, if2.a
    {
        private static final long serialVersionUID = 1577321883966341961L;
        public final o<? super Object[], R> combiner;
        public volatile boolean done;
        public final a0<? super R> downstream;
        public final AtomicThrowable error;
        public final WithLatestInnerObserver[] observers;
        public final AtomicReference<if2.a> upstream;
        public final AtomicReferenceArray<Object> values;
        
        public WithLatestFromObserver(final a0<? super R> downstream, final o<? super Object[], R> combiner, final int n) {
            this.downstream = downstream;
            this.combiner = combiner;
            final WithLatestInnerObserver[] observers = new WithLatestInnerObserver[n];
            for (int i = 0; i < n; ++i) {
                observers[i] = new WithLatestInnerObserver((WithLatestFromObserver<?, ?>)this, i);
            }
            this.observers = observers;
            this.values = new AtomicReferenceArray<Object>(n);
            this.upstream = new AtomicReference<if2.a>();
            this.error = new AtomicThrowable();
        }
        
        public void cancelAllBut(final int n) {
            final WithLatestInnerObserver[] observers = this.observers;
            for (int i = 0; i < observers.length; ++i) {
                if (i != n) {
                    observers[i].dispose();
                }
            }
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            final WithLatestInnerObserver[] observers = this.observers;
            for (int length = observers.length, i = 0; i < length; ++i) {
                observers[i].dispose();
            }
        }
        
        public void innerComplete(final int n, final boolean b) {
            if (!b) {
                this.done = true;
                this.cancelAllBut(n);
                b.A1((a0)this.downstream, (AtomicInteger)this, this.error);
            }
        }
        
        public void innerError(final int n, final Throwable t) {
            this.done = true;
            DisposableHelper.dispose((AtomicReference)this.upstream);
            this.cancelAllBut(n);
            b.C1((a0)this.downstream, t, (AtomicInteger)this, this.error);
        }
        
        public void innerNext(final int n, final Object o) {
            this.values.set(n, o);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((if2.a)this.upstream.get());
        }
        
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.cancelAllBut(-1);
                b.A1((a0)this.downstream, (AtomicInteger)this, this.error);
            }
        }
        
        public void onError(final Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.done = true;
            this.cancelAllBut(-1);
            b.C1((a0)this.downstream, t, (AtomicInteger)this, this.error);
        }
        
        public void onNext(final T t) {
            if (this.done) {
                return;
            }
            final AtomicReferenceArray<Object> values = this.values;
            final int length = values.length();
            final Object[] array = new Object[length + 1];
            int i = 0;
            array[0] = t;
            while (i < length) {
                final Object value = values.get(i);
                if (value == null) {
                    return;
                }
                ++i;
                array[i] = value;
            }
            try {
                final Object apply = this.combiner.apply((Object)array);
                mf2.a.b(apply, "combiner returned a null value");
                b.F1((a0)this.downstream, apply, (AtomicInteger)this, this.error);
            }
            finally {
                final Throwable t2;
                c0.i4(t2);
                this.dispose();
                this.onError(t2);
            }
        }
        
        public void onSubscribe(final if2.a a) {
            DisposableHelper.setOnce((AtomicReference)this.upstream, a);
        }
        
        public void subscribe(final y<?>[] array, final int n) {
            final WithLatestInnerObserver[] observers = this.observers;
            final AtomicReference<if2.a> upstream = this.upstream;
            for (int n2 = 0; n2 < n && !DisposableHelper.isDisposed((if2.a)upstream.get()) && !this.done; ++n2) {
                array[n2].subscribe((a0)observers[n2]);
            }
        }
    }
    
    public static final class WithLatestInnerObserver extends AtomicReference<if2.a> implements a0<Object>
    {
        private static final long serialVersionUID = 3256684027868224024L;
        public boolean hasValue;
        public final int index;
        public final WithLatestFromObserver<?, ?> parent;
        
        public WithLatestInnerObserver(final WithLatestFromObserver<?, ?> parent, final int index) {
            this.parent = parent;
            this.index = index;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }
        
        public void onError(final Throwable t) {
            this.parent.innerError(this.index, t);
        }
        
        public void onNext(final Object o) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, o);
        }
        
        public void onSubscribe(final if2.a a) {
            DisposableHelper.setOnce((AtomicReference)this, a);
        }
    }
    
    public final class a implements o<T, R>
    {
        public final R apply(final T t) throws Exception {
            final Object apply = ObservableWithLatestFromMany.this.i.apply((Object)new Object[] { t });
            mf2.a.b(apply, "The combiner returned a null value");
            return (R)apply;
        }
    }
}
