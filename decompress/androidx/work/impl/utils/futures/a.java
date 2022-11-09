// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.utils.futures;

import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import yg.c;

public final class a<V> extends AbstractFuture<V>
{
    public final boolean i(final V v) {
        Object l = v;
        if (v == null) {
            l = AbstractFuture.l;
        }
        boolean b;
        if (AbstractFuture.k.b((AbstractFuture)this, (Object)null, l)) {
            AbstractFuture.c(this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean j(final Throwable t) {
        t.getClass();
        boolean b;
        if (AbstractFuture.k.b((AbstractFuture)this, (Object)null, (Object)new AbstractFuture$Failure(t))) {
            AbstractFuture.c(this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean k(final c<? extends V> c) {
        c.getClass();
        final Object f = super.f;
        final boolean b = false;
        Object f2 = f;
        Label_0134: {
            if (f == null) {
                if (((Future)c).isDone()) {
                    final Object f3 = AbstractFuture.f(c);
                    final boolean b2 = b;
                    if (!AbstractFuture.k.b((AbstractFuture)this, (Object)null, f3)) {
                        return b2;
                    }
                    AbstractFuture.c(this);
                }
                else {
                    final AbstractFuture$e abstractFuture$e = new AbstractFuture$e((AbstractFuture)this, (c)c);
                    if (!AbstractFuture.k.b((AbstractFuture)this, (Object)null, (Object)abstractFuture$e)) {
                        f2 = super.f;
                        break Label_0134;
                    }
                    try {
                        c.a((Runnable)abstractFuture$e, (Executor)DirectExecutor.INSTANCE);
                    }
                    finally {
                        AbstractFuture$Failure b3 = null;
                        try {
                            final Throwable t;
                            final AbstractFuture$Failure abstractFuture$Failure = new AbstractFuture$Failure(t);
                        }
                        finally {
                            b3 = AbstractFuture$Failure.b;
                        }
                        AbstractFuture.k.b((AbstractFuture)this, (Object)abstractFuture$e, (Object)b3);
                    }
                }
                return true;
            }
        }
        boolean b2 = b;
        if (f2 instanceof AbstractFuture$b) {
            ((Future)c).cancel(((AbstractFuture$b)f2).a);
            b2 = b;
        }
        return b2;
    }
}
