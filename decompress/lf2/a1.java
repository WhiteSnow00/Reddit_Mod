// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import nt2.d;
import io.reactivex.internal.subscriptions.EmptySubscription;
import nt2.c;
import af2.g;

public final class a1 extends g<Object>
{
    public static final a1 f;
    
    static {
        f = new a1();
    }
    
    @Override
    public final void subscribeActual(final c<? super Object> c) {
        c.onSubscribe((d)EmptySubscription.INSTANCE);
    }
}
