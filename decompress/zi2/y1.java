// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a$a;
import ng2.e;
import mg2.p;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;

public final class y1 implements CoroutineContext$a, CoroutineContext$b<y1>
{
    public static final y1 f;
    
    static {
        f = new y1();
    }
    
    public final <R> R fold(final R r, final p<? super R, ? super CoroutineContext$a, ? extends R> p2) {
        e.f((Object)p2, "operation");
        return (R)p2.invoke((Object)r, (Object)this);
    }
    
    public final <E extends CoroutineContext$a> E get(final CoroutineContext$b<E> coroutineContext$b) {
        return (E)CoroutineContext$a$a.a((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext$b<?> getKey() {
        return (CoroutineContext$b<?>)this;
    }
    
    public final CoroutineContext minusKey(final CoroutineContext$b<?> coroutineContext$b) {
        return CoroutineContext$a$a.b((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext plus(final CoroutineContext coroutineContext) {
        e.f((Object)coroutineContext, "context");
        return CoroutineContext$DefaultImpls.a((CoroutineContext)this, coroutineContext);
    }
}
