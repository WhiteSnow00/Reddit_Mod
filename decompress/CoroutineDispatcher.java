// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines;

import ej2.c0;
import kotlin.coroutines.EmptyCoroutineContext;
import lg2.b;
import sg2.e;
import kotlin.coroutines.CoroutineContext$a;
import jj2.g;
import lg2.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$b;
import lg2.d;
import lg2.a;

public abstract class CoroutineDispatcher extends a implements d
{
    public static final CoroutineDispatcher.CoroutineDispatcher$Key g;
    
    static {
        g = new CoroutineDispatcher.CoroutineDispatcher$Key();
    }
    
    public CoroutineDispatcher() {
        super((CoroutineContext$b)d.a.f);
    }
    
    public abstract void E(final CoroutineContext p0, final Runnable p1);
    
    public final g K(final c c) {
        return new g(this, c);
    }
    
    public void T(final CoroutineContext coroutineContext, final Runnable runnable) {
        this.E(coroutineContext, runnable);
    }
    
    public boolean U(final CoroutineContext coroutineContext) {
        return this instanceof f ^ true;
    }
    
    public final void c(final c<?> c) {
        ((g)c).l();
    }
    
    public final <E extends CoroutineContext$a> E get(final CoroutineContext$b<E> coroutineContext$b) {
        e.f((Object)coroutineContext$b, "key");
        if (coroutineContext$b instanceof b) {
            final b b = (b)coroutineContext$b;
            final CoroutineContext$b f = super.f;
            e.f((Object)f, "key");
            if (f == b || b.g == f) {
                final Object o = b.f.invoke((CoroutineContext$a)this);
                if (o instanceof CoroutineContext$a) {
                    return (E)o;
                }
            }
        }
        else if (d.a.f == coroutineContext$b) {
            final Object o = this;
            return (E)o;
        }
        final Object o = null;
        return (E)o;
    }
    
    public final CoroutineContext minusKey(final CoroutineContext$b<?> coroutineContext$b) {
        e.f((Object)coroutineContext$b, "key");
        if (coroutineContext$b instanceof b) {
            final b b = (b)coroutineContext$b;
            final CoroutineContext$b f = super.f;
            e.f((Object)f, "key");
            if ((f == b || b.g == f) && b.f.invoke((CoroutineContext$a)this) != null) {
                final Object o = EmptyCoroutineContext.INSTANCE;
                return (CoroutineContext)o;
            }
        }
        else if (d.a.f == coroutineContext$b) {
            final Object o = EmptyCoroutineContext.INSTANCE;
            return (CoroutineContext)o;
        }
        final Object o = this;
        return (CoroutineContext)o;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('@');
        sb.append(c0.f3((Object)this));
        return sb.toString();
    }
}
