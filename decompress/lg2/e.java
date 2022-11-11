// 
// Decompiled by Procyon v0.6.0
// 

package lg2;

import kotlin.coroutines.CoroutineContext;
import kotlin.Result$Failure;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mg2.b;

public final class e<T> implements c<T>, b
{
    @Deprecated
    public static final AtomicReferenceFieldUpdater<e<?>, Object> g;
    public final c<T> f;
    private volatile Object result;
    
    static {
        g = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "result");
    }
    
    public e(final CoroutineSingletons result, final c f) {
        this.f = (c<T>)f;
        this.result = result;
    }
    
    public e(final c<? super T> f) {
        final CoroutineSingletons undecided = CoroutineSingletons.UNDECIDED;
        this.f = (c<T>)f;
        this.result = undecided;
    }
    
    public final Object a() {
        final Object result = this.result;
        final CoroutineSingletons undecided = CoroutineSingletons.UNDECIDED;
        Object o = result;
        Label_0066: {
            if (result == undecided) {
                final AtomicReferenceFieldUpdater<e<?>, Object> g = e.g;
                while (true) {
                    while (!g.compareAndSet(this, undecided, CoroutineSingletons.COROUTINE_SUSPENDED)) {
                        if (g.get(this) != undecided) {
                            final boolean b = false;
                            if (b) {
                                return CoroutineSingletons.COROUTINE_SUSPENDED;
                            }
                            o = this.result;
                            break Label_0066;
                        }
                    }
                    final boolean b = true;
                    continue;
                }
            }
        }
        if (o == CoroutineSingletons.RESUMED) {
            o = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        else if (o instanceof Result$Failure) {
            throw ((Result$Failure)o).exception;
        }
        return o;
    }
    
    public final b getCallerFrame() {
        final c<T> f = this.f;
        b b;
        if (f instanceof b) {
            b = (b)f;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final CoroutineContext getContext() {
        return this.f.getContext();
    }
    
    public final void resumeWith(final Object o) {
    Label_0000:
        while (true) {
            final Object result = this.result;
            final CoroutineSingletons undecided = CoroutineSingletons.UNDECIDED;
            final int n = 0;
            boolean b = false;
            if (result == undecided) {
                final AtomicReferenceFieldUpdater<e<?>, Object> g = e.g;
                while (true) {
                    while (!g.compareAndSet(this, undecided, o)) {
                        if (g.get(this) != undecided) {
                            if (b) {
                                return;
                            }
                            continue Label_0000;
                        }
                    }
                    b = true;
                    continue;
                }
            }
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (result == coroutine_SUSPENDED) {
                final AtomicReferenceFieldUpdater<e<?>, Object> g2 = e.g;
                while (true) {
                    while (!g2.compareAndSet(this, coroutine_SUSPENDED, CoroutineSingletons.RESUMED)) {
                        if (g2.get(this) != coroutine_SUSPENDED) {
                            final int n2 = n;
                            if (n2 != 0) {
                                this.f.resumeWith(o);
                                return;
                            }
                            continue Label_0000;
                        }
                    }
                    final int n2 = 1;
                    continue;
                }
            }
            throw new IllegalStateException("Already resumed");
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SafeContinuation for ");
        r.append(this.f);
        return r.toString();
    }
}
