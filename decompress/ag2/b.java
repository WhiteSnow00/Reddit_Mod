// 
// Decompiled by Procyon v0.6.0
// 

package ag2;

import af2.a0;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.util.NotificationLite;
import tf2.a;
import tf2.a$a;

public final class b<T> extends c<T> implements a$a<Object>
{
    public final c<T> f;
    public boolean g;
    public a<Object> h;
    public volatile boolean i;
    
    public b(final c<T> f) {
        this.f = f;
    }
    
    public final Throwable getThrowable() {
        return this.f.getThrowable();
    }
    
    public final boolean hasComplete() {
        return this.f.hasComplete();
    }
    
    public final boolean hasObservers() {
        return this.f.hasObservers();
    }
    
    public final boolean hasThrowable() {
        return this.f.hasThrowable();
    }
    
    public final void onComplete() {
        if (this.i) {
            return;
        }
        synchronized (this) {
            if (this.i) {
                return;
            }
            this.i = true;
            if (this.g) {
                a<Object> h;
                if ((h = this.h) == null) {
                    h = new a<Object>();
                    this.h = h;
                }
                h.b(NotificationLite.complete());
                return;
            }
            this.g = true;
            monitorexit(this);
            ((a0)this.f).onComplete();
        }
    }
    
    public final void onError(final Throwable t) {
        if (this.i) {
            RxJavaPlugins.onError(t);
            return;
        }
        monitorenter(this);
        Label_0091: {
            try {
                final boolean i = this.i;
                final boolean b = true;
                if (i) {
                    break Label_0091;
                }
                this.i = true;
                if (this.g) {
                    a<Object> h;
                    if ((h = this.h) == null) {
                        h = new a<Object>();
                        this.h = h;
                    }
                    h.a[0] = NotificationLite.error(t);
                    monitorexit(this);
                    return;
                }
                break Label_0091;
            }
            finally {
                monitorexit(this);
                Label_0109: {
                    ((a0)this.f).onError(t);
                }
                return;
                this.g = true;
                final boolean b = false;
                break Label_0091;
                while (true) {
                    RxJavaPlugins.onError(t);
                    return;
                    monitorexit(this);
                    iftrue(Label_0109:)(!b);
                    continue;
                }
            }
        }
    }
    
    public final void onNext(final T t) {
        if (this.i) {
            return;
        }
        synchronized (this) {
            if (this.i) {
                return;
            }
            if (this.g) {
                a<Object> h;
                if ((h = this.h) == null) {
                    h = new a<Object>();
                    this.h = h;
                }
                h.b(NotificationLite.next((Object)t));
                return;
            }
            this.g = true;
            monitorexit(this);
            ((a0)this.f).onNext((Object)t);
            while (true) {
                synchronized (this) {
                    final a<Object> h2 = this.h;
                    if (h2 == null) {
                        this.g = false;
                        return;
                    }
                    this.h = null;
                    monitorexit(this);
                    h2.c((a.a$a<? super Object>)this);
                    continue;
                }
            }
        }
    }
    
    public final void onSubscribe(final df2.a a) {
        final boolean i = this.i;
        int n = 1;
        final int n2 = 1;
        if (!i) {
            synchronized (this) {
                if (this.i) {
                    n = n2;
                }
                else {
                    if (this.g) {
                        a<Object> h;
                        if ((h = this.h) == null) {
                            h = new a<Object>();
                            this.h = h;
                        }
                        h.b(NotificationLite.disposable(a));
                        return;
                    }
                    this.g = true;
                    n = 0;
                }
            }
        }
        if (n != 0) {
            a.dispose();
            return;
        }
        ((a0)this.f).onSubscribe(a);
        while (true) {
            synchronized (this) {
                final a<Object> h2 = this.h;
                if (h2 == null) {
                    this.g = false;
                    return;
                }
                this.h = null;
                monitorexit(this);
                h2.c((a.a$a<? super Object>)this);
            }
        }
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        this.f.subscribe(a0);
    }
    
    public final boolean test(final Object o) {
        return NotificationLite.acceptFull(o, (a0)this.f);
    }
}
