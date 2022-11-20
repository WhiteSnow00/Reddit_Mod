// 
// Decompiled by Procyon v0.6.0
// 

package ej2;

import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.CoroutineContext$b;
import ng2.e;
import kotlin.coroutines.CoroutineContext$a;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.t1;

public final class v<T> implements t1<T>
{
    public final T f;
    public final ThreadLocal<T> g;
    public final w h;
    
    public v(final Integer f, final ThreadLocal g) {
        this.f = (T)f;
        this.g = g;
        this.h = new w(g);
    }
    
    @Override
    public final T S(final CoroutineContext coroutineContext) {
        final T value = this.g.get();
        this.g.set(this.f);
        return value;
    }
    
    public final <R> R fold(final R r, final p<? super R, ? super CoroutineContext$a, ? extends R> p2) {
        e.f((Object)p2, "operation");
        return (R)p2.invoke((Object)r, (Object)this);
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
    
    @Override
    public final void n(final Object o) {
        this.g.set((T)o);
    }
    
    public final CoroutineContext plus(final CoroutineContext coroutineContext) {
        e.f((Object)coroutineContext, "context");
        return CoroutineContext$DefaultImpls.a((CoroutineContext)this, coroutineContext);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ThreadLocal(value=");
        t.append(this.f);
        t.append(", threadLocal = ");
        t.append(this.g);
        t.append(')');
        return t.toString();
    }
}
