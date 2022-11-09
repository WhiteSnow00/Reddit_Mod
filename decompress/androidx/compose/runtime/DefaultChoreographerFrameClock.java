// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import android.view.Choreographer$FrameCallback;
import a80.a;
import zg2.l;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import ah2.f;
import kotlin.coroutines.CoroutineContext$a;
import uj2.b;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import tg2.c;
import rj2.m;
import mj2.j0;
import android.view.Choreographer;
import z0.d0;

public final class DefaultChoreographerFrameClock implements d0
{
    public static final DefaultChoreographerFrameClock f;
    public static final Choreographer g;
    
    static {
        f = new DefaultChoreographerFrameClock();
        final b a = j0.a;
        g = (Choreographer)mj2.g.j((CoroutineContext)m.a.c0(), (p)new DefaultChoreographerFrameClock$choreographer.DefaultChoreographerFrameClock$choreographer$1((c)null));
    }
    
    public final <R> R fold(final R r, final p<? super R, ? super CoroutineContext$a, ? extends R> p2) {
        ah2.f.f((Object)p2, "operation");
        return (R)p2.invoke((Object)r, (Object)this);
    }
    
    public final <E extends CoroutineContext$a> E get(final CoroutineContext$b<E> coroutineContext$b) {
        ah2.f.f((Object)coroutineContext$b, "key");
        return (E)CoroutineContext$a$a.a((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    @Override
    public final <R> Object k(final l<? super Long, ? extends R> l, final c<? super R> c) {
        final mj2.l i = new mj2.l(1, a80.a.a0(c));
        i.o();
        final DefaultChoreographerFrameClock$a defaultChoreographerFrameClock$a = new DefaultChoreographerFrameClock$a(i, (l)l);
        DefaultChoreographerFrameClock.g.postFrameCallback((Choreographer$FrameCallback)defaultChoreographerFrameClock$a);
        i.I((l)new DefaultChoreographerFrameClock$withFrameNanos$2.DefaultChoreographerFrameClock$withFrameNanos$2$1((Choreographer$FrameCallback)defaultChoreographerFrameClock$a));
        final Object n = i.n();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }
    
    public final CoroutineContext minusKey(final CoroutineContext$b<?> coroutineContext$b) {
        ah2.f.f((Object)coroutineContext$b, "key");
        return CoroutineContext$a$a.b((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext plus(final CoroutineContext coroutineContext) {
        ah2.f.f((Object)coroutineContext, "context");
        return CoroutineContext$DefaultImpls.a((CoroutineContext)this, coroutineContext);
    }
}
