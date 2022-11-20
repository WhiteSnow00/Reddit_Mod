// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import af2.a;

public final class c extends a
{
    public static final c f;
    
    static {
        f = new c();
    }
    
    @Override
    public final void w(final af2.c c) {
        EmptyDisposable.complete(c);
    }
}
