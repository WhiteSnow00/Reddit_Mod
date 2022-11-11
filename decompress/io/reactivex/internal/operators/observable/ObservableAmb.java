// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import if2.a;
import ej2.c0;
import io.reactivex.internal.disposables.EmptyDisposable;
import ff2.a0;
import ff2.y;
import ff2.t;

public final class ObservableAmb<T> extends t<T>
{
    public final y<? extends T>[] f;
    public final Iterable<? extends y<? extends T>> g;
    
    public ObservableAmb(final y<? extends T>[] f, final Iterable<? extends y<? extends T>> g) {
        this.f = f;
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        y[] f = this.f;
        final int n = 0;
        int length = 0;
        Label_0150: {
            if (f == null) {
                y[] array = new y[8];
                try {
                    final Iterator<? extends y<? extends T>> iterator = this.g.iterator();
                    int n2 = 0;
                    while (true) {
                        f = array;
                        length = n2;
                        if (!iterator.hasNext()) {
                            break Label_0150;
                        }
                        final y y = iterator.next();
                        if (y == null) {
                            break;
                        }
                        f = array;
                        if (n2 == array.length) {
                            f = new y[(n2 >> 2) + n2];
                            System.arraycopy(array, 0, f, 0, n2);
                        }
                        f[n2] = y;
                        ++n2;
                        array = f;
                    }
                    EmptyDisposable.error((Throwable)new NullPointerException("One of the sources is null"), (a0)a0);
                    return;
                }
                finally {
                    final Throwable t;
                    c0.i4(t);
                    EmptyDisposable.error(t, (a0)a0);
                    return;
                }
            }
            length = f.length;
        }
        if (length == 0) {
            EmptyDisposable.complete((a0)a0);
            return;
        }
        if (length == 1) {
            f[0].subscribe((a0)a0);
            return;
        }
        final ObservableAmb.ObservableAmb$a observableAmb$a = new ObservableAmb.ObservableAmb$a((a0)a0, length);
        final ObservableAmb.ObservableAmb$AmbInnerObserver[] g = observableAmb$a.g;
        final int length2 = g.length;
        int n3;
        for (int i = 0; i < length2; i = n3) {
            n3 = i + 1;
            g[i] = new ObservableAmb.ObservableAmb$AmbInnerObserver(observableAmb$a, n3, observableAmb$a.f);
        }
        observableAmb$a.h.lazySet(0);
        observableAmb$a.f.onSubscribe((a)observableAmb$a);
        for (int n4 = n; n4 < length2 && observableAmb$a.h.get() == 0; ++n4) {
            f[n4].subscribe((a0)g[n4]);
        }
    }
}
