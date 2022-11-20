// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import af2.d0;
import df2.a;
import af2.e0;
import af2.f0;
import af2.c0;

public final class SingleCreate<T> extends c0<T>
{
    public final f0<T> f;
    
    public SingleCreate(final f0<T> f) {
        this.f = f;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        final SingleCreate.SingleCreate$Emitter singleCreate$Emitter = new SingleCreate.SingleCreate$Emitter((e0)e0);
        e0.onSubscribe((a)singleCreate$Emitter);
        try {
            this.f.y((d0)singleCreate$Emitter);
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            singleCreate$Emitter.onError(t);
        }
    }
}
