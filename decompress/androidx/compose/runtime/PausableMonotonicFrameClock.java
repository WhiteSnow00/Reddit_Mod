// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.CoroutineContext;
import mj2.k;
import a80.a;
import pg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import zg2.l;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import ah2.f;
import kotlin.coroutines.CoroutineContext$a;
import zg2.p;
import z0.a0;
import z0.d0;

public final class PausableMonotonicFrameClock implements d0
{
    public final d0 f;
    public final a0 g;
    
    public PausableMonotonicFrameClock(final d0 f) {
        this.f = f;
        this.g = new a0();
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
    public final <R> Object k(l<? super Long, ? extends R> l$1, c<? super R> o) {
        PausableMonotonicFrameClock$withFrameNanos.PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1 = null;
        Label_0048: {
            if (o instanceof PausableMonotonicFrameClock$withFrameNanos.PausableMonotonicFrameClock$withFrameNanos$1) {
                pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos.PausableMonotonicFrameClock$withFrameNanos$1)o;
                final int label = pausableMonotonicFrameClock$withFrameNanos$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pausableMonotonicFrameClock$withFrameNanos$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos.PausableMonotonicFrameClock$withFrameNanos$1(this, (c)o);
        }
        o = pausableMonotonicFrameClock$withFrameNanos$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = pausableMonotonicFrameClock$withFrameNanos$1.label;
        Label_0269: {
            if (label2 != 0) {
                if (label2 == 1) {
                    l$1 = (l)pausableMonotonicFrameClock$withFrameNanos$1.L$1;
                    final PausableMonotonicFrameClock pausableMonotonicFrameClock = (PausableMonotonicFrameClock)pausableMonotonicFrameClock$withFrameNanos$1.L$0;
                    aj2.c.Q0(o);
                    o = pausableMonotonicFrameClock;
                    break Label_0269;
                }
                if (label2 == 2) {
                    aj2.c.Q0(o);
                    return o;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(o);
            final a0 g = this.g;
            pausableMonotonicFrameClock$withFrameNanos$1.L$0 = this;
            pausableMonotonicFrameClock$withFrameNanos$1.L$1 = l$1;
            pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
            o = g.a;
            synchronized (o) {
                final boolean d = g.d;
                monitorexit(o);
                Label_0258: {
                    if (d) {
                        o = j.a;
                        break Label_0258;
                    }
                    final mj2.l l = new mj2.l(1, a80.a.a0((c)pausableMonotonicFrameClock$withFrameNanos$1));
                    l.o();
                    o = g.a;
                    synchronized (o) {
                        g.b.add(l);
                        monitorexit(o);
                        l.I((l)new Latch$await$2$2(g, (k<? super j>)l));
                        o = l.n();
                        if (o != coroutine_SUSPENDED) {
                            o = j.a;
                        }
                        if (o == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        o = this;
                        o = ((PausableMonotonicFrameClock)o).f;
                        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
                        pausableMonotonicFrameClock$withFrameNanos$1.L$1 = null;
                        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
                        o = ((d0)o).k((zg2.l<? super Long, ?>)l$1, (tg2.c<? super Object>)pausableMonotonicFrameClock$withFrameNanos$1);
                        if (o == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        return o;
                    }
                }
            }
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
