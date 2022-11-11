// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.processors;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import qt2.c;
import qt2.d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import cg2.a;

public final class PublishProcessor<T> extends a<T>
{
    public static final PublishSubscription[] h;
    public static final PublishSubscription[] i;
    public final AtomicReference<PublishSubscription<T>[]> f;
    public Throwable g;
    
    static {
        h = new PublishSubscription[0];
        i = new PublishSubscription[0];
    }
    
    public PublishProcessor() {
        this.f = new AtomicReference<PublishSubscription<T>[]>(PublishProcessor.i);
    }
    
    public final void e(final PublishSubscription<T> publishSubscription) {
        int i;
    Label_0162:
        do {
            final PublishSubscription[] array = this.f.get();
            if (array == PublishProcessor.h) {
                break;
            }
            if (array == PublishProcessor.i) {
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
                if (array[n3] == publishSubscription) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (n4 < 0) {
                return;
            }
            PublishSubscription[] j;
            if (length == 1) {
                j = PublishProcessor.i;
            }
            else {
                j = new PublishSubscription[length - 1];
                System.arraycopy(array, 0, j, 0, n4);
                System.arraycopy(array, n4 + 1, j, n4, length - n4 - 1);
            }
            final AtomicReference<PublishSubscription<T>[]> f = this.f;
            while (!f.compareAndSet(array, j)) {
                if (f.get() != array) {
                    i = n2;
                    continue Label_0162;
                }
            }
            i = 1;
        } while (i == 0);
    }
    
    public final void onComplete() {
        final PublishSubscription[] value = this.f.get();
        final PublishSubscription[] h = PublishProcessor.h;
        if (value == h) {
            return;
        }
        final PublishSubscription[] array = this.f.getAndSet(h);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].onComplete();
        }
    }
    
    public final void onError(final Throwable g) {
        if (g == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        final PublishSubscription[] value = this.f.get();
        final PublishSubscription[] h = PublishProcessor.h;
        if (value == h) {
            RxJavaPlugins.onError(g);
            return;
        }
        this.g = g;
        final PublishSubscription[] array = this.f.getAndSet(h);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].onError(g);
        }
    }
    
    public final void onNext(final T t) {
        if (t != null) {
            final PublishSubscription[] array = this.f.get();
            for (int length = array.length, i = 0; i < length; ++i) {
                array[i].onNext(t);
            }
            return;
        }
        throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    
    public final void onSubscribe(final d d) {
        if (this.f.get() == PublishProcessor.h) {
            d.cancel();
            return;
        }
        d.request(Long.MAX_VALUE);
    }
    
    public final void subscribeActual(final c<? super T> c) {
        final PublishSubscription publishSubscription = new PublishSubscription((c<? super T>)c, (PublishProcessor<T>)this);
        c.onSubscribe((d)publishSubscription);
    Label_0113:
        while (true) {
            boolean b;
            do {
                final PublishSubscription[] array = this.f.get();
                final PublishSubscription[] h = PublishProcessor.h;
                final int n = 0;
                b = false;
                if (array == h) {
                    final int n2 = n;
                    if (n2 != 0) {
                        if (publishSubscription.isCancelled()) {
                            this.e(publishSubscription);
                        }
                    }
                    else {
                        final Throwable g = this.g;
                        if (g != null) {
                            c.onError(g);
                        }
                        else {
                            c.onComplete();
                        }
                    }
                    return;
                }
                final int length = array.length;
                final PublishSubscription[] array2 = new PublishSubscription[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = publishSubscription;
                final AtomicReference<PublishSubscription<T>[]> f = this.f;
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
    
    public static final class PublishSubscription<T> extends AtomicLong implements d
    {
        private static final long serialVersionUID = 3562861878281475070L;
        public final c<? super T> downstream;
        public final PublishProcessor<T> parent;
        
        public PublishSubscription(final c<? super T> downstream, final PublishProcessor<T> parent) {
            this.downstream = downstream;
            this.parent = parent;
        }
        
        public void cancel() {
            if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.e(this);
            }
        }
        
        public boolean isCancelled() {
            return this.get() == Long.MIN_VALUE;
        }
        
        public boolean isFull() {
            return this.get() == 0L;
        }
        
        public void onComplete() {
            if (this.get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.get() != Long.MIN_VALUE) {
                this.downstream.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            final long value = this.get();
            if (value == Long.MIN_VALUE) {
                return;
            }
            if (value != 0L) {
                this.downstream.onNext((Object)t);
                vl.a.m0((AtomicLong)this, 1L);
            }
            else {
                this.cancel();
                this.downstream.onError((Throwable)new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                vl.a.m((AtomicLong)this, n);
            }
        }
    }
}
