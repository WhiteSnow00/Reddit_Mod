// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import gg2.c;
import mg2.l;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;

public interface c0 extends CoroutineContext$a
{
    public static final int b4 = 0;
    
    default CoroutineContext$b<?> getKey() {
        return (CoroutineContext$b<?>)c0.c0$a.f;
    }
    
     <R> Object x(final l<? super Long, ? extends R> p0, final c<? super R> p1);
}
