// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.completable;

import af2.b;
import af2.c;
import af2.d;
import af2.a;

public final class CompletableCreate extends a
{
    public final d f;
    
    public CompletableCreate(final d f) {
        this.f = f;
    }
    
    @Override
    public final void w(final c c) {
        final CompletableCreate.CompletableCreate$Emitter completableCreate$Emitter = new CompletableCreate.CompletableCreate$Emitter(c);
        c.onSubscribe((df2.a)completableCreate$Emitter);
        try {
            this.f.b((b)completableCreate$Emitter);
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            completableCreate$Emitter.onError(t);
        }
    }
}
