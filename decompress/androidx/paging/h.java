// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import kotlin.coroutines.CoroutineContext$a;
import mj2.k;
import a80.a;
import kotlin.coroutines.CoroutineContext$b;
import mj2.z0$b;
import mj2.z0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg2.l;
import kotlin.coroutines.CoroutineContext;
import pg2.j;
import tg2.c;
import ah2.f;
import oj2.e;
import oj2.t;
import mj2.b0;
import c5.x;

public final class h<T> implements x<T>, b0, t<T>
{
    public final t<T> f;
    public final /* synthetic */ b0 g;
    
    public h(final b0 g, final e f) {
        ah2.f.f((Object)g, "scope");
        ah2.f.f((Object)f, "channel");
        this.f = (t<T>)f;
        this.g = g;
    }
    
    public final boolean E(final Throwable t) {
        return this.f.E(t);
    }
    
    public final Object G(final T t, final c<? super j> c) {
        return this.f.G((Object)t, (c)c);
    }
    
    public final CoroutineContext Kx() {
        return this.g.Kx();
    }
    
    public final Object e(final T t) {
        return this.f.e((Object)t);
    }
    
    public final void n(final l<? super Throwable, j> l) {
        this.f.n((l)l);
    }
    
    public final boolean offer(final T t) {
        return this.f.offer((Object)t);
    }
    
    @Override
    public final Object st(PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$3 l$0, c c) {
        Object o = null;
        Label_0048: {
            if (c instanceof SimpleProducerScopeImpl$awaitClose$1) {
                o = c;
                final int label = ((SimpleProducerScopeImpl$awaitClose$1)o).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((SimpleProducerScopeImpl$awaitClose$1)o).label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            o = new SimpleProducerScopeImpl$awaitClose$1(this, c);
        }
        final Object result = ((SimpleProducerScopeImpl$awaitClose$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((SimpleProducerScopeImpl$awaitClose$1)o).label;
        Label_0112: {
            if (label2 == 0) {
                break Label_0112;
            }
            Label_0102: {
                if (label2 != 1) {
                    break Label_0102;
                }
                final z0 z0 = (z0)((SimpleProducerScopeImpl$awaitClose$1)o).L$1;
                l$0 = (PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$3)(c = (c)((SimpleProducerScopeImpl$awaitClose$1)o).L$0);
                try {
                    aj2.c.Q0(result);
                    Label_0237: {
                        return j.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    Label_0248:
                    c = (c)l$0;
                    c = (c)l$0;
                    final IllegalStateException ex = new IllegalStateException("Internal error, context should have a job.".toString());
                    c = (c)l$0;
                    throw ex;
                    aj2.c.Q0(result);
                    c = (c)l$0;
                    final CoroutineContext$a value = this.Kx().get((CoroutineContext$b)z0$b.f);
                    iftrue(Label_0248:)(value == null);
                    c = (c)l$0;
                    final z0 l$2 = (z0)value;
                    c = (c)l$0;
                    ((SimpleProducerScopeImpl$awaitClose$1)o).L$0 = l$0;
                    c = (c)l$0;
                    ((SimpleProducerScopeImpl$awaitClose$1)o).L$1 = l$2;
                    c = (c)l$0;
                    ((SimpleProducerScopeImpl$awaitClose$1)o).label = 1;
                    c = (c)l$0;
                    c = (c)l$0;
                    final mj2.l l = new mj2.l(1, a.a0((c)o));
                    c = (c)l$0;
                    l.o();
                    c = (c)l$0;
                    c = (c)l$0;
                    final SimpleProducerScopeImpl$awaitClose$2$1 simpleProducerScopeImpl$awaitClose$2$1 = new SimpleProducerScopeImpl$awaitClose$2$1((k)l);
                    c = (c)l$0;
                    l$2.V((l)simpleProducerScopeImpl$awaitClose$2$1);
                    c = (c)l$0;
                    iftrue(Label_0237:)(l.n() != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    ((zg2.a)c).invoke();
                }
            }
        }
    }
}
