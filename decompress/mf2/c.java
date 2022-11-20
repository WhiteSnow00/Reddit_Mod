// 
// Decompiled by Procyon v0.6.0
// 

package mf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import af2.p;
import if2.h;
import af2.n;

public final class c extends n<Object> implements h<Object>
{
    public static final c f;
    
    static {
        f = new c();
    }
    
    public final Object call() {
        return null;
    }
    
    @Override
    public final void t(final p<? super Object> p) {
        EmptyDisposable.complete(p);
    }
}
