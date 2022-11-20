// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.completable;

import af2.c;
import af2.b0;
import java.util.concurrent.TimeUnit;
import af2.e;
import af2.a;

public final class CompletableDelay extends a
{
    public final e f;
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    public final boolean j;
    
    public CompletableDelay(final a f, final TimeUnit h, final b0 i) {
        this.f = (e)f;
        this.g = 3L;
        this.h = h;
        this.i = i;
        this.j = false;
    }
    
    @Override
    public final void w(final c c) {
        this.f.a((c)new CompletableDelay.CompletableDelay$Delay(c, this.g, this.h, this.i, this.j));
    }
}
