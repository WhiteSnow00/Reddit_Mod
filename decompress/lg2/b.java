// 
// Decompiled by Procyon v0.6.0
// 

package lg2;

import sg2.e;
import rg2.l;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;

public abstract class b<B extends CoroutineContext$a, E extends B> implements CoroutineContext$b<E>
{
    public final l<CoroutineContext$a, E> f;
    public final CoroutineContext$b<?> g;
    
    public b(final CoroutineContext$b<B> coroutineContext$b, final l<? super CoroutineContext$a, ? extends E> f) {
        e.f((Object)coroutineContext$b, "baseKey");
        e.f((Object)f, "safeCast");
        this.f = (l<CoroutineContext$a, E>)f;
        CoroutineContext$b<?> g = coroutineContext$b;
        if (coroutineContext$b instanceof b) {
            g = ((b)coroutineContext$b).g;
        }
        this.g = g;
    }
}
