// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import df2.a;
import cg.d;
import kotlin.Result;
import zi2.m;
import zi2.l;
import af2.p;

public final class c implements p<Object>
{
    public final l<Object> f;
    
    public c(final m f) {
        this.f = (l<Object>)f;
    }
    
    public final void onComplete() {
        ((gg2.c)this.f).resumeWith(Result.constructor-impl((Object)null));
    }
    
    public final void onError(final Throwable t) {
        ((gg2.c)this.f).resumeWith(Result.constructor-impl((Object)d.B1(t)));
    }
    
    public final void onSubscribe(final a a) {
        this.f.Z((mg2.l)new RxAwaitKt$disposeOnCancellation$1(a));
    }
    
    public final void onSuccess(final Object o) {
        ((gg2.c)this.f).resumeWith(Result.constructor-impl(o));
    }
}
