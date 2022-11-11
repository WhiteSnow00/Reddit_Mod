// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import if2.a;
import ff2.p;
import kf2.o;
import ff2.r;
import ff2.n;

public final class MaybeZipArray<T, R> extends n<R>
{
    public final r<? extends T>[] f;
    public final o<? super Object[], ? extends R> g;
    
    public MaybeZipArray(final o g, final r[] f) {
        this.f = (r<? extends T>[])f;
        this.g = (o<? super Object[], ? extends R>)g;
    }
    
    public final void s(final p<? super R> p) {
        final r<? extends T>[] f = this.f;
        final int length = f.length;
        int i = 0;
        if (length == 1) {
            f[0].b((p)new a$a((p)p, (o)new MaybeZipArray.MaybeZipArray$a(this)));
            return;
        }
        final MaybeZipArray.MaybeZipArray$ZipCoordinator maybeZipArray$ZipCoordinator = new MaybeZipArray.MaybeZipArray$ZipCoordinator((p)p, length, (o)this.g);
        p.onSubscribe((a)maybeZipArray$ZipCoordinator);
        while (i < length) {
            if (maybeZipArray$ZipCoordinator.isDisposed()) {
                return;
            }
            final r<? extends T> r = f[i];
            if (r == null) {
                maybeZipArray$ZipCoordinator.innerError((Throwable)new NullPointerException("One of the sources is null"), i);
                return;
            }
            r.b((p)maybeZipArray$ZipCoordinator.observers[i]);
            ++i;
        }
    }
}
