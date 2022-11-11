// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import hg2.j;
import if2.a;
import yd.b;
import kotlin.Result;
import ej2.l;
import ej2.k;
import ff2.p;

public final class c implements p<Object>
{
    public final /* synthetic */ k<Object> f;
    
    public c(final l f) {
        this.f = (k<Object>)f;
    }
    
    public final void onComplete() {
        ((lg2.c)this.f).resumeWith(Result.constructor-impl((Object)null));
    }
    
    public final void onError(final Throwable t) {
        ((lg2.c)this.f).resumeWith(Result.constructor-impl((Object)b.o(t)));
    }
    
    public final void onSubscribe(final a a) {
        this.f.F((rg2.l<? super Throwable, j>)new RxAwaitKt$disposeOnCancellation$1(a));
    }
    
    public final void onSuccess(final Object o) {
        ((lg2.c)this.f).resumeWith(Result.constructor-impl(o));
    }
}
