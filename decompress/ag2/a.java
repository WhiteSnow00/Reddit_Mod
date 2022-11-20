// 
// Decompiled by Procyon v0.6.0
// 

package ag2;

import af2.a0;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> extends c<T>
{
    public static final Object[] l;
    public static final a.a$a[] m;
    public static final a.a$a[] n;
    public final AtomicReference<Object> f;
    public final AtomicReference<a.a$a<T>[]> g;
    public final Lock h;
    public final Lock i;
    public final AtomicReference<Throwable> j;
    public long k;
    
    static {
        l = new Object[0];
        m = new a.a$a[0];
        n = new a.a$a[0];
    }
    
    public a() {
        final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.h = reentrantReadWriteLock.readLock();
        this.i = reentrantReadWriteLock.writeLock();
        this.g = new AtomicReference<a.a$a<T>[]>((a.a$a<T>[])a.m);
        this.f = new AtomicReference<Object>();
        this.j = new AtomicReference<Throwable>();
    }
    
    public static <T> a<T> b(final T t) {
        final a a = new a();
        final AtomicReference<Object> f = a.f;
        if (t != null) {
            f.lazySet(t);
            return a;
        }
        throw new NullPointerException("defaultValue is null");
    }
    
    public final T d() {
        final Object value = this.f.get();
        if (!NotificationLite.isComplete(value) && !NotificationLite.isError(value)) {
            return (T)NotificationLite.getValue(value);
        }
        return null;
    }
    
    public final void e(final a.a$a<T> a$a) {
        int i;
    Label_0150:
        do {
            final a.a$a[] array = this.g.get();
            final int length = ((a.a$a<T>[])array).length;
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
                if (array[n3] == a$a) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (n4 < 0) {
                return;
            }
            a.a$a[] m;
            if (length == 1) {
                m = a.m;
            }
            else {
                m = new a.a$a[length - 1];
                System.arraycopy(array, 0, m, 0, n4);
                System.arraycopy(array, n4 + 1, m, n4, length - n4 - 1);
            }
            final AtomicReference<a.a$a<T>[]> g = this.g;
            while (!g.compareAndSet((a.a$a<T>[])array, (a.a$a<T>[])m)) {
                if (g.get() != array) {
                    i = n2;
                    continue Label_0150;
                }
            }
            i = 1;
        } while (i == 0);
    }
    
    public final Throwable getThrowable() {
        final Object value = this.f.get();
        if (NotificationLite.isError(value)) {
            return NotificationLite.getError(value);
        }
        return null;
    }
    
    public final boolean hasComplete() {
        return NotificationLite.isComplete(this.f.get());
    }
    
    public final boolean hasObservers() {
        return this.g.get().length != 0;
    }
    
    public final boolean hasThrowable() {
        return NotificationLite.isError(this.f.get());
    }
    
    public final void onComplete() {
        final AtomicReference<Throwable> j = this.j;
        final Throwable a = ExceptionHelper.a;
        while (true) {
            do {
                final boolean compareAndSet = j.compareAndSet(null, a);
                final int n = 0;
                if (compareAndSet) {
                    final boolean b = true;
                    if (!b) {
                        return;
                    }
                    final Object complete = NotificationLite.complete();
                    final AtomicReference<a.a$a<T>[]> g = this.g;
                    final a.a$a[] n2 = ag2.a.n;
                    final a.a$a[] array = g.getAndSet((a.a$a<T>[])n2);
                    if (array != n2) {
                        this.i.lock();
                        ++this.k;
                        this.f.lazySet(complete);
                        this.i.unlock();
                    }
                    for (int length = ((a.a$a<T>[])array).length, i = n; i < length; ++i) {
                        array[i].a(this.k, complete);
                    }
                    return;
                }
            } while (j.get() == null);
            final boolean b = false;
            continue;
        }
    }
    
    public final void onError(final Throwable t) {
        if (t != null) {
            final AtomicReference<Throwable> j = this.j;
            while (true) {
                do {
                    final boolean compareAndSet = j.compareAndSet(null, t);
                    final int n = 0;
                    if (compareAndSet) {
                        final boolean b = true;
                        if (!b) {
                            RxJavaPlugins.onError(t);
                            return;
                        }
                        final Object error = NotificationLite.error(t);
                        final AtomicReference<a.a$a<T>[]> g = this.g;
                        final a.a$a[] n2 = a.n;
                        final a.a$a[] array = g.getAndSet((a.a$a<T>[])n2);
                        if (array != n2) {
                            this.i.lock();
                            ++this.k;
                            this.f.lazySet(error);
                            this.i.unlock();
                        }
                        for (int length = ((a.a$a<T>[])array).length, i = n; i < length; ++i) {
                            array[i].a(this.k, error);
                        }
                        return;
                    }
                } while (j.get() == null);
                final boolean b = false;
                continue;
            }
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    
    public final void onNext(final T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.j.get() != null) {
            return;
        }
        final Object next = NotificationLite.next((Object)t);
        this.i.lock();
        ++this.k;
        this.f.lazySet(next);
        this.i.unlock();
        final a.a$a[] array = this.g.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a(this.k, next);
        }
    }
    
    public final void onSubscribe(final df2.a a) {
        if (this.j.get() != null) {
            a.dispose();
        }
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final a.a$a a$a = new a.a$a((a0)a0, this);
        a0.onSubscribe((df2.a)a$a);
    Label_0107:
        while (true) {
            boolean b;
            do {
                final a.a$a[] array = this.g.get();
                if (array == a.n) {
                    final boolean b2 = false;
                    if (b2) {
                        if (a$a.l) {
                            this.e((a.a$a<T>)a$a);
                            return;
                        }
                        if (a$a.l) {
                            return;
                        }
                        synchronized (a$a) {
                            if (a$a.l) {
                                return;
                            }
                            if (a$a.h) {
                                return;
                            }
                            final a g = a$a.g;
                            final Lock h = g.h;
                            h.lock();
                            a$a.m = g.k;
                            final Object value = g.f.get();
                            h.unlock();
                            a$a.i = (value != null);
                            a$a.h = true;
                            monitorexit(a$a);
                            if (value == null) {
                                return;
                            }
                            if (a$a.test(value)) {
                                return;
                            }
                            while (!a$a.l) {
                                synchronized (a$a) {
                                    final tf2.a j = a$a.j;
                                    if (j == null) {
                                        a$a.i = false;
                                        break;
                                    }
                                    a$a.j = null;
                                    monitorexit(a$a);
                                    j.c((tf2.a.a$a)a$a);
                                    continue;
                                }
                            }
                            return;
                        }
                    }
                    final Throwable t = this.j.get();
                    if (t == ExceptionHelper.a) {
                        a0.onComplete();
                    }
                    else {
                        a0.onError(t);
                    }
                    return;
                }
                final int length = ((a.a$a<T>[])array).length;
                final a.a$a[] array2 = new a.a$a[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = a$a;
                final AtomicReference<a.a$a<T>[]> g2 = this.g;
                while (!g2.compareAndSet((a.a$a<T>[])array, (a.a$a<T>[])array2)) {
                    if (g2.get() != array) {
                        b = false;
                        continue Label_0107;
                    }
                }
                b = true;
            } while (!b);
            final boolean b2 = true;
            continue;
        }
    }
}
