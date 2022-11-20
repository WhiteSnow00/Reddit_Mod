// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.completable;

import af2.c;
import af2.e;
import af2.a;

public final class CompletableDoFinally extends a
{
    public final e f;
    public final ff2.a g;
    
    public CompletableDoFinally(final e f, final ff2.a g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void w(final c c) {
        this.f.a((c)new CompletableDoFinally.CompletableDoFinally$DoFinallyObserver(c, this.g));
    }
}
