// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.g;
import af2.a0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import gf2.c;
import nf2.q1;
import java.util.concurrent.TimeUnit;
import uf2.a;
import af2.t;

public final class ObservableRefCount<T> extends t<T>
{
    public final a<T> f;
    public final int g;
    public ObservableRefCount.ObservableRefCount$RefConnection h;
    
    public ObservableRefCount(final a<T> f) {
        final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        this.f = f;
        this.g = 1;
    }
    
    public final void b(final ObservableRefCount.ObservableRefCount$RefConnection observableRefCount$RefConnection) {
        synchronized (this) {
            if (this.f instanceof q1) {
                final ObservableRefCount.ObservableRefCount$RefConnection h = this.h;
                if (h != null && h == observableRefCount$RefConnection) {
                    this.h = null;
                    final df2.a timer = observableRefCount$RefConnection.timer;
                    if (timer != null) {
                        timer.dispose();
                        observableRefCount$RefConnection.timer = null;
                    }
                }
                final long subscriberCount = observableRefCount$RefConnection.subscriberCount - 1L;
                observableRefCount$RefConnection.subscriberCount = subscriberCount;
                if (subscriberCount == 0L) {
                    final a<T> f = this.f;
                    if (f instanceof df2.a) {
                        ((df2.a)f).dispose();
                    }
                    else if (f instanceof c) {
                        ((c)f).c(((AtomicReference<df2.a>)observableRefCount$RefConnection).get());
                    }
                }
            }
            else {
                final ObservableRefCount.ObservableRefCount$RefConnection h2 = this.h;
                if (h2 != null && h2 == observableRefCount$RefConnection) {
                    final df2.a timer2 = observableRefCount$RefConnection.timer;
                    if (timer2 != null) {
                        timer2.dispose();
                        observableRefCount$RefConnection.timer = null;
                    }
                    final long subscriberCount2 = observableRefCount$RefConnection.subscriberCount - 1L;
                    observableRefCount$RefConnection.subscriberCount = subscriberCount2;
                    if (subscriberCount2 == 0L) {
                        this.h = null;
                        final a<T> f2 = this.f;
                        if (f2 instanceof df2.a) {
                            ((df2.a)f2).dispose();
                        }
                        else if (f2 instanceof c) {
                            ((c)f2).c(((AtomicReference<df2.a>)observableRefCount$RefConnection).get());
                        }
                    }
                }
            }
        }
    }
    
    public final void d(final ObservableRefCount.ObservableRefCount$RefConnection observableRefCount$RefConnection) {
        synchronized (this) {
            if (observableRefCount$RefConnection.subscriberCount == 0L && observableRefCount$RefConnection == this.h) {
                this.h = null;
                final df2.a a = ((AtomicReference<df2.a>)observableRefCount$RefConnection).get();
                DisposableHelper.dispose((AtomicReference)observableRefCount$RefConnection);
                final a<T> f = this.f;
                if (f instanceof df2.a) {
                    ((df2.a)f).dispose();
                }
                else if (f instanceof c) {
                    if (a == null) {
                        observableRefCount$RefConnection.disconnectedEarly = true;
                    }
                    else {
                        ((c)f).c(a);
                    }
                }
            }
        }
    }
    
    @Override
    public final void subscribeActual(final a0<? super T> a0) {
        synchronized (this) {
            ObservableRefCount.ObservableRefCount$RefConnection h;
            if ((h = this.h) == null) {
                h = new ObservableRefCount.ObservableRefCount$RefConnection(this);
                this.h = h;
            }
            final long subscriberCount = h.subscriberCount;
            if (subscriberCount == 0L) {
                final df2.a timer = h.timer;
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
            this.f.subscribe((af2.a0<? super T>)new ObservableRefCount.ObservableRefCount$RefCountObserver((a0)a0, this, h));
            if (b) {
                this.f.b((g)h);
            }
        }
    }
}
