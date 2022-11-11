// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import ff2.p;
import ff2.e0;
import ff2.g0;
import ff2.r;
import ff2.c0;

public final class MaybeSwitchIfEmptySingle<T> extends c0<T>
{
    public final r<T> f;
    public final g0<? extends T> g;
    
    public MaybeSwitchIfEmptySingle(final r f, final c0 g) {
        this.f = (r<T>)f;
        this.g = (g0<? extends T>)g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.b((p)new MaybeSwitchIfEmptySingle.MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver((e0)e0, (g0)this.g));
    }
}
