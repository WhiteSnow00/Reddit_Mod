// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.subjects;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import ff2.a0;
import if2.a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import fg2.c;

public final class AsyncSubject<T> extends c<T>
{
    public static final AsyncSubject.AsyncSubject$AsyncDisposable[] i;
    public static final AsyncSubject.AsyncSubject$AsyncDisposable[] j;
    public final AtomicReference<AsyncSubject.AsyncSubject$AsyncDisposable<T>[]> f;
    public Throwable g;
    public T h;
    
    static {
        i = new AsyncSubject.AsyncSubject$AsyncDisposable[0];
        j = new AsyncSubject.AsyncSubject$AsyncDisposable[0];
    }
    
    public AsyncSubject() {
        this.f = new AtomicReference<AsyncSubject.AsyncSubject$AsyncDisposable<T>[]>((AsyncSubject.AsyncSubject$AsyncDisposable<T>[])AsyncSubject.i);
    }
    
    public final void c(final AsyncSubject.AsyncSubject$AsyncDisposable<T> asyncSubject$AsyncDisposable) {
        int i;
    Label_0150:
        do {
            final AsyncSubject.AsyncSubject$AsyncDisposable[] array = this.f.get();
            final int length = ((AsyncSubject.AsyncSubject$AsyncDisposable<T>[])array).length;
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
                if (array[n3] == asyncSubject$AsyncDisposable) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (n4 < 0) {
                return;
            }
            AsyncSubject.AsyncSubject$AsyncDisposable[] j;
            if (length == 1) {
                j = AsyncSubject.i;
            }
            else {
                j = new AsyncSubject.AsyncSubject$AsyncDisposable[length - 1];
                System.arraycopy(array, 0, j, 0, n4);
                System.arraycopy(array, n4 + 1, j, n4, length - n4 - 1);
            }
            final AtomicReference<AsyncSubject.AsyncSubject$AsyncDisposable<T>[]> f = this.f;
            while (!f.compareAndSet((AsyncSubject.AsyncSubject$AsyncDisposable<T>[])array, (AsyncSubject.AsyncSubject$AsyncDisposable<T>[])j)) {
                if (f.get() != array) {
                    i = n2;
                    continue Label_0150;
                }
            }
            i = 1;
        } while (i == 0);
    }
    
    public final Throwable getThrowable() {
        Throwable g;
        if (this.f.get() == AsyncSubject.j) {
            g = this.g;
        }
        else {
            g = null;
        }
        return g;
    }
    
    public final boolean hasComplete() {
        return this.f.get() == AsyncSubject.j && this.g == null;
    }
    
    public final boolean hasObservers() {
        return this.f.get().length != 0;
    }
    
    public final boolean hasThrowable() {
        return this.f.get() == AsyncSubject.j && this.g != null;
    }
    
    public final void onComplete() {
        final AsyncSubject.AsyncSubject$AsyncDisposable<T>[] value = this.f.get();
        final AsyncSubject.AsyncSubject$AsyncDisposable[] j = AsyncSubject.j;
        if (value == j) {
            return;
        }
        final T h = this.h;
        final AsyncSubject.AsyncSubject$AsyncDisposable[] array = this.f.getAndSet((AsyncSubject.AsyncSubject$AsyncDisposable<T>[])j);
        final int n = 0;
        int i = 0;
        if (h == null) {
            while (i < array.length) {
                array[i].onComplete();
                ++i;
            }
        }
        else {
            for (int length = array.length, k = n; k < length; ++k) {
                ((DeferredScalarDisposable)array[k]).complete((Object)h);
            }
        }
    }
    
    public final void onError(final Throwable g) {
        if (g == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        final AsyncSubject.AsyncSubject$AsyncDisposable<T>[] value = this.f.get();
        final AsyncSubject.AsyncSubject$AsyncDisposable[] j = AsyncSubject.j;
        if (value == j) {
            RxJavaPlugins.onError(g);
            return;
        }
        this.h = null;
        this.g = g;
        final AsyncSubject.AsyncSubject$AsyncDisposable[] array = this.f.getAndSet((AsyncSubject.AsyncSubject$AsyncDisposable<T>[])j);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].onError(g);
        }
    }
    
    public final void onNext(final T h) {
        if (h == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.f.get() == AsyncSubject.j) {
            return;
        }
        this.h = h;
    }
    
    public final void onSubscribe(final a a) {
        if (this.f.get() == AsyncSubject.j) {
            a.dispose();
        }
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final AsyncSubject.AsyncSubject$AsyncDisposable asyncSubject$AsyncDisposable = new AsyncSubject.AsyncSubject$AsyncDisposable((a0)a0, this);
        a0.onSubscribe((a)asyncSubject$AsyncDisposable);
    Label_0113:
        while (true) {
            boolean b;
            do {
                final AsyncSubject.AsyncSubject$AsyncDisposable[] array = this.f.get();
                final AsyncSubject.AsyncSubject$AsyncDisposable[] j = AsyncSubject.j;
                final int n = 0;
                b = false;
                if (array == j) {
                    final int n2 = n;
                    if (n2 != 0) {
                        if (((DeferredScalarDisposable)asyncSubject$AsyncDisposable).isDisposed()) {
                            this.c((AsyncSubject.AsyncSubject$AsyncDisposable<T>)asyncSubject$AsyncDisposable);
                        }
                    }
                    else {
                        final Throwable g = this.g;
                        if (g != null) {
                            a0.onError(g);
                        }
                        else {
                            final T h = this.h;
                            if (h != null) {
                                ((DeferredScalarDisposable)asyncSubject$AsyncDisposable).complete((Object)h);
                            }
                            else {
                                asyncSubject$AsyncDisposable.onComplete();
                            }
                        }
                    }
                    return;
                }
                final int length = ((AsyncSubject.AsyncSubject$AsyncDisposable<T>[])array).length;
                final AsyncSubject.AsyncSubject$AsyncDisposable[] array2 = new AsyncSubject.AsyncSubject$AsyncDisposable[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = asyncSubject$AsyncDisposable;
                final AtomicReference<AsyncSubject.AsyncSubject$AsyncDisposable<T>[]> f = this.f;
                while (!f.compareAndSet((AsyncSubject.AsyncSubject$AsyncDisposable<T>[])array, (AsyncSubject.AsyncSubject$AsyncDisposable<T>[])array2)) {
                    if (f.get() != array) {
                        continue Label_0113;
                    }
                }
                b = true;
            } while (!b);
            final int n2 = 1;
            continue;
        }
    }
}
