// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import lg2.c;
import hg2.j;
import if2.a;
import kotlin.Result;
import ej2.l;
import ej2.k;
import ff2.e0;

public final class b implements e0<Object>
{
    public final /* synthetic */ k<Object> f;
    
    public b(final l f) {
        this.f = (k<Object>)f;
    }
    
    public final void onError(final Throwable t) {
        ((c)this.f).resumeWith(Result.constructor-impl((Object)yd.b.o(t)));
    }
    
    public final void onSubscribe(final a a) {
        this.f.F((rg2.l<? super Throwable, j>)new RxAwaitKt$disposeOnCancellation$1(a));
    }
    
    public final void onSuccess(final Object o) {
        ((c)this.f).resumeWith(Result.constructor-impl(o));
    }
}
