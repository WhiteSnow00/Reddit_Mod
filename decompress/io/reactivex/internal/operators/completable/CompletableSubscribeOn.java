// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.completable;

import af2.c;
import af2.b0;
import af2.e;
import af2.a;

public final class CompletableSubscribeOn extends a
{
    public final e f;
    public final b0 g;
    
    public CompletableSubscribeOn(final e f, final b0 g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void w(final c c) {
        final CompletableSubscribeOn.CompletableSubscribeOn$SubscribeOnObserver completableSubscribeOn$SubscribeOnObserver = new CompletableSubscribeOn.CompletableSubscribeOn$SubscribeOnObserver(c, this.f);
        c.onSubscribe((df2.a)completableSubscribeOn$SubscribeOnObserver);
        completableSubscribeOn$SubscribeOnObserver.task.replace(this.g.c((Runnable)completableSubscribeOn$SubscribeOnObserver));
    }
}
