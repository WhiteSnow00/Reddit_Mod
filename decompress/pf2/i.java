// 
// Decompiled by Procyon v0.6.0
// 

package pf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import hf2.a;
import af2.e0;
import io.reactivex.internal.functions.Functions$w;
import java.util.concurrent.Callable;
import af2.c0;

public final class i<T> extends c0<T>
{
    public final Callable<? extends Throwable> f;
    
    public i(final Functions$w f) {
        this.f = (Callable<? extends Throwable>)f;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        final Throwable t2;
        try {
            final Throwable call = (Throwable)this.f.call();
            a.b((Object)call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            final Throwable t = call;
        }
        finally {
            xd.a.t1(t2);
        }
        EmptyDisposable.error(t2, e0);
    }
}
