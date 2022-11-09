// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import mj2.g1;
import uj2.b;
import rj2.m;
import mj2.j0;
import ah2.f;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

public final class a0 extends CoroutineDispatcher
{
    public final e h;
    
    public a0() {
        this.h = new e();
    }
    
    public final void Z(final CoroutineContext coroutineContext, final Runnable runnable) {
        f.f((Object)coroutineContext, "context");
        f.f((Object)runnable, "block");
        final e h = this.h;
        h.getClass();
        final b a = j0.a;
        final g1 c0 = m.a.c0();
        if (!((CoroutineDispatcher)c0).b0(coroutineContext) && (!h.b && h.a)) {
            if (!h.d.offer(runnable)) {
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
            h.a();
        }
        else {
            ((CoroutineDispatcher)c0).Z(coroutineContext, (Runnable)new d(0, h, runnable));
        }
    }
    
    public final boolean b0(final CoroutineContext coroutineContext) {
        f.f((Object)coroutineContext, "context");
        final b a = j0.a;
        if (((CoroutineDispatcher)m.a.c0()).b0(coroutineContext)) {
            return true;
        }
        final e h = this.h;
        return (h.b || !h.a) ^ true;
    }
}
