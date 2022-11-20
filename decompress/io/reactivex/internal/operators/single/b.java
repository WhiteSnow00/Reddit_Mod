// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;
import io.reactivex.internal.disposables.EmptyDisposable;
import af2.e0;
import java.util.ArrayList;
import ff2.o;
import af2.g0;
import af2.c0;

public final class b<T, R> extends c0<R>
{
    public final Iterable<? extends g0<? extends T>> f;
    public final o<? super Object[], ? extends R> g;
    
    public b(final ArrayList f, final o g) {
        this.f = f;
        this.g = (o<? super Object[], ? extends R>)g;
    }
    
    @Override
    public final void G(final e0<? super R> e0) {
        g0[] array = new g0[8];
        try {
            final Iterator<? extends g0<? extends T>> iterator = this.f.iterator();
            int i = 0;
            int n = 0;
            while (iterator.hasNext()) {
                final g0 g0 = (g0)iterator.next();
                if (g0 == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), e0);
                    return;
                }
                g0[] array2 = array;
                if (n == array.length) {
                    array2 = Arrays.copyOf(array, (n >> 2) + n);
                }
                array2[n] = g0;
                ++n;
                array = array2;
            }
            if (n == 0) {
                EmptyDisposable.error(new NoSuchElementException(), e0);
                return;
            }
            if (n == 1) {
                array[0].a((e0)new io.reactivex.internal.operators.single.a.a((af2.e0<? super Object>)e0, (ff2.o<? super Object, ?>)new a()));
                return;
            }
            final SingleZipArray.ZipCoordinator zipCoordinator = new SingleZipArray.ZipCoordinator((af2.e0<? super Object>)e0, n, this.g);
            e0.onSubscribe((df2.a)zipCoordinator);
            while (i < n) {
                if (zipCoordinator.isDisposed()) {
                    return;
                }
                array[i].a((e0)zipCoordinator.observers[i]);
                ++i;
            }
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            EmptyDisposable.error(t, e0);
        }
    }
    
    public final class a implements o<T, R>
    {
        public final b f;
        
        public a(final b f) {
            this.f = f;
        }
        
        public final R apply(final T t) throws Exception {
            final Object apply = this.f.g.apply((Object)new Object[] { t });
            hf2.a.b(apply, "The zipper returned a null value");
            return (R)apply;
        }
    }
}
