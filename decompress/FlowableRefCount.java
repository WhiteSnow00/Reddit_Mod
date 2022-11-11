// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import qt2.d;
import java.util.concurrent.atomic.AtomicBoolean;
import ff2.l;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import lf2.c;
import qf2.b1;
import java.util.concurrent.TimeUnit;
import jf2.a;
import ff2.g;

public final class FlowableRefCount<T> extends g<T>
{
    public final a<T> f;
    public final int g;
    public FlowableRefCount$RefConnection h;
    
    public FlowableRefCount(final a<T> f) {
        final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        this.f = f;
        this.g = 1;
    }
    
    public final void e(final FlowableRefCount$RefConnection flowableRefCount$RefConnection) {
        synchronized (this) {
            if (this.f instanceof b1) {
                final FlowableRefCount$RefConnection h = this.h;
                if (h != null && h == flowableRefCount$RefConnection) {
                    this.h = null;
                    final if2.a timer = flowableRefCount$RefConnection.timer;
                    if (timer != null) {
                        timer.dispose();
                        flowableRefCount$RefConnection.timer = null;
                    }
                }
                final long subscriberCount = flowableRefCount$RefConnection.subscriberCount - 1L;
                flowableRefCount$RefConnection.subscriberCount = subscriberCount;
                if (subscriberCount == 0L) {
                    final a<T> f = this.f;
                    if (f instanceof if2.a) {
                        ((if2.a)f).dispose();
                    }
                    else if (f instanceof c) {
                        ((c)f).b((if2.a)((AtomicReference<if2.a>)flowableRefCount$RefConnection).get());
                    }
                }
            }
            else {
                final FlowableRefCount$RefConnection h2 = this.h;
                if (h2 != null && h2 == flowableRefCount$RefConnection) {
                    final if2.a timer2 = flowableRefCount$RefConnection.timer;
                    if (timer2 != null) {
                        timer2.dispose();
                        flowableRefCount$RefConnection.timer = null;
                    }
                    final long subscriberCount2 = flowableRefCount$RefConnection.subscriberCount - 1L;
                    flowableRefCount$RefConnection.subscriberCount = subscriberCount2;
                    if (subscriberCount2 == 0L) {
                        this.h = null;
                        final a<T> f2 = this.f;
                        if (f2 instanceof if2.a) {
                            ((if2.a)f2).dispose();
                        }
                        else if (f2 instanceof c) {
                            ((c)f2).b((if2.a)((AtomicReference<if2.a>)flowableRefCount$RefConnection).get());
                        }
                    }
                }
            }
        }
    }
    
    public final void f(final FlowableRefCount$RefConnection flowableRefCount$RefConnection) {
        synchronized (this) {
            if (flowableRefCount$RefConnection.subscriberCount == 0L && flowableRefCount$RefConnection == this.h) {
                this.h = null;
                final if2.a a = ((AtomicReference<if2.a>)flowableRefCount$RefConnection).get();
                DisposableHelper.dispose((AtomicReference)flowableRefCount$RefConnection);
                final a<T> f = this.f;
                if (f instanceof if2.a) {
                    ((if2.a)f).dispose();
                }
                else if (f instanceof c) {
                    if (a == null) {
                        flowableRefCount$RefConnection.disconnectedEarly = true;
                    }
                    else {
                        ((c)f).b(a);
                    }
                }
            }
        }
    }
    
    @Override
    public final void subscribeActual(final qt2.c<? super T> c) {
        synchronized (this) {
            FlowableRefCount$RefConnection h;
            if ((h = this.h) == null) {
                h = new FlowableRefCount$RefConnection(this);
                this.h = h;
            }
            final long subscriberCount = h.subscriberCount;
            if (subscriberCount == 0L) {
                final if2.a timer = h.timer;
                if (timer != null) {
                    timer.dispose();
                }
            }
            final long subscriberCount2 = subscriberCount + 1L;
            h.subscriberCount = subscriberCount2;
            final boolean connected = h.connected;
            boolean b = true;
            if (!connected && subscriberCount2 == this.g) {
                h.connected = true;
            }
            else {
                b = false;
            }
            monitorexit(this);
            this.f.subscribe((ff2.l<? super T>)new RefCountSubscriber((qt2.c<? super Object>)c, (FlowableRefCount<Object>)this, h));
            if (b) {
                this.f.e((kf2.g)h);
            }
        }
    }
    
    public static final class RefCountSubscriber<T> extends AtomicBoolean implements l<T>, d
    {
        private static final long serialVersionUID = -7419642935409022375L;
        public final FlowableRefCount$RefConnection connection;
        public final qt2.c<? super T> downstream;
        public final FlowableRefCount<T> parent;
        public d upstream;
        
        public RefCountSubscriber(final qt2.c<? super T> downstream, final FlowableRefCount<T> parent, final FlowableRefCount$RefConnection connection) {
            this.downstream = downstream;
            this.parent = parent;
            this.connection = connection;
        }
        
        public void cancel() {
            this.upstream.cancel();
            if (this.compareAndSet(false, true)) {
                final FlowableRefCount<T> parent = this.parent;
                final FlowableRefCount$RefConnection connection = this.connection;
                synchronized (parent) {
                    final FlowableRefCount$RefConnection h = parent.h;
                    if (h != null && h == connection) {
                        final long subscriberCount = connection.subscriberCount - 1L;
                        connection.subscriberCount = subscriberCount;
                        if (subscriberCount == 0L && connection.connected) {
                            parent.f(connection);
                        }
                    }
                }
            }
        }
        
        public void onComplete() {
            if (this.compareAndSet(false, true)) {
                this.parent.e(this.connection);
                this.downstream.onComplete();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.compareAndSet(false, true)) {
                this.parent.e(this.connection);
                this.downstream.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            this.downstream.onNext((Object)t);
        }
        
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
            }
        }
        
        public void request(final long n) {
            this.upstream.request(n);
        }
    }
}
