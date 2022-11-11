// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import nf2.e;
import java.util.concurrent.atomic.AtomicInteger;
import ej2.c0;
import mf2.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import ff2.y;
import kf2.o;
import ff2.a0;

public final class ObservableScalarXMap
{
    public static boolean a(final a0 a0, final o o, final y y) {
        if (y instanceof Callable) {
            try {
                final Object call = ((Callable)y).call();
                if (call == null) {
                    EmptyDisposable.complete(a0);
                    return true;
                }
                try {
                    final Object apply = o.apply(call);
                    a.b(apply, "The mapper returned a null ObservableSource");
                    final y y2 = (y)apply;
                    if (y2 instanceof Callable) {
                        try {
                            final Object call2 = ((Callable<Object>)y2).call();
                            if (call2 == null) {
                                EmptyDisposable.complete(a0);
                                return true;
                            }
                            final ScalarDisposable scalarDisposable = new ScalarDisposable(a0, call2);
                            a0.onSubscribe((if2.a)scalarDisposable);
                            scalarDisposable.run();
                            return true;
                        }
                        finally {
                            return;
                        }
                    }
                    y2.subscribe(a0);
                    return true;
                }
                finally {
                    return;
                }
            }
            finally {
                final Throwable t;
                c0.i4(t);
                EmptyDisposable.error(t, a0);
                return true;
            }
        }
        return false;
    }
    
    public static final class ScalarDisposable<T> extends AtomicInteger implements e<T>, Runnable
    {
        public static final int FUSED = 1;
        public static final int ON_COMPLETE = 3;
        public static final int ON_NEXT = 2;
        public static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        public final a0<? super T> observer;
        public final T value;
        
        public ScalarDisposable(final a0<? super T> observer, final T value) {
            this.observer = observer;
            this.value = value;
        }
        
        public void clear() {
            this.lazySet(3);
        }
        
        public void dispose() {
            this.set(3);
        }
        
        public boolean isDisposed() {
            return this.get() == 3;
        }
        
        public boolean isEmpty() {
            final int value = this.get();
            boolean b = true;
            if (value == 1) {
                b = false;
            }
            return b;
        }
        
        public boolean offer(final T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }
        
        public boolean offer(final T t, final T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
        
        public T poll() throws Exception {
            if (this.get() == 1) {
                this.lazySet(3);
                return this.value;
            }
            return null;
        }
        
        public int requestFusion(final int n) {
            if ((n & 0x1) != 0x0) {
                this.lazySet(1);
                return 1;
            }
            return 0;
        }
        
        public void run() {
            if (this.get() == 0 && this.compareAndSet(0, 2)) {
                this.observer.onNext((Object)this.value);
                if (this.get() == 2) {
                    this.lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }
}
