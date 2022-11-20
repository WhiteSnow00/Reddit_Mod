// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import df2.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import af2.g0;
import af2.e0;
import af2.c0;

public final class SingleCache<T> extends c0<T> implements e0<T>
{
    public static final SingleCache.SingleCache$CacheDisposable[] k;
    public static final SingleCache.SingleCache$CacheDisposable[] l;
    public final g0<? extends T> f;
    public final AtomicInteger g;
    public final AtomicReference<SingleCache.SingleCache$CacheDisposable<T>[]> h;
    public T i;
    public Throwable j;
    
    static {
        k = new SingleCache.SingleCache$CacheDisposable[0];
        l = new SingleCache.SingleCache$CacheDisposable[0];
    }
    
    public SingleCache(final g0<? extends T> f) {
        this.f = f;
        this.g = new AtomicInteger();
        this.h = new AtomicReference<SingleCache.SingleCache$CacheDisposable<T>[]>((SingleCache.SingleCache$CacheDisposable<T>[])SingleCache.k);
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        final SingleCache.SingleCache$CacheDisposable singleCache$CacheDisposable = new SingleCache.SingleCache$CacheDisposable((e0)e0, this);
        e0.onSubscribe((a)singleCache$CacheDisposable);
    Label_0113:
        while (true) {
            boolean b;
            do {
                final SingleCache.SingleCache$CacheDisposable[] array = this.h.get();
                final SingleCache.SingleCache$CacheDisposable[] l = SingleCache.l;
                final int n = 0;
                b = false;
                if (array == l) {
                    final int n2 = n;
                    if (n2 != 0) {
                        if (singleCache$CacheDisposable.isDisposed()) {
                            this.S((SingleCache.SingleCache$CacheDisposable<T>)singleCache$CacheDisposable);
                        }
                        if (this.g.getAndIncrement() == 0) {
                            this.f.a((e0)this);
                        }
                        return;
                    }
                    final Throwable j = this.j;
                    if (j != null) {
                        e0.onError(j);
                    }
                    else {
                        e0.onSuccess((Object)this.i);
                    }
                    return;
                }
                else {
                    final int length = ((SingleCache.SingleCache$CacheDisposable<T>[])array).length;
                    final SingleCache.SingleCache$CacheDisposable[] array2 = new SingleCache.SingleCache$CacheDisposable[length + 1];
                    System.arraycopy(array, 0, array2, 0, length);
                    array2[length] = singleCache$CacheDisposable;
                    final AtomicReference<SingleCache.SingleCache$CacheDisposable<T>[]> h = this.h;
                    while (!h.compareAndSet((SingleCache.SingleCache$CacheDisposable<T>[])array, (SingleCache.SingleCache$CacheDisposable<T>[])array2)) {
                        if (h.get() != array) {
                            continue Label_0113;
                        }
                    }
                    b = true;
                }
            } while (!b);
            final int n2 = 1;
            continue;
        }
    }
    
    public final void S(final SingleCache.SingleCache$CacheDisposable<T> singleCache$CacheDisposable) {
        int i;
    Label_0150:
        do {
            final SingleCache.SingleCache$CacheDisposable[] array = this.h.get();
            final int length = ((SingleCache.SingleCache$CacheDisposable<T>[])array).length;
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
                if (array[n3] == singleCache$CacheDisposable) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (n4 < 0) {
                return;
            }
            SingleCache.SingleCache$CacheDisposable[] k;
            if (length == 1) {
                k = SingleCache.k;
            }
            else {
                k = new SingleCache.SingleCache$CacheDisposable[length - 1];
                System.arraycopy(array, 0, k, 0, n4);
                System.arraycopy(array, n4 + 1, k, n4, length - n4 - 1);
            }
            final AtomicReference<SingleCache.SingleCache$CacheDisposable<T>[]> h = this.h;
            while (!h.compareAndSet((SingleCache.SingleCache$CacheDisposable<T>[])array, (SingleCache.SingleCache$CacheDisposable<T>[])k)) {
                if (h.get() != array) {
                    i = n2;
                    continue Label_0150;
                }
            }
            i = 1;
        } while (i == 0);
    }
    
    public final void onError(final Throwable j) {
        this.j = j;
        for (final SingleCache.SingleCache$CacheDisposable singleCache$CacheDisposable : this.h.getAndSet((SingleCache.SingleCache$CacheDisposable<T>[])SingleCache.l)) {
            if (!singleCache$CacheDisposable.isDisposed()) {
                singleCache$CacheDisposable.downstream.onError(j);
            }
        }
    }
    
    public final void onSubscribe(final a a) {
    }
    
    public final void onSuccess(final T i) {
        this.i = i;
        for (final SingleCache.SingleCache$CacheDisposable singleCache$CacheDisposable : this.h.getAndSet((SingleCache.SingleCache$CacheDisposable<T>[])SingleCache.l)) {
            if (!singleCache$CacheDisposable.isDisposed()) {
                singleCache$CacheDisposable.downstream.onSuccess((Object)i);
            }
        }
    }
}
