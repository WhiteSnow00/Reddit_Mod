// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import ej2.c0;
import ff2.o;
import if2.a;
import ff2.p;
import ff2.q;
import ff2.n;

public final class MaybeCreate<T> extends n<T>
{
    public final q<T> f;
    
    public MaybeCreate(final q<T> f) {
        this.f = f;
    }
    
    public final void s(final p<? super T> p) {
        final MaybeCreate.MaybeCreate$Emitter maybeCreate$Emitter = new MaybeCreate.MaybeCreate$Emitter((p)p);
        p.onSubscribe((a)maybeCreate$Emitter);
        try {
            this.f.a((o)maybeCreate$Emitter);
        }
        finally {
            final Throwable t;
            c0.i4(t);
            maybeCreate$Emitter.onError(t);
        }
    }
}
