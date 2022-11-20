// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import af2.v;
import df2.a;
import af2.a0;
import af2.w;
import af2.t;

public final class ObservableCreate<T> extends t<T>
{
    public final w<T> f;
    
    public ObservableCreate(final w<T> f) {
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final a0<? super T> a0) {
        final ObservableCreate.ObservableCreate$CreateEmitter observableCreate$CreateEmitter = new ObservableCreate.ObservableCreate$CreateEmitter((a0)a0);
        a0.onSubscribe((a)observableCreate$CreateEmitter);
        try {
            this.f.b((v)observableCreate$CreateEmitter);
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            observableCreate$CreateEmitter.onError(t);
        }
    }
}
