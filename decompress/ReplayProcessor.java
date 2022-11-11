// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.processors;

import java.util.ArrayList;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import qt2.c;
import qt2.d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import cg2.a;

public final class ReplayProcessor<T> extends cg2.a<T>
{
    public static final Object[] i;
    public static final ReplaySubscription[] j;
    public static final ReplaySubscription[] k;
    public final a<T> f;
    public boolean g;
    public final AtomicReference<ReplaySubscription<T>[]> h;
    
    static {
        i = new Object[0];
        j = new ReplaySubscription[0];
        k = new ReplaySubscription[0];
    }
    
    public ReplayProcessor(final b f) {
        this.f = (a<T>)f;
        this.h = new AtomicReference<ReplaySubscription<T>[]>(ReplayProcessor.j);
    }
    
    public final void e(final ReplaySubscription<T> replaySubscription) {
        int i;
    Label_0162:
        do {
            final ReplaySubscription[] array = this.h.get();
            if (array == ReplayProcessor.k) {
                break;
            }
            if (array == ReplayProcessor.j) {
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
                if (array[n3] == replaySubscription) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (n4 < 0) {
                return;
            }
            ReplaySubscription[] j;
            if (length == 1) {
                j = ReplayProcessor.j;
            }
            else {
                j = new ReplaySubscription[length - 1];
                System.arraycopy(array, 0, j, 0, n4);
                System.arraycopy(array, n4 + 1, j, n4, length - n4 - 1);
            }
            final AtomicReference<ReplaySubscription<T>[]> h = this.h;
            while (!h.compareAndSet(array, j)) {
                if (h.get() != array) {
                    i = n2;
                    continue Label_0162;
                }
            }
            i = 1;
        } while (i == 0);
    }
    
    public final void onComplete() {
        if (this.g) {
            return;
        }
        this.g = true;
        final a<T> f = this.f;
        ((b)f).c = true;
        final ReplaySubscription[] array = this.h.getAndSet(ReplayProcessor.k);
        for (int length = array.length, i = 0; i < length; ++i) {
            ((b)f).a(array[i]);
        }
    }
    
    public final void onError(final Throwable b) {
        if (b == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.g) {
            RxJavaPlugins.onError(b);
            return;
        }
        this.g = true;
        final a<T> f = this.f;
        final b b2 = (b)f;
        b2.b = b;
        b2.c = true;
        final ReplaySubscription[] array = this.h.getAndSet(ReplayProcessor.k);
        for (int length = array.length, i = 0; i < length; ++i) {
            ((b)f).a(array[i]);
        }
    }
    
    public final void onNext(final T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.g) {
            return;
        }
        final b b = (b)this.f;
        b.a.add(t);
        ++b.d;
        final ReplaySubscription[] array = this.h.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            b.a(array[i]);
        }
    }
    
    public final void onSubscribe(final d d) {
        if (this.g) {
            d.cancel();
            return;
        }
        d.request(Long.MAX_VALUE);
    }
    
    public final void subscribeActual(final c<? super T> c) {
        final ReplaySubscription replaySubscription = new ReplaySubscription((c<? super T>)c, (ReplayProcessor<T>)this);
        c.onSubscribe((d)replaySubscription);
    Label_0107:
        while (true) {
            boolean b;
            do {
                final ReplaySubscription[] array = this.h.get();
                final ReplaySubscription[] k = ReplayProcessor.k;
                final int n = 0;
                b = false;
                if (array == k) {
                    final int n2 = n;
                    if (n2 != 0 && replaySubscription.cancelled) {
                        this.e(replaySubscription);
                        return;
                    }
                    ((b)this.f).a(replaySubscription);
                    return;
                }
                else {
                    final int length = array.length;
                    final ReplaySubscription[] array2 = new ReplaySubscription[length + 1];
                    System.arraycopy(array, 0, array2, 0, length);
                    array2[length] = replaySubscription;
                    final AtomicReference<ReplaySubscription<T>[]> h = this.h;
                    while (!h.compareAndSet(array, array2)) {
                        if (h.get() != array) {
                            continue Label_0107;
                        }
                    }
                    b = true;
                }
            } while (!b);
            final int n2 = 1;
            continue;
        }
    }
    
    public static final class ReplaySubscription<T> extends AtomicInteger implements d
    {
        private static final long serialVersionUID = 466549804534799122L;
        public volatile boolean cancelled;
        public final c<? super T> downstream;
        public long emitted;
        public Object index;
        public final AtomicLong requested;
        public final ReplayProcessor<T> state;
        
        public ReplaySubscription(final c<? super T> downstream, final ReplayProcessor<T> state) {
            this.downstream = downstream;
            this.state = state;
            this.requested = new AtomicLong();
        }
        
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.e(this);
            }
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                vl.a.l(this.requested, n);
                ((b)this.state.f).a((ReplaySubscription)this);
            }
        }
    }
    
    public interface a<T>
    {
    }
    
    public static final class b<T> implements a<T>
    {
        public final ArrayList a;
        public Throwable b;
        public volatile boolean c;
        public volatile int d;
        
        public b() {
            mf2.a.c(16, "capacityHint");
            this.a = new ArrayList(16);
        }
        
        public final void a(final ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            final ArrayList a = this.a;
            final qt2.c<? super T> downstream = replaySubscription.downstream;
            final Integer n = (Integer)replaySubscription.index;
            int intValue = 0;
            if (n != null) {
                intValue = n;
            }
            else {
                replaySubscription.index = 0;
            }
            long emitted = replaySubscription.emitted;
            int addAndGet = 1;
            do {
                final long value = replaySubscription.requested.get();
                long n2;
                while (true) {
                    n2 = lcmp(emitted, value);
                    if (n2 == 0) {
                        break;
                    }
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    }
                    final boolean c = this.c;
                    final int d = this.d;
                    if (c && intValue == d) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        final Throwable b = this.b;
                        if (b == null) {
                            downstream.onComplete();
                        }
                        else {
                            downstream.onError(b);
                        }
                        return;
                    }
                    if (intValue == d) {
                        break;
                    }
                    downstream.onNext(a.get(intValue));
                    ++intValue;
                    ++emitted;
                }
                if (n2 == 0) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    }
                    final boolean c2 = this.c;
                    final int d2 = this.d;
                    if (c2 && intValue == d2) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        final Throwable b2 = this.b;
                        if (b2 == null) {
                            downstream.onComplete();
                        }
                        else {
                            downstream.onError(b2);
                        }
                        return;
                    }
                }
                replaySubscription.index = intValue;
                replaySubscription.emitted = emitted;
            } while ((addAndGet = replaySubscription.addAndGet(-addAndGet)) != 0);
        }
    }
}
