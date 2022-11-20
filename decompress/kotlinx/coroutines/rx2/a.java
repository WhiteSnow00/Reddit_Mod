// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import cg.d;
import kotlin.Result;
import zi2.m;
import cg2.j;
import zi2.l;
import af2.c;

public final class a implements c
{
    public final l<j> f;
    
    public a(final m f) {
        this.f = (l<j>)f;
    }
    
    public final void onComplete() {
        ((gg2.c)this.f).resumeWith(Result.constructor-impl((Object)j.a));
    }
    
    public final void onError(final Throwable t) {
        ((gg2.c)this.f).resumeWith(Result.constructor-impl((Object)d.B1(t)));
    }
    
    public final void onSubscribe(final df2.a a) {
        this.f.Z((mg2.l)new RxAwaitKt$disposeOnCancellation$1(a));
    }
}
