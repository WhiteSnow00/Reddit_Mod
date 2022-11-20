// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.subjects;

import io.reactivex.plugins.RxJavaPlugins;
import df2.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import af2.e0;
import af2.c0;

public final class SingleSubject<T> extends c0<T> implements e0<T>
{
    public static final SingleDisposable[] j;
    public static final SingleDisposable[] k;
    public final AtomicReference<SingleDisposable<T>[]> f;
    public final AtomicBoolean g;
    public T h;
    public Throwable i;
    
    static {
        j = new SingleDisposable[0];
        k = new SingleDisposable[0];
    }
    
    public SingleSubject() {
        this.g = new AtomicBoolean();
        this.f = new AtomicReference<SingleDisposable<T>[]>(SingleSubject.j);
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        final SingleDisposable singleDisposable = new SingleDisposable((e0<? super T>)e0, (SingleSubject<T>)this);
        e0.onSubscribe((a)singleDisposable);
    Label_0113:
        while (true) {
            boolean b;
            do {
                final SingleDisposable[] array = this.f.get();
                final SingleDisposable[] k = SingleSubject.k;
                final int n = 0;
                b = false;
                if (array == k) {
                    final int n2 = n;
                    if (n2 != 0) {
                        if (singleDisposable.isDisposed()) {
                            this.T(singleDisposable);
                        }
                    }
                    else {
                        final Throwable i = this.i;
                        if (i != null) {
                            e0.onError(i);
                        }
                        else {
                            e0.onSuccess((Object)this.h);
                        }
                    }
                    return;
                }
                final int length = array.length;
                final SingleDisposable[] array2 = new SingleDisposable[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = singleDisposable;
                final AtomicReference<SingleDisposable<T>[]> f = this.f;
                while (!f.compareAndSet(array, array2)) {
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
    
    public final T S() {
        if (this.f.get() == SingleSubject.k) {
            return this.h;
        }
        return null;
    }
    
    public final void T(final SingleDisposable<T> singleDisposable) {
        int i;
    Label_0150:
        do {
            final SingleDisposable[] array = this.f.get();
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
                if (array[n3] == singleDisposable) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (n4 < 0) {
                return;
            }
            SingleDisposable[] j;
            if (length == 1) {
                j = SingleSubject.j;
            }
            else {
                j = new SingleDisposable[length - 1];
                System.arraycopy(array, 0, j, 0, n4);
                System.arraycopy(array, n4 + 1, j, n4, length - n4 - 1);
            }
            final AtomicReference<SingleDisposable<T>[]> f = this.f;
            while (!f.compareAndSet(array, j)) {
                if (f.get() != array) {
                    i = n2;
                    continue Label_0150;
                }
            }
            i = 1;
        } while (i == 0);
    }
    
    public final void onError(final Throwable i) {
        if (i != null) {
            final AtomicBoolean g = this.g;
            int j = 0;
            if (g.compareAndSet(false, true)) {
                this.i = i;
                for (SingleDisposable[] array = this.f.getAndSet(SingleSubject.k); j < array.length; ++j) {
                    array[j].downstream.onError(i);
                }
            }
            else {
                RxJavaPlugins.onError(i);
            }
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    
    public final void onSubscribe(final a a) {
        if (this.f.get() == SingleSubject.k) {
            a.dispose();
        }
    }
    
    public final void onSuccess(final T h) {
        if (h != null) {
            final AtomicBoolean g = this.g;
            int i = 0;
            if (g.compareAndSet(false, true)) {
                this.h = h;
                for (SingleDisposable[] array = this.f.getAndSet(SingleSubject.k); i < array.length; ++i) {
                    array[i].downstream.onSuccess((Object)h);
                }
            }
            return;
        }
        throw new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    
    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements a
    {
        private static final long serialVersionUID = -7650903191002190468L;
        public final e0<? super T> downstream;
        
        public SingleDisposable(final e0<? super T> downstream, final SingleSubject<T> singleSubject) {
            this.downstream = downstream;
            this.lazySet(singleSubject);
        }
        
        public void dispose() {
            final SingleSubject<T> singleSubject = this.getAndSet(null);
            if (singleSubject != null) {
                singleSubject.T(this);
            }
        }
        
        public boolean isDisposed() {
            return this.get() == null;
        }
    }
}
