// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.completable;

import af2.c;
import af2.e;
import af2.a;

public final class CompletableAndThenCompletable extends a
{
    public final e f;
    public final e g;
    
    public CompletableAndThenCompletable(final e f, final e g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void w(final c c) {
        this.f.a((c)new CompletableAndThenCompletable.CompletableAndThenCompletable$SourceObserver(c, this.g));
    }
}
