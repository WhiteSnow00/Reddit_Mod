// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import ff2.a0;
import if2.a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import fg2.c;

public final class PublishSubject<T> extends c<T>
{
    public static final PublishDisposable[] EMPTY;
    public static final PublishDisposable[] TERMINATED;
    public Throwable error;
    public final AtomicReference<PublishDisposable<T>[]> subscribers;
    
    static {
        TERMINATED = new PublishDisposable[0];
        EMPTY = new PublishDisposable[0];
    }
    
    public PublishSubject() {
        this.subscribers = new AtomicReference<PublishDisposable<T>[]>(PublishSubject.EMPTY);
    }
    
    public static <T> PublishSubject<T> create() {
        return new PublishSubject<T>();
    }
    
    public boolean add(final PublishDisposable<T> publishDisposable) {
        boolean b;
    Label_0083:
        do {
            final PublishDisposable[] array = this.subscribers.get();
            final PublishDisposable[] terminated = PublishSubject.TERMINATED;
            b = false;
            if (array == terminated) {
                return false;
            }
            final int length = array.length;
            final PublishDisposable[] array2 = new PublishDisposable[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = publishDisposable;
            final AtomicReference<PublishDisposable<T>[]> subscribers = this.subscribers;
            while (!subscribers.compareAndSet(array, array2)) {
                if (subscribers.get() != array) {
                    continue Label_0083;
                }
            }
            b = true;
        } while (!b);
        return true;
    }
    
    public Throwable getThrowable() {
        if (this.subscribers.get() == PublishSubject.TERMINATED) {
            return this.error;
        }
        return null;
    }
    
    public boolean hasComplete() {
        return this.subscribers.get() == PublishSubject.TERMINATED && this.error == null;
    }
    
    public boolean hasObservers() {
        return this.subscribers.get().length != 0;
    }
    
    public boolean hasThrowable() {
        return this.subscribers.get() == PublishSubject.TERMINATED && this.error != null;
    }
    
    public void onComplete() {
        final PublishDisposable[] value = this.subscribers.get();
        final PublishDisposable[] terminated = PublishSubject.TERMINATED;
        if (value == terminated) {
            return;
        }
        final PublishDisposable[] array = this.subscribers.getAndSet(terminated);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].onComplete();
        }
    }
    
    public void onError(final Throwable error) {
        if (error == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        final PublishDisposable[] value = this.subscribers.get();
        final PublishDisposable[] terminated = PublishSubject.TERMINATED;
        if (value == terminated) {
            RxJavaPlugins.onError(error);
            return;
        }
        this.error = error;
        final PublishDisposable[] array = this.subscribers.getAndSet(terminated);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].onError(error);
        }
    }
    
    public void onNext(final T t) {
        if (t != null) {
            final PublishDisposable[] array = this.subscribers.get();
            for (int length = array.length, i = 0; i < length; ++i) {
                array[i].onNext(t);
            }
            return;
        }
        throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    
    public void onSubscribe(final a a) {
        if (this.subscribers.get() == PublishSubject.TERMINATED) {
            a.dispose();
        }
    }
    
    public void remove(final PublishDisposable<T> publishDisposable) {
        int i;
    Label_0162:
        do {
            final PublishDisposable[] array = this.subscribers.get();
            if (array == PublishSubject.TERMINATED) {
                break;
            }
            if (array == PublishSubject.EMPTY) {
                break;
            }
            final int length = array.length;
            final int n = -1;
            final int n2 = 0;
            int n3 = 0;
            int n4;
            while (true) {
                n4 = n;
                if (n3 >= length) {
                    break;
                }
                if (array[n3] == publishDisposable) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (n4 < 0) {
                return;
            }
            PublishDisposable[] empty;
            if (length == 1) {
                empty = PublishSubject.EMPTY;
            }
            else {
                empty = new PublishDisposable[length - 1];
                System.arraycopy(array, 0, empty, 0, n4);
                System.arraycopy(array, n4 + 1, empty, n4, length - n4 - 1);
            }
            final AtomicReference<PublishDisposable<T>[]> subscribers = this.subscribers;
            while (!subscribers.compareAndSet(array, empty)) {
                if (subscribers.get() != array) {
                    i = n2;
                    continue Label_0162;
                }
            }
            i = 1;
        } while (i == 0);
    }
    
    public void subscribeActual(final a0<? super T> a0) {
        final PublishDisposable publishDisposable = new PublishDisposable((a0<? super T>)a0, (PublishSubject<T>)this);
        a0.onSubscribe((a)publishDisposable);
        if (this.add(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                this.remove(publishDisposable);
            }
        }
        else {
            final Throwable error = this.error;
            if (error != null) {
                a0.onError(error);
            }
            else {
                a0.onComplete();
            }
        }
    }
    
    public static final class PublishDisposable<T> extends AtomicBoolean implements a
    {
        private static final long serialVersionUID = 3562861878281475070L;
        public final a0<? super T> downstream;
        public final PublishSubject<T> parent;
        
        public PublishDisposable(final a0<? super T> downstream, final PublishSubject<T> parent) {
            this.downstream = downstream;
            this.parent = parent;
        }
        
        public void dispose() {
            if (this.compareAndSet(false, true)) {
                this.parent.remove(this);
            }
        }
        
        public boolean isDisposed() {
            return this.get();
        }
        
        public void onComplete() {
            if (!this.get()) {
                this.downstream.onComplete();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.get()) {
                RxJavaPlugins.onError(t);
            }
            else {
                this.downstream.onError(t);
            }
        }
        
        public void onNext(final T t) {
            if (!this.get()) {
                this.downstream.onNext((Object)t);
            }
        }
    }
}
