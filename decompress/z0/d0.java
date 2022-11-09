// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import tg2.c;
import zg2.l;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;

public interface d0 extends CoroutineContext$a
{
    default CoroutineContext$b<?> getKey() {
        return (CoroutineContext$b<?>)a.f;
    }
    
     <R> Object k(final l<? super Long, ? extends R> p0, final c<? super R> p1);
    
    public static final class a implements CoroutineContext$b<d0>
    {
        public static final /* synthetic */ a f;
        
        static {
            f = new a();
        }
    }
}
