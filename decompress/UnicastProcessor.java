// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.processors;

import io.reactivex.internal.subscriptions.EmptySubscription;
import qt2.d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import java.util.concurrent.atomic.AtomicBoolean;
import qt2.c;
import java.util.concurrent.atomic.AtomicReference;
import cg2.a;

public final class UnicastProcessor<T> extends a<T>
{
    public final vf2.a<T> f;
    public final AtomicReference<Runnable> g;
    public final boolean h;
    public volatile boolean i;
    public Throwable j;
    public final AtomicReference<c<? super T>> k;
    public volatile boolean l;
    public final AtomicBoolean m;
    public final BasicIntQueueSubscription<T> n;
    public final AtomicLong o;
    public boolean p;
    
    public UnicastProcessor(final int n) {
        this(n, null);
    }
    
    public UnicastProcessor(final int n, final Runnable runnable) {
        mf2.a.c(n, "capacityHint");
        this.f = new vf2.a<T>(n);
        this.g = new AtomicReference<Runnable>(runnable);
        this.h = true;
        this.k = new AtomicReference<c<? super T>>();
        this.m = new AtomicBoolean();
        this.n = (BasicIntQueueSubscription<T>)new UnicastProcessor.UnicastProcessor$UnicastQueueSubscription(this);
        this.o = new AtomicLong();
    }
    
    public static <T> UnicastProcessor<T> f(final int n, final Runnable runnable) {
        if (runnable != null) {
            return new UnicastProcessor<T>(n, runnable);
        }
        throw new NullPointerException("onTerminate");
    }
    
    public final boolean e(final boolean b, final boolean b2, final boolean b3, final c<? super T> c, final vf2.a<T> a) {
        if (this.l) {
            a.clear();
            this.k.lazySet(null);
            return true;
        }
        if (b2) {
            if (b && this.j != null) {
                a.clear();
                this.k.lazySet(null);
                c.onError(this.j);
                return true;
            }
            if (b3) {
                final Throwable j = this.j;
                this.k.lazySet(null);
                if (j != null) {
                    c.onError(j);
                }
                else {
                    c.onComplete();
                }
                return true;
            }
        }
        return false;
    }
    
    public final void g() {
        if (this.n.getAndIncrement() != 0) {
            return;
        }
        c c = this.k.get();
        int addAndGet = 1;
        while (true) {
            final int n = 1;
            if (c != null) {
                Label_0368: {
                    if (this.p) {
                        final vf2.a<T> f = this.f;
                        final boolean h = this.h;
                        int addAndGet2 = n;
                        while (!this.l) {
                            final boolean i = this.i;
                            if ((h ^ true) && i && this.j != null) {
                                f.clear();
                                this.k.lazySet(null);
                                c.onError(this.j);
                                return;
                            }
                            c.onNext((Object)null);
                            if (i) {
                                this.k.lazySet(null);
                                final Throwable j = this.j;
                                if (j != null) {
                                    c.onError(j);
                                    return;
                                }
                                c.onComplete();
                                return;
                            }
                            else {
                                if ((addAndGet2 = this.n.addAndGet(-addAndGet2)) == 0) {
                                    return;
                                }
                                continue;
                            }
                        }
                        this.k.lazySet(null);
                    }
                    else {
                        final vf2.a<T> f2 = this.f;
                        final boolean b = this.h ^ true;
                        int addAndGet3 = 1;
                        do {
                            final long value = this.o.get();
                            long n2 = 0L;
                            long n3;
                            while (true) {
                                n3 = lcmp(value, n2);
                                if (n3 == 0) {
                                    break;
                                }
                                final boolean k = this.i;
                                final T poll = f2.poll();
                                final boolean b2 = poll == null;
                                if (this.e(b, k, b2, (c<? super T>)c, f2)) {
                                    break Label_0368;
                                }
                                if (b2) {
                                    break;
                                }
                                c.onNext((Object)poll);
                                ++n2;
                            }
                            if (n3 == 0 && this.e(b, this.i, f2.isEmpty(), (c<? super T>)c, f2)) {
                                break;
                            }
                            if (n2 != 0L && value != Long.MAX_VALUE) {
                                this.o.addAndGet(-n2);
                            }
                            addAndGet3 = this.n.addAndGet(-addAndGet3);
                        } while (addAndGet3 != 0);
                    }
                }
                return;
            }
            addAndGet = this.n.addAndGet(-addAndGet);
            if (addAndGet == 0) {
                return;
            }
            c = this.k.get();
        }
    }
    
    public final void onComplete() {
        if (!this.i) {
            if (!this.l) {
                this.i = true;
                final Runnable runnable = this.g.getAndSet(null);
                if (runnable != null) {
                    runnable.run();
                }
                this.g();
            }
        }
    }
    
    public final void onError(final Throwable j) {
        if (j == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.i && !this.l) {
            this.j = j;
            this.i = true;
            final Runnable runnable = this.g.getAndSet(null);
            if (runnable != null) {
                runnable.run();
            }
            this.g();
            return;
        }
        RxJavaPlugins.onError(j);
    }
    
    public final void onNext(final T t) {
        if (t != null) {
            if (!this.i) {
                if (!this.l) {
                    this.f.offer(t);
                    this.g();
                }
            }
            return;
        }
        throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    
    public final void onSubscribe(final d d) {
        if (!this.i && !this.l) {
            d.request(Long.MAX_VALUE);
        }
        else {
            d.cancel();
        }
    }
    
    public final void subscribeActual(final c<? super T> c) {
        if (!this.m.get() && this.m.compareAndSet(false, true)) {
            c.onSubscribe((d)this.n);
            this.k.set(c);
            if (this.l) {
                this.k.lazySet(null);
            }
            else {
                this.g();
            }
        }
        else {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), c);
        }
    }
}
