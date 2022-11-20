// 
// Decompiled by Procyon v0.6.0
// 

package mf2;

import df2.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import af2.p;

public final class n extends af2.n<Object>
{
    public static final n f;
    
    static {
        f = new n();
    }
    
    @Override
    public final void t(final p<? super Object> p) {
        p.onSubscribe((a)EmptyDisposable.NEVER);
    }
}
