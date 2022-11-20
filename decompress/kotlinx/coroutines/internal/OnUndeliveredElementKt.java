// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.internal;

import xd.a;
import kotlin.coroutines.CoroutineContext;
import cg2.j;
import mg2.l;

public final class OnUndeliveredElementKt
{
    public static final <E> l<Throwable, j> a(final l<? super E, j> l, final E e, final CoroutineContext coroutineContext) {
        return (l<Throwable, j>)new OnUndeliveredElementKt$bindCancellationFun$1((l)l, (Object)e, coroutineContext);
    }
    
    public static final <E> UndeliveredElementException b(final l<? super E, j> l, final E e, final UndeliveredElementException ex) {
        try {
            l.invoke((Object)e);
        }
        finally {
            final Throwable t;
            if (ex == null || ex.getCause() == t) {
                return new UndeliveredElementException(b.k("Exception in undelivered element handler for ", (Object)e), t);
            }
            a.t((Throwable)ex, t);
        }
        return ex;
    }
}
