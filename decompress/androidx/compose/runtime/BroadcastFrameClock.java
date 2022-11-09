// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import zg2.l;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import ah2.f;
import kotlin.coroutines.CoroutineContext$a;
import zg2.p;
import aj2.c;
import kotlin.Result;
import java.util.ArrayList;
import java.util.List;
import pg2.j;
import zg2.a;
import z0.d0;

public final class BroadcastFrameClock implements d0
{
    public final zg2.a<j> f;
    public final Object g;
    public Throwable h;
    public List<BroadcastFrameClock.BroadcastFrameClock$a<?>> i;
    public List<BroadcastFrameClock.BroadcastFrameClock$a<?>> j;
    
    public BroadcastFrameClock(final zg2.a<j> f) {
        this.f = f;
        this.g = new Object();
        this.i = new ArrayList<BroadcastFrameClock.BroadcastFrameClock$a<?>>();
        this.j = new ArrayList<BroadcastFrameClock.BroadcastFrameClock$a<?>>();
    }
    
    public final boolean c() {
        synchronized (this.g) {
            final boolean empty = this.i.isEmpty();
            monitorexit(this.g);
            return empty ^ true;
        }
    }
    
    public final void d(final long n) {
        synchronized (this.g) {
            final List<BroadcastFrameClock.BroadcastFrameClock$a<?>> i = this.i;
            this.i = this.j;
            this.j = i;
            for (int j = 0; j < i.size(); ++j) {
                final BroadcastFrameClock.BroadcastFrameClock$a broadcastFrameClock$a = i.get(j);
                final tg2.c b = broadcastFrameClock$a.b;
                Object constructor-impl = null;
                try {
                    Result.constructor-impl(broadcastFrameClock$a.a.invoke((Object)n));
                }
                finally {
                    final Throwable t;
                    constructor-impl = Result.constructor-impl((Object)c.G(t));
                }
                b.resumeWith(constructor-impl);
            }
            i.clear();
            final j a = pg2.j.a;
        }
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
    public final <R> Object k(final l<? super Long, ? extends R> l, final tg2.c<? super R> c) {
        final mj2.l i = new mj2.l(1, a80.a.a0(c));
        i.o();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object h = this.g;
        synchronized (h) {
            final Throwable h2 = this.h;
            Label_0288: {
                if (h2 != null) {
                    i.resumeWith(Result.constructor-impl((Object)c.G(h2)));
                    monitorexit(h);
                }
                else {
                    ref$ObjectRef.element = new BroadcastFrameClock.BroadcastFrameClock$a((l)l, i);
                    final boolean empty = this.i.isEmpty();
                    final int n = 0;
                    final boolean b = !empty;
                    final List<BroadcastFrameClock.BroadcastFrameClock$a<?>> j = this.i;
                    final Object element = ref$ObjectRef.element;
                    if (element == null) {
                        ah2.f.n("awaiter");
                        throw null;
                    }
                    j.add((BroadcastFrameClock.BroadcastFrameClock$a<?>)element);
                    monitorexit(h);
                    i.I((l)new BroadcastFrameClock$withFrameNanos$2.BroadcastFrameClock$withFrameNanos$2$1(this, ref$ObjectRef));
                    if (b ^ true) {
                        final zg2.a<j> f = this.f;
                        if (f != null) {
                            try {
                                f.invoke();
                            }
                            finally {
                                synchronized (this.g) {
                                    if (this.h != null) {
                                        break Label_0288;
                                    }
                                    this.h = (Throwable)h;
                                    final List<BroadcastFrameClock.BroadcastFrameClock$a<?>> k = this.i;
                                    for (int size = k.size(), n2 = n; n2 < size; ++n2) {
                                        ((BroadcastFrameClock.BroadcastFrameClock$a)k.get(n2)).b.resumeWith(Result.constructor-impl((Object)c.G((Throwable)h)));
                                    }
                                    this.i.clear();
                                    h = pg2.j.a;
                                }
                            }
                        }
                    }
                }
            }
            final Object n3 = i.n();
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            return n3;
        }
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
