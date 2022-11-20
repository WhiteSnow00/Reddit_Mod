// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import gg2.c;
import df2.a;
import kotlin.Result;
import cg.d;
import zi2.m;
import zi2.l;
import af2.e0;

public final class b implements e0<Object>
{
    public final l<Object> f;
    
    public b(final m f) {
        this.f = (l<Object>)f;
    }
    
    public final void onError(final Throwable t) {
        ((c)this.f).resumeWith(Result.constructor-impl((Object)d.B1(t)));
    }
    
    public final void onSubscribe(final a a) {
        this.f.Z((mg2.l)new RxAwaitKt$disposeOnCancellation$1(a));
    }
    
    public final void onSuccess(final Object o) {
        ((c)this.f).resumeWith(Result.constructor-impl(o));
    }
}
