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
import lf2.c;
import zf2.a;

public final class ObservablePublishAlt<T> extends a<T> implements c
{
    public final y<T> f;
    public final AtomicReference<ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>> g;
    
    public ObservablePublishAlt(final y<T> f) {
        this.f = f;
        this.g = new AtomicReference<ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>>();
    }
    
    public final void b(final if2.a a) {
        final AtomicReference<ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>> g = this.g;
        final ObservablePublishAlt.ObservablePublishAlt$PublishConnection observablePublishAlt$PublishConnection = (ObservablePublishAlt.ObservablePublishAlt$PublishConnection)a;
        while (!g.compareAndSet((ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>)observablePublishAlt$PublishConnection, null)) {
            if (g.get() != observablePublishAlt$PublishConnection) {
                return;
            }
        }
    }
    
    public final void c(final g<? super if2.a> g) {
        boolean b = false;
        ObservablePublishAlt.ObservablePublishAlt$PublishConnection observablePublishAlt$PublishConnection2 = null;
    Label_0083:
        while (true) {
            final ObservablePublishAlt.ObservablePublishAlt$PublishConnection observablePublishAlt$PublishConnection = this.g.get();
            b = false;
            if (observablePublishAlt$PublishConnection != null) {
                observablePublishAlt$PublishConnection2 = observablePublishAlt$PublishConnection;
                if (!observablePublishAlt$PublishConnection.isDisposed()) {
                    break;
                }
            }
            observablePublishAlt$PublishConnection2 = new ObservablePublishAlt.ObservablePublishAlt$PublishConnection((AtomicReference)this.g);
            final AtomicReference<ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>> g2 = this.g;
            while (true) {
                while (!g2.compareAndSet((ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>)observablePublishAlt$PublishConnection, (ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>)observablePublishAlt$PublishConnection2)) {
                    if (g2.get() != observablePublishAlt$PublishConnection) {
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
        if (!observablePublishAlt$PublishConnection2.connect.get()) {
            n = (b ? 1 : 0);
            if (observablePublishAlt$PublishConnection2.connect.compareAndSet(false, true)) {
                n = 1;
            }
        }
        try {
            g.accept((Object)observablePublishAlt$PublishConnection2);
            if (n != 0) {
                this.f.subscribe((a0)observablePublishAlt$PublishConnection2);
            }
        }
        finally {
            final Throwable t;
            c0.i4(t);
            throw ExceptionHelper.d(t);
        }
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        ObservablePublishAlt.ObservablePublishAlt$PublishConnection observablePublishAlt$PublishConnection2 = null;
    Label_0071:
        while (true) {
            final ObservablePublishAlt.ObservablePublishAlt$PublishConnection observablePublishAlt$PublishConnection = observablePublishAlt$PublishConnection2 = this.g.get();
            if (observablePublishAlt$PublishConnection == null) {
                observablePublishAlt$PublishConnection2 = new ObservablePublishAlt.ObservablePublishAlt$PublishConnection((AtomicReference)this.g);
                final AtomicReference<ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>> g = this.g;
                while (true) {
                    while (!g.compareAndSet((ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>)observablePublishAlt$PublishConnection, (ObservablePublishAlt.ObservablePublishAlt$PublishConnection<T>)observablePublishAlt$PublishConnection2)) {
                        if (g.get() != observablePublishAlt$PublishConnection) {
                            final boolean b = false;
                            if (!b) {
                                continue Label_0071;
                            }
                            break Label_0071;
                        }
                    }
                    final boolean b = true;
                    continue;
                }
            }
            break;
        }
        final ObservablePublishAlt.ObservablePublishAlt$InnerDisposable observablePublishAlt$InnerDisposable = new ObservablePublishAlt.ObservablePublishAlt$InnerDisposable((a0)a0, observablePublishAlt$PublishConnection2);
        a0.onSubscribe((if2.a)observablePublishAlt$InnerDisposable);
        if (observablePublishAlt$PublishConnection2.add(observablePublishAlt$InnerDisposable)) {
            if (observablePublishAlt$InnerDisposable.isDisposed()) {
                observablePublishAlt$PublishConnection2.remove(observablePublishAlt$InnerDisposable);
            }
            return;
        }
        final Throwable error = observablePublishAlt$PublishConnection2.error;
        if (error != null) {
            a0.onError(error);
        }
        else {
            a0.onComplete();
        }
    }
}
