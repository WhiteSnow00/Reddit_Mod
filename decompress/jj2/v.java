// 
// Decompiled by Procyon v0.6.0
// 

package jj2;

import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.CoroutineContext$b;
import sg2.e;
import kotlin.coroutines.CoroutineContext$a;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.s1;

public final class v<T> implements s1<T>
{
    public final T f;
    public final ThreadLocal<T> g;
    public final w h;
    
    public v(final Integer f, final ThreadLocal g) {
        this.f = (T)f;
        this.g = g;
        this.h = new w(g);
    }
    
    public final T S(final CoroutineContext coroutineContext) {
        final T value = this.g.get();
        this.g.set(this.f);
        return value;
    }
    
    public final <R> R fold(final R r, final p<? super R, ? super CoroutineContext$a, ? extends R> p2) {
        e.f((Object)p2, "operation");
        return (R)p2.invoke(r, (Object)this);
    }
    
    public final void g(final Object o) {
        this.g.set((T)o);
    }
    
    public final <E extends CoroutineContext$a> E get(final CoroutineContext$b<E> coroutineContext$b) {
        Object o;
        if (e.a((Object)this.h, (Object)coroutineContext$b)) {
            o = this;
        }
        else {
            o = null;
        }
        return (E)o;
    }
    
    public final CoroutineContext$b<?> getKey() {
        return (CoroutineContext$b<?>)this.h;
    }
    
    public final CoroutineContext minusKey(final CoroutineContext$b<?> coroutineContext$b) {
        Object instance;
        if (e.a((Object)this.h, (Object)coroutineContext$b)) {
            instance = EmptyCoroutineContext.INSTANCE;
        }
        else {
            instance = this;
        }
        return (CoroutineContext)instance;
    }
    
    public final CoroutineContext plus(final CoroutineContext coroutineContext) {
        e.f((Object)coroutineContext, "context");
        return CoroutineContext$DefaultImpls.a((CoroutineContext)this, coroutineContext);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ThreadLocal(value=");
        r.append(this.f);
        r.append(", threadLocal = ");
        r.append(this.g);
        r.append(')');
        return r.toString();
    }
}
