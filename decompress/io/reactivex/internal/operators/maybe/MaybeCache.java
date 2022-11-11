// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import if2.a;
import ff2.r;
import java.util.concurrent.atomic.AtomicReference;
import ff2.p;
import ff2.n;

public final class MaybeCache<T> extends n<T> implements p<T>
{
    public static final MaybeCache.MaybeCache$CacheDisposable[] j;
    public static final MaybeCache.MaybeCache$CacheDisposable[] k;
    public final AtomicReference<r<T>> f;
    public final AtomicReference<MaybeCache.MaybeCache$CacheDisposable<T>[]> g;
    public T h;
    public Throwable i;
    
    static {
        j = new MaybeCache.MaybeCache$CacheDisposable[0];
        k = new MaybeCache.MaybeCache$CacheDisposable[0];
    }
    
    public MaybeCache(final n n) {
        this.f = new AtomicReference<r<T>>((r<T>)n);
        this.g = new AtomicReference<MaybeCache.MaybeCache$CacheDisposable<T>[]>((MaybeCache.MaybeCache$CacheDisposable<T>[])MaybeCache.j);
    }
    
    public final void C(final MaybeCache.MaybeCache$CacheDisposable<T> maybeCache$CacheDisposable) {
        int i;
    Label_0150:
        do {
            final MaybeCache.MaybeCache$CacheDisposable[] array = this.g.get();
            final int length = ((MaybeCache.MaybeCache$CacheDisposable<T>[])array).length;
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
                if (array[n3] == maybeCache$CacheDisposable) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (n4 < 0) {
                return;
            }
            MaybeCache.MaybeCache$CacheDisposable[] j;
            if (length == 1) {
                j = MaybeCache.j;
            }
            else {
                j = new MaybeCache.MaybeCache$CacheDisposable[length - 1];
                System.arraycopy(array, 0, j, 0, n4);
                System.arraycopy(array, n4 + 1, j, n4, length - n4 - 1);
            }
            final AtomicReference<MaybeCache.MaybeCache$CacheDisposable<T>[]> g = this.g;
            while (!g.compareAndSet((MaybeCache.MaybeCache$CacheDisposable<T>[])array, (MaybeCache.MaybeCache$CacheDisposable<T>[])j)) {
                if (g.get() != array) {
                    i = n2;
                    continue Label_0150;
                }
            }
            i = 1;
        } while (i == 0);
    }
    
    public final void onComplete() {
        for (final MaybeCache.MaybeCache$CacheDisposable maybeCache$CacheDisposable : this.g.getAndSet((MaybeCache.MaybeCache$CacheDisposable<T>[])MaybeCache.k)) {
            if (!maybeCache$CacheDisposable.isDisposed()) {
                maybeCache$CacheDisposable.downstream.onComplete();
            }
        }
    }
    
    public final void onError(final Throwable i) {
        this.i = i;
        for (final MaybeCache.MaybeCache$CacheDisposable maybeCache$CacheDisposable : this.g.getAndSet((MaybeCache.MaybeCache$CacheDisposable<T>[])MaybeCache.k)) {
            if (!maybeCache$CacheDisposable.isDisposed()) {
                maybeCache$CacheDisposable.downstream.onError(i);
            }
        }
    }
    
    public final void onSubscribe(final a a) {
    }
    
    public final void onSuccess(final T h) {
        this.h = h;
        for (final MaybeCache.MaybeCache$CacheDisposable maybeCache$CacheDisposable : this.g.getAndSet((MaybeCache.MaybeCache$CacheDisposable<T>[])MaybeCache.k)) {
            if (!maybeCache$CacheDisposable.isDisposed()) {
                maybeCache$CacheDisposable.downstream.onSuccess((Object)h);
            }
        }
    }
    
    public final void s(final p<? super T> p) {
        final MaybeCache.MaybeCache$CacheDisposable maybeCache$CacheDisposable = new MaybeCache.MaybeCache$CacheDisposable((p)p, this);
        p.onSubscribe((a)maybeCache$CacheDisposable);
    Label_0113:
        while (true) {
            boolean b;
            do {
                final MaybeCache.MaybeCache$CacheDisposable[] array = this.g.get();
                final MaybeCache.MaybeCache$CacheDisposable[] k = MaybeCache.k;
                final int n = 0;
                b = false;
                if (array == k) {
                    final int n2 = n;
                    if (n2 == 0) {
                        if (!maybeCache$CacheDisposable.isDisposed()) {
                            final Throwable i = this.i;
                            if (i != null) {
                                p.onError(i);
                            }
                            else {
                                final T h = this.h;
                                if (h != null) {
                                    p.onSuccess((Object)h);
                                }
                                else {
                                    p.onComplete();
                                }
                            }
                        }
                        return;
                    }
                    if (maybeCache$CacheDisposable.isDisposed()) {
                        this.C((MaybeCache.MaybeCache$CacheDisposable<T>)maybeCache$CacheDisposable);
                        return;
                    }
                    final r r = this.f.getAndSet(null);
                    if (r != null) {
                        r.b((p)this);
                    }
                    return;
                }
                else {
                    final int length = ((MaybeCache.MaybeCache$CacheDisposable<T>[])array).length;
                    final MaybeCache.MaybeCache$CacheDisposable[] array2 = new MaybeCache.MaybeCache$CacheDisposable[length + 1];
                    System.arraycopy(array, 0, array2, 0, length);
                    array2[length] = maybeCache$CacheDisposable;
                    final AtomicReference<MaybeCache.MaybeCache$CacheDisposable<T>[]> g = this.g;
                    while (!g.compareAndSet((MaybeCache.MaybeCache$CacheDisposable<T>[])array, (MaybeCache.MaybeCache$CacheDisposable<T>[])array2)) {
                        if (g.get() != array) {
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
}
