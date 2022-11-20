// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import af2.e;
import af2.c;
import af2.a;

public final class b extends a
{
    public final int f;
    public final Object g;
    
    public b(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void w(final c c) {
        switch (this.f) {
            default: {
                ((e)this.g).a(c);
                return;
            }
            case 0: {
                try {
                    final e call = ((Callable)this.g).call();
                    hf2.a.b((Object)call, "The completableSupplier returned a null CompletableSource");
                    call.a(c);
                }
                finally {
                    final Throwable t;
                    xd.a.t1(t);
                    EmptyDisposable.error(t, c);
                }
            }
        }
    }
}
