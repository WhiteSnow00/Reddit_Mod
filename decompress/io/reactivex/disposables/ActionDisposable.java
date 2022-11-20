// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.disposables;

import io.reactivex.internal.util.ExceptionHelper;
import ff2.a;

final class ActionDisposable extends ReferenceDisposable<a>
{
    private static final long serialVersionUID = -8219729196779211169L;
    
    public ActionDisposable(final a a) {
        super((Object)a);
    }
    
    public void onDisposed(final a a) {
        try {
            a.run();
        }
        finally {
            final Throwable t;
            throw ExceptionHelper.d(t);
        }
    }
    
    public /* bridge */ void onDisposed(final Object o) {
        this.onDisposed((a)o);
    }
}
