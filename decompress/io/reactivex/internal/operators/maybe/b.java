// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import java.util.Iterator;
import ej2.c0;
import if2.a;
import java.util.Arrays;
import io.reactivex.internal.disposables.EmptyDisposable;
import ff2.p;
import nw.d;
import java.util.ArrayList;
import kf2.o;
import ff2.r;
import ff2.n;

public final class b<T, R> extends n<R>
{
    public final Iterable<? extends r<? extends T>> f;
    public final o<? super Object[], ? extends R> g;
    
    public b(final ArrayList f, final d g) {
        this.f = f;
        this.g = (o<? super Object[], ? extends R>)g;
    }
    
    public final void s(final p<? super R> p) {
        r[] array = new r[8];
        try {
            final Iterator<? extends r<? extends T>> iterator = this.f.iterator();
            int i = 0;
            int n = 0;
            while (iterator.hasNext()) {
                final r r = (r)iterator.next();
                if (r == null) {
                    EmptyDisposable.error((Throwable)new NullPointerException("One of the sources is null"), (p)p);
                    return;
                }
                r[] array2 = array;
                if (n == array.length) {
                    array2 = Arrays.copyOf(array, (n >> 2) + n);
                }
                array2[n] = r;
                ++n;
                array = array2;
            }
            if (n == 0) {
                EmptyDisposable.complete((p)p);
                return;
            }
            if (n == 1) {
                array[0].b((p)new a$a((p)p, (o)new b.b$a(this)));
                return;
            }
            final MaybeZipArray$ZipCoordinator maybeZipArray$ZipCoordinator = new MaybeZipArray$ZipCoordinator((p)p, n, (o)this.g);
            p.onSubscribe((a)maybeZipArray$ZipCoordinator);
            while (i < n) {
                if (maybeZipArray$ZipCoordinator.isDisposed()) {
                    return;
                }
                array[i].b((p)maybeZipArray$ZipCoordinator.observers[i]);
                ++i;
            }
        }
        finally {
            final Throwable t;
            c0.i4(t);
            EmptyDisposable.error(t, (p)p);
        }
    }
}
