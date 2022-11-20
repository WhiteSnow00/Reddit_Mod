// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import io.reactivex.internal.disposables.EmptyDisposable;
import af2.a0;
import ff2.o;
import af2.y;
import af2.t;

public final class ObservableZip<T, R> extends t<R>
{
    public final y<? extends T>[] f;
    public final Iterable<? extends y<? extends T>> g;
    public final o<? super Object[], ? extends R> h;
    public final int i;
    public final boolean j;
    
    public ObservableZip(final y<? extends T>[] f, final Iterable<? extends y<? extends T>> g, final o<? super Object[], ? extends R> h, final int i, final boolean j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final a0<? super R> a0) {
        y[] f = this.f;
        int length;
        if (f == null) {
            y[] array = new y[8];
            final Iterator<? extends y<? extends T>> iterator = this.g.iterator();
            int n = 0;
            while (true) {
                f = array;
                length = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final y y = iterator.next();
                y[] array2 = array;
                if (n == array.length) {
                    array2 = new y[(n >> 2) + n];
                    System.arraycopy(array, 0, array2, 0, n);
                }
                array2[n] = y;
                ++n;
                array = array2;
            }
        }
        else {
            length = f.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(a0);
            return;
        }
        new ObservableZip.ObservableZip$ZipCoordinator((a0)a0, (o)this.h, length, this.j).subscribe(f, this.i);
    }
}
