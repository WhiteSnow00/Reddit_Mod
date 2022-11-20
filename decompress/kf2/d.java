// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import af2.c;
import af2.a;

public final class d extends a
{
    public final Throwable f;
    
    public d(final Throwable f) {
        this.f = f;
    }
    
    @Override
    public final void w(final c c) {
        EmptyDisposable.error(this.f, c);
    }
}
