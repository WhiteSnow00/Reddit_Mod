// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.completable;

import af2.c;
import es1.h;
import ff2.o;
import af2.e;
import af2.a;

public final class CompletableResumeNext extends a
{
    public final e f;
    public final o<? super Throwable, ? extends e> g;
    
    public CompletableResumeNext(final a f, final h g) {
        this.f = (e)f;
        this.g = (o<? super Throwable, ? extends e>)g;
    }
    
    @Override
    public final void w(final c c) {
        final CompletableResumeNext.CompletableResumeNext$ResumeNextObserver completableResumeNext$ResumeNextObserver = new CompletableResumeNext.CompletableResumeNext$ResumeNextObserver(c, (o)this.g);
        c.onSubscribe((df2.a)completableResumeNext$ResumeNextObserver);
        this.f.a((c)completableResumeNext$ResumeNextObserver);
    }
}
