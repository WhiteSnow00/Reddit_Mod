// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import af2.e0;
import ff2.o;
import af2.g0;
import af2.c0;

public final class SingleZipArray<T, R> extends c0<R>
{
    public final g0<? extends T>[] f;
    public final o<? super Object[], ? extends R> g;
    
    public SingleZipArray(final o g, final g0[] f) {
        this.f = (g0<? extends T>[])f;
        this.g = (o<? super Object[], ? extends R>)g;
    }
    
    @Override
    public final void G(final e0<? super R> e0) {
        final g0<? extends T>[] f = this.f;
        final int length = f.length;
        int i = 0;
        if (length == 1) {
            f[0].a((e0)new io.reactivex.internal.operators.single.a.a((af2.e0<? super Object>)e0, (ff2.o<? super Object, ?>)new a()));
            return;
        }
        final ZipCoordinator zipCoordinator = new ZipCoordinator((af2.e0<? super Object>)e0, length, this.g);
        e0.onSubscribe((df2.a)zipCoordinator);
        while (i < length) {
            if (zipCoordinator.isDisposed()) {
                return;
            }
            final g0<? extends T> g0 = f[i];
            if (g0 == null) {
                zipCoordinator.innerError(new NullPointerException("One of the sources is null"), i);
                return;
            }
            g0.a((e0)zipCoordinator.observers[i]);
            ++i;
        }
    }
    
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements df2.a
    {
        private static final long serialVersionUID = -5556924161382950569L;
        public final e0<? super R> downstream;
        public final ZipSingleObserver<T>[] observers;
        public final Object[] values;
        public final o<? super Object[], ? extends R> zipper;
        
        public ZipCoordinator(final e0<? super R> downstream, final int n, final o<? super Object[], ? extends R> zipper) {
            super(n);
            this.downstream = downstream;
            this.zipper = zipper;
            final ZipSingleObserver[] observers = new ZipSingleObserver[n];
            for (int i = 0; i < n; ++i) {
                observers[i] = new ZipSingleObserver((ZipCoordinator<Object, ?>)this, i);
            }
            this.observers = observers;
            this.values = new Object[n];
        }
        
        public void dispose() {
            int i = 0;
            if (this.getAndSet(0) > 0) {
                for (ZipSingleObserver<T>[] observers = this.observers; i < observers.length; ++i) {
                    observers[i].dispose();
                }
            }
        }
        
        public void disposeExcept(final int n) {
            final ZipSingleObserver<T>[] observers = this.observers;
            final int length = observers.length;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= n) {
                    break;
                }
                observers[n2].dispose();
                ++n2;
            }
            while (++n3 < length) {
                observers[n3].dispose();
            }
        }
        
        public void innerError(final Throwable t, final int n) {
            if (this.getAndSet(0) > 0) {
                this.disposeExcept(n);
                this.downstream.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void innerSuccess(final T t, final int n) {
            this.values[n] = t;
            if (this.decrementAndGet() == 0) {
                try {
                    final Object apply = this.zipper.apply((Object)this.values);
                    hf2.a.b(apply, "The zipper returned a null value");
                    this.downstream.onSuccess(apply);
                }
                finally {
                    final Throwable t2;
                    xd.a.t1(t2);
                    this.downstream.onError(t2);
                }
            }
        }
        
        public boolean isDisposed() {
            return this.get() <= 0;
        }
    }
    
    public static final class ZipSingleObserver<T> extends AtomicReference<df2.a> implements e0<T>
    {
        private static final long serialVersionUID = 3323743579927613702L;
        public final int index;
        public final ZipCoordinator<T, ?> parent;
        
        public ZipSingleObserver(final ZipCoordinator<T, ?> parent, final int index) {
            this.parent = parent;
            this.index = index;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public void onError(final Throwable t) {
            this.parent.innerError(t, this.index);
        }
        
        public void onSubscribe(final df2.a a) {
            DisposableHelper.setOnce((AtomicReference)this, a);
        }
        
        public void onSuccess(final T t) {
            this.parent.innerSuccess(t, this.index);
        }
    }
    
    public final class a implements o<T, R>
    {
        public final SingleZipArray f;
        
        public a(final SingleZipArray f) {
            this.f = f;
        }
        
        public final R apply(final T t) throws Exception {
            final Object apply = this.f.g.apply((Object)new Object[] { t });
            hf2.a.b(apply, "The zipper returned a null value");
            return (R)apply;
        }
    }
}
