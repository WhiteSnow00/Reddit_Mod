// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import ej2.c0;
import ff2.a0;
import kf2.g;
import java.util.concurrent.atomic.AtomicReference;
import ff2.y;
import sf2.q1;
import zf2.a;

public final class ObservablePublish<T> extends a<T> implements q1<T>
{
    public final y<T> f;
    public final AtomicReference<ObservablePublish.ObservablePublish$a<T>> g;
    public final y<T> h;
    
    public ObservablePublish(final ObservablePublish.ObservablePublish$b h, final y f, final AtomicReference g) {
        this.h = (y<T>)h;
        this.f = (y<T>)f;
        this.g = g;
    }
    
    public final y<T> a() {
        return this.f;
    }
    
    public final void c(final g<? super if2.a> g) {
        boolean b = false;
        ObservablePublish.ObservablePublish$a observablePublish$a2 = null;
    Label_0083:
        while (true) {
            final ObservablePublish.ObservablePublish$a observablePublish$a = this.g.get();
            b = false;
            if (observablePublish$a != null) {
                observablePublish$a2 = observablePublish$a;
                if (!observablePublish$a.isDisposed()) {
                    break;
                }
            }
            observablePublish$a2 = new ObservablePublish.ObservablePublish$a((AtomicReference)this.g);
            final AtomicReference<ObservablePublish.ObservablePublish$a<T>> g2 = this.g;
            while (true) {
                while (!g2.compareAndSet((ObservablePublish.ObservablePublish$a<T>)observablePublish$a, (ObservablePublish.ObservablePublish$a<T>)observablePublish$a2)) {
                    if (g2.get() != observablePublish$a) {
                        final boolean b2 = false;
                        if (!b2) {
                            continue Label_0083;
                        }
                        break Label_0083;
                    }
                }
                final boolean b2 = true;
                continue;
            }
        }
        int n = b ? 1 : 0;
        if (!observablePublish$a2.h.get()) {
            n = (b ? 1 : 0);
            if (observablePublish$a2.h.compareAndSet(false, true)) {
                n = 1;
            }
        }
        try {
            g.accept((Object)observablePublish$a2);
            if (n != 0) {
                this.f.subscribe((a0)observablePublish$a2);
            }
        }
        finally {
            final Throwable t;
            c0.i4(t);
            throw ExceptionHelper.d(t);
        }
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        this.h.subscribe((a0)a0);
    }
}
