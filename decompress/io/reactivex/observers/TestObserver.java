// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.observers;

import java.util.List;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import af2.c;
import af2.e0;
import af2.p;
import af2.a0;
import vf2.a;

public final class TestObserver<T> extends a<T, TestObserver<T>> implements a0<T>, p<T>, e0<T>, c
{
    public final a0<? super T> j;
    public final AtomicReference<df2.a> k;
    
    public TestObserver() {
        final EmptyObserver instance = EmptyObserver.INSTANCE;
        this.k = new AtomicReference<df2.a>();
        this.j = (a0<? super T>)instance;
    }
    
    public final void dispose() {
        DisposableHelper.dispose((AtomicReference)this.k);
    }
    
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed((df2.a)this.k.get());
    }
    
    public final void onComplete() {
        if (!super.i) {
            super.i = true;
            if (this.k.get() == null) {
                ((List<IllegalStateException>)super.h).add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.j.onComplete();
        }
        finally {
            super.f.countDown();
        }
    }
    
    public final void onError(final Throwable t) {
        if (!super.i) {
            super.i = true;
            if (this.k.get() == null) {
                ((List<IllegalStateException>)super.h).add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (t == null) {
                ((List<NullPointerException>)super.h).add(new NullPointerException("onError received a null Throwable"));
            }
            else {
                ((List<Throwable>)super.h).add(t);
            }
            this.j.onError(t);
        }
        finally {
            super.f.countDown();
        }
    }
    
    public final void onNext(final T t) {
        if (!super.i) {
            super.i = true;
            if (this.k.get() == null) {
                ((List<IllegalStateException>)super.h).add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        ((List<T>)super.g).add(t);
        if (t == null) {
            ((List<NullPointerException>)super.h).add(new NullPointerException("onNext received a null value"));
        }
        this.j.onNext((Object)t);
    }
    
    public final void onSubscribe(final df2.a a) {
        Thread.currentThread();
        if (a == null) {
            ((List<NullPointerException>)super.h).add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        final AtomicReference<df2.a> k = this.k;
        while (true) {
            while (!k.compareAndSet(null, a)) {
                if (k.get() != null) {
                    final boolean b = false;
                    if (!b) {
                        a.dispose();
                        if (this.k.get() != DisposableHelper.DISPOSED) {
                            final VolatileSizeArrayList h = super.h;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("onSubscribe received multiple subscriptions: ");
                            sb.append(a);
                            ((List<IllegalStateException>)h).add(new IllegalStateException(sb.toString()));
                        }
                        return;
                    }
                    this.j.onSubscribe(a);
                    return;
                }
            }
            final boolean b = true;
            continue;
        }
    }
    
    public final void onSuccess(final T t) {
        this.onNext(t);
        this.onComplete();
    }
    
    public enum EmptyObserver implements a0<Object>
    {
        private static final EmptyObserver[] $VALUES;
        
        INSTANCE;
        
        public void onComplete() {
        }
        
        public void onError(final Throwable t) {
        }
        
        public void onNext(final Object o) {
        }
        
        public void onSubscribe(final df2.a a) {
        }
    }
}
