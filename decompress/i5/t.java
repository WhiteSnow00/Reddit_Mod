// 
// Decompiled by Procyon v0.6.0
// 

package i5;

import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import mg2.p;
import ng2.e;
import zi2.u;
import java.util.concurrent.atomic.AtomicInteger;
import gg2.d;
import zi2.z0;
import kotlin.coroutines.CoroutineContext$a;

public final class t implements CoroutineContext$a
{
    public static final a i;
    public final z0 f;
    public final d g;
    public final AtomicInteger h;
    
    static {
        i = new a();
    }
    
    public t(final u f, final d g) {
        e.f((Object)f, "transactionThreadControlJob");
        e.f((Object)g, "transactionDispatcher");
        this.f = (z0)f;
        this.g = g;
        this.h = new AtomicInteger(0);
    }
    
    public final <R> R fold(final R r, final p<? super R, ? super CoroutineContext$a, ? extends R> p2) {
        e.f((Object)p2, "operation");
        return (R)p2.invoke((Object)r, (Object)this);
    }
    
    public final <E extends CoroutineContext$a> E get(final CoroutineContext$b<E> coroutineContext$b) {
        return (E)CoroutineContext$a$a.a((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext$b<t> getKey() {
        return (CoroutineContext$b<t>)t.i;
    }
    
    public final CoroutineContext minusKey(final CoroutineContext$b<?> coroutineContext$b) {
        return CoroutineContext$a$a.b((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext plus(final CoroutineContext coroutineContext) {
        e.f((Object)coroutineContext, "context");
        return CoroutineContext$DefaultImpls.a((CoroutineContext)this, coroutineContext);
    }
    
    public static final class a implements CoroutineContext$b<t>
    {
    }
}
