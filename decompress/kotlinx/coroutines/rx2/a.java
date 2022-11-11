// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import yd.b;
import kotlin.Result;
import ej2.l;
import hg2.j;
import ej2.k;
import ff2.c;

public final class a implements c
{
    public final /* synthetic */ k<j> f;
    
    public a(final l f) {
        this.f = (k<j>)f;
    }
    
    public final void onComplete() {
        ((lg2.c)this.f).resumeWith(Result.constructor-impl((Object)j.a));
    }
    
    public final void onError(final Throwable t) {
        ((lg2.c)this.f).resumeWith(Result.constructor-impl((Object)b.o(t)));
    }
    
    public final void onSubscribe(final if2.a a) {
        this.f.F((rg2.l<? super Throwable, j>)new RxAwaitKt$disposeOnCancellation$1(a));
    }
}
