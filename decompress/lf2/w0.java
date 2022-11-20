// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import nt2.d;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import nt2.c;
import if2.h;
import af2.g;

public final class w0<T> extends g<T> implements h<T>
{
    public final T f;
    
    public w0(final T f) {
        this.f = f;
    }
    
    public final T call() {
        return this.f;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        c.onSubscribe((d)new ScalarSubscription((c)c, (Object)this.f));
    }
}
