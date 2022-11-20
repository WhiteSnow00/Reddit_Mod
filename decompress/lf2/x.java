// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.EmptySubscription;
import nt2.c;
import if2.h;
import af2.g;

public final class x extends g<Object> implements h<Object>
{
    public static final x f;
    
    static {
        f = new x();
    }
    
    public final Object call() {
        return null;
    }
    
    @Override
    public final void subscribeActual(final c<? super Object> c) {
        EmptySubscription.complete((c)c);
    }
}
